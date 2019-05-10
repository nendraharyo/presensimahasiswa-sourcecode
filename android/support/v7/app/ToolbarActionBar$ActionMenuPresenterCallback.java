package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.widget.DecorToolbar;
import android.view.Window.Callback;

final class ToolbarActionBar$ActionMenuPresenterCallback
  implements MenuPresenter.Callback
{
  private boolean mClosingActionMenu;
  
  ToolbarActionBar$ActionMenuPresenterCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    boolean bool = this.mClosingActionMenu;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.mClosingActionMenu = bool;
      this.this$0.mDecorToolbar.dismissPopupMenus();
      Window.Callback localCallback = this.this$0.mWindowCallback;
      if (localCallback != null)
      {
        localCallback = this.this$0.mWindowCallback;
        int i = 108;
        localCallback.onPanelClosed(i, paramMenuBuilder);
      }
      bool = false;
      localCallback = null;
      this.mClosingActionMenu = false;
    }
  }
  
  public boolean onOpenSubMenu(MenuBuilder paramMenuBuilder)
  {
    Window.Callback localCallback = this.this$0.mWindowCallback;
    boolean bool;
    if (localCallback != null)
    {
      localCallback = this.this$0.mWindowCallback;
      int i = 108;
      localCallback.onMenuOpened(i, paramMenuBuilder);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCallback = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ToolbarActionBar$ActionMenuPresenterCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */