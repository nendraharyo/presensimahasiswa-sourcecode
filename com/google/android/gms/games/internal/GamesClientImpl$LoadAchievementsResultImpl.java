package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;

final class GamesClientImpl$LoadAchievementsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Achievements.LoadAchievementsResult
{
  private final AchievementBuffer zzaEy;
  
  GamesClientImpl$LoadAchievementsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    AchievementBuffer localAchievementBuffer = new com/google/android/gms/games/achievement/AchievementBuffer;
    localAchievementBuffer.<init>(paramDataHolder);
    this.zzaEy = localAchievementBuffer;
  }
  
  public AchievementBuffer getAchievements()
  {
    return this.zzaEy;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadAchievementsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */