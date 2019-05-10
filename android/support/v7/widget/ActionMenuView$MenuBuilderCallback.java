package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.view.MenuItem;

class ActionMenuView$MenuBuilderCallback
  implements MenuBuilder.Callback
{
  ActionMenuView$MenuBuilderCallback(ActionMenuView paramActionMenuView) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    ActionMenuView.OnMenuItemClickListener localOnMenuItemClickListener = this.this$0.mOnMenuItemClickListener;
    boolean bool;
    if (localOnMenuItemClickListener != null)
    {
      localOnMenuItemClickListener = this.this$0.mOnMenuItemClickListener;
      bool = localOnMenuItemClickListener.onMenuItemClick(paramMenuItem);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOnMenuItemClickListener = null;
    }
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    MenuBuilder.Callback localCallback = this.this$0.mMenuBuilderCallback;
    if (localCallback != null)
    {
      localCallback = this.this$0.mMenuBuilderCallback;
      localCallback.onMenuModeChange(paramMenuBuilder);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuView$MenuBuilderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */