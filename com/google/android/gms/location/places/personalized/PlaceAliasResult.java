package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PlaceAliasResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final Status zzUX;
  final PlaceUserData zzaRf;
  
  static
  {
    zzc localzzc = new com/google/android/gms/location/places/personalized/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  PlaceAliasResult(int paramInt, Status paramStatus, PlaceUserData paramPlaceUserData)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
    this.zzaRf = paramPlaceUserData;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public PlaceUserData zzzC()
  {
    return this.zzaRf;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\personalized\PlaceAliasResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */