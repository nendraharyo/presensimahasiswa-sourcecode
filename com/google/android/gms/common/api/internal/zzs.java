package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.zznk;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class zzs
{
  private static final ExecutorService zzaiv;
  
  static
  {
    ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
    localLinkedBlockingQueue.<init>();
    zznk localzznk = new com/google/android/gms/internal/zznk;
    localzznk.<init>("GAC_Transform");
    localThreadPoolExecutor.<init>(0, 4, 60, localTimeUnit, localLinkedBlockingQueue, localzznk);
    zzaiv = localThreadPoolExecutor;
  }
  
  public static ExecutorService zzpN()
  {
    return zzaiv;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */