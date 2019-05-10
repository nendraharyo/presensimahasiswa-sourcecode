package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzlr
  extends zzj
  implements IBinder.DeathRecipient
{
  private static final zzl zzaaf;
  private CastDevice zzZO;
  private CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzaeL;
  
  static
  {
    zzl localzzl = new com/google/android/gms/cast/internal/zzl;
    localzzl.<init>("CastRemoteDisplayClientImpl");
    zzaaf = localzzl;
  }
  
  public zzlr(Context paramContext, Looper paramLooper, zzf paramzzf, CastDevice paramCastDevice, CastRemoteDisplay.CastRemoteDisplaySessionCallbacks paramCastRemoteDisplaySessionCallbacks, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 83, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject1 = zzaaf;
    localObject2 = new Object[0];
    ((zzl)localObject1).zzb("instance created", (Object[])localObject2);
    this.zzaeL = paramCastRemoteDisplaySessionCallbacks;
    this.zzZO = paramCastDevice;
  }
  
  public void binderDied() {}
  
  /* Error */
  public void disconnect()
  {
    // Byte code:
    //   0: getstatic 22	com/google/android/gms/internal/zzlr:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   3: astore_1
    //   4: ldc 40
    //   6: astore_2
    //   7: iconst_0
    //   8: anewarray 30	java/lang/Object
    //   11: astore_3
    //   12: aload_1
    //   13: aload_2
    //   14: aload_3
    //   15: invokevirtual 34	com/google/android/gms/cast/internal/zzl:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 36	com/google/android/gms/internal/zzlr:zzaeL	Lcom/google/android/gms/cast/CastRemoteDisplay$CastRemoteDisplaySessionCallbacks;
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield 38	com/google/android/gms/internal/zzlr:zzZO	Lcom/google/android/gms/cast/CastDevice;
    //   28: aload_0
    //   29: invokevirtual 44	com/google/android/gms/internal/zzlr:zzqJ	()Landroid/os/IInterface;
    //   32: astore_1
    //   33: aload_1
    //   34: checkcast 46	com/google/android/gms/internal/zzlt
    //   37: astore_1
    //   38: aload_1
    //   39: invokeinterface 49 1 0
    //   44: aload_0
    //   45: invokespecial 50	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   48: return
    //   49: astore_1
    //   50: aload_0
    //   51: invokespecial 50	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   54: goto -6 -> 48
    //   57: astore_1
    //   58: aload_0
    //   59: invokespecial 50	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   62: aload_1
    //   63: athrow
    //   64: astore_1
    //   65: goto -15 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	zzlr
    //   3	36	1	localObject1	Object
    //   49	1	1	localRemoteException	android.os.RemoteException
    //   57	6	1	localObject2	Object
    //   64	1	1	localIllegalStateException	IllegalStateException
    //   6	8	2	str	String
    //   11	4	3	arrayOfObject	Object[]
    // Exception table:
    //   from	to	target	type
    //   28	32	49	android/os/RemoteException
    //   33	37	49	android/os/RemoteException
    //   38	44	49	android/os/RemoteException
    //   28	32	57	finally
    //   33	37	57	finally
    //   38	44	57	finally
    //   28	32	64	java/lang/IllegalStateException
    //   33	37	64	java/lang/IllegalStateException
    //   38	44	64	java/lang/IllegalStateException
  }
  
  public void zza(zzls paramzzls)
  {
    zzl localzzl = zzaaf;
    Object[] arrayOfObject = new Object[0];
    localzzl.zzb("stopRemoteDisplay", arrayOfObject);
    ((zzlt)zzqJ()).zza(paramzzls);
  }
  
  public void zza(zzls paramzzls, int paramInt)
  {
    ((zzlt)zzqJ()).zza(paramzzls, paramInt);
  }
  
  public void zza(zzls paramzzls, zzlu paramzzlu, String paramString)
  {
    Object localObject1 = zzaaf;
    Object localObject2 = new Object[0];
    ((zzl)localObject1).zzb("startRemoteDisplay", (Object[])localObject2);
    zzlr.1 local1 = new com/google/android/gms/internal/zzlr$1;
    local1.<init>(this, paramzzlu);
    localObject1 = (zzlt)zzqJ();
    localObject2 = this.zzZO.getDeviceId();
    ((zzlt)localObject1).zza(paramzzls, local1, (String)localObject2, paramString);
  }
  
  public zzlt zzaG(IBinder paramIBinder)
  {
    return zzlt.zza.zzaI(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.cast.remote_display.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */