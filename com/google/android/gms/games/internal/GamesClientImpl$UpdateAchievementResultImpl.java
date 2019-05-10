package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;

final class GamesClientImpl$UpdateAchievementResultImpl
  implements Achievements.UpdateAchievementResult
{
  private final Status zzUX;
  private final String zzaDj;
  
  GamesClientImpl$UpdateAchievementResultImpl(int paramInt, String paramString)
  {
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    this.zzUX = localStatus;
    this.zzaDj = paramString;
  }
  
  public String getAchievementId()
  {
    return this.zzaDj;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$UpdateAchievementResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */