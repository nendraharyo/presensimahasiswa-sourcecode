package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.b;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class MenuItemWrapperICS$ActionProviderWrapper
  extends b
{
  final ActionProvider mInner;
  
  public MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramContext);
    this.mInner = paramActionProvider;
  }
  
  public boolean hasSubMenu()
  {
    return this.mInner.hasSubMenu();
  }
  
  public View onCreateActionView()
  {
    return this.mInner.onCreateActionView();
  }
  
  public boolean onPerformDefaultAction()
  {
    return this.mInner.onPerformDefaultAction();
  }
  
  public void onPrepareSubMenu(SubMenu paramSubMenu)
  {
    ActionProvider localActionProvider = this.mInner;
    SubMenu localSubMenu = this.this$0.getSubMenuWrapper(paramSubMenu);
    localActionProvider.onPrepareSubMenu(localSubMenu);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemWrapperICS$ActionProviderWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */