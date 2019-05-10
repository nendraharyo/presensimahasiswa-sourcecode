package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zza$zza
  extends zzb
  implements zza.zzb, zzj.zze
{
  private final Api.zzc zzaeE;
  private AtomicReference zzagH;
  
  protected zza$zza(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super((GoogleApiClient)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    this.zzagH = ((AtomicReference)localObject);
    localObject = (Api.zzc)zzx.zzz(paramzzc);
    this.zzaeE = ((Api.zzc)localObject);
  }
  
  private void zza(RemoteException paramRemoteException)
  {
    Status localStatus = new com/google/android/gms/common/api/Status;
    String str = paramRemoteException.getLocalizedMessage();
    localStatus.<init>(8, str, null);
    zzw(localStatus);
  }
  
  protected abstract void zza(Api.zzb paramzzb);
  
  public void zza(zzj.zzd paramzzd)
  {
    this.zzagH.set(paramzzd);
  }
  
  public final void zzb(Api.zzb paramzzb)
  {
    try
    {
      zza(paramzzb);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      zza(localDeadObjectException);
      throw localDeadObjectException;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zza(localRemoteException);
      }
    }
  }
  
  public final Api.zzc zzoR()
  {
    return this.zzaeE;
  }
  
  public void zzpe()
  {
    setResultCallback(null);
  }
  
  protected void zzpf()
  {
    zzj.zzd localzzd = (zzj.zzd)this.zzagH.getAndSet(null);
    if (localzzd != null) {
      localzzd.zzc(this);
    }
  }
  
  public final void zzw(Status paramStatus)
  {
    boolean bool = paramStatus.isSuccess();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "Failed result must not be success");
      Result localResult = zzc(paramStatus);
      zza(localResult);
      return;
      bool = false;
      localResult = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */