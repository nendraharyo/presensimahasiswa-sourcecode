package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;

public final class LeaderboardEntity
  implements Leaderboard
{
  private final String zzWQ;
  private final Uri zzaCd;
  private final String zzaCo;
  private final String zzaIZ;
  private final int zzaJa;
  private final ArrayList zzaJb;
  private final Game zzaJc;
  
  public LeaderboardEntity(Leaderboard paramLeaderboard)
  {
    Object localObject = paramLeaderboard.getLeaderboardId();
    this.zzaIZ = ((String)localObject);
    localObject = paramLeaderboard.getDisplayName();
    this.zzWQ = ((String)localObject);
    localObject = paramLeaderboard.getIconImageUri();
    this.zzaCd = ((Uri)localObject);
    localObject = paramLeaderboard.getIconImageUrl();
    this.zzaCo = ((String)localObject);
    int i = paramLeaderboard.getScoreOrder();
    this.zzaJa = i;
    Game localGame = paramLeaderboard.getGame();
    if (localGame == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      this.zzaJc = ((Game)localObject);
      ArrayList localArrayList1 = paramLeaderboard.getVariants();
      int j = localArrayList1.size();
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(j);
      this.zzaJb = ((ArrayList)localObject);
      i = 0;
      localObject = null;
      int k = 0;
      localGame = null;
      while (k < j)
      {
        ArrayList localArrayList2 = this.zzaJb;
        localObject = (LeaderboardVariantEntity)((LeaderboardVariant)localArrayList1.get(k)).freeze();
        localArrayList2.add(localObject);
        i = k + 1;
        k = i;
      }
      localObject = new com/google/android/gms/games/GameEntity;
      ((GameEntity)localObject).<init>(localGame);
    }
  }
  
  static int zza(Leaderboard paramLeaderboard)
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = paramLeaderboard.getLeaderboardId();
    arrayOfObject[0] = localObject;
    localObject = paramLeaderboard.getDisplayName();
    arrayOfObject[1] = localObject;
    localObject = paramLeaderboard.getIconImageUri();
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramLeaderboard.getScoreOrder());
    arrayOfObject[3] = localObject;
    localObject = paramLeaderboard.getVariants();
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(Leaderboard paramLeaderboard, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Leaderboard;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramLeaderboard != paramObject)
      {
        paramObject = (Leaderboard)paramObject;
        Object localObject1 = ((Leaderboard)paramObject).getLeaderboardId();
        Object localObject2 = paramLeaderboard.getLeaderboardId();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Leaderboard)paramObject).getDisplayName();
          localObject2 = paramLeaderboard.getDisplayName();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((Leaderboard)paramObject).getIconImageUri();
            localObject2 = paramLeaderboard.getIconImageUri();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Integer.valueOf(((Leaderboard)paramObject).getScoreOrder());
              int i = paramLeaderboard.getScoreOrder();
              localObject2 = Integer.valueOf(i);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Leaderboard)paramObject).getVariants();
                localObject2 = paramLeaderboard.getVariants();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2) {
                  continue;
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(Leaderboard paramLeaderboard)
  {
    zzw.zza localzza = zzw.zzy(paramLeaderboard);
    Object localObject = paramLeaderboard.getLeaderboardId();
    localzza = localzza.zzg("LeaderboardId", localObject);
    localObject = paramLeaderboard.getDisplayName();
    localzza = localzza.zzg("DisplayName", localObject);
    localObject = paramLeaderboard.getIconImageUri();
    localzza = localzza.zzg("IconImageUri", localObject);
    localObject = paramLeaderboard.getIconImageUrl();
    localzza = localzza.zzg("IconImageUrl", localObject);
    localObject = Integer.valueOf(paramLeaderboard.getScoreOrder());
    localzza = localzza.zzg("ScoreOrder", localObject);
    localObject = paramLeaderboard.getVariants();
    return localzza.zzg("Variants", localObject).toString();
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public String getDisplayName()
  {
    return this.zzWQ;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzWQ, paramCharArrayBuffer);
  }
  
  public Game getGame()
  {
    return this.zzaJc;
  }
  
  public Uri getIconImageUri()
  {
    return this.zzaCd;
  }
  
  public String getIconImageUrl()
  {
    return this.zzaCo;
  }
  
  public String getLeaderboardId()
  {
    return this.zzaIZ;
  }
  
  public int getScoreOrder()
  {
    return this.zzaJa;
  }
  
  public ArrayList getVariants()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaJb;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public Leaderboard zzxI()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */