package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Snapshots$LoadSnapshotsResult
  extends Releasable, Result
{
  public abstract SnapshotMetadataBuffer getSnapshots();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\Snapshots$LoadSnapshotsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */