package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class zzpi
  implements BleApi
{
  private static final Status zzaAx;
  
  static
  {
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(5007);
    zzaAx = localStatus;
  }
  
  public PendingResult claimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return PendingResults.zza(zzaAx, paramGoogleApiClient);
  }
  
  public PendingResult claimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return PendingResults.zza(zzaAx, paramGoogleApiClient);
  }
  
  public PendingResult listClaimedBleDevices(GoogleApiClient paramGoogleApiClient)
  {
    return PendingResults.zza(BleDevicesResult.zzQ(zzaAx), paramGoogleApiClient);
  }
  
  public PendingResult startBleScan(GoogleApiClient paramGoogleApiClient, StartBleScanRequest paramStartBleScanRequest)
  {
    return PendingResults.zza(zzaAx, paramGoogleApiClient);
  }
  
  public PendingResult stopBleScan(GoogleApiClient paramGoogleApiClient, BleScanCallback paramBleScanCallback)
  {
    return PendingResults.zza(zzaAx, paramGoogleApiClient);
  }
  
  public PendingResult unclaimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return PendingResults.zza(zzaAx, paramGoogleApiClient);
  }
  
  public PendingResult unclaimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return PendingResults.zza(zzaAx, paramGoogleApiClient);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */