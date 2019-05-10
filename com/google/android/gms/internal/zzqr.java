package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzqr
  extends zzj
{
  public zzqr(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 3, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public zzqp zzdM(IBinder paramIBinder)
  {
    return zzqp.zza.zzdL(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.panorama.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.panorama.internal.IPanoramaService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */