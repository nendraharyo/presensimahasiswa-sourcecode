package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.BleDevice;

public class zza
  extends zzq.zza
{
  private final BleScanCallback zzaAy;
  
  private zza(BleScanCallback paramBleScanCallback)
  {
    BleScanCallback localBleScanCallback = (BleScanCallback)zzx.zzz(paramBleScanCallback);
    this.zzaAy = localBleScanCallback;
  }
  
  public void onDeviceFound(BleDevice paramBleDevice)
  {
    this.zzaAy.onDeviceFound(paramBleDevice);
  }
  
  public void onScanStopped()
  {
    this.zzaAy.onScanStopped();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */