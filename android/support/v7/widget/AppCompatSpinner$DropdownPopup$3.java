package android.support.v7.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

class AppCompatSpinner$DropdownPopup$3
  implements PopupWindow.OnDismissListener
{
  AppCompatSpinner$DropdownPopup$3(AppCompatSpinner.DropdownPopup paramDropdownPopup, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener) {}
  
  public void onDismiss()
  {
    ViewTreeObserver localViewTreeObserver = this.this$1.this$0.getViewTreeObserver();
    if (localViewTreeObserver != null)
    {
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.val$layoutListener;
      localViewTreeObserver.removeGlobalOnLayoutListener(localOnGlobalLayoutListener);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatSpinner$DropdownPopup$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */