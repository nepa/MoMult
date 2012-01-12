package de.uniluebeck.itm.momult;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.location.LocationManager;
import android.util.Log;

/*
 * -----------------------------------------------------------------------------------
 * !!! LAB EXERCISE !!!
 * -----------------------------------------------------------------------------------	
 * 
 * 		TODO 6.7 Complete ProximityIntentReceiver class which will receive the intents when the location is near to a POI.
 * 			TODO 6.7.1. Complete the createNotification method which customize the notification.
 * 			TODO 6.7.2. Review and complete the onReceive method which does the notification once received the intent.
 */

//===================================================================================
// *** YOUR CODE HERE ***	
//===================================================================================
public class ProximityIntentReceiver extends BroadcastReceiver
{
  private static final int NOTIFICATION_ID = 1000;

  @Override
  public void onReceive(Context context, Intent intent)
  {

    // Key used for the Bundle extra holding a boolean indicating whether a proximity
    // alert is entering (true) or exiting (false).
    String key = LocationManager.KEY_PROXIMITY_ENTERING;

    Boolean entering = intent.getBooleanExtra(key, false);

    if (entering)
    {
      // logging
      Log.d(getClass().getSimpleName(), "entering");
    }
    else
    {
      // logging
      Log.d(getClass().getSimpleName(), "exiting");
    }


    // Create a notification manager
    NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

    // Get bending intent
    PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, null, 0);


    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 			TODO 6.7.2. Review and complete the onReceive method which does the notification once received the intent.
     * 				TODO 6.7.2.1 Create a notification by calling the createNotification method
     * 				TODO 6.7.2.2. Set the setLatestEventInfo to your message
     * 					Hint: setLatestEventInfo(context, "Notification title", "Notification message", pendingIntent)
     * 				TODO 6.7.2.3. Fire the notification using the notify method 
     * 					Hint: notify(NOTIFICATION_ID, YourNotification);
     */

    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================
  }

  private Notification createNotification()
  {
    Notification notification = new Notification();

    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     *	TODO 6.7.1. Complete the createNotification method which customize the notification according to the following
     *		TODO 6.7.1.1. Set the notification icon property to ic_menu_notifications.png in the resources folder.
     *		TODO 6.7.1.2. Set the notification when property to current time using System.currentTimeMillis()
     *		TODO 6.7.1.3. Set the notification flag to both FLAG_AUTO_CANCEL and FLAG_SHOW_LIGHTS using
     *                  (notification.flags |= Notification.The_Needed_Flag)
     *		TODO 6.7.1.4. Set the notification defaults to both DEFAULT_VIBRATE and DEFAULT_LIGHTS using
     *                  (notification.defaults |= Notification.The_Needed_Flag)
     *		TODO 6.7.1.5. Set the notification led color to white 
     *			Hint: Simply set the ledARGB property to the needed color. Use Color.YourColor.
     *		TODO 6.7.1.6. Set the notification led flashing time using both ledOnMS and ledOffMS, by setting both to 1500 millsec.
     */

    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================

    return notification;
  }
}
