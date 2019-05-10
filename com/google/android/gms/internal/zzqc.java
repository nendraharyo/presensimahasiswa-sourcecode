package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzqc
  extends zzj
{
  public zzqc(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, zzf paramzzf)
  {
    super(paramContext, paramLooper, 69, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  protected zzqh zzdp(IBinder paramIBinder)
  {
    return zzqh.zza.zzdt(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */