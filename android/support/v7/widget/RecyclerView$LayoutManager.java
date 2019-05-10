package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.b;
import android.support.v4.view.a.b.c;
import android.support.v4.view.r;
import android.support.v7.recyclerview.R.styleable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class RecyclerView$LayoutManager
{
  boolean mAutoMeasure;
  ChildHelper mChildHelper;
  private int mHeight;
  private int mHeightMode;
  ViewBoundsCheck mHorizontalBoundCheck;
  private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
  boolean mIsAttachedToWindow;
  private boolean mItemPrefetchEnabled;
  private boolean mMeasurementCacheEnabled;
  int mPrefetchMaxCountObserved;
  boolean mPrefetchMaxObservedInInitialPrefetch;
  RecyclerView mRecyclerView;
  boolean mRequestedSimpleAnimations;
  RecyclerView.SmoothScroller mSmoothScroller;
  ViewBoundsCheck mVerticalBoundCheck;
  private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
  private int mWidth;
  private int mWidthMode;
  
  public RecyclerView$LayoutManager()
  {
    Object localObject = new android/support/v7/widget/RecyclerView$LayoutManager$1;
    ((RecyclerView.LayoutManager.1)localObject).<init>(this);
    this.mHorizontalBoundCheckCallback = ((ViewBoundsCheck.Callback)localObject);
    localObject = new android/support/v7/widget/RecyclerView$LayoutManager$2;
    ((RecyclerView.LayoutManager.2)localObject).<init>(this);
    this.mVerticalBoundCheckCallback = ((ViewBoundsCheck.Callback)localObject);
    localObject = new android/support/v7/widget/ViewBoundsCheck;
    ViewBoundsCheck.Callback localCallback = this.mHorizontalBoundCheckCallback;
    ((ViewBoundsCheck)localObject).<init>(localCallback);
    this.mHorizontalBoundCheck = ((ViewBoundsCheck)localObject);
    localObject = new android/support/v7/widget/ViewBoundsCheck;
    localCallback = this.mVerticalBoundCheckCallback;
    ((ViewBoundsCheck)localObject).<init>(localCallback);
    this.mVerticalBoundCheck = ((ViewBoundsCheck)localObject);
    this.mRequestedSimpleAnimations = false;
    this.mIsAttachedToWindow = false;
    this.mAutoMeasure = false;
    this.mMeasurementCacheEnabled = bool;
    this.mItemPrefetchEnabled = bool;
  }
  
  private void addViewInt(View paramView, int paramInt, boolean paramBoolean)
  {
    int i = -1;
    Object localObject1 = RecyclerView.getChildViewHolderInt(paramView);
    Object localObject2;
    boolean bool2;
    label91:
    Object localObject3;
    Object localObject4;
    if (!paramBoolean)
    {
      boolean bool1 = ((RecyclerView.ViewHolder)localObject1).isRemoved();
      if (!bool1) {}
    }
    else
    {
      localObject2 = this.mRecyclerView.mViewInfoStore;
      ((ViewInfoStore)localObject2).addToDisappearedInLayout((RecyclerView.ViewHolder)localObject1);
      localObject2 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      bool2 = ((RecyclerView.ViewHolder)localObject1).wasReturnedFromScrap();
      if (!bool2)
      {
        bool2 = ((RecyclerView.ViewHolder)localObject1).isScrap();
        if (!bool2) {
          break label171;
        }
      }
      bool2 = ((RecyclerView.ViewHolder)localObject1).isScrap();
      if (!bool2) {
        break label163;
      }
      ((RecyclerView.ViewHolder)localObject1).unScrap();
      localObject3 = this.mChildHelper;
      localObject4 = paramView.getLayoutParams();
      ((ChildHelper)localObject3).attachViewToParent(paramView, paramInt, (ViewGroup.LayoutParams)localObject4, false);
    }
    for (;;)
    {
      bool2 = ((RecyclerView.LayoutParams)localObject2).mPendingInvalidate;
      if (bool2)
      {
        localObject1 = ((RecyclerView.ViewHolder)localObject1).itemView;
        ((View)localObject1).invalidate();
        ((RecyclerView.LayoutParams)localObject2).mPendingInvalidate = false;
      }
      return;
      localObject2 = this.mRecyclerView.mViewInfoStore;
      ((ViewInfoStore)localObject2).removeFromDisappearedInLayout((RecyclerView.ViewHolder)localObject1);
      break;
      label163:
      ((RecyclerView.ViewHolder)localObject1).clearReturnedFromScrapFlag();
      break label91;
      label171:
      localObject3 = paramView.getParent();
      localObject4 = this.mRecyclerView;
      int j;
      if (localObject3 == localObject4)
      {
        localObject3 = this.mChildHelper;
        j = ((ChildHelper)localObject3).indexOfChild(paramView);
        if (paramInt == i)
        {
          localObject4 = this.mChildHelper;
          paramInt = ((ChildHelper)localObject4).getChildCount();
        }
        if (j == i)
        {
          localObject2 = new java/lang/IllegalStateException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
          j = this.mRecyclerView.indexOfChild(paramView);
          localObject1 = ((StringBuilder)localObject1).append(j);
          localObject3 = this.mRecyclerView.exceptionLabel();
          localObject1 = (String)localObject3;
          ((IllegalStateException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
        if (j != paramInt)
        {
          localObject4 = this.mRecyclerView.mLayout;
          ((LayoutManager)localObject4).moveView(j, paramInt);
        }
      }
      else
      {
        this.mChildHelper.addView(paramView, paramInt, false);
        j = 1;
        ((RecyclerView.LayoutParams)localObject2).mInsetsDirty = j;
        localObject3 = this.mSmoothScroller;
        if (localObject3 != null)
        {
          localObject3 = this.mSmoothScroller;
          boolean bool3 = ((RecyclerView.SmoothScroller)localObject3).isRunning();
          if (bool3)
          {
            localObject3 = this.mSmoothScroller;
            ((RecyclerView.SmoothScroller)localObject3).onChildAttachedToWindow(paramView);
          }
        }
      }
    }
  }
  
  public static int chooseSize(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    switch (i)
    {
    }
    for (j = Math.max(paramInt2, paramInt3);; j = Math.min(j, i))
    {
      return j;
      i = Math.max(paramInt2, paramInt3);
    }
  }
  
  private void detachViewInternal(int paramInt, View paramView)
  {
    this.mChildHelper.detachViewFromParent(paramInt);
  }
  
  public static int getChildMeasureSpec(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i = -1;
    int j = -2;
    int k = -1 << -1;
    int m = 1073741824;
    int n = 0;
    int i1 = paramInt1 - paramInt3;
    i1 = Math.max(0, i1);
    if (paramBoolean) {
      if (paramInt4 >= 0)
      {
        n = m;
        i1 = paramInt4;
      }
    }
    for (;;)
    {
      return View.MeasureSpec.makeMeasureSpec(i1, n);
      if (paramInt4 == i)
      {
        switch (paramInt2)
        {
        default: 
          paramInt2 = 0;
        }
        for (;;)
        {
          i1 = n;
          n = paramInt2;
          break;
          n = i1;
          continue;
          paramInt2 = 0;
        }
      }
      if (paramInt4 == j)
      {
        i1 = 0;
        continue;
        if (paramInt4 >= 0)
        {
          n = m;
          i1 = paramInt4;
          continue;
        }
        if (paramInt4 == i)
        {
          n = paramInt2;
          continue;
        }
        if (paramInt4 == j)
        {
          if ((paramInt2 != k) && (paramInt2 != m)) {
            continue;
          }
          n = k;
          continue;
        }
      }
      i1 = 0;
    }
  }
  
  public static int getChildMeasureSpec(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = 1073741824;
    int j = paramInt1 - paramInt2;
    j = Math.max(0, j);
    if (paramBoolean) {
      if (paramInt3 < 0) {}
    }
    for (;;)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt3, i);
      i = 0;
      paramInt3 = 0;
      continue;
      if (paramInt3 < 0)
      {
        int k = -1;
        if (paramInt3 == k)
        {
          paramInt3 = j;
        }
        else
        {
          i = -2;
          if (paramInt3 == i)
          {
            i = -1 << -1;
            paramInt3 = j;
          }
          else
          {
            i = 0;
            paramInt3 = 0;
          }
        }
      }
    }
  }
  
  private int[] getChildRectangleOnScreenScrollAmount(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
  {
    int[] arrayOfInt = new int[2];
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = getWidth();
    int m = getPaddingRight();
    int n = k - m;
    k = getHeight();
    m = getPaddingBottom();
    int i1 = k - m;
    k = paramView.getLeft();
    m = paramRect.left;
    k += m;
    m = paramView.getScrollX();
    int i2 = k - m;
    k = paramView.getTop();
    m = paramRect.top;
    k += m;
    m = paramView.getScrollY();
    int i3 = k - m;
    k = paramRect.width();
    int i4 = i2 + k;
    k = paramRect.height();
    int i5 = i3 + k;
    m = i2 - i;
    m = Math.min(0, m);
    int i6 = i3 - j;
    i6 = Math.min(0, i6);
    int i7 = i4 - n;
    k = Math.max(0, i7);
    i1 = i5 - i1;
    i1 = Math.max(0, i1);
    i5 = getLayoutDirection();
    i7 = 1;
    if (i5 == i7) {
      if (k != 0)
      {
        m = k;
        if (i6 == 0) {
          break label308;
        }
      }
    }
    label308:
    for (k = i6;; k = Math.min(i3 - j, i1))
    {
      arrayOfInt[0] = m;
      arrayOfInt[1] = k;
      return arrayOfInt;
      k = i4 - n;
      k = Math.max(m, k);
      break;
      if (m != 0) {}
      for (k = m;; k = Math.min(m, k))
      {
        m = k;
        break;
        m = i2 - i;
      }
    }
  }
  
  public static RecyclerView.LayoutManager.Properties getProperties(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    int i = 1;
    RecyclerView.LayoutManager.Properties localProperties = new android/support/v7/widget/RecyclerView$LayoutManager$Properties;
    localProperties.<init>();
    Object localObject = R.styleable.RecyclerView;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt1, paramInt2);
    int j = R.styleable.RecyclerView_android_orientation;
    j = ((TypedArray)localObject).getInt(j, i);
    localProperties.orientation = j;
    j = R.styleable.RecyclerView_spanCount;
    j = ((TypedArray)localObject).getInt(j, i);
    localProperties.spanCount = j;
    j = R.styleable.RecyclerView_reverseLayout;
    boolean bool1 = ((TypedArray)localObject).getBoolean(j, false);
    localProperties.reverseLayout = bool1;
    int k = R.styleable.RecyclerView_stackFromEnd;
    boolean bool2 = ((TypedArray)localObject).getBoolean(k, false);
    localProperties.stackFromEnd = bool2;
    ((TypedArray)localObject).recycle();
    return localProperties;
  }
  
  private boolean isFocusedChildVisibleAfterScrolling(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    View localView = paramRecyclerView.getFocusedChild();
    if (localView == null) {}
    for (;;)
    {
      return bool;
      int i = getPaddingLeft();
      int j = getPaddingTop();
      int k = getWidth();
      int m = getPaddingRight();
      k -= m;
      m = getHeight();
      int n = getPaddingBottom();
      m -= n;
      Rect localRect = this.mRecyclerView.mTempRect;
      getDecoratedBoundsWithMargins(localView, localRect);
      int i1 = localRect.left - paramInt1;
      if (i1 < k)
      {
        i1 = localRect.right - paramInt1;
        if (i1 > i)
        {
          i1 = localRect.top - paramInt2;
          if (i1 < m)
          {
            i1 = localRect.bottom - paramInt2;
            if (i1 > j) {
              bool = true;
            }
          }
        }
      }
    }
  }
  
  private static boolean isMeasurementUpToDate(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      switch (i)
      {
      case 0: 
      default: 
        bool = false;
        break;
      case -2147483648: 
        if (j < paramInt1) {
          bool = false;
        }
        break;
      case 1073741824: 
        if (j != paramInt1) {
          bool = false;
        }
        break;
      }
    }
  }
  
  private void onSmoothScrollerStopped(RecyclerView.SmoothScroller paramSmoothScroller)
  {
    RecyclerView.SmoothScroller localSmoothScroller = this.mSmoothScroller;
    if (localSmoothScroller == paramSmoothScroller)
    {
      localSmoothScroller = null;
      this.mSmoothScroller = null;
    }
  }
  
  private void scrapOrRecycleView(RecyclerView.Recycler paramRecycler, int paramInt, View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    boolean bool = localViewHolder.shouldIgnore();
    if (bool) {}
    for (;;)
    {
      return;
      bool = localViewHolder.isInvalid();
      if (bool)
      {
        bool = localViewHolder.isRemoved();
        if (!bool)
        {
          localObject = this.mRecyclerView.mAdapter;
          bool = ((RecyclerView.Adapter)localObject).hasStableIds();
          if (!bool)
          {
            removeViewAt(paramInt);
            paramRecycler.recycleViewHolderInternal(localViewHolder);
            continue;
          }
        }
      }
      detachViewAt(paramInt);
      paramRecycler.scrapView(paramView);
      Object localObject = this.mRecyclerView.mViewInfoStore;
      ((ViewInfoStore)localObject).onViewDetached(localViewHolder);
    }
  }
  
  public void addDisappearingView(View paramView)
  {
    addDisappearingView(paramView, -1);
  }
  
  public void addDisappearingView(View paramView, int paramInt)
  {
    addViewInt(paramView, paramInt, true);
  }
  
  public void addView(View paramView)
  {
    addView(paramView, -1);
  }
  
  public void addView(View paramView, int paramInt)
  {
    addViewInt(paramView, paramInt, false);
  }
  
  public void assertInLayoutOrScroll(String paramString)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      localRecyclerView.assertInLayoutOrScroll(paramString);
    }
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      localRecyclerView.assertNotInLayoutOrScroll(paramString);
    }
  }
  
  public void attachView(View paramView)
  {
    attachView(paramView, -1);
  }
  
  public void attachView(View paramView, int paramInt)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    attachView(paramView, paramInt, localLayoutParams);
  }
  
  public void attachView(View paramView, int paramInt, RecyclerView.LayoutParams paramLayoutParams)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    boolean bool1 = localViewHolder.isRemoved();
    Object localObject;
    if (bool1)
    {
      localObject = this.mRecyclerView.mViewInfoStore;
      ((ViewInfoStore)localObject).addToDisappearedInLayout(localViewHolder);
    }
    for (;;)
    {
      localObject = this.mChildHelper;
      boolean bool2 = localViewHolder.isRemoved();
      ((ChildHelper)localObject).attachViewToParent(paramView, paramInt, paramLayoutParams, bool2);
      return;
      localObject = this.mRecyclerView.mViewInfoStore;
      ((ViewInfoStore)localObject).removeFromDisappearedInLayout(localViewHolder);
    }
  }
  
  public void calculateItemDecorationsForChild(View paramView, Rect paramRect)
  {
    Object localObject = this.mRecyclerView;
    if (localObject == null) {
      paramRect.set(0, 0, 0, 0);
    }
    for (;;)
    {
      return;
      localObject = this.mRecyclerView.getItemDecorInsetsForChild(paramView);
      paramRect.set((Rect)localObject);
    }
  }
  
  public boolean canScrollHorizontally()
  {
    return false;
  }
  
  public boolean canScrollVertically()
  {
    return false;
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry) {}
  
  public void collectInitialPrefetchPositions(int paramInt, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry) {}
  
  public int computeHorizontalScrollExtent(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeHorizontalScrollOffset(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeHorizontalScrollRange(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollExtent(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollOffset(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollRange(RecyclerView.State paramState)
  {
    return 0;
  }
  
  public void detachAndScrapAttachedViews(RecyclerView.Recycler paramRecycler)
  {
    int i = getChildCount() + -1;
    while (i >= 0)
    {
      View localView = getChildAt(i);
      scrapOrRecycleView(paramRecycler, i, localView);
      i += -1;
    }
  }
  
  public void detachAndScrapView(View paramView, RecyclerView.Recycler paramRecycler)
  {
    int i = this.mChildHelper.indexOfChild(paramView);
    scrapOrRecycleView(paramRecycler, i, paramView);
  }
  
  public void detachAndScrapViewAt(int paramInt, RecyclerView.Recycler paramRecycler)
  {
    View localView = getChildAt(paramInt);
    scrapOrRecycleView(paramRecycler, paramInt, localView);
  }
  
  public void detachView(View paramView)
  {
    ChildHelper localChildHelper = this.mChildHelper;
    int i = localChildHelper.indexOfChild(paramView);
    if (i >= 0) {
      detachViewInternal(i, paramView);
    }
  }
  
  public void detachViewAt(int paramInt)
  {
    View localView = getChildAt(paramInt);
    detachViewInternal(paramInt, localView);
  }
  
  void dispatchAttachedToWindow(RecyclerView paramRecyclerView)
  {
    this.mIsAttachedToWindow = true;
    onAttachedToWindow(paramRecyclerView);
  }
  
  void dispatchDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    this.mIsAttachedToWindow = false;
    onDetachedFromWindow(paramRecyclerView, paramRecycler);
  }
  
  public void endAnimation(View paramView)
  {
    RecyclerView.ItemAnimator localItemAnimator = this.mRecyclerView.mItemAnimator;
    if (localItemAnimator != null)
    {
      localItemAnimator = this.mRecyclerView.mItemAnimator;
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
      localItemAnimator.endAnimation(localViewHolder);
    }
  }
  
  public View findContainingItemView(View paramView)
  {
    Object localObject1 = null;
    Object localObject2 = this.mRecyclerView;
    if (localObject2 == null) {}
    for (;;)
    {
      return (View)localObject1;
      localObject2 = this.mRecyclerView.findContainingItemView(paramView);
      if (localObject2 != null)
      {
        ChildHelper localChildHelper = this.mChildHelper;
        boolean bool = localChildHelper.isHidden((View)localObject2);
        if (!bool) {
          localObject1 = localObject2;
        }
      }
    }
  }
  
  public View findViewByPosition(int paramInt)
  {
    int i = getChildCount();
    int j = 0;
    View localView = null;
    int k = 0;
    if (k < i)
    {
      localView = getChildAt(k);
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(localView);
      if (localViewHolder == null) {}
      boolean bool2;
      do
      {
        do
        {
          int m;
          do
          {
            j = k + 1;
            k = j;
            break;
            m = localViewHolder.getLayoutPosition();
          } while (m != paramInt);
          bool1 = localViewHolder.shouldIgnore();
        } while (bool1);
        RecyclerView.State localState = this.mRecyclerView.mState;
        boolean bool1 = localState.isPreLayout();
        if (bool1) {
          break label108;
        }
        bool2 = localViewHolder.isRemoved();
      } while (bool2);
    }
    for (;;)
    {
      label108:
      return localView;
      j = 0;
      localView = null;
    }
  }
  
  public abstract RecyclerView.LayoutParams generateDefaultLayoutParams();
  
  public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    RecyclerView.LayoutParams localLayoutParams = new android/support/v7/widget/RecyclerView$LayoutParams;
    localLayoutParams.<init>(paramContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof RecyclerView.LayoutParams;
    RecyclerView.LayoutParams localLayoutParams;
    if (bool)
    {
      localLayoutParams = new android/support/v7/widget/RecyclerView$LayoutParams;
      paramLayoutParams = (RecyclerView.LayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localLayoutParams;
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        localLayoutParams = new android/support/v7/widget/RecyclerView$LayoutParams;
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        localLayoutParams.<init>(paramLayoutParams);
      }
      else
      {
        localLayoutParams = new android/support/v7/widget/RecyclerView$LayoutParams;
        localLayoutParams.<init>(paramLayoutParams);
      }
    }
  }
  
  public int getBaseline()
  {
    return -1;
  }
  
  public int getBottomDecorationHeight(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mDecorInsets.bottom;
  }
  
  public View getChildAt(int paramInt)
  {
    Object localObject = this.mChildHelper;
    if (localObject != null) {}
    for (localObject = this.mChildHelper.getChildAt(paramInt);; localObject = null) {
      return (View)localObject;
    }
  }
  
  public int getChildCount()
  {
    ChildHelper localChildHelper = this.mChildHelper;
    int i;
    if (localChildHelper != null)
    {
      localChildHelper = this.mChildHelper;
      i = localChildHelper.getChildCount();
    }
    for (;;)
    {
      return i;
      i = 0;
      localChildHelper = null;
    }
  }
  
  public boolean getClipToPadding()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    boolean bool;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      bool = localRecyclerView.mClipToPadding;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRecyclerView = null;
    }
  }
  
  public int getColumnCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = 1;
    Object localObject = this.mRecyclerView;
    if (localObject != null)
    {
      localObject = this.mRecyclerView.mAdapter;
      if (localObject != null) {
        break label29;
      }
    }
    for (;;)
    {
      return i;
      label29:
      boolean bool = canScrollHorizontally();
      if (bool)
      {
        RecyclerView.Adapter localAdapter = this.mRecyclerView.mAdapter;
        i = localAdapter.getItemCount();
      }
    }
  }
  
  public int getDecoratedBottom(View paramView)
  {
    int i = paramView.getBottom();
    int j = getBottomDecorationHeight(paramView);
    return i + j;
  }
  
  public void getDecoratedBoundsWithMargins(View paramView, Rect paramRect)
  {
    RecyclerView.getDecoratedBoundsWithMarginsInt(paramView, paramRect);
  }
  
  public int getDecoratedLeft(View paramView)
  {
    int i = paramView.getLeft();
    int j = getLeftDecorationWidth(paramView);
    return i - j;
  }
  
  public int getDecoratedMeasuredHeight(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mDecorInsets;
    int i = paramView.getMeasuredHeight();
    int j = localRect.top;
    i += j;
    return localRect.bottom + i;
  }
  
  public int getDecoratedMeasuredWidth(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mDecorInsets;
    int i = paramView.getMeasuredWidth();
    int j = localRect.left;
    i += j;
    return localRect.right + i;
  }
  
  public int getDecoratedRight(View paramView)
  {
    int i = paramView.getRight();
    int j = getRightDecorationWidth(paramView);
    return i + j;
  }
  
  public int getDecoratedTop(View paramView)
  {
    int i = paramView.getTop();
    int j = getTopDecorationHeight(paramView);
    return i - j;
  }
  
  public View getFocusedChild()
  {
    Object localObject1 = null;
    Object localObject2 = this.mRecyclerView;
    if (localObject2 == null) {}
    for (;;)
    {
      return (View)localObject1;
      localObject2 = this.mRecyclerView.getFocusedChild();
      if (localObject2 != null)
      {
        ChildHelper localChildHelper = this.mChildHelper;
        boolean bool = localChildHelper.isHidden((View)localObject2);
        if (!bool) {
          localObject1 = localObject2;
        }
      }
    }
  }
  
  public int getHeight()
  {
    return this.mHeight;
  }
  
  public int getHeightMode()
  {
    return this.mHeightMode;
  }
  
  public int getItemCount()
  {
    Object localObject = this.mRecyclerView;
    int i;
    if (localObject != null)
    {
      localObject = this.mRecyclerView.getAdapter();
      if (localObject == null) {
        break label35;
      }
      i = ((RecyclerView.Adapter)localObject).getItemCount();
    }
    for (;;)
    {
      return i;
      i = 0;
      localObject = null;
      break;
      label35:
      i = 0;
      localObject = null;
    }
  }
  
  public int getItemViewType(View paramView)
  {
    return RecyclerView.getChildViewHolderInt(paramView).getItemViewType();
  }
  
  public int getLayoutDirection()
  {
    return r.e(this.mRecyclerView);
  }
  
  public int getLeftDecorationWidth(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mDecorInsets.left;
  }
  
  public int getMinimumHeight()
  {
    return r.j(this.mRecyclerView);
  }
  
  public int getMinimumWidth()
  {
    return r.i(this.mRecyclerView);
  }
  
  public int getPaddingBottom()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      i = localRecyclerView.getPaddingBottom();
    }
    for (;;)
    {
      return i;
      i = 0;
      localRecyclerView = null;
    }
  }
  
  public int getPaddingEnd()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      i = r.h(localRecyclerView);
    }
    for (;;)
    {
      return i;
      i = 0;
      localRecyclerView = null;
    }
  }
  
  public int getPaddingLeft()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      i = localRecyclerView.getPaddingLeft();
    }
    for (;;)
    {
      return i;
      i = 0;
      localRecyclerView = null;
    }
  }
  
  public int getPaddingRight()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      i = localRecyclerView.getPaddingRight();
    }
    for (;;)
    {
      return i;
      i = 0;
      localRecyclerView = null;
    }
  }
  
  public int getPaddingStart()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      i = r.g(localRecyclerView);
    }
    for (;;)
    {
      return i;
      i = 0;
      localRecyclerView = null;
    }
  }
  
  public int getPaddingTop()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    int i;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      i = localRecyclerView.getPaddingTop();
    }
    for (;;)
    {
      return i;
      i = 0;
      localRecyclerView = null;
    }
  }
  
  public int getPosition(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).getViewLayoutPosition();
  }
  
  public int getRightDecorationWidth(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mDecorInsets.right;
  }
  
  public int getRowCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = 1;
    Object localObject = this.mRecyclerView;
    if (localObject != null)
    {
      localObject = this.mRecyclerView.mAdapter;
      if (localObject != null) {
        break label29;
      }
    }
    for (;;)
    {
      return i;
      label29:
      boolean bool = canScrollVertically();
      if (bool)
      {
        RecyclerView.Adapter localAdapter = this.mRecyclerView.mAdapter;
        i = localAdapter.getItemCount();
      }
    }
  }
  
  public int getSelectionModeForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int getTopDecorationHeight(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mDecorInsets.top;
  }
  
  public void getTransformedBoundingBox(View paramView, boolean paramBoolean, Rect paramRect)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject;
    int m;
    int i1;
    if (paramBoolean)
    {
      localObject = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mDecorInsets;
      int j = -((Rect)localObject).left;
      i = -((Rect)localObject).top;
      m = paramView.getWidth();
      int n = ((Rect)localObject).right;
      m += n;
      n = paramView.getHeight();
      i1 = ((Rect)localObject).bottom + n;
      paramRect.set(j, i, m, i1);
    }
    for (;;)
    {
      localObject = this.mRecyclerView;
      if (localObject != null)
      {
        localObject = paramView.getMatrix();
        if (localObject != null)
        {
          boolean bool = ((Matrix)localObject).isIdentity();
          if (!bool)
          {
            RectF localRectF = this.mRecyclerView.mTempRectF;
            localRectF.set(paramRect);
            ((Matrix)localObject).mapRect(localRectF);
            float f2 = localRectF.left;
            i1 = (int)Math.floor(f2);
            f1 = localRectF.top;
            double d1 = Math.floor(f1);
            i = (int)d1;
            float f3 = localRectF.right;
            m = (int)Math.ceil(f3);
            float f4 = localRectF.bottom;
            double d2 = Math.ceil(f4);
            k = (int)d2;
            paramRect.set(i1, i, m, k);
          }
        }
      }
      i1 = paramView.getLeft();
      int k = paramView.getTop();
      paramRect.offset(i1, k);
      return;
      i1 = paramView.getWidth();
      k = paramView.getHeight();
      paramRect.set(0, 0, i1, k);
    }
  }
  
  public int getWidth()
  {
    return this.mWidth;
  }
  
  public int getWidthMode()
  {
    return this.mWidthMode;
  }
  
  boolean hasFlexibleChildInBothOrientations()
  {
    boolean bool = false;
    int i = getChildCount();
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        ViewGroup.LayoutParams localLayoutParams = getChildAt(j).getLayoutParams();
        int k = localLayoutParams.width;
        if (k < 0)
        {
          int m = localLayoutParams.height;
          if (m < 0) {
            bool = true;
          }
        }
      }
      else
      {
        return bool;
      }
      j += 1;
    }
  }
  
  public boolean hasFocus()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    boolean bool;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      bool = localRecyclerView.hasFocus();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRecyclerView = null;
    }
  }
  
  public void ignoreView(View paramView)
  {
    Object localObject1 = paramView.getParent();
    Object localObject2 = this.mRecyclerView;
    if (localObject1 == localObject2)
    {
      localObject1 = this.mRecyclerView;
      int i = ((RecyclerView)localObject1).indexOfChild(paramView);
      int j = -1;
      if (i != j) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("View should be fully attached to be ignored");
      String str = this.mRecyclerView.exceptionLabel();
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = RecyclerView.getChildViewHolderInt(paramView);
    ((RecyclerView.ViewHolder)localObject1).addFlags(128);
    this.mRecyclerView.mViewInfoStore.removeViewHolder((RecyclerView.ViewHolder)localObject1);
  }
  
  public boolean isAttachedToWindow()
  {
    return this.mIsAttachedToWindow;
  }
  
  public boolean isAutoMeasureEnabled()
  {
    return this.mAutoMeasure;
  }
  
  public boolean isFocused()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    boolean bool;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      bool = localRecyclerView.isFocused();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRecyclerView = null;
    }
  }
  
  public final boolean isItemPrefetchEnabled()
  {
    return this.mItemPrefetchEnabled;
  }
  
  public boolean isLayoutHierarchical(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return false;
  }
  
  public boolean isMeasurementCacheEnabled()
  {
    return this.mMeasurementCacheEnabled;
  }
  
  public boolean isSmoothScrolling()
  {
    RecyclerView.SmoothScroller localSmoothScroller = this.mSmoothScroller;
    boolean bool;
    if (localSmoothScroller != null)
    {
      localSmoothScroller = this.mSmoothScroller;
      bool = localSmoothScroller.isRunning();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSmoothScroller = null;
    }
  }
  
  public boolean isViewPartiallyVisible(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    int i = 24579;
    float f2 = 3.4443E-41F;
    ViewBoundsCheck localViewBoundsCheck = this.mHorizontalBoundCheck;
    boolean bool3 = localViewBoundsCheck.isViewWithinBoundFlags(paramView, i);
    boolean bool2;
    if (bool3)
    {
      localViewBoundsCheck = this.mVerticalBoundCheck;
      bool2 = localViewBoundsCheck.isViewWithinBoundFlags(paramView, i);
      if (bool2)
      {
        bool2 = bool1;
        f2 = f1;
        if (!paramBoolean1) {
          break label91;
        }
        bool1 = bool2;
        f1 = f2;
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      f2 = 0.0F;
      break;
      label91:
      if (bool2)
      {
        bool1 = false;
        f1 = 0.0F;
      }
    }
  }
  
  public void layoutDecorated(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).mDecorInsets;
    int i = localRect.left + paramInt1;
    int j = localRect.top + paramInt2;
    int k = localRect.right;
    k = paramInt3 - k;
    int m = localRect.bottom;
    m = paramInt4 - m;
    paramView.layout(i, j, k, m);
  }
  
  public void layoutDecoratedWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = localLayoutParams.mDecorInsets;
    int i = localRect.left + paramInt1;
    int j = localLayoutParams.leftMargin;
    i += j;
    j = localRect.top + paramInt2;
    int k = localLayoutParams.topMargin;
    j += k;
    k = localRect.right;
    k = paramInt3 - k;
    int m = localLayoutParams.rightMargin;
    k -= m;
    int n = localRect.bottom;
    n = paramInt4 - n;
    int i1 = localLayoutParams.bottomMargin;
    i1 = n - i1;
    paramView.layout(i, j, k, i1);
  }
  
  public void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = this.mRecyclerView.getItemDecorInsetsForChild(paramView);
    int i = localRect.left;
    int j = localRect.right;
    i = i + j + paramInt1;
    j = localRect.top;
    int k = localRect.bottom + j + paramInt2;
    j = getWidth();
    int m = getWidthMode();
    int n = getPaddingLeft();
    int i1 = getPaddingRight();
    n += i1;
    i += n;
    n = localLayoutParams.width;
    boolean bool1 = canScrollHorizontally();
    i = getChildMeasureSpec(j, m, i, n, bool1);
    j = getHeight();
    m = getHeightMode();
    n = getPaddingTop();
    int i2 = getPaddingBottom();
    n += i2;
    k += n;
    n = localLayoutParams.height;
    boolean bool2 = canScrollVertically();
    k = getChildMeasureSpec(j, m, k, n, bool2);
    boolean bool3 = shouldMeasureChild(paramView, i, k, localLayoutParams);
    if (bool3) {
      paramView.measure(i, k);
    }
  }
  
  public void measureChildWithMargins(View paramView, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = this.mRecyclerView.getItemDecorInsetsForChild(paramView);
    int i = localRect.left;
    int j = localRect.right;
    i = i + j + paramInt1;
    j = localRect.top;
    int k = localRect.bottom + j + paramInt2;
    j = getWidth();
    int m = getWidthMode();
    int n = getPaddingLeft();
    int i1 = getPaddingRight();
    n += i1;
    i1 = localLayoutParams.leftMargin;
    n += i1;
    i1 = localLayoutParams.rightMargin;
    n += i1;
    i += n;
    n = localLayoutParams.width;
    boolean bool1 = canScrollHorizontally();
    i = getChildMeasureSpec(j, m, i, n, bool1);
    j = getHeight();
    m = getHeightMode();
    n = getPaddingTop();
    int i2 = getPaddingBottom();
    n += i2;
    i2 = localLayoutParams.topMargin;
    n += i2;
    i2 = localLayoutParams.bottomMargin;
    n += i2;
    k += n;
    n = localLayoutParams.height;
    boolean bool2 = canScrollVertically();
    k = getChildMeasureSpec(j, m, k, n, bool2);
    boolean bool3 = shouldMeasureChild(paramView, i, k, localLayoutParams);
    if (bool3) {
      paramView.measure(i, k);
    }
  }
  
  public void moveView(int paramInt1, int paramInt2)
  {
    Object localObject1 = getChildAt(paramInt1);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Cannot move a child from non-existing index:").append(paramInt1);
      String str = this.mRecyclerView.toString();
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    detachViewAt(paramInt1);
    attachView((View)localObject1, paramInt2);
  }
  
  public void offsetChildrenHorizontal(int paramInt)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      localRecyclerView.offsetChildrenHorizontal(paramInt);
    }
  }
  
  public void offsetChildrenVertical(int paramInt)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      localRecyclerView.offsetChildrenVertical(paramInt);
    }
  }
  
  public void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2) {}
  
  public boolean onAddFocusables(RecyclerView paramRecyclerView, ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public void onAttachedToWindow(RecyclerView paramRecyclerView) {}
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView) {}
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    onDetachedFromWindow(paramRecyclerView);
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return null;
  }
  
  public void onInitializeAccessibilityEvent(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, AccessibilityEvent paramAccessibilityEvent)
  {
    int i = -1;
    int j = 1;
    RecyclerView localRecyclerView = this.mRecyclerView;
    if ((localRecyclerView == null) || (paramAccessibilityEvent == null)) {
      return;
    }
    localRecyclerView = this.mRecyclerView;
    boolean bool = localRecyclerView.canScrollVertically(j);
    if (!bool)
    {
      localRecyclerView = this.mRecyclerView;
      bool = localRecyclerView.canScrollVertically(i);
      if (!bool)
      {
        localRecyclerView = this.mRecyclerView;
        bool = localRecyclerView.canScrollHorizontally(i);
        if (!bool)
        {
          localRecyclerView = this.mRecyclerView;
          bool = localRecyclerView.canScrollHorizontally(j);
          if (!bool) {
            break label147;
          }
        }
      }
    }
    for (;;)
    {
      paramAccessibilityEvent.setScrollable(j);
      RecyclerView.Adapter localAdapter = this.mRecyclerView.mAdapter;
      if (localAdapter == null) {
        break;
      }
      localAdapter = this.mRecyclerView.mAdapter;
      int k = localAdapter.getItemCount();
      paramAccessibilityEvent.setItemCount(k);
      break;
      label147:
      k = 0;
      localAdapter = null;
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    RecyclerView.Recycler localRecycler = this.mRecyclerView.mRecycler;
    RecyclerView.State localState = this.mRecyclerView.mState;
    onInitializeAccessibilityEvent(localRecycler, localState, paramAccessibilityEvent);
  }
  
  void onInitializeAccessibilityNodeInfo(b paramb)
  {
    RecyclerView.Recycler localRecycler = this.mRecyclerView.mRecycler;
    RecyclerView.State localState = this.mRecyclerView.mState;
    onInitializeAccessibilityNodeInfo(localRecycler, localState, paramb);
  }
  
  public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, b paramb)
  {
    int i = -1;
    int j = 1;
    Object localObject = this.mRecyclerView;
    boolean bool2 = ((RecyclerView)localObject).canScrollVertically(i);
    if (!bool2)
    {
      localObject = this.mRecyclerView;
      bool2 = ((RecyclerView)localObject).canScrollHorizontally(i);
      if (!bool2) {}
    }
    else
    {
      int m = 8192;
      paramb.a(m);
      paramb.k(j);
    }
    localObject = this.mRecyclerView;
    boolean bool3 = ((RecyclerView)localObject).canScrollVertically(j);
    if (!bool3)
    {
      localObject = this.mRecyclerView;
      bool3 = ((RecyclerView)localObject).canScrollHorizontally(j);
      if (!bool3) {}
    }
    else
    {
      n = 4096;
      paramb.a(n);
      paramb.k(j);
    }
    int n = getRowCountForAccessibility(paramRecycler, paramState);
    int k = getColumnCountForAccessibility(paramRecycler, paramState);
    boolean bool1 = isLayoutHierarchical(paramRecycler, paramState);
    int i1 = getSelectionModeForAccessibility(paramRecycler, paramState);
    localObject = b.b.a(n, k, bool1, i1);
    paramb.a(localObject);
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, View paramView, b paramb)
  {
    int i = 1;
    boolean bool1 = canScrollVertically();
    int j;
    if (bool1)
    {
      j = getPosition(paramView);
      boolean bool2 = canScrollHorizontally();
      if (!bool2) {
        break label71;
      }
    }
    label71:
    for (int k = getPosition(paramView);; k = 0)
    {
      b.c localc = b.c.a(j, i, k, i, false, false);
      paramb.b(localc);
      return;
      j = 0;
      localc = null;
      break;
    }
  }
  
  void onInitializeAccessibilityNodeInfoForItem(View paramView, b paramb)
  {
    Object localObject1 = RecyclerView.getChildViewHolderInt(paramView);
    if (localObject1 != null)
    {
      boolean bool1 = ((RecyclerView.ViewHolder)localObject1).isRemoved();
      if (!bool1)
      {
        Object localObject2 = this.mChildHelper;
        localObject1 = ((RecyclerView.ViewHolder)localObject1).itemView;
        boolean bool2 = ((ChildHelper)localObject2).isHidden((View)localObject1);
        if (!bool2)
        {
          localObject1 = this.mRecyclerView.mRecycler;
          localObject2 = this.mRecyclerView.mState;
          onInitializeAccessibilityNodeInfoForItem((RecyclerView.Recycler)localObject1, (RecyclerView.State)localObject2, paramView, paramb);
        }
      }
    }
  }
  
  public View onInterceptFocusSearch(View paramView, int paramInt)
  {
    return null;
  }
  
  public void onItemsAdded(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsChanged(RecyclerView paramRecyclerView) {}
  
  public void onItemsMoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onItemsRemoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    onItemsUpdated(paramRecyclerView, paramInt1, paramInt2);
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState) {}
  
  public void onMeasure(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2)
  {
    this.mRecyclerView.defaultOnMeasure(paramInt1, paramInt2);
  }
  
  public boolean onRequestChildFocus(RecyclerView paramRecyclerView, RecyclerView.State paramState, View paramView1, View paramView2)
  {
    return onRequestChildFocus(paramRecyclerView, paramView1, paramView2);
  }
  
  public boolean onRequestChildFocus(RecyclerView paramRecyclerView, View paramView1, View paramView2)
  {
    boolean bool = isSmoothScrolling();
    if (!bool)
    {
      bool = paramRecyclerView.isComputingLayout();
      if (!bool) {
        break label28;
      }
    }
    label28:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public void onScrollStateChanged(int paramInt) {}
  
  boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    RecyclerView.Recycler localRecycler = this.mRecyclerView.mRecycler;
    RecyclerView.State localState = this.mRecyclerView.mState;
    return performAccessibilityAction(localRecycler, localState, paramInt, paramBundle);
  }
  
  public boolean performAccessibilityAction(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt, Bundle paramBundle)
  {
    int i = -1;
    int j = 1;
    boolean bool1 = false;
    RecyclerView localRecyclerView1 = null;
    RecyclerView localRecyclerView2 = this.mRecyclerView;
    if (localRecyclerView2 == null) {}
    int i1;
    RecyclerView localRecyclerView3;
    for (;;)
    {
      return bool1;
      switch (paramInt)
      {
      default: 
        int k = 0;
        localRecyclerView2 = null;
        i1 = 0;
        localRecyclerView3 = null;
        if ((i1 != 0) || (k != 0))
        {
          localRecyclerView1 = this.mRecyclerView;
          localRecyclerView1.scrollBy(k, i1);
          bool1 = j;
        }
        break;
      }
    }
    localRecyclerView2 = this.mRecyclerView;
    boolean bool2 = localRecyclerView2.canScrollVertically(i);
    int m;
    if (bool2)
    {
      m = getHeight();
      i1 = getPaddingTop();
      m -= i1;
      i1 = getPaddingBottom();
      m = -(m - i1);
    }
    for (;;)
    {
      localRecyclerView3 = this.mRecyclerView;
      boolean bool4 = localRecyclerView3.canScrollHorizontally(i);
      int i4;
      if (bool4)
      {
        int i2 = getWidth();
        i = getPaddingLeft();
        i2 -= i;
        i = getPaddingRight();
        i4 = -(i2 - i);
        i2 = m;
        m = i4;
        break;
        localRecyclerView2 = this.mRecyclerView;
        boolean bool3 = localRecyclerView2.canScrollVertically(j);
        if (!bool3) {
          break label341;
        }
        n = getHeight();
        i2 = getPaddingTop();
        n -= i2;
        i2 = getPaddingBottom();
        n -= i2;
      }
      for (;;)
      {
        localRecyclerView3 = this.mRecyclerView;
        boolean bool5 = localRecyclerView3.canScrollHorizontally(j);
        if (bool5)
        {
          i3 = getWidth();
          i = getPaddingLeft();
          i3 -= i;
          i = getPaddingRight();
          i4 = i3 - i;
          i3 = n;
          n = i4;
          break;
        }
        int i3 = n;
        n = 0;
        localRecyclerView2 = null;
        break;
        label341:
        n = 0;
        localRecyclerView2 = null;
      }
      int n = 0;
      localRecyclerView2 = null;
    }
  }
  
  public boolean performAccessibilityActionForItem(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }
  
  boolean performAccessibilityActionForItem(View paramView, int paramInt, Bundle paramBundle)
  {
    RecyclerView.Recycler localRecycler = this.mRecyclerView.mRecycler;
    RecyclerView.State localState = this.mRecyclerView.mState;
    return performAccessibilityActionForItem(localRecycler, localState, paramView, paramInt, paramBundle);
  }
  
  public void postOnAnimation(Runnable paramRunnable)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      r.a(localRecyclerView, paramRunnable);
    }
  }
  
  public void removeAllViews()
  {
    int i = getChildCount() + -1;
    while (i >= 0)
    {
      ChildHelper localChildHelper = this.mChildHelper;
      localChildHelper.removeViewAt(i);
      i += -1;
    }
  }
  
  public void removeAndRecycleAllViews(RecyclerView.Recycler paramRecycler)
  {
    int i = getChildCount() + -1;
    while (i >= 0)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(getChildAt(i));
      boolean bool = localViewHolder.shouldIgnore();
      if (!bool) {
        removeAndRecycleViewAt(i, paramRecycler);
      }
      i += -1;
    }
  }
  
  void removeAndRecycleScrapInt(RecyclerView.Recycler paramRecycler)
  {
    int i = paramRecycler.getScrapCount();
    int j = i + -1;
    if (j >= 0)
    {
      View localView = paramRecycler.getScrapViewAt(j);
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(localView);
      boolean bool = localViewHolder.shouldIgnore();
      if (bool) {}
      for (;;)
      {
        j += -1;
        break;
        localViewHolder.setIsRecyclable(false);
        bool = localViewHolder.isTmpDetached();
        if (bool)
        {
          localObject = this.mRecyclerView;
          ((RecyclerView)localObject).removeDetachedView(localView, false);
        }
        Object localObject = this.mRecyclerView.mItemAnimator;
        if (localObject != null)
        {
          localObject = this.mRecyclerView.mItemAnimator;
          ((RecyclerView.ItemAnimator)localObject).endAnimation(localViewHolder);
        }
        bool = true;
        localViewHolder.setIsRecyclable(bool);
        paramRecycler.quickRecycleScrapView(localView);
      }
    }
    paramRecycler.clearScrap();
    if (i > 0)
    {
      RecyclerView localRecyclerView = this.mRecyclerView;
      localRecyclerView.invalidate();
    }
  }
  
  public void removeAndRecycleView(View paramView, RecyclerView.Recycler paramRecycler)
  {
    removeView(paramView);
    paramRecycler.recycleView(paramView);
  }
  
  public void removeAndRecycleViewAt(int paramInt, RecyclerView.Recycler paramRecycler)
  {
    View localView = getChildAt(paramInt);
    removeViewAt(paramInt);
    paramRecycler.recycleView(localView);
  }
  
  public boolean removeCallbacks(Runnable paramRunnable)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    boolean bool;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      bool = localRecyclerView.removeCallbacks(paramRunnable);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRecyclerView = null;
    }
  }
  
  public void removeDetachedView(View paramView)
  {
    this.mRecyclerView.removeDetachedView(paramView, false);
  }
  
  public void removeView(View paramView)
  {
    this.mChildHelper.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt)
  {
    Object localObject = getChildAt(paramInt);
    if (localObject != null)
    {
      localObject = this.mChildHelper;
      ((ChildHelper)localObject).removeViewAt(paramInt);
    }
  }
  
  public boolean requestChildRectangleOnScreen(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
  {
    return requestChildRectangleOnScreen(paramRecyclerView, paramView, paramRect, paramBoolean, false);
  }
  
  public boolean requestChildRectangleOnScreen(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int[] arrayOfInt = getChildRectangleOnScreenScrollAmount(paramRecyclerView, paramView, paramRect, paramBoolean1);
    int i = arrayOfInt[0];
    int j = arrayOfInt[bool1];
    if (paramBoolean2)
    {
      boolean bool3 = isFocusedChildVisibleAfterScrolling(paramRecyclerView, i, j);
      if (!bool3) {}
    }
    else if ((i != 0) || (j != 0))
    {
      if (!paramBoolean1) {
        break label81;
      }
      paramRecyclerView.scrollBy(i, j);
    }
    for (;;)
    {
      bool2 = bool1;
      return bool2;
      label81:
      paramRecyclerView.smoothScrollBy(i, j);
    }
  }
  
  public void requestLayout()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView != null)
    {
      localRecyclerView = this.mRecyclerView;
      localRecyclerView.requestLayout();
    }
  }
  
  public void requestSimpleAnimationsInNextLayout()
  {
    this.mRequestedSimpleAnimations = true;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return 0;
  }
  
  public void scrollToPosition(int paramInt) {}
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return 0;
  }
  
  public void setAutoMeasureEnabled(boolean paramBoolean)
  {
    this.mAutoMeasure = paramBoolean;
  }
  
  void setExactMeasureSpecsFrom(RecyclerView paramRecyclerView)
  {
    int i = 1073741824;
    int j = View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), i);
    int k = View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), i);
    setMeasureSpecs(j, k);
  }
  
  public final void setItemPrefetchEnabled(boolean paramBoolean)
  {
    boolean bool = this.mItemPrefetchEnabled;
    if (paramBoolean != bool)
    {
      this.mItemPrefetchEnabled = paramBoolean;
      bool = false;
      this.mPrefetchMaxCountObserved = 0;
      Object localObject = this.mRecyclerView;
      if (localObject != null)
      {
        localObject = this.mRecyclerView.mRecycler;
        ((RecyclerView.Recycler)localObject).updateViewCacheSize();
      }
    }
  }
  
  void setMeasureSpecs(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    this.mWidth = i;
    i = View.MeasureSpec.getMode(paramInt1);
    this.mWidthMode = i;
    i = this.mWidthMode;
    if (i == 0)
    {
      boolean bool1 = RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
      if (!bool1) {
        this.mWidth = 0;
      }
    }
    int j = View.MeasureSpec.getSize(paramInt2);
    this.mHeight = j;
    j = View.MeasureSpec.getMode(paramInt2);
    this.mHeightMode = j;
    j = this.mHeightMode;
    if (j == 0)
    {
      boolean bool2 = RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
      if (!bool2) {
        this.mHeight = 0;
      }
    }
  }
  
  public void setMeasuredDimension(int paramInt1, int paramInt2)
  {
    RecyclerView.access$1200(this.mRecyclerView, paramInt1, paramInt2);
  }
  
  public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = paramRect.width();
    int j = getPaddingLeft();
    i += j;
    j = getPaddingRight();
    i += j;
    j = paramRect.height();
    int k = getPaddingTop();
    j += k;
    k = getPaddingBottom();
    j += k;
    k = getMinimumWidth();
    i = chooseSize(paramInt1, i, k);
    k = getMinimumHeight();
    j = chooseSize(paramInt2, j, k);
    setMeasuredDimension(i, j);
  }
  
  void setMeasuredDimensionFromChildren(int paramInt1, int paramInt2)
  {
    int i = -1 >>> 1;
    int j = -1 << -1;
    int k = getChildCount();
    Object localObject;
    if (k == 0)
    {
      localObject = this.mRecyclerView;
      ((RecyclerView)localObject).defaultOnMeasure(paramInt1, paramInt2);
    }
    for (;;)
    {
      return;
      localObject = null;
      int m = 0;
      Rect localRect1 = null;
      int n = j;
      int i1 = i;
      while (m < k)
      {
        View localView = getChildAt(m);
        Rect localRect2 = this.mRecyclerView.mTempRect;
        getDecoratedBoundsWithMargins(localView, localRect2);
        int i2 = localRect2.left;
        if (i2 < i1) {
          i1 = localRect2.left;
        }
        i2 = localRect2.right;
        if (i2 > n) {
          n = localRect2.right;
        }
        i2 = localRect2.top;
        if (i2 < i) {
          i = localRect2.top;
        }
        i2 = localRect2.bottom;
        if (i2 > j) {
          j = localRect2.bottom;
        }
        m += 1;
      }
      localRect1 = this.mRecyclerView.mTempRect;
      localRect1.set(i1, i, n, j);
      localObject = this.mRecyclerView.mTempRect;
      setMeasuredDimension((Rect)localObject, paramInt1, paramInt2);
    }
  }
  
  public void setMeasurementCacheEnabled(boolean paramBoolean)
  {
    this.mMeasurementCacheEnabled = paramBoolean;
  }
  
  void setRecyclerView(RecyclerView paramRecyclerView)
  {
    int i = 1073741824;
    int j = 0;
    ChildHelper localChildHelper = null;
    if (paramRecyclerView == null)
    {
      this.mRecyclerView = null;
      this.mChildHelper = null;
      this.mWidth = 0;
    }
    for (this.mHeight = 0;; this.mHeight = j)
    {
      this.mWidthMode = i;
      this.mHeightMode = i;
      return;
      this.mRecyclerView = paramRecyclerView;
      localChildHelper = paramRecyclerView.mChildHelper;
      this.mChildHelper = localChildHelper;
      j = paramRecyclerView.getWidth();
      this.mWidth = j;
      j = paramRecyclerView.getHeight();
    }
  }
  
  boolean shouldMeasureChild(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    boolean bool1 = paramView.isLayoutRequested();
    if (!bool1)
    {
      bool1 = this.mMeasurementCacheEnabled;
      if (bool1)
      {
        int i = paramView.getWidth();
        int k = paramLayoutParams.width;
        boolean bool2 = isMeasurementUpToDate(i, paramInt1, k);
        if (bool2)
        {
          int j = paramView.getHeight();
          k = paramLayoutParams.height;
          bool3 = isMeasurementUpToDate(j, paramInt2, k);
          if (bool3) {
            break label84;
          }
        }
      }
    }
    label84:
    for (boolean bool3 = true;; bool3 = false) {
      return bool3;
    }
  }
  
  boolean shouldMeasureTwice()
  {
    return false;
  }
  
  boolean shouldReMeasureChild(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    boolean bool1 = this.mMeasurementCacheEnabled;
    if (bool1)
    {
      int i = paramView.getMeasuredWidth();
      int k = paramLayoutParams.width;
      boolean bool2 = isMeasurementUpToDate(i, paramInt1, k);
      if (bool2)
      {
        int j = paramView.getMeasuredHeight();
        k = paramLayoutParams.height;
        bool3 = isMeasurementUpToDate(j, paramInt2, k);
        if (bool3) {
          break label73;
        }
      }
    }
    label73:
    for (boolean bool3 = true;; bool3 = false) {
      return bool3;
    }
  }
  
  public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt)
  {
    Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
  }
  
  public void startSmoothScroll(RecyclerView.SmoothScroller paramSmoothScroller)
  {
    RecyclerView.SmoothScroller localSmoothScroller = this.mSmoothScroller;
    if (localSmoothScroller != null)
    {
      localSmoothScroller = this.mSmoothScroller;
      if (paramSmoothScroller != localSmoothScroller)
      {
        localSmoothScroller = this.mSmoothScroller;
        boolean bool = localSmoothScroller.isRunning();
        if (bool)
        {
          localSmoothScroller = this.mSmoothScroller;
          localSmoothScroller.stop();
        }
      }
    }
    this.mSmoothScroller = paramSmoothScroller;
    localSmoothScroller = this.mSmoothScroller;
    RecyclerView localRecyclerView = this.mRecyclerView;
    localSmoothScroller.start(localRecyclerView, this);
  }
  
  public void stopIgnoringView(View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    localViewHolder.stopIgnoring();
    localViewHolder.resetInternal();
    localViewHolder.addFlags(4);
  }
  
  void stopSmoothScroller()
  {
    RecyclerView.SmoothScroller localSmoothScroller = this.mSmoothScroller;
    if (localSmoothScroller != null)
    {
      localSmoothScroller = this.mSmoothScroller;
      localSmoothScroller.stop();
    }
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$LayoutManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */