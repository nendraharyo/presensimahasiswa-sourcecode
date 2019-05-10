package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class MenuItemWrapperICS$OnActionExpandListenerWrapper
  extends BaseWrapper
  implements MenuItem.OnActionExpandListener
{
  MenuItemWrapperICS$OnActionExpandListenerWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    super(paramOnActionExpandListener);
  }
  
  public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    MenuItem.OnActionExpandListener localOnActionExpandListener = (MenuItem.OnActionExpandListener)this.mWrappedObject;
    MenuItem localMenuItem = this.this$0.getMenuItemWrapper(paramMenuItem);
    return localOnActionExpandListener.onMenuItemActionCollapse(localMenuItem);
  }
  
  public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    MenuItem.OnActionExpandListener localOnActionExpandListener = (MenuItem.OnActionExpandListener)this.mWrappedObject;
    MenuItem localMenuItem = this.this$0.getMenuItemWrapper(paramMenuItem);
    return localOnActionExpandListener.onMenuItemActionExpand(localMenuItem);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemWrapperICS$OnActionExpandListenerWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */