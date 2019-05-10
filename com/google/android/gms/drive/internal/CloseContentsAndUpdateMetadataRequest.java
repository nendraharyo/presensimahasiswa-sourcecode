package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.zzi;

public class CloseContentsAndUpdateMetadataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzaoV;
  final boolean zzaoW;
  final boolean zzapa;
  final DriveId zzaqj;
  final MetadataBundle zzaqk;
  final Contents zzaql;
  final int zzaqm;
  final int zzaqn;
  final boolean zzaqo;
  
  static
  {
    zzh localzzh = new com/google/android/gms/drive/internal/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  CloseContentsAndUpdateMetadataRequest(int paramInt1, DriveId paramDriveId, MetadataBundle paramMetadataBundle, Contents paramContents, boolean paramBoolean1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.mVersionCode = paramInt1;
    this.zzaqj = paramDriveId;
    this.zzaqk = paramMetadataBundle;
    this.zzaql = paramContents;
    this.zzaoW = paramBoolean1;
    this.zzaoV = paramString;
    this.zzaqm = paramInt2;
    this.zzaqn = paramInt3;
    this.zzaqo = paramBoolean2;
    this.zzapa = paramBoolean3;
  }
  
  public CloseContentsAndUpdateMetadataRequest(DriveId paramDriveId, MetadataBundle paramMetadataBundle, int paramInt, boolean paramBoolean, zzi paramzzi)
  {
    this(1, paramDriveId, paramMetadataBundle, null, bool1, str, i, paramInt, paramBoolean, bool2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\CloseContentsAndUpdateMetadataRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */