package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class SetResourceParentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DriveId zzaqf;
  final List zzasC;
  
  static
  {
    zzbt localzzbt = new com/google/android/gms/drive/internal/zzbt;
    localzzbt.<init>();
    CREATOR = localzzbt;
  }
  
  SetResourceParentsRequest(int paramInt, DriveId paramDriveId, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzaqf = paramDriveId;
    this.zzasC = paramList;
  }
  
  public SetResourceParentsRequest(DriveId paramDriveId, List paramList)
  {
    this(1, paramDriveId, paramList);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbt.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\SetResourceParentsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */