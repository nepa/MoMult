package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Mobile Multimedia Systems Exercises (MMS2011)
 *  							Exercise 2 Part 1
 * 							Winter Term 2011
 * 
 * Bashar Altakrouri | Ambient Computing Group | Institute of Telematics | University of Luebeck | www.itm.uni-luebeck.de | altakrouri@itm.uni-luebeck.de
 * 
 * OVERVIEW
 * 
 * The aim of this exercise is to be familiar with the basic Android implicit and explicit intents. 
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
 *  - http://developer.android.com/guide/appendix/g-app-intents.html
 */


/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * The exercise consists of the following parts:
 * 1. Get involved with the GUI. Complete the GUI as follows:
 * 		1.1. Review layout/main.xml to understand the GUI of this application.
 * 		1.2. Complete layout/main.xml
 * 
 * 2. Using implicit intents
 * 		2.1 Intent to a browser activity
 * 		2.2 Intent to Call a number 
 * 		2.3 Intent to Dial a number
 *  	2.4 Intent to use Google maps I
 *   	2.5 Intent to use Google maps II
 *      2.6 Intent to use Camera
 *      2.7 Intent to access the phone contact list
 *      2.8 Intent to edit a contact details
 *      
 * 3. Using explicit intents by invoking ActivityTwo and passing some information and then return to the MyIntentsActivity.
 * 		3.1 Complete "callExplicitIntent" method 
 * 		3.2 Complete "ActivityTwo.java" class 
 * 
 */

public class HelloIntents1Activity extends Activity {
	private static final String TAG = "MyIntentsActivity"; 	// For logging

	
	private static final int REQUEST_CODE = 10;
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void callIntent(View view) {
		Intent intent = null;
    
		switch (view.getId()) {
		case R.id.Button01:
			
			/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------			  
			 * TODO 2.1 Complete the callIntent method to open luebeck university url in the browser  using intents and the "startActivity" method
			 * 		Hints:
			 * 			- Use the "ACTION_VIEW" as an action, and the "http://www.uni-luebeck.de" as data.
			 * 			- You will need "Intent.ACTION_VIEW", Uri.parse("url goes here")
			 * 			- intent = new Intent (...,...)
			 * 			- This action requires "uses permissions" to be set in the manifest to allow for Internet access
			 * 
			 */
			
			//===================================================================================
			// *** YOUR CODE HERE ***	
		 	//===================================================================================
      intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uni-luebeck.de"));      

			//-----------------------------------------------------------------------------------
		
			break;
		case R.id.Button02:
			/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------			 
			 * TODO 2.2 Complete the callIntent method to a contact number  using intents and the "startActivity" method
			 * 		Hints:
			 * 			- Use the "ACTION_CALL" as an action, and the "(+49)12345789" as data.
			 * 			- You will need "Intent.ACTION_CALL", Uri.parse("tel:the contact phone number")
			 * 			- intent = new Intent (...,...)
			 * 			- The calling action requires "uses permissions" to be set in the manifest
			 * 
			 */
			
			//===================================================================================
			// *** YOUR CODE HERE ***	
		 	//===================================================================================
      intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+49)12345789"));

			//-----------------------------------------------------------------------------------
			
			break;
		case R.id.Button03:
			/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------			 
			 * TODO 2.3 Complete the callIntent method to a dial number using intents and the "startActivity" method
			 * 		Hints:
			 * 			- Similar to TODO 2.2 but the action is DIAL
			 * 
			 */
			
			//===================================================================================
			// *** YOUR CODE HERE ***	
		 	//===================================================================================
      intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+49)12345789"));
			
			//-----------------------------------------------------------------------------------

			
			break;
		case R.id.Button04:
			
			/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------			 
			 * TODO 2.4 Complete the callIntent method to open maps using intents and the "startActivity" method
			 * 		- Think about what does the location query mean?
			 * 	
			 * 		Hints:
			 * 			- Use the "ACTION_VIEW" as an action, and the "geo:50.123,7.1434?z=8" as data.
			 * 			- You will need "Intent.ACTION_VIEW", Uri.parse("geo location goes here")
			 * 			- intent = new Intent (...,...)
			 * 			- This action requires "uses permissions" to be set in the manifest to allow for Internet access
			 * 			- If you use the emulator you should set it to Google API - API Level 7 to support maps
			 * 
			 */
			
			//===================================================================================
			// *** YOUR CODE HERE ***	
		 	//===================================================================================
      intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:50.123,7.1434?z=8"));
			
			//-----------------------------------------------------------------------------------
			
			break;
		case R.id.Button05:
			
			/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------			 
			 * TODO 2.5 Complete the callIntent method to open maps using intents and the "startActivity" method
			 * 		- Similar to TODO2.4 but with geo-query as follows "geo:0,0?q=query"
			 * 	
			 */
			
			//===================================================================================
			// *** YOUR CODE HERE ***	
		 	//===================================================================================
      intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=query"));
			
			//-----------------------------------------------------------------------------------

			break;
		case R.id.Button06:
			
			/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------			 
			 * TODO 2.6 Complete the callIntent method to open the built-in camera using intents and the "startActivityForResult" method
			 * 	
			 * 		Hints:
			 * 			- Use the "android.media.action.IMAGE_CAPTURE" action
			 * 			- intent = new Intent (...)
			 * 			- This action requires "uses permissions" to be set in the manifest to allow for camera access
			 * 			- review Part1 in the "onActivityResult" method
			 * 
			 */
			
			//===================================================================================
			// *** YOUR CODE HERE ***	
		 	//===================================================================================
      intent = new Intent("android.media.action.IMAGE_CAPTURE");
			
			//-----------------------------------------------------------------------------------

			break;
		case R.id.Button07:
			
			/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------			 
			 * TODO 2.7 Complete the callIntent method to open the phone's contact list using intents and the "startActivity" method
			 * 	
			 * 		Hints:
			 * 			- Use the "ACTION_VIEW" as an action, and the "content://contacts/people/" as data.
			 * 			- intent = new Intent (...,...)
			 * 			- Find out which uses-permissions you need to set in the manifest
			 * 
			 */
			
			//===================================================================================
			// *** YOUR CODE HERE ***	
		 	//===================================================================================
      intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
			
			//-----------------------------------------------------------------------------------

			break;
		case R.id.Button08:
			/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------			 
			 * TODO 2.8 Complete the callIntent method to edit the first contact in the phone's contact list using intents and the "startActivity" method
			 * 	
			 * 		Hints:
			 * 			- Find out the action and the data required by yourself
			 * 
			 */
			
			//===================================================================================
			// *** YOUR CODE HERE ***	
		 	//===================================================================================
      intent = new Intent(Intent.ACTION_EDIT, Uri.parse("content://contacts/people/1"));
			
			//-----------------------------------------------------------------------------------

			break;
		default:
			break;
		}
    
    // Call desired intent
    if (view.getId() == R.id.Button06)
    {
      this.startActivityForResult(intent, RESULT_CANCELED);
    }
    else
    {
      this.startActivity(intent);
    }
	}

	/*
	 * Called when an activity you launched exits, giving you the requestCode you started it with,
   * the resultCode it returned, and any additional data from it. The resultCode will be
   * RESULT_CANCELED if the activity explicitly returned that, didn't return any result,
   * or crashed during its operation.
   * 
	 * You will receive this call immediately before onResume() when your activity is re-starting.
	 */
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		/*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------			 
		 * TODO 2.6
		 * 			- review Part1 in the "onActivityResult" method
		 * 
		 */
		
		// Part1
		if (resultCode == Activity.RESULT_OK && requestCode == 0) {
			String result = data.toURI();
			Toast.makeText(this, result, Toast.LENGTH_LONG);
		}
		
		/*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------			  
		 * TODO 3.1 
		 * 		- Review "onActivityResult" method Part2
		 */
		
		//Part2
		if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
			if (data.hasExtra("returnKey1")) {
				Toast.makeText(this, data.getExtras().getString("returnKey1"),
						Toast.LENGTH_SHORT).show();
			}
		}
	}
	
	/*
	 * Callback if the button is pressed. Invoke ActivityTwo via explicit intent and put on some extras.
	 */
	public void callExplicitIntent(View view) {
		Log.i(TAG,"callExplicitIntent Button pressed"); // information logging
		
		/*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------			  
		 * TODO 3.1 Create an intent "i" and put two key information to be send with the intent
		 * 		
		 * 		Hints:
		 * 			- Create an intent "i" using Intent(this, "name of the ActivityTwo class")
		 * 			- To put information use putExtra(String name, String value). The name is the key name
     *        of the information (use "Value1" and "Value2" as keys) and the value is the information
     *        to be sent
		 * 			- Use startActivityForResult(i, REQUEST_CODE) method to send the intent
		 * 			- Review "onActivityResult" method Part2
		 */
		
		//===================================================================================
		// *** YOUR CODE HERE ***	
	 	//===================================================================================
    Intent i = new Intent(this, ActivityTwo.class);
    i.putExtra("Value1", "Content of value 1.");
    i.putExtra("Value2", "Content of value 2.");
    this.startActivityForResult(i, REQUEST_CODE);

		//-----------------------------------------------------------------------------------

	}	
	
}
