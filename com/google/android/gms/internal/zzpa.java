package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;

public class zzpa
  implements BleApi
{
  public PendingResult claimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    zzpa.4 local4 = new com/google/android/gms/internal/zzpa$4;
    local4.<init>(this, paramGoogleApiClient, paramBleDevice);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public PendingResult claimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzpa.3 local3 = new com/google/android/gms/internal/zzpa$3;
    local3.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public PendingResult listClaimedBleDevices(GoogleApiClient paramGoogleApiClient)
  {
    zzpa.6 local6 = new com/google/android/gms/internal/zzpa$6;
    local6.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local6);
  }
  
  public PendingResult startBleScan(GoogleApiClient paramGoogleApiClient, StartBleScanRequest paramStartBleScanRequest)
  {
    zzpa.1 local1 = new com/google/android/gms/internal/zzpa$1;
    local1.<init>(this, paramGoogleApiClient, paramStartBleScanRequest);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult stopBleScan(GoogleApiClient paramGoogleApiClient, BleScanCallback paramBleScanCallback)
  {
    zzpa.2 local2 = new com/google/android/gms/internal/zzpa$2;
    local2.<init>(this, paramGoogleApiClient, paramBleScanCallback);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult unclaimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    String str = paramBleDevice.getAddress();
    return unclaimBleDevice(paramGoogleApiClient, str);
  }
  
  public PendingResult unclaimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzpa.5 local5 = new com/google/android/gms/internal/zzpa$5;
    local5.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local5);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */