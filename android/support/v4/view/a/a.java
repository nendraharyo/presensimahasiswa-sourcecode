package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a
{
  public static int a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {}
    for (i = paramAccessibilityEvent.getContentChangeTypes();; i = 0) {
      return i;
    }
  }
  
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {
      paramAccessibilityEvent.setContentChangeTypes(paramInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */