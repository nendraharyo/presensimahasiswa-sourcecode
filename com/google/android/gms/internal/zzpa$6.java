package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

class zzpa$6
  extends zznz.zza
{
  zzpa$6(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected BleDevicesResult zzI(Status paramStatus)
  {
    return BleDevicesResult.zzQ(paramStatus);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzpa.zza localzza = new com/google/android/gms/internal/zzpa$zza;
    localzza.<init>(this, null);
    zzok localzzok = (zzok)paramzznz.zzqJ();
    ListClaimedBleDevicesRequest localListClaimedBleDevicesRequest = new com/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;
    localListClaimedBleDevicesRequest.<init>(localzza);
    localzzok.zza(localListClaimedBleDevicesRequest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpa$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */