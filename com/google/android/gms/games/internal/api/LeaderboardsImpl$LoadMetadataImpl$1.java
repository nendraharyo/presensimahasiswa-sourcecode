package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;

class LeaderboardsImpl$LoadMetadataImpl$1
  implements Leaderboards.LeaderboardMetadataResult
{
  LeaderboardsImpl$LoadMetadataImpl$1(LeaderboardsImpl.LoadMetadataImpl paramLoadMetadataImpl, Status paramStatus) {}
  
  public LeaderboardBuffer getLeaderboards()
  {
    LeaderboardBuffer localLeaderboardBuffer = new com/google/android/gms/games/leaderboard/LeaderboardBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localLeaderboardBuffer.<init>(localDataHolder);
    return localLeaderboardBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\LeaderboardsImpl$LoadMetadataImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */