package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public final class LocationAvailability
  implements SafeParcelable
{
  public static final LocationAvailabilityCreator CREATOR;
  private final int mVersionCode;
  int zzaNU;
  int zzaNV;
  long zzaNW;
  int zzaNX;
  
  static
  {
    LocationAvailabilityCreator localLocationAvailabilityCreator = new com/google/android/gms/location/LocationAvailabilityCreator;
    localLocationAvailabilityCreator.<init>();
    CREATOR = localLocationAvailabilityCreator;
  }
  
  LocationAvailability(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    this.mVersionCode = paramInt1;
    this.zzaNX = paramInt2;
    this.zzaNU = paramInt3;
    this.zzaNV = paramInt4;
    this.zzaNW = paramLong;
  }
  
  public static LocationAvailability extractLocationAvailability(Intent paramIntent)
  {
    boolean bool = hasLocationAvailability(paramIntent);
    if (!bool) {
      bool = false;
    }
    String str;
    for (Object localObject = null;; localObject = (LocationAvailability)((Bundle)localObject).getParcelable(str))
    {
      return (LocationAvailability)localObject;
      localObject = paramIntent.getExtras();
      str = "com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY";
    }
  }
  
  public static boolean hasLocationAvailability(Intent paramIntent)
  {
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      str = "com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY";
      bool = paramIntent.hasExtra(str);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof LocationAvailability;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (LocationAvailability)paramObject;
      int i = this.zzaNX;
      int j = ((LocationAvailability)paramObject).zzaNX;
      if (i == j)
      {
        i = this.zzaNU;
        j = ((LocationAvailability)paramObject).zzaNU;
        if (i == j)
        {
          i = this.zzaNV;
          j = ((LocationAvailability)paramObject).zzaNV;
          if (i == j)
          {
            long l1 = this.zzaNW;
            long l2 = ((LocationAvailability)paramObject).zzaNW;
            boolean bool3 = l1 < l2;
            if (!bool3) {
              bool1 = true;
            }
          }
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
    Object[] arrayOfObject = new Object[4];
    Object localObject = Integer.valueOf(this.zzaNX);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzaNU);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzaNV);
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(this.zzaNW);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isLocationAvailable()
  {
    int i = this.zzaNX;
    int k = 1000;
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("LocationAvailability[isLocationAvailable: ");
    boolean bool = isLocationAvailable();
    return bool + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    LocationAvailabilityCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationAvailability.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */