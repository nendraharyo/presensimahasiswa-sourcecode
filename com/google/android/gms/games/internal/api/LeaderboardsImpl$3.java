package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class LeaderboardsImpl$3
  extends LeaderboardsImpl.LoadPlayerScoreImpl
{
  LeaderboardsImpl$3(LeaderboardsImpl paramLeaderboardsImpl, GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str = this.zzaGq;
    int i = this.zzaGr;
    int j = this.zzaGs;
    paramGamesClientImpl.zza(this, null, str, i, j);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */