package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;

abstract class AchievementsImpl$LoadImpl
  extends Games.BaseGamesApiMethodImpl
{
  private AchievementsImpl$LoadImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Achievements.LoadAchievementsResult zzZ(Status paramStatus)
  {
    AchievementsImpl.LoadImpl.1 local1 = new com/google/android/gms/games/internal/api/AchievementsImpl$LoadImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\AchievementsImpl$LoadImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */