package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

public class RecyclerView$SmoothScroller$Action
{
  public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
  private boolean mChanged = false;
  private int mConsecutiveUpdates = 0;
  private int mDuration;
  private int mDx;
  private int mDy;
  private Interpolator mInterpolator;
  private int mJumpToPosition = -1;
  
  public RecyclerView$SmoothScroller$Action(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, -1 << -1, null);
  }
  
  public RecyclerView$SmoothScroller$Action(int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramInt1, paramInt2, paramInt3, null);
  }
  
  public RecyclerView$SmoothScroller$Action(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    this.mDx = paramInt1;
    this.mDy = paramInt2;
    this.mDuration = paramInt3;
    this.mInterpolator = paramInterpolator;
  }
  
  private void validate()
  {
    int i = 1;
    Object localObject = this.mInterpolator;
    if (localObject != null)
    {
      j = this.mDuration;
      if (j < i)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("If you provide an interpolator, you must set a positive duration");
        throw ((Throwable)localObject);
      }
    }
    int j = this.mDuration;
    if (j < i)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Scroll duration must be a positive number");
      throw ((Throwable)localObject);
    }
  }
  
  public int getDuration()
  {
    return this.mDuration;
  }
  
  public int getDx()
  {
    return this.mDx;
  }
  
  public int getDy()
  {
    return this.mDy;
  }
  
  public Interpolator getInterpolator()
  {
    return this.mInterpolator;
  }
  
  boolean hasJumpTarget()
  {
    int i = this.mJumpToPosition;
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void jumpTo(int paramInt)
  {
    this.mJumpToPosition = paramInt;
  }
  
  void runIfNecessary(RecyclerView paramRecyclerView)
  {
    int i = this.mJumpToPosition;
    int k;
    if (i >= 0)
    {
      i = this.mJumpToPosition;
      k = -1;
      this.mJumpToPosition = k;
      paramRecyclerView.jumpToPositionForSmoothScroller(i);
      this.mChanged = false;
    }
    for (;;)
    {
      return;
      boolean bool = this.mChanged;
      if (bool)
      {
        validate();
        Object localObject = this.mInterpolator;
        int j;
        int m;
        if (localObject == null)
        {
          j = this.mDuration;
          k = -1 << -1;
          if (j == k)
          {
            localObject = paramRecyclerView.mViewFlinger;
            k = this.mDx;
            m = this.mDy;
            ((RecyclerView.ViewFlinger)localObject).smoothScrollBy(k, m);
          }
        }
        for (;;)
        {
          j = this.mConsecutiveUpdates + 1;
          this.mConsecutiveUpdates = j;
          j = this.mConsecutiveUpdates;
          k = 10;
          if (j > k)
          {
            localObject = "RecyclerView";
            String str = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary";
            Log.e((String)localObject, str);
          }
          this.mChanged = false;
          break;
          localObject = paramRecyclerView.mViewFlinger;
          k = this.mDx;
          m = this.mDy;
          int n = this.mDuration;
          ((RecyclerView.ViewFlinger)localObject).smoothScrollBy(k, m, n);
          continue;
          localObject = paramRecyclerView.mViewFlinger;
          k = this.mDx;
          m = this.mDy;
          n = this.mDuration;
          Interpolator localInterpolator = this.mInterpolator;
          ((RecyclerView.ViewFlinger)localObject).smoothScrollBy(k, m, n, localInterpolator);
        }
      }
      this.mConsecutiveUpdates = 0;
    }
  }
  
  public void setDuration(int paramInt)
  {
    this.mChanged = true;
    this.mDuration = paramInt;
  }
  
  public void setDx(int paramInt)
  {
    this.mChanged = true;
    this.mDx = paramInt;
  }
  
  public void setDy(int paramInt)
  {
    this.mChanged = true;
    this.mDy = paramInt;
  }
  
  public void setInterpolator(Interpolator paramInterpolator)
  {
    this.mChanged = true;
    this.mInterpolator = paramInterpolator;
  }
  
  public void update(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    this.mDx = paramInt1;
    this.mDy = paramInt2;
    this.mDuration = paramInt3;
    this.mInterpolator = paramInterpolator;
    this.mChanged = true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$SmoothScroller$Action.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */