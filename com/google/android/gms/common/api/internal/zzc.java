package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzx;

public class zzc
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  public final Api zzagT;
  private final int zzagU;
  private zzl zzagV;
  
  public zzc(Api paramApi, int paramInt)
  {
    this.zzagT = paramApi;
    this.zzagU = paramInt;
  }
  
  private void zzpi()
  {
    zzx.zzb(this.zzagV, "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
  }
  
  public void onConnected(Bundle paramBundle)
  {
    zzpi();
    this.zzagV.onConnected(paramBundle);
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzpi();
    zzl localzzl = this.zzagV;
    Api localApi = this.zzagT;
    int i = this.zzagU;
    localzzl.zza(paramConnectionResult, localApi, i);
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzpi();
    this.zzagV.onConnectionSuspended(paramInt);
  }
  
  public void zza(zzl paramzzl)
  {
    this.zzagV = paramzzl;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */