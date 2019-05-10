package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FusedLocationProviderResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final FusedLocationProviderResult zzaOC;
  private final int mVersionCode;
  private final Status zzUX;
  
  static
  {
    Object localObject = new com/google/android/gms/location/internal/FusedLocationProviderResult;
    Status localStatus = Status.zzagC;
    ((FusedLocationProviderResult)localObject).<init>(localStatus);
    zzaOC = (FusedLocationProviderResult)localObject;
    localObject = new com/google/android/gms/location/internal/zze;
    ((zze)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  FusedLocationProviderResult(int paramInt, Status paramStatus)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
  }
  
  public FusedLocationProviderResult(Status paramStatus)
  {
    this(1, paramStatus);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\FusedLocationProviderResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */