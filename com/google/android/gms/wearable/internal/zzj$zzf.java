package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;

final class zzj$zzf
  extends zzi
{
  private CapabilityApi.CapabilityListener zzbrQ;
  
  private zzj$zzf(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    super(paramGoogleApiClient);
    this.zzbrQ = paramCapabilityListener;
  }
  
  protected void zza(zzbp paramzzbp)
  {
    CapabilityApi.CapabilityListener localCapabilityListener = this.zzbrQ;
    paramzzbp.zza(this, localCapabilityListener);
    this.zzbrQ = null;
  }
  
  public Status zzb(Status paramStatus)
  {
    this.zzbrQ = null;
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */