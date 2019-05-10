package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

class zzpa$5
  extends zznz.zzc
{
  zzpa$5(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzok localzzok = (zzok)paramzznz.zzqJ();
    UnclaimBleDeviceRequest localUnclaimBleDeviceRequest = new com/google/android/gms/fitness/request/UnclaimBleDeviceRequest;
    String str = this.zzazP;
    localUnclaimBleDeviceRequest.<init>(str, localzzph);
    localzzok.zza(localUnclaimBleDeviceRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpa$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */