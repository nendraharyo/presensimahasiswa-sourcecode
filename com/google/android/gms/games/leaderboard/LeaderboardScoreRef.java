package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class LeaderboardScoreRef
  extends zzc
  implements LeaderboardScore
{
  private final PlayerRef zzaJq;
  
  LeaderboardScoreRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    PlayerRef localPlayerRef = new com/google/android/gms/games/PlayerRef;
    localPlayerRef.<init>(paramDataHolder, paramInt);
    this.zzaJq = localPlayerRef;
  }
  
  public boolean equals(Object paramObject)
  {
    return LeaderboardScoreEntity.zza(this, paramObject);
  }
  
  public String getDisplayRank()
  {
    return getString("display_rank");
  }
  
  public void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("display_rank", paramCharArrayBuffer);
  }
  
  public String getDisplayScore()
  {
    return getString("display_score");
  }
  
  public void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("display_score", paramCharArrayBuffer);
  }
  
  public long getRank()
  {
    return getLong("rank");
  }
  
  public long getRawScore()
  {
    return getLong("raw_score");
  }
  
  public Player getScoreHolder()
  {
    Object localObject = "external_player_id";
    boolean bool = zzcB((String)localObject);
    if (bool) {
      bool = false;
    }
    for (localObject = null;; localObject = this.zzaJq) {
      return (Player)localObject;
    }
  }
  
  public String getScoreHolderDisplayName()
  {
    String str = "external_player_id";
    boolean bool = zzcB(str);
    if (bool) {}
    for (str = getString("default_display_name");; str = this.zzaJq.getDisplayName()) {
      return str;
    }
  }
  
  public void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    Object localObject = "external_player_id";
    boolean bool = zzcB((String)localObject);
    if (bool)
    {
      localObject = "default_display_name";
      zza((String)localObject, paramCharArrayBuffer);
    }
    for (;;)
    {
      return;
      localObject = this.zzaJq;
      ((PlayerRef)localObject).getDisplayName(paramCharArrayBuffer);
    }
  }
  
  public Uri getScoreHolderHiResImageUri()
  {
    Object localObject = "external_player_id";
    boolean bool = zzcB((String)localObject);
    if (bool) {
      bool = false;
    }
    for (localObject = null;; localObject = this.zzaJq.getHiResImageUri()) {
      return (Uri)localObject;
    }
  }
  
  public String getScoreHolderHiResImageUrl()
  {
    String str = "external_player_id";
    boolean bool = zzcB(str);
    if (bool) {
      bool = false;
    }
    for (str = null;; str = this.zzaJq.getHiResImageUrl()) {
      return str;
    }
  }
  
  public Uri getScoreHolderIconImageUri()
  {
    Object localObject = "external_player_id";
    boolean bool = zzcB((String)localObject);
    if (bool) {}
    for (localObject = zzcA("default_display_image_uri");; localObject = this.zzaJq.getIconImageUri()) {
      return (Uri)localObject;
    }
  }
  
  public String getScoreHolderIconImageUrl()
  {
    String str = "external_player_id";
    boolean bool = zzcB(str);
    if (bool) {}
    for (str = getString("default_display_image_url");; str = this.zzaJq.getIconImageUrl()) {
      return str;
    }
  }
  
  public String getScoreTag()
  {
    return getString("score_tag");
  }
  
  public long getTimestampMillis()
  {
    return getLong("achieved_timestamp");
  }
  
  public int hashCode()
  {
    return LeaderboardScoreEntity.zza(this);
  }
  
  public String toString()
  {
    return LeaderboardScoreEntity.zzb(this);
  }
  
  public LeaderboardScore zzxK()
  {
    LeaderboardScoreEntity localLeaderboardScoreEntity = new com/google/android/gms/games/leaderboard/LeaderboardScoreEntity;
    localLeaderboardScoreEntity.<init>(this);
    return localLeaderboardScoreEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardScoreRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */