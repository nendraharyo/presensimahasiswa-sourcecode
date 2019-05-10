package com.google.android.gms.vision;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;

class CameraSource$zzc
  implements Camera.PictureCallback
{
  private CameraSource.PictureCallback zzbmU;
  
  private CameraSource$zzc(CameraSource paramCameraSource) {}
  
  public void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    Object localObject1 = this.zzbmU;
    if (localObject1 != null)
    {
      localObject1 = this.zzbmU;
      ((CameraSource.PictureCallback)localObject1).onPictureTaken(paramArrayOfByte);
    }
    localObject1 = this.zzbmP;
    synchronized (CameraSource.zza((CameraSource)localObject1))
    {
      localObject1 = this.zzbmP;
      localObject1 = CameraSource.zzb((CameraSource)localObject1);
      if (localObject1 != null)
      {
        localObject1 = this.zzbmP;
        localObject1 = CameraSource.zzb((CameraSource)localObject1);
        ((Camera)localObject1).startPreview();
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\CameraSource$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */