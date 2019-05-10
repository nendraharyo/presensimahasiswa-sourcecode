package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public class PlayerStatsEntity
  implements SafeParcelable, PlayerStats
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final float zzaLd;
  private final float zzaLe;
  private final int zzaLf;
  private final int zzaLg;
  private final int zzaLh;
  private final float zzaLi;
  private final float zzaLj;
  private final Bundle zzaLk;
  private final float zzaLl;
  
  static
  {
    PlayerStatsEntityCreator localPlayerStatsEntityCreator = new com/google/android/gms/games/stats/PlayerStatsEntityCreator;
    localPlayerStatsEntityCreator.<init>();
    CREATOR = localPlayerStatsEntityCreator;
  }
  
  PlayerStatsEntity(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4, Bundle paramBundle, float paramFloat5)
  {
    this.mVersionCode = paramInt1;
    this.zzaLd = paramFloat1;
    this.zzaLe = paramFloat2;
    this.zzaLf = paramInt2;
    this.zzaLg = paramInt3;
    this.zzaLh = paramInt4;
    this.zzaLi = paramFloat3;
    this.zzaLj = paramFloat4;
    this.zzaLk = paramBundle;
    this.zzaLl = paramFloat5;
  }
  
  public PlayerStatsEntity(PlayerStats paramPlayerStats)
  {
    this.mVersionCode = 3;
    float f = paramPlayerStats.getAverageSessionLength();
    this.zzaLd = f;
    f = paramPlayerStats.getChurnProbability();
    this.zzaLe = f;
    int i = paramPlayerStats.getDaysSinceLastPlayed();
    this.zzaLf = i;
    i = paramPlayerStats.getNumberOfPurchases();
    this.zzaLg = i;
    i = paramPlayerStats.getNumberOfSessions();
    this.zzaLh = i;
    f = paramPlayerStats.getSessionPercentile();
    this.zzaLi = f;
    f = paramPlayerStats.getSpendPercentile();
    this.zzaLj = f;
    f = paramPlayerStats.getSpendProbability();
    this.zzaLl = f;
    Bundle localBundle = paramPlayerStats.zzxV();
    this.zzaLk = localBundle;
  }
  
  static int zza(PlayerStats paramPlayerStats)
  {
    Object[] arrayOfObject = new Object[8];
    Object localObject = Float.valueOf(paramPlayerStats.getAverageSessionLength());
    arrayOfObject[0] = localObject;
    localObject = Float.valueOf(paramPlayerStats.getChurnProbability());
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(paramPlayerStats.getDaysSinceLastPlayed());
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramPlayerStats.getNumberOfPurchases());
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramPlayerStats.getNumberOfSessions());
    arrayOfObject[4] = localObject;
    localObject = Float.valueOf(paramPlayerStats.getSessionPercentile());
    arrayOfObject[5] = localObject;
    localObject = Float.valueOf(paramPlayerStats.getSpendPercentile());
    arrayOfObject[6] = localObject;
    localObject = Float.valueOf(paramPlayerStats.getSpendProbability());
    arrayOfObject[7] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(PlayerStats paramPlayerStats, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof PlayerStats;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramPlayerStats != paramObject)
      {
        paramObject = (PlayerStats)paramObject;
        float f1 = ((PlayerStats)paramObject).getAverageSessionLength();
        Object localObject1 = Float.valueOf(f1);
        float f2 = paramPlayerStats.getAverageSessionLength();
        Object localObject2 = Float.valueOf(f2);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          f1 = ((PlayerStats)paramObject).getChurnProbability();
          localObject1 = Float.valueOf(f1);
          f2 = paramPlayerStats.getChurnProbability();
          localObject2 = Float.valueOf(f2);
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = Integer.valueOf(((PlayerStats)paramObject).getDaysSinceLastPlayed());
            int i = paramPlayerStats.getDaysSinceLastPlayed();
            localObject2 = Integer.valueOf(i);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Integer.valueOf(((PlayerStats)paramObject).getNumberOfPurchases());
              i = paramPlayerStats.getNumberOfPurchases();
              localObject2 = Integer.valueOf(i);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = Integer.valueOf(((PlayerStats)paramObject).getNumberOfSessions());
                i = paramPlayerStats.getNumberOfSessions();
                localObject2 = Integer.valueOf(i);
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  f1 = ((PlayerStats)paramObject).getSessionPercentile();
                  localObject1 = Float.valueOf(f1);
                  f2 = paramPlayerStats.getSessionPercentile();
                  localObject2 = Float.valueOf(f2);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    f1 = ((PlayerStats)paramObject).getSpendPercentile();
                    localObject1 = Float.valueOf(f1);
                    f2 = paramPlayerStats.getSpendPercentile();
                    localObject2 = Float.valueOf(f2);
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      f1 = ((PlayerStats)paramObject).getSpendProbability();
                      localObject1 = Float.valueOf(f1);
                      f2 = paramPlayerStats.getSpendProbability();
                      localObject2 = Float.valueOf(f2);
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
        bool1 = false;
      }
    }
  }
  
  static String zzb(PlayerStats paramPlayerStats)
  {
    zzw.zza localzza = zzw.zzy(paramPlayerStats);
    Object localObject = Float.valueOf(paramPlayerStats.getAverageSessionLength());
    localzza = localzza.zzg("AverageSessionLength", localObject);
    localObject = Float.valueOf(paramPlayerStats.getChurnProbability());
    localzza = localzza.zzg("ChurnProbability", localObject);
    localObject = Integer.valueOf(paramPlayerStats.getDaysSinceLastPlayed());
    localzza = localzza.zzg("DaysSinceLastPlayed", localObject);
    localObject = Integer.valueOf(paramPlayerStats.getNumberOfPurchases());
    localzza = localzza.zzg("NumberOfPurchases", localObject);
    localObject = Integer.valueOf(paramPlayerStats.getNumberOfSessions());
    localzza = localzza.zzg("NumberOfSessions", localObject);
    localObject = Float.valueOf(paramPlayerStats.getSessionPercentile());
    localzza = localzza.zzg("SessionPercentile", localObject);
    localObject = Float.valueOf(paramPlayerStats.getSpendPercentile());
    localzza = localzza.zzg("SpendPercentile", localObject);
    localObject = Float.valueOf(paramPlayerStats.getSpendProbability());
    return localzza.zzg("SpendProbability", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public float getAverageSessionLength()
  {
    return this.zzaLd;
  }
  
  public float getChurnProbability()
  {
    return this.zzaLe;
  }
  
  public int getDaysSinceLastPlayed()
  {
    return this.zzaLf;
  }
  
  public int getNumberOfPurchases()
  {
    return this.zzaLg;
  }
  
  public int getNumberOfSessions()
  {
    return this.zzaLh;
  }
  
  public float getSessionPercentile()
  {
    return this.zzaLi;
  }
  
  public float getSpendPercentile()
  {
    return this.zzaLj;
  }
  
  public float getSpendProbability()
  {
    return this.zzaLl;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
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
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    PlayerStatsEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public Bundle zzxV()
  {
    return this.zzaLk;
  }
  
  public PlayerStats zzxW()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\stats\PlayerStatsEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */