package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class MilestoneBuffer
  extends AbstractDataBuffer
{
  public Milestone get(int paramInt)
  {
    MilestoneRef localMilestoneRef = new com/google/android/gms/games/quest/MilestoneRef;
    DataHolder localDataHolder = this.zzahi;
    localMilestoneRef.<init>(localDataHolder, paramInt);
    return localMilestoneRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\MilestoneBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */