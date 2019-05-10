package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  static final List zzaOd = ;
  private final int mVersionCode;
  private final List zzaOe;
  
  static
  {
    zze localzze = new com/google/android/gms/location/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  LocationResult(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzaOe = paramList;
  }
  
  public static LocationResult create(List paramList)
  {
    if (paramList == null) {
      paramList = zzaOd;
    }
    LocationResult localLocationResult = new com/google/android/gms/location/LocationResult;
    localLocationResult.<init>(2, paramList);
    return localLocationResult;
  }
  
  public static LocationResult extractResult(Intent paramIntent)
  {
    boolean bool = hasResult(paramIntent);
    if (!bool) {
      bool = false;
    }
    String str;
    for (Object localObject = null;; localObject = (LocationResult)((Bundle)localObject).getParcelable(str))
    {
      return (LocationResult)localObject;
      localObject = paramIntent.getExtras();
      str = "com.google.android.gms.location.EXTRA_LOCATION_RESULT";
    }
  }
  
  public static boolean hasResult(Intent paramIntent)
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
      str = "com.google.android.gms.location.EXTRA_LOCATION_RESULT";
      bool = paramIntent.hasExtra(str);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof LocationResult;
    Object localObject1;
    if (!bool1)
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool1;
      paramObject = (LocationResult)paramObject;
      localObject1 = ((LocationResult)paramObject).zzaOe;
      int i = ((List)localObject1).size();
      Object localObject2 = this.zzaOe;
      int j = ((List)localObject2).size();
      if (i != j)
      {
        i = 0;
        localObject1 = null;
      }
      else
      {
        Iterator localIterator1 = ((LocationResult)paramObject).zzaOe.iterator();
        localObject1 = this.zzaOe;
        Iterator localIterator2 = ((List)localObject1).iterator();
        do
        {
          bool2 = localIterator1.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (Location)localIterator2.next();
          localObject2 = (Location)localIterator1.next();
          long l1 = ((Location)localObject1).getTime();
          long l2 = ((Location)localObject2).getTime();
          bool2 = l1 < l2;
        } while (!bool2);
        boolean bool2 = false;
        localObject1 = null;
        continue;
        bool2 = true;
      }
    }
  }
  
  public Location getLastLocation()
  {
    Object localObject = this.zzaOe;
    int i = ((List)localObject).size();
    if (i == 0) {
      i = 0;
    }
    List localList;
    for (localObject = null;; localObject = (Location)localList.get(i))
    {
      return (Location)localObject;
      localList = this.zzaOe;
      i += -1;
    }
  }
  
  public List getLocations()
  {
    return this.zzaOe;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    int i = 17;
    List localList = this.zzaOe;
    Iterator localIterator = localList.iterator();
    int j;
    for (int k = i;; k = j)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Location localLocation = (Location)localIterator.next();
      long l1 = localLocation.getTime();
      long l2 = l1 >>> 32;
      l1 ^= l2;
      j = (int)l1;
      k *= 31;
      j += k;
    }
    return k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("LocationResult[locations: ");
    List localList = this.zzaOe;
    return localList + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */