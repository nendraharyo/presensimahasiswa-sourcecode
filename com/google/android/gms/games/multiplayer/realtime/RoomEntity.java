package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;

public final class RoomEntity
  extends GamesDowngradeableSafeParcel
  implements Room
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final String zzaEw;
  private final long zzaJF;
  private final ArrayList zzaJI;
  private final int zzaJJ;
  private final Bundle zzaJZ;
  private final String zzaKb;
  private final int zzaKc;
  private final int zzaKd;
  private final String zzaxl;
  
  static
  {
    RoomEntity.RoomEntityCreatorCompat localRoomEntityCreatorCompat = new com/google/android/gms/games/multiplayer/realtime/RoomEntity$RoomEntityCreatorCompat;
    localRoomEntityCreatorCompat.<init>();
    CREATOR = localRoomEntityCreatorCompat;
  }
  
  RoomEntity(int paramInt1, String paramString1, String paramString2, long paramLong, int paramInt2, String paramString3, int paramInt3, Bundle paramBundle, ArrayList paramArrayList, int paramInt4)
  {
    this.mVersionCode = paramInt1;
    this.zzaEw = paramString1;
    this.zzaKb = paramString2;
    this.zzaJF = paramLong;
    this.zzaKc = paramInt2;
    this.zzaxl = paramString3;
    this.zzaJJ = paramInt3;
    this.zzaJZ = paramBundle;
    this.zzaJI = paramArrayList;
    this.zzaKd = paramInt4;
  }
  
  public RoomEntity(Room paramRoom)
  {
    this.mVersionCode = 2;
    Object localObject = paramRoom.getRoomId();
    this.zzaEw = ((String)localObject);
    localObject = paramRoom.getCreatorId();
    this.zzaKb = ((String)localObject);
    long l = paramRoom.getCreationTimestamp();
    this.zzaJF = l;
    int i = paramRoom.getStatus();
    this.zzaKc = i;
    localObject = paramRoom.getDescription();
    this.zzaxl = ((String)localObject);
    i = paramRoom.getVariant();
    this.zzaJJ = i;
    localObject = paramRoom.getAutoMatchCriteria();
    this.zzaJZ = ((Bundle)localObject);
    ArrayList localArrayList1 = paramRoom.getParticipants();
    int j = localArrayList1.size();
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(j);
    this.zzaJI = ((ArrayList)localObject);
    i = 0;
    localObject = null;
    for (int k = 0; k < j; k = i)
    {
      ArrayList localArrayList2 = this.zzaJI;
      localObject = (ParticipantEntity)((Participant)localArrayList1.get(k)).freeze();
      localArrayList2.add(localObject);
      i = k + 1;
    }
    i = paramRoom.getAutoMatchWaitEstimateSeconds();
    this.zzaKd = i;
  }
  
  static int zza(Room paramRoom)
  {
    Object[] arrayOfObject = new Object[9];
    Object localObject = paramRoom.getRoomId();
    arrayOfObject[0] = localObject;
    localObject = paramRoom.getCreatorId();
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(paramRoom.getCreationTimestamp());
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramRoom.getStatus());
    arrayOfObject[3] = localObject;
    localObject = paramRoom.getDescription();
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramRoom.getVariant());
    arrayOfObject[5] = localObject;
    localObject = paramRoom.getAutoMatchCriteria();
    arrayOfObject[6] = localObject;
    localObject = paramRoom.getParticipants();
    arrayOfObject[7] = localObject;
    localObject = Integer.valueOf(paramRoom.getAutoMatchWaitEstimateSeconds());
    arrayOfObject[8] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static int zza(Room paramRoom, String paramString)
  {
    Object localObject1 = paramRoom.getParticipants();
    int i = 0;
    Object localObject2 = null;
    int j = ((ArrayList)localObject1).size();
    int k = 0;
    Object localObject3 = null;
    while (k < j)
    {
      localObject2 = (Participant)((ArrayList)localObject1).get(k);
      String str = ((Participant)localObject2).getParticipantId();
      boolean bool = str.equals(paramString);
      if (bool) {
        return ((Participant)localObject2).getStatus();
      }
      i = k + 1;
      k = i;
    }
    localObject2 = new java/lang/IllegalStateException;
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Participant ").append(paramString).append(" is not in room ");
    localObject1 = paramRoom.getRoomId();
    localObject3 = (String)localObject1;
    ((IllegalStateException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  static boolean zza(Room paramRoom, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Room;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramRoom != paramObject)
      {
        paramObject = (Room)paramObject;
        Object localObject1 = ((Room)paramObject).getRoomId();
        Object localObject2 = paramRoom.getRoomId();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Room)paramObject).getCreatorId();
          localObject2 = paramRoom.getCreatorId();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            long l1 = ((Room)paramObject).getCreationTimestamp();
            localObject1 = Long.valueOf(l1);
            long l2 = paramRoom.getCreationTimestamp();
            localObject2 = Long.valueOf(l2);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Integer.valueOf(((Room)paramObject).getStatus());
              int i = paramRoom.getStatus();
              localObject2 = Integer.valueOf(i);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Room)paramObject).getDescription();
                localObject2 = paramRoom.getDescription();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = Integer.valueOf(((Room)paramObject).getVariant());
                  i = paramRoom.getVariant();
                  localObject2 = Integer.valueOf(i);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((Room)paramObject).getAutoMatchCriteria();
                    localObject2 = paramRoom.getAutoMatchCriteria();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = ((Room)paramObject).getParticipants();
                      localObject2 = paramRoom.getParticipants();
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = Integer.valueOf(((Room)paramObject).getAutoMatchWaitEstimateSeconds());
                        i = paramRoom.getAutoMatchWaitEstimateSeconds();
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
        bool1 = false;
      }
    }
  }
  
  static String zzb(Room paramRoom)
  {
    zzw.zza localzza = zzw.zzy(paramRoom);
    Object localObject = paramRoom.getRoomId();
    localzza = localzza.zzg("RoomId", localObject);
    localObject = paramRoom.getCreatorId();
    localzza = localzza.zzg("CreatorId", localObject);
    localObject = Long.valueOf(paramRoom.getCreationTimestamp());
    localzza = localzza.zzg("CreationTimestamp", localObject);
    localObject = Integer.valueOf(paramRoom.getStatus());
    localzza = localzza.zzg("RoomStatus", localObject);
    localObject = paramRoom.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = Integer.valueOf(paramRoom.getVariant());
    localzza = localzza.zzg("Variant", localObject);
    localObject = paramRoom.getAutoMatchCriteria();
    localzza = localzza.zzg("AutoMatchCriteria", localObject);
    localObject = paramRoom.getParticipants();
    localzza = localzza.zzg("Participants", localObject);
    localObject = Integer.valueOf(paramRoom.getAutoMatchWaitEstimateSeconds());
    return localzza.zzg("AutoMatchWaitEstimateSeconds", localObject).toString();
  }
  
  static String zzb(Room paramRoom, String paramString)
  {
    ArrayList localArrayList = paramRoom.getParticipants();
    int i = 0;
    Object localObject1 = null;
    int j = localArrayList.size();
    int k = 0;
    if (k < j)
    {
      localObject1 = (Participant)localArrayList.get(k);
      Object localObject2 = ((Participant)localObject1).getPlayer();
      if (localObject2 != null)
      {
        localObject2 = ((Player)localObject2).getPlayerId();
        boolean bool = ((String)localObject2).equals(paramString);
        if (!bool) {}
      }
    }
    for (localObject1 = ((Participant)localObject1).getParticipantId();; localObject1 = null)
    {
      return (String)localObject1;
      i = k + 1;
      k = i;
      break;
      i = 0;
    }
  }
  
  static Participant zzc(Room paramRoom, String paramString)
  {
    Object localObject1 = paramRoom.getParticipants();
    int i = 0;
    Object localObject2 = null;
    int j = ((ArrayList)localObject1).size();
    int k = 0;
    Object localObject3 = null;
    while (k < j)
    {
      localObject2 = (Participant)((ArrayList)localObject1).get(k);
      String str = ((Participant)localObject2).getParticipantId();
      boolean bool = str.equals(paramString);
      if (bool) {
        return (Participant)localObject2;
      }
      i = k + 1;
      k = i;
    }
    localObject2 = new java/lang/IllegalStateException;
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Participant ").append(paramString).append(" is not in match ");
    localObject1 = paramRoom.getRoomId();
    localObject3 = (String)localObject1;
    ((IllegalStateException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  static ArrayList zzc(Room paramRoom)
  {
    ArrayList localArrayList1 = paramRoom.getParticipants();
    int i = localArrayList1.size();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>(i);
    int j = 0;
    String str = null;
    for (int k = 0; k < i; k = j)
    {
      str = ((Participant)localArrayList1.get(k)).getParticipantId();
      localArrayList2.add(str);
      j = k + 1;
    }
    return localArrayList2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Room freeze()
  {
    return this;
  }
  
  public Bundle getAutoMatchCriteria()
  {
    return this.zzaJZ;
  }
  
  public int getAutoMatchWaitEstimateSeconds()
  {
    return this.zzaKd;
  }
  
  public long getCreationTimestamp()
  {
    return this.zzaJF;
  }
  
  public String getCreatorId()
  {
    return this.zzaKb;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaxl, paramCharArrayBuffer);
  }
  
  public Participant getParticipant(String paramString)
  {
    return zzc(this, paramString);
  }
  
  public String getParticipantId(String paramString)
  {
    return zzb(this, paramString);
  }
  
  public ArrayList getParticipantIds()
  {
    return zzc(this);
  }
  
  public int getParticipantStatus(String paramString)
  {
    return zza(this, paramString);
  }
  
  public ArrayList getParticipants()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaJI;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public String getRoomId()
  {
    return this.zzaEw;
  }
  
  public int getStatus()
  {
    return this.zzaKc;
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
      RoomEntityCreator.zza(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      Object localObject = this.zzaEw;
      paramParcel.writeString((String)localObject);
      localObject = this.zzaKb;
      paramParcel.writeString((String)localObject);
      long l = this.zzaJF;
      paramParcel.writeLong(l);
      int i = this.zzaKc;
      paramParcel.writeInt(i);
      localObject = this.zzaxl;
      paramParcel.writeString((String)localObject);
      i = this.zzaJJ;
      paramParcel.writeInt(i);
      localObject = this.zzaJZ;
      paramParcel.writeBundle((Bundle)localObject);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RoomEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */