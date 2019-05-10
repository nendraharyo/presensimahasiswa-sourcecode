package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzmq;

public class zza
{
  private static zza zzbhA;
  private static Object zzbhz;
  private volatile boolean mClosed;
  private final Context mContext;
  private final Thread zzLM;
  private volatile AdvertisingIdClient.Info zzPW;
  private volatile long zzbht = 900000L;
  private volatile long zzbhu;
  private volatile long zzbhv;
  private volatile long zzbhw;
  private final Object zzbhx;
  private zza.zza zzbhy;
  private final zzmq zzqW;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzbhz = localObject;
  }
  
  private zza(Context paramContext)
  {
    this(paramContext, null, localzzmq);
  }
  
  public zza(Context paramContext, zza.zza paramzza, zzmq paramzzmq)
  {
    long l = 30000L;
    this.zzbhu = l;
    this.mClosed = false;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzbhx = localObject;
    localObject = new com/google/android/gms/tagmanager/zza$1;
    ((zza.1)localObject).<init>(this);
    this.zzbhy = ((zza.zza)localObject);
    this.zzqW = paramzzmq;
    if (paramContext != null) {
      localObject = paramContext.getApplicationContext();
    }
    for (this.mContext = ((Context)localObject);; this.mContext = paramContext)
    {
      if (paramzza != null) {
        this.zzbhy = paramzza;
      }
      l = this.zzqW.currentTimeMillis();
      this.zzbhv = l;
      localObject = new java/lang/Thread;
      zza.2 local2 = new com/google/android/gms/tagmanager/zza$2;
      local2.<init>(this);
      ((Thread)localObject).<init>(local2);
      this.zzLM = ((Thread)localObject);
      return;
    }
  }
  
  /* Error */
  private void zzFR()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 95	com/google/android/gms/tagmanager/zza:zzFS	()V
    //   6: ldc2_w 96
    //   9: lstore_1
    //   10: aload_0
    //   11: lload_1
    //   12: invokevirtual 103	java/lang/Object:wait	(J)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: astore_3
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_3
    //   22: athrow
    //   23: astore_3
    //   24: goto -9 -> 15
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	zza
    //   9	3	1	l	long
    //   18	4	3	localObject	Object
    //   23	1	3	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   2	6	18	finally
    //   11	15	18	finally
    //   15	17	18	finally
    //   19	21	18	finally
    //   2	6	23	java/lang/InterruptedException
    //   11	15	23	java/lang/InterruptedException
  }
  
  private void zzFS()
  {
    Object localObject1 = this.zzqW;
    long l1 = ((zzmq)localObject1).currentTimeMillis();
    long l2 = this.zzbhv;
    l1 -= l2;
    l2 = this.zzbhu;
    boolean bool = l1 < l2;
    if (bool) {}
    synchronized (this.zzbhx)
    {
      localObject1 = this.zzbhx;
      localObject1.notify();
      localObject1 = this.zzqW;
      l1 = ((zzmq)localObject1).currentTimeMillis();
      this.zzbhv = l1;
      return;
    }
  }
  
  private void zzFT()
  {
    zzmq localzzmq = this.zzqW;
    long l1 = localzzmq.currentTimeMillis();
    long l2 = this.zzbhw;
    l1 -= l2;
    l2 = 3600000L;
    boolean bool = l1 < l2;
    if (bool)
    {
      bool = false;
      localzzmq = null;
      this.zzPW = null;
    }
  }
  
  private void zzFU()
  {
    int i = 10;
    Process.setThreadPriority(i);
    for (;;)
    {
      boolean bool = this.mClosed;
      if (!bool)
      {
        Object localObject1 = this.zzbhy.zzFV();
        if (localObject1 != null)
        {
          this.zzPW = ((AdvertisingIdClient.Info)localObject1);
          long l1 = this.zzqW.currentTimeMillis();
          this.zzbhw = l1;
          localObject1 = "Obtained fresh AdvertisingId info from GmsCore.";
          zzbg.zzaJ((String)localObject1);
        }
        try
        {
          notifyAll();
          try
          {
            synchronized (this.zzbhx)
            {
              localObject1 = this.zzbhx;
              long l2 = this.zzbht;
              localObject1.wait(l2);
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            String str = "sleep interrupted in AdvertiserDataPoller thread; continuing";
            zzbg.zzaJ(str);
          }
          return;
        }
        finally {}
      }
    }
  }
  
  public static zza zzaW(Context paramContext)
  {
    zza localzza = zzbhA;
    if (localzza == null) {}
    synchronized (zzbhz)
    {
      localzza = zzbhA;
      if (localzza == null)
      {
        localzza = new com/google/android/gms/tagmanager/zza;
        localzza.<init>(paramContext);
        zzbhA = localzza;
        localzza = zzbhA;
        localzza.start();
      }
      return zzbhA;
    }
  }
  
  public boolean isLimitAdTrackingEnabled()
  {
    AdvertisingIdClient.Info localInfo = this.zzPW;
    if (localInfo == null)
    {
      zzFR();
      zzFT();
      localInfo = this.zzPW;
      if (localInfo != null) {
        break label37;
      }
    }
    for (boolean bool = true;; bool = localInfo.isLimitAdTrackingEnabled())
    {
      return bool;
      zzFS();
      break;
      label37:
      localInfo = this.zzPW;
    }
  }
  
  public void start()
  {
    this.zzLM.start();
  }
  
  public String zzFQ()
  {
    Object localObject = this.zzPW;
    if (localObject == null)
    {
      zzFR();
      zzFT();
      localObject = this.zzPW;
      if (localObject != null) {
        break label37;
      }
    }
    label37:
    for (localObject = null;; localObject = this.zzPW.getId())
    {
      return (String)localObject;
      zzFS();
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */