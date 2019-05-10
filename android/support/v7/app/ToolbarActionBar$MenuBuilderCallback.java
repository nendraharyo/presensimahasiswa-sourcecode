package android.support.v7.app;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.widget.DecorToolbar;
import android.view.MenuItem;
import android.view.Window.Callback;

final class ToolbarActionBar$MenuBuilderCallback
  implements MenuBuilder.Callback
{
  ToolbarActionBar$MenuBuilderCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    int i = 108;
    Object localObject = this.this$0.mWindowCallback;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.this$0.mDecorToolbar;
      bool = ((DecorToolbar)localObject).isOverflowMenuShowing();
      if (!bool) {
        break label53;
      }
      localObject = this.this$0.mWindowCallback;
      ((Window.Callback)localObject).onPanelClosed(i, paramMenuBuilder);
    }
    for (;;)
    {
      return;
      label53:
      localObject = this.this$0.mWindowCallback;
      bool = ((Window.Callback)localObject).onPreparePanel(0, null, paramMenuBuilder);
      if (bool)
      {
        localObject = this.this$0.mWindowCallback;
        ((Window.Callback)localObject).onMenuOpened(i, paramMenuBuilder);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ToolbarActionBar$MenuBuilderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */