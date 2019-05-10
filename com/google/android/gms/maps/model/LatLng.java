package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLng
  implements SafeParcelable
{
  public static final zze CREATOR;
  public final double latitude;
  public final double longitude;
  private final int mVersionCode;
  
  static
  {
    zze localzze = new com/google/android/gms/maps/model/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  public LatLng(double paramDouble1, double paramDouble2)
  {
    this(1, paramDouble1, paramDouble2);
  }
  
  LatLng(int paramInt, double paramDouble1, double paramDouble2)
  {
    this.mVersionCode = paramInt;
    double d3 = -180.0D;
    boolean bool = d3 < paramDouble2;
    if (!bool)
    {
      bool = paramDouble2 < d2;
      if (!bool) {}
    }
    for (this.longitude = paramDouble2;; this.longitude = d3)
    {
      d2 = Math.min(90.0D, paramDouble1);
      d3 = Math.max(-90.0D, d2);
      this.latitude = d3;
      return;
      d3 = ((paramDouble2 - d2) % d1 + d1) % d1 - d2;
    }
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
      boolean bool2 = paramObject instanceof LatLng;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (LatLng)paramObject;
        double d1 = this.latitude;
        long l1 = Double.doubleToLongBits(d1);
        double d2 = ((LatLng)paramObject).latitude;
        long l2 = Double.doubleToLongBits(d2);
        bool2 = l1 < l2;
        if (!bool2)
        {
          d1 = this.longitude;
          l1 = Double.doubleToLongBits(d1);
          d2 = ((LatLng)paramObject).longitude;
          l2 = Double.doubleToLongBits(d2);
          bool2 = l1 < l2;
          if (!bool2) {}
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
    int i = 32;
    long l1 = Double.doubleToLongBits(this.latitude);
    long l2 = l1 >>> i;
    int j = (int)(l1 ^ l2) + 31;
    l2 = Double.doubleToLongBits(this.longitude);
    j *= 31;
    long l3 = l2 >>> i;
    int k = (int)(l2 ^ l3);
    return j + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("lat/lng: (");
    double d = this.latitude;
    localStringBuilder = localStringBuilder.append(d).append(",");
    d = this.longitude;
    return d + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\LatLng.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */