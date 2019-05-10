package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public final class PlayerLevelInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final long zzaDd;
  private final long zzaDe;
  private final PlayerLevel zzaDf;
  private final PlayerLevel zzaDg;
  
  static
  {
    PlayerLevelInfoCreator localPlayerLevelInfoCreator = new com/google/android/gms/games/PlayerLevelInfoCreator;
    localPlayerLevelInfoCreator.<init>();
    CREATOR = localPlayerLevelInfoCreator;
  }
  
  PlayerLevelInfo(int paramInt, long paramLong1, long paramLong2, PlayerLevel paramPlayerLevel1, PlayerLevel paramPlayerLevel2)
  {
    long l = -1;
    boolean bool = paramLong1 < l;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      zzx.zzab(bool);
      zzx.zzz(paramPlayerLevel1);
      zzx.zzz(paramPlayerLevel2);
      this.mVersionCode = paramInt;
      this.zzaDd = paramLong1;
      this.zzaDe = paramLong2;
      this.zzaDf = paramPlayerLevel1;
      this.zzaDg = paramPlayerLevel2;
      return;
    }
  }
  
  public PlayerLevelInfo(long paramLong1, long paramLong2, PlayerLevel paramPlayerLevel1, PlayerLevel paramPlayerLevel2)
  {
    this(1, paramLong1, paramLong2, paramPlayerLevel1, paramPlayerLevel2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof PlayerLevelInfo;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != this)
      {
        paramObject = (PlayerLevelInfo)paramObject;
        long l1 = this.zzaDd;
        Object localObject1 = Long.valueOf(l1);
        long l2 = ((PlayerLevelInfo)paramObject).zzaDd;
        Object localObject2 = Long.valueOf(l2);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          l1 = this.zzaDe;
          localObject1 = Long.valueOf(l1);
          l2 = ((PlayerLevelInfo)paramObject).zzaDe;
          localObject2 = Long.valueOf(l2);
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.zzaDf;
            localObject2 = ((PlayerLevelInfo)paramObject).zzaDf;
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = this.zzaDg;
              localObject2 = ((PlayerLevelInfo)paramObject).zzaDg;
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public PlayerLevel getCurrentLevel()
  {
    return this.zzaDf;
  }
  
  public long getCurrentXpTotal()
  {
    return this.zzaDd;
  }
  
  public long getLastLevelUpTimestamp()
  {
    return this.zzaDe;
  }
  
  public PlayerLevel getNextLevel()
  {
    return this.zzaDg;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = Long.valueOf(this.zzaDd);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzaDe);
    arrayOfObject[1] = localObject;
    localObject = this.zzaDf;
    arrayOfObject[2] = localObject;
    localObject = this.zzaDg;
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isMaxLevel()
  {
    PlayerLevel localPlayerLevel1 = this.zzaDf;
    PlayerLevel localPlayerLevel2 = this.zzaDg;
    return localPlayerLevel1.equals(localPlayerLevel2);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    PlayerLevelInfoCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerLevelInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */