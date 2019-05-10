package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

public final class InvitationEntity
  extends GamesDowngradeableSafeParcel
  implements Invitation
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final String zzUO;
  private final GameEntity zzaJE;
  private final long zzaJF;
  private final int zzaJG;
  private final ParticipantEntity zzaJH;
  private final ArrayList zzaJI;
  private final int zzaJJ;
  private final int zzaJK;
  
  static
  {
    InvitationEntity.InvitationEntityCreatorCompat localInvitationEntityCreatorCompat = new com/google/android/gms/games/multiplayer/InvitationEntity$InvitationEntityCreatorCompat;
    localInvitationEntityCreatorCompat.<init>();
    CREATOR = localInvitationEntityCreatorCompat;
  }
  
  InvitationEntity(int paramInt1, GameEntity paramGameEntity, String paramString, long paramLong, int paramInt2, ParticipantEntity paramParticipantEntity, ArrayList paramArrayList, int paramInt3, int paramInt4)
  {
    this.mVersionCode = paramInt1;
    this.zzaJE = paramGameEntity;
    this.zzUO = paramString;
    this.zzaJF = paramLong;
    this.zzaJG = paramInt2;
    this.zzaJH = paramParticipantEntity;
    this.zzaJI = paramArrayList;
    this.zzaJJ = paramInt3;
    this.zzaJK = paramInt4;
  }
  
  InvitationEntity(Invitation paramInvitation)
  {
    this.mVersionCode = 2;
    Object localObject1 = new com/google/android/gms/games/GameEntity;
    Object localObject2 = paramInvitation.getGame();
    ((GameEntity)localObject1).<init>((Game)localObject2);
    this.zzaJE = ((GameEntity)localObject1);
    localObject1 = paramInvitation.getInvitationId();
    this.zzUO = ((String)localObject1);
    long l = paramInvitation.getCreationTimestamp();
    this.zzaJF = l;
    int i = paramInvitation.getInvitationType();
    this.zzaJG = i;
    i = paramInvitation.getVariant();
    this.zzaJJ = i;
    i = paramInvitation.getAvailableAutoMatchSlots();
    this.zzaJK = i;
    String str = paramInvitation.getInviter().getParticipantId();
    localObject2 = null;
    ArrayList localArrayList = paramInvitation.getParticipants();
    int j = localArrayList.size();
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>(j);
    this.zzaJI = ((ArrayList)localObject1);
    i = 0;
    localObject1 = null;
    for (int k = 0; k < j; k = i)
    {
      localObject1 = (Participant)localArrayList.get(k);
      Object localObject3 = ((Participant)localObject1).getParticipantId();
      boolean bool = ((String)localObject3).equals(str);
      if (bool) {
        localObject2 = localObject1;
      }
      localObject3 = this.zzaJI;
      localObject1 = (ParticipantEntity)((Participant)localObject1).freeze();
      ((ArrayList)localObject3).add(localObject1);
      i = k + 1;
    }
    zzx.zzb(localObject2, "Must have a valid inviter!");
    localObject1 = (ParticipantEntity)((Participant)localObject2).freeze();
    this.zzaJH = ((ParticipantEntity)localObject1);
  }
  
  static int zza(Invitation paramInvitation)
  {
    Object[] arrayOfObject = new Object[8];
    Object localObject = paramInvitation.getGame();
    arrayOfObject[0] = localObject;
    localObject = paramInvitation.getInvitationId();
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(paramInvitation.getCreationTimestamp());
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramInvitation.getInvitationType());
    arrayOfObject[3] = localObject;
    localObject = paramInvitation.getInviter();
    arrayOfObject[4] = localObject;
    localObject = paramInvitation.getParticipants();
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(paramInvitation.getVariant());
    arrayOfObject[6] = localObject;
    localObject = Integer.valueOf(paramInvitation.getAvailableAutoMatchSlots());
    arrayOfObject[7] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(Invitation paramInvitation, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Invitation;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramInvitation != paramObject)
      {
        paramObject = (Invitation)paramObject;
        Object localObject1 = ((Invitation)paramObject).getGame();
        Object localObject2 = paramInvitation.getGame();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Invitation)paramObject).getInvitationId();
          localObject2 = paramInvitation.getInvitationId();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            long l1 = ((Invitation)paramObject).getCreationTimestamp();
            localObject1 = Long.valueOf(l1);
            long l2 = paramInvitation.getCreationTimestamp();
            localObject2 = Long.valueOf(l2);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Integer.valueOf(((Invitation)paramObject).getInvitationType());
              int i = paramInvitation.getInvitationType();
              localObject2 = Integer.valueOf(i);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Invitation)paramObject).getInviter();
                localObject2 = paramInvitation.getInviter();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((Invitation)paramObject).getParticipants();
                  localObject2 = paramInvitation.getParticipants();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = Integer.valueOf(((Invitation)paramObject).getVariant());
                    i = paramInvitation.getVariant();
                    localObject2 = Integer.valueOf(i);
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = Integer.valueOf(((Invitation)paramObject).getAvailableAutoMatchSlots());
                      i = paramInvitation.getAvailableAutoMatchSlots();
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
        bool1 = false;
      }
    }
  }
  
  static String zzb(Invitation paramInvitation)
  {
    zzw.zza localzza = zzw.zzy(paramInvitation);
    Object localObject = paramInvitation.getGame();
    localzza = localzza.zzg("Game", localObject);
    localObject = paramInvitation.getInvitationId();
    localzza = localzza.zzg("InvitationId", localObject);
    localObject = Long.valueOf(paramInvitation.getCreationTimestamp());
    localzza = localzza.zzg("CreationTimestamp", localObject);
    localObject = Integer.valueOf(paramInvitation.getInvitationType());
    localzza = localzza.zzg("InvitationType", localObject);
    localObject = paramInvitation.getInviter();
    localzza = localzza.zzg("Inviter", localObject);
    localObject = paramInvitation.getParticipants();
    localzza = localzza.zzg("Participants", localObject);
    localObject = Integer.valueOf(paramInvitation.getVariant());
    localzza = localzza.zzg("Variant", localObject);
    localObject = Integer.valueOf(paramInvitation.getAvailableAutoMatchSlots());
    return localzza.zzg("AvailableAutoMatchSlots", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Invitation freeze()
  {
    return this;
  }
  
  public int getAvailableAutoMatchSlots()
  {
    return this.zzaJK;
  }
  
  public long getCreationTimestamp()
  {
    return this.zzaJF;
  }
  
  public Game getGame()
  {
    return this.zzaJE;
  }
  
  public String getInvitationId()
  {
    return this.zzUO;
  }
  
  public int getInvitationType()
  {
    return this.zzaJG;
  }
  
  public Participant getInviter()
  {
    return this.zzaJH;
  }
  
  public ArrayList getParticipants()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaJI;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public int getVariant()
  {
    return this.zzaJJ;
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
    boolean bool = zzqC();
    if (!bool) {
      InvitationEntityCreator.zza(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      this.zzaJE.writeToParcel(paramParcel, paramInt);
      Object localObject = this.zzUO;
      paramParcel.writeString((String)localObject);
      long l = this.zzaJF;
      paramParcel.writeLong(l);
      int i = this.zzaJG;
      paramParcel.writeInt(i);
      this.zzaJH.writeToParcel(paramParcel, paramInt);
      int j = this.zzaJI.size();
      paramParcel.writeInt(j);
      i = 0;
      localObject = null;
      for (int k = 0; k < j; k = i)
      {
        localObject = (ParticipantEntity)this.zzaJI.get(k);
        ((ParticipantEntity)localObject).writeToParcel(paramParcel, paramInt);
        i = k + 1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\InvitationEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */