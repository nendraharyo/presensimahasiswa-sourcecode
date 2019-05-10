package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class AbstractDataBuffer
  implements DataBuffer
{
  protected final DataHolder zzahi;
  
  protected AbstractDataBuffer(DataHolder paramDataHolder)
  {
    this.zzahi = paramDataHolder;
    DataHolder localDataHolder = this.zzahi;
    if (localDataHolder != null)
    {
      localDataHolder = this.zzahi;
      localDataHolder.zzu(this);
    }
  }
  
  public final void close()
  {
    release();
  }
  
  public abstract Object get(int paramInt);
  
  public int getCount()
  {
    DataHolder localDataHolder = this.zzahi;
    int i;
    if (localDataHolder == null)
    {
      i = 0;
      localDataHolder = null;
    }
    for (;;)
    {
      return i;
      localDataHolder = this.zzahi;
      i = localDataHolder.getCount();
    }
  }
  
  public boolean isClosed()
  {
    DataHolder localDataHolder = this.zzahi;
    boolean bool;
    if (localDataHolder != null)
    {
      localDataHolder = this.zzahi;
      bool = localDataHolder.isClosed();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDataHolder = null;
    }
  }
  
  public Iterator iterator()
  {
    zzb localzzb = new com/google/android/gms/common/data/zzb;
    localzzb.<init>(this);
    return localzzb;
  }
  
  public void release()
  {
    DataHolder localDataHolder = this.zzahi;
    if (localDataHolder != null)
    {
      localDataHolder = this.zzahi;
      localDataHolder.close();
    }
  }
  
  public Iterator singleRefIterator()
  {
    zzg localzzg = new com/google/android/gms/common/data/zzg;
    localzzg.<init>(this);
    return localzzg;
  }
  
  public Bundle zzpZ()
  {
    return this.zzahi.zzpZ();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\AbstractDataBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */