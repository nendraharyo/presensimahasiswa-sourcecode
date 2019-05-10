package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class SnapshotMetadataChangeEntity
  extends SnapshotMetadataChange
  implements SafeParcelable
{
  public static final SnapshotMetadataChangeCreator CREATOR;
  private final int mVersionCode;
  private final Long zzaKO;
  private final Uri zzaKQ;
  private final Long zzaKR;
  private BitmapTeleporter zzaKS;
  private final String zzaxl;
  
  static
  {
    SnapshotMetadataChangeCreator localSnapshotMetadataChangeCreator = new com/google/android/gms/games/snapshot/SnapshotMetadataChangeCreator;
    localSnapshotMetadataChangeCreator.<init>();
    CREATOR = localSnapshotMetadataChangeCreator;
  }
  
  SnapshotMetadataChangeEntity()
  {
    this(5, null, null, null, null, null);
  }
  
  SnapshotMetadataChangeEntity(int paramInt, String paramString, Long paramLong1, BitmapTeleporter paramBitmapTeleporter, Uri paramUri, Long paramLong2)
  {
    this.mVersionCode = paramInt;
    this.zzaxl = paramString;
    this.zzaKR = paramLong1;
    this.zzaKS = paramBitmapTeleporter;
    this.zzaKQ = paramUri;
    this.zzaKO = paramLong2;
    Object localObject = this.zzaKS;
    if (localObject != null)
    {
      localObject = this.zzaKQ;
      if (localObject == null)
      {
        str = "Cannot set both a URI and an image";
        zzx.zza(bool, str);
      }
    }
    do
    {
      return;
      bool = false;
      break;
      localObject = this.zzaKQ;
    } while (localObject == null);
    localObject = this.zzaKS;
    if (localObject == null) {}
    for (;;)
    {
      str = "Cannot set both a URI and an image";
      zzx.zza(bool, str);
      break;
      bool = false;
    }
  }
  
  SnapshotMetadataChangeEntity(String paramString, Long paramLong1, BitmapTeleporter paramBitmapTeleporter, Uri paramUri, Long paramLong2)
  {
    this(5, paramString, paramLong1, paramBitmapTeleporter, paramUri, paramLong2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Bitmap getCoverImage()
  {
    Object localObject = this.zzaKS;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaKS.zzqa()) {
      return (Bitmap)localObject;
    }
  }
  
  public Uri getCoverImageUri()
  {
    return this.zzaKQ;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public Long getPlayedTimeMillis()
  {
    return this.zzaKR;
  }
  
  public Long getProgressValue()
  {
    return this.zzaKO;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotMetadataChangeCreator.zza(this, paramParcel, paramInt);
  }
  
  public BitmapTeleporter zzxU()
  {
    return this.zzaKS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataChangeEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */