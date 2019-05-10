package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
import java.util.List;

public final class QuestRef
  extends zzc
  implements Quest
{
  private final int zzaDQ;
  private final Game zzaJc;
  
  QuestRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    GameRef localGameRef = new com/google/android/gms/games/GameRef;
    localGameRef.<init>(paramDataHolder, paramInt1);
    this.zzaJc = localGameRef;
    this.zzaDQ = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return QuestEntity.zza(this, paramObject);
  }
  
  public Quest freeze()
  {
    QuestEntity localQuestEntity = new com/google/android/gms/games/quest/QuestEntity;
    localQuestEntity.<init>(this);
    return localQuestEntity;
  }
  
  public long getAcceptedTimestamp()
  {
    return getLong("accepted_ts");
  }
  
  public Uri getBannerImageUri()
  {
    return zzcA("quest_banner_image_uri");
  }
  
  public String getBannerImageUrl()
  {
    return getString("quest_banner_image_url");
  }
  
  public Milestone getCurrentMilestone()
  {
    return (Milestone)zzxR().get(0);
  }
  
  public String getDescription()
  {
    return getString("quest_description");
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("quest_description", paramCharArrayBuffer);
  }
  
  public long getEndTimestamp()
  {
    return getLong("quest_end_ts");
  }
  
  public Game getGame()
  {
    return this.zzaJc;
  }
  
  public Uri getIconImageUri()
  {
    return zzcA("quest_icon_image_uri");
  }
  
  public String getIconImageUrl()
  {
    return getString("quest_icon_image_url");
  }
  
  public long getLastUpdatedTimestamp()
  {
    return getLong("quest_last_updated_ts");
  }
  
  public String getName()
  {
    return getString("quest_name");
  }
  
  public void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("quest_name", paramCharArrayBuffer);
  }
  
  public String getQuestId()
  {
    return getString("external_quest_id");
  }
  
  public long getStartTimestamp()
  {
    return getLong("quest_start_ts");
  }
  
  public int getState()
  {
    return getInteger("quest_state");
  }
  
  public int getType()
  {
    return getInteger("quest_type");
  }
  
  public int hashCode()
  {
    return QuestEntity.zza(this);
  }
  
  public boolean isEndingSoon()
  {
    long l1 = zzxS();
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
    return QuestEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((QuestEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
  
  public List zzxR()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = this.zzaDQ;
    localArrayList.<init>(i);
    i = 0;
    for (;;)
    {
      int j = this.zzaDQ;
      if (i >= j) {
        break;
      }
      MilestoneRef localMilestoneRef = new com/google/android/gms/games/quest/MilestoneRef;
      DataHolder localDataHolder = this.zzahi;
      int k = this.zzaje + i;
      localMilestoneRef.<init>(localDataHolder, k);
      localArrayList.add(localMilestoneRef);
      i += 1;
    }
    return localArrayList;
  }
  
  public long zzxS()
  {
    return getLong("notification_ts");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\quest\QuestRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */