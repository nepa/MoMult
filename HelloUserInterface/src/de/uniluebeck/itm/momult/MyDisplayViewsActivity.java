package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
 
/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * So far all the views you have seen are used to display text information. For displaying images, you can use the ImageView and Gallery views.
 * The Gallery is a view that shows items (such as images) in a center-locked, horizontal scrolling list. ImageView is simply for displaying images as the name indicates
 * 
 * The associated layout xml file is layout/displayviews.xml
 * 
 * TODO 6. Complete "MyDisplayViewsActivity" class as follows
 * 		TODO 6.1 Register MyDisplayViewsActivity activity to the manifest.
 * 			- You can simply do that by adding <activity android:name="Here is the activity name" android:label="@string/app_name" />
 * 		TODO 6.2 Review layout/displayviews.xml and review the res/values/attrs.xml file.
 * 			- Set the layout in the onCreate() method to this xml file.
 * 			Hints:
 * 				- Note that you use the id attribute to identify each view. The id of a view must start with the "@+id/" specifier followed by the name
 * 				 of the view.
 * 		TODO 6.3 Check the res/drawable folder. You can add images simply by dragging them to the drawable folder.
 * 		TODO 6.4 Define a Gallery view, set its adapter and implement its event listener in onCreate method (Marked Part1)
 * 			Hints:
 * 				- You should link your gallery variable with the layout
 * 				- set the adapter by using NameOfYourGallery.setAdapter(new ImageAdapter(this)); 
 * 				- Complete the implementation of NameOfYourGallery.setOnItemClickListener callback method
 * 		TODO 6.5 Review the ImageAdapter class
 * 		TODO 6.6 Uncomment getView and the code in ImageAdapter marked (Part 1) in the ImageAdapter class
 * 		TODO 6.7 Comment the code marked Part1 in the MyDisplayViewsActivity and layout file and uncomment Part2
 * 		TODO 6.8 Define a Grid view, set its adapter and implement its event listener in onCreate method (Marked Part2)
 * 			Hints:
 * 				- You should link your grid variable with the layout
 * 				- set the adapter by using NameOfYourGallery.setAdapter(new ImageAdapter(this)); 
 * 				- Complete the implementation of NameOfYourGallery.setOnItemClickListener callback method
 * 		TODO 6.9 Review the ImageAdapter class
 * 		TODO 6.10 Uncomment getView and the code in ImageAdapter marked (Part 2) in the ImageAdapter class
 */


public class MyDisplayViewsActivity extends Activity 
{     
    //---the images to display--- 
    Integer[] imageIDs = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7                    
    };
 
    @Override    
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        /*
		 * -----------------------------------------------------------------------------------
		 * !!! LAB EXERCISE !!!
		 * -----------------------------------------------------------------------------------	
		 * 	TODO 6.2:  Set the layout in the onCreate() method to this layout file using setContentView() method.
		 * 	TODO 6.4 Define a Gallery view, set its adapter and then implement its event listener in onCreate method (Marked Part1)
		 * 	TODO 6.8 Define a Grid view, set its adapter and implement its event listener in onCreate method (Marked Part2)
		 */		
        
        //===================================================================================
        // *** YOUR CODE HERE ***	
        //===================================================================================
 

        
        //--- Part1---  Gallery
        
        // Define the gallery
           
        gallery.setOnItemClickListener(new OnItemClickListener() 
        {
        	
            public void onItemClick(AdapterView parent, 
            View v, int position, long id) 
            {            
                /*
        		 * -----------------------------------------------------------------------------------
        		 * !!! LAB EXERCISE !!!
        		 * -----------------------------------------------------------------------------------	
        		 * 	TODO 6.4 Complete the implementation of NameOfYourGallery.setOnItemClickListener callback method
        		 * 		- show the index of the selected image using a toast and show it for short time	
        		 * 			Hints:
        		 * 				- You will need Toast.LENGTH_SHORT parameter
        		 * 		- Define an ImageView, link it to the layout and set its image to the selected image index.
        		 * 			Hints:
        		 * 				- You will need setImageResource
        		 * 				- Review imageIDs array that you will need to use
        		 */		
                
                //===================================================================================
                // *** YOUR CODE HERE ***	
                //===================================================================================


                
            }
        });
        
        // End Part 1
        
        //--- Part2--- GRID

// 
//        gridView.setOnItemClickListener(new OnItemClickListener() 
//        {
//            public void onItemClick(AdapterView parent, 
//            View v, int position, long id) 
//            {          
//              /*
//      		 * -----------------------------------------------------------------------------------
//      		 * !!! LAB EXERCISE !!!
//      		 * -----------------------------------------------------------------------------------	
//      		 * 	TODO 6.8 Complete the implementation of NameOfYourGridview.setOnItemClickListener callback method
//      		 * 		- show the index of the selected image using a toast and show it for short time	
//      		 * 			Hints:
//      		 * 				- You will need Toast.LENGTH_SHORT parameter
//      		 */		
//              
//              //===================================================================================
//              // *** YOUR CODE HERE ***	
//              //===================================================================================
//              
//            }
//        });    
        
        // End Part 2

        
    }
 
    public class ImageAdapter extends BaseAdapter 
    {
        private Context context;
        private int itemBackground;
 
        public ImageAdapter(Context c) 
        {
            context = c;
            
            //--- Part1--- Gallery 
            //---setting the style---
            TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
            itemBackground = a.getResourceId(
                R.styleable.Gallery1_android_galleryItemBackground, 0);
            a.recycle();  
            //--- End Part1

                    
        }
 
        //---returns the number of images---
        public int getCount() {
            return imageIDs.length;
        }
 
        //---returns the ID of an item--- 
        public Object getItem(int position) {
            return position;
        }            
 
        public long getItemId(int position) {
            return position;
        }
 
        // comment to test with gird example
        
        //--- Part1--- Gallery 
        //---returns an ImageView view---
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imageIDs[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new Gallery.LayoutParams(150, 120));
            imageView.setBackgroundResource(itemBackground);
            return imageView;
        }
        
        // End Part 1

        //--- Part2---  GRID
      //---returns an ImageView view---
//        public View getView(int position, View convertView, ViewGroup parent) 
//        {
//            ImageView imageView;
//            if (convertView == null) {
//                imageView = new ImageView(context);
//                imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//                imageView.setPadding(5, 5, 5, 5);
//            } else {
//                imageView = (ImageView) convertView;
//            }
//            imageView.setImageResource(imageIDs[position]);
//            return imageView;
//        }
//        
        // End Part 2

    }    
}