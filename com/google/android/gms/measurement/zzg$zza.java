package com.google.android.gms.measurement;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class zzg$zza
  extends ThreadPoolExecutor
{
  public zzg$zza(zzg paramzzg)
  {
    super(i, i, 0L, localTimeUnit, localLinkedBlockingQueue);
    zzg.zzb localzzb = new com/google/android/gms/measurement/zzg$zzb;
    localzzb.<init>(null);
    setThreadFactory(localzzb);
  }
  
  protected RunnableFuture newTaskFor(Runnable paramRunnable, Object paramObject)
  {
    zzg.zza.1 local1 = new com/google/android/gms/measurement/zzg$zza$1;
    local1.<init>(this, paramRunnable, paramObject);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzg$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */