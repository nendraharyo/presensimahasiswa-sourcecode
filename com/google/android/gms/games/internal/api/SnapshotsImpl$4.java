package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.SnapshotMetadata;

class SnapshotsImpl$4
  extends SnapshotsImpl.DeleteImpl
{
  SnapshotsImpl$4(SnapshotsImpl paramSnapshotsImpl, GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str = this.zzaHw.getSnapshotId();
    paramGamesClientImpl.zzi(this, str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\SnapshotsImpl$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */