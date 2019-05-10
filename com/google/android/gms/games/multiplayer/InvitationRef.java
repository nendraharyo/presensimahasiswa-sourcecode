package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class InvitationRef
  extends zzc
  implements Invitation
{
  private final ArrayList zzaJI;
  private final ParticipantRef zzaJL;
  private final Game zzaJc;
  
  InvitationRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    Object localObject1 = new com/google/android/gms/games/GameRef;
    ((GameRef)localObject1).<init>(paramDataHolder, paramInt1);
    this.zzaJc = ((Game)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>(paramInt2);
    this.zzaJI = ((ArrayList)localObject1);
    int i = 0;
    ParticipantRef localParticipantRef = null;
    String str = getString("external_inviter_id");
    int j = 0;
    localObject1 = null;
    while (j < paramInt2)
    {
      localParticipantRef = new com/google/android/gms/games/multiplayer/ParticipantRef;
      Object localObject2 = this.zzahi;
      int k = this.zzaje + j;
      localParticipantRef.<init>((DataHolder)localObject2, k);
      localObject2 = localParticipantRef.getParticipantId();
      boolean bool = ((String)localObject2).equals(str);
      if (bool) {
        localObject1 = localParticipantRef;
      }
      localObject2 = this.zzaJI;
      ((ArrayList)localObject2).add(localParticipantRef);
      i = j + 1;
      j = i;
    }
    localObject1 = (ParticipantRef)zzx.zzb(localObject1, "Must have a valid inviter!");
    this.zzaJL = ((ParticipantRef)localObject1);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return InvitationEntity.zza(this, paramObject);
  }
  
  public Invitation freeze()
  {
    InvitationEntity localInvitationEntity = new com/google/android/gms/games/multiplayer/InvitationEntity;
    localInvitationEntity.<init>(this);
    return localInvitationEntity;
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
    long l1 = getLong("creation_timestamp");
    long l2 = getLong("last_modified_timestamp");
    return Math.max(l1, l2);
  }
  
  public Game getGame()
  {
    return this.zzaJc;
  }
  
  public String getInvitationId()
  {
    return getString("external_invitation_id");
  }
  
  public int getInvitationType()
  {
    return getInteger("type");
  }
  
  public Participant getInviter()
  {
    return this.zzaJL;
  }
  
  public ArrayList getParticipants()
  {
    return this.zzaJI;
  }
  
  public int getVariant()
  {
    return getInteger("variant");
  }
  
  public int hashCode()
  {
    return InvitationEntity.zza(this);
  }
  
  public String toString()
  {
    return InvitationEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((InvitationEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\InvitationRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */