package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;

abstract class SnapshotsImpl$OpenImpl
  extends Games.BaseGamesApiMethodImpl
{
  private SnapshotsImpl$OpenImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Snapshots.OpenSnapshotResult zzaG(Status paramStatus)
  {
    SnapshotsImpl.OpenImpl.1 local1 = new com/google/android/gms/games/internal/api/SnapshotsImpl$OpenImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\SnapshotsImpl$OpenImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */