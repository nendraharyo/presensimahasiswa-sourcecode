package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;

class AchievementsImpl$LoadImpl$1
  implements Achievements.LoadAchievementsResult
{
  AchievementsImpl$LoadImpl$1(AchievementsImpl.LoadImpl paramLoadImpl, Status paramStatus) {}
  
  public AchievementBuffer getAchievements()
  {
    AchievementBuffer localAchievementBuffer = new com/google/android/gms/games/achievement/AchievementBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localAchievementBuffer.<init>(localDataHolder);
    return localAchievementBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\AchievementsImpl$LoadImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */