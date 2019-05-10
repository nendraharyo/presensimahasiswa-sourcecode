package com.google.android.gms.vision.face;

import android.content.Context;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import com.google.android.gms.vision.face.internal.client.zzg;

public class FaceDetector$Builder
{
  private final Context mContext;
  private int zzaoy = 0;
  private int zzbnJ = 0;
  private boolean zzbnK = false;
  private int zzbnL = 0;
  private boolean zzbnM = true;
  private float zzbnN = -1.0F;
  
  public FaceDetector$Builder(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public FaceDetector build()
  {
    Object localObject = new com/google/android/gms/vision/face/internal/client/FaceSettingsParcel;
    ((FaceSettingsParcel)localObject).<init>();
    int i = this.zzaoy;
    ((FaceSettingsParcel)localObject).mode = i;
    i = this.zzbnJ;
    ((FaceSettingsParcel)localObject).zzbnV = i;
    i = this.zzbnL;
    ((FaceSettingsParcel)localObject).zzbnW = i;
    boolean bool = this.zzbnK;
    ((FaceSettingsParcel)localObject).zzbnX = bool;
    bool = this.zzbnM;
    ((FaceSettingsParcel)localObject).zzbnY = bool;
    float f = this.zzbnN;
    ((FaceSettingsParcel)localObject).zzbnZ = f;
    zzg localzzg = new com/google/android/gms/vision/face/internal/client/zzg;
    Context localContext = this.mContext;
    localzzg.<init>(localContext, (FaceSettingsParcel)localObject);
    localObject = new com/google/android/gms/vision/face/FaceDetector;
    ((FaceDetector)localObject).<init>(localzzg, null);
    return (FaceDetector)localObject;
  }
  
  public Builder setClassificationType(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = "Invalid classification type: " + paramInt;
        localIllegalArgumentException.<init>((String)localObject);
        throw localIllegalArgumentException;
      }
    }
    this.zzbnL = paramInt;
    return this;
  }
  
  public Builder setLandmarkType(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = "Invalid landmark type: " + paramInt;
        localIllegalArgumentException.<init>((String)localObject);
        throw localIllegalArgumentException;
      }
    }
    this.zzbnJ = paramInt;
    return this;
  }
  
  public Builder setMinFaceSize(float paramFloat)
  {
    float f = 0.0F;
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      f = 1.0F;
      bool = paramFloat < f;
      if (!bool) {}
    }
    else
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid proportional face size: " + paramFloat;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.zzbnN = paramFloat;
    return this;
  }
  
  public Builder setMode(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid mode: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.zzaoy = paramInt;
    return this;
  }
  
  public Builder setProminentFaceOnly(boolean paramBoolean)
  {
    this.zzbnK = paramBoolean;
    return this;
  }
  
  public Builder setTrackingEnabled(boolean paramBoolean)
  {
    this.zzbnM = paramBoolean;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\FaceDetector$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */