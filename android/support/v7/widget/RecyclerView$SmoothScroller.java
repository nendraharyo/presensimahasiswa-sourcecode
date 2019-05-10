package android.support.v7.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

public abstract class RecyclerView$SmoothScroller
{
  private RecyclerView.LayoutManager mLayoutManager;
  private boolean mPendingInitialRun;
  private RecyclerView mRecyclerView;
  private final RecyclerView.SmoothScroller.Action mRecyclingAction;
  private boolean mRunning;
  private int mTargetPosition = -1;
  private View mTargetView;
  
  public RecyclerView$SmoothScroller()
  {
    RecyclerView.SmoothScroller.Action localAction = new android/support/v7/widget/RecyclerView$SmoothScroller$Action;
    localAction.<init>(0, 0);
    this.mRecyclingAction = localAction;
  }
  
  private void onAnimation(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.mRecyclerView;
    boolean bool1 = this.mRunning;
    int j;
    if (bool1)
    {
      i = this.mTargetPosition;
      j = -1;
      if ((i != j) && (localObject1 != null)) {}
    }
    else
    {
      stop();
    }
    int i = 0;
    this.mPendingInitialRun = false;
    Object localObject2 = this.mTargetView;
    Object localObject3;
    boolean bool2;
    if (localObject2 != null)
    {
      localObject2 = this.mTargetView;
      i = getChildPosition((View)localObject2);
      j = this.mTargetPosition;
      if (i == j)
      {
        localObject2 = this.mTargetView;
        localObject3 = ((RecyclerView)localObject1).mState;
        RecyclerView.SmoothScroller.Action localAction = this.mRecyclingAction;
        onTargetFound((View)localObject2, (RecyclerView.State)localObject3, localAction);
        localObject2 = this.mRecyclingAction;
        ((RecyclerView.SmoothScroller.Action)localObject2).runIfNecessary((RecyclerView)localObject1);
        stop();
      }
    }
    else
    {
      bool2 = this.mRunning;
      if (bool2)
      {
        localObject2 = ((RecyclerView)localObject1).mState;
        localObject3 = this.mRecyclingAction;
        onSeekTargetStep(paramInt1, paramInt2, (RecyclerView.State)localObject2, (RecyclerView.SmoothScroller.Action)localObject3);
        localObject2 = this.mRecyclingAction;
        bool2 = ((RecyclerView.SmoothScroller.Action)localObject2).hasJumpTarget();
        localObject3 = this.mRecyclingAction;
        ((RecyclerView.SmoothScroller.Action)localObject3).runIfNecessary((RecyclerView)localObject1);
        if (bool2)
        {
          bool2 = this.mRunning;
          if (!bool2) {
            break label249;
          }
          bool2 = true;
          this.mPendingInitialRun = bool2;
          localObject1 = ((RecyclerView)localObject1).mViewFlinger;
          ((RecyclerView.ViewFlinger)localObject1).postOnAnimation();
        }
      }
    }
    for (;;)
    {
      return;
      localObject3 = "Passed over target position while smooth scrolling.";
      Log.e("RecyclerView", (String)localObject3);
      bool2 = false;
      localObject2 = null;
      this.mTargetView = null;
      break;
      label249:
      stop();
    }
  }
  
  public View findViewByPosition(int paramInt)
  {
    return this.mRecyclerView.mLayout.findViewByPosition(paramInt);
  }
  
  public int getChildCount()
  {
    return this.mRecyclerView.mLayout.getChildCount();
  }
  
  public int getChildPosition(View paramView)
  {
    return this.mRecyclerView.getChildLayoutPosition(paramView);
  }
  
  public RecyclerView.LayoutManager getLayoutManager()
  {
    return this.mLayoutManager;
  }
  
  public int getTargetPosition()
  {
    return this.mTargetPosition;
  }
  
  public void instantScrollToPosition(int paramInt)
  {
    this.mRecyclerView.scrollToPosition(paramInt);
  }
  
  public boolean isPendingInitialRun()
  {
    return this.mPendingInitialRun;
  }
  
  public boolean isRunning()
  {
    return this.mRunning;
  }
  
  protected void normalize(PointF paramPointF)
  {
    float f1 = paramPointF.x;
    float f2 = paramPointF.x;
    f1 *= f2;
    f2 = paramPointF.y;
    float f3 = paramPointF.y;
    f2 *= f3;
    f1 = (float)Math.sqrt(f1 + f2);
    f2 = paramPointF.x / f1;
    paramPointF.x = f2;
    f1 = paramPointF.y / f1;
    paramPointF.y = f1;
  }
  
  protected void onChildAttachedToWindow(View paramView)
  {
    int i = getChildPosition(paramView);
    int j = getTargetPosition();
    if (i == j) {
      this.mTargetView = paramView;
    }
  }
  
  protected abstract void onSeekTargetStep(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction);
  
  protected abstract void onStart();
  
  protected abstract void onStop();
  
  protected abstract void onTargetFound(View paramView, RecyclerView.State paramState, RecyclerView.SmoothScroller.Action paramAction);
  
  public void setTargetPosition(int paramInt)
  {
    this.mTargetPosition = paramInt;
  }
  
  void start(RecyclerView paramRecyclerView, RecyclerView.LayoutManager paramLayoutManager)
  {
    boolean bool = true;
    this.mRecyclerView = paramRecyclerView;
    this.mLayoutManager = paramLayoutManager;
    int i = this.mTargetPosition;
    int j = -1;
    if (i == j)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Invalid target position");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mRecyclerView.mState;
    j = this.mTargetPosition;
    RecyclerView.State.access$1302((RecyclerView.State)localObject, j);
    this.mRunning = bool;
    this.mPendingInitialRun = bool;
    i = getTargetPosition();
    localObject = findViewByPosition(i);
    this.mTargetView = ((View)localObject);
    onStart();
    this.mRecyclerView.mViewFlinger.postOnAnimation();
  }
  
  protected final void stop()
  {
    int i = -1;
    boolean bool = this.mRunning;
    if (!bool) {}
    for (;;)
    {
      return;
      this.mRunning = false;
      onStop();
      RecyclerView.State.access$1302(this.mRecyclerView.mState, i);
      this.mTargetView = null;
      this.mTargetPosition = i;
      this.mPendingInitialRun = false;
      RecyclerView.LayoutManager localLayoutManager = this.mLayoutManager;
      RecyclerView.LayoutManager.access$1400(localLayoutManager, this);
      this.mLayoutManager = null;
      this.mRecyclerView = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$SmoothScroller.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */