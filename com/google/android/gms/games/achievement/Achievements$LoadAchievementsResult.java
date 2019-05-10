package com.google.android.gms.games.achievement;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Achievements$LoadAchievementsResult
  extends Releasable, Result
{
  public abstract AchievementBuffer getAchievements();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\achievement\Achievements$LoadAchievementsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */