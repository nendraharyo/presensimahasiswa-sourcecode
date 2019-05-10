package android.support.v7.view.menu;

import android.support.v4.view.b.b;

class MenuItemImpl$1
  implements b.b
{
  MenuItemImpl$1(MenuItemImpl paramMenuItemImpl) {}
  
  public void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    MenuBuilder localMenuBuilder = this.this$0.mMenu;
    MenuItemImpl localMenuItemImpl = this.this$0;
    localMenuBuilder.onItemVisibleChanged(localMenuItemImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */