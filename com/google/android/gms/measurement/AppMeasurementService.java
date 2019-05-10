package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzp.zza;
import com.google.android.gms.measurement.internal.zzv;
import com.google.android.gms.measurement.internal.zzw;

public final class AppMeasurementService
  extends Service
{
  private static Boolean zzOO;
  private final Handler mHandler;
  
  public AppMeasurementService()
  {
    Handler localHandler = new android/os/Handler;
    localHandler.<init>();
    this.mHandler = localHandler;
  }
  
  private zzp zzAo()
  {
    return zzw.zzaT(this).zzAo();
  }
  
  public static boolean zzZ(Context paramContext)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramContext);
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
      localObject = AppMeasurementService.class;
      bool = zzaj.zza(paramContext, (Class)localObject);
      Boolean localBoolean = Boolean.valueOf(bool);
      zzOO = localBoolean;
    }
  }
  
  /* Error */
  private void zziz()
  {
    // Byte code:
    //   0: getstatic 57	com/google/android/gms/measurement/AppMeasurementReceiver:zzqy	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: getstatic 61	com/google/android/gms/measurement/AppMeasurementReceiver:zzOM	Lcom/google/android/gms/internal/zzrp;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnull +16 -> 27
    //   14: aload_2
    //   15: invokevirtual 66	com/google/android/gms/internal/zzrp:isHeld	()Z
    //   18: istore_3
    //   19: iload_3
    //   20: ifeq +7 -> 27
    //   23: aload_2
    //   24: invokevirtual 69	com/google/android/gms/internal/zzrp:release	()V
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
    //   0	39	0	this	AppMeasurementService
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
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    if (paramIntent == null)
    {
      localObject2 = zzAo().zzCE();
      localObject3 = "onBind called with null intent";
      ((zzp.zza)localObject2).zzfg((String)localObject3);
    }
    for (;;)
    {
      return (IBinder)localObject1;
      localObject2 = paramIntent.getAction();
      localObject3 = "com.google.android.gms.measurement.START";
      boolean bool = ((String)localObject3).equals(localObject2);
      if (bool)
      {
        localObject1 = new com/google/android/gms/measurement/internal/zzx;
        localObject2 = zzw.zzaT(this);
        ((com.google.android.gms.measurement.internal.zzx)localObject1).<init>((zzw)localObject2);
      }
      else
      {
        localObject3 = zzAo().zzCF();
        String str = "onBind received unknown action";
        ((zzp.zza)localObject3).zzj(str, localObject2);
      }
    }
  }
  
  public void onCreate()
  {
    super.onCreate();
    Object localObject1 = zzw.zzaT(this);
    Object localObject2 = ((zzw)localObject1).zzAo();
    localObject1 = ((zzw)localObject1).zzCp();
    boolean bool = ((zzd)localObject1).zzkr();
    if (bool)
    {
      localObject1 = ((zzp)localObject2).zzCK();
      localObject2 = "Device AppMeasurementService is starting up";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = ((zzp)localObject2).zzCK();
      localObject2 = "Local AppMeasurementService is starting up";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
  }
  
  public void onDestroy()
  {
    Object localObject1 = zzw.zzaT(this);
    Object localObject2 = ((zzw)localObject1).zzAo();
    localObject1 = ((zzw)localObject1).zzCp();
    boolean bool = ((zzd)localObject1).zzkr();
    if (bool)
    {
      localObject1 = ((zzp)localObject2).zzCK();
      localObject2 = "Device AppMeasurementService is shutting down";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      super.onDestroy();
      return;
      localObject1 = ((zzp)localObject2).zzCK();
      localObject2 = "Local AppMeasurementService is shutting down";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
  }
  
  public void onRebind(Intent paramIntent)
  {
    Object localObject1;
    Object localObject2;
    if (paramIntent == null)
    {
      localObject1 = zzAo().zzCE();
      localObject2 = "onRebind called with null intent";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = paramIntent.getAction();
      localObject2 = zzAo().zzCK();
      String str = "onRebind called. action";
      ((zzp.zza)localObject2).zzj(str, localObject1);
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    int i = 2;
    zziz();
    zzw localzzw = zzw.zzaT(this);
    zzp localzzp = localzzw.zzAo();
    Object localObject1 = paramIntent.getAction();
    Object localObject2 = localzzw.zzCp();
    boolean bool1 = ((zzd)localObject2).zzkr();
    String str;
    Integer localInteger;
    if (bool1)
    {
      localObject2 = localzzp.zzCK();
      str = "Device AppMeasurementService called. startId, action";
      localInteger = Integer.valueOf(paramInt2);
      ((zzp.zza)localObject2).zze(str, localInteger, localObject1);
    }
    for (;;)
    {
      localObject2 = "com.google.android.gms.measurement.UPLOAD";
      boolean bool2 = ((String)localObject2).equals(localObject1);
      if (bool2)
      {
        localObject1 = localzzw.zzCn();
        localObject2 = new com/google/android/gms/measurement/AppMeasurementService$1;
        ((AppMeasurementService.1)localObject2).<init>(this, localzzw, paramInt2, localzzp);
        ((zzv)localObject1).zzg((Runnable)localObject2);
      }
      return i;
      localObject2 = localzzp.zzCK();
      str = "Local AppMeasurementService called. startId, action";
      localInteger = Integer.valueOf(paramInt2);
      ((zzp.zza)localObject2).zze(str, localInteger, localObject1);
    }
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    boolean bool = true;
    Object localObject1;
    Object localObject2;
    if (paramIntent == null)
    {
      localObject1 = zzAo().zzCE();
      localObject2 = "onUnbind called with null intent";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      return bool;
      localObject1 = paramIntent.getAction();
      localObject2 = zzAo().zzCK();
      String str = "onUnbind called for intent. action";
      ((zzp.zza)localObject2).zzj(str, localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\AppMeasurementService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */