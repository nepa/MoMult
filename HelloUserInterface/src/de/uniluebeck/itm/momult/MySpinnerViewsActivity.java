package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
 

/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * We shall continue our exploration lists but this time with the Spinner view.  The Spinner view displays an item at a time from a list and 
 * lets the users choose among them.
 * 
 * The associated layout xml file is layout/spinnerviews.xml
 * 
 * TODO 5. Complete "MySpinnerViewsActivity" class as follows
 * 		TODO 5.1 Register MyListViewsActivity activity to the manifest.
 * 			- You can simply do that by adding <activity android:name="Here is the activity name" android:label="@string/app_name" />
 * 		TODO 5.2 Review layout/spinnerviews.xml
 * 			- Set the layout in the onCreate() method to this xml file.
 * 			Hints:
 * 				- Note that you use the id attribute to identify each view. The id of a view must start with the "@+id/" specifier followed by the name
 * 				 of the view.
 * 		TODO 5.3 Define an array of 10 items presenting some famous presidents names as the source of out list view
 * 			
 * 		TODO 5.4 Define a spinner called "s1" and associate it with the the spinner view in the layout
 * 			Hints:
 * 				- Use findViewById() method
 * 		TODO 5.5 Define ArrayAdapter called "adapter" by using ArrayAdapter(Context CurrentContext, int android.R.layout.simple_spinner_item, String[] YourArray)
 * 				and set this adapter to the s1.
 * 			Hints:
 * 				-  android.R.layout.simple_spinner_item is a reference to an built-in XML layout document that is part of the Android OS, rather than one of your own XML layouts.
 *		TODO 5.6 Review event listener setOnItemSelectedListener and complete onItemSelected callback method implementation to show the name of the selected
 *			president in a toast message
 *		TODO 5.7: Change the spinner look and feel to drop down by changing to android.R.layout.simple_spinner_items layout and see the difference in appearance
 *			 
 */



public class MySpinnerViewsActivity extends Activity 
{
	
	 /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * TODO 5.3
		 * 		You array of names
		 */
	    
	    //===================================================================================
	    // *** YOUR CODE HERE ***	
	    //===================================================================================	
	

    Spinner s1;
 
    @Override    
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        
        /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 	TODO 5.2:  Set the layout in the onCreate() method to this layout file using setContentView() method.
		 * 	TODO 5.4: Define a spinner called "s1" and associate it with the the spinner view in the layout
		 * 	TODO 5.5: Define ArrayAdapter called "adapter" by using ArrayAdapter
		 * 	TODO 5.6: Review event listener setOnItemSelectedListener and complete its implementation
		 * 	TODO 5.7: Change the spinner look and feel to drop down by changing to android.R.layout.simple_spinner_items layout and see the difference in appearance
		 */		
        
        //===================================================================================
        // *** YOUR CODE HERE ***	
        //===================================================================================

        
        
        s1.setOnItemSelectedListener(new OnItemSelectedListener()
        {
            /*
             * Implement onItemSelected to listen to all select events on the spinner done by the user. This method will be called when an item in the list is selected. 
             * 
             */
            public void onItemSelected(AdapterView<?> arg0, 
            View arg1, int arg2, long arg3) 
            {
                /*
        		 * -----------------------------------------------------------------------------------
        		 * !!! LAB EXERCISE !!!
        		 * -----------------------------------------------------------------------------------	
        		 * 	TODO 5.6: show the name of the selected president in a toast message
        		 */		
                
                //===================================================================================
                // *** YOUR CODE HERE ***	
                //===================================================================================
            	
                          
            }
 
            public void onNothingSelected(AdapterView<?> arg0) {}
        });
    }
}