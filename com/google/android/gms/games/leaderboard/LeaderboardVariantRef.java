package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class LeaderboardVariantRef
  extends zzc
  implements LeaderboardVariant
{
  LeaderboardVariantRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    return LeaderboardVariantEntity.zza(this, paramObject);
  }
  
  public int getCollection()
  {
    return getInteger("collection");
  }
  
  public String getDisplayPlayerRank()
  {
    return getString("player_display_rank");
  }
  
  public String getDisplayPlayerScore()
  {
    return getString("player_display_score");
  }
  
  public long getNumScores()
  {
    String str = "total_scores";
    boolean bool = zzcB(str);
    if (bool) {}
    for (long l = -1;; l = getLong(str))
    {
      return l;
      str = "total_scores";
    }
  }
  
  public long getPlayerRank()
  {
    String str = "player_rank";
    boolean bool = zzcB(str);
    if (bool) {}
    for (long l = -1;; l = getLong(str))
    {
      return l;
      str = "player_rank";
    }
  }
  
  public String getPlayerScoreTag()
  {
    return getString("player_score_tag");
  }
  
  public long getRawPlayerScore()
  {
    String str = "player_raw_score";
    boolean bool = zzcB(str);
    if (bool) {}
    for (long l = -1;; l = getLong(str))
    {
      return l;
      str = "player_raw_score";
    }
  }
  
  public int getTimeSpan()
  {
    return getInteger("timespan");
  }
  
  public boolean hasPlayerInfo()
  {
    String str = "player_raw_score";
    boolean bool = zzcB(str);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public int hashCode()
  {
    return LeaderboardVariantEntity.zza(this);
  }
  
  public String toString()
  {
    return LeaderboardVariantEntity.zzb(this);
  }
  
  public String zzxL()
  {
    return getString("top_page_token_next");
  }
  
  public String zzxM()
  {
    return getString("window_page_token_prev");
  }
  
  public String zzxN()
  {
    return getString("window_page_token_next");
  }
  
  public LeaderboardVariant zzxO()
  {
    LeaderboardVariantEntity localLeaderboardVariantEntity = new com/google/android/gms/games/leaderboard/LeaderboardVariantEntity;
    localLeaderboardVariantEntity.<init>(this);
    return localLeaderboardVariantEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardVariantRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */