package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class TurnBasedMatchRef
  extends zzc
  implements TurnBasedMatch
{
  private final int zzaDQ;
  private final Game zzaJc;
  
  TurnBasedMatchRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    GameRef localGameRef = new com/google/android/gms/games/GameRef;
    localGameRef.<init>(paramDataHolder, paramInt1);
    this.zzaJc = localGameRef;
    this.zzaDQ = paramInt2;
  }
  
  public boolean canRematch()
  {
    int i = 1;
    int j = getTurnStatus();
    int k = 3;
    if (j == k)
    {
      Object localObject = getRematchId();
      if (localObject == null)
      {
        localObject = getParticipants();
        j = ((ArrayList)localObject).size();
        if (j <= i) {}
      }
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return TurnBasedMatchEntity.zza(this, paramObject);
  }
  
  public TurnBasedMatch freeze()
  {
    TurnBasedMatchEntity localTurnBasedMatchEntity = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;
    localTurnBasedMatchEntity.<init>(this);
    return localTurnBasedMatchEntity;
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
    for (localObject = null;; localObject = TurnBasedMatchConfig.createAutoMatchCriteria(i, j, l))
    {
      return (Bundle)localObject;
      i = getInteger("automatch_min_players");
      String str1 = "automatch_max_players";
      j = getInteger(str1);
      String str2 = "automatch_bit_mask";
      l = getLong(str2);
    }
  }
  
  public int getAvailableAutoMatchSlots()
  {
    String str = "has_automatch_criteria";
    int i = getBoolean(str);
    if (i == 0)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return i;
      str = "automatch_max_players";
      int j = getInteger(str);
    }
  }
  
  public long getCreationTimestamp()
  {
    return getLong("creation_timestamp");
  }
  
  public String getCreatorId()
  {
    return getString("creator_external");
  }
  
  public byte[] getData()
  {
    return getByteArray("data");
  }
  
  public String getDescription()
  {
    return getString("description");
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public Participant getDescriptionParticipant()
  {
    Object localObject = getDescriptionParticipantId();
    if (localObject == null) {}
    for (localObject = null;; localObject = getParticipant((String)localObject)) {
      return (Participant)localObject;
    }
  }
  
  public String getDescriptionParticipantId()
  {
    return getString("description_participant_id");
  }
  
  public Game getGame()
  {
    return this.zzaJc;
  }
  
  public long getLastUpdatedTimestamp()
  {
    return getLong("last_updated_timestamp");
  }
  
  public String getLastUpdaterId()
  {
    return getString("last_updater_external");
  }
  
  public String getMatchId()
  {
    return getString("external_match_id");
  }
  
  public int getMatchNumber()
  {
    return getInteger("match_number");
  }
  
  public Participant getParticipant(String paramString)
  {
    return TurnBasedMatchEntity.zzc(this, paramString);
  }
  
  public String getParticipantId(String paramString)
  {
    return TurnBasedMatchEntity.zzb(this, paramString);
  }
  
  public ArrayList getParticipantIds()
  {
    return TurnBasedMatchEntity.zzc(this);
  }
  
  public int getParticipantStatus(String paramString)
  {
    return TurnBasedMatchEntity.zza(this, paramString);
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
  
  public String getPendingParticipantId()
  {
    return getString("pending_participant_external");
  }
  
  public byte[] getPreviousMatchData()
  {
    return getByteArray("previous_match_data");
  }
  
  public String getRematchId()
  {
    return getString("rematch_id");
  }
  
  public int getStatus()
  {
    return getInteger("status");
  }
  
  public int getTurnStatus()
  {
    return getInteger("user_match_status");
  }
  
  public int getVariant()
  {
    return getInteger("variant");
  }
  
  public int getVersion()
  {
    return getInteger("version");
  }
  
  public int hashCode()
  {
    return TurnBasedMatchEntity.zza(this);
  }
  
  public boolean isLocallyModified()
  {
    return getBoolean("upsync_required");
  }
  
  public String toString()
  {
    return TurnBasedMatchEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((TurnBasedMatchEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMatchRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */