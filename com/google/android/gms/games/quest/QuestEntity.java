package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;
import java.util.List;

public final class QuestEntity
  implements SafeParcelable, Quest
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  private final int mState;
  private final int mVersionCode;
  private final long zzaDt;
  private final GameEntity zzaJE;
  private final long zzaKA;
  private final Uri zzaKB;
  private final String zzaKC;
  private final long zzaKD;
  private final long zzaKE;
  private final ArrayList zzaKF;
  private final String zzaKw;
  private final long zzaKx;
  private final Uri zzaKy;
  private final String zzaKz;
  private final int zzabB;
  private final String zzaxl;
  
  static
  {
    QuestEntityCreator localQuestEntityCreator = new com/google/android/gms/games/quest/QuestEntityCreator;
    localQuestEntityCreator.<init>();
    CREATOR = localQuestEntityCreator;
  }
  
  QuestEntity(int paramInt1, GameEntity paramGameEntity, String paramString1, long paramLong1, Uri paramUri1, String paramString2, String paramString3, long paramLong2, long paramLong3, Uri paramUri2, String paramString4, String paramString5, long paramLong4, long paramLong5, int paramInt2, int paramInt3, ArrayList paramArrayList)
  {
    this.mVersionCode = paramInt1;
    this.zzaJE = paramGameEntity;
    this.zzaKw = paramString1;
    this.zzaKx = paramLong1;
    this.zzaKy = paramUri1;
    this.zzaKz = paramString2;
    this.zzaxl = paramString3;
    this.zzaKA = paramLong2;
    this.zzaDt = paramLong3;
    this.zzaKB = paramUri2;
    this.zzaKC = paramString4;
    this.mName = paramString5;
    this.zzaKD = paramLong4;
    this.zzaKE = paramLong5;
    this.mState = paramInt2;
    this.zzabB = paramInt3;
    this.zzaKF = paramArrayList;
  }
  
  public QuestEntity(Quest paramQuest)
  {
    this.mVersionCode = 2;
    Object localObject = new com/google/android/gms/games/GameEntity;
    Game localGame = paramQuest.getGame();
    ((GameEntity)localObject).<init>(localGame);
    this.zzaJE = ((GameEntity)localObject);
    localObject = paramQuest.getQuestId();
    this.zzaKw = ((String)localObject);
    long l = paramQuest.getAcceptedTimestamp();
    this.zzaKx = l;
    localObject = paramQuest.getDescription();
    this.zzaxl = ((String)localObject);
    localObject = paramQuest.getBannerImageUri();
    this.zzaKy = ((Uri)localObject);
    localObject = paramQuest.getBannerImageUrl();
    this.zzaKz = ((String)localObject);
    l = paramQuest.getEndTimestamp();
    this.zzaKA = l;
    localObject = paramQuest.getIconImageUri();
    this.zzaKB = ((Uri)localObject);
    localObject = paramQuest.getIconImageUrl();
    this.zzaKC = ((String)localObject);
    l = paramQuest.getLastUpdatedTimestamp();
    this.zzaDt = l;
    localObject = paramQuest.getName();
    this.mName = ((String)localObject);
    l = paramQuest.zzxS();
    this.zzaKD = l;
    l = paramQuest.getStartTimestamp();
    this.zzaKE = l;
    int i = paramQuest.getState();
    this.mState = i;
    i = paramQuest.getType();
    this.zzabB = i;
    List localList = paramQuest.zzxR();
    int j = localList.size();
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(j);
    this.zzaKF = ((ArrayList)localObject);
    i = 0;
    localObject = null;
    int k = 0;
    localGame = null;
    while (k < j)
    {
      ArrayList localArrayList = this.zzaKF;
      localObject = (MilestoneEntity)((Milestone)localList.get(k)).freeze();
      localArrayList.add(localObject);
      i = k + 1;
      k = i;
    }
  }
  
  static int zza(Quest paramQuest)
  {
    Object[] arrayOfObject = new Object[13];
    Object localObject = paramQuest.getGame();
    arrayOfObject[0] = localObject;
    localObject = paramQuest.getQuestId();
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(paramQuest.getAcceptedTimestamp());
    arrayOfObject[2] = localObject;
    localObject = paramQuest.getBannerImageUri();
    arrayOfObject[3] = localObject;
    localObject = paramQuest.getDescription();
    arrayOfObject[4] = localObject;
    localObject = Long.valueOf(paramQuest.getEndTimestamp());
    arrayOfObject[5] = localObject;
    localObject = paramQuest.getIconImageUri();
    arrayOfObject[6] = localObject;
    localObject = Long.valueOf(paramQuest.getLastUpdatedTimestamp());
    arrayOfObject[7] = localObject;
    localObject = paramQuest.zzxR();
    arrayOfObject[8] = localObject;
    localObject = paramQuest.getName();
    arrayOfObject[9] = localObject;
    localObject = Long.valueOf(paramQuest.zzxS());
    arrayOfObject[10] = localObject;
    localObject = Long.valueOf(paramQuest.getStartTimestamp());
    arrayOfObject[11] = localObject;
    localObject = Integer.valueOf(paramQuest.getState());
    arrayOfObject[12] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(Quest paramQuest, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Quest;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramQuest != paramObject)
      {
        paramObject = (Quest)paramObject;
        Object localObject1 = ((Quest)paramObject).getGame();
        Object localObject2 = paramQuest.getGame();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Quest)paramObject).getQuestId();
          localObject2 = paramQuest.getQuestId();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            long l1 = ((Quest)paramObject).getAcceptedTimestamp();
            localObject1 = Long.valueOf(l1);
            long l2 = paramQuest.getAcceptedTimestamp();
            localObject2 = Long.valueOf(l2);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((Quest)paramObject).getBannerImageUri();
              localObject2 = paramQuest.getBannerImageUri();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Quest)paramObject).getDescription();
                localObject2 = paramQuest.getDescription();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  l1 = ((Quest)paramObject).getEndTimestamp();
                  localObject1 = Long.valueOf(l1);
                  l2 = paramQuest.getEndTimestamp();
                  localObject2 = Long.valueOf(l2);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((Quest)paramObject).getIconImageUri();
                    localObject2 = paramQuest.getIconImageUri();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      l1 = ((Quest)paramObject).getLastUpdatedTimestamp();
                      localObject1 = Long.valueOf(l1);
                      l2 = paramQuest.getLastUpdatedTimestamp();
                      localObject2 = Long.valueOf(l2);
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = ((Quest)paramObject).zzxR();
                        localObject2 = paramQuest.zzxR();
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((Quest)paramObject).getName();
                          localObject2 = paramQuest.getName();
                          bool2 = zzw.equal(localObject1, localObject2);
                          if (bool2)
                          {
                            l1 = ((Quest)paramObject).zzxS();
                            localObject1 = Long.valueOf(l1);
                            l2 = paramQuest.zzxS();
                            localObject2 = Long.valueOf(l2);
                            bool2 = zzw.equal(localObject1, localObject2);
                            if (bool2)
                            {
                              l1 = ((Quest)paramObject).getStartTimestamp();
                              localObject1 = Long.valueOf(l1);
                              l2 = paramQuest.getStartTimestamp();
                              localObject2 = Long.valueOf(l2);
                              bool2 = zzw.equal(localObject1, localObject2);
                              if (bool2)
                              {
                                localObject1 = Integer.valueOf(((Quest)paramObject).getState());
                                int i = paramQuest.getState();
                                localObject2 = Integer.valueOf(i);
                                bool2 = zzw.equal(localObject1, localObject2);
                                if (bool2) {
                                  continue;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(Quest paramQuest)
  {
    zzw.zza localzza = zzw.zzy(paramQuest);
    Object localObject = paramQuest.getGame();
    localzza = localzza.zzg("Game", localObject);
    localObject = paramQuest.getQuestId();
    localzza = localzza.zzg("QuestId", localObject);
    localObject = Long.valueOf(paramQuest.getAcceptedTimestamp());
    localzza = localzza.zzg("AcceptedTimestamp", localObject);
    localObject = paramQuest.getBannerImageUri();
    localzza = localzza.zzg("BannerImageUri", localObject);
    localObject = paramQuest.getBannerImageUrl();
    localzza = localzza.zzg("BannerImageUrl", localObject);
    localObject = paramQuest.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = Long.valueOf(paramQuest.getEndTimestamp());
    localzza = localzza.zzg("EndTimestamp", localObject);
    localObject = paramQuest.getIconImageUri();
    localzza = localzza.zzg("IconImageUri", localObject);
    localObject = paramQuest.getIconImageUrl();
    localzza = localzza.zzg("IconImageUrl", localObject);
    localObject = Long.valueOf(paramQuest.getLastUpdatedTimestamp());
    localzza = localzza.zzg("LastUpdatedTimestamp", localObject);
    localObject = paramQuest.zzxR();
    localzza = localzza.zzg("Milestones", localObject);
    localObject = paramQuest.getName();
    localzza = localzza.zzg("Name", localObject);
    localObject = Long.valueOf(paramQuest.zzxS());
    localzza = localzza.zzg("NotifyTimestamp", localObject);
    localObject = Long.valueOf(paramQuest.getStartTimestamp());
    localzza = localzza.zzg("StartTimestamp", localObject);
    localObject = Integer.valueOf(paramQuest.getState());
    return localzza.zzg("State", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Quest freeze()
  {
    return this;
  }
  
  public long getAcceptedTimestamp()
  {
    return this.zzaKx;
  }
  
  public Uri getBannerImageUri()
  {
    return this.zzaKy;
  }
  
  public String getBannerImageUrl()
  {
    return this.zzaKz;
  }
  
  public Milestone getCurrentMilestone()
  {
    return (Milestone)zzxR().get(0);
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaxl, paramCharArrayBuffer);
  }
  
  public long getEndTimestamp()
  {
    return this.zzaKA;
  }
  
  public Game getGame()
  {
    return this.zzaJE;
  }
  
  public Uri getIconImageUri()
  {
    return this.zzaKB;
  }
  
  public String getIconImageUrl()
  {
    return this.zzaKC;
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
  
  public String getQuestId()
  {
    return this.zzaKw;
  }
  
  public long getStartTimestamp()
  {
    return this.zzaKE;
  }
  
  public int getState()
  {
    return this.mState;
  }
  
  public int getType()
  {
    return this.zzabB;
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
  
  public boolean isEndingSoon()
  {
    long l1 = this.zzaKD;
    long l2 = System.currentTimeMillis();
    long l3 = 1800000L;
    l2 += l3;
    boolean bool = l1 < l2;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    QuestEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public List zzxR()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaKF;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public long zzxS()
  {
    return this.zzaKD;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\QuestEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */