package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DriveId zzaqj;
  final boolean zzarN;
  
  static
  {
    zzaj localzzaj = new com/google/android/gms/drive/internal/zzaj;
    localzzaj.<init>();
    CREATOR = localzzaj;
  }
  
  GetMetadataRequest(int paramInt, DriveId paramDriveId, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzaqj = paramDriveId;
    this.zzarN = paramBoolean;
  }
  
  public GetMetadataRequest(DriveId paramDriveId, boolean paramBoolean)
  {
    this(1, paramDriveId, paramBoolean);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\GetMetadataRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */