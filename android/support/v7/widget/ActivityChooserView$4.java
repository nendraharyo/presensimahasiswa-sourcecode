package android.support.v7.widget;

import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

class ActivityChooserView$4
  extends ForwardingListener
{
  ActivityChooserView$4(ActivityChooserView paramActivityChooserView, View paramView)
  {
    super(paramView);
  }
  
  public ShowableListMenu getPopup()
  {
    return this.this$0.getListPopupWindow();
  }
  
  protected boolean onForwardingStarted()
  {
    this.this$0.showPopup();
    return true;
  }
  
  protected boolean onForwardingStopped()
  {
    this.this$0.dismissPopup();
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserView$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */