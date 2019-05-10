package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class zzjh
{
  private final Object zzNm;
  private final List zzNn;
  private final List zzNo;
  private boolean zzNp;
  
  public zzjh()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzNm = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzNn = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzNo = ((List)localObject);
    this.zzNp = false;
  }
  
  private void zzd(Runnable paramRunnable)
  {
    zziq.zza(paramRunnable);
  }
  
  private void zze(Runnable paramRunnable)
  {
    zza.zzMS.post(paramRunnable);
  }
  
  public void zzb(Runnable paramRunnable)
  {
    synchronized (this.zzNm)
    {
      boolean bool = this.zzNp;
      if (bool)
      {
        zzd(paramRunnable);
        return;
      }
      List localList = this.zzNn;
      localList.add(paramRunnable);
    }
  }
  
  public void zzc(Runnable paramRunnable)
  {
    synchronized (this.zzNm)
    {
      boolean bool = this.zzNp;
      if (bool)
      {
        zze(paramRunnable);
        return;
      }
      List localList = this.zzNo;
      localList.add(paramRunnable);
    }
  }
  
  public void zzhK()
  {
    for (;;)
    {
      synchronized (this.zzNm)
      {
        bool = this.zzNp;
        if (bool) {
          return;
        }
        Object localObject2 = this.zzNn;
        localIterator = ((List)localObject2).iterator();
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject2 = localIterator.next();
          localObject2 = (Runnable)localObject2;
          zzd((Runnable)localObject2);
        }
      }
      Object localObject4 = this.zzNo;
      Iterator localIterator = ((List)localObject4).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject4 = localIterator.next();
        localObject4 = (Runnable)localObject4;
        zze((Runnable)localObject4);
      }
      localObject4 = this.zzNn;
      ((List)localObject4).clear();
      localObject4 = this.zzNo;
      ((List)localObject4).clear();
      boolean bool = true;
      this.zzNp = bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */