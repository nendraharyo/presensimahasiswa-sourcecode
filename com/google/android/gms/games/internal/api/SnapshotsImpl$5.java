package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

class SnapshotsImpl$5
  extends SnapshotsImpl.OpenImpl
{
  SnapshotsImpl$5(SnapshotsImpl paramSnapshotsImpl, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str1 = this.zzaHx;
    String str2 = this.zzaHy;
    SnapshotMetadataChange localSnapshotMetadataChange = this.zzaHv;
    SnapshotContents localSnapshotContents = this.zzaHz;
    paramGamesClientImpl.zza(this, str1, str2, localSnapshotMetadataChange, localSnapshotContents);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\SnapshotsImpl$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */