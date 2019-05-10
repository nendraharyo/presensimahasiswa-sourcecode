package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class ForwardingListener
  implements View.OnAttachStateChangeListener, View.OnTouchListener
{
  private int mActivePointerId;
  private Runnable mDisallowIntercept;
  private boolean mForwarding;
  private final int mLongPressTimeout;
  private final float mScaledTouchSlop;
  final View mSrc;
  private final int mTapTimeout;
  private final int[] mTmpLocation;
  private Runnable mTriggerLongPress;
  
  public ForwardingListener(View paramView)
  {
    int[] arrayOfInt = new int[2];
    this.mTmpLocation = arrayOfInt;
    this.mSrc = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    float f = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.mScaledTouchSlop = f;
    int i = ViewConfiguration.getTapTimeout();
    this.mTapTimeout = i;
    i = this.mTapTimeout;
    int j = ViewConfiguration.getLongPressTimeout();
    i = (i + j) / 2;
    this.mLongPressTimeout = i;
  }
  
  private void clearCallbacks()
  {
    Object localObject = this.mTriggerLongPress;
    Runnable localRunnable;
    if (localObject != null)
    {
      localObject = this.mSrc;
      localRunnable = this.mTriggerLongPress;
      ((View)localObject).removeCallbacks(localRunnable);
    }
    localObject = this.mDisallowIntercept;
    if (localObject != null)
    {
      localObject = this.mSrc;
      localRunnable = this.mDisallowIntercept;
      ((View)localObject).removeCallbacks(localRunnable);
    }
  }
  
  private boolean onTouchForwarded(MotionEvent paramMotionEvent)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool1 = false;
    View localView = this.mSrc;
    Object localObject = getPopup();
    boolean bool2;
    if (localObject != null)
    {
      bool2 = ((ShowableListMenu)localObject).isShowing();
      if (bool2) {
        break label42;
      }
    }
    label42:
    do
    {
      do
      {
        return bool1;
        localObject = (DropDownListView)((ShowableListMenu)localObject).getListView();
      } while (localObject == null);
      bool2 = ((DropDownListView)localObject).isShown();
    } while (!bool2);
    MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
    toGlobalMotionEvent(localView, localMotionEvent);
    toLocalMotionEvent((View)localObject, localMotionEvent);
    int k = this.mActivePointerId;
    boolean bool3 = ((DropDownListView)localObject).onForwardedEvent(localMotionEvent, k);
    localMotionEvent.recycle();
    int m = paramMotionEvent.getActionMasked();
    if (m != i)
    {
      int j = 3;
      if (m != j)
      {
        m = i;
        label142:
        if ((!bool3) || (m == 0)) {
          break label171;
        }
        m = i;
      }
    }
    for (;;)
    {
      bool1 = m;
      break;
      m = 0;
      localObject = null;
      break label142;
      label171:
      m = 0;
      localObject = null;
    }
  }
  
  private boolean onTouchObserved(MotionEvent paramMotionEvent)
  {
    int i = 1;
    boolean bool1 = false;
    ViewParent localViewParent = null;
    View localView = this.mSrc;
    boolean bool2 = localView.isEnabled();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      int j = paramMotionEvent.getActionMasked();
      switch (j)
      {
      default: 
        break;
      case 0: 
        i = paramMotionEvent.getPointerId(0);
        this.mActivePointerId = i;
        Object localObject = this.mDisallowIntercept;
        if (localObject == null)
        {
          localObject = new android/support/v7/widget/ForwardingListener$DisallowIntercept;
          ((ForwardingListener.DisallowIntercept)localObject).<init>(this);
          this.mDisallowIntercept = ((Runnable)localObject);
        }
        localObject = this.mDisallowIntercept;
        j = this.mTapTimeout;
        long l = j;
        localView.postDelayed((Runnable)localObject, l);
        localObject = this.mTriggerLongPress;
        if (localObject == null)
        {
          localObject = new android/support/v7/widget/ForwardingListener$TriggerLongPress;
          ((ForwardingListener.TriggerLongPress)localObject).<init>(this);
          this.mTriggerLongPress = ((Runnable)localObject);
        }
        localObject = this.mTriggerLongPress;
        j = this.mLongPressTimeout;
        l = j;
        localView.postDelayed((Runnable)localObject, l);
        break;
      case 2: 
        j = this.mActivePointerId;
        j = paramMotionEvent.findPointerIndex(j);
        if (j >= 0)
        {
          float f1 = paramMotionEvent.getX(j);
          float f2 = paramMotionEvent.getY(j);
          float f3 = this.mScaledTouchSlop;
          boolean bool3 = pointInView(localView, f1, f2, f3);
          if (!bool3)
          {
            clearCallbacks();
            localViewParent = localView.getParent();
            localViewParent.requestDisallowInterceptTouchEvent(i);
            bool1 = i;
          }
        }
        break;
      case 1: 
      case 3: 
        clearCallbacks();
      }
    }
  }
  
  private static boolean pointInView(View paramView, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = -paramFloat3;
    boolean bool1 = paramFloat1 < f;
    boolean bool3;
    if (!bool1)
    {
      f = -paramFloat3;
      bool1 = paramFloat2 < f;
      if (!bool1)
      {
        int i = paramView.getRight();
        int k = paramView.getLeft();
        f = i - k + paramFloat3;
        boolean bool2 = paramFloat1 < f;
        if (bool2)
        {
          int j = paramView.getBottom();
          k = paramView.getTop();
          f = j - k + paramFloat3;
          bool3 = paramFloat2 < f;
          if (bool3) {
            bool3 = true;
          }
        }
      }
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool3;
      bool3 = false;
    }
  }
  
  private boolean toGlobalMotionEvent(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int[] arrayOfInt = this.mTmpLocation;
    paramView.getLocationOnScreen(arrayOfInt);
    float f1 = arrayOfInt[0];
    float f2 = arrayOfInt[bool];
    paramMotionEvent.offsetLocation(f1, f2);
    return bool;
  }
  
  private boolean toLocalMotionEvent(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int[] arrayOfInt = this.mTmpLocation;
    paramView.getLocationOnScreen(arrayOfInt);
    float f1 = -arrayOfInt[0];
    float f2 = -arrayOfInt[bool];
    paramMotionEvent.offsetLocation(f1, f2);
    return bool;
  }
  
  public abstract ShowableListMenu getPopup();
  
  protected boolean onForwardingStarted()
  {
    ShowableListMenu localShowableListMenu = getPopup();
    if (localShowableListMenu != null)
    {
      boolean bool = localShowableListMenu.isShowing();
      if (!bool) {
        localShowableListMenu.show();
      }
    }
    return true;
  }
  
  protected boolean onForwardingStopped()
  {
    ShowableListMenu localShowableListMenu = getPopup();
    if (localShowableListMenu != null)
    {
      boolean bool = localShowableListMenu.isShowing();
      if (bool) {
        localShowableListMenu.dismiss();
      }
    }
    return true;
  }
  
  void onLongPress()
  {
    boolean bool1 = true;
    clearCallbacks();
    View localView = this.mSrc;
    boolean bool2 = localView.isEnabled();
    if (bool2)
    {
      bool2 = localView.isLongClickable();
      if (!bool2) {
        break label30;
      }
    }
    for (;;)
    {
      return;
      label30:
      bool2 = onForwardingStarted();
      if (bool2)
      {
        localView.getParent().requestDisallowInterceptTouchEvent(bool1);
        long l = SystemClock.uptimeMillis();
        int i = 3;
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, i, 0.0F, 0.0F, 0);
        localView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
        this.mForwarding = bool1;
      }
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    boolean bool3 = this.mForwarding;
    MotionEvent localMotionEvent;
    if (bool3)
    {
      bool4 = onTouchForwarded(paramMotionEvent);
      if (!bool4)
      {
        bool4 = onForwardingStopped();
        if (bool4) {}
      }
      else
      {
        bool4 = bool1;
      }
      for (;;)
      {
        this.mForwarding = bool4;
        if ((bool4) || (bool3)) {
          bool2 = bool1;
        }
        return bool2;
        bool4 = false;
        localMotionEvent = null;
      }
    }
    boolean bool4 = onTouchObserved(paramMotionEvent);
    if (bool4)
    {
      bool4 = onForwardingStarted();
      if (!bool4) {}
    }
    for (boolean bool5 = bool1;; bool5 = false)
    {
      if (bool5)
      {
        long l = SystemClock.uptimeMillis();
        int i = 3;
        localMotionEvent = MotionEvent.obtain(l, l, i, 0.0F, 0.0F, 0);
        View localView = this.mSrc;
        localView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
      bool4 = bool5;
      break;
    }
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    this.mForwarding = false;
    int i = -1;
    this.mActivePointerId = i;
    Object localObject = this.mDisallowIntercept;
    if (localObject != null)
    {
      localObject = this.mSrc;
      Runnable localRunnable = this.mDisallowIntercept;
      ((View)localObject).removeCallbacks(localRunnable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ForwardingListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */