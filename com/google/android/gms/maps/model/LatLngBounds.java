package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;

public final class LatLngBounds
  implements SafeParcelable
{
  public static final zzd CREATOR;
  private final int mVersionCode;
  public final LatLng northeast;
  public final LatLng southwest;
  
  static
  {
    zzd localzzd = new com/google/android/gms/maps/model/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    zzx.zzb(paramLatLng1, "null southwest");
    String str = "null northeast";
    zzx.zzb(paramLatLng2, str);
    double d1 = paramLatLng2.latitude;
    double d2 = paramLatLng1.latitude;
    boolean bool2 = d1 < d2;
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[2];
      Double localDouble2 = Double.valueOf(paramLatLng1.latitude);
      arrayOfObject[0] = localDouble2;
      localDouble1 = Double.valueOf(paramLatLng2.latitude);
      arrayOfObject[bool1] = localDouble1;
      zzx.zzb(bool2, "southern latitude exceeds northern latitude (%s > %s)", arrayOfObject);
      this.mVersionCode = paramInt;
      this.southwest = paramLatLng1;
      this.northeast = paramLatLng2;
      return;
      bool2 = false;
      str = null;
    }
  }
  
  public LatLngBounds(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    this(1, paramLatLng1, paramLatLng2);
  }
  
  public static LatLngBounds.Builder builder()
  {
    LatLngBounds.Builder localBuilder = new com/google/android/gms/maps/model/LatLngBounds$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  private static double zzb(double paramDouble1, double paramDouble2)
  {
    double d = 360.0D;
    return (paramDouble1 - paramDouble2 + d) % d;
  }
  
  private static double zzc(double paramDouble1, double paramDouble2)
  {
    double d = 360.0D;
    return (paramDouble2 - paramDouble1 + d) % d;
  }
  
  private boolean zzi(double paramDouble)
  {
    LatLng localLatLng = this.southwest;
    double d = localLatLng.latitude;
    boolean bool = d < paramDouble;
    if (!bool)
    {
      localLatLng = this.northeast;
      d = localLatLng.latitude;
      bool = paramDouble < d;
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLatLng = null;
    }
  }
  
  private boolean zzj(double paramDouble)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    LatLng localLatLng1 = this.southwest;
    double d1 = localLatLng1.longitude;
    LatLng localLatLng2 = this.northeast;
    double d2 = localLatLng2.longitude;
    boolean bool3 = d1 < d2;
    if (!bool3)
    {
      localLatLng1 = this.southwest;
      d1 = localLatLng1.longitude;
      bool3 = d1 < paramDouble;
      if (!bool3)
      {
        localLatLng1 = this.northeast;
        d1 = localLatLng1.longitude;
        bool3 = paramDouble < d1;
        if (bool3) {}
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      f1 = 0.0F;
      continue;
      localLatLng1 = this.southwest;
      d1 = localLatLng1.longitude;
      bool3 = d1 < paramDouble;
      if (bool3)
      {
        localLatLng1 = this.northeast;
        d1 = localLatLng1.longitude;
        bool3 = paramDouble < d1;
        if (bool3) {}
      }
      else
      {
        bool2 = bool1;
        f2 = f1;
      }
      bool1 = bool2;
      f1 = f2;
    }
  }
  
  public boolean contains(LatLng paramLatLng)
  {
    double d = paramLatLng.latitude;
    boolean bool = zzi(d);
    if (bool)
    {
      d = paramLatLng.longitude;
      bool = zzj(d);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
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
      boolean bool2 = paramObject instanceof LatLngBounds;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (LatLngBounds)paramObject;
        LatLng localLatLng1 = this.southwest;
        LatLng localLatLng2 = ((LatLngBounds)paramObject).southwest;
        bool2 = localLatLng1.equals(localLatLng2);
        if (bool2)
        {
          localLatLng1 = this.northeast;
          localLatLng2 = ((LatLngBounds)paramObject).northeast;
          bool2 = localLatLng1.equals(localLatLng2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public LatLng getCenter()
  {
    double d1 = 2.0D;
    double d2 = this.southwest.latitude;
    LatLng localLatLng1 = this.northeast;
    double d3 = localLatLng1.latitude;
    d3 = (d2 + d3) / d1;
    LatLng localLatLng2 = this.northeast;
    d2 = localLatLng2.longitude;
    LatLng localLatLng3 = this.southwest;
    double d4 = localLatLng3.longitude;
    boolean bool = d4 < d2;
    if (!bool) {}
    double d5;
    for (d2 = (d2 + d4) / d1;; d2 = (d2 + d5 + d4) / d1)
    {
      localLatLng3 = new com/google/android/gms/maps/model/LatLng;
      localLatLng3.<init>(d3, d2);
      return localLatLng3;
      d5 = 360.0D;
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    LatLng localLatLng = this.southwest;
    arrayOfObject[0] = localLatLng;
    localLatLng = this.northeast;
    arrayOfObject[1] = localLatLng;
    return zzw.hashCode(arrayOfObject);
  }
  
  public LatLngBounds including(LatLng paramLatLng)
  {
    double d1 = this.southwest.latitude;
    double d2 = paramLatLng.latitude;
    double d3 = Math.min(d1, d2);
    d1 = this.northeast.latitude;
    d2 = paramLatLng.latitude;
    double d4 = Math.max(d1, d2);
    double d5 = this.northeast.longitude;
    LatLng localLatLng1 = this.southwest;
    d2 = localLatLng1.longitude;
    d1 = paramLatLng.longitude;
    boolean bool = zzj(d1);
    if (!bool)
    {
      double d6 = zzb(d2, d1);
      double d7 = zzc(d5, d1);
      bool = d6 < d7;
      if (bool) {
        d2 = d5;
      }
    }
    for (;;)
    {
      LatLngBounds localLatLngBounds = new com/google/android/gms/maps/model/LatLngBounds;
      LatLng localLatLng2 = new com/google/android/gms/maps/model/LatLng;
      localLatLng2.<init>(d3, d1);
      localLatLng1 = new com/google/android/gms/maps/model/LatLng;
      localLatLng1.<init>(d4, d2);
      localLatLngBounds.<init>(localLatLng2, localLatLng1);
      return localLatLngBounds;
      double d8 = d2;
      d2 = d1;
      d1 = d8;
      continue;
      d1 = d2;
      d2 = d5;
    }
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    LatLng localLatLng = this.southwest;
    localzza = localzza.zzg("southwest", localLatLng);
    localLatLng = this.northeast;
    return localzza.zzg("northeast", localLatLng).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\LatLngBounds.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */