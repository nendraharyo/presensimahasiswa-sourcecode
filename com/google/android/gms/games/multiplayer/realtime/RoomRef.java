package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class RoomRef
  extends zzc
  implements Room
{
  private final int zzaDQ;
  
  RoomRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.zzaDQ = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return RoomEntity.zza(this, paramObject);
  }
  
  public Room freeze()
  {
    RoomEntity localRoomEntity = new com/google/android/gms/games/multiplayer/realtime/RoomEntity;
    localRoomEntity.<init>(this);
    return localRoomEntity;
  }
  
  public Bundle getAutoMatchCriteria()
  {
    Object localObject = "has_automatch_criteria";
    boolean bool = getBoolean((String)localObject);
    if (!bool) {
      bool = false;
    }
    int i;
    int j;
    long l;
    for (localObject = null;; localObject = RoomConfig.createAutoMatchCriteria(i, j, l))
    {
      return (Bundle)localObject;
      i = getInteger("automatch_min_players");
      String str1 = "automatch_max_players";
      j = getInteger(str1);
      String str2 = "automatch_bit_mask";
      l = getLong(str2);
    }
  }
  
  public int getAutoMatchWaitEstimateSeconds()
  {
    return getInteger("automatch_wait_estimate_sec");
  }
  
  public long getCreationTimestamp()
  {
    return getLong("creation_timestamp");
  }
  
  public String getCreatorId()
  {
    return getString("creator_external");
  }
  
  public String getDescription()
  {
    return getString("description");
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public Participant getParticipant(String paramString)
  {
    return RoomEntity.zzc(this, paramString);
  }
  
  public String getParticipantId(String paramString)
  {
    return RoomEntity.zzb(this, paramString);
  }
  
  public ArrayList getParticipantIds()
  {
    return RoomEntity.zzc(this);
  }
  
  public int getParticipantStatus(String paramString)
  {
    return RoomEntity.zza(this, paramString);
  }
  
  public ArrayList getParticipants()
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
      ParticipantRef localParticipantRef = new com/google/android/gms/games/multiplayer/ParticipantRef;
      DataHolder localDataHolder = this.zzahi;
      int k = this.zzaje + i;
      localParticipantRef.<init>(localDataHolder, k);
      localArrayList.add(localParticipantRef);
      i += 1;
    }
    return localArrayList;
  }
  
  public String getRoomId()
  {
    return getString("external_match_id");
  }
  
  public int getStatus()
  {
    return getInteger("status");
  }
  
  public int getVariant()
  {
    return getInteger("variant");
  }
  
  public int hashCode()
  {
    return RoomEntity.zza(this);
  }
  
  public String toString()
  {
    return RoomEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((RoomEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RoomRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */