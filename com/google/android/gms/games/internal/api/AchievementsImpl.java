package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl
  implements Achievements
{
  public Intent getAchievementsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwA();
  }
  
  public void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    AchievementsImpl.6 local6 = new com/google/android/gms/games/internal/api/AchievementsImpl$6;
    local6.<init>(this, paramString, paramGoogleApiClient, paramString, paramInt);
    paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult incrementImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    AchievementsImpl.7 local7 = new com/google/android/gms/games/internal/api/AchievementsImpl$7;
    local7.<init>(this, paramString, paramGoogleApiClient, paramString, paramInt);
    return paramGoogleApiClient.zzb(local7);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    AchievementsImpl.1 local1 = new com/google/android/gms/games/internal/api/AchievementsImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramBoolean);
    return paramGoogleApiClient.zza(local1);
  }
  
  public void reveal(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    AchievementsImpl.2 local2 = new com/google/android/gms/games/internal/api/AchievementsImpl$2;
    local2.<init>(this, paramString, paramGoogleApiClient, paramString);
    paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult revealImmediate(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    AchievementsImpl.3 local3 = new com/google/android/gms/games/internal/api/AchievementsImpl$3;
    local3.<init>(this, paramString, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public void setSteps(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    AchievementsImpl.8 local8 = new com/google/android/gms/games/internal/api/AchievementsImpl$8;
    local8.<init>(this, paramString, paramGoogleApiClient, paramString, paramInt);
    paramGoogleApiClient.zzb(local8);
  }
  
  public PendingResult setStepsImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    AchievementsImpl.9 local9 = new com/google/android/gms/games/internal/api/AchievementsImpl$9;
    local9.<init>(this, paramString, paramGoogleApiClient, paramString, paramInt);
    return paramGoogleApiClient.zzb(local9);
  }
  
  public void unlock(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    AchievementsImpl.4 local4 = new com/google/android/gms/games/internal/api/AchievementsImpl$4;
    local4.<init>(this, paramString, paramGoogleApiClient, paramString);
    paramGoogleApiClient.zzb(local4);
  }
  
  public PendingResult unlockImmediate(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    AchievementsImpl.5 local5 = new com/google/android/gms/games/internal/api/AchievementsImpl$5;
    local5.<init>(this, paramString, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local5);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\AchievementsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */