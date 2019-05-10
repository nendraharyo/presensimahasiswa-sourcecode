package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;

class zzpa$4
  extends zznz.zzc
{
  zzpa$4(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzph localzzph = new com/google/android/gms/internal/zzph;
    localzzph.<init>(this);
    zzok localzzok = (zzok)paramzznz.zzqJ();
    ClaimBleDeviceRequest localClaimBleDeviceRequest = new com/google/android/gms/fitness/request/ClaimBleDeviceRequest;
    String str = this.zzazQ.getAddress();
    BleDevice localBleDevice = this.zzazQ;
    localClaimBleDeviceRequest.<init>(str, localBleDevice, localzzph);
    localzzok.zza(localClaimBleDeviceRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpa$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */