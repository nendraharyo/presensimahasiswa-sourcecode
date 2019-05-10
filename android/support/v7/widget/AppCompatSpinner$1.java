package android.support.v7.widget;

import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

class AppCompatSpinner$1
  extends ForwardingListener
{
  AppCompatSpinner$1(AppCompatSpinner paramAppCompatSpinner, View paramView, AppCompatSpinner.DropdownPopup paramDropdownPopup)
  {
    super(paramView);
  }
  
  public ShowableListMenu getPopup()
  {
    return this.val$popup;
  }
  
  public boolean onForwardingStarted()
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = AppCompatSpinner.access$000(this.this$0);
    boolean bool = localDropdownPopup.isShowing();
    if (!bool)
    {
      localDropdownPopup = AppCompatSpinner.access$000(this.this$0);
      localDropdownPopup.show();
    }
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatSpinner$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */