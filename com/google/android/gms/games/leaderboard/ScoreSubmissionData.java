package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.internal.constants.TimeSpan;
import java.util.HashMap;

public final class ScoreSubmissionData
{
  private static final String[] zzaIX;
  private String zzaIZ;
  private HashMap zzaJD;
  private String zzacX;
  private int zzade;
  
  static
  {
    String[] arrayOfString = new String[8];
    arrayOfString[0] = "leaderboardId";
    arrayOfString[1] = "playerId";
    arrayOfString[2] = "timeSpan";
    arrayOfString[3] = "hasResult";
    arrayOfString[4] = "rawScore";
    arrayOfString[5] = "formattedScore";
    arrayOfString[6] = "newBest";
    arrayOfString[7] = "scoreTag";
    zzaIX = arrayOfString;
  }
  
  public ScoreSubmissionData(DataHolder paramDataHolder)
  {
    int j = paramDataHolder.getStatusCode();
    this.zzade = j;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaJD = localHashMap;
    int m = paramDataHolder.getCount();
    j = 3;
    if (m == j) {
      j = 1;
    }
    for (;;)
    {
      zzx.zzac(j);
      int k = 0;
      localHashMap = null;
      while (k < m)
      {
        int n = paramDataHolder.zzbH(k);
        if (k == 0)
        {
          localObject = paramDataHolder.zzd("leaderboardId", k, n);
          this.zzaIZ = ((String)localObject);
          localObject = paramDataHolder.zzd("playerId", k, n);
          this.zzacX = ((String)localObject);
        }
        localObject = "hasResult";
        bool1 = paramDataHolder.zze((String)localObject, k, n);
        if (bool1)
        {
          localObject = new com/google/android/gms/games/leaderboard/ScoreSubmissionData$Result;
          long l = paramDataHolder.zzb("rawScore", k, n);
          String str1 = paramDataHolder.zzd("formattedScore", k, n);
          String str2 = paramDataHolder.zzd("scoreTag", k, n);
          String str3 = "newBest";
          boolean bool2 = paramDataHolder.zze(str3, k, n);
          ((ScoreSubmissionData.Result)localObject).<init>(l, str1, str2, bool2);
          String str4 = "timeSpan";
          int i1 = paramDataHolder.zzc(str4, k, n);
          zza((ScoreSubmissionData.Result)localObject, i1);
        }
        int i = k + 1;
        k = i;
      }
      k = 0;
      localHashMap = null;
    }
  }
  
  private void zza(ScoreSubmissionData.Result paramResult, int paramInt)
  {
    HashMap localHashMap = this.zzaJD;
    Integer localInteger = Integer.valueOf(paramInt);
    localHashMap.put(localInteger, paramResult);
  }
  
  public String getLeaderboardId()
  {
    return this.zzaIZ;
  }
  
  public String getPlayerId()
  {
    return this.zzacX;
  }
  
  public ScoreSubmissionData.Result getScoreResult(int paramInt)
  {
    HashMap localHashMap = this.zzaJD;
    Integer localInteger = Integer.valueOf(paramInt);
    return (ScoreSubmissionData.Result)localHashMap.get(localInteger);
  }
  
  public String toString()
  {
    Object localObject1 = zzw.zzy(this);
    Object localObject2 = this.zzacX;
    localObject1 = ((zzw.zza)localObject1).zzg("PlayerId", localObject2);
    int i = this.zzade;
    localObject2 = Integer.valueOf(i);
    localObject2 = ((zzw.zza)localObject1).zzg("StatusCode", localObject2);
    int j = 0;
    localObject1 = null;
    int k = 0;
    j = 3;
    if (k < j)
    {
      localObject1 = this.zzaJD;
      Object localObject3 = Integer.valueOf(k);
      localObject1 = (ScoreSubmissionData.Result)((HashMap)localObject1).get(localObject3);
      String str = TimeSpan.zzgw(k);
      ((zzw.zza)localObject2).zzg("TimesSpan", str);
      localObject3 = "Result";
      if (localObject1 == null) {}
      for (localObject1 = "null";; localObject1 = ((ScoreSubmissionData.Result)localObject1).toString())
      {
        ((zzw.zza)localObject2).zzg((String)localObject3, localObject1);
        j = k + 1;
        k = j;
        break;
      }
    }
    return ((zzw.zza)localObject2).toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\leaderboard\ScoreSubmissionData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */