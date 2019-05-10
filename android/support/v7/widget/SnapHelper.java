package android.support.v7.widget;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class SnapHelper
  extends RecyclerView.OnFlingListener
{
  static final float MILLISECONDS_PER_INCH = 100.0F;
  private Scroller mGravityScroller;
  RecyclerView mRecyclerView;
  private final RecyclerView.OnScrollListener mScrollListener;
  
  public SnapHelper()
  {
    SnapHelper.1 local1 = new android/support/v7/widget/SnapHelper$1;
    local1.<init>(this);
    this.mScrollListener = local1;
  }
  
  private void destroyCallbacks()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    RecyclerView.OnScrollListener localOnScrollListener = this.mScrollListener;
    localRecyclerView.removeOnScrollListener(localOnScrollListener);
    this.mRecyclerView.setOnFlingListener(null);
  }
  
  private void setupCallbacks()
  {
    Object localObject = this.mRecyclerView.getOnFlingListener();
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("An instance of OnFlingListener already set.");
      throw ((Throwable)localObject);
    }
    localObject = this.mRecyclerView;
    RecyclerView.OnScrollListener localOnScrollListener = this.mScrollListener;
    ((RecyclerView)localObject).addOnScrollListener(localOnScrollListener);
    this.mRecyclerView.setOnFlingListener(this);
  }
  
  private boolean snapFromFling(RecyclerView.LayoutManager paramLayoutManager, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    boolean bool2 = paramLayoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      RecyclerView.SmoothScroller localSmoothScroller = createScroller((RecyclerView.LayoutManager)paramLayoutManager);
      if (localSmoothScroller != null)
      {
        int i = findTargetSnapPosition((RecyclerView.LayoutManager)paramLayoutManager, paramInt1, paramInt2);
        int j = -1;
        if (i != j)
        {
          localSmoothScroller.setTargetPosition(i);
          ((RecyclerView.LayoutManager)paramLayoutManager).startSmoothScroll(localSmoothScroller);
          bool1 = true;
        }
      }
    }
  }
  
  public void attachToRecyclerView(RecyclerView paramRecyclerView)
  {
    Object localObject = this.mRecyclerView;
    if (localObject == paramRecyclerView) {}
    for (;;)
    {
      return;
      localObject = this.mRecyclerView;
      if (localObject != null) {
        destroyCallbacks();
      }
      this.mRecyclerView = paramRecyclerView;
      localObject = this.mRecyclerView;
      if (localObject != null)
      {
        setupCallbacks();
        localObject = new android/widget/Scroller;
        Context localContext = this.mRecyclerView.getContext();
        DecelerateInterpolator localDecelerateInterpolator = new android/view/animation/DecelerateInterpolator;
        localDecelerateInterpolator.<init>();
        ((Scroller)localObject).<init>(localContext, localDecelerateInterpolator);
        this.mGravityScroller = ((Scroller)localObject);
        snapToTargetExistingView();
      }
    }
  }
  
  public abstract int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager paramLayoutManager, View paramView);
  
  public int[] calculateScrollDistance(int paramInt1, int paramInt2)
  {
    int i = -1 >>> 1;
    int j = -1 << -1;
    int[] arrayOfInt = new int[2];
    this.mGravityScroller.fling(0, 0, paramInt1, paramInt2, j, i, j, i);
    int k = this.mGravityScroller.getFinalX();
    arrayOfInt[0] = k;
    int m = this.mGravityScroller.getFinalY();
    arrayOfInt[1] = m;
    return arrayOfInt;
  }
  
  protected RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager paramLayoutManager)
  {
    return createSnapScroller(paramLayoutManager);
  }
  
  protected LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager paramLayoutManager)
  {
    boolean bool = paramLayoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider;
    Object localObject;
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (LinearSmoothScroller)localObject;
      localObject = new android/support/v7/widget/SnapHelper$2;
      Context localContext = this.mRecyclerView.getContext();
      ((SnapHelper.2)localObject).<init>(this, localContext);
    }
  }
  
  public abstract View findSnapView(RecyclerView.LayoutManager paramLayoutManager);
  
  public abstract int findTargetSnapPosition(RecyclerView.LayoutManager paramLayoutManager, int paramInt1, int paramInt2);
  
  public boolean onFling(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    RecyclerView.LayoutManager localLayoutManager = this.mRecyclerView.getLayoutManager();
    if (localLayoutManager == null) {}
    for (;;)
    {
      return bool1;
      Object localObject = this.mRecyclerView.getAdapter();
      if (localObject != null)
      {
        localObject = this.mRecyclerView;
        int i = ((RecyclerView)localObject).getMinFlingVelocity();
        int j = Math.abs(paramInt2);
        if (j <= i)
        {
          j = Math.abs(paramInt1);
          if (j <= i) {}
        }
        else
        {
          boolean bool2 = snapFromFling(localLayoutManager, paramInt1, paramInt2);
          if (bool2) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  void snapToTargetExistingView()
  {
    int i = 1;
    int j = 0;
    Object localObject1 = this.mRecyclerView;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.mRecyclerView.getLayoutManager();
      if (localObject1 != null)
      {
        Object localObject2 = findSnapView((RecyclerView.LayoutManager)localObject1);
        if (localObject2 != null)
        {
          localObject1 = calculateDistanceToFinalSnap((RecyclerView.LayoutManager)localObject1, (View)localObject2);
          int k = localObject1[0];
          if (k == 0)
          {
            k = localObject1[i];
            if (k == 0) {}
          }
          else
          {
            localObject2 = this.mRecyclerView;
            j = localObject1[0];
            int m = localObject1[i];
            ((RecyclerView)localObject2).smoothScrollBy(j, m);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SnapHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */