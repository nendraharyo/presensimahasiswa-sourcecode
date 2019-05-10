package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class LeaderboardRef
  extends zzc
  implements Leaderboard
{
  private final int zzaDQ;
  private final Game zzaJc;
  
  LeaderboardRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.zzaDQ = paramInt2;
    GameRef localGameRef = new com/google/android/gms/games/GameRef;
    localGameRef.<init>(paramDataHolder, paramInt1);
    this.zzaJc = localGameRef;
  }
  
  public boolean equals(Object paramObject)
  {
    return LeaderboardEntity.zza(this, paramObject);
  }
  
  public String getDisplayName()
  {
    return getString("name");
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("name", paramCharArrayBuffer);
  }
  
  public Game getGame()
  {
    return this.zzaJc;
  }
  
  public Uri getIconImageUri()
  {
    return zzcA("board_icon_image_uri");
  }
  
  public String getIconImageUrl()
  {
    return getString("board_icon_image_url");
  }
  
  public String getLeaderboardId()
  {
    return getString("external_leaderboard_id");
  }
  
  public int getScoreOrder()
  {
    return getInteger("score_order");
  }
  
  public ArrayList getVariants()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = this.zzaDQ;
    localArrayList.<init>(i);
    i = 0;
    for (;;)
    {
      int j = this.zzaDQ;
      if (i >= j) {
        break;
      }
      LeaderboardVariantRef localLeaderboardVariantRef = new com/google/android/gms/games/leaderboard/LeaderboardVariantRef;
      DataHolder localDataHolder = this.zzahi;
      int k = this.zzaje + i;
      localLeaderboardVariantRef.<init>(localDataHolder, k);
      localArrayList.add(localLeaderboardVariantRef);
      i += 1;
    }
    return localArrayList;
  }
  
  public int hashCode()
  {
    return LeaderboardEntity.zza(this);
  }
  
  public String toString()
  {
    return LeaderboardEntity.zzb(this);
  }
  
  public Leaderboard zzxI()
  {
    LeaderboardEntity localLeaderboardEntity = new com/google/android/gms/games/leaderboard/LeaderboardEntity;
    localLeaderboardEntity.<init>(this);
    return localLeaderboardEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */