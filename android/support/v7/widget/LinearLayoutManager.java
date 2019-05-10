package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager
  extends RecyclerView.LayoutManager
  implements RecyclerView.SmoothScroller.ScrollVectorProvider, ItemTouchHelper.ViewDropHandler
{
  static final boolean DEBUG = false;
  public static final int HORIZONTAL = 0;
  public static final int INVALID_OFFSET = Integer.MIN_VALUE;
  private static final float MAX_SCROLL_FACTOR = 0.33333334F;
  private static final String TAG = "LinearLayoutManager";
  public static final int VERTICAL = 1;
  final LinearLayoutManager.AnchorInfo mAnchorInfo;
  private int mInitialPrefetchItemCount;
  private boolean mLastStackFromEnd;
  private final LinearLayoutManager.LayoutChunkResult mLayoutChunkResult;
  private LinearLayoutManager.LayoutState mLayoutState;
  int mOrientation;
  OrientationHelper mOrientationHelper;
  LinearLayoutManager.SavedState mPendingSavedState;
  int mPendingScrollPosition;
  int mPendingScrollPositionOffset;
  private boolean mRecycleChildrenOnDetach;
  private boolean mReverseLayout;
  boolean mShouldReverseLayout;
  private boolean mSmoothScrollbarEnabled;
  private boolean mStackFromEnd;
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    this.mOrientation = i;
    this.mReverseLayout = false;
    this.mShouldReverseLayout = false;
    this.mStackFromEnd = false;
    this.mSmoothScrollbarEnabled = i;
    this.mPendingScrollPosition = -1;
    this.mPendingScrollPositionOffset = (-1 << -1);
    this.mPendingSavedState = null;
    Object localObject = new android/support/v7/widget/LinearLayoutManager$AnchorInfo;
    ((LinearLayoutManager.AnchorInfo)localObject).<init>();
    this.mAnchorInfo = ((LinearLayoutManager.AnchorInfo)localObject);
    localObject = new android/support/v7/widget/LinearLayoutManager$LayoutChunkResult;
    ((LinearLayoutManager.LayoutChunkResult)localObject).<init>();
    this.mLayoutChunkResult = ((LinearLayoutManager.LayoutChunkResult)localObject);
    this.mInitialPrefetchItemCount = 2;
    setOrientation(paramInt);
    setReverseLayout(paramBoolean);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.mOrientation = i;
    this.mReverseLayout = false;
    this.mShouldReverseLayout = false;
    this.mStackFromEnd = false;
    this.mSmoothScrollbarEnabled = i;
    this.mPendingScrollPosition = -1;
    this.mPendingScrollPositionOffset = (-1 << -1);
    this.mPendingSavedState = null;
    Object localObject = new android/support/v7/widget/LinearLayoutManager$AnchorInfo;
    ((LinearLayoutManager.AnchorInfo)localObject).<init>();
    this.mAnchorInfo = ((LinearLayoutManager.AnchorInfo)localObject);
    localObject = new android/support/v7/widget/LinearLayoutManager$LayoutChunkResult;
    ((LinearLayoutManager.LayoutChunkResult)localObject).<init>();
    this.mLayoutChunkResult = ((LinearLayoutManager.LayoutChunkResult)localObject);
    this.mInitialPrefetchItemCount = 2;
    localObject = getProperties(paramContext, paramAttributeSet, paramInt1, paramInt2);
    i = ((RecyclerView.LayoutManager.Properties)localObject).orientation;
    setOrientation(i);
    boolean bool1 = ((RecyclerView.LayoutManager.Properties)localObject).reverseLayout;
    setReverseLayout(bool1);
    boolean bool2 = ((RecyclerView.LayoutManager.Properties)localObject).stackFromEnd;
    setStackFromEnd(bool2);
  }
  
  private int computeScrollExtent(RecyclerView.State paramState)
  {
    int i = 0;
    int k = 1;
    int m = getChildCount();
    if (m == 0) {
      return i;
    }
    ensureLayoutState();
    OrientationHelper localOrientationHelper = this.mOrientationHelper;
    boolean bool1 = this.mSmoothScrollbarEnabled;
    if (!bool1) {}
    for (bool1 = k;; bool1 = false)
    {
      View localView1 = findFirstVisibleChildClosestToStart(bool1, k);
      bool1 = this.mSmoothScrollbarEnabled;
      if (!bool1) {
        i = k;
      }
      View localView2 = findFirstVisibleChildClosestToEnd(i, k);
      boolean bool2 = this.mSmoothScrollbarEnabled;
      int j = ScrollbarHelper.computeScrollExtent(paramState, localOrientationHelper, localView1, localView2, this, bool2);
      break;
    }
  }
  
  private int computeScrollOffset(RecyclerView.State paramState)
  {
    int i = 0;
    int k = 1;
    int m = getChildCount();
    if (m == 0) {
      return i;
    }
    ensureLayoutState();
    OrientationHelper localOrientationHelper = this.mOrientationHelper;
    boolean bool1 = this.mSmoothScrollbarEnabled;
    if (!bool1) {}
    for (bool1 = k;; bool1 = false)
    {
      View localView1 = findFirstVisibleChildClosestToStart(bool1, k);
      bool1 = this.mSmoothScrollbarEnabled;
      if (!bool1) {
        i = k;
      }
      View localView2 = findFirstVisibleChildClosestToEnd(i, k);
      boolean bool2 = this.mSmoothScrollbarEnabled;
      boolean bool3 = this.mShouldReverseLayout;
      int j = ScrollbarHelper.computeScrollOffset(paramState, localOrientationHelper, localView1, localView2, this, bool2, bool3);
      break;
    }
  }
  
  private int computeScrollRange(RecyclerView.State paramState)
  {
    int i = 0;
    int k = 1;
    int m = getChildCount();
    if (m == 0) {
      return i;
    }
    ensureLayoutState();
    OrientationHelper localOrientationHelper = this.mOrientationHelper;
    boolean bool1 = this.mSmoothScrollbarEnabled;
    if (!bool1) {}
    for (bool1 = k;; bool1 = false)
    {
      View localView1 = findFirstVisibleChildClosestToStart(bool1, k);
      bool1 = this.mSmoothScrollbarEnabled;
      if (!bool1) {
        i = k;
      }
      View localView2 = findFirstVisibleChildClosestToEnd(i, k);
      boolean bool2 = this.mSmoothScrollbarEnabled;
      int j = ScrollbarHelper.computeScrollRange(paramState, localOrientationHelper, localView1, localView2, this, bool2);
      break;
    }
  }
  
  private View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = getChildCount();
    return findOnePartiallyOrCompletelyInvisibleChild(0, i);
  }
  
  private View findFirstReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = getChildCount();
    int j = paramState.getItemCount();
    return findReferenceChild(paramRecycler, paramState, 0, i, j);
  }
  
  private View findFirstVisibleChildClosestToEnd(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.mShouldReverseLayout;
    int j;
    if (bool)
    {
      bool = false;
      j = getChildCount();
    }
    int i;
    for (View localView = findOneVisibleChild(0, j, paramBoolean1, paramBoolean2);; localView = findOneVisibleChild(i, j, paramBoolean1, paramBoolean2))
    {
      return localView;
      i = getChildCount() + -1;
      j = -1;
    }
  }
  
  private View findFirstVisibleChildClosestToStart(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.mShouldReverseLayout;
    int i;
    int j;
    if (bool)
    {
      i = getChildCount() + -1;
      j = -1;
    }
    for (View localView = findOneVisibleChild(i, j, paramBoolean1, paramBoolean2);; localView = findOneVisibleChild(0, j, paramBoolean1, paramBoolean2))
    {
      return localView;
      i = 0;
      j = getChildCount();
    }
  }
  
  private View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = getChildCount() + -1;
    return findOnePartiallyOrCompletelyInvisibleChild(i, -1);
  }
  
  private View findLastReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = getChildCount() + -1;
    int j = paramState.getItemCount();
    return findReferenceChild(paramRecycler, paramState, i, -1, j);
  }
  
  private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    boolean bool = this.mShouldReverseLayout;
    if (bool) {}
    for (View localView = findFirstPartiallyOrCompletelyInvisibleChild(paramRecycler, paramState);; localView = findLastPartiallyOrCompletelyInvisibleChild(paramRecycler, paramState)) {
      return localView;
    }
  }
  
  private View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    boolean bool = this.mShouldReverseLayout;
    if (bool) {}
    for (View localView = findLastPartiallyOrCompletelyInvisibleChild(paramRecycler, paramState);; localView = findFirstPartiallyOrCompletelyInvisibleChild(paramRecycler, paramState)) {
      return localView;
    }
  }
  
  private View findReferenceChildClosestToEnd(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    boolean bool = this.mShouldReverseLayout;
    if (bool) {}
    for (View localView = findFirstReferenceChild(paramRecycler, paramState);; localView = findLastReferenceChild(paramRecycler, paramState)) {
      return localView;
    }
  }
  
  private View findReferenceChildClosestToStart(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    boolean bool = this.mShouldReverseLayout;
    if (bool) {}
    for (View localView = findLastReferenceChild(paramRecycler, paramState);; localView = findFirstReferenceChild(paramRecycler, paramState)) {
      return localView;
    }
  }
  
  private int fixLayoutEndGap(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    OrientationHelper localOrientationHelper1 = this.mOrientationHelper;
    int i = localOrientationHelper1.getEndAfterPadding() - paramInt;
    if (i > 0)
    {
      i = -i;
      i = -scrollBy(i, paramRecycler, paramState);
      int j = paramInt + i;
      if (paramBoolean)
      {
        OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
        int k = localOrientationHelper2.getEndAfterPadding();
        j = k - j;
        if (j > 0)
        {
          localOrientationHelper2 = this.mOrientationHelper;
          localOrientationHelper2.offsetChildren(j);
          i += j;
        }
      }
    }
    for (;;)
    {
      return i;
      i = 0;
      localOrientationHelper1 = null;
    }
  }
  
  private int fixLayoutStartGap(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    OrientationHelper localOrientationHelper1 = this.mOrientationHelper;
    int i = localOrientationHelper1.getStartAfterPadding();
    i = paramInt - i;
    if (i > 0)
    {
      i = -scrollBy(i, paramRecycler, paramState);
      int j = paramInt + i;
      if (paramBoolean)
      {
        OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
        int k = localOrientationHelper2.getStartAfterPadding();
        j -= k;
        if (j > 0)
        {
          localOrientationHelper2 = this.mOrientationHelper;
          int m = -j;
          localOrientationHelper2.offsetChildren(m);
          i -= j;
        }
      }
    }
    for (;;)
    {
      return i;
      i = 0;
      localOrientationHelper1 = null;
    }
  }
  
  private View getChildClosestToEnd()
  {
    int i = this.mShouldReverseLayout;
    if (i != 0) {}
    int j;
    for (i = 0;; j = getChildCount() + -1) {
      return getChildAt(i);
    }
  }
  
  private View getChildClosestToStart()
  {
    boolean bool = this.mShouldReverseLayout;
    if (bool) {}
    for (int i = getChildCount() + -1;; i = 0) {
      return getChildAt(i);
    }
  }
  
  private void layoutForPredictiveAnimations(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2)
  {
    boolean bool = paramState.willRunPredictiveAnimations();
    int j;
    if (bool)
    {
      int i = getChildCount();
      if (i != 0)
      {
        j = paramState.isPreLayout();
        if (j == 0)
        {
          j = supportsPredictiveItemAnimations();
          if (j != 0) {
            break label45;
          }
        }
      }
    }
    for (;;)
    {
      return;
      label45:
      int m = 0;
      int n = 0;
      List localList = paramRecycler.getScrapList();
      int i1 = localList.size();
      Object localObject = getChildAt(0);
      int i2 = getPosition((View)localObject);
      j = 0;
      localObject = null;
      int i3 = 0;
      label165:
      label232:
      label238:
      int k;
      if (i3 < i1)
      {
        localObject = (RecyclerView.ViewHolder)localList.get(i3);
        int i4 = ((RecyclerView.ViewHolder)localObject).isRemoved();
        if (i4 != 0)
        {
          j = n;
          i4 = m;
        }
        for (;;)
        {
          i3 += 1;
          m = i4;
          n = j;
          break;
          i5 = ((RecyclerView.ViewHolder)localObject).getLayoutPosition();
          if (i5 < i2)
          {
            i5 = 1;
            int i6 = this.mShouldReverseLayout;
            if (i5 == i6) {
              break label232;
            }
          }
          for (i5 = -1;; i5 = 1)
          {
            int i7 = -1;
            if (i5 != i7) {
              break label238;
            }
            localOrientationHelper = this.mOrientationHelper;
            localObject = ((RecyclerView.ViewHolder)localObject).itemView;
            i5 = localOrientationHelper.getDecoratedMeasurement((View)localObject) + m;
            j = n;
            break;
            i5 = 0;
            localOrientationHelper = null;
            break label165;
          }
          localOrientationHelper = this.mOrientationHelper;
          localObject = ((RecyclerView.ViewHolder)localObject).itemView;
          k = localOrientationHelper.getDecoratedMeasurement((View)localObject) + n;
          i5 = m;
        }
      }
      localObject = this.mLayoutState;
      ((LinearLayoutManager.LayoutState)localObject).mScrapList = localList;
      if (m > 0)
      {
        localObject = getChildClosestToStart();
        k = getPosition((View)localObject);
        updateLayoutStateToFillStart(k, paramInt1);
        this.mLayoutState.mExtra = m;
        this.mLayoutState.mAvailable = 0;
        this.mLayoutState.assignPositionFromScrapList();
        localObject = this.mLayoutState;
        i5 = 0;
        localOrientationHelper = null;
        fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject, paramState, false);
      }
      if (n > 0)
      {
        localObject = getChildClosestToEnd();
        k = getPosition((View)localObject);
        updateLayoutStateToFillEnd(k, paramInt2);
        this.mLayoutState.mExtra = n;
        this.mLayoutState.mAvailable = 0;
        this.mLayoutState.assignPositionFromScrapList();
        localObject = this.mLayoutState;
        i5 = 0;
        localOrientationHelper = null;
        fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject, paramState, false);
      }
      localObject = this.mLayoutState;
      int i5 = 0;
      OrientationHelper localOrientationHelper = null;
      ((LinearLayoutManager.LayoutState)localObject).mScrapList = null;
    }
  }
  
  private void logChildren()
  {
    Object localObject = "internal representation of views on the screen";
    Log.d("LinearLayoutManager", (String)localObject);
    int i = 0;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      localObject = getChildAt(i);
      String str = "LinearLayoutManager";
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder = localStringBuilder.append("item ");
      int k = getPosition((View)localObject);
      localStringBuilder = localStringBuilder.append(k).append(", coord:");
      OrientationHelper localOrientationHelper = this.mOrientationHelper;
      j = localOrientationHelper.getDecoratedStart((View)localObject);
      localObject = j;
      Log.d(str, (String)localObject);
      i += 1;
    }
    Log.d("LinearLayoutManager", "==============");
  }
  
  private void recycleByLayoutState(RecyclerView.Recycler paramRecycler, LinearLayoutManager.LayoutState paramLayoutState)
  {
    boolean bool = paramLayoutState.mRecycle;
    if (bool)
    {
      bool = paramLayoutState.mInfinite;
      if (!bool) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      label19:
      int i = paramLayoutState.mLayoutDirection;
      int j = -1;
      if (i == j)
      {
        i = paramLayoutState.mScrollingOffset;
        recycleViewsFromEnd(paramRecycler, i);
      }
      else
      {
        i = paramLayoutState.mScrollingOffset;
        recycleViewsFromStart(paramRecycler, i);
      }
    }
  }
  
  private void recycleChildren(RecyclerView.Recycler paramRecycler, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      if (paramInt2 > paramInt1)
      {
        int i = paramInt2 + -1;
        while (i >= paramInt1)
        {
          removeAndRecycleViewAt(i, paramRecycler);
          i += -1;
        }
      }
      else
      {
        while (paramInt1 > paramInt2)
        {
          removeAndRecycleViewAt(paramInt1, paramRecycler);
          paramInt1 += -1;
        }
      }
    }
  }
  
  private void recycleViewsFromEnd(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    int i = 0;
    View localView = null;
    int j = getChildCount();
    if (paramInt < 0) {}
    label125:
    label211:
    for (;;)
    {
      return;
      OrientationHelper localOrientationHelper1 = this.mOrientationHelper;
      int k = localOrientationHelper1.getEnd() - paramInt;
      int m = this.mShouldReverseLayout;
      Object localObject;
      int i2;
      int n;
      if (m != 0)
      {
        m = 0;
        localOrientationHelper1 = null;
        for (;;)
        {
          if (m >= j) {
            break label125;
          }
          localObject = getChildAt(m);
          OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
          int i1 = localOrientationHelper2.getDecoratedStart((View)localObject);
          if (i1 >= k)
          {
            localOrientationHelper2 = this.mOrientationHelper;
            i2 = localOrientationHelper2.getTransformedStartWithDecoration((View)localObject);
            if (i2 >= k) {}
          }
          else
          {
            recycleChildren(paramRecycler, 0, m);
            break;
          }
          m += 1;
        }
      }
      else
      {
        n = j + -1;
        for (;;)
        {
          if (n < 0) {
            break label211;
          }
          localView = getChildAt(n);
          localObject = this.mOrientationHelper;
          i2 = ((OrientationHelper)localObject).getDecoratedStart(localView);
          if (i2 >= k)
          {
            localObject = this.mOrientationHelper;
            i = ((OrientationHelper)localObject).getTransformedStartWithDecoration(localView);
            if (i >= k) {}
          }
          else
          {
            i = j + -1;
            recycleChildren(paramRecycler, i, n);
            break;
          }
          n += -1;
        }
      }
    }
  }
  
  private void recycleViewsFromStart(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    int i = 0;
    View localView = null;
    if (paramInt < 0) {}
    label109:
    label189:
    for (;;)
    {
      return;
      int j = getChildCount();
      boolean bool = this.mShouldReverseLayout;
      int k;
      Object localObject;
      int m;
      if (bool)
      {
        k = j + -1;
        for (;;)
        {
          if (k < 0) {
            break label109;
          }
          localView = getChildAt(k);
          localObject = this.mOrientationHelper;
          m = ((OrientationHelper)localObject).getDecoratedEnd(localView);
          if (m <= paramInt)
          {
            localObject = this.mOrientationHelper;
            i = ((OrientationHelper)localObject).getTransformedEndWithDecoration(localView);
            if (i <= paramInt) {}
          }
          else
          {
            i = j + -1;
            recycleChildren(paramRecycler, i, k);
            break;
          }
          k += -1;
        }
      }
      else
      {
        k = 0;
        for (;;)
        {
          if (k >= j) {
            break label189;
          }
          localObject = getChildAt(k);
          OrientationHelper localOrientationHelper = this.mOrientationHelper;
          int n = localOrientationHelper.getDecoratedEnd((View)localObject);
          if (n <= paramInt)
          {
            localOrientationHelper = this.mOrientationHelper;
            m = localOrientationHelper.getTransformedEndWithDecoration((View)localObject);
            if (m <= paramInt) {}
          }
          else
          {
            recycleChildren(paramRecycler, 0, k);
            break;
          }
          k += 1;
        }
      }
    }
  }
  
  private void resolveShouldLayoutReverse()
  {
    int i = 1;
    int j = this.mOrientation;
    if (j != i)
    {
      bool = isLayoutRTL();
      if (bool) {}
    }
    else
    {
      i = this.mReverseLayout;
      this.mShouldReverseLayout = i;
      return;
    }
    boolean bool = this.mReverseLayout;
    if (!bool) {}
    for (;;)
    {
      this.mShouldReverseLayout = i;
      break;
      i = 0;
    }
  }
  
  private boolean updateAnchorFromChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.AnchorInfo paramAnchorInfo)
  {
    int i = 1;
    boolean bool1 = false;
    OrientationHelper localOrientationHelper1 = null;
    int m = getChildCount();
    if (m == 0) {}
    View localView;
    boolean bool4;
    int j;
    do
    {
      for (;;)
      {
        return bool1;
        localView = getFocusedChild();
        if (localView == null) {
          break;
        }
        bool4 = paramAnchorInfo.isViewValidAsAnchor(localView, paramState);
        if (!bool4) {
          break;
        }
        j = getPosition(localView);
        paramAnchorInfo.assignFromViewAndKeepVisibleRect(localView, j);
        j = i;
      }
      bool3 = this.mLastStackFromEnd;
      bool4 = this.mStackFromEnd;
    } while (bool3 != bool4);
    boolean bool3 = paramAnchorInfo.mLayoutFromEnd;
    if (bool3)
    {
      localView = findReferenceChildClosestToEnd(paramRecycler, paramState);
      label109:
      if (localView == null) {
        break label273;
      }
      int i1 = getPosition(localView);
      paramAnchorInfo.assignFromView(localView, i1);
      boolean bool5 = paramState.isPreLayout();
      if (!bool5)
      {
        bool5 = supportsPredictiveItemAnimations();
        if (bool5)
        {
          OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
          int i2 = localOrientationHelper2.getDecoratedStart(localView);
          OrientationHelper localOrientationHelper3 = this.mOrientationHelper;
          int i3 = localOrientationHelper3.getEndAfterPadding();
          if (i2 < i3)
          {
            int n = this.mOrientationHelper.getDecoratedEnd(localView);
            localOrientationHelper2 = this.mOrientationHelper;
            i2 = localOrientationHelper2.getStartAfterPadding();
            if (n >= i2) {}
          }
          else
          {
            j = i;
          }
          if (j != 0)
          {
            boolean bool2 = paramAnchorInfo.mLayoutFromEnd;
            if (!bool2) {
              break label275;
            }
            localOrientationHelper1 = this.mOrientationHelper;
          }
        }
      }
    }
    for (int k = localOrientationHelper1.getEndAfterPadding();; k = localOrientationHelper1.getStartAfterPadding())
    {
      paramAnchorInfo.mCoordinate = k;
      k = i;
      break;
      localView = findReferenceChildClosestToStart(paramRecycler, paramState);
      break label109;
      label273:
      break;
      label275:
      localOrientationHelper1 = this.mOrientationHelper;
    }
  }
  
  private boolean updateAnchorFromPendingData(RecyclerView.State paramState, LinearLayoutManager.AnchorInfo paramAnchorInfo)
  {
    int i = -1;
    int j = -1 << -1;
    int k = 0;
    Object localObject1 = null;
    int n = 1;
    boolean bool2 = paramState.isPreLayout();
    int i1;
    if (!bool2)
    {
      i1 = this.mPendingScrollPosition;
      if (i1 != i) {}
    }
    else
    {
      n = 0;
    }
    for (;;)
    {
      return n;
      i1 = this.mPendingScrollPosition;
      int i4;
      if (i1 >= 0)
      {
        i1 = this.mPendingScrollPosition;
        i4 = paramState.getItemCount();
        if (i1 < i4) {}
      }
      else
      {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = j;
        n = 0;
        continue;
      }
      i1 = this.mPendingScrollPosition;
      paramAnchorInfo.mPosition = i1;
      Object localObject2 = this.mPendingSavedState;
      if (localObject2 != null)
      {
        localObject2 = this.mPendingSavedState;
        boolean bool3 = ((LinearLayoutManager.SavedState)localObject2).hasValidAnchor();
        if (bool3)
        {
          localObject2 = this.mPendingSavedState;
          bool3 = ((LinearLayoutManager.SavedState)localObject2).mAnchorLayoutFromEnd;
          paramAnchorInfo.mLayoutFromEnd = bool3;
          bool3 = paramAnchorInfo.mLayoutFromEnd;
          if (bool3)
          {
            localObject2 = this.mOrientationHelper;
            i2 = ((OrientationHelper)localObject2).getEndAfterPadding();
            localObject1 = this.mPendingSavedState;
            k = ((LinearLayoutManager.SavedState)localObject1).mAnchorOffset;
            i2 -= k;
            paramAnchorInfo.mCoordinate = i2;
            continue;
          }
          localObject2 = this.mOrientationHelper;
          i2 = ((OrientationHelper)localObject2).getStartAfterPadding();
          localObject1 = this.mPendingSavedState;
          k = ((LinearLayoutManager.SavedState)localObject1).mAnchorOffset;
          i2 += k;
          paramAnchorInfo.mCoordinate = i2;
          continue;
        }
      }
      int i2 = this.mPendingScrollPositionOffset;
      int m;
      if (i2 == j)
      {
        i2 = this.mPendingScrollPosition;
        localObject2 = findViewByPosition(i2);
        if (localObject2 != null)
        {
          OrientationHelper localOrientationHelper1 = this.mOrientationHelper;
          i4 = localOrientationHelper1.getDecoratedMeasurement((View)localObject2);
          OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
          j = localOrientationHelper2.getTotalSpace();
          if (i4 > j)
          {
            paramAnchorInfo.assignCoordinateFromPadding();
          }
          else
          {
            localOrientationHelper1 = this.mOrientationHelper;
            i4 = localOrientationHelper1.getDecoratedStart((View)localObject2);
            localOrientationHelper2 = this.mOrientationHelper;
            j = localOrientationHelper2.getStartAfterPadding();
            i4 -= j;
            if (i4 < 0)
            {
              localObject2 = this.mOrientationHelper;
              i2 = ((OrientationHelper)localObject2).getStartAfterPadding();
              paramAnchorInfo.mCoordinate = i2;
              paramAnchorInfo.mLayoutFromEnd = false;
            }
            else
            {
              localObject1 = this.mOrientationHelper;
              k = ((OrientationHelper)localObject1).getEndAfterPadding();
              localOrientationHelper1 = this.mOrientationHelper;
              i4 = localOrientationHelper1.getDecoratedEnd((View)localObject2);
              k -= i4;
              if (k < 0)
              {
                localObject2 = this.mOrientationHelper;
                i2 = ((OrientationHelper)localObject2).getEndAfterPadding();
                paramAnchorInfo.mCoordinate = i2;
                paramAnchorInfo.mLayoutFromEnd = n;
              }
              else
              {
                boolean bool1 = paramAnchorInfo.mLayoutFromEnd;
                if (bool1)
                {
                  i2 = this.mOrientationHelper.getDecoratedEnd((View)localObject2);
                  localObject1 = this.mOrientationHelper;
                  m = ((OrientationHelper)localObject1).getTotalSpaceChange();
                  i2 += m;
                }
                for (;;)
                {
                  paramAnchorInfo.mCoordinate = i2;
                  break;
                  localObject1 = this.mOrientationHelper;
                  i2 = ((OrientationHelper)localObject1).getDecoratedStart((View)localObject2);
                }
              }
            }
          }
        }
        else
        {
          i2 = getChildCount();
          if (i2 > 0)
          {
            localObject2 = getChildAt(0);
            i2 = getPosition((View)localObject2);
            i4 = this.mPendingScrollPosition;
            if (i4 >= i2) {
              break label598;
            }
            i2 = n;
          }
          for (;;)
          {
            int i5 = this.mShouldReverseLayout;
            if (i2 == i5) {
              m = n;
            }
            paramAnchorInfo.mLayoutFromEnd = m;
            paramAnchorInfo.assignCoordinateFromPadding();
            break;
            label598:
            i2 = 0;
            localObject2 = null;
          }
        }
      }
      else
      {
        boolean bool4 = this.mShouldReverseLayout;
        paramAnchorInfo.mLayoutFromEnd = bool4;
        bool4 = this.mShouldReverseLayout;
        int i3;
        if (bool4)
        {
          localObject2 = this.mOrientationHelper;
          i3 = ((OrientationHelper)localObject2).getEndAfterPadding();
          m = this.mPendingScrollPositionOffset;
          i3 -= m;
          paramAnchorInfo.mCoordinate = i3;
        }
        else
        {
          localObject2 = this.mOrientationHelper;
          i3 = ((OrientationHelper)localObject2).getStartAfterPadding();
          m = this.mPendingScrollPositionOffset;
          i3 += m;
          paramAnchorInfo.mCoordinate = i3;
        }
      }
    }
  }
  
  private void updateAnchorInfoForLayout(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.AnchorInfo paramAnchorInfo)
  {
    boolean bool = updateAnchorFromPendingData(paramState, paramAnchorInfo);
    if (bool) {}
    do
    {
      return;
      bool = updateAnchorFromChildren(paramRecycler, paramState, paramAnchorInfo);
    } while (bool);
    paramAnchorInfo.assignCoordinateFromPadding();
    bool = this.mStackFromEnd;
    if (bool) {}
    for (int i = paramState.getItemCount() + -1;; i = 0)
    {
      paramAnchorInfo.mPosition = i;
      break;
    }
  }
  
  private void updateLayoutState(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.State paramState)
  {
    int i = -1;
    float f1 = 0.0F / 0.0F;
    int j = 1;
    float f2 = Float.MIN_VALUE;
    Object localObject1 = this.mLayoutState;
    boolean bool1 = resolveIsInfinite();
    ((LinearLayoutManager.LayoutState)localObject1).mInfinite = bool1;
    localObject1 = this.mLayoutState;
    int k = getExtraLayoutSpace(paramState);
    ((LinearLayoutManager.LayoutState)localObject1).mExtra = k;
    localObject1 = this.mLayoutState;
    ((LinearLayoutManager.LayoutState)localObject1).mLayoutDirection = paramInt1;
    Object localObject2;
    Object localObject3;
    if (paramInt1 == j)
    {
      localObject1 = this.mLayoutState;
      k = ((LinearLayoutManager.LayoutState)localObject1).mExtra;
      OrientationHelper localOrientationHelper1 = this.mOrientationHelper;
      int m = localOrientationHelper1.getEndPadding();
      k += m;
      ((LinearLayoutManager.LayoutState)localObject1).mExtra = k;
      localObject1 = getChildClosestToEnd();
      localLayoutState = this.mLayoutState;
      boolean bool2 = this.mShouldReverseLayout;
      if (bool2) {}
      for (;;)
      {
        localLayoutState.mItemDirection = i;
        localObject2 = this.mLayoutState;
        j = getPosition((View)localObject1);
        localLayoutState = this.mLayoutState;
        k = localLayoutState.mItemDirection;
        j += k;
        ((LinearLayoutManager.LayoutState)localObject2).mCurrentPosition = j;
        localObject2 = this.mLayoutState;
        j = this.mOrientationHelper.getDecoratedEnd((View)localObject1);
        ((LinearLayoutManager.LayoutState)localObject2).mOffset = j;
        localObject2 = this.mOrientationHelper;
        i = ((OrientationHelper)localObject2).getDecoratedEnd((View)localObject1);
        localObject3 = this.mOrientationHelper;
        j = ((OrientationHelper)localObject3).getEndAfterPadding();
        i -= j;
        localObject3 = this.mLayoutState;
        ((LinearLayoutManager.LayoutState)localObject3).mAvailable = paramInt2;
        if (paramBoolean)
        {
          localObject3 = this.mLayoutState;
          int i1 = ((LinearLayoutManager.LayoutState)localObject3).mAvailable - i;
          ((LinearLayoutManager.LayoutState)localObject3).mAvailable = i1;
        }
        this.mLayoutState.mScrollingOffset = i;
        return;
        i = j;
        f1 = f2;
      }
    }
    localObject1 = getChildClosestToStart();
    LinearLayoutManager.LayoutState localLayoutState = this.mLayoutState;
    int n = localLayoutState.mExtra;
    OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
    int i2 = localOrientationHelper2.getStartAfterPadding();
    n += i2;
    localLayoutState.mExtra = n;
    localLayoutState = this.mLayoutState;
    boolean bool3 = this.mShouldReverseLayout;
    if (bool3) {}
    for (;;)
    {
      localLayoutState.mItemDirection = j;
      localObject2 = this.mLayoutState;
      j = getPosition((View)localObject1);
      localLayoutState = this.mLayoutState;
      k = localLayoutState.mItemDirection;
      j += k;
      ((LinearLayoutManager.LayoutState)localObject2).mCurrentPosition = j;
      localObject2 = this.mLayoutState;
      j = this.mOrientationHelper.getDecoratedStart((View)localObject1);
      ((LinearLayoutManager.LayoutState)localObject2).mOffset = j;
      localObject2 = this.mOrientationHelper;
      i = -((OrientationHelper)localObject2).getDecoratedStart((View)localObject1);
      localObject3 = this.mOrientationHelper;
      j = ((OrientationHelper)localObject3).getStartAfterPadding();
      i += j;
      break;
      j = i;
      f2 = f1;
    }
  }
  
  private void updateLayoutStateToFillEnd(int paramInt1, int paramInt2)
  {
    int i = 1;
    LinearLayoutManager.LayoutState localLayoutState1 = this.mLayoutState;
    int j = this.mOrientationHelper.getEndAfterPadding() - paramInt2;
    localLayoutState1.mAvailable = j;
    LinearLayoutManager.LayoutState localLayoutState2 = this.mLayoutState;
    boolean bool = this.mShouldReverseLayout;
    if (bool) {}
    for (int k = -1;; k = i)
    {
      localLayoutState2.mItemDirection = k;
      this.mLayoutState.mCurrentPosition = paramInt1;
      this.mLayoutState.mLayoutDirection = i;
      this.mLayoutState.mOffset = paramInt2;
      this.mLayoutState.mScrollingOffset = (-1 << -1);
      return;
    }
  }
  
  private void updateLayoutStateToFillEnd(LinearLayoutManager.AnchorInfo paramAnchorInfo)
  {
    int i = paramAnchorInfo.mPosition;
    int j = paramAnchorInfo.mCoordinate;
    updateLayoutStateToFillEnd(i, j);
  }
  
  private void updateLayoutStateToFillStart(int paramInt1, int paramInt2)
  {
    int i = -1;
    LinearLayoutManager.LayoutState localLayoutState1 = this.mLayoutState;
    int j = this.mOrientationHelper.getStartAfterPadding();
    j = paramInt2 - j;
    localLayoutState1.mAvailable = j;
    localLayoutState1 = this.mLayoutState;
    localLayoutState1.mCurrentPosition = paramInt1;
    LinearLayoutManager.LayoutState localLayoutState2 = this.mLayoutState;
    int k = this.mShouldReverseLayout;
    if (k != 0) {}
    for (k = 1;; k = i)
    {
      localLayoutState2.mItemDirection = k;
      this.mLayoutState.mLayoutDirection = i;
      this.mLayoutState.mOffset = paramInt2;
      this.mLayoutState.mScrollingOffset = (-1 << -1);
      return;
    }
  }
  
  private void updateLayoutStateToFillStart(LinearLayoutManager.AnchorInfo paramAnchorInfo)
  {
    int i = paramAnchorInfo.mPosition;
    int j = paramAnchorInfo.mCoordinate;
    updateLayoutStateToFillStart(i, j);
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    LinearLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    if (localSavedState == null) {
      super.assertNotInLayoutOrScroll(paramString);
    }
  }
  
  public boolean canScrollHorizontally()
  {
    int i = this.mOrientation;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean canScrollVertically()
  {
    int i = 1;
    int j = this.mOrientation;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = 1;
    int j = this.mOrientation;
    if (j == 0) {}
    for (;;)
    {
      j = getChildCount();
      if ((j != 0) && (paramInt1 != 0)) {
        break;
      }
      return;
      paramInt1 = paramInt2;
    }
    ensureLayoutState();
    if (paramInt1 > 0) {}
    for (j = i;; j = -1)
    {
      int k = Math.abs(paramInt1);
      updateLayoutState(j, k, i, paramState);
      LinearLayoutManager.LayoutState localLayoutState = this.mLayoutState;
      collectPrefetchPositionsForLayoutState(paramState, localLayoutState, paramLayoutPrefetchRegistry);
      break;
    }
  }
  
  public void collectInitialPrefetchPositions(int paramInt, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = -1;
    LinearLayoutManager.SavedState localSavedState1 = this.mPendingSavedState;
    int m;
    if (localSavedState1 != null)
    {
      localSavedState1 = this.mPendingSavedState;
      j = localSavedState1.hasValidAnchor();
      if (j != 0)
      {
        localSavedState1 = this.mPendingSavedState;
        j = localSavedState1.mAnchorLayoutFromEnd;
        LinearLayoutManager.SavedState localSavedState2 = this.mPendingSavedState;
        m = localSavedState2.mAnchorPosition;
        if (j == 0) {
          break label178;
        }
      }
    }
    int k;
    label178:
    for (int j = i;; k = 1)
    {
      i = 0;
      for (;;)
      {
        int n = this.mInitialPrefetchItemCount;
        if ((i >= n) || (m < 0) || (m >= paramInt)) {
          break;
        }
        paramLayoutPrefetchRegistry.addPosition(m, 0);
        m += j;
        i += 1;
      }
      resolveShouldLayoutReverse();
      int i1 = this.mShouldReverseLayout;
      k = this.mPendingScrollPosition;
      if (k == i)
      {
        if (i1 != 0) {
          k = paramInt + -1;
        }
        for (;;)
        {
          m = k;
          k = i1;
          break;
          k = 0;
          localSavedState1 = null;
        }
      }
      m = this.mPendingScrollPosition;
      k = i1;
      break;
    }
  }
  
  void collectPrefetchPositionsForLayoutState(RecyclerView.State paramState, LinearLayoutManager.LayoutState paramLayoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = paramLayoutState.mCurrentPosition;
    if (i >= 0)
    {
      int j = paramState.getItemCount();
      if (i < j)
      {
        int k = paramLayoutState.mScrollingOffset;
        j = Math.max(0, k);
        paramLayoutPrefetchRegistry.addPosition(i, j);
      }
    }
  }
  
  public int computeHorizontalScrollExtent(RecyclerView.State paramState)
  {
    return computeScrollExtent(paramState);
  }
  
  public int computeHorizontalScrollOffset(RecyclerView.State paramState)
  {
    return computeScrollOffset(paramState);
  }
  
  public int computeHorizontalScrollRange(RecyclerView.State paramState)
  {
    return computeScrollRange(paramState);
  }
  
  public PointF computeScrollVectorForPosition(int paramInt)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = 0;
    PointF localPointF = null;
    int k = getChildCount();
    if (k == 0)
    {
      j = 0;
      localPointF = null;
    }
    for (;;)
    {
      return localPointF;
      View localView = getChildAt(0);
      k = getPosition(localView);
      if (paramInt < k) {
        j = i;
      }
      int m = this.mShouldReverseLayout;
      if (j != m)
      {
        i = -1;
        f = 0.0F / 0.0F;
      }
      j = this.mOrientation;
      if (j == 0)
      {
        localPointF = new android/graphics/PointF;
        f = i;
        localPointF.<init>(f, 0.0F);
      }
      else
      {
        localPointF = new android/graphics/PointF;
        f = i;
        localPointF.<init>(0.0F, f);
      }
    }
  }
  
  public int computeVerticalScrollExtent(RecyclerView.State paramState)
  {
    return computeScrollExtent(paramState);
  }
  
  public int computeVerticalScrollOffset(RecyclerView.State paramState)
  {
    return computeScrollOffset(paramState);
  }
  
  public int computeVerticalScrollRange(RecyclerView.State paramState)
  {
    return computeScrollRange(paramState);
  }
  
  int convertFocusDirectionToLayoutDirection(int paramInt)
  {
    int i = -1;
    int j = -1 << -1;
    float f1 = -0.0F;
    int n = 1;
    float f2 = Float.MIN_VALUE;
    int m;
    switch (paramInt)
    {
    default: 
      i = j;
    case 1: 
    case 2: 
    case 33: 
    case 130: 
    case 17: 
      for (;;)
      {
        return i;
        j = this.mOrientation;
        if (j != n)
        {
          boolean bool = isLayoutRTL();
          if (bool)
          {
            i = n;
            continue;
            int k = this.mOrientation;
            if (k == n)
            {
              i = n;
            }
            else
            {
              m = isLayoutRTL();
              if (m == 0)
              {
                i = n;
                continue;
                int i1 = this.mOrientation;
                if (i1 != n)
                {
                  i = m;
                  continue;
                  i = this.mOrientation;
                  if (i == n)
                  {
                    m = n;
                    f1 = f2;
                  }
                  i = m;
                  continue;
                  n = this.mOrientation;
                  if (n != 0) {
                    i = m;
                  }
                }
              }
            }
          }
        }
      }
    }
    i = this.mOrientation;
    if (i == 0) {}
    for (;;)
    {
      i = n;
      break;
      n = m;
      f2 = f1;
    }
  }
  
  LinearLayoutManager.LayoutState createLayoutState()
  {
    LinearLayoutManager.LayoutState localLayoutState = new android/support/v7/widget/LinearLayoutManager$LayoutState;
    localLayoutState.<init>();
    return localLayoutState;
  }
  
  void ensureLayoutState()
  {
    LinearLayoutManager.LayoutState localLayoutState = this.mLayoutState;
    if (localLayoutState == null)
    {
      localLayoutState = createLayoutState();
      this.mLayoutState = localLayoutState;
    }
  }
  
  int fill(RecyclerView.Recycler paramRecycler, LinearLayoutManager.LayoutState paramLayoutState, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = -1 << -1;
    int j = paramLayoutState.mAvailable;
    int k = paramLayoutState.mScrollingOffset;
    if (k != i)
    {
      k = paramLayoutState.mAvailable;
      if (k < 0)
      {
        k = paramLayoutState.mScrollingOffset;
        m = paramLayoutState.mAvailable;
        k += m;
        paramLayoutState.mScrollingOffset = k;
      }
      recycleByLayoutState(paramRecycler, paramLayoutState);
    }
    k = paramLayoutState.mAvailable;
    int m = paramLayoutState.mExtra;
    k += m;
    LinearLayoutManager.LayoutChunkResult localLayoutChunkResult = this.mLayoutChunkResult;
    boolean bool1 = paramLayoutState.mInfinite;
    if ((bool1) || (k > 0))
    {
      bool1 = paramLayoutState.hasMore(paramState);
      if (bool1)
      {
        localLayoutChunkResult.resetInternal();
        layoutChunk(paramRecycler, paramState, paramLayoutState, localLayoutChunkResult);
        bool1 = localLayoutChunkResult.mFinished;
        if (!bool1) {
          break label157;
        }
      }
    }
    for (;;)
    {
      k = paramLayoutState.mAvailable;
      return j - k;
      label157:
      int n = paramLayoutState.mOffset;
      int i2 = localLayoutChunkResult.mConsumed;
      int i3 = paramLayoutState.mLayoutDirection;
      i2 *= i3;
      n += i2;
      paramLayoutState.mOffset = n;
      boolean bool2 = localLayoutChunkResult.mIgnoreConsumed;
      if (bool2)
      {
        List localList = this.mLayoutState.mScrapList;
        if (localList == null)
        {
          bool2 = paramState.isPreLayout();
          if (bool2) {
            break label273;
          }
        }
      }
      int i1 = paramLayoutState.mAvailable;
      i2 = localLayoutChunkResult.mConsumed;
      i1 -= i2;
      paramLayoutState.mAvailable = i1;
      i1 = localLayoutChunkResult.mConsumed;
      k -= i1;
      label273:
      i1 = paramLayoutState.mScrollingOffset;
      if (i1 != i)
      {
        i1 = paramLayoutState.mScrollingOffset;
        i2 = localLayoutChunkResult.mConsumed;
        i1 += i2;
        paramLayoutState.mScrollingOffset = i1;
        i1 = paramLayoutState.mAvailable;
        if (i1 < 0)
        {
          i1 = paramLayoutState.mScrollingOffset;
          i2 = paramLayoutState.mAvailable;
          i1 += i2;
          paramLayoutState.mScrollingOffset = i1;
        }
        recycleByLayoutState(paramRecycler, paramLayoutState);
      }
      if (!paramBoolean) {
        break;
      }
      boolean bool3 = localLayoutChunkResult.mFocusable;
      if (!bool3) {
        break;
      }
    }
  }
  
  public int findFirstCompletelyVisibleItemPosition()
  {
    int i = getChildCount();
    boolean bool = true;
    View localView = findOneVisibleChild(0, i, bool, false);
    if (localView == null) {}
    for (i = -1;; i = getPosition(localView)) {
      return i;
    }
  }
  
  public int findFirstVisibleItemPosition()
  {
    int i = getChildCount();
    boolean bool = true;
    View localView = findOneVisibleChild(0, i, false, bool);
    if (localView == null) {}
    for (i = -1;; i = getPosition(localView)) {
      return i;
    }
  }
  
  public int findLastCompletelyVisibleItemPosition()
  {
    int i = -1;
    int j = getChildCount() + -1;
    boolean bool = true;
    View localView = findOneVisibleChild(j, i, bool, false);
    if (localView == null) {}
    for (;;)
    {
      return i;
      i = getPosition(localView);
    }
  }
  
  public int findLastVisibleItemPosition()
  {
    int i = -1;
    int j = getChildCount() + -1;
    boolean bool = true;
    View localView = findOneVisibleChild(j, i, false, bool);
    if (localView == null) {}
    for (;;)
    {
      return i;
      i = getPosition(localView);
    }
  }
  
  View findOnePartiallyOrCompletelyInvisibleChild(int paramInt1, int paramInt2)
  {
    ensureLayoutState();
    int i;
    Object localObject1;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      if (i != 0) {
        break label43;
      }
      localObject1 = getChildAt(paramInt1);
    }
    for (;;)
    {
      return (View)localObject1;
      if (paramInt2 < paramInt1)
      {
        i = -1;
        break;
      }
      i = 0;
      localObject1 = null;
      break;
      label43:
      localObject1 = this.mOrientationHelper;
      Object localObject2 = getChildAt(paramInt1);
      i = ((OrientationHelper)localObject1).getDecoratedStart((View)localObject2);
      localObject2 = this.mOrientationHelper;
      int j = ((OrientationHelper)localObject2).getStartAfterPadding();
      if (i < j) {
        j = 16644;
      }
      for (i = 16388;; i = 4097)
      {
        int k = this.mOrientation;
        if (k != 0) {
          break label136;
        }
        localViewBoundsCheck = this.mHorizontalBoundCheck;
        localObject1 = localViewBoundsCheck.findOneViewWithinBoundFlags(paramInt1, paramInt2, j, i);
        break;
        j = 4161;
      }
      label136:
      ViewBoundsCheck localViewBoundsCheck = this.mVerticalBoundCheck;
      localObject1 = localViewBoundsCheck.findOneViewWithinBoundFlags(paramInt1, paramInt2, j, i);
    }
  }
  
  View findOneVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 320;
    ensureLayoutState();
    int j = 0;
    ViewBoundsCheck localViewBoundsCheck = null;
    int k;
    if (paramBoolean1)
    {
      k = 24579;
      if (!paramBoolean2) {
        break label91;
      }
    }
    for (;;)
    {
      j = this.mOrientation;
      if (j == 0) {
        localViewBoundsCheck = this.mHorizontalBoundCheck;
      }
      for (View localView = localViewBoundsCheck.findOneViewWithinBoundFlags(paramInt1, paramInt2, k, i);; localView = localViewBoundsCheck.findOneViewWithinBoundFlags(paramInt1, paramInt2, k, i))
      {
        return localView;
        k = i;
        break;
        localViewBoundsCheck = this.mVerticalBoundCheck;
      }
      label91:
      i = 0;
      localView = null;
    }
  }
  
  View findReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    ensureLayoutState();
    int i = this.mOrientationHelper.getStartAfterPadding();
    Object localObject2 = this.mOrientationHelper;
    int j = ((OrientationHelper)localObject2).getEndAfterPadding();
    int n;
    Object localObject3;
    label45:
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      int k = 1;
      n = k;
      localObject3 = null;
      if (paramInt1 == paramInt2) {
        break label195;
      }
      localObject4 = getChildAt(paramInt1);
      k = getPosition((View)localObject4);
      if ((k < 0) || (k >= paramInt3)) {
        break label214;
      }
      localObject2 = (RecyclerView.LayoutParams)((View)localObject4).getLayoutParams();
      boolean bool = ((RecyclerView.LayoutParams)localObject2).isItemRemoved();
      if (!bool) {
        break label135;
      }
      if (localObject3 != null) {
        break label214;
      }
      localObject2 = localObject1;
    }
    for (;;)
    {
      paramInt1 += n;
      localObject1 = localObject2;
      localObject3 = localObject4;
      break label45;
      int m = -1;
      n = m;
      break;
      label135:
      localObject2 = this.mOrientationHelper;
      m = ((OrientationHelper)localObject2).getDecoratedStart((View)localObject4);
      if (m < j)
      {
        localObject2 = this.mOrientationHelper;
        m = ((OrientationHelper)localObject2).getDecoratedEnd((View)localObject4);
        if (m >= i) {}
      }
      else
      {
        if (localObject1 != null) {
          break label214;
        }
        localObject2 = localObject4;
        localObject4 = localObject3;
        continue;
        label195:
        if (localObject1 == null) {
          break label207;
        }
      }
      for (;;)
      {
        localObject4 = localObject1;
        return (View)localObject4;
        label207:
        localObject1 = localObject3;
      }
      label214:
      localObject2 = localObject1;
      localObject4 = localObject3;
    }
  }
  
  public View findViewByPosition(int paramInt)
  {
    int i = getChildCount();
    View localView1;
    if (i == 0)
    {
      i = 0;
      localView1 = null;
    }
    for (;;)
    {
      return localView1;
      View localView2 = getChildAt(0);
      int j = getPosition(localView2);
      j = paramInt - j;
      if ((j >= 0) && (j < i))
      {
        localView1 = getChildAt(j);
        j = getPosition(localView1);
        if (j == paramInt) {}
      }
      else
      {
        localView1 = super.findViewByPosition(paramInt);
      }
    }
  }
  
  public RecyclerView.LayoutParams generateDefaultLayoutParams()
  {
    int i = -2;
    RecyclerView.LayoutParams localLayoutParams = new android/support/v7/widget/RecyclerView$LayoutParams;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  protected int getExtraLayoutSpace(RecyclerView.State paramState)
  {
    boolean bool = paramState.hasTargetScrollPosition();
    OrientationHelper localOrientationHelper;
    int i;
    if (bool)
    {
      localOrientationHelper = this.mOrientationHelper;
      i = localOrientationHelper.getTotalSpace();
    }
    for (;;)
    {
      return i;
      i = 0;
      localOrientationHelper = null;
    }
  }
  
  public int getInitialPrefetchItemCount()
  {
    return this.mInitialPrefetchItemCount;
  }
  
  public int getOrientation()
  {
    return this.mOrientation;
  }
  
  public boolean getRecycleChildrenOnDetach()
  {
    return this.mRecycleChildrenOnDetach;
  }
  
  public boolean getReverseLayout()
  {
    return this.mReverseLayout;
  }
  
  public boolean getStackFromEnd()
  {
    return this.mStackFromEnd;
  }
  
  public boolean isAutoMeasureEnabled()
  {
    return true;
  }
  
  protected boolean isLayoutRTL()
  {
    int i = 1;
    int j = getLayoutDirection();
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public boolean isSmoothScrollbarEnabled()
  {
    return this.mSmoothScrollbarEnabled;
  }
  
  void layoutChunk(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.LayoutState paramLayoutState, LinearLayoutManager.LayoutChunkResult paramLayoutChunkResult)
  {
    int i = -1;
    int j = 1;
    int k = 0;
    OrientationHelper localOrientationHelper = null;
    View localView = paramLayoutState.next(paramRecycler);
    if (localView == null)
    {
      paramLayoutChunkResult.mFinished = j;
      return;
    }
    Object localObject1 = localView.getLayoutParams();
    Object localObject2 = localObject1;
    localObject2 = (RecyclerView.LayoutParams)localObject1;
    localObject1 = paramLayoutState.mScrapList;
    label84:
    label97:
    label192:
    int n;
    int i8;
    if (localObject1 == null)
    {
      int m = this.mShouldReverseLayout;
      int i3 = paramLayoutState.mLayoutDirection;
      if (i3 == i)
      {
        i3 = j;
        if (m != i3) {
          break label309;
        }
        addView(localView);
        measureChildWithMargins(localView, 0, 0);
        localObject1 = this.mOrientationHelper;
        int i4 = ((OrientationHelper)localObject1).getDecoratedMeasurement(localView);
        paramLayoutChunkResult.mConsumed = i4;
        i4 = this.mOrientation;
        if (i4 != j) {
          break label433;
        }
        boolean bool1 = isLayoutRTL();
        if (!bool1) {
          break label377;
        }
        int i5 = getWidth();
        k = getPaddingRight();
        i5 -= k;
        localOrientationHelper = this.mOrientationHelper;
        k = localOrientationHelper.getDecoratedMeasurementInOther(localView);
        k = i5 - k;
        n = paramLayoutState.mLayoutDirection;
        if (n != i) {
          break label404;
        }
        i8 = paramLayoutState.mOffset;
        n = paramLayoutState.mOffset;
        i = paramLayoutChunkResult.mConsumed;
        n -= i;
        i = i5;
      }
    }
    for (;;)
    {
      localObject1 = this;
      layoutDecoratedWithMargins(localView, k, n, i, i8);
      boolean bool2 = ((RecyclerView.LayoutParams)localObject2).isItemRemoved();
      if (!bool2)
      {
        bool2 = ((RecyclerView.LayoutParams)localObject2).isItemChanged();
        if (!bool2) {}
      }
      else
      {
        paramLayoutChunkResult.mIgnoreConsumed = j;
      }
      bool2 = localView.hasFocusable();
      paramLayoutChunkResult.mFocusable = bool2;
      break;
      bool2 = false;
      localObject1 = null;
      break label84;
      label309:
      addView(localView, 0);
      break label97;
      int i1 = this.mShouldReverseLayout;
      int i6 = paramLayoutState.mLayoutDirection;
      if (i6 == i) {
        i6 = j;
      }
      for (;;)
      {
        if (i1 != i6) {
          break label367;
        }
        addDisappearingView(localView);
        break;
        i7 = 0;
        localObject1 = null;
      }
      label367:
      addDisappearingView(localView, 0);
      break label97;
      label377:
      k = getPaddingLeft();
      localObject1 = this.mOrientationHelper;
      int i7 = ((OrientationHelper)localObject1).getDecoratedMeasurementInOther(localView) + k;
      break label192;
      label404:
      int i2 = paramLayoutState.mOffset;
      i = paramLayoutState.mOffset;
      i8 = paramLayoutChunkResult.mConsumed + i;
      i = i7;
      continue;
      label433:
      i2 = getPaddingTop();
      localObject1 = this.mOrientationHelper;
      i7 = ((OrientationHelper)localObject1).getDecoratedMeasurementInOther(localView);
      i8 = i2 + i7;
      i7 = paramLayoutState.mLayoutDirection;
      if (i7 == i)
      {
        i7 = paramLayoutState.mOffset;
        k = paramLayoutState.mOffset;
        i = paramLayoutChunkResult.mConsumed;
        k -= i;
        i = i7;
      }
      else
      {
        k = paramLayoutState.mOffset;
        i7 = paramLayoutState.mOffset;
        i = paramLayoutChunkResult.mConsumed;
        i7 += i;
        i = i7;
      }
    }
  }
  
  void onAnchorReady(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.AnchorInfo paramAnchorInfo, int paramInt) {}
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    super.onDetachedFromWindow(paramRecyclerView, paramRecycler);
    boolean bool = this.mRecycleChildrenOnDetach;
    if (bool)
    {
      removeAndRecycleAllViews(paramRecycler);
      paramRecycler.clear();
    }
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = -1;
    int j = -1 << -1;
    resolveShouldLayoutReverse();
    int k = getChildCount();
    Object localObject1;
    if (k == 0)
    {
      k = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (View)localObject1;
      k = convertFocusDirectionToLayoutDirection(paramInt);
      if (k == j)
      {
        k = 0;
        localObject1 = null;
      }
      else
      {
        ensureLayoutState();
        ensureLayoutState();
        OrientationHelper localOrientationHelper = this.mOrientationHelper;
        float f1 = localOrientationHelper.getTotalSpace();
        float f2 = 0.33333334F * f1;
        int m = (int)f2;
        updateLayoutState(k, m, false, paramState);
        this.mLayoutState.mScrollingOffset = j;
        this.mLayoutState.mRecycle = false;
        Object localObject2 = this.mLayoutState;
        boolean bool = true;
        f1 = Float.MIN_VALUE;
        fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject2, paramState, bool);
        if (k == i)
        {
          localObject2 = findPartiallyOrCompletelyInvisibleChildClosestToStart(paramRecycler, paramState);
          label158:
          if (k != i) {
            break label209;
          }
        }
        label209:
        for (localObject1 = getChildClosestToStart();; localObject1 = getChildClosestToEnd())
        {
          bool = ((View)localObject1).hasFocusable();
          if (!bool) {
            break label218;
          }
          if (localObject2 != null) {
            break;
          }
          k = 0;
          localObject1 = null;
          break;
          localObject2 = findPartiallyOrCompletelyInvisibleChildClosestToEnd(paramRecycler, paramState);
          break label158;
        }
        label218:
        localObject1 = localObject2;
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    int i = getChildCount();
    if (i > 0)
    {
      i = findFirstVisibleItemPosition();
      paramAccessibilityEvent.setFromIndex(i);
      i = findLastVisibleItemPosition();
      paramAccessibilityEvent.setToIndex(i);
    }
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = 1;
    int j = -1;
    int n = 0;
    Object localObject1 = this.mPendingSavedState;
    int i1;
    if (localObject1 == null)
    {
      i1 = this.mPendingScrollPosition;
      if (i1 == j) {}
    }
    else
    {
      i1 = paramState.getItemCount();
      if (i1 == 0)
      {
        removeAndRecycleAllViews(paramRecycler);
        return;
      }
    }
    localObject1 = this.mPendingSavedState;
    if (localObject1 != null)
    {
      localObject1 = this.mPendingSavedState;
      boolean bool3 = ((LinearLayoutManager.SavedState)localObject1).hasValidAnchor();
      if (bool3)
      {
        localObject1 = this.mPendingSavedState;
        i2 = ((LinearLayoutManager.SavedState)localObject1).mAnchorPosition;
        this.mPendingScrollPosition = i2;
      }
    }
    ensureLayoutState();
    this.mLayoutState.mRecycle = false;
    resolveShouldLayoutReverse();
    localObject1 = getFocusedChild();
    Object localObject2 = this.mAnchorInfo;
    boolean bool4 = ((LinearLayoutManager.AnchorInfo)localObject2).mValid;
    if (bool4)
    {
      int i5 = this.mPendingScrollPosition;
      if (i5 == j)
      {
        localObject2 = this.mPendingSavedState;
        if (localObject2 == null) {
          break label938;
        }
      }
    }
    this.mAnchorInfo.reset();
    localObject1 = this.mAnchorInfo;
    boolean bool5 = this.mShouldReverseLayout;
    boolean bool6 = this.mStackFromEnd;
    bool5 ^= bool6;
    ((LinearLayoutManager.AnchorInfo)localObject1).mLayoutFromEnd = bool5;
    localObject1 = this.mAnchorInfo;
    updateAnchorInfoForLayout(paramRecycler, paramState, (LinearLayoutManager.AnchorInfo)localObject1);
    localObject1 = this.mAnchorInfo;
    ((LinearLayoutManager.AnchorInfo)localObject1).mValid = i;
    label226:
    int i2 = getExtraLayoutSpace(paramState);
    localObject2 = this.mLayoutState;
    int i6 = ((LinearLayoutManager.LayoutState)localObject2).mLastScrollDelta;
    label257:
    Object localObject3;
    Object localObject4;
    int i13;
    label413:
    label425:
    label457:
    Object localObject5;
    int k;
    if (i6 >= 0)
    {
      i6 = 0;
      localObject2 = null;
      int i7 = this.mOrientationHelper.getStartAfterPadding();
      i6 += i7;
      localObject3 = this.mOrientationHelper;
      i7 = ((OrientationHelper)localObject3).getEndPadding();
      i2 += i7;
      boolean bool7 = paramState.isPreLayout();
      if (bool7)
      {
        int i8 = this.mPendingScrollPosition;
        if (i8 != j)
        {
          i8 = this.mPendingScrollPositionOffset;
          int i12 = -1 << -1;
          if (i8 != i12)
          {
            i8 = this.mPendingScrollPosition;
            localObject3 = findViewByPosition(i8);
            if (localObject3 != null)
            {
              boolean bool11 = this.mShouldReverseLayout;
              if (!bool11) {
                break label1052;
              }
              localObject4 = this.mOrientationHelper;
              i13 = ((OrientationHelper)localObject4).getEndAfterPadding();
              OrientationHelper localOrientationHelper = this.mOrientationHelper;
              i8 = localOrientationHelper.getDecoratedEnd((View)localObject3);
              i8 = i13 - i8;
              i13 = this.mPendingScrollPositionOffset;
              i8 -= i13;
              if (i8 <= 0) {
                break label1099;
              }
              i6 += i8;
            }
          }
        }
      }
      localObject3 = this.mAnchorInfo;
      boolean bool8 = ((LinearLayoutManager.AnchorInfo)localObject3).mLayoutFromEnd;
      if (!bool8) {
        break label1109;
      }
      bool8 = this.mShouldReverseLayout;
      if (bool8) {
        j = i;
      }
      localObject3 = this.mAnchorInfo;
      onAnchorReady(paramRecycler, paramState, (LinearLayoutManager.AnchorInfo)localObject3, j);
      detachAndScrapAttachedViews(paramRecycler);
      localObject5 = this.mLayoutState;
      bool8 = resolveIsInfinite();
      ((LinearLayoutManager.LayoutState)localObject5).mInfinite = bool8;
      localObject5 = this.mLayoutState;
      bool8 = paramState.isPreLayout();
      ((LinearLayoutManager.LayoutState)localObject5).mIsPreLayout = bool8;
      localObject5 = this.mAnchorInfo;
      boolean bool1 = ((LinearLayoutManager.AnchorInfo)localObject5).mLayoutFromEnd;
      if (!bool1) {
        break label1126;
      }
      localObject5 = this.mAnchorInfo;
      updateLayoutStateToFillStart((LinearLayoutManager.AnchorInfo)localObject5);
      this.mLayoutState.mExtra = i6;
      localObject2 = this.mLayoutState;
      fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject2, paramState, false);
      localObject2 = this.mLayoutState;
      i6 = ((LinearLayoutManager.LayoutState)localObject2).mOffset;
      int i9 = this.mLayoutState.mCurrentPosition;
      localObject5 = this.mLayoutState;
      k = ((LinearLayoutManager.LayoutState)localObject5).mAvailable;
      if (k > 0)
      {
        localObject5 = this.mLayoutState;
        k = ((LinearLayoutManager.LayoutState)localObject5).mAvailable;
        i2 += k;
      }
      localObject5 = this.mAnchorInfo;
      updateLayoutStateToFillEnd((LinearLayoutManager.AnchorInfo)localObject5);
      localObject5 = this.mLayoutState;
      ((LinearLayoutManager.LayoutState)localObject5).mExtra = i2;
      localObject1 = this.mLayoutState;
      k = ((LinearLayoutManager.LayoutState)localObject1).mCurrentPosition;
      localObject4 = this.mLayoutState;
      i13 = ((LinearLayoutManager.LayoutState)localObject4).mItemDirection;
      k += i13;
      ((LinearLayoutManager.LayoutState)localObject1).mCurrentPosition = k;
      localObject1 = this.mLayoutState;
      fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject1, paramState, false);
      k = this.mLayoutState.mOffset;
      localObject1 = this.mLayoutState;
      i2 = ((LinearLayoutManager.LayoutState)localObject1).mAvailable;
      if (i2 <= 0) {
        break label1464;
      }
      i2 = this.mLayoutState.mAvailable;
      updateLayoutStateToFillStart(i9, i6);
      localObject2 = this.mLayoutState;
      ((LinearLayoutManager.LayoutState)localObject2).mExtra = i2;
      localObject1 = this.mLayoutState;
      fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject1, paramState, false);
      localObject1 = this.mLayoutState;
    }
    label806:
    label891:
    label938:
    label1052:
    label1099:
    int i4;
    label1109:
    label1126:
    label1450:
    label1464:
    for (i2 = ((LinearLayoutManager.LayoutState)localObject1).mOffset;; i4 = i6)
    {
      i6 = i2;
      i2 = k;
      k = getChildCount();
      int m;
      int i3;
      if (k > 0)
      {
        boolean bool2 = this.mShouldReverseLayout;
        boolean bool9 = this.mStackFromEnd;
        bool2 ^= bool9;
        if (bool2)
        {
          m = fixLayoutEndGap(i2, paramRecycler, paramState, i);
          i6 += m;
          i2 += m;
          n = fixLayoutStartGap(i6, paramRecycler, paramState, false);
          i6 += n;
          i2 += n;
        }
      }
      else
      {
        layoutForPredictiveAnimations(paramRecycler, paramState, i6, i2);
        i3 = paramState.isPreLayout();
        if (i3 != 0) {
          break label1450;
        }
        localObject1 = this.mOrientationHelper;
        ((OrientationHelper)localObject1).onLayoutComplete();
      }
      for (;;)
      {
        i3 = this.mStackFromEnd;
        this.mLastStackFromEnd = i3;
        break;
        if (localObject1 == null) {
          break label226;
        }
        localObject2 = this.mOrientationHelper;
        i6 = ((OrientationHelper)localObject2).getDecoratedStart((View)localObject1);
        localObject3 = this.mOrientationHelper;
        int i10 = ((OrientationHelper)localObject3).getEndAfterPadding();
        if (i6 < i10)
        {
          localObject2 = this.mOrientationHelper;
          i6 = ((OrientationHelper)localObject2).getDecoratedEnd((View)localObject1);
          localObject3 = this.mOrientationHelper;
          i10 = ((OrientationHelper)localObject3).getStartAfterPadding();
          if (i6 > i10) {
            break label226;
          }
        }
        localObject2 = this.mAnchorInfo;
        i10 = getPosition((View)localObject1);
        ((LinearLayoutManager.AnchorInfo)localObject2).assignFromViewAndKeepVisibleRect((View)localObject1, i10);
        break label226;
        i6 = i3;
        i3 = 0;
        localObject1 = null;
        break label257;
        i10 = this.mOrientationHelper.getDecoratedStart((View)localObject3);
        localObject4 = this.mOrientationHelper;
        i13 = ((OrientationHelper)localObject4).getStartAfterPadding();
        i10 -= i13;
        int i14 = this.mPendingScrollPositionOffset;
        i10 = i14 - i10;
        break label413;
        i3 -= i10;
        break label425;
        boolean bool10 = this.mShouldReverseLayout;
        if (bool10) {
          break label457;
        }
        m = i;
        break label457;
        localObject5 = this.mAnchorInfo;
        updateLayoutStateToFillEnd((LinearLayoutManager.AnchorInfo)localObject5);
        this.mLayoutState.mExtra = i4;
        localObject1 = this.mLayoutState;
        fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject1, paramState, false);
        localObject1 = this.mLayoutState;
        i4 = ((LinearLayoutManager.LayoutState)localObject1).mOffset;
        localObject5 = this.mLayoutState;
        m = ((LinearLayoutManager.LayoutState)localObject5).mCurrentPosition;
        localObject3 = this.mLayoutState;
        int i11 = ((LinearLayoutManager.LayoutState)localObject3).mAvailable;
        if (i11 > 0)
        {
          localObject3 = this.mLayoutState;
          i11 = ((LinearLayoutManager.LayoutState)localObject3).mAvailable;
          i6 += i11;
        }
        localObject3 = this.mAnchorInfo;
        updateLayoutStateToFillStart((LinearLayoutManager.AnchorInfo)localObject3);
        this.mLayoutState.mExtra = i6;
        localObject2 = this.mLayoutState;
        i11 = ((LinearLayoutManager.LayoutState)localObject2).mCurrentPosition;
        localObject4 = this.mLayoutState;
        int i15 = ((LinearLayoutManager.LayoutState)localObject4).mItemDirection;
        i11 += i15;
        ((LinearLayoutManager.LayoutState)localObject2).mCurrentPosition = i11;
        localObject2 = this.mLayoutState;
        fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject2, paramState, false);
        localObject2 = this.mLayoutState;
        i6 = ((LinearLayoutManager.LayoutState)localObject2).mOffset;
        localObject3 = this.mLayoutState;
        i11 = ((LinearLayoutManager.LayoutState)localObject3).mAvailable;
        if (i11 <= 0) {
          break label806;
        }
        localObject3 = this.mLayoutState;
        i11 = ((LinearLayoutManager.LayoutState)localObject3).mAvailable;
        updateLayoutStateToFillEnd(m, i4);
        this.mLayoutState.mExtra = i11;
        localObject1 = this.mLayoutState;
        fill(paramRecycler, (LinearLayoutManager.LayoutState)localObject1, paramState, false);
        localObject1 = this.mLayoutState;
        i4 = ((LinearLayoutManager.LayoutState)localObject1).mOffset;
        break label806;
        m = fixLayoutStartGap(i6, paramRecycler, paramState, i);
        i6 += m;
        i4 += m;
        n = fixLayoutEndGap(i4, paramRecycler, paramState, false);
        i6 += n;
        i4 += n;
        break label891;
        localObject1 = this.mAnchorInfo;
        ((LinearLayoutManager.AnchorInfo)localObject1).reset();
      }
    }
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    this.mPendingSavedState = null;
    this.mPendingScrollPosition = -1;
    this.mPendingScrollPositionOffset = (-1 << -1);
    this.mAnchorInfo.reset();
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof LinearLayoutManager.SavedState;
    if (bool)
    {
      paramParcelable = (LinearLayoutManager.SavedState)paramParcelable;
      this.mPendingSavedState = paramParcelable;
      requestLayout();
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    LinearLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    Object localObject;
    if (localSavedState != null)
    {
      localSavedState = new android/support/v7/widget/LinearLayoutManager$SavedState;
      localObject = this.mPendingSavedState;
      localSavedState.<init>((LinearLayoutManager.SavedState)localObject);
    }
    for (;;)
    {
      return localSavedState;
      localSavedState = new android/support/v7/widget/LinearLayoutManager$SavedState;
      localSavedState.<init>();
      int i = getChildCount();
      if (i > 0)
      {
        ensureLayoutState();
        boolean bool1 = this.mLastStackFromEnd;
        boolean bool2 = this.mShouldReverseLayout;
        bool1 ^= bool2;
        localSavedState.mAnchorLayoutFromEnd = bool1;
        OrientationHelper localOrientationHelper1;
        int k;
        int j;
        if (bool1)
        {
          localObject = getChildClosestToEnd();
          localOrientationHelper1 = this.mOrientationHelper;
          k = localOrientationHelper1.getEndAfterPadding();
          OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
          int m = localOrientationHelper2.getDecoratedEnd((View)localObject);
          k -= m;
          localSavedState.mAnchorOffset = k;
          j = getPosition((View)localObject);
          localSavedState.mAnchorPosition = j;
        }
        else
        {
          localObject = getChildClosestToStart();
          k = getPosition((View)localObject);
          localSavedState.mAnchorPosition = k;
          j = this.mOrientationHelper.getDecoratedStart((View)localObject);
          localOrientationHelper1 = this.mOrientationHelper;
          k = localOrientationHelper1.getStartAfterPadding();
          j -= k;
          localSavedState.mAnchorOffset = j;
        }
      }
      else
      {
        localSavedState.invalidateAnchor();
      }
    }
  }
  
  public void prepareForDrop(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = -1;
    Object localObject = "Cannot drop a view during a scroll or layout calculation";
    assertNotInLayoutOrScroll((String)localObject);
    ensureLayoutState();
    resolveShouldLayoutReverse();
    int k = getPosition(paramView1);
    int m = getPosition(paramView2);
    OrientationHelper localOrientationHelper1;
    if (k < m)
    {
      k = i;
      boolean bool = this.mShouldReverseLayout;
      if (!bool) {
        break label184;
      }
      if (k != i) {
        break label139;
      }
      localObject = this.mOrientationHelper;
      k = ((OrientationHelper)localObject).getEndAfterPadding();
      localOrientationHelper1 = this.mOrientationHelper;
      i = localOrientationHelper1.getDecoratedStart(paramView2);
      OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
      j = localOrientationHelper2.getDecoratedMeasurement(paramView1);
      i += j;
      k -= i;
      scrollToPositionWithOffset(m, k);
    }
    for (;;)
    {
      return;
      k = j;
      break;
      label139:
      localObject = this.mOrientationHelper;
      k = ((OrientationHelper)localObject).getEndAfterPadding();
      localOrientationHelper1 = this.mOrientationHelper;
      i = localOrientationHelper1.getDecoratedEnd(paramView2);
      k -= i;
      scrollToPositionWithOffset(m, k);
      continue;
      label184:
      if (k == j)
      {
        localObject = this.mOrientationHelper;
        k = ((OrientationHelper)localObject).getDecoratedStart(paramView2);
        scrollToPositionWithOffset(m, k);
      }
      else
      {
        localObject = this.mOrientationHelper;
        k = ((OrientationHelper)localObject).getDecoratedEnd(paramView2);
        localOrientationHelper1 = this.mOrientationHelper;
        i = localOrientationHelper1.getDecoratedMeasurement(paramView1);
        k -= i;
        scrollToPositionWithOffset(m, k);
      }
    }
  }
  
  boolean resolveIsInfinite()
  {
    OrientationHelper localOrientationHelper = this.mOrientationHelper;
    int i = localOrientationHelper.getMode();
    if (i == 0)
    {
      localOrientationHelper = this.mOrientationHelper;
      i = localOrientationHelper.getEnd();
      if (i == 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localOrientationHelper = null;
    }
  }
  
  int scrollBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = 1;
    int k = getChildCount();
    if ((k == 0) || (paramInt == 0)) {
      paramInt = 0;
    }
    for (;;)
    {
      return paramInt;
      Object localObject = this.mLayoutState;
      ((LinearLayoutManager.LayoutState)localObject).mRecycle = i;
      ensureLayoutState();
      if (paramInt > 0) {}
      int m;
      for (k = i;; k = -1)
      {
        m = Math.abs(paramInt);
        updateLayoutState(k, m, i, paramState);
        LinearLayoutManager.LayoutState localLayoutState1 = this.mLayoutState;
        j = localLayoutState1.mScrollingOffset;
        LinearLayoutManager.LayoutState localLayoutState2 = this.mLayoutState;
        int n = fill(paramRecycler, localLayoutState2, paramState, false);
        j += n;
        if (j >= 0) {
          break label117;
        }
        paramInt = 0;
        break;
      }
      label117:
      if (m > j) {
        paramInt = k * j;
      }
      localObject = this.mOrientationHelper;
      int j = -paramInt;
      ((OrientationHelper)localObject).offsetChildren(j);
      localObject = this.mLayoutState;
      ((LinearLayoutManager.LayoutState)localObject).mLastScrollDelta = paramInt;
    }
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = this.mOrientation;
    int j = 1;
    if (i == j) {}
    for (i = 0;; i = scrollBy(paramInt, paramRecycler, paramState)) {
      return i;
    }
  }
  
  public void scrollToPosition(int paramInt)
  {
    this.mPendingScrollPosition = paramInt;
    int i = -1 << -1;
    this.mPendingScrollPositionOffset = i;
    LinearLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    if (localSavedState != null)
    {
      localSavedState = this.mPendingSavedState;
      localSavedState.invalidateAnchor();
    }
    requestLayout();
  }
  
  public void scrollToPositionWithOffset(int paramInt1, int paramInt2)
  {
    this.mPendingScrollPosition = paramInt1;
    this.mPendingScrollPositionOffset = paramInt2;
    LinearLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    if (localSavedState != null)
    {
      localSavedState = this.mPendingSavedState;
      localSavedState.invalidateAnchor();
    }
    requestLayout();
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = this.mOrientation;
    if (i == 0) {}
    for (i = 0;; i = scrollBy(paramInt, paramRecycler, paramState)) {
      return i;
    }
  }
  
  public void setInitialPrefetchItemCount(int paramInt)
  {
    this.mInitialPrefetchItemCount = paramInt;
  }
  
  public void setOrientation(int paramInt)
  {
    Object localObject2;
    if (paramInt != 0)
    {
      i = 1;
      if (paramInt != i)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "invalid orientation:" + paramInt;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    Object localObject1 = null;
    assertNotInLayoutOrScroll(null);
    int i = this.mOrientation;
    if (paramInt == i)
    {
      localObject1 = this.mOrientationHelper;
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = OrientationHelper.createOrientationHelper(this, paramInt);
      this.mOrientationHelper = ((OrientationHelper)localObject1);
      localObject1 = this.mAnchorInfo;
      localObject2 = this.mOrientationHelper;
      ((LinearLayoutManager.AnchorInfo)localObject1).mOrientationHelper = ((OrientationHelper)localObject2);
      this.mOrientation = paramInt;
      requestLayout();
    }
  }
  
  public void setRecycleChildrenOnDetach(boolean paramBoolean)
  {
    this.mRecycleChildrenOnDetach = paramBoolean;
  }
  
  public void setReverseLayout(boolean paramBoolean)
  {
    assertNotInLayoutOrScroll(null);
    boolean bool = this.mReverseLayout;
    if (paramBoolean == bool) {}
    for (;;)
    {
      return;
      this.mReverseLayout = paramBoolean;
      requestLayout();
    }
  }
  
  public void setSmoothScrollbarEnabled(boolean paramBoolean)
  {
    this.mSmoothScrollbarEnabled = paramBoolean;
  }
  
  public void setStackFromEnd(boolean paramBoolean)
  {
    assertNotInLayoutOrScroll(null);
    boolean bool = this.mStackFromEnd;
    if (bool == paramBoolean) {}
    for (;;)
    {
      return;
      this.mStackFromEnd = paramBoolean;
      requestLayout();
    }
  }
  
  boolean shouldMeasureTwice()
  {
    int i = 1073741824;
    int j = getHeightMode();
    if (j != i)
    {
      j = getWidthMode();
      if (j != i)
      {
        bool = hasFlexibleChildInBothOrientations();
        if (!bool) {}
      }
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt)
  {
    LinearSmoothScroller localLinearSmoothScroller = new android/support/v7/widget/LinearSmoothScroller;
    Context localContext = paramRecyclerView.getContext();
    localLinearSmoothScroller.<init>(localContext);
    localLinearSmoothScroller.setTargetPosition(paramInt);
    startSmoothScroll(localLinearSmoothScroller);
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    LinearLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    boolean bool1;
    if (localSavedState == null)
    {
      bool1 = this.mLastStackFromEnd;
      boolean bool2 = this.mStackFromEnd;
      if (bool1 == bool2) {
        bool1 = true;
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localSavedState = null;
    }
  }
  
  void validateChildOrder()
  {
    int i = 1;
    Object localObject1 = "LinearLayoutManager";
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = "validating child count ";
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
    int j = getChildCount();
    localObject2 = j;
    Log.d((String)localObject1, (String)localObject2);
    int k = getChildCount();
    if (k < i) {
      return;
    }
    localObject1 = getChildAt(0);
    int i1 = getPosition((View)localObject1);
    localObject1 = this.mOrientationHelper;
    localObject3 = getChildAt(0);
    j = ((OrientationHelper)localObject1).getDecoratedStart((View)localObject3);
    int m = this.mShouldReverseLayout;
    View localView;
    int i4;
    OrientationHelper localOrientationHelper;
    int i3;
    String str1;
    String str2;
    if (m != 0)
    {
      m = i;
      for (;;)
      {
        int i2 = getChildCount();
        if (m >= i2) {
          break;
        }
        localView = getChildAt(m);
        i4 = getPosition(localView);
        localOrientationHelper = this.mOrientationHelper;
        i3 = localOrientationHelper.getDecoratedStart(localView);
        if (i4 < i1)
        {
          logChildren();
          localObject1 = new java/lang/RuntimeException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str1 = "detected invalid position. loc invalid? ";
          localObject2 = ((StringBuilder)localObject2).append(str1);
          if (i3 < j) {}
          for (;;)
          {
            str2 = i;
            ((RuntimeException)localObject1).<init>(str2);
            throw ((Throwable)localObject1);
            i = 0;
            str2 = null;
          }
        }
        if (i3 > j)
        {
          logChildren();
          localObject1 = new java/lang/RuntimeException;
          ((RuntimeException)localObject1).<init>("detected invalid location");
          throw ((Throwable)localObject1);
        }
        m += 1;
      }
    }
    int n = i;
    for (;;)
    {
      i3 = getChildCount();
      if (n >= i3) {
        break;
      }
      localView = getChildAt(n);
      i4 = getPosition(localView);
      localOrientationHelper = this.mOrientationHelper;
      i3 = localOrientationHelper.getDecoratedStart(localView);
      if (i4 < i1)
      {
        logChildren();
        localObject1 = new java/lang/RuntimeException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str1 = "detected invalid position. loc invalid? ";
        localObject2 = ((StringBuilder)localObject2).append(str1);
        if (i3 < j) {}
        for (;;)
        {
          str2 = i;
          ((RuntimeException)localObject1).<init>(str2);
          throw ((Throwable)localObject1);
          i = 0;
          str2 = null;
        }
      }
      if (i3 < j)
      {
        logChildren();
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("detected invalid location");
        throw ((Throwable)localObject1);
      }
      n += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LinearLayoutManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */