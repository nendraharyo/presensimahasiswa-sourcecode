package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.internal.GamesLog;

public final class MilestoneRef
  extends zzc
  implements Milestone
{
  MilestoneRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  private long zzxQ()
  {
    return getLong("initial_value");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return MilestoneEntity.zza(this, paramObject);
  }
  
  public Milestone freeze()
  {
    MilestoneEntity localMilestoneEntity = new com/google/android/gms/games/quest/MilestoneEntity;
    localMilestoneEntity.<init>(this);
    return localMilestoneEntity;
  }
  
  public byte[] getCompletionRewardData()
  {
    return getByteArray("completion_reward_data");
  }
  
  public long getCurrentProgress()
  {
    long l1 = 0L;
    int i = getState();
    long l2;
    boolean bool2;
    String str1;
    switch (i)
    {
    default: 
      l2 = l1;
      bool2 = l2 < l1;
      if (bool2)
      {
        str1 = "MilestoneRef";
        String str2 = "Current progress should never be negative";
        GamesLog.zzA(str1, str2);
      }
      break;
    }
    for (;;)
    {
      l2 = getTargetProgress();
      boolean bool1 = l1 < l2;
      if (bool1)
      {
        String str3 = "MilestoneRef";
        String str4 = "Current progress should never exceed target progress";
        GamesLog.zzA(str3, str4);
        l1 = getTargetProgress();
      }
      return l1;
      l2 = getTargetProgress();
      break;
      l2 = l1;
      break;
      str1 = "current_value";
      l2 = getLong(str1);
      String str5 = "quest_state";
      long l3 = getLong(str5);
      long l4 = 6;
      bool2 = l3 < l4;
      if (!bool2) {
        break;
      }
      l3 = zzxQ();
      l2 -= l3;
      break;
      l1 = l2;
    }
  }
  
  public String getEventId()
  {
    return getString("external_event_id");
  }
  
  public String getMilestoneId()
  {
    return getString("external_milestone_id");
  }
  
  public int getState()
  {
    return getInteger("milestone_state");
  }
  
  public long getTargetProgress()
  {
    return getLong("target_value");
  }
  
  public int hashCode()
  {
    return MilestoneEntity.zza(this);
  }
  
  public String toString()
  {
    return MilestoneEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((MilestoneEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\MilestoneRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */