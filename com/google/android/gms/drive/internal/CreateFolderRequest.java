package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFolderRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final MetadataBundle zzaqw;
  final DriveId zzaqy;
  
  static
  {
    zzo localzzo = new com/google/android/gms/drive/internal/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  CreateFolderRequest(int paramInt, DriveId paramDriveId, MetadataBundle paramMetadataBundle)
  {
    this.mVersionCode = paramInt;
    Object localObject = (DriveId)zzx.zzz(paramDriveId);
    this.zzaqy = ((DriveId)localObject);
    localObject = (MetadataBundle)zzx.zzz(paramMetadataBundle);
    this.zzaqw = ((MetadataBundle)localObject);
  }
  
  public CreateFolderRequest(DriveId paramDriveId, MetadataBundle paramMetadataBundle)
  {
    this(1, paramDriveId, paramMetadataBundle);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\CreateFolderRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */