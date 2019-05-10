package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;

public class StreetViewPanoramaOrientation
  implements SafeParcelable
{
  public static final zzm CREATOR;
  public final float bearing;
  private final int mVersionCode;
  public final float tilt;
  
  static
  {
    zzm localzzm = new com/google/android/gms/maps/model/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  public StreetViewPanoramaOrientation(float paramFloat1, float paramFloat2)
  {
    this(1, paramFloat1, paramFloat2);
  }
  
  StreetViewPanoramaOrientation(int paramInt, float paramFloat1, float paramFloat2)
  {
    float f2 = -90.0F;
    boolean bool = f2 < paramFloat1;
    if (!bool)
    {
      f2 = 90.0F;
      bool = paramFloat1 < f2;
      if (!bool) {
        bool = true;
      }
    }
    for (f2 = Float.MIN_VALUE;; f2 = 0.0F)
    {
      String str = "Tilt needs to be between -90 and 90 inclusive";
      zzx.zzb(bool, str);
      this.mVersionCode = paramInt;
      f2 = 0.0F + paramFloat1;
      this.tilt = f2;
      double d1 = paramFloat2;
      double d2 = 0.0D;
      bool = d1 < d2;
      if (!bool)
      {
        f2 = paramFloat2 % f1;
        paramFloat2 = f2 + f1;
      }
      f2 = paramFloat2 % f1;
      this.bearing = f2;
      return;
      bool = false;
    }
  }
  
  public static StreetViewPanoramaOrientation.Builder builder()
  {
    StreetViewPanoramaOrientation.Builder localBuilder = new com/google/android/gms/maps/model/StreetViewPanoramaOrientation$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  public static StreetViewPanoramaOrientation.Builder builder(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
  {
    StreetViewPanoramaOrientation.Builder localBuilder = new com/google/android/gms/maps/model/StreetViewPanoramaOrientation$Builder;
    localBuilder.<init>(paramStreetViewPanoramaOrientation);
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
      boolean bool2 = paramObject instanceof StreetViewPanoramaOrientation;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (StreetViewPanoramaOrientation)paramObject;
        float f1 = this.tilt;
        int i = Float.floatToIntBits(f1);
        float f2 = ((StreetViewPanoramaOrientation)paramObject).tilt;
        int j = Float.floatToIntBits(f2);
        if (i == j)
        {
          f1 = this.bearing;
          i = Float.floatToIntBits(f1);
          f2 = ((StreetViewPanoramaOrientation)paramObject).bearing;
          j = Float.floatToIntBits(f2);
          if (i == j) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Float localFloat = Float.valueOf(this.tilt);
    arrayOfObject[0] = localFloat;
    localFloat = Float.valueOf(this.bearing);
    arrayOfObject[1] = localFloat;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Float localFloat = Float.valueOf(this.tilt);
    localzza = localzza.zzg("tilt", localFloat);
    localFloat = Float.valueOf(this.bearing);
    return localzza.zzg("bearing", localFloat).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\StreetViewPanoramaOrientation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */