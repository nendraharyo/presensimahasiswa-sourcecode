package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzms;

public final class ParticipantEntity
  extends GamesDowngradeableSafeParcel
  implements Participant
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final int zzBc;
  private final String zzWQ;
  private final Uri zzaCd;
  private final Uri zzaCe;
  private final String zzaCo;
  private final String zzaCp;
  private final String zzaDX;
  private final PlayerEntity zzaDq;
  private final String zzaFa;
  private final boolean zzaJM;
  private final ParticipantResult zzaJN;
  private final int zzaab;
  
  static
  {
    ParticipantEntity.ParticipantEntityCreatorCompat localParticipantEntityCreatorCompat = new com/google/android/gms/games/multiplayer/ParticipantEntity$ParticipantEntityCreatorCompat;
    localParticipantEntityCreatorCompat.<init>();
    CREATOR = localParticipantEntityCreatorCompat;
  }
  
  ParticipantEntity(int paramInt1, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, int paramInt2, String paramString3, boolean paramBoolean, PlayerEntity paramPlayerEntity, int paramInt3, ParticipantResult paramParticipantResult, String paramString4, String paramString5)
  {
    this.mVersionCode = paramInt1;
    this.zzaFa = paramString1;
    this.zzWQ = paramString2;
    this.zzaCd = paramUri1;
    this.zzaCe = paramUri2;
    this.zzBc = paramInt2;
    this.zzaDX = paramString3;
    this.zzaJM = paramBoolean;
    this.zzaDq = paramPlayerEntity;
    this.zzaab = paramInt3;
    this.zzaJN = paramParticipantResult;
    this.zzaCo = paramString4;
    this.zzaCp = paramString5;
  }
  
  public ParticipantEntity(Participant paramParticipant)
  {
    this.mVersionCode = 3;
    Object localObject = paramParticipant.getParticipantId();
    this.zzaFa = ((String)localObject);
    localObject = paramParticipant.getDisplayName();
    this.zzWQ = ((String)localObject);
    localObject = paramParticipant.getIconImageUri();
    this.zzaCd = ((Uri)localObject);
    localObject = paramParticipant.getHiResImageUri();
    this.zzaCe = ((Uri)localObject);
    int i = paramParticipant.getStatus();
    this.zzBc = i;
    localObject = paramParticipant.zzwt();
    this.zzaDX = ((String)localObject);
    boolean bool = paramParticipant.isConnectedToRoom();
    this.zzaJM = bool;
    Player localPlayer = paramParticipant.getPlayer();
    if (localPlayer == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      this.zzaDq = ((PlayerEntity)localObject);
      int j = paramParticipant.getCapabilities();
      this.zzaab = j;
      localObject = paramParticipant.getResult();
      this.zzaJN = ((ParticipantResult)localObject);
      localObject = paramParticipant.getIconImageUrl();
      this.zzaCo = ((String)localObject);
      localObject = paramParticipant.getHiResImageUrl();
      this.zzaCp = ((String)localObject);
      return;
      localObject = new com/google/android/gms/games/PlayerEntity;
      ((PlayerEntity)localObject).<init>(localPlayer);
    }
  }
  
  static int zza(Participant paramParticipant)
  {
    Object[] arrayOfObject = new Object[10];
    Object localObject = paramParticipant.getPlayer();
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(paramParticipant.getStatus());
    arrayOfObject[1] = localObject;
    localObject = paramParticipant.zzwt();
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(paramParticipant.isConnectedToRoom());
    arrayOfObject[3] = localObject;
    localObject = paramParticipant.getDisplayName();
    arrayOfObject[4] = localObject;
    localObject = paramParticipant.getIconImageUri();
    arrayOfObject[5] = localObject;
    localObject = paramParticipant.getHiResImageUri();
    arrayOfObject[6] = localObject;
    localObject = Integer.valueOf(paramParticipant.getCapabilities());
    arrayOfObject[7] = localObject;
    localObject = paramParticipant.getResult();
    arrayOfObject[8] = localObject;
    localObject = paramParticipant.getParticipantId();
    arrayOfObject[9] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(Participant paramParticipant, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Participant;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramParticipant != paramObject)
      {
        paramObject = (Participant)paramObject;
        Object localObject1 = ((Participant)paramObject).getPlayer();
        Object localObject2 = paramParticipant.getPlayer();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = Integer.valueOf(((Participant)paramObject).getStatus());
          int i = paramParticipant.getStatus();
          localObject2 = Integer.valueOf(i);
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((Participant)paramObject).zzwt();
            localObject2 = paramParticipant.zzwt();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Boolean.valueOf(((Participant)paramObject).isConnectedToRoom());
              boolean bool3 = paramParticipant.isConnectedToRoom();
              localObject2 = Boolean.valueOf(bool3);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Participant)paramObject).getDisplayName();
                localObject2 = paramParticipant.getDisplayName();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((Participant)paramObject).getIconImageUri();
                  localObject2 = paramParticipant.getIconImageUri();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((Participant)paramObject).getHiResImageUri();
                    localObject2 = paramParticipant.getHiResImageUri();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = Integer.valueOf(((Participant)paramObject).getCapabilities());
                      int j = paramParticipant.getCapabilities();
                      localObject2 = Integer.valueOf(j);
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = ((Participant)paramObject).getResult();
                        localObject2 = paramParticipant.getResult();
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((Participant)paramObject).getParticipantId();
                          localObject2 = paramParticipant.getParticipantId();
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
        bool1 = false;
      }
    }
  }
  
  static String zzb(Participant paramParticipant)
  {
    zzw.zza localzza = zzw.zzy(paramParticipant);
    Object localObject = paramParticipant.getParticipantId();
    localzza = localzza.zzg("ParticipantId", localObject);
    localObject = paramParticipant.getPlayer();
    localzza = localzza.zzg("Player", localObject);
    localObject = Integer.valueOf(paramParticipant.getStatus());
    localzza = localzza.zzg("Status", localObject);
    localObject = paramParticipant.zzwt();
    localzza = localzza.zzg("ClientAddress", localObject);
    localObject = Boolean.valueOf(paramParticipant.isConnectedToRoom());
    localzza = localzza.zzg("ConnectedToRoom", localObject);
    localObject = paramParticipant.getDisplayName();
    localzza = localzza.zzg("DisplayName", localObject);
    localObject = paramParticipant.getIconImageUri();
    localzza = localzza.zzg("IconImage", localObject);
    localObject = paramParticipant.getIconImageUrl();
    localzza = localzza.zzg("IconImageUrl", localObject);
    localObject = paramParticipant.getHiResImageUri();
    localzza = localzza.zzg("HiResImage", localObject);
    localObject = paramParticipant.getHiResImageUrl();
    localzza = localzza.zzg("HiResImageUrl", localObject);
    localObject = Integer.valueOf(paramParticipant.getCapabilities());
    localzza = localzza.zzg("Capabilities", localObject);
    localObject = paramParticipant.getResult();
    return localzza.zzg("Result", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Participant freeze()
  {
    return this;
  }
  
  public int getCapabilities()
  {
    return this.zzaab;
  }
  
  public String getDisplayName()
  {
    Object localObject = this.zzaDq;
    if (localObject == null) {}
    for (localObject = this.zzWQ;; localObject = this.zzaDq.getDisplayName()) {
      return (String)localObject;
    }
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    Object localObject = this.zzaDq;
    if (localObject == null)
    {
      localObject = this.zzWQ;
      zzms.zzb((String)localObject, paramCharArrayBuffer);
    }
    for (;;)
    {
      return;
      localObject = this.zzaDq;
      ((PlayerEntity)localObject).getDisplayName(paramCharArrayBuffer);
    }
  }
  
  public Uri getHiResImageUri()
  {
    Object localObject = this.zzaDq;
    if (localObject == null) {}
    for (localObject = this.zzaCe;; localObject = this.zzaDq.getHiResImageUri()) {
      return (Uri)localObject;
    }
  }
  
  public String getHiResImageUrl()
  {
    Object localObject = this.zzaDq;
    if (localObject == null) {}
    for (localObject = this.zzaCp;; localObject = this.zzaDq.getHiResImageUrl()) {
      return (String)localObject;
    }
  }
  
  public Uri getIconImageUri()
  {
    Object localObject = this.zzaDq;
    if (localObject == null) {}
    for (localObject = this.zzaCd;; localObject = this.zzaDq.getIconImageUri()) {
      return (Uri)localObject;
    }
  }
  
  public String getIconImageUrl()
  {
    Object localObject = this.zzaDq;
    if (localObject == null) {}
    for (localObject = this.zzaCo;; localObject = this.zzaDq.getIconImageUrl()) {
      return (String)localObject;
    }
  }
  
  public String getParticipantId()
  {
    return this.zzaFa;
  }
  
  public Player getPlayer()
  {
    return this.zzaDq;
  }
  
  public ParticipantResult getResult()
  {
    return this.zzaJN;
  }
  
  public int getStatus()
  {
    return this.zzBc;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isConnectedToRoom()
  {
    return this.zzaJM;
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
    String str = null;
    int i = 1;
    int j = 0;
    boolean bool = zzqC();
    if (!bool)
    {
      ParticipantEntityCreator.zza(this, paramParcel, paramInt);
      return;
    }
    Object localObject = this.zzaFa;
    paramParcel.writeString((String)localObject);
    localObject = this.zzWQ;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaCd;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
      label67:
      paramParcel.writeString((String)localObject);
      localObject = this.zzaCe;
      if (localObject != null) {
        break label190;
      }
      label84:
      paramParcel.writeString(str);
      int k = this.zzBc;
      paramParcel.writeInt(k);
      localObject = this.zzaDX;
      paramParcel.writeString((String)localObject);
      int m = this.zzaJM;
      if (m == 0) {
        break label205;
      }
      m = i;
      label128:
      paramParcel.writeInt(m);
      localObject = this.zzaDq;
      if (localObject != null) {
        break label214;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(j);
      localObject = this.zzaDq;
      if (localObject == null) {
        break;
      }
      localObject = this.zzaDq;
      ((PlayerEntity)localObject).writeToParcel(paramParcel, paramInt);
      break;
      localObject = this.zzaCd.toString();
      break label67;
      label190:
      localObject = this.zzaCe;
      str = ((Uri)localObject).toString();
      break label84;
      label205:
      int n = 0;
      localObject = null;
      break label128;
      label214:
      j = i;
    }
  }
  
  public String zzwt()
  {
    return this.zzaDX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\ParticipantEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */