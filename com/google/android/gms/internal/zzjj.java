package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class zzjj
  implements zzji
{
  protected int zzBc;
  protected final BlockingQueue zzNq;
  protected Object zzNr;
  private final Object zzpV;
  
  public zzjj()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzBc = 0;
    localObject = new java/util/concurrent/LinkedBlockingQueue;
    ((LinkedBlockingQueue)localObject).<init>();
    this.zzNq = ((BlockingQueue)localObject);
  }
  
  public int getStatus()
  {
    return this.zzBc;
  }
  
  public void reject()
  {
    synchronized (this.zzpV)
    {
      i = this.zzBc;
      if (i != 0)
      {
        UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
        localUnsupportedOperationException.<init>();
        throw localUnsupportedOperationException;
      }
    }
    int i = -1;
    this.zzBc = i;
    Object localObject3 = this.zzNq;
    Iterator localIterator = ((BlockingQueue)localObject3).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject3 = localIterator.next();
      localObject3 = (zzjj.zza)localObject3;
      localObject3 = ((zzjj.zza)localObject3).zzNt;
      ((zzji.zza)localObject3).run();
    }
    localObject3 = this.zzNq;
    ((BlockingQueue)localObject3).clear();
  }
  
  public void zza(zzji.zzc paramzzc, zzji.zza paramzza)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        i = this.zzBc;
        int j = 1;
        if (i == j)
        {
          Object localObject2 = this.zzNr;
          paramzzc.zze(localObject2);
          return;
        }
        i = this.zzBc;
        j = -1;
        if (i == j) {
          paramzza.run();
        }
      }
      int i = this.zzBc;
      if (i == 0)
      {
        BlockingQueue localBlockingQueue = this.zzNq;
        zzjj.zza localzza = new com/google/android/gms/internal/zzjj$zza;
        localzza.<init>(this, paramzzc, paramzza);
        localBlockingQueue.add(localzza);
      }
    }
  }
  
  public void zzh(Object paramObject)
  {
    synchronized (this.zzpV)
    {
      i = this.zzBc;
      if (i != 0)
      {
        UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
        localUnsupportedOperationException.<init>();
        throw localUnsupportedOperationException;
      }
    }
    this.zzNr = paramObject;
    int i = 1;
    this.zzBc = i;
    Object localObject3 = this.zzNq;
    Iterator localIterator = ((BlockingQueue)localObject3).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject3 = localIterator.next();
      localObject3 = (zzjj.zza)localObject3;
      localObject3 = ((zzjj.zza)localObject3).zzNs;
      ((zzji.zzc)localObject3).zze(paramObject);
    }
    localObject3 = this.zzNq;
    ((BlockingQueue)localObject3).clear();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */