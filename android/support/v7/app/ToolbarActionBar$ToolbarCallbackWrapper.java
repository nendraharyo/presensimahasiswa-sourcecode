package android.support.v7.app;

import android.content.Context;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.widget.DecorToolbar;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

class ToolbarActionBar$ToolbarCallbackWrapper
  extends WindowCallbackWrapper
{
  public ToolbarActionBar$ToolbarCallbackWrapper(ToolbarActionBar paramToolbarActionBar, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    View localView;
    if (paramInt == 0)
    {
      localView = new android/view/View;
      Context localContext = this.this$0.mDecorToolbar.getContext();
      localView.<init>(localContext);
    }
    for (;;)
    {
      return localView;
      localView = super.onCreatePanelView(paramInt);
    }
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool1 = super.onPreparePanel(paramInt, paramView, paramMenu);
    if (bool1)
    {
      ToolbarActionBar localToolbarActionBar = this.this$0;
      boolean bool2 = localToolbarActionBar.mToolbarMenuPrepared;
      if (!bool2)
      {
        this.this$0.mDecorToolbar.setMenuPrepared();
        localToolbarActionBar = this.this$0;
        boolean bool3 = true;
        localToolbarActionBar.mToolbarMenuPrepared = bool3;
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ToolbarActionBar$ToolbarCallbackWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */