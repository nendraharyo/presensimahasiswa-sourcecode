package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemovePermissionRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzaoV;
  final DriveId zzaoz;
  final String zzapk;
  final boolean zzaqd;
  
  static
  {
    zzbq localzzbq = new com/google/android/gms/drive/internal/zzbq;
    localzzbq.<init>();
    CREATOR = localzzbq;
  }
  
  RemovePermissionRequest(int paramInt, DriveId paramDriveId, String paramString1, boolean paramBoolean, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzaoz = paramDriveId;
    this.zzapk = paramString1;
    this.zzaqd = paramBoolean;
    this.zzaoV = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbq.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\RemovePermissionRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */