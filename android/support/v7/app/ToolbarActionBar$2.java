package android.support.v7.app;

import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.Window.Callback;

class ToolbarActionBar$2
  implements Toolbar.OnMenuItemClickListener
{
  ToolbarActionBar$2(ToolbarActionBar paramToolbarActionBar) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return this.this$0.mWindowCallback.onMenuItemSelected(0, paramMenuItem);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ToolbarActionBar$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */