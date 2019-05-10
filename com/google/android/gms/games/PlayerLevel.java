package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;

public final class PlayerLevel
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final int zzaDa;
  private final long zzaDb;
  private final long zzaDc;
  
  static
  {
    PlayerLevelCreator localPlayerLevelCreator = new com/google/android/gms/games/PlayerLevelCreator;
    localPlayerLevelCreator.<init>();
    CREATOR = localPlayerLevelCreator;
  }
  
  PlayerLevel(int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    long l = 0L;
    boolean bool2 = paramLong1 < l;
    if (!bool2)
    {
      bool2 = bool1;
      String str = "Min XP must be positive!";
      zzx.zza(bool2, str);
      bool2 = paramLong2 < paramLong1;
      if (!bool2) {
        break label82;
      }
    }
    for (;;)
    {
      zzx.zza(bool1, "Max XP must be more than min XP!");
      this.mVersionCode = paramInt1;
      this.zzaDa = paramInt2;
      this.zzaDb = paramLong1;
      this.zzaDc = paramLong2;
      return;
      bool2 = false;
      break;
      label82:
      bool1 = false;
    }
  }
  
  public PlayerLevel(int paramInt, long paramLong1, long paramLong2)
  {
    this(1, paramInt, paramLong1, paramLong2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof PlayerLevel;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (this != paramObject)
      {
        paramObject = (PlayerLevel)paramObject;
        Object localObject1 = Integer.valueOf(((PlayerLevel)paramObject).getLevelNumber());
        int i = getLevelNumber();
        Object localObject2 = Integer.valueOf(i);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          long l1 = ((PlayerLevel)paramObject).getMinXp();
          localObject1 = Long.valueOf(l1);
          long l2 = getMinXp();
          localObject2 = Long.valueOf(l2);
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            l1 = ((PlayerLevel)paramObject).getMaxXp();
            localObject1 = Long.valueOf(l1);
            l2 = getMaxXp();
            localObject2 = Long.valueOf(l2);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int getLevelNumber()
  {
    return this.zzaDa;
  }
  
  public long getMaxXp()
  {
    return this.zzaDc;
  }
  
  public long getMinXp()
  {
    return this.zzaDb;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.zzaDa);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzaDb);
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzaDc);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Integer.valueOf(getLevelNumber());
    localzza = localzza.zzg("LevelNumber", localObject);
    localObject = Long.valueOf(getMinXp());
    localzza = localzza.zzg("MinXp", localObject);
    localObject = Long.valueOf(getMaxXp());
    return localzza.zzg("MaxXp", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    PlayerLevelCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerLevel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */