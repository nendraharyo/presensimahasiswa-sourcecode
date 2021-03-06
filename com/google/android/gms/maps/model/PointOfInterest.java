package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PointOfInterest
  implements SafeParcelable
{
  public static final zzg CREATOR;
  private final int mVersionCode;
  public final String name;
  public final LatLng zzaTG;
  public final String zzaTH;
  
  static
  {
    zzg localzzg = new com/google/android/gms/maps/model/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  PointOfInterest(int paramInt, LatLng paramLatLng, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzaTG = paramLatLng;
    this.zzaTH = paramString1;
    this.name = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\model\PointOfInterest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */