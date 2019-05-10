package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class MenuItemWrapperICS$OnMenuItemClickListenerWrapper
  extends BaseWrapper
  implements MenuItem.OnMenuItemClickListener
{
  MenuItemWrapperICS$OnMenuItemClickListenerWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    super(paramOnMenuItemClickListener);
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    MenuItem.OnMenuItemClickListener localOnMenuItemClickListener = (MenuItem.OnMenuItemClickListener)this.mWrappedObject;
    MenuItem localMenuItem = this.this$0.getMenuItemWrapper(paramMenuItem);
    return localOnMenuItemClickListener.onMenuItemClick(localMenuItem);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemWrapperICS$OnMenuItemClickListenerWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */