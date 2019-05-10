package android.support.v7.widget;

import android.view.MenuItem;

class Toolbar$1
  implements ActionMenuView.OnMenuItemClickListener
{
  Toolbar$1(Toolbar paramToolbar) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Toolbar.OnMenuItemClickListener localOnMenuItemClickListener = this.this$0.mOnMenuItemClickListener;
    boolean bool;
    if (localOnMenuItemClickListener != null)
    {
      localOnMenuItemClickListener = this.this$0.mOnMenuItemClickListener;
      bool = localOnMenuItemClickListener.onMenuItemClick(paramMenuItem);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOnMenuItemClickListener = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\Toolbar$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */