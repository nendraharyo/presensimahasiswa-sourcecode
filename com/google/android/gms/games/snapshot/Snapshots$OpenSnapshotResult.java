package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.api.Result;

public abstract interface Snapshots$OpenSnapshotResult
  extends Result
{
  public abstract String getConflictId();
  
  public abstract Snapshot getConflictingSnapshot();
  
  public abstract SnapshotContents getResolutionSnapshotContents();
  
  public abstract Snapshot getSnapshot();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\Snapshots$OpenSnapshotResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */