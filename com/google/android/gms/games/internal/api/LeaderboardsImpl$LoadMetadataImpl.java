package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;

abstract class LeaderboardsImpl$LoadMetadataImpl
  extends Games.BaseGamesApiMethodImpl
{
  private LeaderboardsImpl$LoadMetadataImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Leaderboards.LeaderboardMetadataResult zzak(Status paramStatus)
  {
    LeaderboardsImpl.LoadMetadataImpl.1 local1 = new com/google/android/gms/games/internal/api/LeaderboardsImpl$LoadMetadataImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$LoadMetadataImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */