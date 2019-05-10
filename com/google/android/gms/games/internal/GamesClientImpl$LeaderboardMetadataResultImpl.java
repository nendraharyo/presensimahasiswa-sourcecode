package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;

final class GamesClientImpl$LeaderboardMetadataResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Leaderboards.LeaderboardMetadataResult
{
  private final LeaderboardBuffer zzaEv;
  
  GamesClientImpl$LeaderboardMetadataResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    LeaderboardBuffer localLeaderboardBuffer = new com/google/android/gms/games/leaderboard/LeaderboardBuffer;
    localLeaderboardBuffer.<init>(paramDataHolder);
    this.zzaEv = localLeaderboardBuffer;
  }
  
  public LeaderboardBuffer getLeaderboards()
  {
    return this.zzaEv;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LeaderboardMetadataResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */