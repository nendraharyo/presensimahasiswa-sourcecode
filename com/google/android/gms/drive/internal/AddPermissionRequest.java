package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class AddPermissionRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzaoV;
  final DriveId zzaoz;
  final Permission zzaqa;
  final boolean zzaqb;
  final String zzaqc;
  final boolean zzaqd;
  
  static
  {
    zzb localzzb = new com/google/android/gms/drive/internal/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  AddPermissionRequest(int paramInt, DriveId paramDriveId, Permission paramPermission, boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzaoz = paramDriveId;
    this.zzaqa = paramPermission;
    this.zzaqb = paramBoolean1;
    this.zzaqc = paramString1;
    this.zzaqd = paramBoolean2;
    this.zzaoV = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\AddPermissionRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */