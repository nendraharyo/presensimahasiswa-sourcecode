package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

public final class LeaderboardVariantEntity
  implements LeaderboardVariant
{
  private final String zzaJA;
  private final String zzaJB;
  private final String zzaJC;
  private final int zzaJr;
  private final int zzaJs;
  private final boolean zzaJt;
  private final long zzaJu;
  private final String zzaJv;
  private final long zzaJw;
  private final String zzaJx;
  private final String zzaJy;
  private final long zzaJz;
  
  public LeaderboardVariantEntity(LeaderboardVariant paramLeaderboardVariant)
  {
    int i = paramLeaderboardVariant.getTimeSpan();
    this.zzaJr = i;
    i = paramLeaderboardVariant.getCollection();
    this.zzaJs = i;
    boolean bool = paramLeaderboardVariant.hasPlayerInfo();
    this.zzaJt = bool;
    long l = paramLeaderboardVariant.getRawPlayerScore();
    this.zzaJu = l;
    String str = paramLeaderboardVariant.getDisplayPlayerScore();
    this.zzaJv = str;
    l = paramLeaderboardVariant.getPlayerRank();
    this.zzaJw = l;
    str = paramLeaderboardVariant.getDisplayPlayerRank();
    this.zzaJx = str;
    str = paramLeaderboardVariant.getPlayerScoreTag();
    this.zzaJy = str;
    l = paramLeaderboardVariant.getNumScores();
    this.zzaJz = l;
    str = paramLeaderboardVariant.zzxL();
    this.zzaJA = str;
    str = paramLeaderboardVariant.zzxM();
    this.zzaJB = str;
    str = paramLeaderboardVariant.zzxN();
    this.zzaJC = str;
  }
  
  static int zza(LeaderboardVariant paramLeaderboardVariant)
  {
    Object[] arrayOfObject = new Object[11];
    Object localObject = Integer.valueOf(paramLeaderboardVariant.getTimeSpan());
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(paramLeaderboardVariant.getCollection());
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(paramLeaderboardVariant.hasPlayerInfo());
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(paramLeaderboardVariant.getRawPlayerScore());
    arrayOfObject[3] = localObject;
    localObject = paramLeaderboardVariant.getDisplayPlayerScore();
    arrayOfObject[4] = localObject;
    localObject = Long.valueOf(paramLeaderboardVariant.getPlayerRank());
    arrayOfObject[5] = localObject;
    localObject = paramLeaderboardVariant.getDisplayPlayerRank();
    arrayOfObject[6] = localObject;
    localObject = Long.valueOf(paramLeaderboardVariant.getNumScores());
    arrayOfObject[7] = localObject;
    localObject = paramLeaderboardVariant.zzxL();
    arrayOfObject[8] = localObject;
    localObject = paramLeaderboardVariant.zzxN();
    arrayOfObject[9] = localObject;
    localObject = paramLeaderboardVariant.zzxM();
    arrayOfObject[10] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(LeaderboardVariant paramLeaderboardVariant, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof LeaderboardVariant;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramLeaderboardVariant != paramObject)
      {
        paramObject = (LeaderboardVariant)paramObject;
        Object localObject1 = Integer.valueOf(((LeaderboardVariant)paramObject).getTimeSpan());
        int i = paramLeaderboardVariant.getTimeSpan();
        Object localObject2 = Integer.valueOf(i);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = Integer.valueOf(((LeaderboardVariant)paramObject).getCollection());
          i = paramLeaderboardVariant.getCollection();
          localObject2 = Integer.valueOf(i);
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = Boolean.valueOf(((LeaderboardVariant)paramObject).hasPlayerInfo());
            boolean bool3 = paramLeaderboardVariant.hasPlayerInfo();
            localObject2 = Boolean.valueOf(bool3);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              long l1 = ((LeaderboardVariant)paramObject).getRawPlayerScore();
              localObject1 = Long.valueOf(l1);
              long l2 = paramLeaderboardVariant.getRawPlayerScore();
              localObject2 = Long.valueOf(l2);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((LeaderboardVariant)paramObject).getDisplayPlayerScore();
                localObject2 = paramLeaderboardVariant.getDisplayPlayerScore();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  l1 = ((LeaderboardVariant)paramObject).getPlayerRank();
                  localObject1 = Long.valueOf(l1);
                  l2 = paramLeaderboardVariant.getPlayerRank();
                  localObject2 = Long.valueOf(l2);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((LeaderboardVariant)paramObject).getDisplayPlayerRank();
                    localObject2 = paramLeaderboardVariant.getDisplayPlayerRank();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      l1 = ((LeaderboardVariant)paramObject).getNumScores();
                      localObject1 = Long.valueOf(l1);
                      l2 = paramLeaderboardVariant.getNumScores();
                      localObject2 = Long.valueOf(l2);
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = ((LeaderboardVariant)paramObject).zzxL();
                        localObject2 = paramLeaderboardVariant.zzxL();
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((LeaderboardVariant)paramObject).zzxN();
                          localObject2 = paramLeaderboardVariant.zzxN();
                          bool2 = zzw.equal(localObject1, localObject2);
                          if (bool2)
                          {
                            localObject1 = ((LeaderboardVariant)paramObject).zzxM();
                            localObject2 = paramLeaderboardVariant.zzxM();
                            bool2 = zzw.equal(localObject1, localObject2);
                            if (bool2) {
                              continue;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(LeaderboardVariant paramLeaderboardVariant)
  {
    Object localObject1 = zzw.zzy(paramLeaderboardVariant);
    Object localObject2 = TimeSpan.zzgw(paramLeaderboardVariant.getTimeSpan());
    localObject1 = ((zzw.zza)localObject1).zzg("TimeSpan", localObject2);
    int i = paramLeaderboardVariant.getCollection();
    localObject2 = LeaderboardCollection.zzgw(i);
    zzw.zza localzza = ((zzw.zza)localObject1).zzg("Collection", localObject2);
    localObject2 = "RawPlayerScore";
    boolean bool = paramLeaderboardVariant.hasPlayerInfo();
    if (bool)
    {
      long l = paramLeaderboardVariant.getRawPlayerScore();
      localObject1 = Long.valueOf(l);
      localzza = localzza.zzg((String)localObject2, localObject1);
      localObject2 = "DisplayPlayerScore";
      bool = paramLeaderboardVariant.hasPlayerInfo();
      if (!bool) {
        break label257;
      }
      localObject1 = paramLeaderboardVariant.getDisplayPlayerScore();
      label106:
      localzza = localzza.zzg((String)localObject2, localObject1);
      localObject2 = "PlayerRank";
      bool = paramLeaderboardVariant.hasPlayerInfo();
      if (!bool) {
        break label263;
      }
      l = paramLeaderboardVariant.getPlayerRank();
      localObject1 = Long.valueOf(l);
      label145:
      localzza = localzza.zzg((String)localObject2, localObject1);
      localObject2 = "DisplayPlayerRank";
      bool = paramLeaderboardVariant.hasPlayerInfo();
      if (!bool) {
        break label269;
      }
    }
    label257:
    label263:
    label269:
    for (localObject1 = paramLeaderboardVariant.getDisplayPlayerRank();; localObject1 = "none")
    {
      localObject1 = localzza.zzg((String)localObject2, localObject1);
      localObject2 = Long.valueOf(paramLeaderboardVariant.getNumScores());
      localObject1 = ((zzw.zza)localObject1).zzg("NumScores", localObject2);
      localObject2 = paramLeaderboardVariant.zzxL();
      localObject1 = ((zzw.zza)localObject1).zzg("TopPageNextToken", localObject2);
      localObject2 = paramLeaderboardVariant.zzxN();
      localObject1 = ((zzw.zza)localObject1).zzg("WindowPageNextToken", localObject2);
      localObject2 = paramLeaderboardVariant.zzxM();
      return ((zzw.zza)localObject1).zzg("WindowPagePrevToken", localObject2).toString();
      localObject1 = "none";
      break;
      localObject1 = "none";
      break label106;
      localObject1 = "none";
      break label145;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public int getCollection()
  {
    return this.zzaJs;
  }
  
  public String getDisplayPlayerRank()
  {
    return this.zzaJx;
  }
  
  public String getDisplayPlayerScore()
  {
    return this.zzaJv;
  }
  
  public long getNumScores()
  {
    return this.zzaJz;
  }
  
  public long getPlayerRank()
  {
    return this.zzaJw;
  }
  
  public String getPlayerScoreTag()
  {
    return this.zzaJy;
  }
  
  public long getRawPlayerScore()
  {
    return this.zzaJu;
  }
  
  public int getTimeSpan()
  {
    return this.zzaJr;
  }
  
  public boolean hasPlayerInfo()
  {
    return this.zzaJt;
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
  
  public String zzxL()
  {
    return this.zzaJA;
  }
  
  public String zzxM()
  {
    return this.zzaJB;
  }
  
  public String zzxN()
  {
    return this.zzaJC;
  }
  
  public LeaderboardVariant zzxO()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardVariantEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */