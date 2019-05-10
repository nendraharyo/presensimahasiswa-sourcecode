package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.view.Window.Callback;

final class AppCompatDelegateImplV9$PanelMenuPresenterCallback
  implements MenuPresenter.Callback
{
  AppCompatDelegateImplV9$PanelMenuPresenterCallback(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9) {}
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    boolean bool1 = true;
    MenuBuilder localMenuBuilder = paramMenuBuilder.getRootMenu();
    boolean bool2;
    Object localObject;
    AppCompatDelegateImplV9 localAppCompatDelegateImplV9;
    if (localMenuBuilder != paramMenuBuilder)
    {
      bool2 = bool1;
      localObject = this.this$0;
      if (bool2) {
        paramMenuBuilder = localMenuBuilder;
      }
      localObject = ((AppCompatDelegateImplV9)localObject).findMenuPanel(paramMenuBuilder);
      if (localObject != null)
      {
        if (!bool2) {
          break label97;
        }
        localAppCompatDelegateImplV9 = this.this$0;
        int i = ((AppCompatDelegateImplV9.PanelFeatureState)localObject).featureId;
        localAppCompatDelegateImplV9.callOnPanelClosed(i, (AppCompatDelegateImplV9.PanelFeatureState)localObject, localMenuBuilder);
        localAppCompatDelegateImplV9 = this.this$0;
        localAppCompatDelegateImplV9.closePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject, bool1);
      }
    }
    for (;;)
    {
      return;
      bool2 = false;
      localAppCompatDelegateImplV9 = null;
      break;
      label97:
      localAppCompatDelegateImplV9 = this.this$0;
      localAppCompatDelegateImplV9.closePanel((AppCompatDelegateImplV9.PanelFeatureState)localObject, paramBoolean);
    }
  }
  
  public boolean onOpenSubMenu(MenuBuilder paramMenuBuilder)
  {
    if (paramMenuBuilder == null)
    {
      Object localObject = this.this$0;
      boolean bool1 = ((AppCompatDelegateImplV9)localObject).mHasActionBar;
      if (bool1)
      {
        localObject = this.this$0.getWindowCallback();
        if (localObject != null)
        {
          AppCompatDelegateImplV9 localAppCompatDelegateImplV9 = this.this$0;
          boolean bool2 = localAppCompatDelegateImplV9.isDestroyed();
          if (!bool2)
          {
            int i = 108;
            ((Window.Callback)localObject).onMenuOpened(i, paramMenuBuilder);
          }
        }
      }
    }
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$PanelMenuPresenterCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */