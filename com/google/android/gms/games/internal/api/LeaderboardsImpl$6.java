package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

class LeaderboardsImpl$6
  extends LeaderboardsImpl.LoadScoresImpl
{
  LeaderboardsImpl$6(LeaderboardsImpl paramLeaderboardsImpl, GoogleApiClient paramGoogleApiClient, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    LeaderboardScoreBuffer localLeaderboardScoreBuffer = this.zzaGu;
    int i = this.zzaGt;
    int j = this.zzaGv;
    paramGamesClientImpl.zza(this, localLeaderboardScoreBuffer, i, j);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */