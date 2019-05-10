package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.view.MenuItem;

class PopupMenu$1
  implements MenuBuilder.Callback
{
  PopupMenu$1(PopupMenu paramPopupMenu) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    PopupMenu.OnMenuItemClickListener localOnMenuItemClickListener = this.this$0.mMenuItemClickListener;
    boolean bool;
    if (localOnMenuItemClickListener != null)
    {
      localOnMenuItemClickListener = this.this$0.mMenuItemClickListener;
      bool = localOnMenuItemClickListener.onMenuItemClick(paramMenuItem);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOnMenuItemClickListener = null;
    }
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\PopupMenu$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */