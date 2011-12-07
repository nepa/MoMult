package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Mobile Multimedia Systems Exercises (MMS2011)
 *  							Exercise 3
 * 							Winter Term 2011
 * 
 * Bashar Altakrouri | Ambient Computing Group | Institute of Telematics | University of Luebeck | www.itm.uni-luebeck.de | altakrouri@itm.uni-luebeck.de
 * 
 * OVERVIEW
 * 
 * The aim of this exercise is to continue with Android user interface. This will cover Menus. 
 * 
 * Menus are useful for displaying additional options that are not directly visible on the
 * main UI of an application. 
 * 
 * There are two main types of menus in Android:
 * 		Context Menu - displays information related to a particular view on an activity. In
 *                   Android, to activate a context menu you press and hold on to it.
 * 		Options Menu - displays information related to the current activity. In Android, you
 *                   activate the options menu by pressing the MENU key.
 * 		
 * TODO
 * 1. Follow the instructions below and complete the exercise.
 * 2. Upon completing Option Menu, run and press menu button to see the menu you have created.
 *    Observe the icons displayed for menu item 1, 2 and 3.
 * 
 * Also, if the options menu has more than six items, there will be a More menu item to
 * represent the additional menu items.
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
 *	- http://mobiforge.com/designing/story/understanding-user-interface-android-part-4-even-more-views
 */
/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * TODO 1 Register MenusActivity activity to the manifest.
 * 		Hints:
 * 			- You can simply do that by adding <activity android:name="Here is the activity name" android:label="@string/app_name" />
 * TODO 2 Complete "MenusActivity" class and test it
 * 		Hints:
 * 			- To test your activity you will need to start the activity with intent by adding startActivity(new Intent(this,
 *        NameOfTheActivityClass.class)); in the onCreate() method within HelloUserInterfaceActivity class.
 */
public class HelloMenusActivity extends Activity
{
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    this.setContentView(R.layout.main);

    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 
     * 	TODO 2 To add the activity to the UI you will need to fire an intent as explained
     */

    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================	
    this.startActivity(new Intent(this, MenusActivity.class));
    //===================================================================================
  }
}
