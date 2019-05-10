package com.google.android.gms.games.leaderboard;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardScoreBuffer
  extends AbstractDataBuffer
{
  private final LeaderboardScoreBufferHeader zzaJd;
  
  public LeaderboardScoreBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    LeaderboardScoreBufferHeader localLeaderboardScoreBufferHeader = new com/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader;
    Bundle localBundle = paramDataHolder.zzpZ();
    localLeaderboardScoreBufferHeader.<init>(localBundle);
    this.zzaJd = localLeaderboardScoreBufferHeader;
  }
  
  public LeaderboardScore get(int paramInt)
  {
    LeaderboardScoreRef localLeaderboardScoreRef = new com/google/android/gms/games/leaderboard/LeaderboardScoreRef;
    DataHolder localDataHolder = this.zzahi;
    localLeaderboardScoreRef.<init>(localDataHolder, paramInt);
    return localLeaderboardScoreRef;
  }
  
  public LeaderboardScoreBufferHeader zzxJ()
  {
    return this.zzaJd;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardScoreBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */