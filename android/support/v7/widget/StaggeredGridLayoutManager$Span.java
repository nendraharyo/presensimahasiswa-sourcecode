package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

class StaggeredGridLayoutManager$Span
{
  static final int INVALID_LINE = Integer.MIN_VALUE;
  int mCachedEnd;
  int mCachedStart;
  int mDeletedSize;
  final int mIndex;
  ArrayList mViews;
  
  StaggeredGridLayoutManager$Span(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mViews = localArrayList;
    this.mCachedStart = i;
    this.mCachedEnd = i;
    this.mDeletedSize = 0;
    this.mIndex = paramInt;
  }
  
  void appendToSpan(View paramView)
  {
    int i = -1 << -1;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams(paramView);
    localLayoutParams.mSpan = this;
    this.mViews.add(paramView);
    this.mCachedEnd = i;
    Object localObject = this.mViews;
    int j = ((ArrayList)localObject).size();
    int m = 1;
    if (j == m) {
      this.mCachedStart = i;
    }
    boolean bool1 = localLayoutParams.isItemRemoved();
    if (!bool1)
    {
      boolean bool2 = localLayoutParams.isItemChanged();
      if (!bool2) {}
    }
    else
    {
      int n = this.mDeletedSize;
      localObject = this.this$0.mPrimaryOrientation;
      int k = ((OrientationHelper)localObject).getDecoratedMeasurement(paramView);
      n += k;
      this.mDeletedSize = n;
    }
  }
  
  void cacheReferenceLineAndClear(boolean paramBoolean, int paramInt)
  {
    int i = -1 << -1;
    int j;
    if (paramBoolean)
    {
      j = getEndLine(i);
      clear();
      if (j != i) {
        break label36;
      }
    }
    for (;;)
    {
      return;
      j = getStartLine(i);
      break;
      label36:
      OrientationHelper localOrientationHelper;
      int k;
      if (paramBoolean)
      {
        localOrientationHelper = this.this$0.mPrimaryOrientation;
        k = localOrientationHelper.getEndAfterPadding();
        if (j < k) {}
      }
      else if (!paramBoolean)
      {
        localOrientationHelper = this.this$0.mPrimaryOrientation;
        k = localOrientationHelper.getStartAfterPadding();
        if (j > k) {}
      }
      else
      {
        if (paramInt != i) {
          j += paramInt;
        }
        this.mCachedEnd = j;
        this.mCachedStart = j;
      }
    }
  }
  
  void calculateCachedEnd()
  {
    Object localObject = this.mViews;
    int i = this.mViews.size() + -1;
    localObject = (View)((ArrayList)localObject).get(i);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams((View)localObject);
    OrientationHelper localOrientationHelper = this.this$0.mPrimaryOrientation;
    int j = localOrientationHelper.getDecoratedEnd((View)localObject);
    this.mCachedEnd = j;
    boolean bool = localLayoutParams.mFullSpan;
    if (bool)
    {
      localObject = this.this$0.mLazySpanLookup;
      i = localLayoutParams.getViewLayoutPosition();
      localObject = ((StaggeredGridLayoutManager.LazySpanLookup)localObject).getFullSpanItem(i);
      if (localObject != null)
      {
        i = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mGapDir;
        int m = 1;
        if (i == m)
        {
          i = this.mCachedEnd;
          m = this.mIndex;
          int k = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).getGapForSpan(m) + i;
          this.mCachedEnd = k;
        }
      }
    }
  }
  
  void calculateCachedStart()
  {
    Object localObject = this.mViews;
    int i = 0;
    localObject = (View)((ArrayList)localObject).get(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams((View)localObject);
    OrientationHelper localOrientationHelper = this.this$0.mPrimaryOrientation;
    int j = localOrientationHelper.getDecoratedStart((View)localObject);
    this.mCachedStart = j;
    boolean bool = localLayoutParams.mFullSpan;
    if (bool)
    {
      localObject = this.this$0.mLazySpanLookup;
      i = localLayoutParams.getViewLayoutPosition();
      localObject = ((StaggeredGridLayoutManager.LazySpanLookup)localObject).getFullSpanItem(i);
      if (localObject != null)
      {
        i = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mGapDir;
        int m = -1;
        if (i == m)
        {
          i = this.mCachedStart;
          m = this.mIndex;
          int k = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).getGapForSpan(m);
          k = i - k;
          this.mCachedStart = k;
        }
      }
    }
  }
  
  void clear()
  {
    this.mViews.clear();
    invalidateCache();
    this.mDeletedSize = 0;
  }
  
  public int findFirstCompletelyVisibleItemPosition()
  {
    boolean bool1 = true;
    Object localObject = this.this$0;
    boolean bool2 = ((StaggeredGridLayoutManager)localObject).mReverseLayout;
    int j;
    if (bool2)
    {
      localObject = this.mViews;
      i = ((ArrayList)localObject).size() + -1;
      j = -1;
    }
    for (int i = findOneVisibleChild(i, j, bool1);; i = findOneVisibleChild(0, j, bool1))
    {
      return i;
      localObject = null;
      ArrayList localArrayList = this.mViews;
      j = localArrayList.size();
    }
  }
  
  public int findFirstPartiallyVisibleItemPosition()
  {
    boolean bool1 = true;
    Object localObject = this.this$0;
    boolean bool2 = ((StaggeredGridLayoutManager)localObject).mReverseLayout;
    int j;
    if (bool2)
    {
      localObject = this.mViews;
      i = ((ArrayList)localObject).size() + -1;
      j = -1;
    }
    for (int i = findOnePartiallyVisibleChild(i, j, bool1);; i = findOnePartiallyVisibleChild(0, j, bool1))
    {
      return i;
      localObject = null;
      ArrayList localArrayList = this.mViews;
      j = localArrayList.size();
    }
  }
  
  public int findFirstVisibleItemPosition()
  {
    Object localObject = this.this$0;
    boolean bool = ((StaggeredGridLayoutManager)localObject).mReverseLayout;
    int j;
    if (bool)
    {
      localObject = this.mViews;
      i = ((ArrayList)localObject).size() + -1;
      j = -1;
    }
    for (int i = findOneVisibleChild(i, j, false);; i = findOneVisibleChild(0, i, false))
    {
      return i;
      localObject = this.mViews;
      i = ((ArrayList)localObject).size();
    }
  }
  
  public int findLastCompletelyVisibleItemPosition()
  {
    boolean bool1 = true;
    Object localObject = this.this$0;
    boolean bool2 = ((StaggeredGridLayoutManager)localObject).mReverseLayout;
    int j;
    if (bool2)
    {
      localObject = null;
      ArrayList localArrayList = this.mViews;
      j = localArrayList.size();
    }
    for (int i = findOneVisibleChild(0, j, bool1);; i = findOneVisibleChild(i, j, bool1))
    {
      return i;
      localObject = this.mViews;
      i = ((ArrayList)localObject).size() + -1;
      j = -1;
    }
  }
  
  public int findLastPartiallyVisibleItemPosition()
  {
    boolean bool1 = true;
    Object localObject = this.this$0;
    boolean bool2 = ((StaggeredGridLayoutManager)localObject).mReverseLayout;
    int j;
    if (bool2)
    {
      localObject = null;
      ArrayList localArrayList = this.mViews;
      j = localArrayList.size();
    }
    for (int i = findOnePartiallyVisibleChild(0, j, bool1);; i = findOnePartiallyVisibleChild(i, j, bool1))
    {
      return i;
      localObject = this.mViews;
      i = ((ArrayList)localObject).size() + -1;
      j = -1;
    }
  }
  
  public int findLastVisibleItemPosition()
  {
    Object localObject = this.this$0;
    boolean bool = ((StaggeredGridLayoutManager)localObject).mReverseLayout;
    if (bool)
    {
      localObject = this.mViews;
      i = ((ArrayList)localObject).size();
    }
    int j;
    for (int i = findOneVisibleChild(0, i, false);; i = findOneVisibleChild(i, j, false))
    {
      return i;
      localObject = this.mViews;
      i = ((ArrayList)localObject).size() + -1;
      j = -1;
    }
  }
  
  int findOnePartiallyOrCompletelyVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = this.this$0.mPrimaryOrientation.getStartAfterPadding();
    Object localObject = this.this$0.mPrimaryOrientation;
    int j = ((OrientationHelper)localObject).getEndAfterPadding();
    int k;
    int m;
    int n;
    OrientationHelper localOrientationHelper;
    int i1;
    int i2;
    int i3;
    label109:
    label124:
    StaggeredGridLayoutManager localStaggeredGridLayoutManager;
    if (paramInt2 > paramInt1)
    {
      k = 1;
      m = k;
      if (paramInt1 == paramInt2) {
        break label320;
      }
      localObject = (View)this.mViews.get(paramInt1);
      n = this.this$0.mPrimaryOrientation.getDecoratedStart((View)localObject);
      localOrientationHelper = this.this$0.mPrimaryOrientation;
      i1 = localOrientationHelper.getDecoratedEnd((View)localObject);
      if (!paramBoolean3) {
        break label197;
      }
      if (n > j) {
        break label185;
      }
      i2 = 1;
      i3 = i2;
      if (!paramBoolean3) {
        break label235;
      }
      if (i1 < i) {
        break label226;
      }
      i2 = 1;
      if ((i3 == 0) || (i2 == 0)) {
        break label312;
      }
      if ((!paramBoolean1) || (!paramBoolean2)) {
        break label257;
      }
      if ((n < i) || (i1 > j)) {
        break label312;
      }
      localStaggeredGridLayoutManager = this.this$0;
      k = localStaggeredGridLayoutManager.getPosition((View)localObject);
    }
    for (;;)
    {
      return k;
      k = -1;
      m = k;
      break;
      label185:
      i2 = 0;
      localOrientationHelper = null;
      i3 = 0;
      break label109;
      label197:
      if (n < j)
      {
        i2 = 1;
        i3 = i2;
        break label109;
      }
      i2 = 0;
      localOrientationHelper = null;
      i3 = 0;
      break label109;
      label226:
      i2 = 0;
      localOrientationHelper = null;
      break label124;
      label235:
      if (i1 > i)
      {
        i2 = 1;
        break label124;
      }
      i2 = 0;
      localOrientationHelper = null;
      break label124;
      label257:
      if (paramBoolean2)
      {
        localStaggeredGridLayoutManager = this.this$0;
        k = localStaggeredGridLayoutManager.getPosition((View)localObject);
      }
      else if ((n < i) || (i1 > j))
      {
        localStaggeredGridLayoutManager = this.this$0;
        k = localStaggeredGridLayoutManager.getPosition((View)localObject);
      }
      else
      {
        label312:
        paramInt1 += m;
        break;
        label320:
        k = -1;
      }
    }
  }
  
  int findOnePartiallyVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return findOnePartiallyOrCompletelyVisibleChild(paramInt1, paramInt2, false, false, paramBoolean);
  }
  
  int findOneVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return findOnePartiallyOrCompletelyVisibleChild(paramInt1, paramInt2, paramBoolean, true, false);
  }
  
  public int getDeletedSize()
  {
    return this.mDeletedSize;
  }
  
  int getEndLine()
  {
    int i = this.mCachedEnd;
    int j = -1 << -1;
    if (i != j) {}
    for (i = this.mCachedEnd;; i = this.mCachedEnd)
    {
      return i;
      calculateCachedEnd();
    }
  }
  
  int getEndLine(int paramInt)
  {
    int i = this.mCachedEnd;
    int j = -1 << -1;
    if (i != j) {
      paramInt = this.mCachedEnd;
    }
    for (;;)
    {
      return paramInt;
      ArrayList localArrayList = this.mViews;
      i = localArrayList.size();
      if (i != 0)
      {
        calculateCachedEnd();
        paramInt = this.mCachedEnd;
      }
    }
  }
  
  public View getFocusableViewAfter(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = -1;
    Object localObject2;
    int i1;
    if (paramInt2 == j)
    {
      int k = this.mViews.size();
      j = 0;
      localObject2 = null;
      i1 = 0;
      if (i1 < k)
      {
        localObject2 = (View)this.mViews.get(i1);
        StaggeredGridLayoutManager localStaggeredGridLayoutManager1 = this.this$0;
        boolean bool4 = localStaggeredGridLayoutManager1.mReverseLayout;
        if (bool4)
        {
          localStaggeredGridLayoutManager1 = this.this$0;
          int i2 = localStaggeredGridLayoutManager1.getPosition((View)localObject2);
          if (i2 <= paramInt1) {}
        }
        else
        {
          localStaggeredGridLayoutManager1 = this.this$0;
          boolean bool5 = localStaggeredGridLayoutManager1.mReverseLayout;
          if (bool5) {
            break label138;
          }
          localStaggeredGridLayoutManager1 = this.this$0;
          int i3 = localStaggeredGridLayoutManager1.getPosition((View)localObject2);
          if (i3 < paramInt1) {
            break label138;
          }
        }
      }
      label131:
      localObject2 = localObject1;
    }
    for (;;)
    {
      return (View)localObject2;
      label138:
      boolean bool6 = ((View)localObject2).hasFocusable();
      if (!bool6) {
        break label131;
      }
      i = i1 + 1;
      i1 = i;
      localObject1 = localObject2;
      break;
      localObject2 = this.mViews;
      j = ((ArrayList)localObject2).size() + -1;
      i1 = j;
      for (;;)
      {
        if (i1 < 0) {
          break label315;
        }
        localObject2 = (View)this.mViews.get(i1);
        StaggeredGridLayoutManager localStaggeredGridLayoutManager2 = this.this$0;
        boolean bool1 = localStaggeredGridLayoutManager2.mReverseLayout;
        if (bool1)
        {
          localStaggeredGridLayoutManager2 = this.this$0;
          int m = localStaggeredGridLayoutManager2.getPosition((View)localObject2);
          if (m >= paramInt1) {
            break label315;
          }
        }
        localStaggeredGridLayoutManager2 = this.this$0;
        boolean bool2 = localStaggeredGridLayoutManager2.mReverseLayout;
        if (!bool2)
        {
          localStaggeredGridLayoutManager2 = this.this$0;
          int n = localStaggeredGridLayoutManager2.getPosition((View)localObject2);
          if (n <= paramInt1)
          {
            localObject2 = localObject1;
            break;
          }
        }
        boolean bool3 = ((View)localObject2).hasFocusable();
        if (!bool3) {
          break label315;
        }
        i = i1 + -1;
        i1 = i;
        localObject1 = localObject2;
      }
      label315:
      localObject2 = localObject1;
    }
  }
  
  StaggeredGridLayoutManager.LayoutParams getLayoutParams(View paramView)
  {
    return (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
  }
  
  int getStartLine()
  {
    int i = this.mCachedStart;
    int j = -1 << -1;
    if (i != j) {}
    for (i = this.mCachedStart;; i = this.mCachedStart)
    {
      return i;
      calculateCachedStart();
    }
  }
  
  int getStartLine(int paramInt)
  {
    int i = this.mCachedStart;
    int j = -1 << -1;
    if (i != j) {
      paramInt = this.mCachedStart;
    }
    for (;;)
    {
      return paramInt;
      ArrayList localArrayList = this.mViews;
      i = localArrayList.size();
      if (i != 0)
      {
        calculateCachedStart();
        paramInt = this.mCachedStart;
      }
    }
  }
  
  void invalidateCache()
  {
    int i = -1 << -1;
    this.mCachedStart = i;
    this.mCachedEnd = i;
  }
  
  void onOffset(int paramInt)
  {
    int i = -1 << -1;
    int j = this.mCachedStart;
    if (j != i)
    {
      j = this.mCachedStart + paramInt;
      this.mCachedStart = j;
    }
    j = this.mCachedEnd;
    if (j != i)
    {
      j = this.mCachedEnd + paramInt;
      this.mCachedEnd = j;
    }
  }
  
  void popEnd()
  {
    int i = -1 << -1;
    int j = this.mViews.size();
    Object localObject = this.mViews;
    int k = j + -1;
    localObject = (View)((ArrayList)localObject).remove(k);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams((View)localObject);
    OrientationHelper localOrientationHelper = null;
    localLayoutParams.mSpan = null;
    boolean bool2 = localLayoutParams.isItemRemoved();
    if (!bool2)
    {
      boolean bool1 = localLayoutParams.isItemChanged();
      if (!bool1) {}
    }
    else
    {
      int m = this.mDeletedSize;
      localOrientationHelper = this.this$0.mPrimaryOrientation;
      n = localOrientationHelper.getDecoratedMeasurement((View)localObject);
      n = m - n;
      this.mDeletedSize = n;
    }
    int n = 1;
    if (j == n) {
      this.mCachedStart = i;
    }
    this.mCachedEnd = i;
  }
  
  void popStart()
  {
    int i = -1 << -1;
    Object localObject1 = this.mViews;
    boolean bool1 = false;
    localObject1 = (View)((ArrayList)localObject1).remove(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams((View)localObject1);
    localLayoutParams.mSpan = null;
    Object localObject2 = this.mViews;
    int k = ((ArrayList)localObject2).size();
    if (k == 0) {
      this.mCachedEnd = i;
    }
    boolean bool2 = localLayoutParams.isItemRemoved();
    if (!bool2)
    {
      bool1 = localLayoutParams.isItemChanged();
      if (!bool1) {}
    }
    else
    {
      int j = this.mDeletedSize;
      localObject2 = this.this$0.mPrimaryOrientation;
      int m = ((OrientationHelper)localObject2).getDecoratedMeasurement((View)localObject1);
      m = j - m;
      this.mDeletedSize = m;
    }
    this.mCachedStart = i;
  }
  
  void prependToSpan(View paramView)
  {
    int i = -1 << -1;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams(paramView);
    localLayoutParams.mSpan = this;
    this.mViews.add(0, paramView);
    this.mCachedStart = i;
    Object localObject = this.mViews;
    int j = ((ArrayList)localObject).size();
    int m = 1;
    if (j == m) {
      this.mCachedEnd = i;
    }
    boolean bool1 = localLayoutParams.isItemRemoved();
    if (!bool1)
    {
      boolean bool2 = localLayoutParams.isItemChanged();
      if (!bool2) {}
    }
    else
    {
      int n = this.mDeletedSize;
      localObject = this.this$0.mPrimaryOrientation;
      int k = ((OrientationHelper)localObject).getDecoratedMeasurement(paramView);
      n += k;
      this.mDeletedSize = n;
    }
  }
  
  void setLine(int paramInt)
  {
    this.mCachedStart = paramInt;
    this.mCachedEnd = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\StaggeredGridLayoutManager$Span.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */