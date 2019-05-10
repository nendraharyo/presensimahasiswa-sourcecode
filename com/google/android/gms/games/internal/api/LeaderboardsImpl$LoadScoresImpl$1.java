package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;

class LeaderboardsImpl$LoadScoresImpl$1
  implements Leaderboards.LoadScoresResult
{
  LeaderboardsImpl$LoadScoresImpl$1(LeaderboardsImpl.LoadScoresImpl paramLoadScoresImpl, Status paramStatus) {}
  
  public Leaderboard getLeaderboard()
  {
    return null;
  }
  
  public LeaderboardScoreBuffer getScores()
  {
    LeaderboardScoreBuffer localLeaderboardScoreBuffer = new com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localLeaderboardScoreBuffer.<init>(localDataHolder);
    return localLeaderboardScoreBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$LoadScoresImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */