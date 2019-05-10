package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;

abstract class SnapshotsImpl$LoadImpl
  extends Games.BaseGamesApiMethodImpl
{
  private SnapshotsImpl$LoadImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Snapshots.LoadSnapshotsResult zzaF(Status paramStatus)
  {
    SnapshotsImpl.LoadImpl.1 local1 = new com/google/android/gms/games/internal/api/SnapshotsImpl$LoadImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\SnapshotsImpl$LoadImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */