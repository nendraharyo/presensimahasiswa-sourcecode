package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class zzl
{
  private AtomicInteger zzY;
  private final Map zzZ;
  private final Set zzaa;
  private final PriorityBlockingQueue zzab;
  private final PriorityBlockingQueue zzac;
  private zzg[] zzad;
  private zzc zzae;
  private List zzaf;
  private final zzb zzj;
  private final zzn zzk;
  private final zzf zzz;
  
  public zzl(zzb paramzzb, zzf paramzzf)
  {
    this(paramzzb, paramzzf, 4);
  }
  
  public zzl(zzb paramzzb, zzf paramzzf, int paramInt)
  {
    this(paramzzb, paramzzf, paramInt, localzze);
  }
  
  public zzl(zzb paramzzb, zzf paramzzf, int paramInt, zzn paramzzn)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>();
    this.zzY = ((AtomicInteger)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzZ = ((Map)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzaa = ((Set)localObject);
    localObject = new java/util/concurrent/PriorityBlockingQueue;
    ((PriorityBlockingQueue)localObject).<init>();
    this.zzab = ((PriorityBlockingQueue)localObject);
    localObject = new java/util/concurrent/PriorityBlockingQueue;
    ((PriorityBlockingQueue)localObject).<init>();
    this.zzac = ((PriorityBlockingQueue)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzaf = ((List)localObject);
    this.zzj = paramzzb;
    this.zzz = paramzzf;
    localObject = new zzg[paramInt];
    this.zzad = ((zzg[])localObject);
    this.zzk = paramzzn;
  }
  
  public int getSequenceNumber()
  {
    return this.zzY.incrementAndGet();
  }
  
  public void start()
  {
    stop();
    zzc localzzc = new com/google/android/gms/internal/zzc;
    Object localObject1 = this.zzab;
    Object localObject2 = this.zzac;
    Object localObject3 = this.zzj;
    Object localObject4 = this.zzk;
    localzzc.<init>((BlockingQueue)localObject1, (BlockingQueue)localObject2, (zzb)localObject3, (zzn)localObject4);
    this.zzae = localzzc;
    this.zzae.start();
    int i = 0;
    localzzc = null;
    for (;;)
    {
      localObject1 = this.zzad;
      int j = localObject1.length;
      if (i >= j) {
        break;
      }
      localObject1 = new com/google/android/gms/internal/zzg;
      localObject2 = this.zzac;
      localObject3 = this.zzz;
      localObject4 = this.zzj;
      zzn localzzn = this.zzk;
      ((zzg)localObject1).<init>((BlockingQueue)localObject2, (zzf)localObject3, (zzb)localObject4, localzzn);
      localObject2 = this.zzad;
      localObject2[i] = localObject1;
      ((zzg)localObject1).start();
      i += 1;
    }
  }
  
  public void stop()
  {
    zzc localzzc = this.zzae;
    if (localzzc != null)
    {
      localzzc = this.zzae;
      localzzc.quit();
    }
    int i = 0;
    localzzc = null;
    for (;;)
    {
      Object localObject = this.zzad;
      int j = localObject.length;
      if (i >= j) {
        break;
      }
      localObject = this.zzad[i];
      if (localObject != null)
      {
        localObject = this.zzad[i];
        ((zzg)localObject).quit();
      }
      i += 1;
    }
  }
  
  public zzk zze(zzk paramzzk)
  {
    paramzzk.zza(this);
    boolean bool;
    synchronized (this.zzaa)
    {
      Object localObject2 = this.zzaa;
      ((Set)localObject2).add(paramzzk);
      int i = getSequenceNumber();
      paramzzk.zza(i);
      localObject2 = "add-to-queue";
      paramzzk.zzc((String)localObject2);
      bool = paramzzk.zzr();
      if (!bool)
      {
        localObject2 = this.zzac;
        ((PriorityBlockingQueue)localObject2).add(paramzzk);
        return paramzzk;
      }
    }
    for (;;)
    {
      String str;
      synchronized (this.zzZ)
      {
        str = paramzzk.zzh();
        Object localObject4 = this.zzZ;
        bool = ((Map)localObject4).containsKey(str);
        if (bool)
        {
          localObject4 = this.zzZ;
          localObject4 = ((Map)localObject4).get(str);
          localObject4 = (Queue)localObject4;
          if (localObject4 == null)
          {
            localObject4 = new java/util/LinkedList;
            ((LinkedList)localObject4).<init>();
          }
          ((Queue)localObject4).add(paramzzk);
          localObject7 = this.zzZ;
          ((Map)localObject7).put(str, localObject4);
          bool = zzs.DEBUG;
          if (bool)
          {
            localObject4 = "Request for cacheKey=%s is in flight, putting on hold.";
            j = 1;
            localObject7 = new Object[j];
            localObject7[0] = str;
            zzs.zza((String)localObject4, (Object[])localObject7);
          }
        }
      }
      Object localObject6 = this.zzZ;
      int j = 0;
      Object localObject7 = null;
      ((Map)localObject6).put(str, null);
      localObject6 = this.zzab;
      ((PriorityBlockingQueue)localObject6).add(paramzzk);
    }
  }
  
  void zzf(zzk paramzzk)
  {
    Object localObject7;
    synchronized (this.zzaa)
    {
      Object localObject2 = this.zzaa;
      ((Set)localObject2).remove(paramzzk);
      synchronized (this.zzaf)
      {
        localObject2 = this.zzaf;
        localObject7 = ((List)localObject2).iterator();
        bool1 = ((Iterator)localObject7).hasNext();
        if (bool1)
        {
          localObject2 = ((Iterator)localObject7).next();
          localObject2 = (zzl.zza)localObject2;
          ((zzl.zza)localObject2).zzg(paramzzk);
        }
      }
    }
    boolean bool1 = paramzzk.zzr();
    if (bool1) {}
    synchronized (this.zzZ)
    {
      localObject7 = paramzzk.zzh();
      Object localObject5 = this.zzZ;
      localObject5 = ((Map)localObject5).remove(localObject7);
      localObject5 = (Queue)localObject5;
      if (localObject5 != null)
      {
        boolean bool2 = zzs.DEBUG;
        if (bool2)
        {
          String str = "Releasing %d waiting requests for cacheKey=%s.";
          int i = 2;
          Object[] arrayOfObject = new Object[i];
          int j = 0;
          int k = ((Queue)localObject5).size();
          Integer localInteger = Integer.valueOf(k);
          arrayOfObject[0] = localInteger;
          j = 1;
          arrayOfObject[j] = localObject7;
          zzs.zza(str, arrayOfObject);
        }
        localObject7 = this.zzab;
        ((PriorityBlockingQueue)localObject7).addAll((Collection)localObject5);
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */