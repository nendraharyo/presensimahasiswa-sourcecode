package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.zzg;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;

public class zzo
  extends zzj
{
  private final zzg zzXK;
  
  public zzo(Context paramContext, Looper paramLooper, zzf paramzzf, zzg paramzzg, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 87, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject = (zzg)zzx.zzz(paramzzg);
    this.zzXK = ((zzg)localObject);
  }
  
  protected zzh zzaB(IBinder paramIBinder)
  {
    return zzh.zza.zzaD(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */