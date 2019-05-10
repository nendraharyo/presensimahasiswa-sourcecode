package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager
  extends LinearLayoutManager
{
  private static final boolean DEBUG = false;
  public static final int DEFAULT_SPAN_COUNT = 255;
  private static final String TAG = "GridLayoutManager";
  int[] mCachedBorders;
  final Rect mDecorInsets;
  boolean mPendingSpanCountChange = false;
  final SparseIntArray mPreLayoutSpanIndexCache;
  final SparseIntArray mPreLayoutSpanSizeCache;
  View[] mSet;
  int mSpanCount = -1;
  GridLayoutManager.SpanSizeLookup mSpanSizeLookup;
  
  public GridLayoutManager(Context paramContext, int paramInt)
  {
    super(paramContext);
    Object localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    this.mPreLayoutSpanSizeCache = ((SparseIntArray)localObject);
    localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    this.mPreLayoutSpanIndexCache = ((SparseIntArray)localObject);
    localObject = new android/support/v7/widget/GridLayoutManager$DefaultSpanSizeLookup;
    ((GridLayoutManager.DefaultSpanSizeLookup)localObject).<init>();
    this.mSpanSizeLookup = ((GridLayoutManager.SpanSizeLookup)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mDecorInsets = ((Rect)localObject);
    setSpanCount(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramInt2, paramBoolean);
    Object localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    this.mPreLayoutSpanSizeCache = ((SparseIntArray)localObject);
    localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    this.mPreLayoutSpanIndexCache = ((SparseIntArray)localObject);
    localObject = new android/support/v7/widget/GridLayoutManager$DefaultSpanSizeLookup;
    ((GridLayoutManager.DefaultSpanSizeLookup)localObject).<init>();
    this.mSpanSizeLookup = ((GridLayoutManager.SpanSizeLookup)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mDecorInsets = ((Rect)localObject);
    setSpanCount(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    Object localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    this.mPreLayoutSpanSizeCache = ((SparseIntArray)localObject);
    localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    this.mPreLayoutSpanIndexCache = ((SparseIntArray)localObject);
    localObject = new android/support/v7/widget/GridLayoutManager$DefaultSpanSizeLookup;
    ((GridLayoutManager.DefaultSpanSizeLookup)localObject).<init>();
    this.mSpanSizeLookup = ((GridLayoutManager.SpanSizeLookup)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mDecorInsets = ((Rect)localObject);
    int i = getProperties(paramContext, paramAttributeSet, paramInt1, paramInt2).spanCount;
    setSpanCount(i);
  }
  
  private void assignSpans(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    int j = -1;
    int k;
    GridLayoutManager.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      k = 1;
      j = 0;
      localLayoutParams = null;
    }
    for (;;)
    {
      int m = 0;
      for (i = j; i != paramInt1; i = j)
      {
        View localView = this.mSet[i];
        localLayoutParams = (GridLayoutManager.LayoutParams)localView.getLayoutParams();
        int n = getPosition(localView);
        n = getSpanSize(paramRecycler, paramState, n);
        localLayoutParams.mSpanSize = n;
        localLayoutParams.mSpanIndex = m;
        j = localLayoutParams.mSpanSize;
        m += j;
        j = i + k;
      }
      k = paramInt1 + -1;
      paramInt1 = j;
      j = k;
      k = paramInt1;
    }
  }
  
  private void cachePreLayoutSpanMapping()
  {
    int i = getChildCount();
    int j = 0;
    GridLayoutManager.LayoutParams localLayoutParams = null;
    for (int k = 0; k < i; k = j)
    {
      localLayoutParams = (GridLayoutManager.LayoutParams)getChildAt(k).getLayoutParams();
      int m = localLayoutParams.getViewLayoutPosition();
      SparseIntArray localSparseIntArray = this.mPreLayoutSpanSizeCache;
      int n = localLayoutParams.getSpanSize();
      localSparseIntArray.put(m, n);
      localSparseIntArray = this.mPreLayoutSpanIndexCache;
      j = localLayoutParams.getSpanIndex();
      localSparseIntArray.put(m, j);
      j = k + 1;
    }
  }
  
  private void calculateItemBorders(int paramInt)
  {
    int[] arrayOfInt = this.mCachedBorders;
    int i = this.mSpanCount;
    arrayOfInt = calculateItemBorders(arrayOfInt, i, paramInt);
    this.mCachedBorders = arrayOfInt;
  }
  
  static int[] calculateItemBorders(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (paramArrayOfInt != null)
    {
      j = paramArrayOfInt.length;
      k = paramInt1 + 1;
      if (j == k)
      {
        j = paramArrayOfInt.length + -1;
        j = paramArrayOfInt[j];
        if (j == paramInt2) {
          break label50;
        }
      }
    }
    int j = paramInt1 + 1;
    paramArrayOfInt = new int[j];
    label50:
    paramArrayOfInt[0] = 0;
    int k = paramInt2 / paramInt1;
    int m = paramInt2 % paramInt1;
    j = 1;
    int n = j;
    int i1 = 0;
    if (n <= paramInt1)
    {
      i += m;
      if (i <= 0) {
        break label139;
      }
      j = paramInt1 - i;
      if (j >= m) {
        break label139;
      }
      j = k + 1;
      i -= paramInt1;
    }
    for (;;)
    {
      i1 += j;
      paramArrayOfInt[n] = i1;
      j = n + 1;
      n = j;
      break;
      return paramArrayOfInt;
      label139:
      j = k;
    }
  }
  
  private void clearPreLayoutSpanMappingCache()
  {
    this.mPreLayoutSpanSizeCache.clear();
    this.mPreLayoutSpanIndexCache.clear();
  }
  
  private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.AnchorInfo paramAnchorInfo, int paramInt)
  {
    int i = 1;
    if (paramInt == i) {}
    int j;
    for (;;)
    {
      j = paramAnchorInfo.mPosition;
      j = getSpanIndex(paramRecycler, paramState, j);
      if (i == 0) {
        break;
      }
      while (j > 0)
      {
        i = paramAnchorInfo.mPosition;
        if (i <= 0) {
          break;
        }
        i = paramAnchorInfo.mPosition + -1;
        paramAnchorInfo.mPosition = i;
        i = paramAnchorInfo.mPosition;
        j = getSpanIndex(paramRecycler, paramState, i);
      }
      i = 0;
    }
    int k = paramState.getItemCount() + -1;
    int m = paramAnchorInfo.mPosition;
    for (i = j; m < k; i = j)
    {
      j = m + 1;
      j = getSpanIndex(paramRecycler, paramState, j);
      if (j <= i) {
        break;
      }
      m += 1;
    }
    paramAnchorInfo.mPosition = m;
  }
  
  private void ensureViewSet()
  {
    View[] arrayOfView = this.mSet;
    int i;
    if (arrayOfView != null)
    {
      arrayOfView = this.mSet;
      i = arrayOfView.length;
      int j = this.mSpanCount;
      if (i == j) {}
    }
    else
    {
      i = this.mSpanCount;
      arrayOfView = new View[i];
      this.mSet = arrayOfView;
    }
  }
  
  private int getSpanGroupIndex(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt)
  {
    boolean bool = paramState.isPreLayout();
    GridLayoutManager.SpanSizeLookup localSpanSizeLookup;
    int j;
    int i;
    if (!bool)
    {
      localSpanSizeLookup = this.mSpanSizeLookup;
      j = this.mSpanCount;
      i = localSpanSizeLookup.getSpanGroupIndex(paramInt, j);
    }
    for (;;)
    {
      return i;
      i = paramRecycler.convertPreLayoutPositionToPostLayout(paramInt);
      j = -1;
      Object localObject;
      if (i == j)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "Cannot find span size for pre layout position. ";
        localObject = str + paramInt;
        Log.w("GridLayoutManager", (String)localObject);
        i = 0;
        localSpanSizeLookup = null;
      }
      else
      {
        localObject = this.mSpanSizeLookup;
        int k = this.mSpanCount;
        i = ((GridLayoutManager.SpanSizeLookup)localObject).getSpanGroupIndex(i, k);
      }
    }
  }
  
  private int getSpanIndex(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt)
  {
    int i = -1;
    boolean bool = paramState.isPreLayout();
    Object localObject1;
    int j;
    if (!bool)
    {
      localObject1 = this.mSpanSizeLookup;
      i = this.mSpanCount;
      j = ((GridLayoutManager.SpanSizeLookup)localObject1).getCachedSpanIndex(paramInt, i);
    }
    for (;;)
    {
      return j;
      localObject1 = this.mPreLayoutSpanIndexCache;
      j = ((SparseIntArray)localObject1).get(paramInt, i);
      if (j == i)
      {
        j = paramRecycler.convertPreLayoutPositionToPostLayout(paramInt);
        Object localObject2;
        if (j == i)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:";
          localObject2 = str + paramInt;
          Log.w("GridLayoutManager", (String)localObject2);
          j = 0;
          localObject1 = null;
        }
        else
        {
          localObject2 = this.mSpanSizeLookup;
          int k = this.mSpanCount;
          j = ((GridLayoutManager.SpanSizeLookup)localObject2).getCachedSpanIndex(j, k);
        }
      }
    }
  }
  
  private int getSpanSize(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt)
  {
    int i = -1;
    boolean bool = paramState.isPreLayout();
    Object localObject1;
    int j;
    if (!bool)
    {
      localObject1 = this.mSpanSizeLookup;
      j = ((GridLayoutManager.SpanSizeLookup)localObject1).getSpanSize(paramInt);
    }
    for (;;)
    {
      return j;
      localObject1 = this.mPreLayoutSpanSizeCache;
      j = ((SparseIntArray)localObject1).get(paramInt, i);
      if (j == i)
      {
        j = paramRecycler.convertPreLayoutPositionToPostLayout(paramInt);
        Object localObject2;
        if (j == i)
        {
          localObject1 = "GridLayoutManager";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:";
          localObject2 = str + paramInt;
          Log.w((String)localObject1, (String)localObject2);
          j = 1;
        }
        else
        {
          localObject2 = this.mSpanSizeLookup;
          j = ((GridLayoutManager.SpanSizeLookup)localObject2).getSpanSize(j);
        }
      }
    }
  }
  
  private void guessMeasurement(float paramFloat, int paramInt)
  {
    int i = Math.max(Math.round(this.mSpanCount * paramFloat), paramInt);
    calculateItemBorders(i);
  }
  
  private void measureChild(View paramView, int paramInt, boolean paramBoolean)
  {
    int i = 1;
    GridLayoutManager.LayoutParams localLayoutParams = (GridLayoutManager.LayoutParams)paramView.getLayoutParams();
    Rect localRect = localLayoutParams.mDecorInsets;
    int j = localRect.top;
    int k = localRect.bottom;
    j += k;
    k = localLayoutParams.topMargin;
    j += k;
    k = localLayoutParams.bottomMargin;
    j += k;
    k = localRect.left;
    int m = localRect.right + k;
    k = localLayoutParams.leftMargin;
    m += k;
    k = localLayoutParams.rightMargin + m;
    m = localLayoutParams.mSpanIndex;
    int n = localLayoutParams.mSpanSize;
    m = getSpaceForSpanRange(m, n);
    n = this.mOrientation;
    int i1;
    if (n == i)
    {
      i1 = localLayoutParams.width;
      m = getChildMeasureSpec(m, paramInt, k, i1, false);
      OrientationHelper localOrientationHelper1 = this.mOrientationHelper;
      k = localOrientationHelper1.getTotalSpace();
      i1 = getHeightMode();
      i2 = localLayoutParams.height;
    }
    int i3;
    for (int i2 = getChildMeasureSpec(k, i1, j, i2, i);; i2 = i3)
    {
      measureChildWithDecorationsAndMargin(paramView, m, i2, paramBoolean);
      return;
      i1 = localLayoutParams.height;
      m = getChildMeasureSpec(m, paramInt, j, i1, false);
      OrientationHelper localOrientationHelper2 = this.mOrientationHelper;
      j = localOrientationHelper2.getTotalSpace();
      i1 = getWidthMode();
      i2 = localLayoutParams.width;
      i2 = getChildMeasureSpec(j, i1, k, i2, i);
      i3 = m;
      m = i2;
    }
  }
  
  private void measureChildWithDecorationsAndMargin(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if (paramBoolean) {}
    for (boolean bool = shouldReMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams);; bool = shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams))
    {
      if (bool) {
        paramView.measure(paramInt1, paramInt2);
      }
      return;
    }
  }
  
  private void updateMeasurements()
  {
    int i = getOrientation();
    int j = 1;
    if (i == j)
    {
      i = getWidth();
      j = getPaddingRight();
      i -= j;
      j = getPaddingLeft();
      i -= j;
    }
    for (;;)
    {
      calculateItemBorders(i);
      return;
      i = getHeight();
      j = getPaddingBottom();
      i -= j;
      j = getPaddingTop();
      i -= j;
    }
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof GridLayoutManager.LayoutParams;
  }
  
  void collectPrefetchPositionsForLayoutState(RecyclerView.State paramState, LinearLayoutManager.LayoutState paramLayoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = this.mSpanCount;
    int j = 0;
    for (;;)
    {
      int k = this.mSpanCount;
      if (j >= k) {
        break;
      }
      boolean bool = paramLayoutState.hasMore(paramState);
      if ((!bool) || (i <= 0)) {
        break;
      }
      int m = paramLayoutState.mCurrentPosition;
      int n = paramLayoutState.mScrollingOffset;
      n = Math.max(0, n);
      paramLayoutPrefetchRegistry.addPosition(m, n);
      GridLayoutManager.SpanSizeLookup localSpanSizeLookup = this.mSpanSizeLookup;
      m = localSpanSizeLookup.getSpanSize(m);
      i -= m;
      m = paramLayoutState.mCurrentPosition;
      n = paramLayoutState.mItemDirection;
      m += n;
      paramLayoutState.mCurrentPosition = m;
      j += 1;
    }
  }
  
  View findReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    ensureLayoutState();
    int i = this.mOrientationHelper.getStartAfterPadding();
    Object localObject2 = this.mOrientationHelper;
    int j = ((OrientationHelper)localObject2).getEndAfterPadding();
    int k;
    int n;
    Object localObject3;
    label45:
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      k = 1;
      n = k;
      localObject3 = null;
      if (paramInt1 == paramInt2) {
        break label221;
      }
      localObject4 = getChildAt(paramInt1);
      k = getPosition((View)localObject4);
      if ((k < 0) || (k >= paramInt3)) {
        break label240;
      }
      k = getSpanIndex(paramRecycler, paramState, k);
      if (k == 0) {
        break label127;
      }
      localObject2 = localObject1;
      localObject4 = localObject3;
    }
    for (;;)
    {
      paramInt1 += n;
      localObject1 = localObject2;
      localObject3 = localObject4;
      break label45;
      k = -1;
      n = k;
      break;
      label127:
      localObject2 = (RecyclerView.LayoutParams)((View)localObject4).getLayoutParams();
      boolean bool = ((RecyclerView.LayoutParams)localObject2).isItemRemoved();
      if (bool)
      {
        if (localObject3 == null) {
          localObject2 = localObject1;
        }
      }
      else
      {
        localObject2 = this.mOrientationHelper;
        int m = ((OrientationHelper)localObject2).getDecoratedStart((View)localObject4);
        if (m < j)
        {
          localObject2 = this.mOrientationHelper;
          m = ((OrientationHelper)localObject2).getDecoratedEnd((View)localObject4);
          if (m >= i) {}
        }
        else
        {
          if (localObject1 != null) {
            break label240;
          }
          localObject2 = localObject4;
          localObject4 = localObject3;
          continue;
          label221:
          if (localObject1 == null) {
            break label233;
          }
        }
        for (;;)
        {
          localObject4 = localObject1;
          return (View)localObject4;
          label233:
          localObject1 = localObject3;
        }
      }
      label240:
      localObject2 = localObject1;
      localObject4 = localObject3;
    }
  }
  
  public RecyclerView.LayoutParams generateDefaultLayoutParams()
  {
    int i = -1;
    int j = -2;
    int k = this.mOrientation;
    GridLayoutManager.LayoutParams localLayoutParams;
    if (k == 0)
    {
      localLayoutParams = new android/support/v7/widget/GridLayoutManager$LayoutParams;
      localLayoutParams.<init>(j, i);
    }
    for (;;)
    {
      return localLayoutParams;
      localLayoutParams = new android/support/v7/widget/GridLayoutManager$LayoutParams;
      localLayoutParams.<init>(i, j);
    }
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    GridLayoutManager.LayoutParams localLayoutParams = new android/support/v7/widget/GridLayoutManager$LayoutParams;
    localLayoutParams.<init>(paramContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
    GridLayoutManager.LayoutParams localLayoutParams;
    if (bool)
    {
      localLayoutParams = new android/support/v7/widget/GridLayoutManager$LayoutParams;
      paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localLayoutParams;
      localLayoutParams = new android/support/v7/widget/GridLayoutManager$LayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
    }
  }
  
  public int getColumnCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = 1;
    int j = this.mOrientation;
    if (j == i) {
      j = this.mSpanCount;
    }
    for (;;)
    {
      return j;
      j = paramState.getItemCount();
      if (j < i)
      {
        j = 0;
      }
      else
      {
        j = paramState.getItemCount() + -1;
        j = getSpanGroupIndex(paramRecycler, paramState, j) + 1;
      }
    }
  }
  
  public int getRowCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = this.mOrientation;
    if (i == 0) {
      i = this.mSpanCount;
    }
    for (;;)
    {
      return i;
      i = paramState.getItemCount();
      int j = 1;
      if (i < j)
      {
        i = 0;
      }
      else
      {
        i = paramState.getItemCount() + -1;
        i = getSpanGroupIndex(paramRecycler, paramState, i) + 1;
      }
    }
  }
  
  int getSpaceForSpanRange(int paramInt1, int paramInt2)
  {
    int i = this.mOrientation;
    int k = 1;
    int[] arrayOfInt1;
    int j;
    int[] arrayOfInt2;
    if (i == k)
    {
      boolean bool = isLayoutRTL();
      if (bool)
      {
        arrayOfInt1 = this.mCachedBorders;
        k = this.mSpanCount - paramInt1;
        j = arrayOfInt1[k];
        arrayOfInt2 = this.mCachedBorders;
        int m = this.mSpanCount - paramInt1 - paramInt2;
        k = arrayOfInt2[m];
        j -= k;
      }
    }
    for (;;)
    {
      return j;
      arrayOfInt1 = this.mCachedBorders;
      k = paramInt1 + paramInt2;
      j = arrayOfInt1[k];
      arrayOfInt2 = this.mCachedBorders;
      k = arrayOfInt2[paramInt1];
      j -= k;
    }
  }
  
  public int getSpanCount()
  {
    return this.mSpanCount;
  }
  
  public GridLayoutManager.SpanSizeLookup getSpanSizeLookup()
  {
    return this.mSpanSizeLookup;
  }
  
  void layoutChunk(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.LayoutState paramLayoutState, LinearLayoutManager.LayoutChunkResult paramLayoutChunkResult)
  {
    Object localObject1 = this.mOrientationHelper;
    int i = ((OrientationHelper)localObject1).getModeInOther();
    int j = 1073741824;
    float f1 = 2.0F;
    int m;
    int i1;
    label75:
    boolean bool3;
    label103:
    int i7;
    StringBuilder localStringBuilder;
    if (i != j)
    {
      j = 1;
      f1 = Float.MIN_VALUE;
      m = j;
      j = getChildCount();
      if (j <= 0) {
        break label320;
      }
      localObject1 = this.mCachedBorders;
      i1 = this.mSpanCount;
      j = localObject1[i1];
      int i4 = j;
      if (m != 0) {
        updateMeasurements();
      }
      j = paramLayoutState.mItemDirection;
      i1 = 1;
      if (j != i1) {
        break label335;
      }
      bool3 = true;
      i7 = 0;
      localStringBuilder = null;
      i8 = 0;
      localObject2 = null;
      j = this.mSpanCount;
      if (!bool3)
      {
        j = paramLayoutState.mCurrentPosition;
        j = getSpanIndex(paramRecycler, paramState, j);
        i1 = paramLayoutState.mCurrentPosition;
        i1 = getSpanSize(paramRecycler, paramState, i1);
        j += i1;
      }
    }
    label320:
    int i5;
    label335:
    View localView1;
    for (;;)
    {
      i1 = this.mSpanCount;
      int i9;
      if (i7 < i1)
      {
        boolean bool2 = paramLayoutState.hasMore(paramState);
        if ((bool2) && (j > 0))
        {
          i2 = paramLayoutState.mCurrentPosition;
          i9 = getSpanSize(paramRecycler, paramState, i2);
          int i18 = this.mSpanCount;
          if (i9 > i18)
          {
            localObject1 = new java/lang/IllegalArgumentException;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject3 = localStringBuilder.append("Item at position ").append(i2).append(" requires ").append(i9).append(" spans but GridLayoutManager has only ");
            i9 = this.mSpanCount;
            localObject3 = i9 + " spans.";
            ((IllegalArgumentException)localObject1).<init>((String)localObject3);
            throw ((Throwable)localObject1);
            j = 0;
            f1 = 0.0F;
            localObject1 = null;
            m = 0;
            break;
            j = 0;
            f1 = 0.0F;
            localObject1 = null;
            i5 = 0;
            break label75;
            bool3 = false;
            localView1 = null;
            break label103;
          }
          j -= i9;
          if (j >= 0) {
            break label376;
          }
        }
      }
      label376:
      do
      {
        if (i7 != 0) {
          break;
        }
        j = 1;
        f1 = Float.MIN_VALUE;
        paramLayoutChunkResult.mFinished = j;
        return;
        localObject3 = paramLayoutState.next(paramRecycler);
      } while (localObject3 == null);
      i8 += i9;
      localObject4 = this.mSet;
      localObject4[i7] = localObject3;
      i7 += 1;
    }
    int i25 = 0;
    float f2 = 0.0F;
    boolean bool6 = false;
    float f3 = 0.0F;
    View localView2 = null;
    localObject1 = this;
    Object localObject3 = paramRecycler;
    Object localObject4 = paramState;
    assignSpans(paramRecycler, paramState, i7, i8, bool3);
    j = 0;
    f1 = 0.0F;
    localObject1 = null;
    int i8 = 0;
    Object localObject2 = null;
    int i10 = 0;
    localObject4 = null;
    float f4 = 0.0F;
    int i2 = 0;
    localObject3 = null;
    label483:
    if (i8 < i7)
    {
      localView2 = this.mSet[i8];
      localObject1 = paramLayoutState.mScrapList;
      if (localObject1 == null) {
        if (bool3)
        {
          addView(localView2);
          label521:
          localObject1 = this.mDecorInsets;
          calculateItemDecorationsForChild(localView2, (Rect)localObject1);
          f1 = 0.0F;
          measureChild(localView2, i, false);
          localObject1 = this.mOrientationHelper;
          j = ((OrientationHelper)localObject1).getDecoratedMeasurement(localView2);
          if (j > i2) {
            i2 = j;
          }
          localObject1 = (GridLayoutManager.LayoutParams)localView2.getLayoutParams();
          i25 = 1065353216;
          f2 = 1.0F;
          OrientationHelper localOrientationHelper = this.mOrientationHelper;
          f3 = localOrientationHelper.getDecoratedMeasurementInOther(localView2) * f2;
          j = ((GridLayoutManager.LayoutParams)localObject1).mSpanSize;
          f1 = j;
          f1 = f3 / f1;
          bool6 = f1 < f4;
          if (!bool6) {
            break label1753;
          }
        }
      }
    }
    for (;;)
    {
      i10 = i8 + 1;
      i8 = i10;
      f4 = f1;
      break label483;
      j = 0;
      f1 = 0.0F;
      localObject1 = null;
      addView(localView2, 0);
      break label521;
      if (bool3)
      {
        addDisappearingView(localView2);
        break label521;
      }
      j = 0;
      f1 = 0.0F;
      localObject1 = null;
      addDisappearingView(localView2, 0);
      break label521;
      if (m != 0)
      {
        guessMeasurement(f4, i5);
        i2 = 0;
        localObject3 = null;
        j = 0;
        f1 = 0.0F;
        localObject1 = null;
        i10 = 0;
        localObject4 = null;
        f4 = 0.0F;
        label749:
        if (i10 < i7)
        {
          localObject1 = this.mSet[i10];
          i8 = 1073741824;
          bool3 = true;
          measureChild((View)localObject1, i8, bool3);
          localObject2 = this.mOrientationHelper;
          j = ((OrientationHelper)localObject2).getDecoratedMeasurement((View)localObject1);
          if (j <= i2) {
            break label1746;
          }
        }
      }
      for (;;)
      {
        i10 += 1;
        i2 = j;
        break label749;
        j = 0;
        f1 = 0.0F;
        localObject1 = null;
        i8 = 0;
        localObject2 = null;
        if (i8 < i7)
        {
          localView1 = this.mSet[i8];
          localObject1 = this.mOrientationHelper;
          j = ((OrientationHelper)localObject1).getDecoratedMeasurement(localView1);
          if (j != i2)
          {
            localObject1 = (GridLayoutManager.LayoutParams)localView1.getLayoutParams();
            localObject4 = ((GridLayoutManager.LayoutParams)localObject1).mDecorInsets;
            m = ((Rect)localObject4).top;
            int i19 = ((Rect)localObject4).bottom;
            m += i19;
            int i20 = ((GridLayoutManager.LayoutParams)localObject1).topMargin;
            m += i20;
            int i21 = ((GridLayoutManager.LayoutParams)localObject1).bottomMargin;
            m += i21;
            int i22 = ((Rect)localObject4).left;
            i10 = ((Rect)localObject4).right + i22;
            i22 = ((GridLayoutManager.LayoutParams)localObject1).leftMargin;
            i10 += i22;
            int i23 = ((GridLayoutManager.LayoutParams)localObject1).rightMargin;
            i10 += i23;
            i24 = ((GridLayoutManager.LayoutParams)localObject1).mSpanIndex;
            i25 = ((GridLayoutManager.LayoutParams)localObject1).mSpanSize;
            i24 = getSpaceForSpanRange(i24, i25);
            i25 = this.mOrientation;
            i5 = 1;
            if (i25 != i5) {
              break label1105;
            }
            i25 = 1073741824;
            f2 = 2.0F;
            j = ((GridLayoutManager.LayoutParams)localObject1).width;
            i5 = 0;
            i10 = getChildMeasureSpec(i24, i25, i10, j, false);
            j = i2 - m;
            m = 1073741824;
          }
          for (j = View.MeasureSpec.makeMeasureSpec(j, m);; j = getChildMeasureSpec(i24, i25, m, j, false))
          {
            m = 1;
            measureChildWithDecorationsAndMargin(localView1, i10, j, m);
            j = i8 + 1;
            i8 = j;
            break;
            label1105:
            i11 = View.MeasureSpec.makeMeasureSpec(i2 - i10, 1073741824);
            i25 = 1073741824;
            f2 = 2.0F;
            j = ((GridLayoutManager.LayoutParams)localObject1).height;
            i5 = 0;
          }
        }
        paramLayoutChunkResult.mConsumed = i2;
        bool3 = false;
        localView1 = null;
        i8 = 0;
        localObject2 = null;
        int i11 = 0;
        f4 = 0.0F;
        localObject4 = null;
        j = 0;
        f1 = 0.0F;
        localObject1 = null;
        int n = this.mOrientation;
        int i24 = 1;
        f3 = Float.MIN_VALUE;
        if (n == i24)
        {
          j = paramLayoutState.mLayoutDirection;
          i11 = -1;
          f4 = 0.0F / 0.0F;
          if (j == i11)
          {
            j = paramLayoutState.mOffset;
            i3 = j - i2;
            int i12 = 0;
            localObject4 = null;
            f4 = 0.0F;
            i8 = 0;
            localObject2 = null;
            bool3 = false;
            localView1 = null;
            i5 = j;
            i24 = i3;
            i25 = i12;
            n = i8;
            i3 = 0;
            localObject3 = null;
            label1289:
            if (i3 >= i7) {
              break label1725;
            }
            localView1 = this.mSet[i3];
            localObject1 = (GridLayoutManager.LayoutParams)localView1.getLayoutParams();
            i12 = this.mOrientation;
            i8 = 1;
            if (i12 != i8) {
              break label1667;
            }
            boolean bool4 = isLayoutRTL();
            if (!bool4) {
              break label1609;
            }
            int i13 = getPaddingLeft();
            localObject2 = this.mCachedBorders;
            n = this.mSpanCount;
            i25 = ((GridLayoutManager.LayoutParams)localObject1).mSpanIndex;
            n -= i25;
            i8 = localObject2[n];
            i25 = i13 + i8;
            localObject4 = this.mOrientationHelper;
            int i14 = ((OrientationHelper)localObject4).getDecoratedMeasurementInOther(localView1);
            n = i25 - i14;
          }
        }
        for (;;)
        {
          localObject2 = this;
          layoutDecoratedWithMargins(localView1, n, i24, i25, i5);
          boolean bool5 = ((GridLayoutManager.LayoutParams)localObject1).isItemRemoved();
          if (!bool5)
          {
            bool1 = ((GridLayoutManager.LayoutParams)localObject1).isItemChanged();
            if (!bool1) {}
          }
          else
          {
            bool1 = true;
            f1 = Float.MIN_VALUE;
            paramLayoutChunkResult.mIgnoreConsumed = bool1;
          }
          boolean bool1 = paramLayoutChunkResult.mFocusable;
          bool5 = localView1.hasFocusable();
          bool1 |= bool5;
          paramLayoutChunkResult.mFocusable = bool1;
          k = i3 + 1;
          i3 = k;
          break label1289;
          int i15 = paramLayoutState.mOffset;
          k = i15 + i3;
          i3 = i15;
          i15 = 0;
          localObject4 = null;
          f4 = 0.0F;
          i8 = 0;
          localObject2 = null;
          break;
          i8 = paramLayoutState.mLayoutDirection;
          int i6 = -1;
          if (i8 == i6)
          {
            i8 = paramLayoutState.mOffset;
            i3 = i8 - i3;
            i15 = i8;
            i8 = i3;
            i3 = 0;
            localObject3 = null;
            break;
          }
          i8 = paramLayoutState.mOffset;
          i15 = i3 + i8;
          i3 = 0;
          localObject3 = null;
          break;
          label1609:
          i15 = getPaddingLeft();
          localObject2 = this.mCachedBorders;
          n = ((GridLayoutManager.LayoutParams)localObject1).mSpanIndex;
          i8 = localObject2[n];
          n = i15 + i8;
          localObject4 = this.mOrientationHelper;
          int i16 = ((OrientationHelper)localObject4).getDecoratedMeasurementInOther(localView1);
          i25 = n + i16;
          continue;
          label1667:
          i16 = getPaddingTop();
          localObject2 = this.mCachedBorders;
          i24 = ((GridLayoutManager.LayoutParams)localObject1).mSpanIndex;
          i8 = localObject2[i24];
          i24 = i16 + i8;
          localObject4 = this.mOrientationHelper;
          int i17 = ((OrientationHelper)localObject4).getDecoratedMeasurementInOther(localView1);
          i5 = i24 + i17;
        }
        label1725:
        localObject1 = this.mSet;
        int i3 = 0;
        localObject3 = null;
        Arrays.fill((Object[])localObject1, null);
        break;
        label1746:
        int k = i3;
      }
      label1753:
      f1 = f4;
    }
  }
  
  void onAnchorReady(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.AnchorInfo paramAnchorInfo, int paramInt)
  {
    super.onAnchorReady(paramRecycler, paramState, paramAnchorInfo, paramInt);
    updateMeasurements();
    int i = paramState.getItemCount();
    if (i > 0)
    {
      boolean bool = paramState.isPreLayout();
      if (!bool) {
        ensureAnchorIsInCorrectSpan(paramRecycler, paramState, paramAnchorInfo, paramInt);
      }
    }
    ensureViewSet();
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    View localView = findContainingItemView(paramView);
    int i;
    if (localView == null) {
      i = 0;
    }
    Object localObject2;
    int j;
    int k;
    int i3;
    for (Object localObject1 = null;; localObject1 = null)
    {
      return (View)localObject1;
      localObject2 = (GridLayoutManager.LayoutParams)localView.getLayoutParams();
      j = ((GridLayoutManager.LayoutParams)localObject2).mSpanIndex;
      k = j;
      m = ((GridLayoutManager.LayoutParams)localObject2).mSpanIndex;
      i1 = ((GridLayoutManager.LayoutParams)localObject2).mSpanSize;
      i3 = m + i1;
      localObject2 = super.onFocusSearchFailed(paramView, paramInt, paramRecycler, paramState);
      if (localObject2 != null) {
        break;
      }
      i = 0;
    }
    int i1 = convertFocusDirectionToLayoutDirection(paramInt);
    int m = 1;
    float f;
    label112:
    int n;
    int i2;
    label132:
    int i4;
    int i5;
    label164:
    int i8;
    int i7;
    label194:
    Object localObject3;
    int i9;
    int i10;
    Object localObject4;
    int i11;
    Object localObject5;
    int i12;
    int i13;
    int i14;
    if (i1 == m)
    {
      i1 = 1;
      f = Float.MIN_VALUE;
      n = this.mShouldReverseLayout;
      if (i1 == n) {
        break label294;
      }
      i2 = 1;
      f = Float.MIN_VALUE;
      if (i2 == 0) {
        break label306;
      }
      i4 = getChildCount() + -1;
      f = 0.0F / 0.0F;
      i5 = -1;
      i2 = i4;
      i4 = -1;
      n = i5;
      int i6 = this.mOrientation;
      i8 = 1;
      if (i6 != i8) {
        break label331;
      }
      i7 = isLayoutRTL();
      if (i7 == 0) {
        break label331;
      }
      i7 = 1;
      localObject3 = null;
      i9 = -1;
      i10 = 0;
      localObject4 = null;
      i11 = 0;
      localObject5 = null;
      i12 = -1;
      i8 = 0;
      i13 = getSpanGroupIndex(paramRecycler, paramState, i2);
      i14 = i2;
      label233:
      j = i14;
      if (i14 != n)
      {
        i2 = getSpanGroupIndex(paramRecycler, paramState, i14);
        localObject1 = getChildAt(i14);
        if (localObject1 != localView) {
          break label337;
        }
      }
      label270:
      if (localObject3 == null) {
        break label873;
      }
    }
    for (;;)
    {
      localObject1 = localObject3;
      break;
      i2 = 0;
      f = 0.0F;
      localObject2 = null;
      break label112;
      label294:
      i2 = 0;
      f = 0.0F;
      localObject2 = null;
      break label132;
      label306:
      i5 = getChildCount();
      i2 = 0;
      localObject2 = null;
      f = 0.0F;
      i4 = 1;
      n = i5;
      break label164;
      label331:
      i7 = 0;
      break label194;
      label337:
      boolean bool1 = ((View)localObject1).hasFocusable();
      Object localObject6;
      if (bool1)
      {
        j = i13;
        if (i2 != i13)
        {
          if (localObject3 != null) {
            break label270;
          }
          i2 = i8;
          i = i9;
          i8 = i12;
          localObject6 = localObject5;
          i11 = i10;
          localObject4 = localObject3;
        }
      }
      for (;;)
      {
        int i15;
        i14 += i4;
        localObject3 = localObject4;
        i10 = i11;
        i9 = i;
        localObject5 = localObject6;
        i12 = i8;
        i8 = i2;
        break label233;
        localObject2 = (GridLayoutManager.LayoutParams)((View)localObject1).getLayoutParams();
        int i17 = ((GridLayoutManager.LayoutParams)localObject2).mSpanIndex;
        int i16 = ((GridLayoutManager.LayoutParams)localObject2).mSpanIndex;
        j = ((GridLayoutManager.LayoutParams)localObject2).mSpanSize;
        int i18 = j;
        int i22 = i16 + j;
        boolean bool2 = ((View)localObject1).hasFocusable();
        if (bool2)
        {
          j = i17;
          if (i17 == k)
          {
            j = i22;
            if (i22 == i3) {
              break;
            }
          }
        }
        bool2 = false;
        boolean bool3 = ((View)localObject1).hasFocusable();
        if ((!bool3) || (localObject3 != null))
        {
          bool3 = ((View)localObject1).hasFocusable();
          if ((bool3) || (localObject5 != null)) {}
        }
        else
        {
          bool2 = true;
        }
        for (;;)
        {
          label539:
          if (bool2)
          {
            bool2 = ((View)localObject1).hasFocusable();
            if (!bool2) {
              break label814;
            }
            i10 = ((GridLayoutManager.LayoutParams)localObject2).mSpanIndex;
            j = i22;
            i2 = Math.min(i22, i3);
            j = i17;
            i9 = Math.max(i17, k);
            i2 -= i9;
            i5 = i8;
            i8 = i12;
            localObject6 = localObject5;
            i11 = i2;
            i2 = i5;
            localObject4 = localObject1;
            i = i10;
            break;
            j = i17;
            int i19 = Math.max(i17, k);
            j = i22;
            i19 = Math.min(i22, i3) - i19;
            boolean bool4 = ((View)localObject1).hasFocusable();
            if (bool4)
            {
              j = i19;
              if (i19 > i10)
              {
                bool2 = true;
              }
              else if (i19 == i10)
              {
                j = i17;
                if (i17 > i9) {}
                for (i19 = 1;; i20 = 0)
                {
                  j = i19;
                  if (i7 != i19) {
                    break;
                  }
                  bool2 = true;
                  break;
                }
              }
            }
            else if (localObject3 == null)
            {
              boolean bool5 = true;
              bool4 = isViewPartiallyVisible((View)localObject1, false, bool5);
              if (bool4)
              {
                j = i20;
                if (i20 > i8)
                {
                  bool2 = true;
                }
                else if (i20 == i8)
                {
                  j = i17;
                  if (i17 <= i12) {
                    break label808;
                  }
                }
              }
            }
          }
        }
        label808:
        int i21;
        for (int i20 = 1;; i21 = 0)
        {
          j = i20;
          if (i7 != i20) {
            break label539;
          }
          bool2 = true;
          break label539;
          break;
        }
        label814:
        i8 = ((GridLayoutManager.LayoutParams)localObject2).mSpanIndex;
        j = i22;
        i2 = Math.min(i22, i3);
        j = i17;
        i12 = Math.max(i17, k);
        i2 -= i12;
        localObject6 = localObject1;
        i11 = i10;
        i = i9;
        localObject4 = localObject3;
      }
      label873:
      localObject3 = localObject5;
    }
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, View paramView, b paramb)
  {
    Object localObject1 = paramView.getLayoutParams();
    boolean bool1 = localObject1 instanceof GridLayoutManager.LayoutParams;
    if (!bool1)
    {
      super.onInitializeAccessibilityNodeInfoForItem(paramView, paramb);
      return;
    }
    Object localObject2 = localObject1;
    localObject2 = (GridLayoutManager.LayoutParams)localObject1;
    int j = ((GridLayoutManager.LayoutParams)localObject2).getViewLayoutPosition();
    int k = getSpanGroupIndex(paramRecycler, paramState, j);
    j = this.mOrientation;
    if (j == 0)
    {
      j = ((GridLayoutManager.LayoutParams)localObject2).getSpanIndex();
      i = ((GridLayoutManager.LayoutParams)localObject2).getSpanSize();
      m = 1;
      int n = this.mSpanCount;
      int i2 = 1;
      if (n > i2)
      {
        n = ((GridLayoutManager.LayoutParams)localObject2).getSpanSize();
        int i3 = this.mSpanCount;
        if (n != i3) {}
      }
      for (n = 1;; i1 = 0)
      {
        i4 = 0;
        localObject1 = b.c.a(j, i, k, m, n, false);
        paramb.b(localObject1);
        break;
      }
    }
    int m = 1;
    int i1 = ((GridLayoutManager.LayoutParams)localObject2).getSpanIndex();
    int i4 = ((GridLayoutManager.LayoutParams)localObject2).getSpanSize();
    j = this.mSpanCount;
    int i = 1;
    boolean bool2;
    if (j > i)
    {
      j = ((GridLayoutManager.LayoutParams)localObject2).getSpanSize();
      i = this.mSpanCount;
      if (j == i) {
        bool2 = true;
      }
    }
    for (;;)
    {
      localObject1 = b.c.a(k, m, i1, i4, bool2, false);
      paramb.b(localObject1);
      break;
      bool2 = false;
      localObject2 = null;
    }
  }
  
  public void onItemsAdded(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.mSpanSizeLookup.invalidateSpanIndexCache();
  }
  
  public void onItemsChanged(RecyclerView paramRecyclerView)
  {
    this.mSpanSizeLookup.invalidateSpanIndexCache();
  }
  
  public void onItemsMoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mSpanSizeLookup.invalidateSpanIndexCache();
  }
  
  public void onItemsRemoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.mSpanSizeLookup.invalidateSpanIndexCache();
  }
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    this.mSpanSizeLookup.invalidateSpanIndexCache();
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    boolean bool = paramState.isPreLayout();
    if (bool) {
      cachePreLayoutSpanMapping();
    }
    super.onLayoutChildren(paramRecycler, paramState);
    clearPreLayoutSpanMappingCache();
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    this.mPendingSpanCountChange = false;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    updateMeasurements();
    ensureViewSet();
    return super.scrollHorizontallyBy(paramInt, paramRecycler, paramState);
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    updateMeasurements();
    ensureViewSet();
    return super.scrollVerticallyBy(paramInt, paramRecycler, paramState);
  }
  
  public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt1 = this.mCachedBorders;
    if (arrayOfInt1 == null) {
      super.setMeasuredDimension(paramRect, paramInt1, paramInt2);
    }
    int i = getPaddingLeft();
    int j = getPaddingRight() + i;
    i = getPaddingTop();
    int k = getPaddingBottom();
    i += k;
    k = this.mOrientation;
    int m = 1;
    int[] arrayOfInt2;
    int[] arrayOfInt3;
    if (k == m)
    {
      k = paramRect.height();
      i += k;
      k = getMinimumHeight();
      i = chooseSize(paramInt2, i, k);
      arrayOfInt2 = this.mCachedBorders;
      arrayOfInt3 = this.mCachedBorders;
      m = arrayOfInt3.length + -1;
      k = arrayOfInt2[m];
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
      arrayOfInt2 = this.mCachedBorders;
      arrayOfInt3 = this.mCachedBorders;
      m = arrayOfInt3.length + -1;
      k = arrayOfInt2[m];
      i += k;
      k = getMinimumHeight();
      i = chooseSize(paramInt2, i, k);
    }
  }
  
  public void setSpanCount(int paramInt)
  {
    int i = 1;
    int j = this.mSpanCount;
    if (paramInt == j) {}
    for (;;)
    {
      return;
      this.mPendingSpanCountChange = i;
      if (paramInt < i)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Span count should be at least 1. Provided " + paramInt;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      this.mSpanCount = paramInt;
      Object localObject1 = this.mSpanSizeLookup;
      ((GridLayoutManager.SpanSizeLookup)localObject1).invalidateSpanIndexCache();
      requestLayout();
    }
  }
  
  public void setSpanSizeLookup(GridLayoutManager.SpanSizeLookup paramSpanSizeLookup)
  {
    this.mSpanSizeLookup = paramSpanSizeLookup;
  }
  
  public void setStackFromEnd(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("GridLayoutManager does not support stack from end. Consider using reverse layout");
      throw localUnsupportedOperationException;
    }
    super.setStackFromEnd(false);
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    LinearLayoutManager.SavedState localSavedState = this.mPendingSavedState;
    boolean bool;
    if (localSavedState == null)
    {
      bool = this.mPendingSpanCountChange;
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSavedState = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\GridLayoutManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */