package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*
 * -----------------------------------------------------------------------------------
 * !!! LAB EXERCISE !!!
 * -----------------------------------------------------------------------------------	
 * TODO 3.2	Complete "ActivityTwo.java" class by doing
 * 	TODO 3.2.1 Complete the "onCreate" method
 * 	TODO 3.2.2 Complete the "finish" method
 */


public class ActivityTwo extends Activity {

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.second); // set the layout from second.xml
		
		/*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * TODO 3.2.1.1 create a Bundle variable called "extras" and get the intent's extra into this bundle
		 * 		Hints:
		 * 			- "extras" variable should be on type "Bundle"
		 * 			- Use getIntent().getExtras() to get the intent extras
		 * 			- If the extras is null return the method
		 * TODO 3.2.1.2 Get the two information keys sent in the intent extras namely "Value1" and "Value2"
		 * 		Hints:
		 * 			- Use extras.getString("name of the key")
		 * 			- If the extras is null return the method
		 * TODO 3.2.1.3 Assign the values of "Value1" and "Value2" to EditText01 and EditText02 in the user interface
		 * 		- First check if both ("Value1" and "Value2" != null)
		 * 		- Create two variables of type "EditText", and assign them EditText01 and EditText02. 
		 * 		Hints:
 		 *		 	- Use (EditText) findViewById(R.id."name of the control")
 		 *			- Use setText("some text") to set the text for your controls
		 */
		
		//===================================================================================
		// *** YOUR CODE HERE ***	
	 	//===================================================================================	

		
		
		//-----------------------------------------------------------------------------------

	}

	// Callback for button finish
	public void onClick(View view) {
		finish();
	}

	/*
	 * On finish make an intent to be returned to the calling activity with some extras
	 */
	@Override
	public void finish() {
		/*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------			  
		 * TODO 3.2.2 Create an intent "data" and put two key information to be send with the intent
		 * 		
		 * 		Hints:
		 * 			- Create an intent "data" using Intent data = new Intent();
		 * 			- To put information use putExtra(String name, String value). The name is the key name of the information (use "returnKey1" and "returnKey2" as keys) and the value is the information to be sent
		 * 			- Use setResult(RESULT_OK, data) method to send data back to the calling activity "MyIntentsActivity" in this case. 
		 * 			  When an activity exits, it can call setResult to return data back to its parent. It must always supply a result code,
		 * 			  which can be the standard results RESULT_CANCELED, RESULT_OK, or any custom values starting at RESULT_FIRST_USER. 
		 * 			  In addition, it can optionally return back an Intent containing any additional data it wants.
		 * 			- Review "onActivityResult" method Part2 in the "MyIntentsActivity" class
		 */
		
		//===================================================================================
		// *** YOUR CODE HERE ***	
	 	//===================================================================================	

		//-----------------------------------------------------------------------------------

		
		super.finish();
	}
}
