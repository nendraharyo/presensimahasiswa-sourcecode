package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

public final class PlayerRef
  extends zzc
  implements Player
{
  private final PlayerLevelInfo zzaCS;
  private final PlayerColumnNames zzaDh;
  private final MostRecentGameInfoRef zzaDi;
  
  public PlayerRef(DataHolder paramDataHolder, int paramInt)
  {
    this(paramDataHolder, paramInt, null);
  }
  
  public PlayerRef(DataHolder paramDataHolder, int paramInt, String paramString)
  {
    super(paramDataHolder, paramInt);
    Object localObject1 = new com/google/android/gms/games/internal/player/PlayerColumnNames;
    ((PlayerColumnNames)localObject1).<init>(paramString);
    this.zzaDh = ((PlayerColumnNames)localObject1);
    localObject1 = new com/google/android/gms/games/internal/player/MostRecentGameInfoRef;
    Object localObject2 = this.zzaDh;
    ((MostRecentGameInfoRef)localObject1).<init>(paramDataHolder, paramInt, (PlayerColumnNames)localObject2);
    this.zzaDi = ((MostRecentGameInfoRef)localObject1);
    boolean bool = zzvJ();
    Object localObject3;
    long l1;
    String str;
    long l2;
    if (bool)
    {
      localObject1 = this.zzaDh.zzaIC;
      int i = getInteger((String)localObject1);
      localObject1 = this.zzaDh.zzaIF;
      int j = getInteger((String)localObject1);
      localObject1 = new com/google/android/gms/games/PlayerLevel;
      localObject3 = this.zzaDh.zzaID;
      l1 = getLong((String)localObject3);
      str = this.zzaDh.zzaIE;
      l2 = getLong(str);
      ((PlayerLevel)localObject1).<init>(i, l1, l2);
      if (i == j) {
        break label278;
      }
      localObject3 = new com/google/android/gms/games/PlayerLevel;
      localObject2 = this.zzaDh.zzaIE;
      l2 = getLong((String)localObject2);
      localObject2 = this.zzaDh.zzaIG;
      long l3 = getLong((String)localObject2);
      ((PlayerLevel)localObject3).<init>(j, l2, l3);
    }
    label278:
    for (Object localObject4 = localObject3;; localObject4 = localObject1)
    {
      localObject2 = new com/google/android/gms/games/PlayerLevelInfo;
      localObject3 = this.zzaDh.zzaIB;
      l1 = getLong((String)localObject3);
      str = this.zzaDh.zzaIH;
      l2 = getLong(str);
      ((PlayerLevelInfo)localObject2).<init>(l1, l2, (PlayerLevel)localObject1, (PlayerLevel)localObject4);
      for (this.zzaCS = ((PlayerLevelInfo)localObject2);; this.zzaCS = null)
      {
        return;
        bool = false;
        localObject1 = null;
      }
    }
  }
  
  private boolean zzvJ()
  {
    boolean bool1 = false;
    String str = this.zzaDh.zzaIB;
    boolean bool2 = zzcB(str);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      str = this.zzaDh.zzaIB;
      long l1 = getLong(str);
      long l2 = -1;
      bool2 = l1 < l2;
      if (bool2) {
        bool1 = true;
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return PlayerEntity.zza(this, paramObject);
  }
  
  public Player freeze()
  {
    PlayerEntity localPlayerEntity = new com/google/android/gms/games/PlayerEntity;
    localPlayerEntity.<init>(this);
    return localPlayerEntity;
  }
  
  public Uri getBannerImageLandscapeUri()
  {
    String str = this.zzaDh.zzaIS;
    return zzcA(str);
  }
  
  public String getBannerImageLandscapeUrl()
  {
    String str = this.zzaDh.zzaIT;
    return getString(str);
  }
  
  public Uri getBannerImagePortraitUri()
  {
    String str = this.zzaDh.zzaIU;
    return zzcA(str);
  }
  
  public String getBannerImagePortraitUrl()
  {
    String str = this.zzaDh.zzaIV;
    return getString(str);
  }
  
  public String getDisplayName()
  {
    String str = this.zzaDh.zzaIt;
    return getString(str);
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    String str = this.zzaDh.zzaIt;
    zza(str, paramCharArrayBuffer);
  }
  
  public Uri getHiResImageUri()
  {
    String str = this.zzaDh.zzaIw;
    return zzcA(str);
  }
  
  public String getHiResImageUrl()
  {
    String str = this.zzaDh.zzaIx;
    return getString(str);
  }
  
  public Uri getIconImageUri()
  {
    String str = this.zzaDh.zzaIu;
    return zzcA(str);
  }
  
  public String getIconImageUrl()
  {
    String str = this.zzaDh.zzaIv;
    return getString(str);
  }
  
  public long getLastPlayedWithTimestamp()
  {
    String str = this.zzaDh.zzaIA;
    boolean bool = zzcz(str);
    if (bool)
    {
      str = this.zzaDh.zzaIA;
      bool = zzcB(str);
      if (!bool) {
        break label41;
      }
    }
    for (long l = -1;; l = getLong(str))
    {
      return l;
      label41:
      str = this.zzaDh.zzaIA;
    }
  }
  
  public PlayerLevelInfo getLevelInfo()
  {
    return this.zzaCS;
  }
  
  public String getName()
  {
    String str = this.zzaDh.name;
    return getString(str);
  }
  
  public String getPlayerId()
  {
    String str = this.zzaDh.zzaIs;
    return getString(str);
  }
  
  public long getRetrievedTimestamp()
  {
    String str = this.zzaDh.zzaIy;
    return getLong(str);
  }
  
  public String getTitle()
  {
    String str = this.zzaDh.title;
    return getString(str);
  }
  
  public void getTitle(CharArrayBuffer paramCharArrayBuffer)
  {
    String str = this.zzaDh.title;
    zza(str, paramCharArrayBuffer);
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
    return PlayerEntity.zzb(this);
  }
  
  public String toString()
  {
    return PlayerEntity.zzc(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((PlayerEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
  
  public String zzvE()
  {
    String str = this.zzaDh.zzaIR;
    return getString(str);
  }
  
  public boolean zzvF()
  {
    String str = this.zzaDh.zzaIQ;
    return getBoolean(str);
  }
  
  public int zzvG()
  {
    String str = this.zzaDh.zzaIz;
    return getInteger(str);
  }
  
  public boolean zzvH()
  {
    String str = this.zzaDh.zzaIJ;
    return getBoolean(str);
  }
  
  public MostRecentGameInfo zzvI()
  {
    Object localObject = this.zzaDh.zzaIK;
    boolean bool = zzcB((String)localObject);
    if (bool) {
      bool = false;
    }
    for (localObject = null;; localObject = this.zzaDi) {
      return (MostRecentGameInfo)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\PlayerRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */