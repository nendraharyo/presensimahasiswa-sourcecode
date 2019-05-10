package com.google.android.gms.vision.face;

import android.graphics.PointF;
import java.util.Arrays;
import java.util.List;

public class Face
{
  public static final float UNCOMPUTED_PROBABILITY = -1.0F;
  private int mId;
  private float zzaTm;
  private float zzaTn;
  private float zzbnA;
  private float zzbnB;
  private List zzbnC;
  private float zzbnD;
  private float zzbnE;
  private float zzbnF;
  private PointF zzbnz;
  
  public Face(int paramInt, PointF paramPointF, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Landmark[] paramArrayOfLandmark, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    this.mId = paramInt;
    this.zzbnz = paramPointF;
    this.zzaTm = paramFloat1;
    this.zzaTn = paramFloat2;
    this.zzbnA = paramFloat3;
    this.zzbnB = paramFloat4;
    List localList = Arrays.asList(paramArrayOfLandmark);
    this.zzbnC = localList;
    boolean bool = paramFloat5 < 0.0F;
    if (!bool)
    {
      bool = paramFloat5 < f1;
      if (!bool)
      {
        this.zzbnD = paramFloat5;
        bool = paramFloat6 < 0.0F;
        if (bool) {
          break label167;
        }
        bool = paramFloat6 < f1;
        if (bool) {
          break label167;
        }
        this.zzbnE = paramFloat6;
        label116:
        float f3 = this.zzbnF;
        bool = f3 < 0.0F;
        if (bool) {
          break label176;
        }
        f3 = this.zzbnF;
        bool = f3 < f1;
        if (bool) {
          break label176;
        }
      }
    }
    label167:
    label176:
    for (this.zzbnF = paramFloat7;; this.zzbnF = f2)
    {
      return;
      this.zzbnD = f2;
      break;
      this.zzbnE = f2;
      break label116;
    }
  }
  
  public float getEulerY()
  {
    return this.zzbnA;
  }
  
  public float getEulerZ()
  {
    return this.zzbnB;
  }
  
  public float getHeight()
  {
    return this.zzaTn;
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  public float getIsLeftEyeOpenProbability()
  {
    return this.zzbnD;
  }
  
  public float getIsRightEyeOpenProbability()
  {
    return this.zzbnE;
  }
  
  public float getIsSmilingProbability()
  {
    return this.zzbnF;
  }
  
  public List getLandmarks()
  {
    return this.zzbnC;
  }
  
  public PointF getPosition()
  {
    float f1 = 2.0F;
    PointF localPointF = new android/graphics/PointF;
    float f2 = this.zzbnz.x;
    float f3 = this.zzaTm / f1;
    f2 -= f3;
    f3 = this.zzbnz.y;
    float f4 = this.zzaTn / f1;
    f3 -= f4;
    localPointF.<init>(f2, f3);
    return localPointF;
  }
  
  public float getWidth()
  {
    return this.zzaTm;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\Face.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */