package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

class SnapshotsImpl$3
  extends SnapshotsImpl.CommitImpl
{
  SnapshotsImpl$3(SnapshotsImpl paramSnapshotsImpl, GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    Snapshot localSnapshot = this.zzaHu;
    SnapshotMetadataChange localSnapshotMetadataChange = this.zzaHv;
    paramGamesClientImpl.zza(this, localSnapshot, localSnapshotMetadataChange);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\SnapshotsImpl$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */