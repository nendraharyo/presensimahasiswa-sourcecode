package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class zzjf
{
  public static zzjg zza(zzjg paramzzjg, zzjf.zza paramzza)
  {
    zzjd localzzjd = new com/google/android/gms/internal/zzjd;
    localzzjd.<init>();
    zzjf.1 local1 = new com/google/android/gms/internal/zzjf$1;
    local1.<init>(localzzjd, paramzza, paramzzjg);
    paramzzjg.zzb(local1);
    return localzzjd;
  }
  
  public static zzjg zzl(List paramList)
  {
    zzjd localzzjd = new com/google/android/gms/internal/zzjd;
    localzzjd.<init>();
    int i = paramList.size();
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    boolean bool = false;
    zzjg localzzjg = null;
    localAtomicInteger.<init>(0);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localzzjg = (zzjg)localIterator.next();
      zzjf.2 local2 = new com/google/android/gms/internal/zzjf$2;
      local2.<init>(localAtomicInteger, i, localzzjd, paramList);
      localzzjg.zzb(local2);
    }
    return localzzjd;
  }
  
  private static List zzm(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = ((zzjg)localIterator.next()).get();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */