package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;

public final class TurnBasedMatchEntity
  implements SafeParcelable, TurnBasedMatch
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersion;
  private final int mVersionCode;
  private final long zzaDt;
  private final String zzaER;
  private final GameEntity zzaJE;
  private final long zzaJF;
  private final ArrayList zzaJI;
  private final int zzaJJ;
  private final Bundle zzaJZ;
  private final String zzaKb;
  private final String zzaKj;
  private final String zzaKk;
  private final int zzaKl;
  private final byte[] zzaKm;
  private final String zzaKn;
  private final byte[] zzaKo;
  private final int zzaKp;
  private final int zzaKq;
  private final boolean zzaKr;
  private final String zzaKs;
  private final String zzaxl;
  
  static
  {
    TurnBasedMatchEntityCreator localTurnBasedMatchEntityCreator = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntityCreator;
    localTurnBasedMatchEntityCreator.<init>();
    CREATOR = localTurnBasedMatchEntityCreator;
  }
  
  TurnBasedMatchEntity(int paramInt1, GameEntity paramGameEntity, String paramString1, String paramString2, long paramLong1, String paramString3, long paramLong2, String paramString4, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte1, ArrayList paramArrayList, String paramString5, byte[] paramArrayOfByte2, int paramInt5, Bundle paramBundle, int paramInt6, boolean paramBoolean, String paramString6, String paramString7)
  {
    this.mVersionCode = paramInt1;
    this.zzaJE = paramGameEntity;
    this.zzaER = paramString1;
    this.zzaKb = paramString2;
    this.zzaJF = paramLong1;
    this.zzaKj = paramString3;
    this.zzaDt = paramLong2;
    this.zzaKk = paramString4;
    this.zzaKl = paramInt2;
    this.zzaKq = paramInt6;
    this.zzaJJ = paramInt3;
    this.mVersion = paramInt4;
    this.zzaKm = paramArrayOfByte1;
    this.zzaJI = paramArrayList;
    this.zzaKn = paramString5;
    this.zzaKo = paramArrayOfByte2;
    this.zzaKp = paramInt5;
    this.zzaJZ = paramBundle;
    this.zzaKr = paramBoolean;
    this.zzaxl = paramString6;
    this.zzaKs = paramString7;
  }
  
  public TurnBasedMatchEntity(TurnBasedMatch paramTurnBasedMatch)
  {
    this.mVersionCode = 2;
    Object localObject1 = new com/google/android/gms/games/GameEntity;
    Object localObject2 = paramTurnBasedMatch.getGame();
    ((GameEntity)localObject1).<init>((Game)localObject2);
    this.zzaJE = ((GameEntity)localObject1);
    localObject1 = paramTurnBasedMatch.getMatchId();
    this.zzaER = ((String)localObject1);
    localObject1 = paramTurnBasedMatch.getCreatorId();
    this.zzaKb = ((String)localObject1);
    long l = paramTurnBasedMatch.getCreationTimestamp();
    this.zzaJF = l;
    localObject1 = paramTurnBasedMatch.getLastUpdaterId();
    this.zzaKj = ((String)localObject1);
    l = paramTurnBasedMatch.getLastUpdatedTimestamp();
    this.zzaDt = l;
    localObject1 = paramTurnBasedMatch.getPendingParticipantId();
    this.zzaKk = ((String)localObject1);
    int j = paramTurnBasedMatch.getStatus();
    this.zzaKl = j;
    j = paramTurnBasedMatch.getTurnStatus();
    this.zzaKq = j;
    j = paramTurnBasedMatch.getVariant();
    this.zzaJJ = j;
    j = paramTurnBasedMatch.getVersion();
    this.mVersion = j;
    localObject1 = paramTurnBasedMatch.getRematchId();
    this.zzaKn = ((String)localObject1);
    j = paramTurnBasedMatch.getMatchNumber();
    this.zzaKp = j;
    localObject1 = paramTurnBasedMatch.getAutoMatchCriteria();
    this.zzaJZ = ((Bundle)localObject1);
    int k = paramTurnBasedMatch.isLocallyModified();
    this.zzaKr = k;
    localObject1 = paramTurnBasedMatch.getDescription();
    this.zzaxl = ((String)localObject1);
    localObject1 = paramTurnBasedMatch.getDescriptionParticipantId();
    this.zzaKs = ((String)localObject1);
    localObject1 = paramTurnBasedMatch.getData();
    if (localObject1 == null)
    {
      this.zzaKm = null;
      localObject1 = paramTurnBasedMatch.getPreviousMatchData();
      if (localObject1 != null) {
        break label436;
      }
      this.zzaKo = null;
    }
    for (;;)
    {
      localObject2 = paramTurnBasedMatch.getParticipants();
      int m = ((ArrayList)localObject2).size();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(m);
      this.zzaJI = ((ArrayList)localObject1);
      k = 0;
      localObject1 = null;
      while (k < m)
      {
        localArrayList = this.zzaJI;
        localParticipantEntity = (ParticipantEntity)((Participant)((ArrayList)localObject2).get(k)).freeze();
        localArrayList.add(localParticipantEntity);
        i = k + 1;
        k = i;
      }
      int i1 = localObject1.length;
      localObject2 = new byte[i1];
      this.zzaKm = ((byte[])localObject2);
      localObject2 = this.zzaKm;
      int n = localObject1.length;
      System.arraycopy(localObject1, 0, localObject2, 0, n);
      break;
      label436:
      i1 = localObject1.length;
      localObject2 = new byte[i1];
      this.zzaKo = ((byte[])localObject2);
      localObject2 = this.zzaKo;
      n = localObject1.length;
      System.arraycopy(localObject1, 0, localObject2, 0, n);
    }
  }
  
  static int zza(TurnBasedMatch paramTurnBasedMatch)
  {
    Object[] arrayOfObject = new Object[18];
    Object localObject = paramTurnBasedMatch.getGame();
    arrayOfObject[0] = localObject;
    localObject = paramTurnBasedMatch.getMatchId();
    arrayOfObject[1] = localObject;
    localObject = paramTurnBasedMatch.getCreatorId();
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(paramTurnBasedMatch.getCreationTimestamp());
    arrayOfObject[3] = localObject;
    localObject = paramTurnBasedMatch.getLastUpdaterId();
    arrayOfObject[4] = localObject;
    localObject = Long.valueOf(paramTurnBasedMatch.getLastUpdatedTimestamp());
    arrayOfObject[5] = localObject;
    localObject = paramTurnBasedMatch.getPendingParticipantId();
    arrayOfObject[6] = localObject;
    localObject = Integer.valueOf(paramTurnBasedMatch.getStatus());
    arrayOfObject[7] = localObject;
    localObject = Integer.valueOf(paramTurnBasedMatch.getTurnStatus());
    arrayOfObject[8] = localObject;
    localObject = paramTurnBasedMatch.getDescription();
    arrayOfObject[9] = localObject;
    localObject = Integer.valueOf(paramTurnBasedMatch.getVariant());
    arrayOfObject[10] = localObject;
    localObject = Integer.valueOf(paramTurnBasedMatch.getVersion());
    arrayOfObject[11] = localObject;
    localObject = paramTurnBasedMatch.getParticipants();
    arrayOfObject[12] = localObject;
    localObject = paramTurnBasedMatch.getRematchId();
    arrayOfObject[13] = localObject;
    localObject = Integer.valueOf(paramTurnBasedMatch.getMatchNumber());
    arrayOfObject[14] = localObject;
    localObject = paramTurnBasedMatch.getAutoMatchCriteria();
    arrayOfObject[15] = localObject;
    localObject = Integer.valueOf(paramTurnBasedMatch.getAvailableAutoMatchSlots());
    arrayOfObject[16] = localObject;
    localObject = Boolean.valueOf(paramTurnBasedMatch.isLocallyModified());
    arrayOfObject[17] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static int zza(TurnBasedMatch paramTurnBasedMatch, String paramString)
  {
    Object localObject1 = paramTurnBasedMatch.getParticipants();
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
    localObject3 = ((StringBuilder)localObject3).append("Participant ").append(paramString).append(" is not in match ");
    localObject1 = paramTurnBasedMatch.getMatchId();
    localObject3 = (String)localObject1;
    ((IllegalStateException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  static boolean zza(TurnBasedMatch paramTurnBasedMatch, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof TurnBasedMatch;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramTurnBasedMatch != paramObject)
      {
        paramObject = (TurnBasedMatch)paramObject;
        Object localObject1 = ((TurnBasedMatch)paramObject).getGame();
        Object localObject2 = paramTurnBasedMatch.getGame();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((TurnBasedMatch)paramObject).getMatchId();
          localObject2 = paramTurnBasedMatch.getMatchId();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((TurnBasedMatch)paramObject).getCreatorId();
            localObject2 = paramTurnBasedMatch.getCreatorId();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              long l1 = ((TurnBasedMatch)paramObject).getCreationTimestamp();
              localObject1 = Long.valueOf(l1);
              long l2 = paramTurnBasedMatch.getCreationTimestamp();
              localObject2 = Long.valueOf(l2);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((TurnBasedMatch)paramObject).getLastUpdaterId();
                localObject2 = paramTurnBasedMatch.getLastUpdaterId();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  l1 = ((TurnBasedMatch)paramObject).getLastUpdatedTimestamp();
                  localObject1 = Long.valueOf(l1);
                  l2 = paramTurnBasedMatch.getLastUpdatedTimestamp();
                  localObject2 = Long.valueOf(l2);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((TurnBasedMatch)paramObject).getPendingParticipantId();
                    localObject2 = paramTurnBasedMatch.getPendingParticipantId();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = Integer.valueOf(((TurnBasedMatch)paramObject).getStatus());
                      int i = paramTurnBasedMatch.getStatus();
                      localObject2 = Integer.valueOf(i);
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = Integer.valueOf(((TurnBasedMatch)paramObject).getTurnStatus());
                        i = paramTurnBasedMatch.getTurnStatus();
                        localObject2 = Integer.valueOf(i);
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((TurnBasedMatch)paramObject).getDescription();
                          localObject2 = paramTurnBasedMatch.getDescription();
                          bool2 = zzw.equal(localObject1, localObject2);
                          if (bool2)
                          {
                            localObject1 = Integer.valueOf(((TurnBasedMatch)paramObject).getVariant());
                            i = paramTurnBasedMatch.getVariant();
                            localObject2 = Integer.valueOf(i);
                            bool2 = zzw.equal(localObject1, localObject2);
                            if (bool2)
                            {
                              localObject1 = Integer.valueOf(((TurnBasedMatch)paramObject).getVersion());
                              i = paramTurnBasedMatch.getVersion();
                              localObject2 = Integer.valueOf(i);
                              bool2 = zzw.equal(localObject1, localObject2);
                              if (bool2)
                              {
                                localObject1 = ((TurnBasedMatch)paramObject).getParticipants();
                                localObject2 = paramTurnBasedMatch.getParticipants();
                                bool2 = zzw.equal(localObject1, localObject2);
                                if (bool2)
                                {
                                  localObject1 = ((TurnBasedMatch)paramObject).getRematchId();
                                  localObject2 = paramTurnBasedMatch.getRematchId();
                                  bool2 = zzw.equal(localObject1, localObject2);
                                  if (bool2)
                                  {
                                    localObject1 = Integer.valueOf(((TurnBasedMatch)paramObject).getMatchNumber());
                                    i = paramTurnBasedMatch.getMatchNumber();
                                    localObject2 = Integer.valueOf(i);
                                    bool2 = zzw.equal(localObject1, localObject2);
                                    if (bool2)
                                    {
                                      localObject1 = ((TurnBasedMatch)paramObject).getAutoMatchCriteria();
                                      localObject2 = paramTurnBasedMatch.getAutoMatchCriteria();
                                      bool2 = zzw.equal(localObject1, localObject2);
                                      if (bool2)
                                      {
                                        localObject1 = Integer.valueOf(((TurnBasedMatch)paramObject).getAvailableAutoMatchSlots());
                                        i = paramTurnBasedMatch.getAvailableAutoMatchSlots();
                                        localObject2 = Integer.valueOf(i);
                                        bool2 = zzw.equal(localObject1, localObject2);
                                        if (bool2)
                                        {
                                          localObject1 = Boolean.valueOf(((TurnBasedMatch)paramObject).isLocallyModified());
                                          boolean bool3 = paramTurnBasedMatch.isLocallyModified();
                                          localObject2 = Boolean.valueOf(bool3);
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
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(TurnBasedMatch paramTurnBasedMatch)
  {
    zzw.zza localzza = zzw.zzy(paramTurnBasedMatch);
    Object localObject = paramTurnBasedMatch.getGame();
    localzza = localzza.zzg("Game", localObject);
    localObject = paramTurnBasedMatch.getMatchId();
    localzza = localzza.zzg("MatchId", localObject);
    localObject = paramTurnBasedMatch.getCreatorId();
    localzza = localzza.zzg("CreatorId", localObject);
    localObject = Long.valueOf(paramTurnBasedMatch.getCreationTimestamp());
    localzza = localzza.zzg("CreationTimestamp", localObject);
    localObject = paramTurnBasedMatch.getLastUpdaterId();
    localzza = localzza.zzg("LastUpdaterId", localObject);
    localObject = Long.valueOf(paramTurnBasedMatch.getLastUpdatedTimestamp());
    localzza = localzza.zzg("LastUpdatedTimestamp", localObject);
    localObject = paramTurnBasedMatch.getPendingParticipantId();
    localzza = localzza.zzg("PendingParticipantId", localObject);
    localObject = Integer.valueOf(paramTurnBasedMatch.getStatus());
    localzza = localzza.zzg("MatchStatus", localObject);
    localObject = Integer.valueOf(paramTurnBasedMatch.getTurnStatus());
    localzza = localzza.zzg("TurnStatus", localObject);
    localObject = paramTurnBasedMatch.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = Integer.valueOf(paramTurnBasedMatch.getVariant());
    localzza = localzza.zzg("Variant", localObject);
    localObject = paramTurnBasedMatch.getData();
    localzza = localzza.zzg("Data", localObject);
    localObject = Integer.valueOf(paramTurnBasedMatch.getVersion());
    localzza = localzza.zzg("Version", localObject);
    localObject = paramTurnBasedMatch.getParticipants();
    localzza = localzza.zzg("Participants", localObject);
    localObject = paramTurnBasedMatch.getRematchId();
    localzza = localzza.zzg("RematchId", localObject);
    localObject = paramTurnBasedMatch.getPreviousMatchData();
    localzza = localzza.zzg("PreviousData", localObject);
    localObject = Integer.valueOf(paramTurnBasedMatch.getMatchNumber());
    localzza = localzza.zzg("MatchNumber", localObject);
    localObject = paramTurnBasedMatch.getAutoMatchCriteria();
    localzza = localzza.zzg("AutoMatchCriteria", localObject);
    localObject = Integer.valueOf(paramTurnBasedMatch.getAvailableAutoMatchSlots());
    localzza = localzza.zzg("AvailableAutoMatchSlots", localObject);
    localObject = Boolean.valueOf(paramTurnBasedMatch.isLocallyModified());
    localzza = localzza.zzg("LocallyModified", localObject);
    localObject = paramTurnBasedMatch.getDescriptionParticipantId();
    return localzza.zzg("DescriptionParticipantId", localObject).toString();
  }
  
  static String zzb(TurnBasedMatch paramTurnBasedMatch, String paramString)
  {
    ArrayList localArrayList = paramTurnBasedMatch.getParticipants();
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
  
  static Participant zzc(TurnBasedMatch paramTurnBasedMatch, String paramString)
  {
    Object localObject1 = paramTurnBasedMatch.getParticipants();
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
    localObject1 = paramTurnBasedMatch.getMatchId();
    localObject3 = (String)localObject1;
    ((IllegalStateException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  static ArrayList zzc(TurnBasedMatch paramTurnBasedMatch)
  {
    ArrayList localArrayList1 = paramTurnBasedMatch.getParticipants();
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
  
  public boolean canRematch()
  {
    int i = this.zzaKl;
    int k = 2;
    String str;
    if (i == k)
    {
      str = this.zzaKn;
      if (str == null) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public TurnBasedMatch freeze()
  {
    return this;
  }
  
  public Bundle getAutoMatchCriteria()
  {
    return this.zzaJZ;
  }
  
  public int getAvailableAutoMatchSlots()
  {
    Bundle localBundle = this.zzaJZ;
    int i;
    if (localBundle == null)
    {
      i = 0;
      localBundle = null;
    }
    for (;;)
    {
      return i;
      localBundle = this.zzaJZ;
      String str = "max_automatch_players";
      i = localBundle.getInt(str);
    }
  }
  
  public long getCreationTimestamp()
  {
    return this.zzaJF;
  }
  
  public String getCreatorId()
  {
    return this.zzaKb;
  }
  
  public byte[] getData()
  {
    return this.zzaKm;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaxl, paramCharArrayBuffer);
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
    return this.zzaKs;
  }
  
  public Game getGame()
  {
    return this.zzaJE;
  }
  
  public long getLastUpdatedTimestamp()
  {
    return this.zzaDt;
  }
  
  public String getLastUpdaterId()
  {
    return this.zzaKj;
  }
  
  public String getMatchId()
  {
    return this.zzaER;
  }
  
  public int getMatchNumber()
  {
    return this.zzaKp;
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
  
  public String getPendingParticipantId()
  {
    return this.zzaKk;
  }
  
  public byte[] getPreviousMatchData()
  {
    return this.zzaKo;
  }
  
  public String getRematchId()
  {
    return this.zzaKn;
  }
  
  public int getStatus()
  {
    return this.zzaKl;
  }
  
  public int getTurnStatus()
  {
    return this.zzaKq;
  }
  
  public int getVariant()
  {
    return this.zzaJJ;
  }
  
  public int getVersion()
  {
    return this.mVersion;
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
  
  public boolean isLocallyModified()
  {
    return this.zzaKr;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    TurnBasedMatchEntityCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMatchEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */