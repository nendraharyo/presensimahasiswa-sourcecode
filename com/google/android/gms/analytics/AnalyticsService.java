package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.analytics.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public final class AnalyticsService
  extends Service
{
  private static Boolean zzOO;
  private final Handler mHandler;
  
  public AnalyticsService()
  {
    Handler localHandler = new android/os/Handler;
    localHandler.<init>();
    this.mHandler = localHandler;
  }
  
  public static boolean zzZ(Context paramContext)
  {
    zzx.zzz(paramContext);
    Object localObject = zzOO;
    boolean bool;
    if (localObject != null)
    {
      localObject = zzOO;
      bool = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      return bool;
      localObject = AnalyticsService.class;
      bool = zzam.zza(paramContext, (Class)localObject);
      Boolean localBoolean = Boolean.valueOf(bool);
      zzOO = localBoolean;
    }
  }
  
  /* Error */
  private void zziz()
  {
    // Byte code:
    //   0: getstatic 47	com/google/android/gms/analytics/AnalyticsReceiver:zzqy	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: getstatic 51	com/google/android/gms/analytics/AnalyticsReceiver:zzOM	Lcom/google/android/gms/internal/zzrp;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnull +16 -> 27
    //   14: aload_2
    //   15: invokevirtual 56	com/google/android/gms/internal/zzrp:isHeld	()Z
    //   18: istore_3
    //   19: iload_3
    //   20: ifeq +7 -> 27
    //   23: aload_2
    //   24: invokevirtual 59	com/google/android/gms/internal/zzrp:release	()V
    //   27: aload_1
    //   28: monitorexit
    //   29: return
    //   30: astore_2
    //   31: aload_1
    //   32: monitorexit
    //   33: aload_2
    //   34: athrow
    //   35: astore_2
    //   36: goto -7 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	AnalyticsService
    //   9	15	2	localzzrp	com.google.android.gms.internal.zzrp
    //   30	4	2	localObject2	Object
    //   35	1	2	localSecurityException	SecurityException
    //   18	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	9	30	finally
    //   14	18	30	finally
    //   23	27	30	finally
    //   27	29	30	finally
    //   31	33	30	finally
    //   0	3	35	java/lang/SecurityException
    //   4	6	35	java/lang/SecurityException
    //   33	35	35	java/lang/SecurityException
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    Object localObject = zzf.zzaa(this);
    zzaf localzzaf = ((zzf)localObject).zzjm();
    localObject = ((zzf)localObject).zzjn();
    boolean bool = ((zzr)localObject).zzkr();
    if (bool)
    {
      localObject = "Device AnalyticsService is starting up";
      localzzaf.zzbd((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = "Local AnalyticsService is starting up";
      localzzaf.zzbd((String)localObject);
    }
  }
  
  public void onDestroy()
  {
    Object localObject = zzf.zzaa(this);
    zzaf localzzaf = ((zzf)localObject).zzjm();
    localObject = ((zzf)localObject).zzjn();
    boolean bool = ((zzr)localObject).zzkr();
    if (bool)
    {
      localObject = "Device AnalyticsService is shutting down";
      localzzaf.zzbd((String)localObject);
    }
    for (;;)
    {
      super.onDestroy();
      return;
      localObject = "Local AnalyticsService is shutting down";
      localzzaf.zzbd((String)localObject);
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    int i = 2;
    zziz();
    zzf localzzf = zzf.zzaa(this);
    zzaf localzzaf = localzzf.zzjm();
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = localzzf.zzjn();
    boolean bool1 = ((zzr)localObject2).zzkr();
    Integer localInteger;
    if (bool1)
    {
      localObject2 = "Device AnalyticsService called. startId, action";
      localInteger = Integer.valueOf(paramInt2);
      localzzaf.zza((String)localObject2, localInteger, localObject1);
    }
    for (;;)
    {
      localObject2 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
      boolean bool2 = ((String)localObject2).equals(localObject1);
      if (bool2)
      {
        localObject1 = localzzf.zziH();
        localObject2 = new com/google/android/gms/analytics/AnalyticsService$1;
        ((AnalyticsService.1)localObject2).<init>(this, paramInt2, localzzf, localzzaf);
        ((zzb)localObject1).zza((zzw)localObject2);
      }
      return i;
      localObject2 = "Local AnalyticsService called. startId, action";
      localInteger = Integer.valueOf(paramInt2);
      localzzaf.zza((String)localObject2, localInteger, localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\AnalyticsService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */