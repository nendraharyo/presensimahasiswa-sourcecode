package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

public abstract interface zzok
  extends IInterface
{
  public abstract void zza(ClaimBleDeviceRequest paramClaimBleDeviceRequest);
  
  public abstract void zza(ListClaimedBleDevicesRequest paramListClaimedBleDevicesRequest);
  
  public abstract void zza(StartBleScanRequest paramStartBleScanRequest);
  
  public abstract void zza(StopBleScanRequest paramStopBleScanRequest);
  
  public abstract void zza(UnclaimBleDeviceRequest paramUnclaimBleDeviceRequest);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzok.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */