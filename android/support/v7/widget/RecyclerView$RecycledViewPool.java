package android.support.v7.widget;

import android.util.SparseArray;
import java.util.ArrayList;

public class RecyclerView$RecycledViewPool
{
  private static final int DEFAULT_MAX_SCRAP = 5;
  private int mAttachCount;
  SparseArray mScrap;
  
  public RecyclerView$RecycledViewPool()
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.mScrap = localSparseArray;
    this.mAttachCount = 0;
  }
  
  private RecyclerView.RecycledViewPool.ScrapData getScrapDataForType(int paramInt)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = (RecyclerView.RecycledViewPool.ScrapData)this.mScrap.get(paramInt);
    if (localScrapData == null)
    {
      localScrapData = new android/support/v7/widget/RecyclerView$RecycledViewPool$ScrapData;
      localScrapData.<init>();
      SparseArray localSparseArray = this.mScrap;
      localSparseArray.put(paramInt, localScrapData);
    }
    return localScrapData;
  }
  
  void attach(RecyclerView.Adapter paramAdapter)
  {
    int i = this.mAttachCount + 1;
    this.mAttachCount = i;
  }
  
  public void clear()
  {
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.mScrap;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = ((RecyclerView.RecycledViewPool.ScrapData)this.mScrap.valueAt(j)).mScrapHeap;
      ((ArrayList)localObject).clear();
      i = j + 1;
    }
  }
  
  void detach()
  {
    int i = this.mAttachCount + -1;
    this.mAttachCount = i;
  }
  
  void factorInBindTime(int paramInt, long paramLong)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = getScrapDataForType(paramInt);
    long l = localScrapData.mBindRunningAverageNs;
    l = runningAverage(l, paramLong);
    localScrapData.mBindRunningAverageNs = l;
  }
  
  void factorInCreateTime(int paramInt, long paramLong)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = getScrapDataForType(paramInt);
    long l = localScrapData.mCreateRunningAverageNs;
    l = runningAverage(l, paramLong);
    localScrapData.mCreateRunningAverageNs = l;
  }
  
  public RecyclerView.ViewHolder getRecycledView(int paramInt)
  {
    Object localObject = (RecyclerView.RecycledViewPool.ScrapData)this.mScrap.get(paramInt);
    int i;
    if (localObject != null)
    {
      ArrayList localArrayList = ((RecyclerView.RecycledViewPool.ScrapData)localObject).mScrapHeap;
      boolean bool = localArrayList.isEmpty();
      if (!bool)
      {
        localObject = ((RecyclerView.RecycledViewPool.ScrapData)localObject).mScrapHeap;
        i = ((ArrayList)localObject).size() + -1;
      }
    }
    for (localObject = (RecyclerView.ViewHolder)((ArrayList)localObject).remove(i);; localObject = null) {
      return (RecyclerView.ViewHolder)localObject;
    }
  }
  
  public int getRecycledViewCount(int paramInt)
  {
    return getScrapDataForType(paramInt).mScrapHeap.size();
  }
  
  void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2, boolean paramBoolean)
  {
    if (paramAdapter1 != null) {
      detach();
    }
    if (!paramBoolean)
    {
      int i = this.mAttachCount;
      if (i == 0) {
        clear();
      }
    }
    if (paramAdapter2 != null) {
      attach(paramAdapter2);
    }
  }
  
  public void putRecycledView(RecyclerView.ViewHolder paramViewHolder)
  {
    int i = paramViewHolder.getItemViewType();
    ArrayList localArrayList = getScrapDataForType(i).mScrapHeap;
    SparseArray localSparseArray = this.mScrap;
    RecyclerView.RecycledViewPool.ScrapData localScrapData = (RecyclerView.RecycledViewPool.ScrapData)localSparseArray.get(i);
    i = localScrapData.mMaxScrap;
    int j = localArrayList.size();
    if (i <= j) {}
    for (;;)
    {
      return;
      paramViewHolder.resetInternal();
      localArrayList.add(paramViewHolder);
    }
  }
  
  long runningAverage(long paramLong1, long paramLong2)
  {
    long l1 = 4;
    long l2 = 0L;
    boolean bool = paramLong1 < l2;
    if (!bool) {}
    for (;;)
    {
      return paramLong2;
      l2 = paramLong1 / l1 * 3;
      long l3 = paramLong2 / l1;
      paramLong2 = l2 + l3;
    }
  }
  
  public void setMaxRecycledViews(int paramInt1, int paramInt2)
  {
    Object localObject = getScrapDataForType(paramInt1);
    ((RecyclerView.RecycledViewPool.ScrapData)localObject).mMaxScrap = paramInt2;
    localObject = ((RecyclerView.RecycledViewPool.ScrapData)localObject).mScrapHeap;
    for (;;)
    {
      int i = ((ArrayList)localObject).size();
      if (i <= paramInt2) {
        break;
      }
      i = ((ArrayList)localObject).size() + -1;
      ((ArrayList)localObject).remove(i);
    }
  }
  
  int size()
  {
    int i = 0;
    Object localObject = null;
    int j = 0;
    int k = 0;
    for (;;)
    {
      localObject = this.mScrap;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = ((RecyclerView.RecycledViewPool.ScrapData)this.mScrap.valueAt(j)).mScrapHeap;
      if (localObject != null)
      {
        i = ((ArrayList)localObject).size();
        k += i;
      }
      i = j + 1;
      j = i;
    }
    return k;
  }
  
  boolean willBindInTime(int paramInt, long paramLong1, long paramLong2)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = getScrapDataForType(paramInt);
    long l1 = localScrapData.mBindRunningAverageNs;
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    boolean bool2;
    if (bool1)
    {
      l1 += paramLong1;
      bool2 = l1 < paramLong2;
      if (!bool2) {}
    }
    else
    {
      bool2 = true;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localScrapData = null;
    }
  }
  
  boolean willCreateInTime(int paramInt, long paramLong1, long paramLong2)
  {
    RecyclerView.RecycledViewPool.ScrapData localScrapData = getScrapDataForType(paramInt);
    long l1 = localScrapData.mCreateRunningAverageNs;
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    boolean bool2;
    if (bool1)
    {
      l1 += paramLong1;
      bool2 = l1 < paramLong2;
      if (!bool2) {}
    }
    else
    {
      bool2 = true;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localScrapData = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$RecycledViewPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */