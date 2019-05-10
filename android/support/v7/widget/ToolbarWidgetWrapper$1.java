package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.ActionMenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

class ToolbarWidgetWrapper$1
  implements View.OnClickListener
{
  final ActionMenuItem mNavItem;
  
  ToolbarWidgetWrapper$1(ToolbarWidgetWrapper paramToolbarWidgetWrapper)
  {
    ActionMenuItem localActionMenuItem = new android/support/v7/view/menu/ActionMenuItem;
    Context localContext = this.this$0.mToolbar.getContext();
    CharSequence localCharSequence = this.this$0.mTitle;
    localActionMenuItem.<init>(localContext, 0, 16908332, 0, 0, localCharSequence);
    this.mNavItem = localActionMenuItem;
  }
  
  public void onClick(View paramView)
  {
    Object localObject = this.this$0.mWindowCallback;
    if (localObject != null)
    {
      localObject = this.this$0;
      boolean bool = ((ToolbarWidgetWrapper)localObject).mMenuPrepared;
      if (bool)
      {
        localObject = this.this$0.mWindowCallback;
        ActionMenuItem localActionMenuItem = this.mNavItem;
        ((Window.Callback)localObject).onMenuItemSelected(0, localActionMenuItem);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ToolbarWidgetWrapper$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */