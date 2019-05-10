package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.c;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager
  extends RecyclerView.LayoutManager
  implements RecyclerView.SmoothScroller.ScrollVectorProvider
{
  static final boolean DEBUG = false;
  public static final int GAP_HANDLING_LAZY = 1;
  public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
  public static final int GAP_HANDLING_NONE = 0;
  public static final int HORIZONTAL = 0;
  static final int INVALID_OFFSET = Integer.MIN_VALUE;
  private static final float MAX_SCROLL_FACTOR = 0.33333334F;
  private static final String TAG = "StaggeredGridLManager";
  public static final int VERTICAL = 1;
  private final StaggeredGridLayoutManager.AnchorInfo mAnchorInfo;
  private final Runnable mCheckForGapsRunnable;
  private int mFullSizeSpec;
  private int mGapStrategy;
  private boolean mLaidOutInvalidFullSpan;
  private boolean mLastLayoutFromEnd;
  private boolean mLastLayoutRTL;
  private final LayoutState mLayoutState;
  StaggeredGridLayoutManager.LazySpanLookup mLazySpanLookup;
  private int mOrientation;
  private StaggeredGridLayoutManager.SavedState mPendingSavedState;
  int mPendingScrollPosition;
  int mPendingScrollPositionOffset;
  private int[] mPrefetchDistances;
  OrientationHelper mPrimaryOrientation;
  private BitSet mRemainingSpans;
  boolean mReverseLayout;
  OrientationHelper mSecondaryOrientation;
  boolean mShouldReverseLayout;
  private int mSizePerSpan;
  private boolean mSmoothScrollbarEnabled;
  private int mSpanCount;
  StaggeredGridLayoutManager.Span[] mSpans;
  private final Rect mTmpRect;
  
  public StaggeredGridLayoutManager(int paramInt1, int paramInt2)
  {
    this.mSpanCount = i;
    this.mReverseLayout = false;
    this.mShouldReverseLayout = false;
    this.mPendingScrollPosition = i;
    this.mPendingScrollPositionOffset = (-1 << -1);
    Object localObject = new android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;
    ((StaggeredGridLayoutManager.LazySpanLookup)localObject).<init>();
    this.mLazySpanLookup = ((StaggeredGridLayoutManager.LazySpanLookup)localObject);
    this.mGapStrategy = 2;
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTmpRect = ((Rect)localObject);
    localObject = new android/support/v7/widget/StaggeredGridLayoutManager$AnchorInfo;
    ((StaggeredGridLayoutManager.AnchorInfo)localObject).<init>(this);
    this.mAnchorInfo = ((StaggeredGridLayoutManager.AnchorInfo)localObject);
    this.mLaidOutInvalidFullSpan = false;
    this.mSmoothScrollbarEnabled = true;
    localObject = new android/support/v7/widget/StaggeredGridLayoutManager$1;
    ((StaggeredGridLayoutManager.1)localObject).<init>(this);
    this.mCheckForGapsRunnable = ((Runnable)localObject);
    this.mOrientation = paramInt2;
    setSpanCount(paramInt1);
    localObject = new android/support/v7/widget/LayoutState;
    ((LayoutState)localObject).<init>();
    this.mLayoutState = ((LayoutState)localObject);
    createOrientationHelpers();
  }
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.mSpanCount = i;
    this.mReverseLayout = false;
    this.mShouldReverseLayout = false;
    this.mPendingScrollPosition = i;
    this.mPendingScrollPositionOffset = (-1 << -1);
    Object localObject = new android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;
    ((StaggeredGridLayoutManager.LazySpanLookup)localObject).<init>();
    this.mLazySpanLookup = ((StaggeredGridLayoutManager.LazySpanLookup)localObject);
    this.mGapStrategy = 2;
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mTmpRect = ((Rect)localObject);
    localObject = new android/support/v7/widget/StaggeredGridLayoutManager$AnchorInfo;
    ((StaggeredGridLayoutManager.AnchorInfo)localObject).<init>(this);
    this.mAnchorInfo = ((StaggeredGridLayoutManager.AnchorInfo)localObject);
    this.mLaidOutInvalidFullSpan = false;
    this.mSmoothScrollbarEnabled = true;
    localObject = new android/support/v7/widget/StaggeredGridLayoutManager$1;
    ((StaggeredGridLayoutManager.1)localObject).<init>(this);
    this.mCheckForGapsRunnable = ((Runnable)localObject);
    localObject = getProperties(paramContext, paramAttributeSet, paramInt1, paramInt2);
    int j = ((RecyclerView.LayoutManager.Properties)localObject).orientation;
    setOrientation(j);
    j = ((RecyclerView.LayoutManager.Properties)localObject).spanCount;
    setSpanCount(j);
    boolean bool = ((RecyclerView.LayoutManager.Properties)localObject).reverseLayout;
    setReverseLayout(bool);
    localObject = new android/support/v7/widget/LayoutState;
    ((LayoutState)localObject).<init>();
    this.mLayoutState = ((LayoutState)localObject);
    createOrientationHelpers();
  }
  
  private void appendViewToAllSpans(View paramView)
  {
    int i = this.mSpanCount + -1;
    while (i >= 0)
    {
      StaggeredGridLayoutManager.Span localSpan = this.mSpans[i];
      localSpan.appendToSpan(paramView);
      i += -1;
    }
  }
  
  private void applyPendingSavedState(StaggeredGridLayoutManager.AnchorInfo paramAnchorInfo)
  {
    Object localObject1 = this.mPendingSavedState;
    int i = ((StaggeredGridLayoutManager.SavedState)localObject1).mSpanOffsetsSize;
    Object localObject2;
    if (i > 0)
    {
      localObject1 = this.mPendingSavedState;
      i = ((StaggeredGridLayoutManager.SavedState)localObject1).mSpanOffsetsSize;
      m = this.mSpanCount;
      if (i == m)
      {
        i = 0;
        localObject1 = null;
        m = this.mSpanCount;
        if (i < m)
        {
          this.mSpans[i].clear();
          localObject2 = this.mPendingSavedState.mSpanOffsets;
          m = localObject2[i];
          int n = -1 << -1;
          Object localObject3;
          int i1;
          if (m != n)
          {
            localObject3 = this.mPendingSavedState;
            boolean bool4 = ((StaggeredGridLayoutManager.SavedState)localObject3).mAnchorLayoutFromEnd;
            if (!bool4) {
              break label148;
            }
            localObject3 = this.mPrimaryOrientation;
            i1 = ((OrientationHelper)localObject3).getEndAfterPadding();
            m += i1;
          }
          for (;;)
          {
            localObject3 = this.mSpans[i];
            ((StaggeredGridLayoutManager.Span)localObject3).setLine(m);
            i += 1;
            break;
            label148:
            localObject3 = this.mPrimaryOrientation;
            i1 = ((OrientationHelper)localObject3).getStartAfterPadding();
            m += i1;
          }
        }
      }
      else
      {
        this.mPendingSavedState.invalidateSpanInfo();
        localObject1 = this.mPendingSavedState;
        localObject2 = this.mPendingSavedState;
        m = ((StaggeredGridLayoutManager.SavedState)localObject2).mVisibleAnchorPosition;
        ((StaggeredGridLayoutManager.SavedState)localObject1).mAnchorPosition = m;
      }
    }
    boolean bool1 = this.mPendingSavedState.mLastLayoutRTL;
    this.mLastLayoutRTL = bool1;
    bool1 = this.mPendingSavedState.mReverseLayout;
    setReverseLayout(bool1);
    resolveShouldLayoutReverse();
    localObject1 = this.mPendingSavedState;
    int j = ((StaggeredGridLayoutManager.SavedState)localObject1).mAnchorPosition;
    int m = -1;
    boolean bool2;
    if (j != m)
    {
      j = this.mPendingSavedState.mAnchorPosition;
      this.mPendingScrollPosition = j;
      localObject1 = this.mPendingSavedState;
      bool2 = ((StaggeredGridLayoutManager.SavedState)localObject1).mAnchorLayoutFromEnd;
    }
    boolean bool3;
    for (paramAnchorInfo.mLayoutFromEnd = bool2;; paramAnchorInfo.mLayoutFromEnd = bool3)
    {
      localObject1 = this.mPendingSavedState;
      int k = ((StaggeredGridLayoutManager.SavedState)localObject1).mSpanLookupSize;
      m = 1;
      if (k > m)
      {
        localObject1 = this.mLazySpanLookup;
        localObject2 = this.mPendingSavedState.mSpanLookup;
        ((StaggeredGridLayoutManager.LazySpanLookup)localObject1).mData = ((int[])localObject2);
        localObject1 = this.mLazySpanLookup;
        localObject2 = this.mPendingSavedState.mFullSpanItems;
        ((StaggeredGridLayoutManager.LazySpanLookup)localObject1).mFullSpanItems = ((List)localObject2);
      }
      return;
      bool3 = this.mShouldReverseLayout;
    }
  }
  
  private void attachViewToSpans(View paramView, StaggeredGridLayoutManager.LayoutParams paramLayoutParams, LayoutState paramLayoutState)
  {
    int i = paramLayoutState.mLayoutDirection;
    int j = 1;
    boolean bool;
    if (i == j)
    {
      bool = paramLayoutParams.mFullSpan;
      if (bool) {
        appendViewToAllSpans(paramView);
      }
    }
    for (;;)
    {
      return;
      StaggeredGridLayoutManager.Span localSpan = paramLayoutParams.mSpan;
      localSpan.appendToSpan(paramView);
      continue;
      bool = paramLayoutParams.mFullSpan;
      if (bool)
      {
        prependViewToAllSpans(paramView);
      }
      else
      {
        localSpan = paramLayoutParams.mSpan;
        localSpan.prependToSpan(paramView);
      }
    }
  }
  
  private int calculateScrollDirectionForPosition(int paramInt)
  {
    int i = -1;
    float f1 = 0.0F / 0.0F;
    int j = 1;
    float f2 = Float.MIN_VALUE;
    int k = getChildCount();
    if (k == 0)
    {
      boolean bool = this.mShouldReverseLayout;
      if (bool) {}
      for (;;)
      {
        return j;
        j = i;
        f2 = f1;
      }
    }
    int m = getFirstChildPosition();
    if (paramInt < m)
    {
      m = j;
      label63:
      int n = this.mShouldReverseLayout;
      if (m == n) {
        break label91;
      }
    }
    for (;;)
    {
      j = i;
      f2 = f1;
      break;
      m = 0;
      break label63;
      label91:
      i = j;
      f1 = f2;
    }
  }
  
  private boolean checkSpanForGap(StaggeredGridLayoutManager.Span paramSpan)
  {
    boolean bool1 = true;
    boolean bool2 = this.mShouldReverseLayout;
    Object localObject1;
    int k;
    Object localObject2;
    boolean bool3;
    if (bool2)
    {
      int i = paramSpan.getEndLine();
      localObject1 = this.mPrimaryOrientation;
      k = ((OrientationHelper)localObject1).getEndAfterPadding();
      if (i >= k) {
        break label163;
      }
      localObject2 = paramSpan.mViews;
      localObject1 = paramSpan.mViews;
      k = ((ArrayList)localObject1).size() + -1;
      localObject2 = (View)((ArrayList)localObject2).get(k);
      localObject2 = paramSpan.getLayoutParams((View)localObject2);
      bool3 = ((StaggeredGridLayoutManager.LayoutParams)localObject2).mFullSpan;
      if (!bool3) {
        bool3 = bool1;
      }
    }
    for (;;)
    {
      return bool3;
      bool3 = false;
      localObject2 = null;
      continue;
      int j = paramSpan.getStartLine();
      localObject1 = this.mPrimaryOrientation;
      k = ((OrientationHelper)localObject1).getStartAfterPadding();
      if (j > k)
      {
        localObject2 = (View)paramSpan.mViews.get(0);
        localObject2 = paramSpan.getLayoutParams((View)localObject2);
        bool4 = ((StaggeredGridLayoutManager.LayoutParams)localObject2).mFullSpan;
        if (!bool4) {}
        for (;;)
        {
          bool4 = bool1;
          break;
          bool1 = false;
        }
      }
      label163:
      boolean bool4 = false;
      localObject2 = null;
    }
  }
  
  private int computeScrollExtent(RecyclerView.State paramState)
  {
    boolean bool1 = true;
    int i = 0;
    int j = getChildCount();
    if (j == 0) {
      return i;
    }
    OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
    boolean bool2 = this.mSmoothScrollbarEnabled;
    label37:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = findFirstVisibleItemClosestToStart(bool2);
      bool2 = this.mSmoothScrollbarEnabled;
      if (bool2) {
        break label92;
      }
    }
    for (;;)
    {
      View localView2 = findFirstVisibleItemClosestToEnd(bool1);
      boolean bool3 = this.mSmoothScrollbarEnabled;
      i = ScrollbarHelper.computeScrollExtent(paramState, localOrientationHelper, localView1, localView2, this, bool3);
      break;
      bool2 = false;
      break label37;
      label92:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private int computeScrollOffset(RecyclerView.State paramState)
  {
    boolean bool1 = true;
    int i = 0;
    int j = getChildCount();
    if (j == 0) {
      return i;
    }
    OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
    boolean bool2 = this.mSmoothScrollbarEnabled;
    label37:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = findFirstVisibleItemClosestToStart(bool2);
      bool2 = this.mSmoothScrollbarEnabled;
      if (bool2) {
        break label100;
      }
    }
    for (;;)
    {
      View localView2 = findFirstVisibleItemClosestToEnd(bool1);
      boolean bool3 = this.mSmoothScrollbarEnabled;
      boolean bool4 = this.mShouldReverseLayout;
      i = ScrollbarHelper.computeScrollOffset(paramState, localOrientationHelper, localView1, localView2, this, bool3, bool4);
      break;
      bool2 = false;
      break label37;
      label100:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private int computeScrollRange(RecyclerView.State paramState)
  {
    boolean bool1 = true;
    int i = 0;
    int j = getChildCount();
    if (j == 0) {
      return i;
    }
    OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
    boolean bool2 = this.mSmoothScrollbarEnabled;
    label37:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = findFirstVisibleItemClosestToStart(bool2);
      bool2 = this.mSmoothScrollbarEnabled;
      if (bool2) {
        break label92;
      }
    }
    for (;;)
    {
      View localView2 = findFirstVisibleItemClosestToEnd(bool1);
      boolean bool3 = this.mSmoothScrollbarEnabled;
      i = ScrollbarHelper.computeScrollRange(paramState, localOrientationHelper, localView1, localView2, this, bool3);
      break;
      bool2 = false;
      break label37;
      label92:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private int convertFocusDirectionToLayoutDirection(int paramInt)
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
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    localFullSpanItem.<init>();
    int[] arrayOfInt1 = new int[this.mSpanCount];
    localFullSpanItem.mGapPerSpan = arrayOfInt1;
    int i = 0;
    arrayOfInt1 = null;
    for (;;)
    {
      int j = this.mSpanCount;
      if (i >= j) {
        break;
      }
      int[] arrayOfInt2 = localFullSpanItem.mGapPerSpan;
      StaggeredGridLayoutManager.Span localSpan = this.mSpans[i];
      int k = localSpan.getEndLine(paramInt);
      k = paramInt - k;
      arrayOfInt2[i] = k;
      i += 1;
    }
    return localFullSpanItem;
  }
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    localFullSpanItem.<init>();
    int[] arrayOfInt1 = new int[this.mSpanCount];
    localFullSpanItem.mGapPerSpan = arrayOfInt1;
    int i = 0;
    arrayOfInt1 = null;
    for (;;)
    {
      int j = this.mSpanCount;
      if (i >= j) {
        break;
      }
      int[] arrayOfInt2 = localFullSpanItem.mGapPerSpan;
      StaggeredGridLayoutManager.Span localSpan = this.mSpans[i];
      int k = localSpan.getStartLine(paramInt) - paramInt;
      arrayOfInt2[i] = k;
      i += 1;
    }
    return localFullSpanItem;
  }
  
  private void createOrientationHelpers()
  {
    int i = this.mOrientation;
    OrientationHelper localOrientationHelper = OrientationHelper.createOrientationHelper(this, i);
    this.mPrimaryOrientation = localOrientationHelper;
    i = this.mOrientation;
    i = 1 - i;
    localOrientationHelper = OrientationHelper.createOrientationHelper(this, i);
    this.mSecondaryOrientation = localOrientationHelper;
  }
  
  private int fill(RecyclerView.Recycler paramRecycler, LayoutState paramLayoutState, RecyclerView.State paramState)
  {
    Object localObject1 = this.mRemainingSpans;
    int i = 0;
    Object localObject2 = null;
    int k = this.mSpanCount;
    boolean bool1 = true;
    ((BitSet)localObject1).set(0, k, bool1);
    localObject1 = this.mLayoutState;
    boolean bool2 = ((LayoutState)localObject1).mInfinite;
    int i16;
    int i17;
    label116:
    label122:
    Object localObject3;
    int i18;
    label234:
    Object localObject4;
    label269:
    Object localObject5;
    label288:
    label317:
    label365:
    int i19;
    int n;
    int i21;
    Object localObject6;
    if (bool2)
    {
      int i2 = paramLayoutState.mLayoutDirection;
      i = 1;
      if (i2 == i)
      {
        int i3 = -1 >>> 1;
        i16 = i3;
        i3 = paramLayoutState.mLayoutDirection;
        updateAllRemainingSpans(i3, i16);
        boolean bool3 = this.mShouldReverseLayout;
        if (!bool3) {
          break label793;
        }
        localObject1 = this.mPrimaryOrientation;
        int i4 = ((OrientationHelper)localObject1).getEndAfterPadding();
        i17 = i4;
        i4 = 0;
        localObject1 = null;
        i = paramLayoutState.hasMore(paramState);
        if (i == 0) {
          break label1337;
        }
        localObject2 = this.mLayoutState;
        i = ((LayoutState)localObject2).mInfinite;
        if (i == 0)
        {
          localObject2 = this.mRemainingSpans;
          i = ((BitSet)localObject2).isEmpty();
          if (i != 0) {
            break label1337;
          }
        }
        localObject2 = paramLayoutState.next(paramRecycler);
        localObject1 = ((View)localObject2).getLayoutParams();
        localObject3 = localObject1;
        localObject3 = (StaggeredGridLayoutManager.LayoutParams)localObject1;
        i18 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).getViewLayoutPosition();
        localObject1 = this.mLazySpanLookup;
        int m = ((StaggeredGridLayoutManager.LazySpanLookup)localObject1).getSpan(i18);
        i4 = -1;
        if (m != i4) {
          break label813;
        }
        i4 = 1;
        k = i4;
        if (k == 0) {
          break label838;
        }
        boolean bool4 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
        if (!bool4) {
          break label828;
        }
        localObject1 = this.mSpans;
        m = 0;
        localObject4 = null;
        localObject1 = localObject1[0];
        localObject4 = this.mLazySpanLookup;
        ((StaggeredGridLayoutManager.LazySpanLookup)localObject4).setSpan(i18, (StaggeredGridLayoutManager.Span)localObject1);
        localObject5 = localObject1;
        ((StaggeredGridLayoutManager.LayoutParams)localObject3).mSpan = ((StaggeredGridLayoutManager.Span)localObject5);
        int i5 = paramLayoutState.mLayoutDirection;
        m = 1;
        if (i5 != m) {
          break label854;
        }
        addView((View)localObject2);
        localObject1 = null;
        measureChildWithDecorationsAndMargin((View)localObject2, (StaggeredGridLayoutManager.LayoutParams)localObject3, false);
        i5 = paramLayoutState.mLayoutDirection;
        m = 1;
        if (i5 != m) {
          break label882;
        }
        boolean bool5 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
        if (!bool5) {
          break label870;
        }
        int i6 = getMaxEnd(i17);
        localObject4 = this.mPrimaryOrientation;
        m = ((OrientationHelper)localObject4).getDecoratedMeasurement((View)localObject2);
        i19 = i6 + m;
        if (k == 0) {
          break label1495;
        }
        n = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
        if (n == 0) {
          break label1495;
        }
        localObject4 = createFullSpanItemFromEnd(i6);
        i21 = -1;
        ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject4).mGapDir = i21;
        ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject4).mPosition = i18;
        localObject6 = this.mLazySpanLookup;
        ((StaggeredGridLayoutManager.LazySpanLookup)localObject6).addFullSpanItem((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject4);
        n = i6;
      }
    }
    for (;;)
    {
      boolean bool6 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
      if (bool6)
      {
        int i7 = paramLayoutState.mItemDirection;
        i21 = -1;
        if (i7 == i21)
        {
          if (k == 0) {
            break label998;
          }
          i7 = 1;
          this.mLaidOutInvalidFullSpan = i7;
        }
      }
      label488:
      attachViewToSpans((View)localObject2, (StaggeredGridLayoutManager.LayoutParams)localObject3, paramLayoutState);
      boolean bool7 = isLayoutRTL();
      label549:
      OrientationHelper localOrientationHelper;
      label608:
      label641:
      boolean bool10;
      if (bool7)
      {
        int i8 = this.mOrientation;
        k = 1;
        if (i8 == k)
        {
          boolean bool8 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
          if (bool8)
          {
            localObject1 = this.mSecondaryOrientation;
            int i9 = ((OrientationHelper)localObject1).getEndAfterPadding();
            localOrientationHelper = this.mSecondaryOrientation;
            k = localOrientationHelper.getDecoratedMeasurement((View)localObject2);
            k = i9 - k;
            i18 = i9;
            i9 = this.mOrientation;
            i21 = 1;
            if (i9 != i21) {
              break label1261;
            }
            localObject1 = this;
            layoutDecoratedWithMargins((View)localObject2, k, n, i18, i19);
            boolean bool9 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
            if (!bool9) {
              break label1281;
            }
            localObject1 = this.mLayoutState;
            int i10 = ((LayoutState)localObject1).mLayoutDirection;
            updateAllRemainingSpans(i10, i16);
            localObject1 = this.mLayoutState;
            recycle(paramRecycler, (LayoutState)localObject1);
            localObject1 = this.mLayoutState;
            bool10 = ((LayoutState)localObject1).mStopInFocusable;
            if (bool10)
            {
              bool10 = ((View)localObject2).hasFocusable();
              if (bool10)
              {
                bool10 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
                if (!bool10) {
                  break label1307;
                }
                localObject1 = this.mRemainingSpans;
                ((BitSet)localObject1).clear();
              }
            }
          }
        }
      }
      for (;;)
      {
        bool10 = true;
        break label122;
        int i11 = -1 << -1;
        i16 = i11;
        break;
        i11 = paramLayoutState.mLayoutDirection;
        i = 1;
        if (i11 == i)
        {
          i12 = paramLayoutState.mEndLine;
          j = paramLayoutState.mAvailable;
          i12 += j;
          i16 = i12;
          break;
        }
        int i12 = paramLayoutState.mStartLine;
        j = paramLayoutState.mAvailable;
        i12 -= j;
        i16 = i12;
        break;
        label793:
        localObject1 = this.mPrimaryOrientation;
        i12 = ((OrientationHelper)localObject1).getStartAfterPadding();
        i17 = i12;
        break label116;
        label813:
        i12 = 0;
        localObject1 = null;
        k = 0;
        localOrientationHelper = null;
        break label234;
        label828:
        localObject1 = getNextSpan(paramLayoutState);
        break label269;
        label838:
        localObject1 = this.mSpans[n];
        localObject5 = localObject1;
        break label288;
        label854:
        i12 = 0;
        localObject1 = null;
        addView((View)localObject2, 0);
        break label317;
        label870:
        i12 = ((StaggeredGridLayoutManager.Span)localObject5).getEndLine(i17);
        break label365;
        label882:
        boolean bool11 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
        if (bool11) {}
        int i20;
        for (int i13 = getMinStart(i17);; i13 = ((StaggeredGridLayoutManager.Span)localObject5).getStartLine(i17))
        {
          localObject4 = this.mPrimaryOrientation;
          i1 = ((OrientationHelper)localObject4).getDecoratedMeasurement((View)localObject2);
          i1 = i13 - i1;
          if (k != 0)
          {
            i20 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
            if (i20 != 0)
            {
              StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = createFullSpanItemFromStart(i13);
              i21 = 1;
              localFullSpanItem.mGapDir = i21;
              localFullSpanItem.mPosition = i18;
              localObject6 = this.mLazySpanLookup;
              ((StaggeredGridLayoutManager.LazySpanLookup)localObject6).addFullSpanItem(localFullSpanItem);
            }
          }
          i20 = i13;
          break;
        }
        label998:
        i13 = paramLayoutState.mLayoutDirection;
        k = 1;
        boolean bool12;
        if (i13 == k)
        {
          bool12 = areAllEndsEqual();
          if (!bool12) {
            bool12 = true;
          }
        }
        for (;;)
        {
          if (!bool12) {
            break label1104;
          }
          localObject1 = this.mLazySpanLookup.getFullSpanItem(i18);
          if (localObject1 != null)
          {
            k = 1;
            ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject1).mHasUnwantedGapAfter = k;
          }
          bool12 = true;
          this.mLaidOutInvalidFullSpan = bool12;
          break;
          bool12 = false;
          localObject1 = null;
          continue;
          bool12 = areAllStartsEqual();
          if (!bool12)
          {
            bool12 = true;
          }
          else
          {
            bool12 = false;
            localObject1 = null;
          }
        }
        label1104:
        break label488;
        localObject1 = this.mSecondaryOrientation;
        int i14 = ((OrientationHelper)localObject1).getEndAfterPadding();
        k = this.mSpanCount + -1;
        i18 = ((StaggeredGridLayoutManager.Span)localObject5).mIndex;
        k -= i18;
        i18 = this.mSizePerSpan;
        k *= i18;
        i14 -= k;
        break label549;
        boolean bool13 = ((StaggeredGridLayoutManager.LayoutParams)localObject3).mFullSpan;
        if (bool13)
        {
          localObject1 = this.mSecondaryOrientation;
          i15 = ((OrientationHelper)localObject1).getStartAfterPadding();
        }
        for (;;)
        {
          localOrientationHelper = this.mSecondaryOrientation;
          k = localOrientationHelper.getDecoratedMeasurement((View)localObject2);
          i18 = i15 + k;
          k = i15;
          break;
          i15 = ((StaggeredGridLayoutManager.Span)localObject5).mIndex;
          k = this.mSizePerSpan;
          i15 *= k;
          localOrientationHelper = this.mSecondaryOrientation;
          k = localOrientationHelper.getStartAfterPadding();
          i15 += k;
        }
        label1261:
        localObject6 = this;
        layoutDecoratedWithMargins((View)localObject2, i1, k, i20, i18);
        break label608;
        label1281:
        localObject1 = this.mLayoutState;
        i15 = ((LayoutState)localObject1).mLayoutDirection;
        updateRemainingSpans((StaggeredGridLayoutManager.Span)localObject5, i15, i16);
        break label641;
        label1307:
        localObject1 = this.mRemainingSpans;
        j = ((StaggeredGridLayoutManager.Span)localObject5).mIndex;
        k = 0;
        localOrientationHelper = null;
        ((BitSet)localObject1).set(j, false);
      }
      label1337:
      if (i15 == 0)
      {
        localObject1 = this.mLayoutState;
        recycle(paramRecycler, (LayoutState)localObject1);
      }
      localObject1 = this.mLayoutState;
      int i15 = ((LayoutState)localObject1).mLayoutDirection;
      int j = -1;
      if (i15 == j)
      {
        localObject1 = this.mPrimaryOrientation;
        i15 = ((OrientationHelper)localObject1).getStartAfterPadding();
        i15 = getMinStart(i15);
        localObject2 = this.mPrimaryOrientation;
        j = ((OrientationHelper)localObject2).getStartAfterPadding();
        i15 = j - i15;
        if (i15 <= 0) {
          break label1486;
        }
        j = paramLayoutState.mAvailable;
        i15 = Math.min(j, i15);
      }
      for (;;)
      {
        return i15;
        localObject1 = this.mPrimaryOrientation;
        i15 = ((OrientationHelper)localObject1).getEndAfterPadding();
        i15 = getMaxEnd(i15);
        localObject2 = this.mPrimaryOrientation;
        j = ((OrientationHelper)localObject2).getEndAfterPadding();
        i15 -= j;
        break;
        label1486:
        i15 = 0;
        localObject1 = null;
      }
      label1495:
      int i1 = i15;
    }
  }
  
  private int findFirstReferenceChildPosition(int paramInt)
  {
    int i = getChildCount();
    int j = 0;
    View localView;
    int k;
    if (j < i)
    {
      localView = getChildAt(j);
      k = getPosition(localView);
      if ((k < 0) || (k >= paramInt)) {}
    }
    for (;;)
    {
      return k;
      k = j + 1;
      j = k;
      break;
      k = 0;
      localView = null;
    }
  }
  
  private int findLastReferenceChildPosition(int paramInt)
  {
    int i = getChildCount() + -1;
    int j = i;
    View localView;
    if (j >= 0)
    {
      localView = getChildAt(j);
      i = getPosition(localView);
      if ((i < 0) || (i >= paramInt)) {}
    }
    for (;;)
    {
      return i;
      i = j + -1;
      j = i;
      break;
      i = 0;
      localView = null;
    }
  }
  
  private void fixEndGap(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = -1 << -1;
    int j = getMaxEnd(i);
    if (j == i) {}
    for (;;)
    {
      return;
      OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
      i = localOrientationHelper.getEndAfterPadding();
      j = i - j;
      if (j > 0)
      {
        i = -j;
        i = -scrollBy(i, paramRecycler, paramState);
        j -= i;
        if ((paramBoolean) && (j > 0))
        {
          localOrientationHelper = this.mPrimaryOrientation;
          localOrientationHelper.offsetChildren(j);
        }
      }
    }
  }
  
  private void fixStartGap(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = -1 >>> 1;
    int j = getMinStart(i);
    if (j == i) {}
    for (;;)
    {
      return;
      OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
      i = localOrientationHelper.getStartAfterPadding();
      j -= i;
      if (j > 0)
      {
        i = scrollBy(j, paramRecycler, paramState);
        j -= i;
        if ((paramBoolean) && (j > 0))
        {
          localOrientationHelper = this.mPrimaryOrientation;
          j = -j;
          localOrientationHelper.offsetChildren(j);
        }
      }
    }
  }
  
  private int getMaxEnd(int paramInt)
  {
    StaggeredGridLayoutManager.Span localSpan1 = this.mSpans[0];
    int i = localSpan1.getEndLine(paramInt);
    int j = 1;
    for (;;)
    {
      int k = this.mSpanCount;
      if (j >= k) {
        break;
      }
      StaggeredGridLayoutManager.Span localSpan2 = this.mSpans[j];
      k = localSpan2.getEndLine(paramInt);
      if (k > i) {
        i = k;
      }
      j += 1;
    }
    return i;
  }
  
  private int getMaxStart(int paramInt)
  {
    StaggeredGridLayoutManager.Span localSpan1 = this.mSpans[0];
    int i = localSpan1.getStartLine(paramInt);
    int j = 1;
    for (;;)
    {
      int k = this.mSpanCount;
      if (j >= k) {
        break;
      }
      StaggeredGridLayoutManager.Span localSpan2 = this.mSpans[j];
      k = localSpan2.getStartLine(paramInt);
      if (k > i) {
        i = k;
      }
      j += 1;
    }
    return i;
  }
  
  private int getMinEnd(int paramInt)
  {
    StaggeredGridLayoutManager.Span localSpan1 = this.mSpans[0];
    int i = localSpan1.getEndLine(paramInt);
    int j = 1;
    for (;;)
    {
      int k = this.mSpanCount;
      if (j >= k) {
        break;
      }
      StaggeredGridLayoutManager.Span localSpan2 = this.mSpans[j];
      k = localSpan2.getEndLine(paramInt);
      if (k < i) {
        i = k;
      }
      j += 1;
    }
    return i;
  }
  
  private int getMinStart(int paramInt)
  {
    StaggeredGridLayoutManager.Span localSpan1 = this.mSpans[0];
    int i = localSpan1.getStartLine(paramInt);
    int j = 1;
    for (;;)
    {
      int k = this.mSpanCount;
      if (j >= k) {
        break;
      }
      StaggeredGridLayoutManager.Span localSpan2 = this.mSpans[j];
      k = localSpan2.getStartLine(paramInt);
      if (k < i) {
        i = k;
      }
      j += 1;
    }
    return i;
  }
  
  private StaggeredGridLayoutManager.Span getNextSpan(LayoutState paramLayoutState)
  {
    Object localObject1 = null;
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = -1;
    int k = paramLayoutState.mLayoutDirection;
    int m = preferLastSpan(k);
    int n;
    int i1;
    OrientationHelper localOrientationHelper;
    int i2;
    int i3;
    label83:
    StaggeredGridLayoutManager.Span[] arrayOfSpan;
    if (m != 0)
    {
      n = this.mSpanCount + -1;
      m = j;
      i1 = paramLayoutState.mLayoutDirection;
      if (i1 != i) {
        break label163;
      }
      i = -1 >>> 1;
      f = 0.0F / 0.0F;
      localOrientationHelper = this.mPrimaryOrientation;
      i2 = localOrientationHelper.getStartAfterPadding();
      i3 = n;
      n = i;
      if (i3 == m) {
        break label249;
      }
      arrayOfSpan = this.mSpans;
      localOrientationHelper = arrayOfSpan[i3];
      i = localOrientationHelper.getEndLine(i2);
      if (i >= n) {
        break label260;
      }
    }
    for (Object localObject2 = localOrientationHelper;; localObject2 = localObject1)
    {
      i1 = i3 + j;
      i3 = i1;
      localObject1 = localObject2;
      n = i;
      break label83;
      j = this.mSpanCount;
      n = 0;
      localObject2 = null;
      m = j;
      j = i;
      break;
      label163:
      i = -1 << -1;
      f = -0.0F;
      localOrientationHelper = this.mPrimaryOrientation;
      i2 = localOrientationHelper.getEndAfterPadding();
      i3 = n;
      n = i;
      if (i3 != m)
      {
        arrayOfSpan = this.mSpans;
        localOrientationHelper = arrayOfSpan[i3];
        i = localOrientationHelper.getStartLine(i2);
        if (i <= n) {
          break label251;
        }
      }
      for (localObject2 = localOrientationHelper;; localObject2 = localObject1)
      {
        i1 = i3 + j;
        i3 = i1;
        localObject1 = localObject2;
        n = i;
        break;
        label249:
        return (StaggeredGridLayoutManager.Span)localObject1;
        label251:
        i = n;
      }
      label260:
      i = n;
    }
  }
  
  private void handleUpdate(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    boolean bool1 = this.mShouldReverseLayout;
    int j;
    int k;
    int m;
    label47:
    StaggeredGridLayoutManager.LazySpanLookup localLazySpanLookup;
    if (bool1)
    {
      j = getLastChildPosition();
      k = j;
      j = 8;
      if (paramInt3 != j) {
        break label128;
      }
      if (paramInt1 >= paramInt2) {
        break label117;
      }
      m = paramInt2 + 1;
      j = paramInt1;
      localLazySpanLookup = this.mLazySpanLookup;
      localLazySpanLookup.invalidateAfter(j);
      switch (paramInt3)
      {
      default: 
        label96:
        if (m > k) {
          break;
        }
      }
    }
    label117:
    label128:
    label236:
    for (;;)
    {
      return;
      j = getFirstChildPosition();
      k = j;
      break;
      m = paramInt1 + 1;
      j = paramInt2;
      break label47;
      m = paramInt1 + paramInt2;
      j = paramInt1;
      break label47;
      localLazySpanLookup = this.mLazySpanLookup;
      localLazySpanLookup.offsetForAddition(paramInt1, paramInt2);
      break label96;
      localLazySpanLookup = this.mLazySpanLookup;
      localLazySpanLookup.offsetForRemoval(paramInt1, paramInt2);
      break label96;
      this.mLazySpanLookup.offsetForRemoval(paramInt1, i);
      localLazySpanLookup = this.mLazySpanLookup;
      localLazySpanLookup.offsetForAddition(paramInt2, i);
      break label96;
      boolean bool2 = this.mShouldReverseLayout;
      if (bool2) {}
      for (int n = getFirstChildPosition();; n = getLastChildPosition())
      {
        if (j > n) {
          break label236;
        }
        requestLayout();
        break;
      }
    }
  }
  
  private void measureChildWithDecorationsAndMargin(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject = this.mTmpRect;
    calculateItemDecorationsForChild(paramView, (Rect)localObject);
    localObject = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    int i = ((StaggeredGridLayoutManager.LayoutParams)localObject).leftMargin;
    Rect localRect1 = this.mTmpRect;
    int j = localRect1.left;
    i += j;
    j = ((StaggeredGridLayoutManager.LayoutParams)localObject).rightMargin;
    int k = this.mTmpRect.right;
    j += k;
    i = updateSpecWithExtra(paramInt1, i, j);
    j = ((StaggeredGridLayoutManager.LayoutParams)localObject).topMargin;
    Rect localRect2 = this.mTmpRect;
    k = localRect2.top;
    j += k;
    k = ((StaggeredGridLayoutManager.LayoutParams)localObject).bottomMargin;
    Rect localRect3 = this.mTmpRect;
    int m = localRect3.bottom;
    k += m;
    j = updateSpecWithExtra(paramInt2, j, k);
    if (paramBoolean) {}
    for (boolean bool = shouldReMeasureChild(paramView, i, j, (RecyclerView.LayoutParams)localObject);; bool = shouldMeasureChild(paramView, i, j, (RecyclerView.LayoutParams)localObject))
    {
      if (bool) {
        paramView.measure(i, j);
      }
      return;
    }
  }
  
  private void measureChildWithDecorationsAndMargin(View paramView, StaggeredGridLayoutManager.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    int i = 0;
    int j = 1;
    boolean bool = paramLayoutParams.mFullSpan;
    int m;
    int i1;
    int i2;
    int i3;
    if (bool)
    {
      int k = this.mOrientation;
      if (k == j)
      {
        m = this.mFullSizeSpec;
        i1 = getHeight();
        i2 = getHeightMode();
        i3 = getPaddingTop();
        i = getPaddingBottom();
        i3 += i;
        i = paramLayoutParams.height;
        i1 = getChildMeasureSpec(i1, i2, i3, i, j);
        measureChildWithDecorationsAndMargin(paramView, m, i1, paramBoolean);
      }
    }
    for (;;)
    {
      return;
      m = getWidth();
      i1 = getWidthMode();
      i2 = getPaddingLeft();
      i3 = getPaddingRight();
      i2 += i3;
      i3 = paramLayoutParams.width;
      m = getChildMeasureSpec(m, i1, i2, i3, j);
      i1 = this.mFullSizeSpec;
      measureChildWithDecorationsAndMargin(paramView, m, i1, paramBoolean);
      continue;
      m = this.mOrientation;
      int n;
      if (m == j)
      {
        n = this.mSizePerSpan;
        i1 = getWidthMode();
        i2 = paramLayoutParams.width;
        n = getChildMeasureSpec(n, i1, 0, i2, false);
        i1 = getHeight();
        i2 = getHeightMode();
        i3 = getPaddingTop();
        i = getPaddingBottom();
        i3 += i;
        i = paramLayoutParams.height;
        i1 = getChildMeasureSpec(i1, i2, i3, i, j);
        measureChildWithDecorationsAndMargin(paramView, n, i1, paramBoolean);
      }
      else
      {
        n = getWidth();
        i1 = getWidthMode();
        i2 = getPaddingLeft();
        i3 = getPaddingRight();
        i2 += i3;
        i3 = paramLayoutParams.width;
        n = getChildMeasureSpec(n, i1, i2, i3, j);
        i1 = this.mSizePerSpan;
        i2 = getHeightMode();
        i3 = paramLayoutParams.height;
        i1 = getChildMeasureSpec(i1, i2, 0, i3, false);
        measureChildWithDecorationsAndMargin(paramView, n, i1, paramBoolean);
      }
    }
  }
  
  private void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = -1;
    int j = 1;
    StaggeredGridLayoutManager.AnchorInfo localAnchorInfo1 = this.mAnchorInfo;
    Object localObject1 = this.mPendingSavedState;
    int m;
    if (localObject1 == null)
    {
      m = this.mPendingScrollPosition;
      if (m == i) {}
    }
    else
    {
      m = paramState.getItemCount();
      if (m == 0)
      {
        removeAndRecycleAllViews(paramRecycler);
        localAnchorInfo1.reset();
        return;
      }
    }
    boolean bool1 = localAnchorInfo1.mValid;
    if (bool1)
    {
      n = this.mPendingScrollPosition;
      if (n == i)
      {
        localObject1 = this.mPendingSavedState;
        if (localObject1 == null) {
          break label358;
        }
      }
    }
    int n = j;
    Object localObject2;
    if (n != 0)
    {
      localAnchorInfo1.reset();
      localObject2 = this.mPendingSavedState;
      if (localObject2 == null) {
        break label367;
      }
      applyPendingSavedState(localAnchorInfo1);
    }
    for (;;)
    {
      updateAnchorInfoForLayout(paramState, localAnchorInfo1);
      localAnchorInfo1.mValid = j;
      localObject2 = this.mPendingSavedState;
      if (localObject2 == null)
      {
        int i5 = this.mPendingScrollPosition;
        if (i5 == i)
        {
          boolean bool4 = localAnchorInfo1.mLayoutFromEnd;
          boolean bool7 = this.mLastLayoutFromEnd;
          if (bool4 == bool7)
          {
            bool4 = isLayoutRTL();
            bool7 = this.mLastLayoutRTL;
            if (bool4 == bool7) {}
          }
          else
          {
            localObject2 = this.mLazySpanLookup;
            ((StaggeredGridLayoutManager.LazySpanLookup)localObject2).clear();
            localAnchorInfo1.mInvalidateOffsets = j;
          }
        }
      }
      int i6 = getChildCount();
      if (i6 <= 0) {
        break label484;
      }
      localObject2 = this.mPendingSavedState;
      if (localObject2 != null)
      {
        localObject2 = this.mPendingSavedState;
        i6 = ((StaggeredGridLayoutManager.SavedState)localObject2).mSpanOffsetsSize;
        if (i6 >= j) {
          break label484;
        }
      }
      boolean bool5 = localAnchorInfo1.mInvalidateOffsets;
      if (!bool5) {
        break label387;
      }
      n = 0;
      localObject1 = null;
      for (;;)
      {
        int i7 = this.mSpanCount;
        if (n >= i7) {
          break;
        }
        localObject2 = this.mSpans[n];
        ((StaggeredGridLayoutManager.Span)localObject2).clear();
        i7 = localAnchorInfo1.mOffset;
        int i10 = -1 << -1;
        if (i7 != i10)
        {
          localObject2 = this.mSpans[n];
          i10 = localAnchorInfo1.mOffset;
          ((StaggeredGridLayoutManager.Span)localObject2).setLine(i10);
        }
        n += 1;
      }
      label358:
      n = 0;
      localObject1 = null;
      break;
      label367:
      resolveShouldLayoutReverse();
      boolean bool6 = this.mShouldReverseLayout;
      localAnchorInfo1.mLayoutFromEnd = bool6;
    }
    label387:
    int i8;
    label484:
    Object localObject3;
    label629:
    label670:
    int i3;
    if (n == 0)
    {
      localObject1 = this.mAnchorInfo.mSpanReferenceLines;
      if (localObject1 != null) {}
    }
    else
    {
      n = 0;
      localObject1 = null;
      for (;;)
      {
        i8 = this.mSpanCount;
        if (n >= i8) {
          break;
        }
        localObject2 = this.mSpans[n];
        boolean bool8 = this.mShouldReverseLayout;
        int i13 = localAnchorInfo1.mOffset;
        ((StaggeredGridLayoutManager.Span)localObject2).cacheReferenceLineAndClear(bool8, i13);
        n += 1;
      }
      localObject1 = this.mAnchorInfo;
      localObject2 = this.mSpans;
      ((StaggeredGridLayoutManager.AnchorInfo)localObject1).saveSpanReferenceLines((StaggeredGridLayoutManager.Span[])localObject2);
      detachAndScrapAttachedViews(paramRecycler);
      this.mLayoutState.mRecycle = false;
      this.mLaidOutInvalidFullSpan = false;
      localObject1 = this.mSecondaryOrientation;
      n = ((OrientationHelper)localObject1).getTotalSpace();
      updateMeasureSpecs(n);
      n = localAnchorInfo1.mPosition;
      updateLayoutState(n, paramState);
      boolean bool2 = localAnchorInfo1.mLayoutFromEnd;
      if (!bool2) {
        break label904;
      }
      setLayoutStateDirection(i);
      localObject1 = this.mLayoutState;
      fill(paramRecycler, (LayoutState)localObject1, paramState);
      setLayoutStateDirection(j);
      localObject1 = this.mLayoutState;
      i8 = localAnchorInfo1.mPosition;
      localObject3 = this.mLayoutState;
      int i11 = ((LayoutState)localObject3).mItemDirection;
      i8 += i11;
      ((LayoutState)localObject1).mCurrentPosition = i8;
      localObject1 = this.mLayoutState;
      fill(paramRecycler, (LayoutState)localObject1, paramState);
      repositionToWrapContentIfNecessary();
      int i1 = getChildCount();
      if (i1 > 0)
      {
        bool3 = this.mShouldReverseLayout;
        if (!bool3) {
          break label989;
        }
        fixEndGap(paramRecycler, paramState, j);
        fixStartGap(paramRecycler, paramState, false);
      }
      if (!paramBoolean) {
        break label1016;
      }
      boolean bool3 = paramState.isPreLayout();
      if (bool3) {
        break label1016;
      }
      int i2 = this.mGapStrategy;
      if (i2 == 0) {
        break label1007;
      }
      i2 = getChildCount();
      if (i2 <= 0) {
        break label1007;
      }
      i3 = this.mLaidOutInvalidFullSpan;
      if (i3 == 0)
      {
        localObject1 = hasGapsToFix();
        if (localObject1 == null) {
          break label1007;
        }
      }
      i3 = j;
      label733:
      if (i3 == 0) {
        break label1016;
      }
      localObject1 = this.mCheckForGapsRunnable;
      removeCallbacks((Runnable)localObject1);
      i3 = checkForGaps();
      if (i3 == 0) {
        break label1016;
      }
      i3 = j;
    }
    for (;;)
    {
      int k = paramState.isPreLayout();
      if (k != 0)
      {
        StaggeredGridLayoutManager.AnchorInfo localAnchorInfo2 = this.mAnchorInfo;
        localAnchorInfo2.reset();
      }
      k = localAnchorInfo1.mLayoutFromEnd;
      this.mLastLayoutFromEnd = k;
      k = isLayoutRTL();
      this.mLastLayoutRTL = k;
      if (i3 == 0) {
        break;
      }
      localObject1 = this.mAnchorInfo;
      ((StaggeredGridLayoutManager.AnchorInfo)localObject1).reset();
      onLayoutChildren(paramRecycler, paramState, false);
      break;
      i3 = 0;
      localObject1 = null;
      for (;;)
      {
        i8 = this.mSpanCount;
        if (i3 >= i8) {
          break;
        }
        localObject2 = this.mSpans[i3];
        ((StaggeredGridLayoutManager.Span)localObject2).clear();
        localObject3 = this.mAnchorInfo.mSpanReferenceLines;
        i12 = localObject3[i3];
        ((StaggeredGridLayoutManager.Span)localObject2).setLine(i12);
        i3 += 1;
      }
      label904:
      setLayoutStateDirection(k);
      localObject1 = this.mLayoutState;
      fill(paramRecycler, (LayoutState)localObject1, paramState);
      setLayoutStateDirection(i);
      localObject1 = this.mLayoutState;
      int i9 = localAnchorInfo1.mPosition;
      localObject3 = this.mLayoutState;
      int i12 = ((LayoutState)localObject3).mItemDirection;
      i9 += i12;
      ((LayoutState)localObject1).mCurrentPosition = i9;
      localObject1 = this.mLayoutState;
      fill(paramRecycler, (LayoutState)localObject1, paramState);
      break label629;
      label989:
      fixStartGap(paramRecycler, paramState, k);
      fixEndGap(paramRecycler, paramState, false);
      break label670;
      label1007:
      int i4 = 0;
      localObject1 = null;
      break label733;
      label1016:
      i4 = 0;
      localObject1 = null;
    }
  }
  
  private boolean preferLastSpan(int paramInt)
  {
    int i = -1;
    int m = 1;
    int n = this.mOrientation;
    int j;
    if (n == 0)
    {
      if (paramInt == i)
      {
        n = m;
        j = this.mShouldReverseLayout;
        if (n == j) {
          break label42;
        }
      }
      for (;;)
      {
        return m;
        n = 0;
        break;
        label42:
        m = 0;
      }
    }
    label55:
    int k;
    if (paramInt == j)
    {
      n = m;
      k = this.mShouldReverseLayout;
      if (n != k) {
        break label91;
      }
    }
    label91:
    for (n = m;; n = 0)
    {
      k = isLayoutRTL();
      if (n == k) {
        break;
      }
      m = 0;
      break;
      n = 0;
      break label55;
    }
  }
  
  private void prependViewToAllSpans(View paramView)
  {
    int i = this.mSpanCount + -1;
    while (i >= 0)
    {
      StaggeredGridLayoutManager.Span localSpan = this.mSpans[i];
      localSpan.prependToSpan(paramView);
      i += -1;
    }
  }
  
  private void recycle(RecyclerView.Recycler paramRecycler, LayoutState paramLayoutState)
  {
    int i = -1;
    boolean bool = paramLayoutState.mRecycle;
    if (bool)
    {
      bool = paramLayoutState.mInfinite;
      if (!bool) {
        break label25;
      }
    }
    for (;;)
    {
      return;
      label25:
      j = paramLayoutState.mAvailable;
      if (j != 0) {
        break;
      }
      j = paramLayoutState.mLayoutDirection;
      if (j == i)
      {
        j = paramLayoutState.mEndLine;
        recycleFromEnd(paramRecycler, j);
      }
      else
      {
        j = paramLayoutState.mStartLine;
        recycleFromStart(paramRecycler, j);
      }
    }
    int j = paramLayoutState.mLayoutDirection;
    int k;
    if (j == i)
    {
      j = paramLayoutState.mStartLine;
      i = paramLayoutState.mStartLine;
      i = getMaxStart(i);
      j -= i;
      if (j < 0) {}
      for (j = paramLayoutState.mEndLine;; j = i - j)
      {
        recycleFromEnd(paramRecycler, j);
        break;
        i = paramLayoutState.mEndLine;
        k = paramLayoutState.mAvailable;
        j = Math.min(j, k);
      }
    }
    j = paramLayoutState.mEndLine;
    j = getMinEnd(j);
    i = paramLayoutState.mEndLine;
    j -= i;
    if (j < 0) {}
    for (j = paramLayoutState.mStartLine;; j = Math.min(j, k) + i)
    {
      recycleFromStart(paramRecycler, j);
      break;
      i = paramLayoutState.mStartLine;
      k = paramLayoutState.mAvailable;
    }
  }
  
  private void recycleFromEnd(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    int i = 1;
    int j = getChildCount() + -1;
    for (int k = j;; k = j)
    {
      View localView;
      int m;
      Object localObject2;
      if (k >= 0)
      {
        localView = getChildAt(k);
        localObject1 = this.mPrimaryOrientation;
        j = ((OrientationHelper)localObject1).getDecoratedStart(localView);
        if (j >= paramInt)
        {
          localObject1 = this.mPrimaryOrientation;
          j = ((OrientationHelper)localObject1).getTransformedStartWithDecoration(localView);
          if (j >= paramInt)
          {
            localObject1 = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
            boolean bool = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mFullSpan;
            if (!bool) {
              break label187;
            }
            j = 0;
            localObject1 = null;
            m = this.mSpanCount;
            if (j >= m) {
              break label145;
            }
            localObject2 = this.mSpans[j].mViews;
            m = ((ArrayList)localObject2).size();
            if (m != i) {
              break label136;
            }
          }
        }
      }
      label136:
      label145:
      label187:
      do
      {
        return;
        j += 1;
        break;
        j = 0;
        localObject1 = null;
        for (;;)
        {
          m = this.mSpanCount;
          if (j >= m) {
            break;
          }
          localObject2 = this.mSpans[j];
          ((StaggeredGridLayoutManager.Span)localObject2).popEnd();
          j += 1;
        }
        localObject2 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan.mViews;
        m = ((ArrayList)localObject2).size();
      } while (m == i);
      Object localObject1 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan;
      ((StaggeredGridLayoutManager.Span)localObject1).popEnd();
      removeAndRecycleView(localView, paramRecycler);
      j = k + -1;
    }
  }
  
  private void recycleFromStart(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    int i = 1;
    for (;;)
    {
      int j = getChildCount();
      View localView;
      int k;
      Object localObject2;
      if (j > 0)
      {
        localView = getChildAt(0);
        localObject1 = this.mPrimaryOrientation;
        j = ((OrientationHelper)localObject1).getDecoratedEnd(localView);
        if (j <= paramInt)
        {
          localObject1 = this.mPrimaryOrientation;
          j = ((OrientationHelper)localObject1).getTransformedEndWithDecoration(localView);
          if (j <= paramInt)
          {
            localObject1 = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
            boolean bool = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mFullSpan;
            if (!bool) {
              break label180;
            }
            j = 0;
            localObject1 = null;
            k = this.mSpanCount;
            if (j >= k) {
              break label138;
            }
            localObject2 = this.mSpans[j].mViews;
            k = ((ArrayList)localObject2).size();
            if (k != i) {
              break label129;
            }
          }
        }
      }
      label129:
      label138:
      label180:
      do
      {
        return;
        j += 1;
        break;
        j = 0;
        localObject1 = null;
        for (;;)
        {
          k = this.mSpanCount;
          if (j >= k) {
            break;
          }
          localObject2 = this.mSpans[j];
          ((StaggeredGridLayoutManager.Span)localObject2).popStart();
          j += 1;
        }
        localObject2 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan.mViews;
        k = ((ArrayList)localObject2).size();
      } while (k == i);
      Object localObject1 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan;
      ((StaggeredGridLayoutManager.Span)localObject1).popStart();
      removeAndRecycleView(localView, paramRecycler);
    }
  }
  
  private void repositionToWrapContentIfNecessary()
  {
    int i = 1;
    boolean bool1 = false;
    StaggeredGridLayoutManager.Span localSpan1 = null;
    Object localObject = this.mSecondaryOrientation;
    int k = ((OrientationHelper)localObject).getMode();
    int n = 1073741824;
    float f1 = 2.0F;
    if (k == n) {
      return;
    }
    int i1 = 0;
    float f2 = 0.0F;
    View localView = null;
    int i2 = getChildCount();
    int i3 = 0;
    OrientationHelper localOrientationHelper;
    float f3;
    label106:
    int m;
    while (i3 < i2)
    {
      localObject = getChildAt(i3);
      localOrientationHelper = this.mSecondaryOrientation;
      n = localOrientationHelper.getDecoratedMeasurement((View)localObject);
      f1 = n;
      boolean bool3 = f1 < f2;
      if (bool3)
      {
        f3 = f2;
        n = i3 + 1;
        i3 = n;
        f2 = f3;
      }
      else
      {
        localObject = (StaggeredGridLayoutManager.LayoutParams)((View)localObject).getLayoutParams();
        boolean bool2 = ((StaggeredGridLayoutManager.LayoutParams)localObject).isFullSpan();
        if (!bool2) {
          break label527;
        }
        m = 1065353216;
        f3 = 1.0F * f1;
        n = this.mSpanCount;
        f1 = n;
      }
    }
    label290:
    label338:
    label527:
    for (f3 /= f1;; f3 = f1)
    {
      f3 = Math.max(f2, f3);
      break label106;
      i3 = this.mSizePerSpan;
      f3 = this.mSpanCount * f2;
      m = Math.round(f3);
      localOrientationHelper = this.mSecondaryOrientation;
      n = localOrientationHelper.getMode();
      i1 = -1 << -1;
      f2 = -0.0F;
      if (n == i1)
      {
        localOrientationHelper = this.mSecondaryOrientation;
        n = localOrientationHelper.getTotalSpace();
        m = Math.min(m, n);
      }
      updateMeasureSpecs(m);
      m = this.mSizePerSpan;
      if (m == i3) {
        break;
      }
      n = 0;
      localOrientationHelper = null;
      f1 = 0.0F;
      if (n < i2)
      {
        localView = getChildAt(n);
        localObject = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
        bool1 = ((StaggeredGridLayoutManager.LayoutParams)localObject).mFullSpan;
        if (!bool1) {
          break label338;
        }
      }
      for (;;)
      {
        m = n + 1;
        n = m;
        break label290;
        break;
        bool1 = isLayoutRTL();
        if (bool1)
        {
          j = this.mOrientation;
          if (j == i)
          {
            j = this.mSpanCount + -1;
            StaggeredGridLayoutManager.Span localSpan2 = ((StaggeredGridLayoutManager.LayoutParams)localObject).mSpan;
            i4 = localSpan2.mIndex;
            j = -(j - i4);
            i4 = this.mSizePerSpan;
            j *= i4;
            i4 = this.mSpanCount + -1;
            localObject = ((StaggeredGridLayoutManager.LayoutParams)localObject).mSpan;
            m = ((StaggeredGridLayoutManager.Span)localObject).mIndex;
            m = -(i4 - m) * i3;
            m = j - m;
            localView.offsetLeftAndRight(m);
            continue;
          }
        }
        localSpan1 = ((StaggeredGridLayoutManager.LayoutParams)localObject).mSpan;
        int j = localSpan1.mIndex;
        int i4 = this.mSizePerSpan;
        j *= i4;
        localObject = ((StaggeredGridLayoutManager.LayoutParams)localObject).mSpan;
        m = ((StaggeredGridLayoutManager.Span)localObject).mIndex * i3;
        i4 = this.mOrientation;
        if (i4 == i)
        {
          m = j - m;
          localView.offsetLeftAndRight(m);
        }
        else
        {
          m = j - m;
          localView.offsetTopAndBottom(m);
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
  
  private void setLayoutStateDirection(int paramInt)
  {
    int i = 1;
    int j = -1;
    float f = 0.0F / 0.0F;
    LayoutState localLayoutState1 = this.mLayoutState;
    localLayoutState1.mLayoutDirection = paramInt;
    LayoutState localLayoutState2 = this.mLayoutState;
    boolean bool1 = this.mShouldReverseLayout;
    boolean bool2;
    if (paramInt == j)
    {
      bool2 = i;
      if (bool1 != bool2) {
        break label64;
      }
    }
    for (;;)
    {
      localLayoutState2.mItemDirection = i;
      return;
      bool2 = false;
      localLayoutState1 = null;
      break;
      label64:
      i = j;
    }
  }
  
  private void updateAllRemainingSpans(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = this.mSpanCount;
    if (i < j)
    {
      Object localObject = this.mSpans[i].mViews;
      boolean bool = ((ArrayList)localObject).isEmpty();
      if (bool) {}
      for (;;)
      {
        i += 1;
        break;
        localObject = this.mSpans[i];
        updateRemainingSpans((StaggeredGridLayoutManager.Span)localObject, paramInt1, paramInt2);
      }
    }
  }
  
  private boolean updateAnchorFromChildren(RecyclerView.State paramState, StaggeredGridLayoutManager.AnchorInfo paramAnchorInfo)
  {
    boolean bool = this.mLastLayoutFromEnd;
    if (bool) {
      i = paramState.getItemCount();
    }
    for (int i = findLastReferenceChildPosition(i);; i = findFirstReferenceChildPosition(i))
    {
      paramAnchorInfo.mPosition = i;
      paramAnchorInfo.mOffset = (-1 << -1);
      return true;
      i = paramState.getItemCount();
    }
  }
  
  private void updateLayoutState(int paramInt, RecyclerView.State paramState)
  {
    int i = 1;
    boolean bool1 = false;
    this.mLayoutState.mAvailable = 0;
    Object localObject1 = this.mLayoutState;
    ((LayoutState)localObject1).mCurrentPosition = paramInt;
    boolean bool2 = isSmoothScrolling();
    int j;
    int m;
    Object localObject2;
    if (bool2)
    {
      j = paramState.getTargetScrollPosition();
      int k = -1;
      if (j != k)
      {
        m = this.mShouldReverseLayout;
        if (j < paramInt)
        {
          j = i;
          if (m != j) {
            break label248;
          }
          localObject1 = this.mPrimaryOrientation;
          j = ((OrientationHelper)localObject1).getTotalSpace();
          m = 0;
          localObject2 = null;
        }
      }
    }
    for (;;)
    {
      label93:
      boolean bool3 = getClipToPadding();
      Object localObject3;
      OrientationHelper localOrientationHelper;
      int i1;
      if (bool3)
      {
        localObject3 = this.mLayoutState;
        localOrientationHelper = this.mPrimaryOrientation;
        i1 = localOrientationHelper.getStartAfterPadding();
        m = i1 - m;
        ((LayoutState)localObject3).mStartLine = m;
        localObject2 = this.mLayoutState;
        localObject3 = this.mPrimaryOrientation;
        int n = ((OrientationHelper)localObject3).getEndAfterPadding();
        j += n;
        ((LayoutState)localObject2).mEndLine = j;
      }
      for (;;)
      {
        this.mLayoutState.mStopInFocusable = false;
        this.mLayoutState.mRecycle = i;
        localObject1 = this.mLayoutState;
        localObject2 = this.mPrimaryOrientation;
        m = ((OrientationHelper)localObject2).getMode();
        if (m == 0)
        {
          localObject2 = this.mPrimaryOrientation;
          m = ((OrientationHelper)localObject2).getEnd();
          if (m == 0) {
            bool1 = i;
          }
        }
        ((LayoutState)localObject1).mInfinite = bool1;
        return;
        j = 0;
        localObject1 = null;
        break;
        label248:
        m = this.mPrimaryOrientation.getTotalSpace();
        j = 0;
        localObject1 = null;
        break label93;
        localObject3 = this.mLayoutState;
        localOrientationHelper = this.mPrimaryOrientation;
        i1 = localOrientationHelper.getEnd();
        j += i1;
        ((LayoutState)localObject3).mEndLine = j;
        localObject1 = this.mLayoutState;
        m = -m;
        ((LayoutState)localObject1).mStartLine = m;
      }
      j = 0;
      localObject1 = null;
      m = 0;
      localObject2 = null;
    }
  }
  
  private void updateRemainingSpans(StaggeredGridLayoutManager.Span paramSpan, int paramInt1, int paramInt2)
  {
    int i = paramSpan.getDeletedSize();
    int j = -1;
    BitSet localBitSet;
    if (paramInt1 == j)
    {
      j = paramSpan.getStartLine();
      i += j;
      if (i <= paramInt2)
      {
        localBitSet = this.mRemainingSpans;
        j = paramSpan.mIndex;
        localBitSet.set(j, false);
      }
    }
    for (;;)
    {
      return;
      j = paramSpan.getEndLine();
      i = j - i;
      if (i >= paramInt2)
      {
        localBitSet = this.mRemainingSpans;
        j = paramSpan.mIndex;
        localBitSet.set(j, false);
      }
    }
  }
  
  private int updateSpecWithExtra(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    for (;;)
    {
      return paramInt1;
      int i = View.MeasureSpec.getMode(paramInt1);
      int j = -1 << -1;
      if (i != j)
      {
        j = 1073741824;
        if (i != j) {}
      }
      else
      {
        int k = View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3;
        j = Math.max(0, k);
        paramInt1 = View.MeasureSpec.makeMeasureSpec(j, i);
      }
    }
  }
  
  boolean areAllEndsEqual()
  {
    int i = 1;
    int j = -1 << -1;
    StaggeredGridLayoutManager.Span localSpan1 = this.mSpans[0];
    int k = localSpan1.getEndLine(j);
    int m = i;
    for (;;)
    {
      int i1 = this.mSpanCount;
      if (m < i1)
      {
        StaggeredGridLayoutManager.Span localSpan2 = this.mSpans[m];
        int i2 = localSpan2.getEndLine(j);
        if (i2 != k) {
          i = 0;
        }
      }
      else
      {
        return i;
      }
      int n;
      m += 1;
    }
  }
  
  boolean areAllStartsEqual()
  {
    int i = 1;
    int j = -1 << -1;
    StaggeredGridLayoutManager.Span localSpan1 = this.mSpans[0];
    int k = localSpan1.getStartLine(j);
    int m = i;
    for (;;)
    {
      int i1 = this.mSpanCount;
      if (m < i1)
      {
        StaggeredGridLayoutManager.Span localSpan2 = this.mSpans[m];
        int i2 = localSpan2.getStartLine(j);
        if (i2 != k) {
          i = 0;
        }
      }
      else
      {
        return i;
      }
      int n;
      m += 1;
    }
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    StaggeredGridLayoutManager.SavedState localSavedState = this.mPendingSavedState;
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
  
  boolean checkForGaps()
  {
    int i = 0;
    StaggeredGridLayoutManager.LazySpanLookup localLazySpanLookup = null;
    boolean bool1 = true;
    int k = getChildCount();
    boolean bool2;
    if (k != 0)
    {
      k = this.mGapStrategy;
      if (k != 0)
      {
        bool2 = isAttachedToWindow();
        if (bool2) {
          break label43;
        }
      }
    }
    bool1 = false;
    label43:
    int i2;
    for (;;)
    {
      return bool1;
      bool2 = this.mShouldReverseLayout;
      int m;
      if (bool2)
      {
        i1 = getLastChildPosition();
        m = getFirstChildPosition();
        i2 = i1;
      }
      for (i1 = m;; i1 = m)
      {
        if (i2 != 0) {
          break label135;
        }
        localObject1 = hasGapsToFix();
        if (localObject1 == null) {
          break label135;
        }
        localObject1 = this.mLazySpanLookup;
        ((StaggeredGridLayoutManager.LazySpanLookup)localObject1).clear();
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        break;
        i1 = getFirstChildPosition();
        m = getLastChildPosition();
        i2 = i1;
      }
      label135:
      bool3 = this.mLaidOutInvalidFullSpan;
      if (bool3) {
        break;
      }
      bool1 = false;
    }
    boolean bool3 = this.mShouldReverseLayout;
    if (bool3) {}
    Object localObject2;
    int j;
    for (int n = -1;; n = j)
    {
      localObject2 = this.mLazySpanLookup;
      int i3 = i1 + 1;
      localObject2 = ((StaggeredGridLayoutManager.LazySpanLookup)localObject2).getFirstFullSpanItemInRange(i2, i3, n, bool1);
      if (localObject2 != null) {
        break label230;
      }
      this.mLaidOutInvalidFullSpan = false;
      localObject1 = this.mLazySpanLookup;
      j = i1 + 1;
      ((StaggeredGridLayoutManager.LazySpanLookup)localObject1).forceInvalidateAfter(j);
      j = 0;
      break;
    }
    label230:
    localLazySpanLookup = this.mLazySpanLookup;
    int i1 = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).mPosition;
    n *= -1;
    Object localObject1 = localLazySpanLookup.getFirstFullSpanItemInRange(i2, i1, n, j);
    if (localObject1 == null)
    {
      localObject1 = this.mLazySpanLookup;
      i = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject2).mPosition;
      ((StaggeredGridLayoutManager.LazySpanLookup)localObject1).forceInvalidateAfter(i);
    }
    for (;;)
    {
      requestSimpleAnimationsInNextLayout();
      requestLayout();
      break;
      localLazySpanLookup = this.mLazySpanLookup;
      n = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject1).mPosition + 1;
      localLazySpanLookup.forceInvalidateAfter(n);
    }
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof StaggeredGridLayoutManager.LayoutParams;
  }
  
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = 0;
    int j = this.mOrientation;
    if (j == 0)
    {
      j = getChildCount();
      if ((j != 0) && (paramInt1 != 0)) {
        break label35;
      }
    }
    label35:
    label393:
    for (;;)
    {
      return;
      paramInt1 = paramInt2;
      break;
      prepareLayoutStateForDelta(paramInt1, paramState);
      Object localObject1 = this.mPrefetchDistances;
      if (localObject1 != null)
      {
        localObject1 = this.mPrefetchDistances;
        j = localObject1.length;
        m = this.mSpanCount;
        if (j >= m) {}
      }
      else
      {
        j = this.mSpanCount;
        localObject1 = new int[j];
        this.mPrefetchDistances = ((int[])localObject1);
      }
      j = 0;
      localObject1 = null;
      int m = 0;
      int n = this.mSpanCount;
      Object localObject2;
      int i1;
      Object localObject3;
      if (j < n)
      {
        localObject2 = this.mLayoutState;
        n = ((LayoutState)localObject2).mItemDirection;
        i1 = -1;
        if (n == i1)
        {
          localObject2 = this.mLayoutState;
          n = ((LayoutState)localObject2).mStartLine;
          localObject3 = this.mSpans[j];
          LayoutState localLayoutState = this.mLayoutState;
          int i2 = localLayoutState.mStartLine;
          i1 = ((StaggeredGridLayoutManager.Span)localObject3).getStartLine(i2);
          n -= i1;
        }
        for (;;)
        {
          if (n >= 0)
          {
            localObject3 = this.mPrefetchDistances;
            localObject3[m] = n;
            m += 1;
          }
          j += 1;
          break;
          localObject2 = this.mSpans[j];
          i1 = this.mLayoutState.mEndLine;
          n = ((StaggeredGridLayoutManager.Span)localObject2).getEndLine(i1);
          localObject3 = this.mLayoutState;
          i1 = ((LayoutState)localObject3).mEndLine;
          n -= i1;
        }
      }
      localObject1 = this.mPrefetchDistances;
      Arrays.sort((int[])localObject1, 0, m);
      for (;;)
      {
        if (i >= m) {
          break label393;
        }
        localObject1 = this.mLayoutState;
        boolean bool = ((LayoutState)localObject1).hasMore(paramState);
        if (!bool) {
          break;
        }
        int k = this.mLayoutState.mCurrentPosition;
        localObject2 = this.mPrefetchDistances;
        n = localObject2[i];
        paramLayoutPrefetchRegistry.addPosition(k, n);
        localObject1 = this.mLayoutState;
        n = ((LayoutState)localObject1).mCurrentPosition;
        localObject3 = this.mLayoutState;
        i1 = ((LayoutState)localObject3).mItemDirection;
        n += i1;
        ((LayoutState)localObject1).mCurrentPosition = n;
        i += 1;
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
    int i = calculateScrollDirectionForPosition(paramInt);
    PointF localPointF = new android/graphics/PointF;
    localPointF.<init>();
    if (i == 0) {
      localPointF = null;
    }
    for (;;)
    {
      return localPointF;
      int j = this.mOrientation;
      float f;
      if (j == 0)
      {
        f = i;
        localPointF.x = f;
        localPointF.y = 0.0F;
      }
      else
      {
        localPointF.x = 0.0F;
        f = i;
        localPointF.y = f;
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
  
  public int[] findFirstCompletelyVisibleItemPositions(int[] paramArrayOfInt)
  {
    int i;
    if (paramArrayOfInt == null)
    {
      i = this.mSpanCount;
      paramArrayOfInt = new int[i];
    }
    int j;
    do
    {
      i = 0;
      localIllegalArgumentException = null;
      for (;;)
      {
        j = this.mSpanCount;
        if (i >= j) {
          break;
        }
        localObject = this.mSpans[i];
        j = ((StaggeredGridLayoutManager.Span)localObject).findFirstCompletelyVisibleItemPosition();
        paramArrayOfInt[i] = j;
        i += 1;
      }
      i = paramArrayOfInt.length;
      j = this.mSpanCount;
    } while (i >= j);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Provided int[]'s size must be more than or equal to span count. Expected:");
    int k = this.mSpanCount;
    localObject = ((StringBuilder)localObject).append(k).append(", array size:");
    k = paramArrayOfInt.length;
    localObject = k;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
    return paramArrayOfInt;
  }
  
  View findFirstVisibleItemClosestToEnd(boolean paramBoolean)
  {
    int i = this.mPrimaryOrientation.getStartAfterPadding();
    int j = this.mPrimaryOrientation.getEndAfterPadding();
    int k = 0;
    Object localObject1 = null;
    int m = getChildCount() + -1;
    Object localObject2 = null;
    for (;;)
    {
      if (m >= 0)
      {
        localObject1 = getChildAt(m);
        OrientationHelper localOrientationHelper1 = this.mPrimaryOrientation;
        int n = localOrientationHelper1.getDecoratedStart((View)localObject1);
        OrientationHelper localOrientationHelper2 = this.mPrimaryOrientation;
        int i1 = localOrientationHelper2.getDecoratedEnd((View)localObject1);
        if ((i1 <= i) || (n >= j))
        {
          k = m + -1;
          m = k;
        }
        else
        {
          if ((i1 > j) && (paramBoolean)) {
            break;
          }
        }
      }
    }
    for (;;)
    {
      return (View)localObject1;
      if (localObject2 != null) {
        break;
      }
      localObject2 = localObject1;
      break;
      localObject1 = localObject2;
    }
  }
  
  View findFirstVisibleItemClosestToStart(boolean paramBoolean)
  {
    int i = this.mPrimaryOrientation.getStartAfterPadding();
    int j = this.mPrimaryOrientation.getEndAfterPadding();
    int k = getChildCount();
    int m = 0;
    Object localObject1 = null;
    int n = 0;
    Object localObject2 = null;
    for (;;)
    {
      if (n < k)
      {
        localObject1 = getChildAt(n);
        OrientationHelper localOrientationHelper1 = this.mPrimaryOrientation;
        int i1 = localOrientationHelper1.getDecoratedStart((View)localObject1);
        OrientationHelper localOrientationHelper2 = this.mPrimaryOrientation;
        int i2 = localOrientationHelper2.getDecoratedEnd((View)localObject1);
        if ((i2 <= i) || (i1 >= j))
        {
          m = n + 1;
          n = m;
        }
        else
        {
          if ((i1 < i) && (paramBoolean)) {
            break;
          }
        }
      }
    }
    for (;;)
    {
      return (View)localObject1;
      if (localObject2 != null) {
        break;
      }
      localObject2 = localObject1;
      break;
      localObject1 = localObject2;
    }
  }
  
  int findFirstVisibleItemPositionInt()
  {
    boolean bool1 = true;
    boolean bool2 = this.mShouldReverseLayout;
    View localView;
    if (bool2)
    {
      localView = findFirstVisibleItemClosestToEnd(bool1);
      if (localView != null) {
        break label34;
      }
    }
    label34:
    for (int i = -1;; i = getPosition(localView))
    {
      return i;
      localView = findFirstVisibleItemClosestToStart(bool1);
      break;
    }
  }
  
  public int[] findFirstVisibleItemPositions(int[] paramArrayOfInt)
  {
    int i;
    if (paramArrayOfInt == null)
    {
      i = this.mSpanCount;
      paramArrayOfInt = new int[i];
    }
    int j;
    do
    {
      i = 0;
      localIllegalArgumentException = null;
      for (;;)
      {
        j = this.mSpanCount;
        if (i >= j) {
          break;
        }
        localObject = this.mSpans[i];
        j = ((StaggeredGridLayoutManager.Span)localObject).findFirstVisibleItemPosition();
        paramArrayOfInt[i] = j;
        i += 1;
      }
      i = paramArrayOfInt.length;
      j = this.mSpanCount;
    } while (i >= j);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Provided int[]'s size must be more than or equal to span count. Expected:");
    int k = this.mSpanCount;
    localObject = ((StringBuilder)localObject).append(k).append(", array size:");
    k = paramArrayOfInt.length;
    localObject = k;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
    return paramArrayOfInt;
  }
  
  public int[] findLastCompletelyVisibleItemPositions(int[] paramArrayOfInt)
  {
    int i;
    if (paramArrayOfInt == null)
    {
      i = this.mSpanCount;
      paramArrayOfInt = new int[i];
    }
    int j;
    do
    {
      i = 0;
      localIllegalArgumentException = null;
      for (;;)
      {
        j = this.mSpanCount;
        if (i >= j) {
          break;
        }
        localObject = this.mSpans[i];
        j = ((StaggeredGridLayoutManager.Span)localObject).findLastCompletelyVisibleItemPosition();
        paramArrayOfInt[i] = j;
        i += 1;
      }
      i = paramArrayOfInt.length;
      j = this.mSpanCount;
    } while (i >= j);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Provided int[]'s size must be more than or equal to span count. Expected:");
    int k = this.mSpanCount;
    localObject = ((StringBuilder)localObject).append(k).append(", array size:");
    k = paramArrayOfInt.length;
    localObject = k;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
    return paramArrayOfInt;
  }
  
  public int[] findLastVisibleItemPositions(int[] paramArrayOfInt)
  {
    int i;
    if (paramArrayOfInt == null)
    {
      i = this.mSpanCount;
      paramArrayOfInt = new int[i];
    }
    int j;
    do
    {
      i = 0;
      localIllegalArgumentException = null;
      for (;;)
      {
        j = this.mSpanCount;
        if (i >= j) {
          break;
        }
        localObject = this.mSpans[i];
        j = ((StaggeredGridLayoutManager.Span)localObject).findLastVisibleItemPosition();
        paramArrayOfInt[i] = j;
        i += 1;
      }
      i = paramArrayOfInt.length;
      j = this.mSpanCount;
    } while (i >= j);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Provided int[]'s size must be more than or equal to span count. Expected:");
    int k = this.mSpanCount;
    localObject = ((StringBuilder)localObject).append(k).append(", array size:");
    k = paramArrayOfInt.length;
    localObject = k;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
    return paramArrayOfInt;
  }
  
  public RecyclerView.LayoutParams generateDefaultLayoutParams()
  {
    int i = -1;
    int j = -2;
    int k = this.mOrientation;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams;
    if (k == 0)
    {
      localLayoutParams = new android/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;
      localLayoutParams.<init>(j, i);
    }
    for (;;)
    {
      return localLayoutParams;
      localLayoutParams = new android/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;
      localLayoutParams.<init>(i, j);
    }
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = new android/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;
    localLayoutParams.<init>(paramContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams;
    if (bool)
    {
      localLayoutParams = new android/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;
      paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localLayoutParams;
      localLayoutParams = new android/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
    }
  }
  
  public int getColumnCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = this.mOrientation;
    int j = 1;
    if (i == j) {}
    for (i = this.mSpanCount;; i = super.getColumnCountForAccessibility(paramRecycler, paramState)) {
      return i;
    }
  }
  
  int getFirstChildPosition()
  {
    int i = 0;
    View localView = null;
    int j = getChildCount();
    if (j == 0) {}
    for (;;)
    {
      return i;
      localView = getChildAt(0);
      i = getPosition(localView);
    }
  }
  
  public int getGapStrategy()
  {
    return this.mGapStrategy;
  }
  
  int getLastChildPosition()
  {
    int i = getChildCount();
    View localView;
    if (i == 0)
    {
      i = 0;
      localView = null;
    }
    for (;;)
    {
      return i;
      i += -1;
      localView = getChildAt(i);
      i = getPosition(localView);
    }
  }
  
  public int getOrientation()
  {
    return this.mOrientation;
  }
  
  public boolean getReverseLayout()
  {
    return this.mReverseLayout;
  }
  
  public int getRowCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = this.mOrientation;
    if (i == 0) {}
    for (i = this.mSpanCount;; i = super.getRowCountForAccessibility(paramRecycler, paramState)) {
      return i;
    }
  }
  
  public int getSpanCount()
  {
    return this.mSpanCount;
  }
  
  View hasGapsToFix()
  {
    int i = -1;
    int j = 1;
    float f = Float.MIN_VALUE;
    int k = getChildCount() + -1;
    BitSet localBitSet = new java/util/BitSet;
    int i2 = this.mSpanCount;
    localBitSet.<init>(i2);
    i2 = this.mSpanCount;
    localBitSet.set(0, i2, j);
    i2 = this.mOrientation;
    boolean bool4;
    int i4;
    if (i2 == j)
    {
      bool4 = isLayoutRTL();
      if (bool4)
      {
        bool4 = j;
        i3 = this.mShouldReverseLayout;
        if (i3 == 0) {
          break label188;
        }
        i4 = i;
        label88:
        if (k >= i4) {
          break label203;
        }
      }
    }
    int i5;
    View localView1;
    Object localObject1;
    label179:
    label188:
    label203:
    for (int i3 = j;; i3 = i)
    {
      i5 = k;
      if (i5 == i4) {
        break label496;
      }
      localView1 = getChildAt(i5);
      localObject1 = (StaggeredGridLayoutManager.LayoutParams)localView1.getLayoutParams();
      localObject2 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan;
      k = ((StaggeredGridLayoutManager.Span)localObject2).mIndex;
      boolean bool1 = localBitSet.get(k);
      if (!bool1) {
        break label230;
      }
      localObject2 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan;
      bool1 = checkSpanForGap((StaggeredGridLayoutManager.Span)localObject2);
      if (!bool1) {
        break label209;
      }
      localObject1 = localView1;
      return (View)localObject1;
      bool4 = i;
      break;
      i4 = bool1 + true;
      bool1 = false;
      localObject2 = null;
      break label88;
    }
    label209:
    Object localObject2 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan;
    int m = ((StaggeredGridLayoutManager.Span)localObject2).mIndex;
    localBitSet.clear(m);
    label230:
    boolean bool2 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mFullSpan;
    if (bool2) {}
    label242:
    label348:
    label402:
    label488:
    label494:
    label496:
    label504:
    label511:
    for (;;)
    {
      i = i5 + i3;
      i5 = i;
      break;
      int n = i5 + i3;
      if (n != i4)
      {
        n = i5 + i3;
        View localView2 = getChildAt(n);
        boolean bool3 = this.mShouldReverseLayout;
        int i1;
        OrientationHelper localOrientationHelper;
        int i6;
        if (bool3)
        {
          localObject2 = this.mPrimaryOrientation;
          i1 = ((OrientationHelper)localObject2).getDecoratedEnd(localView1);
          localOrientationHelper = this.mPrimaryOrientation;
          i6 = localOrientationHelper.getDecoratedEnd(localView2);
          if (i1 < i6)
          {
            localObject1 = localView1;
            break label179;
          }
          if (i1 != i6) {
            break label504;
          }
          i1 = j;
        }
        for (;;)
        {
          if (i1 == 0) {
            break label511;
          }
          localObject2 = (StaggeredGridLayoutManager.LayoutParams)localView2.getLayoutParams();
          localObject1 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan;
          i = ((StaggeredGridLayoutManager.Span)localObject1).mIndex;
          localObject2 = ((StaggeredGridLayoutManager.LayoutParams)localObject2).mSpan;
          i1 = ((StaggeredGridLayoutManager.Span)localObject2).mIndex;
          i -= i1;
          if (i < 0)
          {
            i1 = j;
            if (!bool4) {
              break label488;
            }
            i = j;
          }
          for (;;)
          {
            if (i1 == i) {
              break label494;
            }
            localObject1 = localView1;
            break;
            localObject2 = this.mPrimaryOrientation;
            i1 = ((OrientationHelper)localObject2).getDecoratedStart(localView1);
            localOrientationHelper = this.mPrimaryOrientation;
            i6 = localOrientationHelper.getDecoratedStart(localView2);
            if (i1 > i6)
            {
              localObject1 = localView1;
              break;
            }
            if (i1 != i6) {
              break label504;
            }
            i1 = j;
            break label348;
            i1 = 0;
            localObject2 = null;
            break label402;
            i = 0;
            localObject1 = null;
          }
          break label242;
          i = 0;
          localObject1 = null;
          break;
          i1 = 0;
          localObject2 = null;
        }
      }
    }
  }
  
  public void invalidateSpanAssignments()
  {
    this.mLazySpanLookup.clear();
    requestLayout();
  }
  
  public boolean isAutoMeasureEnabled()
  {
    int i = this.mGapStrategy;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isLayoutRTL()
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
  
  public void offsetChildrenHorizontal(int paramInt)
  {
    super.offsetChildrenHorizontal(paramInt);
    int i = 0;
    for (;;)
    {
      int j = this.mSpanCount;
      if (i >= j) {
        break;
      }
      StaggeredGridLayoutManager.Span localSpan = this.mSpans[i];
      localSpan.onOffset(paramInt);
      i += 1;
    }
  }
  
  public void offsetChildrenVertical(int paramInt)
  {
    super.offsetChildrenVertical(paramInt);
    int i = 0;
    for (;;)
    {
      int j = this.mSpanCount;
      if (i >= j) {
        break;
      }
      StaggeredGridLayoutManager.Span localSpan = this.mSpans[i];
      localSpan.onOffset(paramInt);
      i += 1;
    }
  }
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    super.onDetachedFromWindow(paramRecyclerView, paramRecycler);
    Runnable localRunnable = this.mCheckForGapsRunnable;
    removeCallbacks(localRunnable);
    int i = 0;
    localRunnable = null;
    for (;;)
    {
      int j = this.mSpanCount;
      if (i >= j) {
        break;
      }
      StaggeredGridLayoutManager.Span localSpan = this.mSpans[i];
      localSpan.clear();
      i += 1;
    }
    paramRecyclerView.requestLayout();
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = 0;
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
      View localView = findContainingItemView(paramView);
      if (localView == null)
      {
        k = 0;
        localObject1 = null;
      }
      else
      {
        resolveShouldLayoutReverse();
        int i1 = convertFocusDirectionToLayoutDirection(paramInt);
        k = -1 << -1;
        if (i1 == k)
        {
          k = 0;
          localObject1 = null;
        }
        else
        {
          localObject1 = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
          boolean bool3 = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mFullSpan;
          StaggeredGridLayoutManager.Span localSpan = ((StaggeredGridLayoutManager.LayoutParams)localObject1).mSpan;
          if (i1 == i) {}
          Object localObject3;
          int i2;
          float f3;
          for (k = getLastChildPosition();; k = getFirstChildPosition())
          {
            updateLayoutState(k, paramState);
            setLayoutStateDirection(i1);
            localObject2 = this.mLayoutState;
            localObject3 = this.mLayoutState;
            i2 = ((LayoutState)localObject3).mItemDirection + k;
            ((LayoutState)localObject2).mCurrentPosition = i2;
            localObject2 = this.mLayoutState;
            OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
            int i3 = localOrientationHelper.getTotalSpace();
            float f2 = i3;
            f3 = 0.33333334F * f2;
            i2 = (int)f3;
            ((LayoutState)localObject2).mAvailable = i2;
            this.mLayoutState.mStopInFocusable = i;
            this.mLayoutState.mRecycle = false;
            localObject2 = this.mLayoutState;
            fill(paramRecycler, (LayoutState)localObject2, paramState);
            bool4 = this.mShouldReverseLayout;
            this.mLastLayoutFromEnd = bool4;
            if (bool3) {
              break label295;
            }
            localObject2 = localSpan.getFocusableViewAfter(k, i1);
            if ((localObject2 == null) || (localObject2 == localView)) {
              break label295;
            }
            localObject1 = localObject2;
            break;
          }
          label295:
          boolean bool4 = preferLastSpan(i1);
          if (bool4)
          {
            i4 = this.mSpanCount + -1;
            for (i2 = i4;; i2 = i4)
            {
              if (i2 < 0) {
                break label436;
              }
              localObject2 = this.mSpans[i2].getFocusableViewAfter(k, i1);
              if ((localObject2 != null) && (localObject2 != localView))
              {
                localObject1 = localObject2;
                break;
              }
              i4 = i2 + -1;
            }
          }
          int i4 = 0;
          Object localObject2 = null;
          for (;;)
          {
            i2 = this.mSpanCount;
            if (i4 >= i2) {
              break label436;
            }
            localObject3 = this.mSpans[i4].getFocusableViewAfter(k, i1);
            if ((localObject3 != null) && (localObject3 != localView))
            {
              localObject1 = localObject3;
              break;
            }
            i4 += 1;
          }
          label436:
          boolean bool1 = this.mReverseLayout;
          if (!bool1)
          {
            i4 = i;
            label451:
            m = -1;
            if (i1 != m) {
              break label583;
            }
            m = i;
            label465:
            if (i4 != m) {
              break label592;
            }
            i2 = i;
            f3 = f1;
            label480:
            if (!bool3) {
              if (i2 == 0) {
                break label604;
              }
            }
          }
          label561:
          label583:
          label592:
          label604:
          for (int m = localSpan.findFirstPartiallyVisibleItemPosition();; n = localSpan.findLastPartiallyVisibleItemPosition())
          {
            localObject1 = findViewByPosition(m);
            if ((localObject1 != null) && (localObject1 != localView)) {
              break;
            }
            boolean bool2 = preferLastSpan(i1);
            if (!bool2) {
              break label683;
            }
            n = this.mSpanCount + -1;
            for (i4 = n;; i4 = n)
            {
              if (i4 < 0) {
                break label759;
              }
              n = localSpan.mIndex;
              if (i4 != n) {
                break;
              }
              n = i4 + -1;
            }
            i4 = 0;
            localObject2 = null;
            break label451;
            n = 0;
            localObject1 = null;
            break label465;
            i2 = 0;
            localObject3 = null;
            f3 = 0.0F;
            break label480;
          }
          if (i2 != 0) {
            localObject1 = this.mSpans[i4];
          }
          for (int n = ((StaggeredGridLayoutManager.Span)localObject1).findFirstPartiallyVisibleItemPosition();; n = ((StaggeredGridLayoutManager.Span)localObject1).findLastPartiallyVisibleItemPosition())
          {
            localObject1 = findViewByPosition(n);
            if ((localObject1 == null) || (localObject1 == localView)) {
              break label561;
            }
            break;
            localObject1 = this.mSpans[i4];
          }
          label677:
          j += 1;
          label683:
          n = this.mSpanCount;
          if (j < n)
          {
            if (i2 != 0) {
              localObject1 = this.mSpans[j];
            }
            for (n = ((StaggeredGridLayoutManager.Span)localObject1).findFirstPartiallyVisibleItemPosition();; n = ((StaggeredGridLayoutManager.Span)localObject1).findLastPartiallyVisibleItemPosition())
            {
              localObject1 = findViewByPosition(n);
              if ((localObject1 == null) || (localObject1 == localView)) {
                break label677;
              }
              break;
              localObject1 = this.mSpans[j];
            }
          }
          label759:
          n = 0;
          localObject1 = null;
        }
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = 0;
    View localView1 = null;
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    int j = getChildCount();
    View localView2;
    if (j > 0)
    {
      localView2 = findFirstVisibleItemClosestToStart(false);
      localView1 = findFirstVisibleItemClosestToEnd(false);
      if ((localView2 != null) && (localView1 != null)) {
        break label43;
      }
    }
    for (;;)
    {
      return;
      label43:
      j = getPosition(localView2);
      i = getPosition(localView1);
      if (j < i)
      {
        paramAccessibilityEvent.setFromIndex(j);
        paramAccessibilityEvent.setToIndex(i);
      }
      else
      {
        paramAccessibilityEvent.setFromIndex(i);
        paramAccessibilityEvent.setToIndex(j);
      }
    }
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, View paramView, b paramb)
  {
    Object localObject1 = paramView.getLayoutParams();
    boolean bool1 = localObject1 instanceof StaggeredGridLayoutManager.LayoutParams;
    if (!bool1)
    {
      super.onInitializeAccessibilityNodeInfoForItem(paramView, paramb);
      return;
    }
    Object localObject2 = localObject1;
    localObject2 = (StaggeredGridLayoutManager.LayoutParams)localObject1;
    int j = this.mOrientation;
    boolean bool3;
    if (j == 0)
    {
      j = ((StaggeredGridLayoutManager.LayoutParams)localObject2).getSpanIndex();
      bool1 = ((StaggeredGridLayoutManager.LayoutParams)localObject2).mFullSpan;
      if (bool1) {}
      for (i = this.mSpanCount;; i = 1)
      {
        k = -1;
        int m = -1;
        bool3 = ((StaggeredGridLayoutManager.LayoutParams)localObject2).mFullSpan;
        localObject1 = b.c.a(j, i, k, m, bool3, false);
        paramb.b(localObject1);
        break;
      }
    }
    j = -1;
    int i = -1;
    int k = ((StaggeredGridLayoutManager.LayoutParams)localObject2).getSpanIndex();
    boolean bool2 = ((StaggeredGridLayoutManager.LayoutParams)localObject2).mFullSpan;
    if (bool2) {}
    for (int n = this.mSpanCount;; n = 1)
    {
      bool3 = ((StaggeredGridLayoutManager.LayoutParams)localObject2).mFullSpan;
      localObject1 = b.c.a(j, i, k, n, bool3, false);
      paramb.b(localObject1);
      break;
    }
  }
  
  public void onItemsAdded(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    handleUpdate(paramInt1, paramInt2, 1);
  }
  
  public void onItemsChanged(RecyclerView paramRecyclerView)
  {
    this.mLazySpanLookup.clear();
    requestLayout();
  }
  
  public void onItemsMoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    handleUpdate(paramInt1, paramInt2, 8);
  }
  
  public void onItemsRemoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    handleUpdate(paramInt1, paramInt2, 2);
  }
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    handleUpdate(paramInt1, paramInt2, 4);
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    onLayoutChildren(paramRecycler, paramState, true);
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    this.mPendingScrollPosition = -1;
    this.mPendingScrollPositionOffset = (-1 << -1);
    this.mPendingSavedState = null;
    this.mAnchorInfo.reset();
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof StaggeredGridLayoutManager.SavedState;
    if (bool)
    {
      paramParcelable = (StaggeredGridLayoutManager.SavedState)paramParcelable;
      this.mPendingSavedState = paramParcelable;
      requestLayout();
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    int i = -1;
    int j = 0;
    Object localObject1 = null;
    int m = -1 << -1;
    Object localObject2 = this.mPendingSavedState;
    if (localObject2 != null)
    {
      localObject2 = new android/support/v7/widget/StaggeredGridLayoutManager$SavedState;
      localObject1 = this.mPendingSavedState;
      ((StaggeredGridLayoutManager.SavedState)localObject2).<init>((StaggeredGridLayoutManager.SavedState)localObject1);
    }
    for (;;)
    {
      return (Parcelable)localObject2;
      StaggeredGridLayoutManager.SavedState localSavedState = new android/support/v7/widget/StaggeredGridLayoutManager$SavedState;
      localSavedState.<init>();
      boolean bool2 = this.mReverseLayout;
      localSavedState.mReverseLayout = bool2;
      bool2 = this.mLastLayoutFromEnd;
      localSavedState.mAnchorLayoutFromEnd = bool2;
      bool2 = this.mLastLayoutRTL;
      localSavedState.mLastLayoutRTL = bool2;
      localObject2 = this.mLazySpanLookup;
      int i1;
      label190:
      label244:
      int k;
      Object localObject3;
      if (localObject2 != null)
      {
        localObject2 = this.mLazySpanLookup.mData;
        if (localObject2 != null)
        {
          localObject2 = this.mLazySpanLookup.mData;
          localSavedState.mSpanLookup = ((int[])localObject2);
          int n = localSavedState.mSpanLookup.length;
          localSavedState.mSpanLookupSize = n;
          localObject2 = this.mLazySpanLookup.mFullSpanItems;
          localSavedState.mFullSpanItems = ((List)localObject2);
          n = getChildCount();
          if (n <= 0) {
            break label381;
          }
          boolean bool3 = this.mLastLayoutFromEnd;
          if (!bool3) {
            break label332;
          }
          i1 = getLastChildPosition();
          localSavedState.mAnchorPosition = i1;
          i1 = findFirstVisibleItemPositionInt();
          localSavedState.mVisibleAnchorPosition = i1;
          i1 = this.mSpanCount;
          localSavedState.mSpanOffsetsSize = i1;
          localObject2 = new int[this.mSpanCount];
          localSavedState.mSpanOffsets = ((int[])localObject2);
          i1 = 0;
          localObject2 = null;
          j = this.mSpanCount;
          if (i1 >= j) {
            break label399;
          }
          boolean bool1 = this.mLastLayoutFromEnd;
          if (!bool1) {
            break label341;
          }
          localObject1 = this.mSpans[i1];
          k = ((StaggeredGridLayoutManager.Span)localObject1).getEndLine(m);
          if (k != m)
          {
            localObject3 = this.mPrimaryOrientation;
            i = ((OrientationHelper)localObject3).getEndAfterPadding();
            k -= i;
          }
        }
      }
      for (;;)
      {
        localObject3 = localSavedState.mSpanOffsets;
        localObject3[i1] = k;
        i1 += 1;
        break label244;
        localSavedState.mSpanLookupSize = 0;
        break;
        label332:
        i1 = getFirstChildPosition();
        break label190;
        label341:
        localObject1 = this.mSpans[i1];
        k = ((StaggeredGridLayoutManager.Span)localObject1).getStartLine(m);
        if (k != m)
        {
          localObject3 = this.mPrimaryOrientation;
          i = ((OrientationHelper)localObject3).getStartAfterPadding();
          k -= i;
        }
      }
      label381:
      localSavedState.mAnchorPosition = i;
      localSavedState.mVisibleAnchorPosition = i;
      localSavedState.mSpanOffsetsSize = 0;
      label399:
      localObject2 = localSavedState;
    }
  }
  
  public void onScrollStateChanged(int paramInt)
  {
    if (paramInt == 0) {
      checkForGaps();
    }
  }
  
  void prepareLayoutStateForDelta(int paramInt, RecyclerView.State paramState)
  {
    int i = 1;
    int j;
    int k;
    if (paramInt > 0)
    {
      j = getLastChildPosition();
      k = i;
    }
    for (;;)
    {
      this.mLayoutState.mRecycle = i;
      updateLayoutState(j, paramState);
      setLayoutStateDirection(k);
      LayoutState localLayoutState = this.mLayoutState;
      i = this.mLayoutState.mItemDirection + j;
      localLayoutState.mCurrentPosition = i;
      localLayoutState = this.mLayoutState;
      i = Math.abs(paramInt);
      localLayoutState.mAvailable = i;
      return;
      k = -1;
      j = getFirstChildPosition();
    }
  }
  
  int scrollBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = getChildCount();
    if ((i == 0) || (paramInt == 0))
    {
      paramInt = 0;
      return paramInt;
    }
    prepareLayoutStateForDelta(paramInt, paramState);
    Object localObject = this.mLayoutState;
    i = fill(paramRecycler, (LayoutState)localObject, paramState);
    LayoutState localLayoutState = this.mLayoutState;
    int k = localLayoutState.mAvailable;
    if (k < i) {}
    for (;;)
    {
      localObject = this.mPrimaryOrientation;
      k = -paramInt;
      ((OrientationHelper)localObject).offsetChildren(k);
      int j = this.mShouldReverseLayout;
      this.mLastLayoutFromEnd = j;
      this.mLayoutState.mAvailable = 0;
      localObject = this.mLayoutState;
      recycle(paramRecycler, (LayoutState)localObject);
      break;
      if (paramInt < 0) {
        paramInt = -j;
      } else {
        paramInt = j;
      }
    }
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void scrollToPosition(int paramInt)
  {
    StaggeredGridLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    if (localSavedState != null)
    {
      localSavedState = this.mPendingSavedState;
      int i = localSavedState.mAnchorPosition;
      if (i != paramInt)
      {
        localSavedState = this.mPendingSavedState;
        localSavedState.invalidateAnchorPositionInfo();
      }
    }
    this.mPendingScrollPosition = paramInt;
    this.mPendingScrollPositionOffset = (-1 << -1);
    requestLayout();
  }
  
  public void scrollToPositionWithOffset(int paramInt1, int paramInt2)
  {
    StaggeredGridLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    if (localSavedState != null)
    {
      localSavedState = this.mPendingSavedState;
      localSavedState.invalidateAnchorPositionInfo();
    }
    this.mPendingScrollPosition = paramInt1;
    this.mPendingScrollPositionOffset = paramInt2;
    requestLayout();
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void setGapStrategy(int paramInt)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    assertNotInLayoutOrScroll(null);
    int i = this.mGapStrategy;
    if (paramInt == i) {}
    for (;;)
    {
      return;
      if (paramInt != 0)
      {
        i = 2;
        if (paramInt != i)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localIllegalArgumentException.<init>("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
          throw localIllegalArgumentException;
        }
      }
      this.mGapStrategy = paramInt;
      requestLayout();
    }
  }
  
  public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft();
    int j = getPaddingRight() + i;
    i = getPaddingTop();
    int k = getPaddingBottom();
    i += k;
    k = this.mOrientation;
    int m = 1;
    if (k == m)
    {
      k = paramRect.height();
      i += k;
      k = getMinimumHeight();
      i = chooseSize(paramInt2, i, k);
      k = this.mSizePerSpan;
      m = this.mSpanCount;
      k *= m;
      j += k;
      k = getMinimumWidth();
      j = chooseSize(paramInt1, j, k);
    }
    for (;;)
    {
      setMeasuredDimension(j, i);
      return;
      k = paramRect.width();
      j += k;
      k = getMinimumWidth();
      j = chooseSize(paramInt1, j, k);
      k = this.mSizePerSpan;
      m = this.mSpanCount;
      k *= m;
      i += k;
      k = getMinimumHeight();
      i = chooseSize(paramInt2, i, k);
    }
  }
  
  public void setOrientation(int paramInt)
  {
    if (paramInt != 0)
    {
      i = 1;
      if (paramInt != i)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("invalid orientation.");
        throw ((Throwable)localObject);
      }
    }
    Object localObject = null;
    assertNotInLayoutOrScroll(null);
    int i = this.mOrientation;
    if (paramInt == i) {}
    for (;;)
    {
      return;
      this.mOrientation = paramInt;
      localObject = this.mPrimaryOrientation;
      OrientationHelper localOrientationHelper = this.mSecondaryOrientation;
      this.mPrimaryOrientation = localOrientationHelper;
      this.mSecondaryOrientation = ((OrientationHelper)localObject);
      requestLayout();
    }
  }
  
  public void setReverseLayout(boolean paramBoolean)
  {
    boolean bool = false;
    assertNotInLayoutOrScroll(null);
    StaggeredGridLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    if (localSavedState != null)
    {
      localSavedState = this.mPendingSavedState;
      bool = localSavedState.mReverseLayout;
      if (bool != paramBoolean)
      {
        localSavedState = this.mPendingSavedState;
        localSavedState.mReverseLayout = paramBoolean;
      }
    }
    this.mReverseLayout = paramBoolean;
    requestLayout();
  }
  
  public void setSpanCount(int paramInt)
  {
    Object localObject = null;
    assertNotInLayoutOrScroll(null);
    int i = this.mSpanCount;
    if (paramInt != i)
    {
      invalidateSpanAssignments();
      this.mSpanCount = paramInt;
      localObject = new java/util/BitSet;
      int j = this.mSpanCount;
      ((BitSet)localObject).<init>(j);
      this.mRemainingSpans = ((BitSet)localObject);
      localObject = new StaggeredGridLayoutManager.Span[this.mSpanCount];
      this.mSpans = ((StaggeredGridLayoutManager.Span[])localObject);
      i = 0;
      localObject = null;
      for (;;)
      {
        j = this.mSpanCount;
        if (i >= j) {
          break;
        }
        StaggeredGridLayoutManager.Span[] arrayOfSpan = this.mSpans;
        StaggeredGridLayoutManager.Span localSpan = new android/support/v7/widget/StaggeredGridLayoutManager$Span;
        localSpan.<init>(this, i);
        arrayOfSpan[i] = localSpan;
        i += 1;
      }
      requestLayout();
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
    StaggeredGridLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    boolean bool;
    if (localSavedState == null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSavedState = null;
    }
  }
  
  boolean updateAnchorFromPendingData(RecyclerView.State paramState, StaggeredGridLayoutManager.AnchorInfo paramAnchorInfo)
  {
    boolean bool1 = false;
    OrientationHelper localOrientationHelper1 = null;
    int m = -1;
    int n = -1 << -1;
    int i1 = 1;
    boolean bool4 = paramState.isPreLayout();
    int i2;
    if (!bool4)
    {
      i2 = this.mPendingScrollPosition;
      if (i2 != m) {}
    }
    else
    {
      i1 = 0;
    }
    for (;;)
    {
      return i1;
      i2 = this.mPendingScrollPosition;
      if (i2 >= 0)
      {
        i2 = this.mPendingScrollPosition;
        int i4 = paramState.getItemCount();
        if (i2 < i4) {}
      }
      else
      {
        this.mPendingScrollPosition = m;
        this.mPendingScrollPositionOffset = n;
        i1 = 0;
        continue;
      }
      Object localObject = this.mPendingSavedState;
      if (localObject != null)
      {
        localObject = this.mPendingSavedState;
        i2 = ((StaggeredGridLayoutManager.SavedState)localObject).mAnchorPosition;
        if (i2 != m)
        {
          localObject = this.mPendingSavedState;
          i2 = ((StaggeredGridLayoutManager.SavedState)localObject).mSpanOffsetsSize;
          if (i2 >= i1) {
            break label570;
          }
        }
      }
      int i3 = this.mPendingScrollPosition;
      localObject = findViewByPosition(i3);
      label262:
      label313:
      int k;
      if (localObject != null)
      {
        bool1 = this.mShouldReverseLayout;
        if (bool1) {}
        for (int i = getLastChildPosition();; j = getFirstChildPosition())
        {
          paramAnchorInfo.mPosition = i;
          i = this.mPendingScrollPositionOffset;
          if (i == n) {
            break label313;
          }
          boolean bool2 = paramAnchorInfo.mLayoutFromEnd;
          if (!bool2) {
            break label262;
          }
          localOrientationHelper1 = this.mPrimaryOrientation;
          j = localOrientationHelper1.getEndAfterPadding();
          i5 = this.mPendingScrollPositionOffset;
          j -= i5;
          localOrientationHelper2 = this.mPrimaryOrientation;
          i3 = localOrientationHelper2.getDecoratedEnd((View)localObject);
          j -= i3;
          paramAnchorInfo.mOffset = j;
          break;
        }
        localOrientationHelper1 = this.mPrimaryOrientation;
        int j = localOrientationHelper1.getStartAfterPadding();
        int i5 = this.mPendingScrollPositionOffset;
        j += i5;
        OrientationHelper localOrientationHelper2 = this.mPrimaryOrientation;
        i3 = localOrientationHelper2.getDecoratedStart((View)localObject);
        j -= i3;
        paramAnchorInfo.mOffset = j;
        continue;
        localOrientationHelper1 = this.mPrimaryOrientation;
        j = localOrientationHelper1.getDecoratedMeasurement((View)localObject);
        localOrientationHelper2 = this.mPrimaryOrientation;
        i5 = localOrientationHelper2.getTotalSpace();
        if (j > i5)
        {
          boolean bool3 = paramAnchorInfo.mLayoutFromEnd;
          if (bool3) {
            localOrientationHelper1 = this.mPrimaryOrientation;
          }
          for (k = localOrientationHelper1.getEndAfterPadding();; k = localOrientationHelper1.getStartAfterPadding())
          {
            paramAnchorInfo.mOffset = k;
            break;
            localOrientationHelper1 = this.mPrimaryOrientation;
          }
        }
        localOrientationHelper1 = this.mPrimaryOrientation;
        k = localOrientationHelper1.getDecoratedStart((View)localObject);
        localOrientationHelper2 = this.mPrimaryOrientation;
        i5 = localOrientationHelper2.getStartAfterPadding();
        k -= i5;
        if (k < 0)
        {
          k = -k;
          paramAnchorInfo.mOffset = k;
        }
        else
        {
          localOrientationHelper1 = this.mPrimaryOrientation;
          k = localOrientationHelper1.getEndAfterPadding();
          localOrientationHelper2 = this.mPrimaryOrientation;
          i3 = localOrientationHelper2.getDecoratedEnd((View)localObject);
          k -= i3;
          if (k < 0) {
            paramAnchorInfo.mOffset = k;
          } else {
            paramAnchorInfo.mOffset = n;
          }
        }
      }
      else
      {
        i3 = this.mPendingScrollPosition;
        paramAnchorInfo.mPosition = i3;
        i3 = this.mPendingScrollPositionOffset;
        if (i3 == n)
        {
          i3 = paramAnchorInfo.mPosition;
          i3 = calculateScrollDirectionForPosition(i3);
          if (i3 == i1) {
            k = i1;
          }
          paramAnchorInfo.mLayoutFromEnd = k;
          paramAnchorInfo.assignCoordinateFromPadding();
        }
        for (;;)
        {
          paramAnchorInfo.mInvalidateOffsets = i1;
          break;
          k = this.mPendingScrollPositionOffset;
          paramAnchorInfo.assignCoordinateFromPadding(k);
        }
        label570:
        paramAnchorInfo.mOffset = n;
        k = this.mPendingScrollPosition;
        paramAnchorInfo.mPosition = k;
      }
    }
  }
  
  void updateAnchorInfoForLayout(RecyclerView.State paramState, StaggeredGridLayoutManager.AnchorInfo paramAnchorInfo)
  {
    boolean bool = updateAnchorFromPendingData(paramState, paramAnchorInfo);
    if (bool) {}
    for (;;)
    {
      return;
      bool = updateAnchorFromChildren(paramState, paramAnchorInfo);
      if (!bool)
      {
        paramAnchorInfo.assignCoordinateFromPadding();
        bool = false;
        paramAnchorInfo.mPosition = 0;
      }
    }
  }
  
  void updateMeasureSpecs(int paramInt)
  {
    int i = this.mSpanCount;
    i = paramInt / i;
    this.mSizePerSpan = i;
    i = this.mSecondaryOrientation.getMode();
    i = View.MeasureSpec.makeMeasureSpec(paramInt, i);
    this.mFullSizeSpec = i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\StaggeredGridLayoutManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */