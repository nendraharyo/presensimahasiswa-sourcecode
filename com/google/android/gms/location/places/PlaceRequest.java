package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.concurrent.TimeUnit;

public final class PlaceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  static final long zzaPJ = TimeUnit.HOURS.toMillis(1L);
  private final int mPriority;
  final int mVersionCode;
  private final long zzaND;
  private final long zzaNY;
  private final PlaceFilter zzaPK;
  
  static
  {
    zzk localzzk = new com/google/android/gms/location/places/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  public PlaceRequest(int paramInt1, PlaceFilter paramPlaceFilter, long paramLong1, int paramInt2, long paramLong2)
  {
    this.mVersionCode = paramInt1;
    this.zzaPK = paramPlaceFilter;
    this.zzaNY = paramLong1;
    this.mPriority = paramInt2;
    this.zzaND = paramLong2;
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
      boolean bool2 = paramObject instanceof PlaceRequest;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (PlaceRequest)paramObject;
        PlaceFilter localPlaceFilter1 = this.zzaPK;
        PlaceFilter localPlaceFilter2 = ((PlaceRequest)paramObject).zzaPK;
        bool2 = zzw.equal(localPlaceFilter1, localPlaceFilter2);
        if (bool2)
        {
          long l1 = this.zzaNY;
          long l2 = ((PlaceRequest)paramObject).zzaNY;
          bool2 = l1 < l2;
          if (!bool2)
          {
            int i = this.mPriority;
            int j = ((PlaceRequest)paramObject).mPriority;
            if (i == j)
            {
              l1 = this.zzaND;
              l2 = ((PlaceRequest)paramObject).zzaND;
              boolean bool3 = l1 < l2;
              if (!bool3) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public long getExpirationTime()
  {
    return this.zzaND;
  }
  
  public long getInterval()
  {
    return this.zzaNY;
  }
  
  public int getPriority()
  {
    return this.mPriority;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzaPK;
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzaNY);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.mPriority);
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(this.zzaND);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzaPK;
    localzza = localzza.zzg("filter", localObject);
    localObject = Long.valueOf(this.zzaNY);
    localzza = localzza.zzg("interval", localObject);
    localObject = Integer.valueOf(this.mPriority);
    localzza = localzza.zzg("priority", localObject);
    localObject = Long.valueOf(this.zzaND);
    return localzza.zzg("expireAt", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
  
  public PlaceFilter zzyZ()
  {
    return this.zzaPK;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlaceRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */