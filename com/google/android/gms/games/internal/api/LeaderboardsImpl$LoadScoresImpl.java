package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;

abstract class LeaderboardsImpl$LoadScoresImpl
  extends Games.BaseGamesApiMethodImpl
{
  private LeaderboardsImpl$LoadScoresImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Leaderboards.LoadScoresResult zzam(Status paramStatus)
  {
    LeaderboardsImpl.LoadScoresImpl.1 local1 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$LoadScoresImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$LoadScoresImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */