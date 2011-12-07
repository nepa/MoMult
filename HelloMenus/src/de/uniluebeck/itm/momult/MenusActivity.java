package de.uniluebeck.itm.momult;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 ************************************* !!! LAB EXERCISE !!!  *************************************
 * TODO 2.1 Complete the helper method CreateMenu.
 * TODO 2.2 Complete the helper method MenuChoice.
 * TODO 2.3 Review onCreateOptionsMenu() and onOptionsItemSelected() methods. To enable Options Menu
 *          both onCreateOptionsMenu() and onOptionsItemSelected() methods should be overridden.
 * 
 * 		Hints:
 * 			- The onCreateOptionsMenu() method is called when the MENU button is pressed. In this event,
 *        you would call the CreateMenu() helper method to display the options menu. When a menu item
 *        is selected, the onOptionsItemSelected() method will be called. In this case, you call the
 *        MenuChoice() method to display the menu item selected (and do whatever you need to do).
 * 
 *  TODO 2.4 Now run and test with the Option menu
 * 
 *  	Hints:
 *  		- Press menu button to see the menu you have created. Observe the icons displayed for menu
 *        item 1, 2 and 3. Also, if the options menu has more than six items, there will be a More
 *        menu item to represent the additional menu items.
 * 
 * TODO 2.5 Complete onCreate method to associate a context menu with the button. To do this you need
 *          to add the setOnCreateContextMenuListener() method of that particular view.
 * TODO 2.6 Review onContextItemSelected and onCreateContextMenu methods. Both needed to be overridden
 *          to response to context menu.
 * TODO 2.7 Now run and test with the Context menu.
 * 
 *  	Hints:
 *  		- Long press the button to see the context menu you have created.
 */
public class MenusActivity extends Activity
{
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.menu);

    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 	TODO 2.5 Define your button and associate it with a context menu. To do this you need to
     *           add the setOnCreateContextMenuListener() method of that particular view.
     */

    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================
    Button button = (Button)this.findViewById(R.id.btn1);
    button.setOnCreateContextMenuListener(this);
  }

  /*
   * The CreateMenu() method creates a list of menu items and modifies the behavior of each menu item.
   * 
   * The parameters for the add() method are: groupid, itemid, order, and title. The setAlphabeticShortcut()
   * method assigns a keyboard shortcut to the menu item so that when the user presses a specific key, the
   * menu item would be selected. The setIcon() method assigns an icon to the menu item.
   */
  private void CreateMenu(Menu menu)
  {
    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 	TODO 2.1 Complete the helper method CreateMenu
     * 		- Set the menu to the Qwerty. Control whether the menu should be running in qwerty mode
     *      (alphabetic shortcuts) or 12-key mode (numeric shortcuts).
     *		- Add 4 items to the menu and set a shortcut and an icon for every menu item.
     * 
     *			Hints:
     *				- Use menu.add method
     *		- Add another 3 items without shortcuts and icons
     */

    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================
    menu.setQwertyMode(true);

    MenuItem item1 = menu.add(0, 0, 0, "Open");
    item1.setAlphabeticShortcut('o');
    item1.setIcon(R.drawable.icon);

    MenuItem item2 = menu.add(0, 1, 1, "Save");
    item2.setAlphabeticShortcut('s');
    item2.setIcon(R.drawable.icon);

    MenuItem item3 = menu.add(0, 2, 2, "Delete");
    item3.setAlphabeticShortcut('d');
    item3.setIcon(R.drawable.icon);

    MenuItem item4 = menu.add(0, 3, 3, "Exit");
    item4.setAlphabeticShortcut('e');
    item4.setIcon(R.drawable.icon);

    menu.add(0, 4, 4, "Foo");
    menu.add(0, 5, 5, "Bar");
    menu.add(0, 6, 6, "Foobar");
    //===================================================================================
  }

  /**
   * The MenuChoice() method displays the selected menu item using the Toast class.
   */
  private boolean MenuChoice(MenuItem item)
  {
    /*
     * -----------------------------------------------------------------------------------
     * !!! LAB EXERCISE !!!
     * -----------------------------------------------------------------------------------	
     * 	TODO 2.2 Complete the helper method MenuChoice
     * 		- With a toast message display a message to the user indicating the menu item
     *      that has been pressed and return true if an item has been pressed.
     */

    //===================================================================================
    // *** YOUR CODE HERE ***	
    //===================================================================================       
    this.DisplayToast("You pressed item ID " + item.getItemId() + ": " + item.getTitle().toString());

    return true;
    //===================================================================================        
  }

  /*
   * The onCreateOptionsMenu() method is called when the MENU button is pressed. In this event,
   * you would call the CreateMenu() helper method to display the options menu. 
   */
  //---only created once---
  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    super.onCreateOptionsMenu(menu);
    CreateMenu(menu);

    return true;
  }

  /*
   * When a menu item is selected, the onOptionsItemSelected() method will be called. In this case,
   * you call the MenuChoice() method to display the menu item selected (and do whatever you need
   * to do).
   */
  @Override
  public boolean onOptionsItemSelected(MenuItem item)
  {
    return MenuChoice(item);
  }

  @Override
  public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo menuInfo)
  {
    super.onCreateContextMenu(menu, view, menuInfo);
    CreateMenu(menu);
  }

  @Override
  public boolean onContextItemSelected(MenuItem item)
  {
    return MenuChoice(item);
  }

  /**
   * Helper methos copied from MyBasicViewsActivity class.
   * 
   * @param msg Message to display
   */
  private void DisplayToast(String msg)
  {
    Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
  }
}