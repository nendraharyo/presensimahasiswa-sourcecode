package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.a.b;
import android.support.v4.view.a.c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class a
{
  private static final View.AccessibilityDelegate DEFAULT_DELEGATE;
  private static final a.b IMPL;
  final View.AccessibilityDelegate mBridge;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/a$a;
      ((a.a)localObject).<init>();
    }
    for (IMPL = (a.b)localObject;; IMPL = (a.b)localObject)
    {
      localObject = new android/view/View$AccessibilityDelegate;
      ((View.AccessibilityDelegate)localObject).<init>();
      DEFAULT_DELEGATE = (View.AccessibilityDelegate)localObject;
      return;
      localObject = new android/support/v4/view/a$b;
      ((a.b)localObject).<init>();
    }
  }
  
  public a()
  {
    View.AccessibilityDelegate localAccessibilityDelegate = IMPL.a(this);
    this.mBridge = localAccessibilityDelegate;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public c getAccessibilityNodeProvider(View paramView)
  {
    a.b localb = IMPL;
    View.AccessibilityDelegate localAccessibilityDelegate = DEFAULT_DELEGATE;
    return localb.a(localAccessibilityDelegate, paramView);
  }
  
  View.AccessibilityDelegate getBridge()
  {
    return this.mBridge;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    DEFAULT_DELEGATE.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    View.AccessibilityDelegate localAccessibilityDelegate = DEFAULT_DELEGATE;
    AccessibilityNodeInfo localAccessibilityNodeInfo = paramb.a();
    localAccessibilityDelegate.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfo);
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    DEFAULT_DELEGATE.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    a.b localb = IMPL;
    View.AccessibilityDelegate localAccessibilityDelegate = DEFAULT_DELEGATE;
    return localb.a(localAccessibilityDelegate, paramView, paramInt, paramBundle);
  }
  
  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    DEFAULT_DELEGATE.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */