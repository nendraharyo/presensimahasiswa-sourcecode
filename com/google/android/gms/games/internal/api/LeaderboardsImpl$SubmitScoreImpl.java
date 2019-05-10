package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;

public abstract class LeaderboardsImpl$SubmitScoreImpl
  extends Games.BaseGamesApiMethodImpl
{
  protected LeaderboardsImpl$SubmitScoreImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Leaderboards.SubmitScoreResult zzan(Status paramStatus)
  {
    LeaderboardsImpl.SubmitScoreImpl.1 local1 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$SubmitScoreImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$SubmitScoreImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */