package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

class a$a
  extends a.b
{
  public c a(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView)
  {
    AccessibilityNodeProvider localAccessibilityNodeProvider = paramAccessibilityDelegate.getAccessibilityNodeProvider(paramView);
    c localc;
    if (localAccessibilityNodeProvider != null)
    {
      localc = new android/support/v4/view/a/c;
      localc.<init>(localAccessibilityNodeProvider);
    }
    for (;;)
    {
      return localc;
      localc = null;
    }
  }
  
  public View.AccessibilityDelegate a(a parama)
  {
    a.a.1 local1 = new android/support/v4/view/a$a$1;
    local1.<init>(this, parama);
    return local1;
  }
  
  public boolean a(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView, int paramInt, Bundle paramBundle)
  {
    return paramAccessibilityDelegate.performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */