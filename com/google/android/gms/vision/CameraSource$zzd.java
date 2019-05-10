package com.google.android.gms.vision;

import android.hardware.Camera.ShutterCallback;

class CameraSource$zzd
  implements Camera.ShutterCallback
{
  private CameraSource.ShutterCallback zzbmV;
  
  private CameraSource$zzd(CameraSource paramCameraSource) {}
  
  public void onShutter()
  {
    CameraSource.ShutterCallback localShutterCallback = this.zzbmV;
    if (localShutterCallback != null)
    {
      localShutterCallback = this.zzbmV;
      localShutterCallback.onShutter();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\CameraSource$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */