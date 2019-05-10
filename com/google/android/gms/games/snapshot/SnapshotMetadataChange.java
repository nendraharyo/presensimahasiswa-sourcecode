package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import com.google.android.gms.common.data.BitmapTeleporter;

public abstract class SnapshotMetadataChange
{
  public static final SnapshotMetadataChange EMPTY_CHANGE;
  
  static
  {
    SnapshotMetadataChangeEntity localSnapshotMetadataChangeEntity = new com/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;
    localSnapshotMetadataChangeEntity.<init>();
    EMPTY_CHANGE = localSnapshotMetadataChangeEntity;
  }
  
  public abstract Bitmap getCoverImage();
  
  public abstract String getDescription();
  
  public abstract Long getPlayedTimeMillis();
  
  public abstract Long getProgressValue();
  
  public abstract BitmapTeleporter zzxU();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataChange.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */