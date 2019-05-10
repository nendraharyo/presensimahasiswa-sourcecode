package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class LeaderboardsImpl$7
  extends LeaderboardsImpl.SubmitScoreImpl
{
  LeaderboardsImpl$7(LeaderboardsImpl paramLeaderboardsImpl, GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str1 = this.zzaGq;
    long l = this.zzaGw;
    String str2 = this.zzaGx;
    paramGamesClientImpl.zza(this, str1, l, str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */