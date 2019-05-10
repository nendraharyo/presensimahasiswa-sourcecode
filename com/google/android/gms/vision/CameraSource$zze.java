package com.google.android.gms.vision;

import android.hardware.Camera.Size;
import com.google.android.gms.common.images.Size;

class CameraSource$zze
{
  private Size zzbmW;
  private Size zzbmX;
  
  public CameraSource$zze(Camera.Size paramSize1, Camera.Size paramSize2)
  {
    Size localSize = new com/google/android/gms/common/images/Size;
    int i = paramSize1.width;
    int j = paramSize1.height;
    localSize.<init>(i, j);
    this.zzbmW = localSize;
    localSize = new com/google/android/gms/common/images/Size;
    i = paramSize2.width;
    j = paramSize2.height;
    localSize.<init>(i, j);
    this.zzbmX = localSize;
  }
  
  public Size zzIc()
  {
    return this.zzbmW;
  }
  
  public Size zzId()
  {
    return this.zzbmX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\CameraSource$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */