package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzji;

public class zzd$zzb
  extends zzd
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private Context mContext;
  private zzji zzHl;
  private final zzc.zza zzHm;
  protected zze zzHp;
  private boolean zzHq;
  private VersionInfoParcel zzpT;
  private final Object zzpV;
  
  public zzd$zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji paramzzji, zzc.zza paramzza)
  {
    super(paramzzji, paramzza);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.mContext = paramContext;
    this.zzpT = paramVersionInfoParcel;
    this.zzHl = paramzzji;
    this.zzHm = paramzza;
    localObject = (Boolean)zzbt.zzwa.get();
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      bool = true;
      this.zzHq = bool;
      localObject = zzr.zzbO();
    }
    for (Looper localLooper = ((zzix)localObject).zzhC();; localLooper = paramContext.getMainLooper())
    {
      localObject = new com/google/android/gms/ads/internal/request/zze;
      int i = this.zzpT.zzNa;
      ((zze)localObject).<init>(paramContext, localLooper, this, this, i);
      this.zzHp = ((zze)localObject);
      connect();
      return;
    }
  }
  
  protected void connect()
  {
    this.zzHp.zzqG();
  }
  
  public void onConnected(Bundle paramBundle)
  {
    zzga();
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzin.zzaI("Cannot connect to remote service, fallback to local instance.");
    zzgt().zzgd();
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putString("action", "gms_connection_failed_fallback_to_local");
    zzir localzzir = zzr.zzbC();
    Context localContext = this.mContext;
    String str = this.zzpT.afmaVersion;
    localzzir.zzb(localContext, str, "gmob-apps", localBundle, true);
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzin.zzaI("Disconnected from remote ad request service.");
  }
  
  public void zzgr()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzHp;
      boolean bool = ((zze)localObject2).isConnected();
      if (!bool)
      {
        localObject2 = this.zzHp;
        bool = ((zze)localObject2).isConnecting();
        if (!bool) {}
      }
      else
      {
        localObject2 = this.zzHp;
        ((zze)localObject2).disconnect();
      }
      Binder.flushPendingCommands();
      bool = this.zzHq;
      if (bool)
      {
        localObject2 = zzr.zzbO();
        ((zzix)localObject2).zzhD();
        bool = false;
        localObject2 = null;
        this.zzHq = false;
      }
      return;
    }
  }
  
  /* Error */
  public zzj zzgs()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 33	com/google/android/gms/ads/internal/request/zzd$zzb:zzpV	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 87	com/google/android/gms/ads/internal/request/zzd$zzb:zzHp	Lcom/google/android/gms/ads/internal/request/zze;
    //   11: astore_2
    //   12: aload_2
    //   13: invokevirtual 170	com/google/android/gms/ads/internal/request/zze:zzgw	()Lcom/google/android/gms/ads/internal/request/zzj;
    //   16: astore_2
    //   17: aload_1
    //   18: monitorexit
    //   19: aload_2
    //   20: areturn
    //   21: astore_2
    //   22: aconst_null
    //   23: astore_2
    //   24: aload_1
    //   25: monitorexit
    //   26: goto -7 -> 19
    //   29: astore_2
    //   30: aload_1
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    //   34: astore_2
    //   35: goto -13 -> 22
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	zzb
    //   11	9	2	localObject2	Object
    //   21	1	2	localIllegalStateException	IllegalStateException
    //   23	1	2	localObject3	Object
    //   29	4	2	localObject4	Object
    //   34	1	2	localDeadObjectException	android.os.DeadObjectException
    // Exception table:
    //   from	to	target	type
    //   7	11	21	java/lang/IllegalStateException
    //   12	16	21	java/lang/IllegalStateException
    //   7	11	29	finally
    //   12	16	29	finally
    //   17	19	29	finally
    //   24	26	29	finally
    //   30	32	29	finally
    //   7	11	34	android/os/DeadObjectException
    //   12	16	34	android/os/DeadObjectException
  }
  
  zzit zzgt()
  {
    zzd.zza localzza = new com/google/android/gms/ads/internal/request/zzd$zza;
    Context localContext = this.mContext;
    zzji localzzji = this.zzHl;
    zzc.zza localzza1 = this.zzHm;
    localzza.<init>(localContext, localzzji, localzza1);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzd$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */