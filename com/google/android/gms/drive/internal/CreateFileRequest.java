package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.zzh;

public class CreateFileRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzaoV;
  final String zzaoY;
  final int zzaqA;
  final boolean zzaqd;
  final Contents zzaql;
  final MetadataBundle zzaqw;
  final Integer zzaqx;
  final DriveId zzaqy;
  final int zzaqz;
  
  static
  {
    zzn localzzn = new com/google/android/gms/drive/internal/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  CreateFileRequest(int paramInt1, DriveId paramDriveId, MetadataBundle paramMetadataBundle, Contents paramContents, Integer paramInteger, boolean paramBoolean, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    int i;
    if ((paramContents != null) && (paramInt3 != 0))
    {
      i = paramContents.getRequestId();
      if (i != paramInt3) {
        break label84;
      }
      i = 1;
    }
    for (;;)
    {
      String str = "inconsistent contents reference";
      zzx.zzb(i, str);
      if (paramInteger != null)
      {
        i = paramInteger.intValue();
        if (i != 0) {
          break;
        }
      }
      if ((paramContents != null) || (paramInt3 != 0)) {
        break;
      }
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Need a valid contents");
      throw ((Throwable)localObject);
      label84:
      i = 0;
      localObject = null;
    }
    this.mVersionCode = paramInt1;
    Object localObject = (DriveId)zzx.zzz(paramDriveId);
    this.zzaqy = ((DriveId)localObject);
    localObject = (MetadataBundle)zzx.zzz(paramMetadataBundle);
    this.zzaqw = ((MetadataBundle)localObject);
    this.zzaql = paramContents;
    this.zzaqx = paramInteger;
    this.zzaoV = paramString1;
    this.zzaqz = paramInt2;
    this.zzaqd = paramBoolean;
    this.zzaqA = paramInt3;
    this.zzaoY = paramString2;
  }
  
  public CreateFileRequest(DriveId paramDriveId, MetadataBundle paramMetadataBundle, int paramInt1, int paramInt2, zzh paramzzh)
  {
    this(2, paramDriveId, paramMetadataBundle, null, localInteger, bool, str1, i, paramInt1, str2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\CreateFileRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */