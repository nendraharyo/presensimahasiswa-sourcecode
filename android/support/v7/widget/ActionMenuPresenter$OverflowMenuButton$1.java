package android.support.v7.widget;

import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

class ActionMenuPresenter$OverflowMenuButton$1
  extends ForwardingListener
{
  ActionMenuPresenter$OverflowMenuButton$1(ActionMenuPresenter.OverflowMenuButton paramOverflowMenuButton, View paramView, ActionMenuPresenter paramActionMenuPresenter)
  {
    super(paramView);
  }
  
  public ShowableListMenu getPopup()
  {
    Object localObject = this.this$1.this$0.mOverflowPopup;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.this$1.this$0.mOverflowPopup.getPopup()) {
      return (ShowableListMenu)localObject;
    }
  }
  
  public boolean onForwardingStarted()
  {
    this.this$1.this$0.showOverflowMenu();
    return true;
  }
  
  public boolean onForwardingStopped()
  {
    Object localObject = this.this$1.this$0.mPostedOpenRunnable;
    boolean bool;
    if (localObject != null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = this.this$1.this$0;
      ((ActionMenuPresenter)localObject).hideOverflowMenu();
      bool = true;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuPresenter$OverflowMenuButton$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */