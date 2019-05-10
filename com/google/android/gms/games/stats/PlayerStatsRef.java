package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzb;

public class PlayerStatsRef
  extends zzc
  implements PlayerStats
{
  private Bundle zzaLk;
  
  PlayerStatsRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return PlayerStatsEntity.zza(this, paramObject);
  }
  
  public float getAverageSessionLength()
  {
    return getFloat("ave_session_length_minutes");
  }
  
  public float getChurnProbability()
  {
    return getFloat("churn_probability");
  }
  
  public int getDaysSinceLastPlayed()
  {
    return getInteger("days_since_last_played");
  }
  
  public int getNumberOfPurchases()
  {
    return getInteger("num_purchases");
  }
  
  public int getNumberOfSessions()
  {
    return getInteger("num_sessions");
  }
  
  public float getSessionPercentile()
  {
    return getFloat("num_sessions_percentile");
  }
  
  public float getSpendPercentile()
  {
    return getFloat("spend_percentile");
  }
  
  public float getSpendProbability()
  {
    String str = "spend_probability";
    boolean bool = zzcz(str);
    if (!bool) {
      int i = -1082130432;
    }
    for (float f = -1.0F;; f = getFloat(str))
    {
      return f;
      str = "spend_probability";
    }
  }
  
  public int hashCode()
  {
    return PlayerStatsEntity.zza(this);
  }
  
  public String toString()
  {
    return PlayerStatsEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((PlayerStatsEntity)zzxW()).writeToParcel(paramParcel, paramInt);
  }
  
  public Bundle zzxV()
  {
    int i = 0;
    Object localObject1 = this.zzaLk;
    if (localObject1 != null) {}
    for (localObject1 = this.zzaLk;; localObject1 = this.zzaLk)
    {
      return (Bundle)localObject1;
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      this.zzaLk = ((Bundle)localObject1);
      localObject1 = getString("unknown_raw_keys");
      Object localObject2 = getString("unknown_raw_values");
      if ((localObject1 != null) && (localObject2 != null))
      {
        String[] arrayOfString = ((String)localObject1).split(",");
        localObject1 = ",";
        localObject2 = ((String)localObject2).split((String)localObject1);
        int j = arrayOfString.length;
        int m = localObject2.length;
        if (j <= m) {
          j = 1;
        }
        for (;;)
        {
          String str1 = "Invalid raw arguments!";
          zzb.zza(j, str1);
          for (;;)
          {
            k = arrayOfString.length;
            if (i >= k) {
              break;
            }
            localObject1 = this.zzaLk;
            str1 = arrayOfString[i];
            String str2 = localObject2[i];
            ((Bundle)localObject1).putString(str1, str2);
            i += 1;
          }
          int k = 0;
          localObject1 = null;
        }
      }
    }
  }
  
  public PlayerStats zzxW()
  {
    PlayerStatsEntity localPlayerStatsEntity = new com/google/android/gms/games/stats/PlayerStatsEntity;
    localPlayerStatsEntity.<init>(this);
    return localPlayerStatsEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\stats\PlayerStatsRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */