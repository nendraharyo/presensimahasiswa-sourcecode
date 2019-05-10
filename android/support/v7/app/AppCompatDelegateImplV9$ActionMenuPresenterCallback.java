package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.view.Window.Callback;

final class AppCompatDelegateImplV9$ActionMenuPresenterCallback
  implements MenuPresenter.Callback
{
  AppCompatDelegateImplV9$ActionMenuPresenterCallback(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9) {}
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    this.this$0.checkCloseActionMenu(paramMenuBuilder);
  }
  
  public boolean onOpenSubMenu(MenuBuilder paramMenuBuilder)
  {
    Window.Callback localCallback = this.this$0.getWindowCallback();
    if (localCallback != null)
    {
      int i = 108;
      localCallback.onMenuOpened(i, paramMenuBuilder);
    }
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$ActionMenuPresenterCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */