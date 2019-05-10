package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class OpenFileIntentSenderRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzapg;
  final String[] zzaph;
  final DriveId zzapj;
  final FilterHolder zzasz;
  
  static
  {
    zzbm localzzbm = new com/google/android/gms/drive/internal/zzbm;
    localzzbm.<init>();
    CREATOR = localzzbm;
  }
  
  OpenFileIntentSenderRequest(int paramInt, String paramString, String[] paramArrayOfString, DriveId paramDriveId, FilterHolder paramFilterHolder)
  {
    this.mVersionCode = paramInt;
    this.zzapg = paramString;
    this.zzaph = paramArrayOfString;
    this.zzapj = paramDriveId;
    this.zzasz = paramFilterHolder;
  }
  
  public OpenFileIntentSenderRequest(String paramString, String[] paramArrayOfString, DriveId paramDriveId, FilterHolder paramFilterHolder)
  {
    this(1, paramString, paramArrayOfString, paramDriveId, paramFilterHolder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbm.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OpenFileIntentSenderRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */