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
 * The aim of this exercise is to be familiar with the different Android user interface and interaction elements. 
 * 
 * - Layouts: We will discuss the various layouts available in Android to position the various widgets on your screen.
 * 
 * - Views: We will learn about the various common views that you would likely use in your journey of Android development. 
 * 	 We have categorized the views in this series into the following group:
 * 		1. Basic Views - commonly-used views such as TextView, EditText, and Button views
 * 		2. Picker Views - views that allows users to select from, such as the TimePicker and DatePicker views
 * 		3. List Views - views that display a long list of items, such as the ListView and the Spinner views
 * 		4. Display Views - views that display images, such as the Gallery and ImageSwitcher views
 * 		5. Menus - views that displays additional and context sensitive menu items
 * 		6. Additional Views - interesting views such as the AnalogClock and DigitalClock views
 * 
 * 
 * 		
 * TODO
 * 1. Follow the instructions below and complete the exercise
 * 2. You will need to integrate the different part of the exercise to have a fully working app
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
 *  - http://mobiforge.com/designing/story/understanding-user-interface-android-part-1-layouts
 *  - http://mobiforge.com/designing/story/understanding-user-interface-android-part-3-more-views
 */


/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * The exercise consists of the following parts:
 * 1. Get involved with the basic principles of GUI layouts.
 * 		1.1. Review layout/main.xml to understand the GUI of this application.
 * 		1.2  Understand the LinearLayout by completing the exercise for layout/layout1.xml
 *		1.3  Understand the AbsoluteLayout by completing the exercise for layout/layout2.xml
 *		1.4  Understand the TableLayout by completing the exercise for layout/layout3.xml
 *		1.5  Understand the RelativeLayout by completing the exercise for layout/layout4.xml
 *		1.6  Understand the ScrollView by completing the exercise for layout/layout5.xml
 * 		Hints:
 * 			- To test different layouts you will need to change the setContentView(); in the onCreate method to the required layout
 * 
 * 2. Complete "MyBasicViewsActivity" class to get knowledge about manifest, more of layouts, basic UI listeners, and progress bars.
 * 		Hints:
 * 			- To test your activity you will need to start the activity with intent by adding startActivity(new Intent(this, NameOfTheActivityClass.class)); in
 * 				the onCreate() method within HelloUserInterfaceActivity class.
 * 
 * 3. Complete "MoreViewsActivity" class to get knowledge about manifest, more of layouts, TimePicker view, and DatePicker view.
 * 		Hints:
 * 			- To test your activity you will need to start the activity with intent by adding startActivity(new Intent(this, NameOfTheActivityClass.class)); in
 * 				the onCreate() method within HelloUserInterfaceActivity class.
 * 
 * 4. Complete "MyListViewsActivity" class to get knowledge about manifest, more of layouts, List views.
 * 		Hints:
 * 			- To test your activity you will need to start the activity with intent by adding startActivity(new Intent(this, NameOfTheActivityClass.class)); in
 * 				the onCreate() method within HelloUserInterfaceActivity class.
 * 
 * 5. Complete "MySpinnerViewsActivity" class to get knowledge about manifest, more of layouts, spinner views.
 * 		Hints:
 * 			- To test your activity you will need to start the activity with intent by adding startActivity(new Intent(this, NameOfTheActivityClass.class)); in
 * 				the onCreate() method within HelloUserInterfaceActivity class.
 *	
 * 6. Complete "MyDisplayViewsActivity" class to get knowledge about ImageView, Gallery and ImageSwitcher views.
 * 		- This exercise will also involve adding resources i.e. images to the res folder.
 * 		Hints:
 * 			- To test your activity you will need to start the activity with intent by adding startActivity(new Intent(this, NameOfTheActivityClass.class)); in
 * 				the onCreate() method within HelloUserInterfaceActivity class. 
 */


public class HelloUserInterfaceActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        

    /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 	TODO 1
		 * 		Hints:
		 * 			-To test with different views you will need to change the layout in the setContentView(); method
		 */
        
        //===================================================================================
        // *** YOUR CODE HERE ***	
        //===================================================================================	
        setContentView(R.layout.layout4);
        
        /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 
		 * 	TODO 2, TODO 3, TODO 4, TODO 5, TODO 6, and TODO 7
		 * 		To add the activity to the UI you will need to fire an intent as explained
		 */
        
        //===================================================================================
        // *** YOUR CODE HERE ***	
        //===================================================================================	
        

    }
}