package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;

class SnapshotsImpl$LoadImpl$1
  implements Snapshots.LoadSnapshotsResult
{
  SnapshotsImpl$LoadImpl$1(SnapshotsImpl.LoadImpl paramLoadImpl, Status paramStatus) {}
  
  public SnapshotMetadataBuffer getSnapshots()
  {
    SnapshotMetadataBuffer localSnapshotMetadataBuffer = new com/google/android/gms/games/snapshot/SnapshotMetadataBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localSnapshotMetadataBuffer.<init>(localDataHolder);
    return localSnapshotMetadataBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\SnapshotsImpl$LoadImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */