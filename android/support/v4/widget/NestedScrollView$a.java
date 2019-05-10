package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.d;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

class NestedScrollView$a
  extends a
{
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramView = (NestedScrollView)paramView;
    String str = ScrollView.class.getName();
    paramAccessibilityEvent.setClassName(str);
    int i = paramView.getScrollRange();
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      paramAccessibilityEvent.setScrollable(i);
      int j = paramView.getScrollX();
      paramAccessibilityEvent.setScrollX(j);
      j = paramView.getScrollY();
      paramAccessibilityEvent.setScrollY(j);
      j = paramView.getScrollX();
      d.a(paramAccessibilityEvent, j);
      j = paramView.getScrollRange();
      d.b(paramAccessibilityEvent, j);
      return;
      j = 0;
      str = null;
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    paramView = (NestedScrollView)paramView;
    String str = ScrollView.class.getName();
    paramb.b(str);
    boolean bool = paramView.isEnabled();
    if (bool)
    {
      int i = paramView.getScrollRange();
      if (i > 0)
      {
        paramb.k(true);
        int j = paramView.getScrollY();
        if (j > 0)
        {
          j = 8192;
          paramb.a(j);
        }
        j = paramView.getScrollY();
        if (j < i)
        {
          i = 4096;
          paramb.a(i);
        }
      }
    }
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool1 = true;
    boolean bool2 = super.performAccessibilityAction(paramView, paramInt, paramBundle);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      paramView = (NestedScrollView)paramView;
      bool2 = paramView.isEnabled();
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        int i;
        int j;
        switch (paramInt)
        {
        default: 
          bool1 = false;
          break;
        case 4096: 
          i = paramView.getHeight();
          j = paramView.getPaddingBottom();
          i -= j;
          j = paramView.getPaddingTop();
          i -= j;
          j = paramView.getScrollY();
          i += j;
          j = paramView.getScrollRange();
          i = Math.min(i, j);
          j = paramView.getScrollY();
          if (i != j) {
            paramView.c(0, i);
          } else {
            bool1 = false;
          }
          break;
        case 8192: 
          i = paramView.getHeight();
          j = paramView.getPaddingBottom();
          i -= j;
          j = paramView.getPaddingTop();
          i -= j;
          i = Math.max(paramView.getScrollY() - i, 0);
          j = paramView.getScrollY();
          if (i != j) {
            paramView.c(0, i);
          } else {
            bool1 = false;
          }
          break;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\NestedScrollView$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */