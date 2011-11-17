package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
 

/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * We shall continue our exploration of two categories of views: TimePicker view and DatePicker view.
 * The associated layout xml file is layout/moreviews.xml
 * 
 * TODO 3. Complete "MoreViewsActivity" class
 * 		TODO 3.1 Register MoreViewsActivity activity to the manifest.
 * 			- You can simply do that by adding <activity android:name="Here is the activity name" android:label="@string/app_name" />
 * 		TODO 3.2 Review layout/moreviews.xml
 * 			- Set the layout in the onCreate() method to this xml file.
 * 		TODO 3.3 Using TimePicker views. The TimePicker view allows users to select a time of the day, in either 24 hour mode or AM/PM mode.
 * 			- The above program displays the TimePickerDialog when the activity is created. When the time is set, the selected time is displayed 
 * 			using the Toast class.
 * 			TODO 3.3.1 Review the TimePicker view in the layout. 
 * 				Hints:
 * 					-Notice that the layout is not connected with the code. Therefore it is only for display but it does not do anything if the user 
 * 					interacts with it.
 * 			TODO 3.3.2 Show the TimePicker as a dialog window in the activity view
 * 				Hints:	
 * 					- You will need to fire the dialog by calling the showDialog() method after the activity is created (onCreate method)
 * 					- Review showDialog method
 * 			TODO 3.3.3 Review the OnTimeSetListener listener (TimePickerDialog.OnTimeSetListener()) and complete the onTimeSet method to display the selected
 * 					time as a toast message to the user.
 * 
 * 		TODO 3.4 Using DatePicker views. The DatePicker view allows users to select a date.
 * 			- The above program displays the DatePickerDialog when the activity is created. When the time is set, the selected time is displayed 
 * 			using the Toast class.
 * 			TODO 3.4.1 Review the DatePicker view in the layout. 
 * 				Hints:
 * 					-Notice that the layout is not connected with the code. Therefore it is only for display but it does not do anything if the user 
 * 					interacts with it.
 * 
 * 			TODO 3.4.2 Show the DatePicker as a dialog window in the activity view 
 * 				Hints:	
 * 					- You will need to fire the dialog by calling the showDialog() method after the activity is created (onCreate method)
 * 					- Review showDialog method
 *   		TODO 3.4.3 Review the OnDateSetListener listener (DatePickerDialog.OnDateSetListener()) and complete the onDateSet method to display the selected
 * 					date as a toast message to the user.
 */

public class MoreViewsActivity extends Activity 
{
	// TimePicker view related
    int hour, minute;
    static final int TIME_DIALOG_ID = 0; // used to distinguish dialog windows
    
	// DatePicker view related
    int Year, month, day;
    static final int DATE_DIALOG_ID = 1; // used to distinguish dialog windows
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 	TODO 2
		 * 		 Set the layout in the onCreate() method to this layout file using setContentView() method.
		 * 
		 * 	TODO 3 & TODO 4 
		 * 		Call the showDialog() method with different IDs created above to display either one of the TimePicker or DatePicker 
		 * 		Hints:
		 * 			- Test the dialogs one at a time. This makes it easier to understand the interface and having only one dialog on screen to interact with.
		 */
        
        //===================================================================================
        // *** YOUR CODE HERE ***	
        //===================================================================================	

        
    }
 
    /* 
     * The onCreateDialog method fires a dialog based on the passed ID, to decide firing a Time or Date picker view.
     * A dialog showing a progress indicator and an optional text message or view.  
     * TimePickerDialog A dialog that prompts the user for the time of day using a TimePicker. DatePickerDialog A dialog that prompts the user for the date of day using a DatePicker. 
     */
    @Override    
    protected Dialog onCreateDialog(int id) 
    {
        switch (id) {
            case TIME_DIALOG_ID: 
                return new TimePickerDialog(
                    this, mTimeSetListener, hour, minute, false);
                
            case DATE_DIALOG_ID: 
                return new DatePickerDialog(
                    this, mDateSetListener, Year, month, day);
        }
        return null;    
    }
 
    /*
     * The TimePickerDialog.OnTimeSetListener callback interface used to indicate the user is done filling in the time (they clicked on the 'Set' button). 
     */
    private TimePickerDialog.OnTimeSetListener mTimeSetListener =
    new TimePickerDialog.OnTimeSetListener() 
    {       
	    /*
	     * Implementing the onTimeSet method which is called when the time is set by the user while interacting with the TimePickerDialog. The method is fired with the following 
	     * essential information: TimePicker view, int hourOfDay, int minuteOfHour
	     * 
	     */
        public void onTimeSet(TimePicker view, int hourOfDay, int minuteOfHour) 
        {
        	
	  		/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------	
			 * 	TODO 3.3.3
			 * 		 Display the selected time as a toast message to the user
			 * 
   			 */
	        
	        //===================================================================================
	        // *** YOUR CODE HERE ***	
	        //===================================================================================

        }
    };
    
    
    /*
     * The DatePickerDialog.OnDateSetListener callback interface used to indicate the user is done filling in the date (they clicked on the 'Set' button). 
     */
    private DatePickerDialog.OnDateSetListener mDateSetListener =
    new DatePickerDialog.OnDateSetListener() 
    {
    	
    	/*
	     * Implementing the onDateSet method which is called when the date is set by the user while interacting with the DatePickerDialog. The method is fired with the following 
	     * essential information: DatePicker view, int year, int monthOfYear,int dayOfMonth
	     * 
	     */
        public void onDateSet(DatePicker view, int year, int monthOfYear,int dayOfMonth) 
        {
	  		/*
			 * -----------------------------------------------------------------------------------
			 * !!! LAB EXERCISE !!!
			 * -----------------------------------------------------------------------------------	
			 * 	TODO 3.4.3
			 * 		 Display the selected date as a toast message to the user
			 * 
   			 */
	        
	        //===================================================================================
	        // *** YOUR CODE HERE ***	
	        //===================================================================================

        }
    };
}
