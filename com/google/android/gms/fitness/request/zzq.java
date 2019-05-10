package com.google.android.gms.fitness.request;

import android.os.IInterface;
import com.google.android.gms.fitness.data.BleDevice;

public abstract interface zzq
  extends IInterface
{
  public abstract void onDeviceFound(BleDevice paramBleDevice);
  
  public abstract void onScanStopped();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */