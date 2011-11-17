package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
 

/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * We shall continue our exploration views and this time with the ListView.
 * The associated layout xml file is layout/listviews.xml
 * 
 * TODO 4. Complete "MyListViewsActivity" class
 * 		TODO 4.1 Register MyListViewsActivity activity to the manifest.
 * 			- You can simply do that by adding <activity android:name="Here is the activity name" android:label="@string/app_name" />
 * 		TODO 4.2 Review layout/listviews.xml
 * 			- Set the layout in the onCreate() method to this xml file.
 * 			Hints:
 * 				- Note that you use the id attribute to identify each view. The id of a view must start with the "@+id/" specifier followed by the name
 * 				 of the view.
 * 		TODO 4.3 Complete MyListViewsActivity class to use and handle List views. 
 * 			Hints: 
 * 				- Note that our activity extends the ListActvity base class
 * 				- You do not need to refer in your code to the list defined in your layout xml file as the activity extends ListActivity and this activity
 * 				has the defined xml layout file.
 * 			TODO 4.3.1 Define an array of 10 items presenting some famous presidents names as the source of out list view
 * 			TODO 4.3.2 Set the list adapter by using ArrayAdapter(Context CurrentContext, int android.R.layout.simple_list_item_1, String[] YourArray)
 * 				Hints:
 * 					-  android.R.layout.simple_list_item_1 is a reference to an built-in XML layout document that is part of the Android OS, rather than one of your own XML layouts.
 *		TODO 4.4 Implement the onListItemClick callback method 
 */



public class MyListViewsActivity extends ListActivity 
{    
    
    /*
	 * -----------------------------------------------------------------------------------
	 * !!! LAB EXERCISE !!!
	 * -----------------------------------------------------------------------------------	
	 * TODO 4.3.1
	 * 		You array of names
	 */
    
    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================	
	

    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 	TODO 4.2
		 * 		 Set the layout in the onCreate() method to this layout file using setContentView() method.
		 * 
		 * TODO 4.3.2
		 * 		Set the list adapter to this activity and to the source array you have defined earlier.
		 */		
        
        //===================================================================================
        // *** YOUR CODE HERE ***	
        //===================================================================================	
        
    
    }
 
    /*
     * Implement onListItemClick to listen to all click events on the list done by the user. This method will be called when an item in the list is selected. 
     * Subclasses should override. Subclasses can call getListView().getItemAtPosition(position) if they need to access the data associated with the selected item.
     */
    public void onListItemClick(ListView parent, View v,int position, long id) 
    {   
        /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 	TODO 4.4
		 * 		Fire a toast message to notify the user with the president name selected by the user.
		 */		
        
        //===================================================================================
        // *** YOUR CODE HERE ***	
        //===================================================================================	
    	
    	
    }  
    
}
