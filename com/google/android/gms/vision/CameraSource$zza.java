package com.google.android.gms.vision;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

class CameraSource$zza
  implements Camera.PreviewCallback
{
  private CameraSource$zza(CameraSource paramCameraSource) {}
  
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    CameraSource.zzc(this.zzbmP).zza(paramArrayOfByte, paramCamera);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\CameraSource$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */