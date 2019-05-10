package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AuthorizeAccessRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DriveId zzaoz;
  final long zzaqe;
  
  static
  {
    zzc localzzc = new com/google/android/gms/drive/internal/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  AuthorizeAccessRequest(int paramInt, long paramLong, DriveId paramDriveId)
  {
    this.mVersionCode = paramInt;
    this.zzaqe = paramLong;
    this.zzaoz = paramDriveId;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\AuthorizeAccessRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */