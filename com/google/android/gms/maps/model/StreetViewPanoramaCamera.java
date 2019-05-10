package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;

public class StreetViewPanoramaCamera
  implements SafeParcelable
{
  public static final zzj CREATOR;
  public final float bearing;
  private final int mVersionCode;
  public final float tilt;
  public final float zoom;
  private StreetViewPanoramaOrientation zzaTN;
  
  static
  {
    zzj localzzj = new com/google/android/gms/maps/model/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  public StreetViewPanoramaCamera(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(1, paramFloat1, paramFloat2, paramFloat3);
  }
  
  StreetViewPanoramaCamera(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f2 = -90.0F;
    boolean bool = f2 < paramFloat2;
    if (!bool)
    {
      f2 = 90.0F;
      bool = paramFloat2 < f2;
      if (!bool)
      {
        bool = true;
        f2 = Float.MIN_VALUE;
        String str = "Tilt needs to be between -90 and 90 inclusive";
        zzx.zzb(bool, str);
        this.mVersionCode = paramInt;
        double d2 = paramFloat1;
        bool = d2 < d1;
        if (!bool) {
          paramFloat1 = 0.0F;
        }
        this.zoom = paramFloat1;
        f2 = paramFloat2 + 0.0F;
        this.tilt = f2;
        double d3 = paramFloat3;
        bool = d3 < d1;
        if (bool) {
          break label183;
        }
      }
    }
    label183:
    for (f2 = paramFloat3 % f1 + f1;; f2 = paramFloat3)
    {
      f2 %= f1;
      this.bearing = f2;
      Object localObject = new com/google/android/gms/maps/model/StreetViewPanoramaOrientation$Builder;
      ((StreetViewPanoramaOrientation.Builder)localObject).<init>();
      localObject = ((StreetViewPanoramaOrientation.Builder)localObject).tilt(paramFloat2).bearing(paramFloat3).build();
      this.zzaTN = ((StreetViewPanoramaOrientation)localObject);
      return;
      bool = false;
      f2 = 0.0F;
      localObject = null;
      break;
    }
  }
  
  public static StreetViewPanoramaCamera.Builder builder()
  {
    StreetViewPanoramaCamera.Builder localBuilder = new com/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  public static StreetViewPanoramaCamera.Builder builder(StreetViewPanoramaCamera paramStreetViewPanoramaCamera)
  {
    StreetViewPanoramaCamera.Builder localBuilder = new com/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
    localBuilder.<init>(paramStreetViewPanoramaCamera);
    return localBuilder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof StreetViewPanoramaCamera;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (StreetViewPanoramaCamera)paramObject;
        float f1 = this.zoom;
        int i = Float.floatToIntBits(f1);
        float f2 = ((StreetViewPanoramaCamera)paramObject).zoom;
        int j = Float.floatToIntBits(f2);
        if (i == j)
        {
          f1 = this.tilt;
          i = Float.floatToIntBits(f1);
          f2 = ((StreetViewPanoramaCamera)paramObject).tilt;
          j = Float.floatToIntBits(f2);
          if (i == j)
          {
            f1 = this.bearing;
            i = Float.floatToIntBits(f1);
            f2 = ((StreetViewPanoramaCamera)paramObject).bearing;
            j = Float.floatToIntBits(f2);
            if (i == j) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public StreetViewPanoramaOrientation getOrientation()
  {
    return this.zzaTN;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Float localFloat = Float.valueOf(this.zoom);
    arrayOfObject[0] = localFloat;
    localFloat = Float.valueOf(this.tilt);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(this.bearing);
    arrayOfObject[2] = localFloat;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Float localFloat = Float.valueOf(this.zoom);
    localzza = localzza.zzg("zoom", localFloat);
    localFloat = Float.valueOf(this.tilt);
    localzza = localzza.zzg("tilt", localFloat);
    localFloat = Float.valueOf(this.bearing);
    return localzza.zzg("bearing", localFloat).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\StreetViewPanoramaCamera.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */