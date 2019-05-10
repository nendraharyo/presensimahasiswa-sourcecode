package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class ChangeResourceParentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final DriveId zzaqf;
  final List zzaqg;
  final List zzaqh;
  
  static
  {
    zzf localzzf = new com/google/android/gms/drive/internal/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  ChangeResourceParentsRequest(int paramInt, DriveId paramDriveId, List paramList1, List paramList2)
  {
    this.mVersionCode = paramInt;
    this.zzaqf = paramDriveId;
    this.zzaqg = paramList1;
    this.zzaqh = paramList2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\ChangeResourceParentsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */