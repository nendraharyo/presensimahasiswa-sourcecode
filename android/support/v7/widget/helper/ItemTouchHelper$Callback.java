package android.support.v7.widget.helper;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.v4.view.r;
import android.support.v7.recyclerview.R.dimen;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.List;

public abstract class ItemTouchHelper$Callback
{
  private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
  public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
  public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
  private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
  static final int RELATIVE_DIR_FLAGS = 3158064;
  private static final Interpolator sDragScrollInterpolator;
  private static final Interpolator sDragViewScrollCapInterpolator;
  private static final ItemTouchUIUtil sUICallback;
  private int mCachedMaxScrollSpeed = -1;
  
  static
  {
    Object localObject = new android/support/v7/widget/helper/ItemTouchHelper$Callback$1;
    ((ItemTouchHelper.Callback.1)localObject).<init>();
    sDragScrollInterpolator = (Interpolator)localObject;
    localObject = new android/support/v7/widget/helper/ItemTouchHelper$Callback$2;
    ((ItemTouchHelper.Callback.2)localObject).<init>();
    sDragViewScrollCapInterpolator = (Interpolator)localObject;
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j)
    {
      localObject = new android/support/v7/widget/helper/ItemTouchUIUtilImpl$Api21Impl;
      ((ItemTouchUIUtilImpl.Api21Impl)localObject).<init>();
    }
    for (sUICallback = (ItemTouchUIUtil)localObject;; sUICallback = (ItemTouchUIUtil)localObject)
    {
      return;
      localObject = new android/support/v7/widget/helper/ItemTouchUIUtilImpl$BaseImpl;
      ((ItemTouchUIUtilImpl.BaseImpl)localObject).<init>();
    }
  }
  
  public static int convertToRelativeDirection(int paramInt1, int paramInt2)
  {
    int i = 789516;
    int j = paramInt1 & i;
    if (j == 0) {}
    for (;;)
    {
      return paramInt1;
      int k = (j ^ 0xFFFFFFFF) & paramInt1;
      if (paramInt2 == 0)
      {
        j <<= 2;
        paramInt1 = k | j;
      }
      else
      {
        int m = j << 1;
        int n = -789517;
        m &= n;
        k |= m;
        j = (j << 1 & i) << 2;
        paramInt1 = k | j;
      }
    }
  }
  
  public static ItemTouchUIUtil getDefaultUIUtil()
  {
    return sUICallback;
  }
  
  private int getMaxDragScroll(RecyclerView paramRecyclerView)
  {
    int i = this.mCachedMaxScrollSpeed;
    int j = -1;
    if (i == j)
    {
      Resources localResources = paramRecyclerView.getResources();
      j = R.dimen.item_touch_helper_max_drag_scroll_per_frame;
      i = localResources.getDimensionPixelSize(j);
      this.mCachedMaxScrollSpeed = i;
    }
    return this.mCachedMaxScrollSpeed;
  }
  
  public static int makeFlag(int paramInt1, int paramInt2)
  {
    int i = paramInt1 * 8;
    return paramInt2 << i;
  }
  
  public static int makeMovementFlags(int paramInt1, int paramInt2)
  {
    int i = paramInt2 | paramInt1;
    int j = makeFlag(0, i);
    i = makeFlag(1, paramInt2);
    j |= i;
    i = makeFlag(2, paramInt1);
    return j | i;
  }
  
  public boolean canDropOver(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
  {
    return true;
  }
  
  public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder paramViewHolder, List paramList, int paramInt1, int paramInt2)
  {
    int i = paramViewHolder.itemView.getWidth();
    int j = paramInt1 + i;
    i = paramViewHolder.itemView.getHeight();
    int k = paramInt2 + i;
    int m = 0;
    Object localObject1 = null;
    int n = -1;
    i = paramViewHolder.itemView.getLeft();
    int i1 = paramInt1 - i;
    i = paramViewHolder.itemView.getTop();
    int i2 = paramInt2 - i;
    int i3 = paramList.size();
    i = 0;
    RecyclerView.ViewHolder localViewHolder = null;
    int i4 = 0;
    Object localObject2;
    View localView1;
    int i6;
    View localView2;
    int i7;
    label191:
    Object localObject3;
    if (i4 < i3)
    {
      localViewHolder = (RecyclerView.ViewHolder)paramList.get(i4);
      if (i1 <= 0) {
        break label455;
      }
      localObject2 = localViewHolder.itemView;
      int i5 = ((View)localObject2).getRight() - j;
      if (i5 >= 0) {
        break label455;
      }
      localView1 = localViewHolder.itemView;
      i6 = localView1.getRight();
      localView2 = paramViewHolder.itemView;
      i7 = localView2.getRight();
      if (i6 <= i7) {
        break label455;
      }
      i5 = Math.abs(i5);
      if (i5 <= n) {
        break label455;
      }
      m = i5;
      localObject2 = localViewHolder;
      if (i1 >= 0) {
        break label484;
      }
      localObject3 = localViewHolder.itemView;
      n = ((View)localObject3).getLeft() - paramInt1;
      if (n <= 0) {
        break label484;
      }
      localView1 = localViewHolder.itemView;
      i6 = localView1.getLeft();
      localView2 = paramViewHolder.itemView;
      i7 = localView2.getLeft();
      if (i6 >= i7) {
        break label484;
      }
      n = Math.abs(n);
      if (n <= m) {
        break label484;
      }
      localObject2 = localViewHolder;
    }
    for (;;)
    {
      if (i2 < 0)
      {
        localObject1 = localViewHolder.itemView;
        m = ((View)localObject1).getTop() - paramInt2;
        if (m > 0)
        {
          localView1 = localViewHolder.itemView;
          i6 = localView1.getTop();
          localView2 = paramViewHolder.itemView;
          i7 = localView2.getTop();
          if (i6 < i7)
          {
            m = Math.abs(m);
            if (m > n) {
              localObject2 = localViewHolder;
            }
          }
        }
      }
      for (;;)
      {
        if (i2 > 0)
        {
          localObject3 = localViewHolder.itemView;
          n = ((View)localObject3).getBottom() - k;
          if (n < 0)
          {
            localView1 = localViewHolder.itemView;
            i6 = localView1.getBottom();
            localView2 = paramViewHolder.itemView;
            i7 = localView2.getBottom();
            if (i6 > i7)
            {
              n = Math.abs(n);
              if (n > m)
              {
                localObject3 = localViewHolder;
                i = n;
              }
            }
          }
        }
        for (;;)
        {
          m = i4 + 1;
          i4 = m;
          localObject1 = localObject3;
          n = i;
          break;
          return (RecyclerView.ViewHolder)localObject1;
          label455:
          localObject2 = localObject1;
          m = n;
          break label191;
          i = m;
          localObject3 = localObject2;
        }
        m = n;
      }
      label484:
      n = m;
    }
  }
  
  public void clearView(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    ItemTouchUIUtil localItemTouchUIUtil = sUICallback;
    View localView = paramViewHolder.itemView;
    localItemTouchUIUtil.clearView(localView);
  }
  
  public int convertToAbsoluteDirection(int paramInt1, int paramInt2)
  {
    int i = 3158064;
    int j = paramInt1 & i;
    if (j == 0) {}
    for (;;)
    {
      return paramInt1;
      int k = (j ^ 0xFFFFFFFF) & paramInt1;
      if (paramInt2 == 0)
      {
        j >>= 2;
        paramInt1 = k | j;
      }
      else
      {
        int m = j >> 1;
        int n = -3158065;
        m &= n;
        k |= m;
        j = (j >> 1 & i) >> 2;
        paramInt1 = k | j;
      }
    }
  }
  
  final int getAbsoluteMovementFlags(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    int i = getMovementFlags(paramRecyclerView, paramViewHolder);
    int j = r.e(paramRecyclerView);
    return convertToAbsoluteDirection(i, j);
  }
  
  public long getAnimationDuration(RecyclerView paramRecyclerView, int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = 8;
    RecyclerView.ItemAnimator localItemAnimator = paramRecyclerView.getItemAnimator();
    long l;
    if (localItemAnimator == null) {
      if (paramInt == i) {
        l = 200L;
      }
    }
    for (;;)
    {
      return l;
      l = 250L;
      continue;
      if (paramInt == i) {
        l = localItemAnimator.getMoveDuration();
      } else {
        l = localItemAnimator.getRemoveDuration();
      }
    }
  }
  
  public int getBoundingBoxMargin()
  {
    return 0;
  }
  
  public float getMoveThreshold(RecyclerView.ViewHolder paramViewHolder)
  {
    return 0.5F;
  }
  
  public abstract int getMovementFlags(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder);
  
  public float getSwipeEscapeVelocity(float paramFloat)
  {
    return paramFloat;
  }
  
  public float getSwipeThreshold(RecyclerView.ViewHolder paramViewHolder)
  {
    return 0.5F;
  }
  
  public float getSwipeVelocityThreshold(float paramFloat)
  {
    return paramFloat;
  }
  
  boolean hasDragFlag(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    int i = getAbsoluteMovementFlags(paramRecyclerView, paramViewHolder);
    int k = 16711680;
    i &= k;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean hasSwipeFlag(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    int i = getAbsoluteMovementFlags(paramRecyclerView, paramViewHolder);
    int k = 65280;
    i &= k;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int interpolateOutOfBoundsScroll(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    int j = getMaxDragScroll(paramRecyclerView);
    int k = Math.abs(paramInt2);
    float f2 = Math.signum(paramInt2);
    int n = (int)f2;
    float f3 = k * f1;
    float f4 = paramInt1;
    f3 /= f4;
    f3 = Math.min(f1, f3);
    float f5 = j * n;
    Interpolator localInterpolator1 = sDragViewScrollCapInterpolator;
    f3 = localInterpolator1.getInterpolation(f3);
    f5 *= f3;
    j = (int)f5;
    long l = 2000L;
    boolean bool = paramLong < l;
    if (bool)
    {
      f5 = j;
      Interpolator localInterpolator2 = sDragScrollInterpolator;
      f1 = localInterpolator2.getInterpolation(f1) * f5;
      i = (int)f1;
      if (i == 0)
      {
        if (paramInt2 <= 0) {
          break label185;
        }
        i = 1;
      }
    }
    for (f1 = Float.MIN_VALUE;; f1 = 0.0F / 0.0F)
    {
      return i;
      f1 = (float)paramLong;
      int m = 1157234688;
      f3 = 2000.0F;
      f1 /= f3;
      break;
      label185:
      i = -1;
    }
  }
  
  public boolean isItemViewSwipeEnabled()
  {
    return true;
  }
  
  public boolean isLongPressDragEnabled()
  {
    return true;
  }
  
  public void onChildDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    ItemTouchUIUtil localItemTouchUIUtil = sUICallback;
    View localView = paramViewHolder.itemView;
    localItemTouchUIUtil.onDraw(paramCanvas, paramRecyclerView, localView, paramFloat1, paramFloat2, paramInt, paramBoolean);
  }
  
  public void onChildDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
  {
    ItemTouchUIUtil localItemTouchUIUtil = sUICallback;
    View localView = paramViewHolder.itemView;
    localItemTouchUIUtil.onDrawOver(paramCanvas, paramRecyclerView, localView, paramFloat1, paramFloat2, paramInt, paramBoolean);
  }
  
  void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, List paramList, int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = paramList.size();
    int j = 0;
    Object localObject = null;
    RecyclerView.ViewHolder localViewHolder;
    float f1;
    float f2;
    int n;
    boolean bool;
    for (int k = 0; k < i; k = j)
    {
      localObject = (ItemTouchHelper.RecoverAnimation)paramList.get(k);
      ((ItemTouchHelper.RecoverAnimation)localObject).update();
      int m = paramCanvas.save();
      localViewHolder = ((ItemTouchHelper.RecoverAnimation)localObject).mViewHolder;
      f1 = ((ItemTouchHelper.RecoverAnimation)localObject).mX;
      f2 = ((ItemTouchHelper.RecoverAnimation)localObject).mY;
      n = ((ItemTouchHelper.RecoverAnimation)localObject).mActionState;
      bool = false;
      localObject = this;
      onChildDraw(paramCanvas, paramRecyclerView, localViewHolder, f1, f2, n, false);
      paramCanvas.restoreToCount(m);
      j = k + 1;
    }
    if (paramViewHolder != null)
    {
      k = paramCanvas.save();
      bool = true;
      localObject = this;
      localViewHolder = paramViewHolder;
      f1 = paramFloat1;
      f2 = paramFloat2;
      n = paramInt;
      onChildDraw(paramCanvas, paramRecyclerView, paramViewHolder, paramFloat1, paramFloat2, paramInt, bool);
      paramCanvas.restoreToCount(k);
    }
  }
  
  void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, List paramList, int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = paramList.size();
    int j = 0;
    float f1 = 0.0F;
    Object localObject = null;
    RecyclerView.ViewHolder localViewHolder;
    float f2;
    float f3;
    int n;
    boolean bool2;
    for (int k = 0; k < i; k = j)
    {
      localObject = (ItemTouchHelper.RecoverAnimation)paramList.get(k);
      int m = paramCanvas.save();
      localViewHolder = ((ItemTouchHelper.RecoverAnimation)localObject).mViewHolder;
      f2 = ((ItemTouchHelper.RecoverAnimation)localObject).mX;
      f3 = ((ItemTouchHelper.RecoverAnimation)localObject).mY;
      n = ((ItemTouchHelper.RecoverAnimation)localObject).mActionState;
      bool2 = false;
      localObject = this;
      onChildDrawOver(paramCanvas, paramRecyclerView, localViewHolder, f2, f3, n, false);
      paramCanvas.restoreToCount(m);
      j = k + 1;
    }
    if (paramViewHolder != null)
    {
      k = paramCanvas.save();
      bool2 = true;
      localObject = this;
      localViewHolder = paramViewHolder;
      f2 = paramFloat1;
      f3 = paramFloat2;
      n = paramInt;
      onChildDrawOver(paramCanvas, paramRecyclerView, paramViewHolder, paramFloat1, paramFloat2, paramInt, bool2);
      paramCanvas.restoreToCount(k);
    }
    int i1 = 0;
    float f4 = 0.0F;
    j = i + -1;
    int i2 = j;
    if (i2 >= 0)
    {
      localObject = (ItemTouchHelper.RecoverAnimation)paramList.get(i2);
      boolean bool3 = ((ItemTouchHelper.RecoverAnimation)localObject).mEnded;
      if (bool3)
      {
        bool3 = ((ItemTouchHelper.RecoverAnimation)localObject).mIsPendingCleanup;
        if (!bool3)
        {
          paramList.remove(i2);
          j = i1;
          f1 = f4;
        }
      }
    }
    for (;;)
    {
      i2 += -1;
      i1 = j;
      f4 = f1;
      break;
      boolean bool1 = ((ItemTouchHelper.RecoverAnimation)localObject).mEnded;
      if (!bool1)
      {
        bool1 = true;
        f1 = Float.MIN_VALUE;
        continue;
        if (i1 != 0) {
          paramRecyclerView.invalidate();
        }
      }
      else
      {
        bool1 = i1;
        f1 = f4;
      }
    }
  }
  
  public abstract boolean onMove(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2);
  
  public void onMoved(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, int paramInt1, RecyclerView.ViewHolder paramViewHolder2, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = paramRecyclerView.getLayoutManager();
    boolean bool1 = localObject instanceof ItemTouchHelper.ViewDropHandler;
    View localView1;
    if (bool1)
    {
      localObject = (ItemTouchHelper.ViewDropHandler)localObject;
      localView1 = paramViewHolder1.itemView;
      View localView2 = paramViewHolder2.itemView;
      ((ItemTouchHelper.ViewDropHandler)localObject).prepareForDrop(localView1, localView2, paramInt3, paramInt4);
    }
    for (;;)
    {
      return;
      bool1 = ((RecyclerView.LayoutManager)localObject).canScrollHorizontally();
      int k;
      if (bool1)
      {
        localView1 = paramViewHolder2.itemView;
        int i = ((RecyclerView.LayoutManager)localObject).getDecoratedLeft(localView1);
        k = paramRecyclerView.getPaddingLeft();
        if (i <= k) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
        localView1 = paramViewHolder2.itemView;
        i = ((RecyclerView.LayoutManager)localObject).getDecoratedRight(localView1);
        k = paramRecyclerView.getWidth();
        int m = paramRecyclerView.getPaddingRight();
        k -= m;
        if (i >= k) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
      }
      boolean bool2 = ((RecyclerView.LayoutManager)localObject).canScrollVertically();
      if (bool2)
      {
        localView1 = paramViewHolder2.itemView;
        int j = ((RecyclerView.LayoutManager)localObject).getDecoratedTop(localView1);
        k = paramRecyclerView.getPaddingTop();
        if (j <= k) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
        localView1 = paramViewHolder2.itemView;
        int n = ((RecyclerView.LayoutManager)localObject).getDecoratedBottom(localView1);
        j = paramRecyclerView.getHeight();
        k = paramRecyclerView.getPaddingBottom();
        j -= k;
        if (n >= j) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
      }
    }
  }
  
  public void onSelectedChanged(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    if (paramViewHolder != null)
    {
      ItemTouchUIUtil localItemTouchUIUtil = sUICallback;
      View localView = paramViewHolder.itemView;
      localItemTouchUIUtil.onSelected(localView);
    }
  }
  
  public abstract void onSwiped(RecyclerView.ViewHolder paramViewHolder, int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$Callback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */