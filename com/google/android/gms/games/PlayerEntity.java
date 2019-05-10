package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.zzms;

public final class PlayerEntity
  extends GamesDowngradeableSafeParcel
  implements Player
{
  public static final Parcelable.Creator CREATOR;
  private final String mName;
  private final int mVersionCode;
  private String zzWQ;
  private final long zzaCO;
  private final int zzaCP;
  private final long zzaCQ;
  private final MostRecentGameInfoEntity zzaCR;
  private final PlayerLevelInfo zzaCS;
  private final boolean zzaCT;
  private final boolean zzaCU;
  private final String zzaCV;
  private final Uri zzaCW;
  private final String zzaCX;
  private final Uri zzaCY;
  private final String zzaCZ;
  private final Uri zzaCd;
  private final Uri zzaCe;
  private final String zzaCo;
  private final String zzaCp;
  private String zzacX;
  private final String zzapg;
  
  static
  {
    PlayerEntity.PlayerEntityCreatorCompat localPlayerEntityCreatorCompat = new com/google/android/gms/games/PlayerEntity$PlayerEntityCreatorCompat;
    localPlayerEntityCreatorCompat.<init>();
    CREATOR = localPlayerEntityCreatorCompat;
  }
  
  PlayerEntity(int paramInt1, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, long paramLong1, int paramInt2, long paramLong2, String paramString3, String paramString4, String paramString5, MostRecentGameInfoEntity paramMostRecentGameInfoEntity, PlayerLevelInfo paramPlayerLevelInfo, boolean paramBoolean1, boolean paramBoolean2, String paramString6, String paramString7, Uri paramUri3, String paramString8, Uri paramUri4, String paramString9)
  {
    this.mVersionCode = paramInt1;
    this.zzacX = paramString1;
    this.zzWQ = paramString2;
    this.zzaCd = paramUri1;
    this.zzaCo = paramString3;
    this.zzaCe = paramUri2;
    this.zzaCp = paramString4;
    this.zzaCO = paramLong1;
    this.zzaCP = paramInt2;
    this.zzaCQ = paramLong2;
    this.zzapg = paramString5;
    this.zzaCT = paramBoolean1;
    this.zzaCR = paramMostRecentGameInfoEntity;
    this.zzaCS = paramPlayerLevelInfo;
    this.zzaCU = paramBoolean2;
    this.zzaCV = paramString6;
    this.mName = paramString7;
    this.zzaCW = paramUri3;
    this.zzaCX = paramString8;
    this.zzaCY = paramUri4;
    this.zzaCZ = paramString9;
  }
  
  public PlayerEntity(Player paramPlayer)
  {
    this(paramPlayer, true);
  }
  
  public PlayerEntity(Player paramPlayer, boolean paramBoolean)
  {
    int i = 13;
    this.mVersionCode = i;
    Object localObject;
    boolean bool;
    if (paramBoolean)
    {
      localObject = paramPlayer.getPlayerId();
      this.zzacX = ((String)localObject);
      localObject = paramPlayer.getDisplayName();
      this.zzWQ = ((String)localObject);
      localObject = paramPlayer.getIconImageUri();
      this.zzaCd = ((Uri)localObject);
      localObject = paramPlayer.getIconImageUrl();
      this.zzaCo = ((String)localObject);
      localObject = paramPlayer.getHiResImageUri();
      this.zzaCe = ((Uri)localObject);
      localObject = paramPlayer.getHiResImageUrl();
      this.zzaCp = ((String)localObject);
      long l1 = paramPlayer.getRetrievedTimestamp();
      this.zzaCO = l1;
      i = paramPlayer.zzvG();
      this.zzaCP = i;
      l1 = paramPlayer.getLastPlayedWithTimestamp();
      this.zzaCQ = l1;
      localObject = paramPlayer.getTitle();
      this.zzapg = ((String)localObject);
      bool = paramPlayer.zzvH();
      this.zzaCT = bool;
      localObject = paramPlayer.zzvI();
      if (localObject != null) {
        break label369;
      }
      label187:
      this.zzaCR = localMostRecentGameInfoEntity;
      localObject = paramPlayer.getLevelInfo();
      this.zzaCS = ((PlayerLevelInfo)localObject);
      bool = paramPlayer.zzvF();
      this.zzaCU = bool;
      localObject = paramPlayer.zzvE();
      this.zzaCV = ((String)localObject);
      localObject = paramPlayer.getName();
      this.mName = ((String)localObject);
      localObject = paramPlayer.getBannerImageLandscapeUri();
      this.zzaCW = ((Uri)localObject);
      localObject = paramPlayer.getBannerImageLandscapeUrl();
      this.zzaCX = ((String)localObject);
      localObject = paramPlayer.getBannerImagePortraitUri();
      this.zzaCY = ((Uri)localObject);
      localObject = paramPlayer.getBannerImagePortraitUrl();
      this.zzaCZ = ((String)localObject);
      if (paramBoolean)
      {
        localObject = this.zzacX;
        zzb.zzv(localObject);
      }
      localObject = this.zzWQ;
      zzb.zzv(localObject);
      long l2 = this.zzaCO;
      l1 = 0L;
      bool = l2 < l1;
      if (!bool) {
        break label382;
      }
      bool = true;
    }
    for (;;)
    {
      zzb.zzab(bool);
      return;
      bool = false;
      localObject = null;
      break;
      label369:
      localMostRecentGameInfoEntity = new com/google/android/gms/games/internal/player/MostRecentGameInfoEntity;
      localMostRecentGameInfoEntity.<init>((MostRecentGameInfo)localObject);
      break label187;
      label382:
      bool = false;
      localObject = null;
    }
  }
  
  static boolean zza(Player paramPlayer, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Player;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramPlayer != paramObject)
      {
        paramObject = (Player)paramObject;
        Object localObject1 = ((Player)paramObject).getPlayerId();
        Object localObject2 = paramPlayer.getPlayerId();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Player)paramObject).getDisplayName();
          localObject2 = paramPlayer.getDisplayName();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = Boolean.valueOf(((Player)paramObject).zzvF());
            boolean bool3 = paramPlayer.zzvF();
            localObject2 = Boolean.valueOf(bool3);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((Player)paramObject).getIconImageUri();
              localObject2 = paramPlayer.getIconImageUri();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Player)paramObject).getHiResImageUri();
                localObject2 = paramPlayer.getHiResImageUri();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  long l1 = ((Player)paramObject).getRetrievedTimestamp();
                  localObject1 = Long.valueOf(l1);
                  long l2 = paramPlayer.getRetrievedTimestamp();
                  localObject2 = Long.valueOf(l2);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((Player)paramObject).getTitle();
                    localObject2 = paramPlayer.getTitle();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = ((Player)paramObject).getLevelInfo();
                      localObject2 = paramPlayer.getLevelInfo();
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = ((Player)paramObject).zzvE();
                        localObject2 = paramPlayer.zzvE();
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((Player)paramObject).getName();
                          localObject2 = paramPlayer.getName();
                          bool2 = zzw.equal(localObject1, localObject2);
                          if (bool2)
                          {
                            localObject1 = ((Player)paramObject).getBannerImageLandscapeUri();
                            localObject2 = paramPlayer.getBannerImageLandscapeUri();
                            bool2 = zzw.equal(localObject1, localObject2);
                            if (bool2)
                            {
                              localObject1 = ((Player)paramObject).getBannerImagePortraitUri();
                              localObject2 = paramPlayer.getBannerImagePortraitUri();
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
        bool1 = false;
      }
    }
  }
  
  static int zzb(Player paramPlayer)
  {
    Object[] arrayOfObject = new Object[12];
    Object localObject = paramPlayer.getPlayerId();
    arrayOfObject[0] = localObject;
    localObject = paramPlayer.getDisplayName();
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(paramPlayer.zzvF());
    arrayOfObject[2] = localObject;
    localObject = paramPlayer.getIconImageUri();
    arrayOfObject[3] = localObject;
    localObject = paramPlayer.getHiResImageUri();
    arrayOfObject[4] = localObject;
    localObject = Long.valueOf(paramPlayer.getRetrievedTimestamp());
    arrayOfObject[5] = localObject;
    localObject = paramPlayer.getTitle();
    arrayOfObject[6] = localObject;
    localObject = paramPlayer.getLevelInfo();
    arrayOfObject[7] = localObject;
    localObject = paramPlayer.zzvE();
    arrayOfObject[8] = localObject;
    localObject = paramPlayer.getName();
    arrayOfObject[9] = localObject;
    localObject = paramPlayer.getBannerImageLandscapeUri();
    arrayOfObject[10] = localObject;
    localObject = paramPlayer.getBannerImagePortraitUri();
    arrayOfObject[11] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static String zzc(Player paramPlayer)
  {
    zzw.zza localzza = zzw.zzy(paramPlayer);
    Object localObject = paramPlayer.getPlayerId();
    localzza = localzza.zzg("PlayerId", localObject);
    localObject = paramPlayer.getDisplayName();
    localzza = localzza.zzg("DisplayName", localObject);
    localObject = Boolean.valueOf(paramPlayer.zzvF());
    localzza = localzza.zzg("HasDebugAccess", localObject);
    localObject = paramPlayer.getIconImageUri();
    localzza = localzza.zzg("IconImageUri", localObject);
    localObject = paramPlayer.getIconImageUrl();
    localzza = localzza.zzg("IconImageUrl", localObject);
    localObject = paramPlayer.getHiResImageUri();
    localzza = localzza.zzg("HiResImageUri", localObject);
    localObject = paramPlayer.getHiResImageUrl();
    localzza = localzza.zzg("HiResImageUrl", localObject);
    localObject = Long.valueOf(paramPlayer.getRetrievedTimestamp());
    localzza = localzza.zzg("RetrievedTimestamp", localObject);
    localObject = paramPlayer.getTitle();
    localzza = localzza.zzg("Title", localObject);
    localObject = paramPlayer.getLevelInfo();
    localzza = localzza.zzg("LevelInfo", localObject);
    localObject = paramPlayer.zzvE();
    localzza = localzza.zzg("GamerTag", localObject);
    localObject = paramPlayer.getName();
    localzza = localzza.zzg("Name", localObject);
    localObject = paramPlayer.getBannerImageLandscapeUri();
    localzza = localzza.zzg("BannerImageLandscapeUri", localObject);
    localObject = paramPlayer.getBannerImageLandscapeUrl();
    localzza = localzza.zzg("BannerImageLandscapeUrl", localObject);
    localObject = paramPlayer.getBannerImagePortraitUri();
    localzza = localzza.zzg("BannerImagePortraitUri", localObject);
    localObject = paramPlayer.getBannerImagePortraitUrl();
    return localzza.zzg("BannerImagePortraitUrl", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Player freeze()
  {
    return this;
  }
  
  public Uri getBannerImageLandscapeUri()
  {
    return this.zzaCW;
  }
  
  public String getBannerImageLandscapeUrl()
  {
    return this.zzaCX;
  }
  
  public Uri getBannerImagePortraitUri()
  {
    return this.zzaCY;
  }
  
  public String getBannerImagePortraitUrl()
  {
    return this.zzaCZ;
  }
  
  public String getDisplayName()
  {
    return this.zzWQ;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzWQ, paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    return this.zzaCe;
  }
  
  public String getHiResImageUrl()
  {
    return this.zzaCp;
  }
  
  public Uri getIconImageUri()
  {
    return this.zzaCd;
  }
  
  public String getIconImageUrl()
  {
    return this.zzaCo;
  }
  
  public long getLastPlayedWithTimestamp()
  {
    return this.zzaCQ;
  }
  
  public PlayerLevelInfo getLevelInfo()
  {
    return this.zzaCS;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getPlayerId()
  {
    return this.zzacX;
  }
  
  public long getRetrievedTimestamp()
  {
    return this.zzaCO;
  }
  
  public String getTitle()
  {
    return this.zzapg;
  }
  
  public void getTitle(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzapg, paramCharArrayBuffer);
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean hasHiResImage()
  {
    Uri localUri = getHiResImageUri();
    boolean bool;
    if (localUri != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localUri = null;
    }
  }
  
  public boolean hasIconImage()
  {
    Uri localUri = getIconImageUri();
    boolean bool;
    if (localUri != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localUri = null;
    }
  }
  
  public int hashCode()
  {
    return zzb(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzc(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = null;
    boolean bool = zzqC();
    if (!bool)
    {
      PlayerEntityCreator.zza(this, paramParcel, paramInt);
      return;
    }
    Object localObject = this.zzacX;
    paramParcel.writeString((String)localObject);
    localObject = this.zzWQ;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaCd;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
      label61:
      paramParcel.writeString((String)localObject);
      localObject = this.zzaCe;
      if (localObject != null) {
        break label110;
      }
    }
    for (;;)
    {
      paramParcel.writeString(str);
      long l = this.zzaCO;
      paramParcel.writeLong(l);
      break;
      localObject = this.zzaCd.toString();
      break label61;
      label110:
      localObject = this.zzaCe;
      str = ((Uri)localObject).toString();
    }
  }
  
  public String zzvE()
  {
    return this.zzaCV;
  }
  
  public boolean zzvF()
  {
    return this.zzaCU;
  }
  
  public int zzvG()
  {
    return this.zzaCP;
  }
  
  public boolean zzvH()
  {
    return this.zzaCT;
  }
  
  public MostRecentGameInfo zzvI()
  {
    return this.zzaCR;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */