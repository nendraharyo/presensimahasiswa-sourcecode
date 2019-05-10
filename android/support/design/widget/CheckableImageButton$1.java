package android.support.design.widget;

import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class CheckableImageButton$1
  extends a
{
  CheckableImageButton$1(CheckableImageButton paramCheckableImageButton) {}
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    boolean bool = this.a.isChecked();
    paramAccessibilityEvent.setChecked(bool);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    paramb.a(true);
    boolean bool = this.a.isChecked();
    paramb.b(bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\CheckableImageButton$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */