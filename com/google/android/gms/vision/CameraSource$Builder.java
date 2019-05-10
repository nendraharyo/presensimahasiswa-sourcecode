package com.google.android.gms.vision;

import android.content.Context;

public class CameraSource$Builder
{
  private final Detector zzbmN;
  private CameraSource zzbmO;
  
  public CameraSource$Builder(Context paramContext, Detector paramDetector)
  {
    Object localObject = new com/google/android/gms/vision/CameraSource;
    ((CameraSource)localObject).<init>(null);
    this.zzbmO = ((CameraSource)localObject);
    if (paramContext == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("No context supplied.");
      throw ((Throwable)localObject);
    }
    if (paramDetector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("No detector supplied.");
      throw ((Throwable)localObject);
    }
    this.zzbmN = paramDetector;
    CameraSource.zza(this.zzbmO, paramContext);
  }
  
  public CameraSource build()
  {
    CameraSource localCameraSource1 = this.zzbmO;
    CameraSource.zzb localzzb = new com/google/android/gms/vision/CameraSource$zzb;
    CameraSource localCameraSource2 = this.zzbmO;
    localCameraSource2.getClass();
    Detector localDetector = this.zzbmN;
    localzzb.<init>(localCameraSource2, localDetector);
    CameraSource.zza(localCameraSource1, localzzb);
    return this.zzbmO;
  }
  
  public Builder setAutoFocusEnabled(boolean paramBoolean)
  {
    CameraSource.zza(this.zzbmO, paramBoolean);
    return this;
  }
  
  public Builder setFacing(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = "Invalid camera: " + paramInt;
        localIllegalArgumentException.<init>((String)localObject);
        throw localIllegalArgumentException;
      }
    }
    CameraSource.zzc(this.zzbmO, paramInt);
    return this;
  }
  
  public Builder setRequestedFps(float paramFloat)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid fps: " + paramFloat;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    CameraSource.zza(this.zzbmO, paramFloat);
    return this;
  }
  
  public Builder setRequestedPreviewSize(int paramInt1, int paramInt2)
  {
    int i = 1000000;
    if ((paramInt1 <= 0) || (paramInt1 > i) || (paramInt2 <= 0) || (paramInt2 > i))
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid preview size: " + paramInt1 + "x" + paramInt2;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    CameraSource.zza(this.zzbmO, paramInt1);
    CameraSource.zzb(this.zzbmO, paramInt2);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\CameraSource$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */