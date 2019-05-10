package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$SpanSizeLookup
{
  private boolean mCacheSpanIndices;
  final SparseIntArray mSpanIndexCache;
  
  public GridLayoutManager$SpanSizeLookup()
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    this.mSpanIndexCache = localSparseIntArray;
    this.mCacheSpanIndices = false;
  }
  
  int findReferenceIndexFromCache(int paramInt)
  {
    int i = 0;
    SparseIntArray localSparseIntArray1 = null;
    SparseIntArray localSparseIntArray2 = this.mSpanIndexCache;
    int j = localSparseIntArray2.size() + -1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      SparseIntArray localSparseIntArray3 = this.mSpanIndexCache;
      int m = localSparseIntArray3.keyAt(k);
      if (m < paramInt) {
        i = k + 1;
      } else {
        j = k + -1;
      }
    }
    j = i + -1;
    if (j >= 0)
    {
      localSparseIntArray1 = this.mSpanIndexCache;
      i = localSparseIntArray1.size();
      if (j < i) {
        localSparseIntArray1 = this.mSpanIndexCache;
      }
    }
    for (j = localSparseIntArray1.keyAt(j);; j = -1) {
      return j;
    }
  }
  
  int getCachedSpanIndex(int paramInt1, int paramInt2)
  {
    int i = -1;
    boolean bool = this.mCacheSpanIndices;
    int j;
    if (!bool) {
      j = getSpanIndex(paramInt1, paramInt2);
    }
    for (;;)
    {
      return j;
      SparseIntArray localSparseIntArray1 = this.mSpanIndexCache;
      j = localSparseIntArray1.get(paramInt1, i);
      if (j == i)
      {
        j = getSpanIndex(paramInt1, paramInt2);
        SparseIntArray localSparseIntArray2 = this.mSpanIndexCache;
        localSparseIntArray2.put(paramInt1, j);
      }
    }
  }
  
  public int getSpanGroupIndex(int paramInt1, int paramInt2)
  {
    int i = getSpanSize(paramInt1);
    int j = 0;
    int k = 0;
    int m = 0;
    int n;
    if (j < paramInt1)
    {
      n = getSpanSize(j);
      m += n;
      if (m == paramInt2)
      {
        k += 1;
        n = 0;
      }
    }
    for (;;)
    {
      j += 1;
      m = n;
      break;
      if (m > paramInt2)
      {
        k += 1;
        continue;
        n = m + i;
        if (n > paramInt2) {
          k += 1;
        }
        return k;
      }
      else
      {
        n = m;
      }
    }
  }
  
  public int getSpanIndex(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = getSpanSize(paramInt1);
    if (j == paramInt2) {
      return i;
    }
    boolean bool = this.mCacheSpanIndices;
    SparseIntArray localSparseIntArray1;
    int k;
    SparseIntArray localSparseIntArray2;
    int m;
    int n;
    if (bool)
    {
      localSparseIntArray1 = this.mSpanIndexCache;
      k = localSparseIntArray1.size();
      if (k > 0)
      {
        k = findReferenceIndexFromCache(paramInt1);
        if (k >= 0)
        {
          localSparseIntArray2 = this.mSpanIndexCache;
          m = localSparseIntArray2.get(k);
          n = getSpanSize(k);
          m += n;
          k += 1;
        }
      }
    }
    for (;;)
    {
      n = k;
      if (n < paramInt1)
      {
        k = getSpanSize(n);
        m += k;
        if (m == paramInt2)
        {
          k = 0;
          localSparseIntArray1 = null;
        }
        for (;;)
        {
          n += 1;
          m = k;
          break;
          if (m <= paramInt2) {
            k = m;
          }
        }
      }
      k = m + j;
      if (k > paramInt2) {
        break;
      }
      i = m;
      break;
      k = 0;
      localSparseIntArray1 = null;
      m = 0;
      localSparseIntArray2 = null;
    }
  }
  
  public abstract int getSpanSize(int paramInt);
  
  public void invalidateSpanIndexCache()
  {
    this.mSpanIndexCache.clear();
  }
  
  public boolean isSpanIndexCacheEnabled()
  {
    return this.mCacheSpanIndices;
  }
  
  public void setSpanIndexCacheEnabled(boolean paramBoolean)
  {
    this.mCacheSpanIndices = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\GridLayoutManager$SpanSizeLookup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */