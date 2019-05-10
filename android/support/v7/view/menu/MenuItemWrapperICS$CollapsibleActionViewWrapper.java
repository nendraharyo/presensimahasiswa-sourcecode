package android.support.v7.view.menu;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

class MenuItemWrapperICS$CollapsibleActionViewWrapper
  extends FrameLayout
  implements android.support.v7.view.CollapsibleActionView
{
  final android.view.CollapsibleActionView mWrappedView;
  
  MenuItemWrapperICS$CollapsibleActionViewWrapper(View paramView)
  {
    super((Context)localObject);
    localObject = paramView;
    localObject = (android.view.CollapsibleActionView)paramView;
    this.mWrappedView = ((android.view.CollapsibleActionView)localObject);
    addView(paramView);
  }
  
  View getWrappedView()
  {
    return (View)this.mWrappedView;
  }
  
  public void onActionViewCollapsed()
  {
    this.mWrappedView.onActionViewCollapsed();
  }
  
  public void onActionViewExpanded()
  {
    this.mWrappedView.onActionViewExpanded();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemWrapperICS$CollapsibleActionViewWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */