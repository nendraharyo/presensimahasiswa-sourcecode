package android.support.v7.widget;

import android.support.v4.view.a.b;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;

class ActivityChooserView$3
  extends View.AccessibilityDelegate
{
  ActivityChooserView$3(ActivityChooserView paramActivityChooserView) {}
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfo);
    b.a(paramAccessibilityNodeInfo).m(true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserView$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */