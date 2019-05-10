package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class AchievementBuffer
  extends AbstractDataBuffer
{
  public AchievementBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public Achievement get(int paramInt)
  {
    AchievementRef localAchievementRef = new com/google/android/gms/games/achievement/AchievementRef;
    DataHolder localDataHolder = this.zzahi;
    localAchievementRef.<init>(localDataHolder, paramInt);
    return localAchievementRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\achievement\AchievementBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */