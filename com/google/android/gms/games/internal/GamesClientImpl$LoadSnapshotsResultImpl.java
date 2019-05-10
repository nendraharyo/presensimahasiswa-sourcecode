package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;

final class GamesClientImpl$LoadSnapshotsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Snapshots.LoadSnapshotsResult
{
  GamesClientImpl$LoadSnapshotsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public SnapshotMetadataBuffer getSnapshots()
  {
    SnapshotMetadataBuffer localSnapshotMetadataBuffer = new com/google/android/gms/games/snapshot/SnapshotMetadataBuffer;
    DataHolder localDataHolder = this.zzahi;
    localSnapshotMetadataBuffer.<init>(localDataHolder);
    return localSnapshotMetadataBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadSnapshotsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */