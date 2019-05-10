package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StaggeredGridLayoutManager$LazySpanLookup
{
  private static final int MIN_SIZE = 10;
  int[] mData;
  List mFullSpanItems;
  
  private int invalidateFullSpansAfter(int paramInt)
  {
    int i = -1;
    Object localObject = this.mFullSpanItems;
    int j;
    if (localObject == null)
    {
      j = i;
      return j;
    }
    localObject = getFullSpanItem(paramInt);
    if (localObject != null)
    {
      localList1 = this.mFullSpanItems;
      localList1.remove(localObject);
    }
    localObject = this.mFullSpanItems;
    int k = ((List)localObject).size();
    int m = 0;
    List localList1 = null;
    label61:
    if (m < k)
    {
      localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.mFullSpanItems.get(m);
      j = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
      if (j < paramInt) {}
    }
    for (;;)
    {
      if (m != i)
      {
        localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.mFullSpanItems.get(m);
        List localList2 = this.mFullSpanItems;
        localList2.remove(m);
        j = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
        break;
        m += 1;
        break label61;
      }
      j = i;
      break;
      m = i;
    }
  }
  
  private void offsetFullSpansForAddition(int paramInt1, int paramInt2)
  {
    Object localObject = this.mFullSpanItems;
    if (localObject == null) {
      return;
    }
    localObject = this.mFullSpanItems;
    int i = ((List)localObject).size() + -1;
    int j = i;
    label29:
    int k;
    if (j >= 0)
    {
      localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.mFullSpanItems.get(j);
      k = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
      if (k >= paramInt1) {
        break label74;
      }
    }
    for (;;)
    {
      i = j + -1;
      j = i;
      break label29;
      break;
      label74:
      k = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition + paramInt2;
      ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition = k;
    }
  }
  
  private void offsetFullSpansForRemoval(int paramInt1, int paramInt2)
  {
    Object localObject = this.mFullSpanItems;
    if (localObject == null) {
      return;
    }
    int i = paramInt1 + paramInt2;
    localObject = this.mFullSpanItems;
    int j = ((List)localObject).size() + -1;
    int k = j;
    label34:
    int m;
    if (k >= 0)
    {
      localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.mFullSpanItems.get(k);
      m = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
      if (m >= paramInt1) {
        break label79;
      }
    }
    for (;;)
    {
      j = k + -1;
      k = j;
      break label34;
      break;
      label79:
      m = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
      if (m < i)
      {
        localObject = this.mFullSpanItems;
        ((List)localObject).remove(k);
      }
      else
      {
        m = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition - paramInt2;
        ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition = m;
      }
    }
  }
  
  public void addFullSpanItem(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem paramFullSpanItem)
  {
    Object localObject = this.mFullSpanItems;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.mFullSpanItems = ((List)localObject);
    }
    int i = this.mFullSpanItems.size();
    int j = 0;
    localObject = null;
    int k = 0;
    if (k < i)
    {
      localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.mFullSpanItems.get(k);
      int m = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
      int n = paramFullSpanItem.mPosition;
      if (m == n)
      {
        List localList = this.mFullSpanItems;
        localList.remove(k);
      }
      j = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
      m = paramFullSpanItem.mPosition;
      if (j >= m)
      {
        localObject = this.mFullSpanItems;
        ((List)localObject).add(k, paramFullSpanItem);
      }
    }
    for (;;)
    {
      return;
      j = k + 1;
      k = j;
      break;
      localObject = this.mFullSpanItems;
      ((List)localObject).add(paramFullSpanItem);
    }
  }
  
  void clear()
  {
    int[] arrayOfInt = this.mData;
    if (arrayOfInt != null)
    {
      arrayOfInt = this.mData;
      int i = -1;
      Arrays.fill(arrayOfInt, i);
    }
    this.mFullSpanItems = null;
  }
  
  void ensureSize(int paramInt)
  {
    int i = -1;
    int[] arrayOfInt1 = this.mData;
    int j;
    if (arrayOfInt1 == null)
    {
      j = Math.max(paramInt, 10) + 1;
      arrayOfInt1 = new int[j];
      this.mData = arrayOfInt1;
      arrayOfInt1 = this.mData;
      Arrays.fill(arrayOfInt1, i);
    }
    for (;;)
    {
      return;
      arrayOfInt1 = this.mData;
      j = arrayOfInt1.length;
      if (paramInt >= j)
      {
        arrayOfInt1 = this.mData;
        int k = sizeForPosition(paramInt);
        int[] arrayOfInt2 = new int[k];
        this.mData = arrayOfInt2;
        arrayOfInt2 = this.mData;
        int m = arrayOfInt1.length;
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, m);
        arrayOfInt2 = this.mData;
        j = arrayOfInt1.length;
        int[] arrayOfInt3 = this.mData;
        m = arrayOfInt3.length;
        Arrays.fill(arrayOfInt2, j, m, i);
      }
    }
  }
  
  int forceInvalidateAfter(int paramInt)
  {
    Object localObject = this.mFullSpanItems;
    if (localObject != null)
    {
      localObject = this.mFullSpanItems;
      int i = ((List)localObject).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.mFullSpanItems.get(j);
        i = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
        if (i >= paramInt)
        {
          localObject = this.mFullSpanItems;
          ((List)localObject).remove(j);
        }
        i = j + -1;
      }
    }
    return invalidateAfter(paramInt);
  }
  
  public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getFirstFullSpanItemInRange(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Object localObject = this.mFullSpanItems;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject;
      int j = this.mFullSpanItems.size();
      i = 0;
      localObject = null;
      for (int k = 0;; k = i)
      {
        if (k >= j) {
          break label145;
        }
        localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.mFullSpanItems.get(k);
        int m = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
        if (m >= paramInt2)
        {
          i = 0;
          localObject = null;
          break;
        }
        m = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
        if (m >= paramInt1)
        {
          if (paramInt3 == 0) {
            break;
          }
          m = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mGapDir;
          if (m == paramInt3) {
            break;
          }
          if (paramBoolean)
          {
            boolean bool = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mHasUnwantedGapAfter;
            if (bool) {
              break;
            }
          }
        }
        i = k + 1;
      }
      label145:
      i = 0;
      localObject = null;
    }
  }
  
  public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem getFullSpanItem(int paramInt)
  {
    Object localObject = this.mFullSpanItems;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject;
      localObject = this.mFullSpanItems;
      i = ((List)localObject).size() + -1;
      for (int j = i;; j = i)
      {
        if (j < 0) {
          break label75;
        }
        localObject = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.mFullSpanItems.get(j);
        int k = ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).mPosition;
        if (k == paramInt) {
          break;
        }
        i = j + -1;
      }
      label75:
      i = 0;
      localObject = null;
    }
  }
  
  int getSpan(int paramInt)
  {
    int[] arrayOfInt = this.mData;
    if (arrayOfInt != null)
    {
      arrayOfInt = this.mData;
      i = arrayOfInt.length;
      if (paramInt < i) {
        break label26;
      }
    }
    for (int i = -1;; i = arrayOfInt[paramInt])
    {
      return i;
      label26:
      arrayOfInt = this.mData;
    }
  }
  
  int invalidateAfter(int paramInt)
  {
    int i = -1;
    int[] arrayOfInt1 = this.mData;
    if (arrayOfInt1 == null) {}
    for (;;)
    {
      return i;
      arrayOfInt1 = this.mData;
      int j = arrayOfInt1.length;
      if (paramInt < j)
      {
        j = invalidateFullSpansAfter(paramInt);
        int[] arrayOfInt2;
        if (j == i)
        {
          arrayOfInt1 = this.mData;
          arrayOfInt2 = this.mData;
          int k = arrayOfInt2.length;
          Arrays.fill(arrayOfInt1, paramInt, k, i);
          int[] arrayOfInt3 = this.mData;
          i = arrayOfInt3.length;
        }
        else
        {
          arrayOfInt2 = this.mData;
          int m = j + 1;
          Arrays.fill(arrayOfInt2, paramInt, m, i);
          i = j + 1;
        }
      }
    }
  }
  
  void offsetForAddition(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt1 = this.mData;
    int i;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.mData;
      i = arrayOfInt1.length;
      if (paramInt1 < i) {
        break label25;
      }
    }
    for (;;)
    {
      return;
      label25:
      i = paramInt1 + paramInt2;
      ensureSize(i);
      arrayOfInt1 = this.mData;
      int[] arrayOfInt2 = this.mData;
      int j = paramInt1 + paramInt2;
      int[] arrayOfInt3 = this.mData;
      int k = arrayOfInt3.length - paramInt1 - paramInt2;
      System.arraycopy(arrayOfInt1, paramInt1, arrayOfInt2, j, k);
      arrayOfInt1 = this.mData;
      int m = paramInt1 + paramInt2;
      j = -1;
      Arrays.fill(arrayOfInt1, paramInt1, m, j);
      offsetFullSpansForAddition(paramInt1, paramInt2);
    }
  }
  
  void offsetForRemoval(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt1 = this.mData;
    int i;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.mData;
      i = arrayOfInt1.length;
      if (paramInt1 < i) {
        break label25;
      }
    }
    for (;;)
    {
      return;
      label25:
      i = paramInt1 + paramInt2;
      ensureSize(i);
      arrayOfInt1 = this.mData;
      int j = paramInt1 + paramInt2;
      int[] arrayOfInt2 = this.mData;
      int[] arrayOfInt3 = this.mData;
      int k = arrayOfInt3.length - paramInt1 - paramInt2;
      System.arraycopy(arrayOfInt1, j, arrayOfInt2, paramInt1, k);
      arrayOfInt1 = this.mData;
      int[] arrayOfInt4 = this.mData;
      j = arrayOfInt4.length - paramInt2;
      arrayOfInt2 = this.mData;
      int m = arrayOfInt2.length;
      k = -1;
      Arrays.fill(arrayOfInt1, j, m, k);
      offsetFullSpansForRemoval(paramInt1, paramInt2);
    }
  }
  
  void setSpan(int paramInt, StaggeredGridLayoutManager.Span paramSpan)
  {
    ensureSize(paramInt);
    int[] arrayOfInt = this.mData;
    int i = paramSpan.mIndex;
    arrayOfInt[paramInt] = i;
  }
  
  int sizeForPosition(int paramInt)
  {
    int[] arrayOfInt = this.mData;
    int i = arrayOfInt.length;
    while (i <= paramInt) {
      i *= 2;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\StaggeredGridLayoutManager$LazySpanLookup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */