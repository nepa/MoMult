package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
 
/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * This will handle all basic views. The most common basic views which you will come across the most often, there are some other basic controls that you 
 * will find yourself using very often are: TextView, Button, ImageButton, EditText, CheckBox, ToggleButton, RadioButton, and RadioGroup. 
 * The associated layout xml file is layout/basicviews.xml
 * 
 * 
 * TODO 2. Complete "MyBasicViewsActivity" class
 * 		TODO 2.1 Register MyBasicViewsActivity activity to the manifest.
 * 			- You can simply do that by adding <activity android:name="Here is the activity name" android:label="@string/app_name" />
 * 		TODO 2.2 Review layout/basicviews.xml
 * 			Hints:
 * 				- Note that you use the id attribute to identify each view. The id of a view must start with the "@+id/" specifier followed by the name
 * 				 of the view.
 * 		TODO 2.3 Define a variable to every view in the layout file and add event listener to it
 * 			Hints:
 * 				- Use the the similar type to the view that you are trying to define i.e.   Button btnOpen = (Button) findViewById(...);
 * 				- Use the "findViewById(R.id.nameOfTheView)" method to find the view in the layout file
 * 				- Your variables should follow the usual/nice naming patterns i.e. btnButtonName for buttons, checkCheckBoxName for CheckBoxes, etc.
 * 				-  To add a listener to a button: buttonName.setOnClickListener(new View.OnClickListener() {
 * 													public void onClick(View v) {
 * 														// your code is here
 * 										 				DisplayToast("Message to by displayed by the toast");
 * 													}
 * 												});
 * 				- For radio buttons use setOnCheckedChangeListener, OnCheckedChangeListener, and onCheckedChanged
 * 				- For all views, when the user interact with the view, the name of the view in a meaningful way i.e. you have selected buttonX by means of DisplayToast method
 * 				- For checkBoxes show the user the selected status for this view i.e. checked or not checked
 * 		TODO 2.4 Review "DisplayToast" method
 * 		TODO 2.5 Add two progress bars to the layout and name them "progressBar" and "progressBarHorizontal". Then remove the comment on the section marked in the onCreate method.
 * 			The ProgressBar view provides visual feedback of some background tasks. For example, you might be downloading some data from the web and need to
 * 			 update the user of the status of the download. In this case, the ProgressBar view is a good choice for this task. 
 * 			Hints:
 * 				- To make a progress bar horizontal you will need to set its style as follows: style="?android:attr/progressBarStyleHorizontal" 
 * 				- What is the different between a normal progress bar and a horizontal progress bar? 
 * 				- Try to understand the code responsible for background simulation of a running job (the previously commented code)
 * 		
 * 
 */


public class MyBasicViewsActivity extends Activity 
{
	/* ProgressBar view related */
	private static int progress = 0;
    private ProgressBar progressBar;
    private ProgressBar progressBarHorizontal;
    private int progressStatus = 0;
    private Handler handler = new Handler();
 
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basicviews);
 
        /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 	TODO 2.3 Define a variable to every view in the layout file and add event listener to every view
		 */
        
        //===================================================================================
        // *** YOUR CODE HERE ***	
        //===================================================================================	
        
       
        
        
        /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 *  TODO 2.5 This commented part should be un-commented when testing the progressbar section of this exercise
		 */

        // ---ProgressBar ---
        /*
         * The default mode of the ProgressBar view is indeterminate - that is, it shows a cyclic animation. This mode is useful for tasks that do not have a clear indication of when they will be completed. For example, you are sending some data to a web service and waiting for the server to respond.
         * The following code shows how you can spin off a background thread to simulate performing some long lasting tasks. When the task is completed, you hide the ProgressBar view by setting its Visibility property to GONE.
         * The difference between the INVISIBLE and GONE constants is that the INVISIBLE constant simply hides the ProgressBar view. The GONE constant removes the ProgressBar view from the activity and does not take up any space on the activity.
         * When the background task is completed, the space taken by the view is given up when you set its Visibility property to GONE. 
         * 
         */
        
        // comment start
        /*
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        progressBarHorizontal = (ProgressBar) findViewById(R.id.progressbarhorizontal);
        
        
        //---do some work in background thread---
        new Thread(new Runnable() 
        {
            public void run() 
            {
                //---do some work here---
                while (progressStatus < 100) 
                {
                    progressStatus = doSomeWork();
                    
                  //---Update the horizontal progress bar---
                    handler.post(new Runnable() 
                    {
                        public void run() {
                        	progressBarHorizontal.setProgress(progressStatus);
                        }
                    });
 
                    
                }
 
                //---hides the progress bar---
                handler.post(new Runnable() 
                {
                    public void run() 
                    {
                        //---0 - VISIBLE; 4 - INVISIBLE; 8 - GONE---
                        progressBar.setVisibility(8);
                        progressBarHorizontal.setVisibility(8);
                    }
                });
            }    
 
            //---do some long lasting work here---
            private int doSomeWork() 
            {
                try {
                    //---simulate doing some work---
                    Thread.sleep(500);
                } catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                return ++progress;
            }
 
        }).start();  
        */ 
        // comment end
    }
 
    	/*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 		TODO 2.4 Review "DisplayToast" method
		 */
    
    private void DisplayToast(String msg)
    {
         Toast.makeText(getBaseContext(), msg, 
                 Toast.LENGTH_SHORT).show();        
    }    
}
