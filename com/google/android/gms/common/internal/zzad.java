package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zzd;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class zzad
  extends zzj
{
  private final Api.zzd zzamx;
  
  public zzad(Context paramContext, Looper paramLooper, int paramInt, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, zzf paramzzf, Api.zzd paramzzd)
  {
    super(paramContext, paramLooper, paramInt, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zzamx = paramzzd;
  }
  
  protected IInterface zzW(IBinder paramIBinder)
  {
    return this.zzamx.zzW(paramIBinder);
  }
  
  protected void zzc(int paramInt, IInterface paramIInterface)
  {
    this.zzamx.zza(paramInt, paramIInterface);
  }
  
  protected String zzgu()
  {
    return this.zzamx.zzgu();
  }
  
  protected String zzgv()
  {
    return this.zzamx.zzgv();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */