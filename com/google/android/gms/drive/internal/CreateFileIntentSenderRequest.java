package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzaox;
  final String zzapg;
  final DriveId zzapj;
  final MetadataBundle zzaqw;
  final Integer zzaqx;
  
  static
  {
    zzm localzzm = new com/google/android/gms/drive/internal/zzm;
    localzzm.<init>();
    CREATOR = localzzm;
  }
  
  CreateFileIntentSenderRequest(int paramInt1, MetadataBundle paramMetadataBundle, int paramInt2, String paramString, DriveId paramDriveId, Integer paramInteger)
  {
    this.mVersionCode = paramInt1;
    this.zzaqw = paramMetadataBundle;
    this.zzaox = paramInt2;
    this.zzapg = paramString;
    this.zzapj = paramDriveId;
    this.zzaqx = paramInteger;
  }
  
  public CreateFileIntentSenderRequest(MetadataBundle paramMetadataBundle, int paramInt1, String paramString, DriveId paramDriveId, int paramInt2)
  {
    this(1, paramMetadataBundle, paramInt1, paramString, paramDriveId, localInteger);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\CreateFileIntentSenderRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */