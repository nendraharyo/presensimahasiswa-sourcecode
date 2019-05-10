package com.google.android.gms.games.quest;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface Milestone
  extends Parcelable, Freezable
{
  public static final int STATE_CLAIMED = 4;
  public static final int STATE_COMPLETED_NOT_CLAIMED = 3;
  public static final int STATE_NOT_COMPLETED = 2;
  public static final int STATE_NOT_STARTED = 1;
  
  public abstract byte[] getCompletionRewardData();
  
  public abstract long getCurrentProgress();
  
  public abstract String getEventId();
  
  public abstract String getMilestoneId();
  
  public abstract int getState();
  
  public abstract long getTargetProgress();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\Milestone.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */