package com.google.android.gms.common.data;

import java.util.HashSet;
import java.util.Iterator;

public final class DataBufferObserverSet
  implements DataBufferObserver, DataBufferObserver.Observable
{
  private HashSet zzajd;
  
  public DataBufferObserverSet()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzajd = localHashSet;
  }
  
  public void addObserver(DataBufferObserver paramDataBufferObserver)
  {
    this.zzajd.add(paramDataBufferObserver);
  }
  
  public void clear()
  {
    this.zzajd.clear();
  }
  
  public boolean hasObservers()
  {
    HashSet localHashSet = this.zzajd;
    boolean bool = localHashSet.isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localHashSet = null;
    }
  }
  
  public void onDataChanged()
  {
    Object localObject = this.zzajd;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataBufferObserver)localIterator.next();
      ((DataBufferObserver)localObject).onDataChanged();
    }
  }
  
  public void onDataRangeChanged(int paramInt1, int paramInt2)
  {
    Object localObject = this.zzajd;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataBufferObserver)localIterator.next();
      ((DataBufferObserver)localObject).onDataRangeChanged(paramInt1, paramInt2);
    }
  }
  
  public void onDataRangeInserted(int paramInt1, int paramInt2)
  {
    Object localObject = this.zzajd;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataBufferObserver)localIterator.next();
      ((DataBufferObserver)localObject).onDataRangeInserted(paramInt1, paramInt2);
    }
  }
  
  public void onDataRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = this.zzajd;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataBufferObserver)localIterator.next();
      ((DataBufferObserver)localObject).onDataRangeMoved(paramInt1, paramInt2, paramInt3);
    }
  }
  
  public void onDataRangeRemoved(int paramInt1, int paramInt2)
  {
    Object localObject = this.zzajd;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataBufferObserver)localIterator.next();
      ((DataBufferObserver)localObject).onDataRangeRemoved(paramInt1, paramInt2);
    }
  }
  
  public void removeObserver(DataBufferObserver paramDataBufferObserver)
  {
    this.zzajd.remove(paramDataBufferObserver);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\DataBufferObserverSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */