package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.os.d;
import android.support.v4.view.r;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.ArrayList;

class RecyclerView$ViewFlinger
  implements Runnable
{
  private boolean mEatRunOnAnimationRequest;
  Interpolator mInterpolator;
  private int mLastFlingX;
  private int mLastFlingY;
  private boolean mReSchedulePostAnimationCallback;
  private OverScroller mScroller;
  
  RecyclerView$ViewFlinger(RecyclerView paramRecyclerView)
  {
    Object localObject = RecyclerView.sQuinticInterpolator;
    this.mInterpolator = ((Interpolator)localObject);
    this.mEatRunOnAnimationRequest = false;
    this.mReSchedulePostAnimationCallback = false;
    localObject = new android/widget/OverScroller;
    Context localContext = paramRecyclerView.getContext();
    Interpolator localInterpolator = RecyclerView.sQuinticInterpolator;
    ((OverScroller)localObject).<init>(localContext, localInterpolator);
    this.mScroller = ((OverScroller)localObject);
  }
  
  private int computeScrollDuration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = 1.0F;
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    float f2;
    int n;
    int i1;
    RecyclerView localRecyclerView;
    if (i > j)
    {
      k = 1;
      f2 = Float.MIN_VALUE;
      m = paramInt3 * paramInt3;
      n = paramInt4 * paramInt4;
      double d1 = Math.sqrt(m + n);
      n = (int)d1;
      m = paramInt1 * paramInt1;
      i1 = paramInt2 * paramInt2;
      m += i1;
      double d2 = Math.sqrt(m);
      i1 = (int)d2;
      if (k == 0) {
        break label219;
      }
      localRecyclerView = this.this$0;
    }
    float f6;
    for (int m = localRecyclerView.getWidth();; m = localRecyclerView.getHeight())
    {
      int i2 = m / 2;
      float f3 = i1 * f1;
      float f4 = m;
      f3 /= f4;
      f3 = Math.min(f1, f3);
      f4 = i2;
      float f5 = i2;
      f3 = distanceInfluenceForSnapDuration(f3) * f5 + f4;
      if (n <= 0) {
        break label235;
      }
      f6 = n;
      f6 = Math.abs(f3 / f6);
      f2 = 1000.0F * f6;
      k = Math.round(f2) * 4;
      return Math.min(k, 2000);
      k = 0;
      f2 = 0.0F;
      break;
      label219:
      localRecyclerView = this.this$0;
    }
    label235:
    if (k != 0) {}
    for (int k = i;; k = j)
    {
      f2 = k;
      f6 = m;
      f2 = f2 / f6 + f1;
      m = 1133903872;
      f6 = 300.0F;
      f2 *= f6;
      k = (int)f2;
      break;
    }
  }
  
  private void disableRunOnAnimationRequests()
  {
    this.mReSchedulePostAnimationCallback = false;
    this.mEatRunOnAnimationRequest = true;
  }
  
  private float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.47123894F);
  }
  
  private void enableRunOnAnimationRequests()
  {
    this.mEatRunOnAnimationRequest = false;
    boolean bool = this.mReSchedulePostAnimationCallback;
    if (bool) {
      postOnAnimation();
    }
  }
  
  public void fling(int paramInt1, int paramInt2)
  {
    int i = -1 >>> 1;
    int j = -1 << -1;
    this.this$0.setScrollState(2);
    this.mLastFlingY = 0;
    this.mLastFlingX = 0;
    this.mScroller.fling(0, 0, paramInt1, paramInt2, j, i, j, i);
    postOnAnimation();
  }
  
  void postOnAnimation()
  {
    boolean bool = this.mEatRunOnAnimationRequest;
    if (bool)
    {
      bool = true;
      this.mReSchedulePostAnimationCallback = bool;
    }
    for (;;)
    {
      return;
      this.this$0.removeCallbacks(this);
      RecyclerView localRecyclerView = this.this$0;
      r.a(localRecyclerView, this);
    }
  }
  
  public void run()
  {
    Object localObject1 = this.this$0.mLayout;
    if (localObject1 == null)
    {
      stop();
      return;
    }
    disableRunOnAnimationRequests();
    this.this$0.consumePendingUpdateOperations();
    OverScroller localOverScroller = this.mScroller;
    localObject1 = this.this$0.mLayout;
    RecyclerView.SmoothScroller localSmoothScroller = ((RecyclerView.LayoutManager)localObject1).mSmoothScroller;
    boolean bool1 = localOverScroller.computeScrollOffset();
    int[] arrayOfInt;
    int i1;
    int i2;
    int i3;
    int i6;
    int i7;
    int i8;
    boolean bool5;
    Object localObject2;
    int i10;
    int j;
    int i11;
    if (bool1)
    {
      arrayOfInt = RecyclerView.access$500(this.this$0);
      i1 = localOverScroller.getCurrX();
      i2 = localOverScroller.getCurrY();
      int i = this.mLastFlingX;
      i3 = i1 - i;
      i = this.mLastFlingY;
      i6 = i2 - i;
      i7 = 0;
      this.mLastFlingX = i1;
      this.mLastFlingY = i2;
      i8 = 0;
      localObject1 = this.this$0;
      bool5 = false;
      localObject2 = null;
      i10 = 1;
      boolean bool2 = ((RecyclerView)localObject1).dispatchNestedPreScroll(i3, i6, arrayOfInt, null, i10);
      if (!bool2) {
        break label1251;
      }
      localObject1 = null;
      j = arrayOfInt[0];
      i3 -= j;
      j = arrayOfInt[1];
      i6 -= j;
      i11 = i6;
    }
    label293:
    label343:
    label442:
    label576:
    label602:
    label772:
    label806:
    label829:
    int i5;
    for (int i12 = i3;; i12 = i5)
    {
      localObject1 = this.this$0.mAdapter;
      Object localObject3;
      RecyclerView.State localState;
      int i13;
      int i9;
      int i14;
      if (localObject1 != null)
      {
        this.this$0.startInterceptRequestLayout();
        this.this$0.onEnterLayoutOrScroll();
        d.a("RV Scroll");
        localObject1 = this.this$0;
        localObject3 = this.this$0.mState;
        ((RecyclerView)localObject1).fillRemainingScrollValues((RecyclerView.State)localObject3);
        if (i12 != 0)
        {
          localObject1 = this.this$0.mLayout;
          localObject3 = this.this$0.mRecycler;
          localState = this.this$0.mState;
          i6 = ((RecyclerView.LayoutManager)localObject1).scrollHorizontallyBy(i12, (RecyclerView.Recycler)localObject3, localState);
          i13 = i12 - i6;
          if (i11 != 0)
          {
            localObject1 = this.this$0.mLayout;
            localObject3 = this.this$0.mRecycler;
            localObject2 = this.this$0.mState;
            i3 = ((RecyclerView.LayoutManager)localObject1).scrollVerticallyBy(i11, (RecyclerView.Recycler)localObject3, (RecyclerView.State)localObject2);
            j = i11 - i3;
            d.a();
            this.this$0.repositionShadowingViews();
            this.this$0.onExitLayoutOrScroll();
            localObject2 = this.this$0;
            i10 = 0;
            ((RecyclerView)localObject2).stopInterceptRequestLayout(false);
            if (localSmoothScroller != null)
            {
              bool5 = localSmoothScroller.isPendingInitialRun();
              if (!bool5)
              {
                bool5 = localSmoothScroller.isRunning();
                if (bool5)
                {
                  localObject2 = this.this$0.mState;
                  i9 = ((RecyclerView.State)localObject2).getItemCount();
                  if (i9 == 0)
                  {
                    localSmoothScroller.stop();
                    i9 = j;
                    i14 = i3;
                    i3 = i6;
                    i6 = i14;
                  }
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        localObject1 = this.this$0.mItemDecorations;
        boolean bool3 = ((ArrayList)localObject1).isEmpty();
        if (!bool3)
        {
          localObject1 = this.this$0;
          ((RecyclerView)localObject1).invalidate();
        }
        localObject1 = this.this$0;
        int k = ((RecyclerView)localObject1).getOverScrollMode();
        i10 = 2;
        if (k != i10)
        {
          localObject1 = this.this$0;
          ((RecyclerView)localObject1).considerReleasingGlowsOnScroll(i12, i11);
        }
        localObject1 = this.this$0;
        i10 = 0;
        i8 = 1;
        boolean bool4 = ((RecyclerView)localObject1).dispatchNestedScroll(i3, i6, i13, i9, null, i8);
        int m;
        if ((!bool4) && ((i13 != 0) || (i9 != 0)))
        {
          i10 = (int)localOverScroller.getCurrVelocity();
          bool4 = false;
          localObject1 = null;
          if (i13 == i1) {
            break label1189;
          }
          if (i13 >= 0) {
            break label1079;
          }
          m = -i10;
        }
        label1079:
        label1124:
        label1132:
        label1140:
        label1189:
        for (i8 = m;; i8 = 0)
        {
          m = 0;
          localObject1 = null;
          if (i9 != i2) {
            if (i9 < 0) {
              i10 = -i10;
            }
          }
          for (;;)
          {
            localObject1 = this.this$0;
            m = ((RecyclerView)localObject1).getOverScrollMode();
            i7 = 2;
            if (m != i7)
            {
              localObject1 = this.this$0;
              ((RecyclerView)localObject1).absorbGlows(i8, i10);
            }
            if ((i8 == 0) && (i13 != i1))
            {
              m = localOverScroller.getFinalX();
              if (m != 0) {}
            }
            else if ((i10 == 0) && (i9 != i2))
            {
              m = localOverScroller.getFinalY();
              if (m != 0) {}
            }
            else
            {
              localOverScroller.abortAnimation();
            }
            if ((i3 != 0) || (i6 != 0))
            {
              localObject1 = this.this$0;
              ((RecyclerView)localObject1).dispatchOnScrolled(i3, i6);
            }
            localObject1 = this.this$0;
            n = RecyclerView.access$700((RecyclerView)localObject1);
            if (n == 0)
            {
              localObject1 = this.this$0;
              ((RecyclerView)localObject1).invalidate();
            }
            if (i11 != 0)
            {
              localObject1 = this.this$0.mLayout;
              n = ((RecyclerView.LayoutManager)localObject1).canScrollVertically();
              if ((n != 0) && (i6 == i11))
              {
                n = 1;
                i6 = n;
                if (i12 == 0) {
                  break label1124;
                }
                localObject1 = this.this$0.mLayout;
                n = ((RecyclerView.LayoutManager)localObject1).canScrollHorizontally();
                if ((n == 0) || (i3 != i12)) {
                  break label1124;
                }
                n = 1;
                if (((i12 != 0) || (i11 != 0)) && (n == 0) && (i6 == 0)) {
                  break label1132;
                }
                n = 1;
                int i4 = localOverScroller.isFinished();
                if (i4 == 0)
                {
                  if (n != 0) {
                    break label1140;
                  }
                  localObject1 = this.this$0;
                  i4 = 1;
                  n = ((RecyclerView)localObject1).hasNestedScrollingParent(i4);
                  if (n != 0) {
                    break label1140;
                  }
                }
                localObject1 = this.this$0;
                i5 = 0;
                localObject3 = null;
                ((RecyclerView)localObject1).setScrollState(0);
                n = RecyclerView.access$800();
                if (n != 0)
                {
                  localObject1 = this.this$0.mPrefetchRegistry;
                  ((GapWorker.LayoutPrefetchRegistryImpl)localObject1).clearPrefetchPositions();
                }
                localObject1 = this.this$0;
                i5 = 1;
                ((RecyclerView)localObject1).stopNestedScroll(i5);
              }
            }
            for (;;)
            {
              if (localSmoothScroller != null)
              {
                n = localSmoothScroller.isPendingInitialRun();
                if (n != 0)
                {
                  n = 0;
                  localObject1 = null;
                  i5 = 0;
                  localObject3 = null;
                  RecyclerView.SmoothScroller.access$600(localSmoothScroller, 0, 0);
                }
                n = this.mReSchedulePostAnimationCallback;
                if (n == 0) {
                  localSmoothScroller.stop();
                }
              }
              enableRunOnAnimationRequests();
              break;
              i10 = localSmoothScroller.getTargetPosition();
              if (i10 >= i9)
              {
                i9 += -1;
                localSmoothScroller.setTargetPosition(i9);
                i9 = i12 - i13;
                i10 = i11 - n;
                RecyclerView.SmoothScroller.access$600(localSmoothScroller, i9, i10);
                i9 = n;
                i14 = i5;
                i5 = i6;
                i6 = i14;
                break label442;
              }
              i9 = i12 - i13;
              i10 = i11 - n;
              RecyclerView.SmoothScroller.access$600(localSmoothScroller, i9, i10);
              i9 = n;
              i14 = i5;
              i5 = i6;
              i6 = i14;
              break label442;
              if (i13 > 0)
              {
                n = i10;
                break label576;
              }
              n = 0;
              localObject1 = null;
              break label576;
              if (i9 > 0) {
                break label602;
              }
              i10 = 0;
              break label602;
              n = 0;
              localObject1 = null;
              i6 = 0;
              localState = null;
              break label772;
              n = 0;
              localObject1 = null;
              break label806;
              n = 0;
              localObject1 = null;
              break label829;
              postOnAnimation();
              localObject1 = this.this$0.mGapWorker;
              if (localObject1 != null)
              {
                localObject1 = this.this$0.mGapWorker;
                localObject3 = this.this$0;
                ((GapWorker)localObject1).postFromTraversal((RecyclerView)localObject3, i12, i11);
              }
            }
            i10 = 0;
          }
        }
        int n = 0;
        localObject1 = null;
        i5 = 0;
        localObject3 = null;
        break label343;
        i13 = 0;
        arrayOfInt = null;
        i6 = 0;
        localState = null;
        break label293;
        i9 = 0;
        localObject2 = null;
        i13 = 0;
        arrayOfInt = null;
        i6 = 0;
        localState = null;
        i5 = 0;
        localObject3 = null;
      }
      label1251:
      i11 = i6;
    }
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2)
  {
    smoothScrollBy(paramInt1, paramInt2, 0, 0);
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2, int paramInt3)
  {
    Interpolator localInterpolator = RecyclerView.sQuinticInterpolator;
    smoothScrollBy(paramInt1, paramInt2, paramInt3, localInterpolator);
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = computeScrollDuration(paramInt1, paramInt2, paramInt3, paramInt4);
    smoothScrollBy(paramInt1, paramInt2, i);
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    int i = 0;
    Object localObject = this.mInterpolator;
    if (localObject != paramInterpolator)
    {
      this.mInterpolator = paramInterpolator;
      localObject = new android/widget/OverScroller;
      localContext = this.this$0.getContext();
      ((OverScroller)localObject).<init>(localContext, paramInterpolator);
      this.mScroller = ((OverScroller)localObject);
    }
    this.this$0.setScrollState(2);
    this.mLastFlingY = 0;
    this.mLastFlingX = 0;
    localObject = this.mScroller;
    Context localContext = null;
    ((OverScroller)localObject).startScroll(0, 0, paramInt1, paramInt2, paramInt3);
    int j = Build.VERSION.SDK_INT;
    i = 23;
    if (j < i)
    {
      localObject = this.mScroller;
      ((OverScroller)localObject).computeScrollOffset();
    }
    postOnAnimation();
  }
  
  public void smoothScrollBy(int paramInt1, int paramInt2, Interpolator paramInterpolator)
  {
    int i = computeScrollDuration(paramInt1, paramInt2, 0, 0);
    if (paramInterpolator == null) {
      paramInterpolator = RecyclerView.sQuinticInterpolator;
    }
    smoothScrollBy(paramInt1, paramInt2, i, paramInterpolator);
  }
  
  public void stop()
  {
    this.this$0.removeCallbacks(this);
    this.mScroller.abortAnimation();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$ViewFlinger.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */