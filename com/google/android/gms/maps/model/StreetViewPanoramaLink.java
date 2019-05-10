package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class StreetViewPanoramaLink
  implements SafeParcelable
{
  public static final zzk CREATOR;
  public final float bearing;
  private final int mVersionCode;
  public final String panoId;
  
  static
  {
    zzk localzzk = new com/google/android/gms/maps/model/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  StreetViewPanoramaLink(int paramInt, String paramString, float paramFloat)
  {
    this.mVersionCode = paramInt;
    this.panoId = paramString;
    double d1 = paramFloat;
    double d2 = 0.0D;
    boolean bool = d1 < d2;
    if (!bool)
    {
      f2 = paramFloat % f1;
      paramFloat = f2 + f1;
    }
    float f2 = paramFloat % f1;
    this.bearing = f2;
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
      boolean bool2 = paramObject instanceof StreetViewPanoramaLink;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (StreetViewPanoramaLink)paramObject;
        String str1 = this.panoId;
        String str2 = ((StreetViewPanoramaLink)paramObject).panoId;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          float f1 = this.bearing;
          int i = Float.floatToIntBits(f1);
          float f2 = ((StreetViewPanoramaLink)paramObject).bearing;
          int j = Float.floatToIntBits(f2);
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
    Object localObject = this.panoId;
    arrayOfObject[0] = localObject;
    localObject = Float.valueOf(this.bearing);
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.panoId;
    localzza = localzza.zzg("panoId", localObject);
    localObject = Float.valueOf(this.bearing);
    return localzza.zzg("bearing", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\StreetViewPanoramaLink.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */