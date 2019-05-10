package android.support.v7.widget;

import android.support.v4.h.a;
import android.support.v4.h.f;

class ViewInfoStore
{
  private static final boolean DEBUG;
  final a mLayoutHolderMap;
  final f mOldChangedHolders;
  
  ViewInfoStore()
  {
    Object localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.mLayoutHolderMap = ((a)localObject);
    localObject = new android/support/v4/h/f;
    ((f)localObject).<init>();
    this.mOldChangedHolders = ((f)localObject);
  }
  
  private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = 0;
    RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo = null;
    Object localObject = this.mLayoutHolderMap;
    int j = ((a)localObject).indexOfKey(paramViewHolder);
    if (j < 0) {}
    do
    {
      do
      {
        return localItemHolderInfo;
        localObject = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.valueAt(j);
      } while (localObject == null);
      k = ((ViewInfoStore.InfoRecord)localObject).flags & paramInt;
    } while (k == 0);
    i = ((ViewInfoStore.InfoRecord)localObject).flags;
    int k = paramInt ^ 0xFFFFFFFF;
    i &= k;
    ((ViewInfoStore.InfoRecord)localObject).flags = i;
    i = 4;
    if (paramInt == i) {}
    for (localItemHolderInfo = ((ViewInfoStore.InfoRecord)localObject).preInfo;; localItemHolderInfo = ((ViewInfoStore.InfoRecord)localObject).postInfo)
    {
      k = ((ViewInfoStore.InfoRecord)localObject).flags & 0xC;
      if (k != 0) {
        break;
      }
      a locala = this.mLayoutHolderMap;
      locala.removeAt(j);
      ViewInfoStore.InfoRecord.recycle((ViewInfoStore.InfoRecord)localObject);
      break;
      i = 8;
      if (paramInt != i) {
        break label151;
      }
    }
    label151:
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("Must provide flag PRE or POST");
    throw ((Throwable)localObject);
  }
  
  void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.get(paramViewHolder);
    if (localInfoRecord == null)
    {
      localInfoRecord = ViewInfoStore.InfoRecord.obtain();
      a locala = this.mLayoutHolderMap;
      locala.put(paramViewHolder, localInfoRecord);
    }
    int i = localInfoRecord.flags | 0x2;
    localInfoRecord.flags = i;
    localInfoRecord.preInfo = paramItemHolderInfo;
  }
  
  void addToDisappearedInLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.get(paramViewHolder);
    if (localInfoRecord == null)
    {
      localInfoRecord = ViewInfoStore.InfoRecord.obtain();
      a locala = this.mLayoutHolderMap;
      locala.put(paramViewHolder, localInfoRecord);
    }
    int i = localInfoRecord.flags | 0x1;
    localInfoRecord.flags = i;
  }
  
  void addToOldChangeHolders(long paramLong, RecyclerView.ViewHolder paramViewHolder)
  {
    this.mOldChangedHolders.b(paramLong, paramViewHolder);
  }
  
  void addToPostLayout(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.get(paramViewHolder);
    if (localInfoRecord == null)
    {
      localInfoRecord = ViewInfoStore.InfoRecord.obtain();
      a locala = this.mLayoutHolderMap;
      locala.put(paramViewHolder, localInfoRecord);
    }
    localInfoRecord.postInfo = paramItemHolderInfo;
    int i = localInfoRecord.flags | 0x8;
    localInfoRecord.flags = i;
  }
  
  void addToPreLayout(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.get(paramViewHolder);
    if (localInfoRecord == null)
    {
      localInfoRecord = ViewInfoStore.InfoRecord.obtain();
      a locala = this.mLayoutHolderMap;
      locala.put(paramViewHolder, localInfoRecord);
    }
    localInfoRecord.preInfo = paramItemHolderInfo;
    int i = localInfoRecord.flags | 0x4;
    localInfoRecord.flags = i;
  }
  
  void clear()
  {
    this.mLayoutHolderMap.clear();
    this.mOldChangedHolders.c();
  }
  
  RecyclerView.ViewHolder getFromOldChangeHolders(long paramLong)
  {
    return (RecyclerView.ViewHolder)this.mOldChangedHolders.a(paramLong);
  }
  
  boolean isDisappearing(RecyclerView.ViewHolder paramViewHolder)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.get(paramViewHolder);
    int i;
    if (localInfoRecord != null)
    {
      i = localInfoRecord.flags & 0x1;
      if (i != 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localInfoRecord = null;
    }
  }
  
  boolean isInPreLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.get(paramViewHolder);
    int i;
    if (localInfoRecord != null)
    {
      i = localInfoRecord.flags & 0x4;
      if (i != 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localInfoRecord = null;
    }
  }
  
  void onDetach() {}
  
  public void onViewDetached(RecyclerView.ViewHolder paramViewHolder)
  {
    removeFromDisappearedInLayout(paramViewHolder);
  }
  
  RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    return popFromLayoutStep(paramViewHolder, 8);
  }
  
  RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    return popFromLayoutStep(paramViewHolder, 4);
  }
  
  void process(ViewInfoStore.ProcessCallback paramProcessCallback)
  {
    Object localObject = this.mLayoutHolderMap;
    int i = ((a)localObject).size() + -1;
    int j = i;
    if (j >= 0)
    {
      localObject = (RecyclerView.ViewHolder)this.mLayoutHolderMap.keyAt(j);
      ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.removeAt(j);
      int k = localInfoRecord.flags & 0x3;
      int m = 3;
      if (k == m) {
        paramProcessCallback.unused((RecyclerView.ViewHolder)localObject);
      }
      for (;;)
      {
        ViewInfoStore.InfoRecord.recycle(localInfoRecord);
        i = j + -1;
        j = i;
        break;
        k = localInfoRecord.flags & 0x1;
        RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo1;
        RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo2;
        if (k != 0)
        {
          localItemHolderInfo1 = localInfoRecord.preInfo;
          if (localItemHolderInfo1 == null)
          {
            paramProcessCallback.unused((RecyclerView.ViewHolder)localObject);
          }
          else
          {
            localItemHolderInfo1 = localInfoRecord.preInfo;
            localItemHolderInfo2 = localInfoRecord.postInfo;
            paramProcessCallback.processDisappeared((RecyclerView.ViewHolder)localObject, localItemHolderInfo1, localItemHolderInfo2);
          }
        }
        else
        {
          k = localInfoRecord.flags & 0xE;
          m = 14;
          if (k == m)
          {
            localItemHolderInfo1 = localInfoRecord.preInfo;
            localItemHolderInfo2 = localInfoRecord.postInfo;
            paramProcessCallback.processAppeared((RecyclerView.ViewHolder)localObject, localItemHolderInfo1, localItemHolderInfo2);
          }
          else
          {
            k = localInfoRecord.flags & 0xC;
            m = 12;
            if (k == m)
            {
              localItemHolderInfo1 = localInfoRecord.preInfo;
              localItemHolderInfo2 = localInfoRecord.postInfo;
              paramProcessCallback.processPersistent((RecyclerView.ViewHolder)localObject, localItemHolderInfo1, localItemHolderInfo2);
            }
            else
            {
              k = localInfoRecord.flags & 0x4;
              if (k != 0)
              {
                localItemHolderInfo1 = localInfoRecord.preInfo;
                m = 0;
                localItemHolderInfo2 = null;
                paramProcessCallback.processDisappeared((RecyclerView.ViewHolder)localObject, localItemHolderInfo1, null);
              }
              else
              {
                k = localInfoRecord.flags & 0x8;
                if (k != 0)
                {
                  localItemHolderInfo1 = localInfoRecord.preInfo;
                  localItemHolderInfo2 = localInfoRecord.postInfo;
                  paramProcessCallback.processAppeared((RecyclerView.ViewHolder)localObject, localItemHolderInfo1, localItemHolderInfo2);
                }
                else
                {
                  i = localInfoRecord.flags & 0x2;
                  if (i == 0) {}
                }
              }
            }
          }
        }
      }
    }
  }
  
  void removeFromDisappearedInLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    ViewInfoStore.InfoRecord localInfoRecord = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.get(paramViewHolder);
    if (localInfoRecord == null) {}
    for (;;)
    {
      return;
      int i = localInfoRecord.flags & 0xFFFFFFFE;
      localInfoRecord.flags = i;
    }
  }
  
  void removeViewHolder(RecyclerView.ViewHolder paramViewHolder)
  {
    Object localObject1 = this.mOldChangedHolders;
    int i = ((f)localObject1).b() + -1;
    for (;;)
    {
      if (i >= 0)
      {
        Object localObject2 = this.mOldChangedHolders.c(i);
        if (paramViewHolder == localObject2)
        {
          localObject2 = this.mOldChangedHolders;
          ((f)localObject2).a(i);
        }
      }
      else
      {
        localObject1 = (ViewInfoStore.InfoRecord)this.mLayoutHolderMap.remove(paramViewHolder);
        if (localObject1 != null) {
          ViewInfoStore.InfoRecord.recycle((ViewInfoStore.InfoRecord)localObject1);
        }
        return;
      }
      i += -1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ViewInfoStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */