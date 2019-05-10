package com.google.android.gms.games.leaderboard;

import android.os.Bundle;

public final class LeaderboardScoreBufferHeader
{
  private final Bundle zzUH;
  
  public LeaderboardScoreBufferHeader(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    this.zzUH = paramBundle;
  }
  
  public Bundle asBundle()
  {
    return this.zzUH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardScoreBufferHeader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */