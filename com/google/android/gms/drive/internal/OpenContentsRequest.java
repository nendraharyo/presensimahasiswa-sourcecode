package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzaoy;
  final DriveId zzaqj;
  final int zzasx;
  
  static
  {
    zzbk localzzbk = new com/google/android/gms/drive/internal/zzbk;
    localzzbk.<init>();
    CREATOR = localzzbk;
  }
  
  OpenContentsRequest(int paramInt1, DriveId paramDriveId, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzaqj = paramDriveId;
    this.zzaoy = paramInt2;
    this.zzasx = paramInt3;
  }
  
  public OpenContentsRequest(DriveId paramDriveId, int paramInt1, int paramInt2)
  {
    this(1, paramDriveId, paramInt1, paramInt2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OpenContentsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */