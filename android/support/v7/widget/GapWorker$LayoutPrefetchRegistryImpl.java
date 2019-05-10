package android.support.v7.widget;

import java.util.Arrays;

class GapWorker$LayoutPrefetchRegistryImpl
  implements RecyclerView.LayoutManager.LayoutPrefetchRegistry
{
  int mCount;
  int[] mPrefetchArray;
  int mPrefetchDx;
  int mPrefetchDy;
  
  public void addPosition(int paramInt1, int paramInt2)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramInt1 < 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Layout positions must be non-negative");
      throw localIllegalArgumentException;
    }
    if (paramInt2 < 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Pixel distance must be non-negative");
      throw localIllegalArgumentException;
    }
    int i = this.mCount * 2;
    int[] arrayOfInt1 = this.mPrefetchArray;
    int j;
    int k;
    if (arrayOfInt1 == null)
    {
      j = 4;
      arrayOfInt1 = new int[j];
      this.mPrefetchArray = arrayOfInt1;
      arrayOfInt1 = this.mPrefetchArray;
      k = -1;
      Arrays.fill(arrayOfInt1, k);
    }
    for (;;)
    {
      this.mPrefetchArray[i] = paramInt1;
      arrayOfInt1 = this.mPrefetchArray;
      i += 1;
      arrayOfInt1[i] = paramInt2;
      i = this.mCount + 1;
      this.mCount = i;
      return;
      arrayOfInt1 = this.mPrefetchArray;
      j = arrayOfInt1.length;
      if (i >= j)
      {
        arrayOfInt1 = this.mPrefetchArray;
        k = i * 2;
        int[] arrayOfInt2 = new int[k];
        this.mPrefetchArray = arrayOfInt2;
        arrayOfInt2 = this.mPrefetchArray;
        int m = arrayOfInt1.length;
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, m);
      }
    }
  }
  
  void clearPrefetchPositions()
  {
    int[] arrayOfInt = this.mPrefetchArray;
    if (arrayOfInt != null)
    {
      arrayOfInt = this.mPrefetchArray;
      int i = -1;
      Arrays.fill(arrayOfInt, i);
    }
    this.mCount = 0;
  }
  
  void collectPrefetchPositionsFromView(RecyclerView paramRecyclerView, boolean paramBoolean)
  {
    this.mCount = 0;
    Object localObject1 = this.mPrefetchArray;
    if (localObject1 != null)
    {
      localObject1 = this.mPrefetchArray;
      int i = -1;
      Arrays.fill((int[])localObject1, i);
    }
    localObject1 = paramRecyclerView.mLayout;
    Object localObject2 = paramRecyclerView.mAdapter;
    int j;
    if ((localObject2 != null) && (localObject1 != null))
    {
      boolean bool1 = ((RecyclerView.LayoutManager)localObject1).isItemPrefetchEnabled();
      if (bool1)
      {
        if (!paramBoolean) {
          break label147;
        }
        localObject2 = paramRecyclerView.mAdapterHelper;
        bool1 = ((AdapterHelper)localObject2).hasPendingUpdates();
        if (!bool1)
        {
          localObject2 = paramRecyclerView.mAdapter;
          j = ((RecyclerView.Adapter)localObject2).getItemCount();
          ((RecyclerView.LayoutManager)localObject1).collectInitialPrefetchPositions(j, this);
        }
      }
    }
    for (;;)
    {
      j = this.mCount;
      int m = ((RecyclerView.LayoutManager)localObject1).mPrefetchMaxCountObserved;
      if (j > m)
      {
        j = this.mCount;
        ((RecyclerView.LayoutManager)localObject1).mPrefetchMaxCountObserved = j;
        ((RecyclerView.LayoutManager)localObject1).mPrefetchMaxObservedInInitialPrefetch = paramBoolean;
        localObject1 = paramRecyclerView.mRecycler;
        ((RecyclerView.Recycler)localObject1).updateViewCacheSize();
      }
      return;
      label147:
      boolean bool2 = paramRecyclerView.hasPendingAdapterUpdates();
      if (!bool2)
      {
        int k = this.mPrefetchDx;
        m = this.mPrefetchDy;
        RecyclerView.State localState = paramRecyclerView.mState;
        ((RecyclerView.LayoutManager)localObject1).collectAdjacentPrefetchPositions(k, m, localState, this);
      }
    }
  }
  
  boolean lastPrefetchIncludedPosition(int paramInt)
  {
    boolean bool = false;
    int[] arrayOfInt1 = this.mPrefetchArray;
    int i;
    int j;
    if (arrayOfInt1 != null)
    {
      i = this.mCount * 2;
      j = 0;
      arrayOfInt1 = null;
    }
    for (;;)
    {
      if (j < i)
      {
        int[] arrayOfInt2 = this.mPrefetchArray;
        int k = arrayOfInt2[j];
        if (k == paramInt) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      j += 2;
    }
  }
  
  void setPrefetchVector(int paramInt1, int paramInt2)
  {
    this.mPrefetchDx = paramInt1;
    this.mPrefetchDy = paramInt2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\GapWorker$LayoutPrefetchRegistryImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */