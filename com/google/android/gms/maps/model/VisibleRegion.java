package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class VisibleRegion
  implements SafeParcelable
{
  public static final zzp CREATOR;
  public final LatLng farLeft;
  public final LatLng farRight;
  public final LatLngBounds latLngBounds;
  private final int mVersionCode;
  public final LatLng nearLeft;
  public final LatLng nearRight;
  
  static
  {
    zzp localzzp = new com/google/android/gms/maps/model/zzp;
    localzzp.<init>();
    CREATOR = localzzp;
  }
  
  VisibleRegion(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2, LatLng paramLatLng3, LatLng paramLatLng4, LatLngBounds paramLatLngBounds)
  {
    this.mVersionCode = paramInt;
    this.nearLeft = paramLatLng1;
    this.nearRight = paramLatLng2;
    this.farLeft = paramLatLng3;
    this.farRight = paramLatLng4;
    this.latLngBounds = paramLatLngBounds;
  }
  
  public VisibleRegion(LatLng paramLatLng1, LatLng paramLatLng2, LatLng paramLatLng3, LatLng paramLatLng4, LatLngBounds paramLatLngBounds)
  {
    this(1, paramLatLng1, paramLatLng2, paramLatLng3, paramLatLng4, paramLatLngBounds);
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
      boolean bool2 = paramObject instanceof VisibleRegion;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (VisibleRegion)paramObject;
        Object localObject1 = this.nearLeft;
        Object localObject2 = ((VisibleRegion)paramObject).nearLeft;
        bool2 = ((LatLng)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = this.nearRight;
          localObject2 = ((VisibleRegion)paramObject).nearRight;
          bool2 = ((LatLng)localObject1).equals(localObject2);
          if (bool2)
          {
            localObject1 = this.farLeft;
            localObject2 = ((VisibleRegion)paramObject).farLeft;
            bool2 = ((LatLng)localObject1).equals(localObject2);
            if (bool2)
            {
              localObject1 = this.farRight;
              localObject2 = ((VisibleRegion)paramObject).farRight;
              bool2 = ((LatLng)localObject1).equals(localObject2);
              if (bool2)
              {
                localObject1 = this.latLngBounds;
                localObject2 = ((VisibleRegion)paramObject).latLngBounds;
                bool2 = ((LatLngBounds)localObject1).equals(localObject2);
                if (bool2) {
                  continue;
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.nearLeft;
    arrayOfObject[0] = localObject;
    localObject = this.nearRight;
    arrayOfObject[1] = localObject;
    localObject = this.farLeft;
    arrayOfObject[2] = localObject;
    localObject = this.farRight;
    arrayOfObject[3] = localObject;
    localObject = this.latLngBounds;
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.nearLeft;
    localzza = localzza.zzg("nearLeft", localObject);
    localObject = this.nearRight;
    localzza = localzza.zzg("nearRight", localObject);
    localObject = this.farLeft;
    localzza = localzza.zzg("farLeft", localObject);
    localObject = this.farRight;
    localzza = localzza.zzg("farRight", localObject);
    localObject = this.latLngBounds;
    return localzza.zzg("latLngBounds", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\VisibleRegion.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */