package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzms;

public final class AchievementEntity
  implements SafeParcelable, Achievement
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  private final int mState;
  private final int mVersionCode;
  private final String zzaDj;
  private final Uri zzaDk;
  private final String zzaDl;
  private final Uri zzaDm;
  private final String zzaDn;
  private final int zzaDo;
  private final String zzaDp;
  private final PlayerEntity zzaDq;
  private final int zzaDr;
  private final String zzaDs;
  private final long zzaDt;
  private final long zzaDu;
  private final int zzabB;
  private final String zzaxl;
  
  static
  {
    AchievementEntityCreator localAchievementEntityCreator = new com/google/android/gms/games/achievement/AchievementEntityCreator;
    localAchievementEntityCreator.<init>();
    CREATOR = localAchievementEntityCreator;
  }
  
  AchievementEntity(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, Uri paramUri1, String paramString4, Uri paramUri2, String paramString5, int paramInt3, String paramString6, PlayerEntity paramPlayerEntity, int paramInt4, int paramInt5, String paramString7, long paramLong1, long paramLong2)
  {
    this.mVersionCode = paramInt1;
    this.zzaDj = paramString1;
    this.zzabB = paramInt2;
    this.mName = paramString2;
    this.zzaxl = paramString3;
    this.zzaDk = paramUri1;
    this.zzaDl = paramString4;
    this.zzaDm = paramUri2;
    this.zzaDn = paramString5;
    this.zzaDo = paramInt3;
    this.zzaDp = paramString6;
    this.zzaDq = paramPlayerEntity;
    this.mState = paramInt4;
    this.zzaDr = paramInt5;
    this.zzaDs = paramString7;
    this.zzaDt = paramLong1;
    this.zzaDu = paramLong2;
  }
  
  public AchievementEntity(Achievement paramAchievement)
  {
    this.mVersionCode = i;
    Object localObject = paramAchievement.getAchievementId();
    this.zzaDj = ((String)localObject);
    int j = paramAchievement.getType();
    this.zzabB = j;
    localObject = paramAchievement.getName();
    this.mName = ((String)localObject);
    localObject = paramAchievement.getDescription();
    this.zzaxl = ((String)localObject);
    localObject = paramAchievement.getUnlockedImageUri();
    this.zzaDk = ((Uri)localObject);
    localObject = paramAchievement.getUnlockedImageUrl();
    this.zzaDl = ((String)localObject);
    localObject = paramAchievement.getRevealedImageUri();
    this.zzaDm = ((Uri)localObject);
    localObject = paramAchievement.getRevealedImageUrl();
    this.zzaDn = ((String)localObject);
    localObject = (PlayerEntity)paramAchievement.getPlayer().freeze();
    this.zzaDq = ((PlayerEntity)localObject);
    j = paramAchievement.getState();
    this.mState = j;
    long l = paramAchievement.getLastUpdatedTimestamp();
    this.zzaDt = l;
    l = paramAchievement.getXpValue();
    this.zzaDu = l;
    j = paramAchievement.getType();
    if (j == i)
    {
      j = paramAchievement.getTotalSteps();
      this.zzaDo = j;
      localObject = paramAchievement.getFormattedTotalSteps();
      this.zzaDp = ((String)localObject);
      j = paramAchievement.getCurrentSteps();
      this.zzaDr = j;
      localObject = paramAchievement.getFormattedCurrentSteps();
    }
    for (this.zzaDs = ((String)localObject);; this.zzaDs = null)
    {
      zzb.zzv(this.zzaDj);
      zzb.zzv(this.zzaxl);
      return;
      this.zzaDo = 0;
      this.zzaDp = null;
      this.zzaDr = 0;
    }
  }
  
  static int zza(Achievement paramAchievement)
  {
    int i = 1;
    String str = null;
    int j = paramAchievement.getType();
    int k;
    if (j == i)
    {
      k = paramAchievement.getCurrentSteps();
      j = paramAchievement.getTotalSteps();
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[10];
      Object localObject = paramAchievement.getAchievementId();
      arrayOfObject[0] = localObject;
      str = paramAchievement.getName();
      arrayOfObject[i] = str;
      localObject = Integer.valueOf(paramAchievement.getType());
      arrayOfObject[2] = localObject;
      localObject = paramAchievement.getDescription();
      arrayOfObject[3] = localObject;
      localObject = Long.valueOf(paramAchievement.getXpValue());
      arrayOfObject[4] = localObject;
      localObject = Integer.valueOf(paramAchievement.getState());
      arrayOfObject[5] = localObject;
      localObject = Long.valueOf(paramAchievement.getLastUpdatedTimestamp());
      arrayOfObject[6] = localObject;
      localObject = paramAchievement.getPlayer();
      arrayOfObject[7] = localObject;
      Integer localInteger1 = Integer.valueOf(k);
      arrayOfObject[8] = localInteger1;
      Integer localInteger2 = Integer.valueOf(j);
      arrayOfObject[9] = localInteger2;
      return zzw.hashCode(arrayOfObject);
      j = 0;
      localInteger2 = null;
      k = 0;
      localInteger1 = null;
    }
  }
  
  static boolean zza(Achievement paramAchievement, Object paramObject)
  {
    int i = 1;
    boolean bool1 = paramObject instanceof Achievement;
    if (!bool1) {
      i = 0;
    }
    while (paramAchievement == paramObject) {
      return i;
    }
    paramObject = (Achievement)paramObject;
    int j = paramAchievement.getType();
    boolean bool3;
    Object localObject1;
    boolean bool2;
    if (j == i)
    {
      Integer localInteger1 = Integer.valueOf(((Achievement)paramObject).getCurrentSteps());
      Integer localInteger2 = Integer.valueOf(paramAchievement.getCurrentSteps());
      bool3 = zzw.equal(localInteger1, localInteger2);
      localInteger1 = Integer.valueOf(((Achievement)paramObject).getTotalSteps());
      int k = paramAchievement.getTotalSteps();
      localObject1 = Integer.valueOf(k);
      bool2 = zzw.equal(localInteger1, localObject1);
    }
    for (;;)
    {
      localObject1 = ((Achievement)paramObject).getAchievementId();
      Object localObject2 = paramAchievement.getAchievementId();
      boolean bool4 = zzw.equal(localObject1, localObject2);
      if (bool4)
      {
        localObject1 = ((Achievement)paramObject).getName();
        localObject2 = paramAchievement.getName();
        bool4 = zzw.equal(localObject1, localObject2);
        if (bool4)
        {
          localObject1 = Integer.valueOf(((Achievement)paramObject).getType());
          int m = paramAchievement.getType();
          localObject2 = Integer.valueOf(m);
          bool4 = zzw.equal(localObject1, localObject2);
          if (bool4)
          {
            localObject1 = ((Achievement)paramObject).getDescription();
            localObject2 = paramAchievement.getDescription();
            bool4 = zzw.equal(localObject1, localObject2);
            if (bool4)
            {
              long l1 = ((Achievement)paramObject).getXpValue();
              localObject1 = Long.valueOf(l1);
              long l2 = paramAchievement.getXpValue();
              localObject2 = Long.valueOf(l2);
              bool4 = zzw.equal(localObject1, localObject2);
              if (bool4)
              {
                localObject1 = Integer.valueOf(((Achievement)paramObject).getState());
                m = paramAchievement.getState();
                localObject2 = Integer.valueOf(m);
                bool4 = zzw.equal(localObject1, localObject2);
                if (bool4)
                {
                  l1 = ((Achievement)paramObject).getLastUpdatedTimestamp();
                  localObject1 = Long.valueOf(l1);
                  l2 = paramAchievement.getLastUpdatedTimestamp();
                  localObject2 = Long.valueOf(l2);
                  bool4 = zzw.equal(localObject1, localObject2);
                  if (bool4)
                  {
                    localObject1 = ((Achievement)paramObject).getPlayer();
                    localObject2 = paramAchievement.getPlayer();
                    bool4 = zzw.equal(localObject1, localObject2);
                    if ((bool4) && (bool3) && (bool2)) {
                      break;
                    }
                  }
                }
              }
            }
          }
        }
      }
      i = 0;
      break;
      bool2 = i;
      bool3 = i;
    }
  }
  
  static String zzb(Achievement paramAchievement)
  {
    zzw.zza localzza = zzw.zzy(paramAchievement);
    Object localObject = paramAchievement.getAchievementId();
    localzza = localzza.zzg("Id", localObject);
    localObject = Integer.valueOf(paramAchievement.getType());
    localzza = localzza.zzg("Type", localObject);
    localObject = paramAchievement.getName();
    localzza = localzza.zzg("Name", localObject);
    localObject = paramAchievement.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = paramAchievement.getPlayer();
    localzza = localzza.zzg("Player", localObject);
    String str = "State";
    localObject = Integer.valueOf(paramAchievement.getState());
    localzza = localzza.zzg(str, localObject);
    int i = paramAchievement.getType();
    int j = 1;
    if (i == j)
    {
      localObject = Integer.valueOf(paramAchievement.getCurrentSteps());
      localzza.zzg("CurrentSteps", localObject);
      str = "TotalSteps";
      j = paramAchievement.getTotalSteps();
      localObject = Integer.valueOf(j);
      localzza.zzg(str, localObject);
    }
    return localzza.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Achievement freeze()
  {
    return this;
  }
  
  public String getAchievementId()
  {
    return this.zzaDj;
  }
  
  public int getCurrentSteps()
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      return zzvM();
      i = 0;
    }
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaxl, paramCharArrayBuffer);
  }
  
  public String getFormattedCurrentSteps()
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      return zzvN();
      i = 0;
    }
  }
  
  public void getFormattedCurrentSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      zzms.zzb(this.zzaDs, paramCharArrayBuffer);
      return;
      i = 0;
    }
  }
  
  public String getFormattedTotalSteps()
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      return zzvL();
      i = 0;
    }
  }
  
  public void getFormattedTotalSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      zzms.zzb(this.zzaDp, paramCharArrayBuffer);
      return;
      i = 0;
    }
  }
  
  public long getLastUpdatedTimestamp()
  {
    return this.zzaDt;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.mName, paramCharArrayBuffer);
  }
  
  public Player getPlayer()
  {
    return this.zzaDq;
  }
  
  public Uri getRevealedImageUri()
  {
    return this.zzaDm;
  }
  
  public String getRevealedImageUrl()
  {
    return this.zzaDn;
  }
  
  public int getState()
  {
    return this.mState;
  }
  
  public int getTotalSteps()
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      return zzvK();
      i = 0;
    }
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public Uri getUnlockedImageUri()
  {
    return this.zzaDk;
  }
  
  public String getUnlockedImageUrl()
  {
    return this.zzaDl;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public long getXpValue()
  {
    return this.zzaDu;
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
    AchievementEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public int zzvK()
  {
    return this.zzaDo;
  }
  
  public String zzvL()
  {
    return this.zzaDp;
  }
  
  public int zzvM()
  {
    return this.zzaDr;
  }
  
  public String zzvN()
  {
    return this.zzaDs;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\achievement\AchievementEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */