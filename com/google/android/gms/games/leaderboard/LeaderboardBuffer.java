package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class LeaderboardBuffer
  extends zzf
{
  public LeaderboardBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected Leaderboard zzp(int paramInt1, int paramInt2)
  {
    LeaderboardRef localLeaderboardRef = new com/google/android/gms/games/leaderboard/LeaderboardRef;
    DataHolder localDataHolder = this.zzahi;
    localLeaderboardRef.<init>(localDataHolder, paramInt1, paramInt2);
    return localLeaderboardRef;
  }
  
  protected String zzqg()
  {
    return "external_leaderboard_id";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */