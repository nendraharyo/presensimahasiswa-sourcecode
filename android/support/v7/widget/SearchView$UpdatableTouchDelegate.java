package android.support.v7.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

class SearchView$UpdatableTouchDelegate
  extends TouchDelegate
{
  private final Rect mActualBounds;
  private boolean mDelegateTargeted;
  private final View mDelegateView;
  private final int mSlop;
  private final Rect mSlopBounds;
  private final Rect mTargetBounds;
  
  public SearchView$UpdatableTouchDelegate(Rect paramRect1, Rect paramRect2, View paramView)
  {
    super(paramRect1, paramView);
    int i = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.mSlop = i;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mTargetBounds = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mSlopBounds = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mActualBounds = localRect;
    setBounds(paramRect1, paramRect2);
    this.mDelegateView = paramView;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    float f2 = 0.0F;
    Object localObject1 = null;
    int m = (int)paramMotionEvent.getX();
    float f3 = paramMotionEvent.getY();
    int n = (int)f3;
    int i1 = paramMotionEvent.getAction();
    Rect localRect1;
    label81:
    Object localObject2;
    switch (i1)
    {
    default: 
      i1 = 0;
      localRect1 = null;
      f3 = 0.0F;
      if (i1 != 0)
      {
        if (i == 0) {
          break label266;
        }
        localObject1 = this.mActualBounds;
        bool1 = ((Rect)localObject1).contains(m, n);
        if (bool1) {
          break label266;
        }
        localObject1 = this.mDelegateView;
        int j = ((View)localObject1).getWidth() / 2;
        f2 = j;
        localObject2 = this.mDelegateView;
        i = ((View)localObject2).getHeight() / 2;
        f1 = i;
        paramMotionEvent.setLocation(f2, f1);
      }
      break;
    }
    for (;;)
    {
      localObject1 = this.mDelegateView;
      boolean bool2 = ((View)localObject1).dispatchTouchEvent(paramMotionEvent);
      return bool2;
      localRect1 = this.mTargetBounds;
      boolean bool3 = localRect1.contains(m, n);
      if (!bool3) {
        break;
      }
      this.mDelegateTargeted = i;
      bool3 = i;
      f3 = f1;
      break label81;
      bool3 = this.mDelegateTargeted;
      if (!bool3) {
        break label81;
      }
      Rect localRect2 = this.mSlopBounds;
      boolean bool4 = localRect2.contains(m, n);
      if (bool4) {
        break label81;
      }
      i = 0;
      localObject2 = null;
      f1 = 0.0F;
      break label81;
      bool3 = this.mDelegateTargeted;
      this.mDelegateTargeted = false;
      break label81;
      label266:
      localObject1 = this.mActualBounds;
      int k = ((Rect)localObject1).left;
      k = m - k;
      f2 = k;
      localObject2 = this.mActualBounds;
      i = ((Rect)localObject2).top;
      i = n - i;
      f1 = i;
      paramMotionEvent.setLocation(f2, f1);
    }
  }
  
  public void setBounds(Rect paramRect1, Rect paramRect2)
  {
    this.mTargetBounds.set(paramRect1);
    this.mSlopBounds.set(paramRect1);
    Rect localRect = this.mSlopBounds;
    int i = -this.mSlop;
    int j = -this.mSlop;
    localRect.inset(i, j);
    this.mActualBounds.set(paramRect2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$UpdatableTouchDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */