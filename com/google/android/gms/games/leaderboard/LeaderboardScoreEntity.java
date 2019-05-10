package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzms;

public final class LeaderboardScoreEntity
  implements LeaderboardScore
{
  private final long zzaJe;
  private final String zzaJf;
  private final String zzaJg;
  private final long zzaJh;
  private final long zzaJi;
  private final String zzaJj;
  private final Uri zzaJk;
  private final Uri zzaJl;
  private final PlayerEntity zzaJm;
  private final String zzaJn;
  private final String zzaJo;
  private final String zzaJp;
  
  public LeaderboardScoreEntity(LeaderboardScore paramLeaderboardScore)
  {
    long l = paramLeaderboardScore.getRank();
    this.zzaJe = l;
    Object localObject = (String)zzx.zzz(paramLeaderboardScore.getDisplayRank());
    this.zzaJf = ((String)localObject);
    localObject = (String)zzx.zzz(paramLeaderboardScore.getDisplayScore());
    this.zzaJg = ((String)localObject);
    l = paramLeaderboardScore.getRawScore();
    this.zzaJh = l;
    l = paramLeaderboardScore.getTimestampMillis();
    this.zzaJi = l;
    localObject = paramLeaderboardScore.getScoreHolderDisplayName();
    this.zzaJj = ((String)localObject);
    localObject = paramLeaderboardScore.getScoreHolderIconImageUri();
    this.zzaJk = ((Uri)localObject);
    localObject = paramLeaderboardScore.getScoreHolderHiResImageUri();
    this.zzaJl = ((Uri)localObject);
    localObject = paramLeaderboardScore.getScoreHolder();
    if (localObject == null) {}
    for (localObject = null;; localObject = (PlayerEntity)((Player)localObject).freeze())
    {
      this.zzaJm = ((PlayerEntity)localObject);
      localObject = paramLeaderboardScore.getScoreTag();
      this.zzaJn = ((String)localObject);
      localObject = paramLeaderboardScore.getScoreHolderIconImageUrl();
      this.zzaJo = ((String)localObject);
      localObject = paramLeaderboardScore.getScoreHolderHiResImageUrl();
      this.zzaJp = ((String)localObject);
      return;
    }
  }
  
  static int zza(LeaderboardScore paramLeaderboardScore)
  {
    Object[] arrayOfObject = new Object[9];
    Object localObject = Long.valueOf(paramLeaderboardScore.getRank());
    arrayOfObject[0] = localObject;
    localObject = paramLeaderboardScore.getDisplayRank();
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(paramLeaderboardScore.getRawScore());
    arrayOfObject[2] = localObject;
    localObject = paramLeaderboardScore.getDisplayScore();
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(paramLeaderboardScore.getTimestampMillis());
    arrayOfObject[4] = localObject;
    localObject = paramLeaderboardScore.getScoreHolderDisplayName();
    arrayOfObject[5] = localObject;
    localObject = paramLeaderboardScore.getScoreHolderIconImageUri();
    arrayOfObject[6] = localObject;
    localObject = paramLeaderboardScore.getScoreHolderHiResImageUri();
    arrayOfObject[7] = localObject;
    localObject = paramLeaderboardScore.getScoreHolder();
    arrayOfObject[8] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(LeaderboardScore paramLeaderboardScore, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof LeaderboardScore;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramLeaderboardScore != paramObject)
      {
        paramObject = (LeaderboardScore)paramObject;
        long l1 = ((LeaderboardScore)paramObject).getRank();
        Object localObject1 = Long.valueOf(l1);
        long l2 = paramLeaderboardScore.getRank();
        Object localObject2 = Long.valueOf(l2);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((LeaderboardScore)paramObject).getDisplayRank();
          localObject2 = paramLeaderboardScore.getDisplayRank();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            l1 = ((LeaderboardScore)paramObject).getRawScore();
            localObject1 = Long.valueOf(l1);
            l2 = paramLeaderboardScore.getRawScore();
            localObject2 = Long.valueOf(l2);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((LeaderboardScore)paramObject).getDisplayScore();
              localObject2 = paramLeaderboardScore.getDisplayScore();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                l1 = ((LeaderboardScore)paramObject).getTimestampMillis();
                localObject1 = Long.valueOf(l1);
                l2 = paramLeaderboardScore.getTimestampMillis();
                localObject2 = Long.valueOf(l2);
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((LeaderboardScore)paramObject).getScoreHolderDisplayName();
                  localObject2 = paramLeaderboardScore.getScoreHolderDisplayName();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((LeaderboardScore)paramObject).getScoreHolderIconImageUri();
                    localObject2 = paramLeaderboardScore.getScoreHolderIconImageUri();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = ((LeaderboardScore)paramObject).getScoreHolderHiResImageUri();
                      localObject2 = paramLeaderboardScore.getScoreHolderHiResImageUri();
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = ((LeaderboardScore)paramObject).getScoreHolder();
                        localObject2 = paramLeaderboardScore.getScoreHolder();
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((LeaderboardScore)paramObject).getScoreTag();
                          localObject2 = paramLeaderboardScore.getScoreTag();
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
        bool1 = false;
      }
    }
  }
  
  static String zzb(LeaderboardScore paramLeaderboardScore)
  {
    Object localObject1 = zzw.zzy(paramLeaderboardScore);
    Object localObject2 = Long.valueOf(paramLeaderboardScore.getRank());
    localObject1 = ((zzw.zza)localObject1).zzg("Rank", localObject2);
    localObject2 = paramLeaderboardScore.getDisplayRank();
    localObject1 = ((zzw.zza)localObject1).zzg("DisplayRank", localObject2);
    localObject2 = Long.valueOf(paramLeaderboardScore.getRawScore());
    localObject1 = ((zzw.zza)localObject1).zzg("Score", localObject2);
    localObject2 = paramLeaderboardScore.getDisplayScore();
    localObject1 = ((zzw.zza)localObject1).zzg("DisplayScore", localObject2);
    long l = paramLeaderboardScore.getTimestampMillis();
    localObject2 = Long.valueOf(l);
    localObject1 = ((zzw.zza)localObject1).zzg("Timestamp", localObject2);
    localObject2 = paramLeaderboardScore.getScoreHolderDisplayName();
    localObject1 = ((zzw.zza)localObject1).zzg("DisplayName", localObject2);
    localObject2 = paramLeaderboardScore.getScoreHolderIconImageUri();
    localObject1 = ((zzw.zza)localObject1).zzg("IconImageUri", localObject2);
    localObject2 = paramLeaderboardScore.getScoreHolderIconImageUrl();
    localObject1 = ((zzw.zza)localObject1).zzg("IconImageUrl", localObject2);
    localObject2 = paramLeaderboardScore.getScoreHolderHiResImageUri();
    localObject1 = ((zzw.zza)localObject1).zzg("HiResImageUri", localObject2);
    localObject2 = paramLeaderboardScore.getScoreHolderHiResImageUrl();
    zzw.zza localzza = ((zzw.zza)localObject1).zzg("HiResImageUrl", localObject2);
    localObject2 = "Player";
    localObject1 = paramLeaderboardScore.getScoreHolder();
    if (localObject1 == null) {}
    for (localObject1 = null;; localObject1 = paramLeaderboardScore.getScoreHolder())
    {
      localObject1 = localzza.zzg((String)localObject2, localObject1);
      localObject2 = paramLeaderboardScore.getScoreTag();
      return ((zzw.zza)localObject1).zzg("ScoreTag", localObject2).toString();
    }
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public String getDisplayRank()
  {
    return this.zzaJf;
  }
  
  public void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaJf, paramCharArrayBuffer);
  }
  
  public String getDisplayScore()
  {
    return this.zzaJg;
  }
  
  public void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaJg, paramCharArrayBuffer);
  }
  
  public long getRank()
  {
    return this.zzaJe;
  }
  
  public long getRawScore()
  {
    return this.zzaJh;
  }
  
  public Player getScoreHolder()
  {
    return this.zzaJm;
  }
  
  public String getScoreHolderDisplayName()
  {
    Object localObject = this.zzaJm;
    if (localObject == null) {}
    for (localObject = this.zzaJj;; localObject = this.zzaJm.getDisplayName()) {
      return (String)localObject;
    }
  }
  
  public void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    Object localObject = this.zzaJm;
    if (localObject == null)
    {
      localObject = this.zzaJj;
      zzms.zzb((String)localObject, paramCharArrayBuffer);
    }
    for (;;)
    {
      return;
      localObject = this.zzaJm;
      ((PlayerEntity)localObject).getDisplayName(paramCharArrayBuffer);
    }
  }
  
  public Uri getScoreHolderHiResImageUri()
  {
    Object localObject = this.zzaJm;
    if (localObject == null) {}
    for (localObject = this.zzaJl;; localObject = this.zzaJm.getHiResImageUri()) {
      return (Uri)localObject;
    }
  }
  
  public String getScoreHolderHiResImageUrl()
  {
    Object localObject = this.zzaJm;
    if (localObject == null) {}
    for (localObject = this.zzaJp;; localObject = this.zzaJm.getHiResImageUrl()) {
      return (String)localObject;
    }
  }
  
  public Uri getScoreHolderIconImageUri()
  {
    Object localObject = this.zzaJm;
    if (localObject == null) {}
    for (localObject = this.zzaJk;; localObject = this.zzaJm.getIconImageUri()) {
      return (Uri)localObject;
    }
  }
  
  public String getScoreHolderIconImageUrl()
  {
    Object localObject = this.zzaJm;
    if (localObject == null) {}
    for (localObject = this.zzaJo;; localObject = this.zzaJm.getIconImageUrl()) {
      return (String)localObject;
    }
  }
  
  public String getScoreTag()
  {
    return this.zzaJn;
  }
  
  public long getTimestampMillis()
  {
    return this.zzaJi;
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
  
  public LeaderboardScore zzxK()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\LeaderboardScoreEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */