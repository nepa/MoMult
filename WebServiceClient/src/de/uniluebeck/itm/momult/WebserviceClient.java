package de.uniluebeck.itm.momult;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.ksoap2.transport.HttpTransportSE;

public class WebserviceClient extends Activity
{
  private static final String SOAP_ACTION = "http://www.webserviceX.NET/GetQuote";

  private static final String METHOD_NAME = "GetQuote";

  private static final String NAMESPACE = "http://www.webserviceX.NET/";

  private static final String URL = "http://www.webservicex.net/stockquote.asmx?WSDL";

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle icicle)
  {
    super.onCreate(icicle);
    setTheme(android.R.style.Theme_Black);
    setContentView(R.layout.main);
    findViewById(R.id.cmdCallWebservice).setOnClickListener(new OnClickListener()
    {
      public void onClick(View view)
      {
        ((TextView)findViewById(R.id.lblStatus)).setText("Calling webservice...");
        String symbol = ((EditText)findViewById(R.id.symbol)).getText().toString();
        String tagName = ((EditText)findViewById(R.id.tagName)).getText().toString();

        SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
        request.addProperty("symbol", symbol);
        
        // Load file and covert it to byte stream
        try
        {
          String pathToFile = "/sdcard/";
          String fileName = "Test.jpg";
          File file = new File(pathToFile + fileName);
          FileInputStream fileInputStream = new FileInputStream(file);
          Bitmap bitmap = BitmapFactory.decodeStream(fileInputStream);
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
          byte[] byteData = baos.toByteArray();
          String base64CodedFile = Base64.encodeToString(byteData, Base64.URL_SAFE);
        }
        catch (FileNotFoundException e)
        {
          this.showMessage("Could not load file.");
        }
        // TODO: Add base64-encoded file to webservice message
        //   - http://developer.android.com/reference/android/util/Base64.html
        //   - http://androidcommunity.com/forums/f4/png-jpg-file-to-byte-array-and-vice-verca-22108/
        
        // End loading file
        
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        
        envelope.dotNet = true; // If webservice runs on Microsoft .NET
        envelope.setOutputSoapObject(request);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        try
        {
          androidHttpTransport.call(SOAP_ACTION, envelope);
          SoapObject response = (SoapObject)envelope.bodyIn;
          String xmlDocument = response.getProperty(0).toString();

          ((TextView)findViewById(R.id.lblStatus)).setText("Response: " +
                  this.getValueOfTag(tagName, xmlDocument) + "\n\n" + xmlDocument);
        }
        catch (Exception e)
        {
          ((TextView)findViewById(R.id.lblStatus)).setText("ERROR:" + e.getClass().getName() + ": " + e.getMessage());
        }
      }

      private String getValueOfTag(final String tagName, final String response)
      {
        return response.substring(
                response.indexOf("<" + tagName + ">") + tagName.length() + 2,
                response.indexOf("</" + tagName + ">", response.indexOf("<" + tagName + ">")));
      }

      private void showMessage(String message)
      {
        Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
      }   
    });
  }
}