package android.support.v7.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class AppCompatSpinner$DropdownPopup$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  AppCompatSpinner$DropdownPopup$2(AppCompatSpinner.DropdownPopup paramDropdownPopup) {}
  
  public void onGlobalLayout()
  {
    AppCompatSpinner.DropdownPopup localDropdownPopup = this.this$1;
    AppCompatSpinner localAppCompatSpinner = this.this$1.this$0;
    boolean bool = localDropdownPopup.isVisibleToUser(localAppCompatSpinner);
    if (!bool)
    {
      localDropdownPopup = this.this$1;
      localDropdownPopup.dismiss();
    }
    for (;;)
    {
      return;
      this.this$1.computeContentWidth();
      localDropdownPopup = this.this$1;
      AppCompatSpinner.DropdownPopup.access$301(localDropdownPopup);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatSpinner$DropdownPopup$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */