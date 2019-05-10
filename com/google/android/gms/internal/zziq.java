package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

public final class zziq
{
  private static final ExecutorService zzLU;
  private static final ExecutorService zzLV;
  
  static
  {
    ThreadFactory localThreadFactory = zzaB("Default");
    zzLU = Executors.newFixedThreadPool(10, localThreadFactory);
    localThreadFactory = zzaB("Loader");
    zzLV = Executors.newFixedThreadPool(5, localThreadFactory);
  }
  
  public static zzjg zza(int paramInt, Runnable paramRunnable)
  {
    int i = 1;
    Object localObject2;
    if (paramInt == i)
    {
      localObject1 = zzLV;
      localObject2 = new com/google/android/gms/internal/zziq$1;
      ((zziq.1)localObject2).<init>(paramRunnable);
    }
    for (Object localObject1 = zza((ExecutorService)localObject1, (Callable)localObject2);; localObject1 = zza((ExecutorService)localObject1, (Callable)localObject2))
    {
      return (zzjg)localObject1;
      localObject1 = zzLU;
      localObject2 = new com/google/android/gms/internal/zziq$2;
      ((zziq.2)localObject2).<init>(paramRunnable);
    }
  }
  
  public static zzjg zza(Runnable paramRunnable)
  {
    return zza(0, paramRunnable);
  }
  
  public static zzjg zza(Callable paramCallable)
  {
    return zza(zzLU, paramCallable);
  }
  
  public static zzjg zza(ExecutorService paramExecutorService, Callable paramCallable)
  {
    localzzjd = new com/google/android/gms/internal/zzjd;
    localzzjd.<init>();
    try
    {
      Object localObject1 = new com/google/android/gms/internal/zziq$3;
      ((zziq.3)localObject1).<init>(localzzjd, paramCallable);
      localObject1 = paramExecutorService.submit((Runnable)localObject1);
      localObject2 = new com/google/android/gms/internal/zziq$4;
      ((zziq.4)localObject2).<init>(localzzjd, (Future)localObject1);
      localzzjd.zzc((Runnable)localObject2);
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;)
      {
        Object localObject2 = "Thread execution is rejected.";
        zzin.zzd((String)localObject2, localRejectedExecutionException);
        boolean bool = true;
        localzzjd.cancel(bool);
      }
    }
    return localzzjd;
  }
  
  private static ThreadFactory zzaB(String paramString)
  {
    zziq.5 local5 = new com/google/android/gms/internal/zziq$5;
    local5.<init>(paramString);
    return local5;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */