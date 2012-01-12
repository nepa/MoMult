package de.uniluebeck.itm.momult;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Mobile Multimedia Systems Exercises (MMS2011)
 *  							Exercise 4
 * 							Winter Term 2011
 * 
 * Bashar Altakrouri | Ambient Computing Group | Institute of Telematics | University of Luebeck |
 * www.itm.uni-luebeck.de | altakrouri@itm.uni-luebeck.de
 * 
 * OVERVIEW
 * 
 * The aim of this exercise is to be familiar with Location Based Services on android based on the Location Manager.
 * We will build a simple application that stores the user's coordinates for a point that interests him and then
 * provide a notification when the user is near that point. The coordinates are retrieved on demand when the user
 * is located at that point.
 * 
 * 	- Using Location Manager
 * 	- Proximity alerts - Point Of Interest (POI).
 * 		
 * TODO
 * 1. Follow the instructions bellow and complete the exercise
 * 
 * Hint:
 * - Read the sections marked: !!! LAB EXERCISE !!!
 * - Complete the sections marked: *** YOUR CODE HERE ***
 * - Have fun!
 * 
 * Note: This project is intentionally incomplete and should be finished by the student.
 * To help guide your work, this project includes a partial structure along with 
 * embedded comments, hints and links. An accompanying in-class presentation
 * will provide the background information and instructions necessary to 
 * complete this exercise.
 *
 * REFERENCES
 *  - Android developer guide: http://developer.android.com/guide/index.html
 *  - Good instructions about locations: http://developer.android.com/guide/topics/location/obtaining-user-location.html
 *  - This is based on http://www.javacodegeeks.com/2011/01/android-proximity-alerts-tutorial.html
 */

/************************************* !!! LAB EXERCISE !!!  *************************************
 *
 * ********
 * Side Note: To test under the emulator: Go to the DDMS view of Eclipse and look for the Emulation Control tab.
 * There, among other things, you will find the Location Controls section, which can send mock location data to
 * the emulator. In the Manual tab, just hit the Send button, there are already some coordinates set up.
 * ********
 * 
 * TODO 1. Set the permissions in the manifest to access location services and vibration ACCESS_FINE_LOCATION,
 * ACCESS_MOCK_LOCATION, ACCESS_COARSE_LOCATION, VIBRATE.
 * TODO 2. Review the main layout file.
 * TODO 3. Reference the LocationManager class, which provides access to the system location services and request
 *         location changes notifications (This is not strictly required when developing proximity alerts, but I
 *         will use it here in order to calculate the distance between the point of interest and the current user location)
 * 		TODO 3.1 Call to the getSystemService method of our activity.
 * 		TODO 3.2 Use the requestLocationUpdates method in order to request notifications when the user's location changes.
 *		TODO 3.3 Review and complete the MyLocationListener class.
 *
 * TODO 4. Assign the GUI controls to the following variables as needed and define the listeners for the buttons:
 *         latitudeEditText, longitudeEditText, findCoordinatesButton, savePointButton.
 * TODO 5. Complete the saveProximityAlertPoint method
 * TODO 6. Complete the addProximityAlert method
 * TODO 7. Complete the getCoordinatesFromLastKnownLocation method
 * TODO 8. Review the saveCoordinatesInPreferences method
 * TODO 9. Review the retrievelocationFromPreferences method
 */
public class ProxAlertActivity extends Activity
{
  private static final long MINIMUM_DISTANCECHANGE_FOR_UPDATE = 1; // in Meters

  private static final long MINIMUM_TIME_BETWEEN_UPDATE = 1000; // in Milliseconds

  private static final long POINT_RADIUS = 1000; // in Meters

  private static final long PROX_ALERT_EXPIRATION = -1;

  private static final String POINT_LATITUDE_KEY = "POINT_LATITUDE_KEY";

  private static final String POINT_LONGITUDE_KEY = "POINT_LONGITUDE_KEY";

  private static final String PROX_ALERT_INTENT = "de.uniluebeck.itm.momult.ProximityAlert";

  private static final NumberFormat nf = new DecimalFormat("##.########");

  private LocationManager locationManager;

  private EditText latitudeEditText;

  private EditText longitudeEditText;

  private Button findCoordinatesButton;

  private Button savePointButton;

  @Override
  public void onCreate(Bundle savedInstanceState)
  {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 
     * TODO 3. Reference the LocationManager class, which provides access to the system location services and
     * request location changes notifications (This is not strictly required when developing proximity alerts,
     * but I will use it here in order to calculate the distance between the point of interest and the current
     * user location)
     *
     * TODO 3.1 Call the getSystemService method of our activity. Use Context.LOCATION_SERVICE for location services.
     * TODO 3.2 Use the requestLocationUpdates method in order to request notifications when the user's location changes.
     * 		Hint: Use LocationManager.GPS_PROVIDER, both minimum time and distance are defined above. Finally use
     *          MyLocationListener class as your listener.
     *          - Use LocationManager.NETWORK_PROVIDER to get the location from the network instead of the GPS if you are indoor
     * TODO 4. Assign the GUI controls to the following variables as needed and define the onClick listeners for the buttons:
     *         latitudeEditText, longitudeEditText, findCoordinatesButton, savePointButton.
     * 			- when findCoordinatesButton is clicked the getCoordinatesFromLastKnownLocation method is called. This method
     *        is called when the user wants to find his current coordinates.
     * 			- when savePointButton is clicked the saveProximityAlertPoint method is called
     */

    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================	
    this.locationManager = (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
    this.locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, MINIMUM_TIME_BETWEEN_UPDATE, MINIMUM_DISTANCECHANGE_FOR_UPDATE, new MyLocationListener());
    
    this.latitudeEditText = (EditText)this.findViewById(R.id.point_latitude);
    this.longitudeEditText = (EditText)this.findViewById(R.id.point_longitude);
    
    this.findCoordinatesButton = (Button)this.findViewById(R.id.find_coordinates_button);
    this.findCoordinatesButton.setOnClickListener(new OnClickListener()
    {
      public void onClick(View view)
      {
        getCoordinatesFromLastKnownLocation();
      }
    });
    
    this.savePointButton = (Button)this.findViewById(R.id.save_point_button);
    this.savePointButton.setOnClickListener(new OnClickListener()
    {
      public void onClick(View view)
      {
        saveProximityAlertPoint();
      }
    });
    //===================================================================================	
  }

  private void saveProximityAlertPoint()
  {
    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 
     * TODO 5. Complete the saveProximityAlertPoint method
     * 		TODO 5.1. get the last known location for the location manager
     * 			Hint: 
     * 				- Define a variable called location form type Location that will host the value.
     * 				- Use the getLastKnownLocation method with the GPS_PROVIDER the provider
     * 		TODO 5.2 If the location is null then toast a notification to the user that the location is not known and then return.
     * 		TODO 5.3 Save the known coordinate using the saveCoordinatesInPreferences and alert the user with the
     *             location by calling the addProximityAlert method.
     * 			Hint: use getLatitude and getLongitude methods on the variable location you have created in the earlier step.
     */
    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================	
    Location lastLocation = this.locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    
    if (null == lastLocation)
    {
      DisplayToast("Last location is not known.");
      return;
    }
    
    float latitude = (float)lastLocation.getLatitude();
    float longitude = (float)lastLocation.getLongitude();
    
    this.saveCoordinatesInPreferences(latitude, longitude);
    this.addProximityAlert(latitude, longitude);
    //===================================================================================	
  }

  // addProximityAlert method that can be used to set a proximity alert for a location given
  // by specific coordinates (latitude, longitude) and a given radius
  private void addProximityAlert(double latitude, double longitude)
  {
    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 
     * TODO 6. Complete the addProximityAlert method. 
     * 		TODO 6.1. create an implicit intent with "PROX_ALERT_INTENT" as a parameter.
     * 		TODO 6.2. create PendingIntent variable. A PendingIntent is used to generate an Intent to fire
     *              when entry to or exit from the alert region is detected.
     * 			Hint: use PendingIntent.getBroadcast(this, 0, Your_Intent_Name, 0);
     * 		TODO 6.3. add a proximity alert to the location manager to get notification if the current
     *              location is near by a defined saved location (POI)
     * 			Hint:
     * 				- Use the addProximityAlert on the location manager variable.
     * 				- provide the following parameters to the addProximityAlert method (passed_latitude,
     *          passed_longitude, defined_radius, defined_expiration, Your_Pending_Intent)
     * 		TODO 6.4. Create an intent filter using IntentFilter class and pass the "PROX_ALERT_INTENT" string
     * 		TODO 6.5. Register to listen to the explicit intents for that filter using registerReceiver method
     *              passing (new ProximityIntentReceiver(), Your_Filter);
     * 		TODO 6.7 Complete ProximityIntentReceiver class which will receive the intents when the location
     *             is near to a POI.
     */
    
    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================	
    Intent intent = new Intent(PROX_ALERT_INTENT);
    
    PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
    
    this.locationManager.addProximityAlert(latitude, longitude, POINT_RADIUS, PROX_ALERT_EXPIRATION, pendingIntent);
    
    IntentFilter intentFilter = new IntentFilter(PROX_ALERT_INTENT);
    
    this.registerReceiver(new ProximityIntentReceiver(), intentFilter);
    //===================================================================================	
  }

  // When the user wants to find his current coordinates, the getCoordinatesFromLastKnownLocation method is invoked. 
  private void getCoordinatesFromLastKnownLocation()
  {
    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 
     * TODO 7. Complete the getCoordinatesFromLastKnownLocation method. We use the getLastKnownLocation method and
     *         retrieve a Location object. The EditTexts are then populated with the retrieved location information.
     * 		TODO 7.1. get the  last known location for the location manager
     * 			Hint: 
     * 				- Define a variable called location form type Location that will host the value.
     * 				- Use the getLastKnownLocation method with the GPS_PROVIDER the provider
     * 		TODO 5.2 if the location is not null then set the latitudeEditText and longitudeEditText to the values.
     *             Make sure that you format the values based on NumberFormat nf variable create at the top of this activity.
     * 			Hint: Use  nf.format with the value you have got form the location for the getLatitude and getLongitude.
     */
    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================	
  }

  /*
   * -----------------------------------------------------------------------------------
   * !!! LAB EXERCISE !!!
   * -----------------------------------------------------------------------------------	
   * 
   * TODO 8. Review the saveCoordinatesInPreferences method
   */
  private void saveCoordinatesInPreferences(float latitude, float longitude)
  {
    // android.content.SharedPreferences Interface for accessing and modifying preference data returned
    // by getSharedPreferences(String, int). For any particular set of preferences, there is a single
    // instance of this class that all clients share. Modifications to the preferences must go through
    // an SharedPreferences. Editor object to ensure the preference values remain in a consistent state
    // and control when they are committed to storage.

    SharedPreferences prefs = this.getSharedPreferences(getClass().getSimpleName(), Context.MODE_PRIVATE);
    SharedPreferences.Editor prefsEditor = prefs.edit();
    prefsEditor.putFloat(POINT_LATITUDE_KEY, latitude);
    prefsEditor.putFloat(POINT_LONGITUDE_KEY, longitude);
    prefsEditor.commit();
  }

  /*
   * -----------------------------------------------------------------------------------
   * !!! LAB EXERCISE !!!
   * -----------------------------------------------------------------------------------	
   * 
   * TODO 9. Review the retrievelocationFromPreferences method
   */
  private Location retrievelocationFromPreferences()
  {

    SharedPreferences prefs = this.getSharedPreferences(getClass().getSimpleName(), Context.MODE_PRIVATE);
    Location location = new Location("POINT_LOCATION");
    location.setLatitude(prefs.getFloat(POINT_LATITUDE_KEY, 0));
    location.setLongitude(prefs.getFloat(POINT_LONGITUDE_KEY, 0));
    
    return location;
  }

  // Called one the location is changed
  public class MyLocationListener implements LocationListener
  {
    public void onLocationChanged(Location location)
    {
      /*
       * -----------------------------------------------------------------------------------
       * !!! LAB EXERCISE !!!
       * -----------------------------------------------------------------------------------	
       * TODO 3.3 Review and complete MyLocationListener class.
       * TODO 3.3.1 Retrieve the saved location by calling the retrievelocationFromPreferences method.
       * TODO 3.3.2 Calculate the difference between current distance to saved reference distance.
       *            Then display the difference in a toast message.
       * 		Hint: Use the location.distanceTo() method.
       */
      
      //===================================================================================
      // *** YOUR CODE HERE ***	
      //===================================================================================	
      Location locationFromPreferences = retrievelocationFromPreferences();
      
      float distance = location.distanceTo(locationFromPreferences);
      
      DisplayToast(String.valueOf(distance));
      //===================================================================================	
    }

    public void onStatusChanged(String s, int i, Bundle b)
    {
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }
  }
  
  private void DisplayToast(String msg)
  {
    Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
  }
}