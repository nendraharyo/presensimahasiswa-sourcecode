package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class MilestoneEntity
  implements SafeParcelable, Milestone
{
  public static final Parcelable.Creator CREATOR;
  private final int mState;
  private final int mVersionCode;
  private final String zzaDU;
  private final String zzaFd;
  private final long zzaKt;
  private final long zzaKu;
  private final byte[] zzaKv;
  
  static
  {
    MilestoneEntityCreator localMilestoneEntityCreator = new com/google/android/gms/games/quest/MilestoneEntityCreator;
    localMilestoneEntityCreator.<init>();
    CREATOR = localMilestoneEntityCreator;
  }
  
  MilestoneEntity(int paramInt1, String paramString1, long paramLong1, long paramLong2, byte[] paramArrayOfByte, int paramInt2, String paramString2)
  {
    this.mVersionCode = paramInt1;
    this.zzaFd = paramString1;
    this.zzaKt = paramLong1;
    this.zzaKu = paramLong2;
    this.zzaKv = paramArrayOfByte;
    this.mState = paramInt2;
    this.zzaDU = paramString2;
  }
  
  public MilestoneEntity(Milestone paramMilestone)
  {
    this.mVersionCode = 4;
    Object localObject = paramMilestone.getMilestoneId();
    this.zzaFd = ((String)localObject);
    long l = paramMilestone.getCurrentProgress();
    this.zzaKt = l;
    l = paramMilestone.getTargetProgress();
    this.zzaKu = l;
    int i = paramMilestone.getState();
    this.mState = i;
    localObject = paramMilestone.getEventId();
    this.zzaDU = ((String)localObject);
    localObject = paramMilestone.getCompletionRewardData();
    if (localObject == null)
    {
      i = 0;
      localObject = null;
      this.zzaKv = null;
    }
    for (;;)
    {
      return;
      int j = localObject.length;
      byte[] arrayOfByte = new byte[j];
      this.zzaKv = arrayOfByte;
      arrayOfByte = this.zzaKv;
      int k = localObject.length;
      System.arraycopy(localObject, 0, arrayOfByte, 0, k);
    }
  }
  
  static int zza(Milestone paramMilestone)
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = paramMilestone.getMilestoneId();
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(paramMilestone.getCurrentProgress());
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(paramMilestone.getTargetProgress());
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramMilestone.getState());
    arrayOfObject[3] = localObject;
    localObject = paramMilestone.getEventId();
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(Milestone paramMilestone, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Milestone;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramMilestone != paramObject)
      {
        paramObject = (Milestone)paramObject;
        Object localObject1 = ((Milestone)paramObject).getMilestoneId();
        Object localObject2 = paramMilestone.getMilestoneId();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          long l1 = ((Milestone)paramObject).getCurrentProgress();
          localObject1 = Long.valueOf(l1);
          long l2 = paramMilestone.getCurrentProgress();
          localObject2 = Long.valueOf(l2);
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            l1 = ((Milestone)paramObject).getTargetProgress();
            localObject1 = Long.valueOf(l1);
            l2 = paramMilestone.getTargetProgress();
            localObject2 = Long.valueOf(l2);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Integer.valueOf(((Milestone)paramObject).getState());
              int i = paramMilestone.getState();
              localObject2 = Integer.valueOf(i);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Milestone)paramObject).getEventId();
                localObject2 = paramMilestone.getEventId();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2) {
                  continue;
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(Milestone paramMilestone)
  {
    zzw.zza localzza = zzw.zzy(paramMilestone);
    Object localObject = paramMilestone.getMilestoneId();
    localzza = localzza.zzg("MilestoneId", localObject);
    localObject = Long.valueOf(paramMilestone.getCurrentProgress());
    localzza = localzza.zzg("CurrentProgress", localObject);
    localObject = Long.valueOf(paramMilestone.getTargetProgress());
    localzza = localzza.zzg("TargetProgress", localObject);
    localObject = Integer.valueOf(paramMilestone.getState());
    localzza = localzza.zzg("State", localObject);
    localObject = paramMilestone.getCompletionRewardData();
    localzza = localzza.zzg("CompletionRewardData", localObject);
    localObject = paramMilestone.getEventId();
    return localzza.zzg("EventId", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Milestone freeze()
  {
    return this;
  }
  
  public byte[] getCompletionRewardData()
  {
    return this.zzaKv;
  }
  
  public long getCurrentProgress()
  {
    return this.zzaKt;
  }
  
  public String getEventId()
  {
    return this.zzaDU;
  }
  
  public String getMilestoneId()
  {
    return this.zzaFd;
  }
  
  public int getState()
  {
    return this.mState;
  }
  
  public long getTargetProgress()
  {
    return this.zzaKu;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    MilestoneEntityCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\MilestoneEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */