package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

public final class SnapshotMetadataChange$Builder
{
  private Long zzaKN;
  private Long zzaKO;
  private BitmapTeleporter zzaKP;
  private Uri zzaKQ;
  private String zzaxl;
  
  public SnapshotMetadataChange build()
  {
    SnapshotMetadataChangeEntity localSnapshotMetadataChangeEntity = new com/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;
    String str = this.zzaxl;
    Long localLong1 = this.zzaKN;
    BitmapTeleporter localBitmapTeleporter = this.zzaKP;
    Uri localUri = this.zzaKQ;
    Long localLong2 = this.zzaKO;
    localSnapshotMetadataChangeEntity.<init>(str, localLong1, localBitmapTeleporter, localUri, localLong2);
    return localSnapshotMetadataChangeEntity;
  }
  
  public Builder fromMetadata(SnapshotMetadata paramSnapshotMetadata)
  {
    Object localObject = paramSnapshotMetadata.getDescription();
    this.zzaxl = ((String)localObject);
    localObject = Long.valueOf(paramSnapshotMetadata.getPlayedTime());
    this.zzaKN = ((Long)localObject);
    localObject = Long.valueOf(paramSnapshotMetadata.getProgressValue());
    this.zzaKO = ((Long)localObject);
    localObject = this.zzaKN;
    long l1 = ((Long)localObject).longValue();
    long l2 = -1;
    boolean bool = l1 < l2;
    if (!bool) {
      this.zzaKN = null;
    }
    localObject = paramSnapshotMetadata.getCoverImageUri();
    this.zzaKQ = ((Uri)localObject);
    localObject = this.zzaKQ;
    if (localObject != null) {
      this.zzaKP = null;
    }
    return this;
  }
  
  public Builder setCoverImage(Bitmap paramBitmap)
  {
    BitmapTeleporter localBitmapTeleporter = new com/google/android/gms/common/data/BitmapTeleporter;
    localBitmapTeleporter.<init>(paramBitmap);
    this.zzaKP = localBitmapTeleporter;
    this.zzaKQ = null;
    return this;
  }
  
  public Builder setDescription(String paramString)
  {
    this.zzaxl = paramString;
    return this;
  }
  
  public Builder setPlayedTimeMillis(long paramLong)
  {
    Long localLong = Long.valueOf(paramLong);
    this.zzaKN = localLong;
    return this;
  }
  
  public Builder setProgressValue(long paramLong)
  {
    Long localLong = Long.valueOf(paramLong);
    this.zzaKO = localLong;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataChange$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */