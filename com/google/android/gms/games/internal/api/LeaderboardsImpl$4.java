package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class LeaderboardsImpl$4
  extends LeaderboardsImpl.LoadScoresImpl
{
  LeaderboardsImpl$4(LeaderboardsImpl paramLeaderboardsImpl, GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str = this.zzaGq;
    int i = this.zzaGr;
    int j = this.zzaGs;
    int k = this.zzaGt;
    boolean bool = this.zzaFO;
    paramGamesClientImpl.zza(this, str, i, j, k, bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */