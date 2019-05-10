package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class StreetViewPanoramaLocation
  implements SafeParcelable
{
  public static final zzl CREATOR;
  public final StreetViewPanoramaLink[] links;
  private final int mVersionCode;
  public final String panoId;
  public final LatLng position;
  
  static
  {
    zzl localzzl = new com/google/android/gms/maps/model/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  StreetViewPanoramaLocation(int paramInt, StreetViewPanoramaLink[] paramArrayOfStreetViewPanoramaLink, LatLng paramLatLng, String paramString)
  {
    this.mVersionCode = paramInt;
    this.links = paramArrayOfStreetViewPanoramaLink;
    this.position = paramLatLng;
    this.panoId = paramString;
  }
  
  public StreetViewPanoramaLocation(StreetViewPanoramaLink[] paramArrayOfStreetViewPanoramaLink, LatLng paramLatLng, String paramString)
  {
    this(1, paramArrayOfStreetViewPanoramaLink, paramLatLng, paramString);
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
      boolean bool2 = paramObject instanceof StreetViewPanoramaLocation;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (StreetViewPanoramaLocation)paramObject;
        Object localObject1 = this.panoId;
        Object localObject2 = ((StreetViewPanoramaLocation)paramObject).panoId;
        bool2 = ((String)localObject1).equals(localObject2);
        if (bool2)
        {
          localObject1 = this.position;
          localObject2 = ((StreetViewPanoramaLocation)paramObject).position;
          bool2 = ((LatLng)localObject1).equals(localObject2);
          if (bool2) {}
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
    Object localObject = this.position;
    arrayOfObject[0] = localObject;
    localObject = this.panoId;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    String str = this.panoId;
    localzza = localzza.zzg("panoId", str);
    str = this.position.toString();
    return localzza.zzg("position", str).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\StreetViewPanoramaLocation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */