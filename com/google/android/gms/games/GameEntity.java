package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzms;

public final class GameEntity
  extends GamesDowngradeableSafeParcel
  implements Game
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final boolean zzDZ;
  private final String zzWQ;
  private final String zzZC;
  private final String zzaCa;
  private final String zzaCb;
  private final String zzaCc;
  private final Uri zzaCd;
  private final Uri zzaCe;
  private final Uri zzaCf;
  private final boolean zzaCg;
  private final boolean zzaCh;
  private final String zzaCi;
  private final int zzaCj;
  private final int zzaCk;
  private final int zzaCl;
  private final boolean zzaCm;
  private final boolean zzaCn;
  private final String zzaCo;
  private final String zzaCp;
  private final String zzaCq;
  private final boolean zzaCr;
  private final boolean zzaCs;
  private final String zzaCt;
  private final boolean zzaCu;
  private final String zzaxl;
  
  static
  {
    GameEntity.GameEntityCreatorCompat localGameEntityCreatorCompat = new com/google/android/gms/games/GameEntity$GameEntityCreatorCompat;
    localGameEntityCreatorCompat.<init>();
    CREATOR = localGameEntityCreatorCompat;
  }
  
  GameEntity(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri1, Uri paramUri2, Uri paramUri3, boolean paramBoolean1, boolean paramBoolean2, String paramString7, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean3, boolean paramBoolean4, String paramString8, String paramString9, String paramString10, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, String paramString11, boolean paramBoolean8)
  {
    this.mVersionCode = paramInt1;
    this.zzZC = paramString1;
    this.zzWQ = paramString2;
    this.zzaCa = paramString3;
    this.zzaCb = paramString4;
    this.zzaxl = paramString5;
    this.zzaCc = paramString6;
    this.zzaCd = paramUri1;
    this.zzaCo = paramString8;
    this.zzaCe = paramUri2;
    this.zzaCp = paramString9;
    this.zzaCf = paramUri3;
    this.zzaCq = paramString10;
    this.zzaCg = paramBoolean1;
    this.zzaCh = paramBoolean2;
    this.zzaCi = paramString7;
    this.zzaCj = paramInt2;
    this.zzaCk = paramInt3;
    this.zzaCl = paramInt4;
    this.zzaCm = paramBoolean3;
    this.zzaCn = paramBoolean4;
    this.zzDZ = paramBoolean5;
    this.zzaCr = paramBoolean6;
    this.zzaCs = paramBoolean7;
    this.zzaCt = paramString11;
    this.zzaCu = paramBoolean8;
  }
  
  public GameEntity(Game paramGame)
  {
    this.mVersionCode = 7;
    Object localObject = paramGame.getApplicationId();
    this.zzZC = ((String)localObject);
    localObject = paramGame.getPrimaryCategory();
    this.zzaCa = ((String)localObject);
    localObject = paramGame.getSecondaryCategory();
    this.zzaCb = ((String)localObject);
    localObject = paramGame.getDescription();
    this.zzaxl = ((String)localObject);
    localObject = paramGame.getDeveloperName();
    this.zzaCc = ((String)localObject);
    localObject = paramGame.getDisplayName();
    this.zzWQ = ((String)localObject);
    localObject = paramGame.getIconImageUri();
    this.zzaCd = ((Uri)localObject);
    localObject = paramGame.getIconImageUrl();
    this.zzaCo = ((String)localObject);
    localObject = paramGame.getHiResImageUri();
    this.zzaCe = ((Uri)localObject);
    localObject = paramGame.getHiResImageUrl();
    this.zzaCp = ((String)localObject);
    localObject = paramGame.getFeaturedImageUri();
    this.zzaCf = ((Uri)localObject);
    localObject = paramGame.getFeaturedImageUrl();
    this.zzaCq = ((String)localObject);
    boolean bool1 = paramGame.zzvx();
    this.zzaCg = bool1;
    bool1 = paramGame.zzvz();
    this.zzaCh = bool1;
    localObject = paramGame.zzvA();
    this.zzaCi = ((String)localObject);
    int i = paramGame.zzvB();
    this.zzaCj = i;
    i = paramGame.getAchievementTotalCount();
    this.zzaCk = i;
    i = paramGame.getLeaderboardCount();
    this.zzaCl = i;
    boolean bool2 = paramGame.isRealTimeMultiplayerEnabled();
    this.zzaCm = bool2;
    bool2 = paramGame.isTurnBasedMultiplayerEnabled();
    this.zzaCn = bool2;
    bool2 = paramGame.isMuted();
    this.zzDZ = bool2;
    bool2 = paramGame.zzvy();
    this.zzaCr = bool2;
    bool2 = paramGame.areSnapshotsEnabled();
    this.zzaCs = bool2;
    localObject = paramGame.getThemeColor();
    this.zzaCt = ((String)localObject);
    bool2 = paramGame.hasGamepadSupport();
    this.zzaCu = bool2;
  }
  
  static int zza(Game paramGame)
  {
    Object[] arrayOfObject = new Object[22];
    Object localObject = paramGame.getApplicationId();
    arrayOfObject[0] = localObject;
    localObject = paramGame.getDisplayName();
    arrayOfObject[1] = localObject;
    localObject = paramGame.getPrimaryCategory();
    arrayOfObject[2] = localObject;
    localObject = paramGame.getSecondaryCategory();
    arrayOfObject[3] = localObject;
    localObject = paramGame.getDescription();
    arrayOfObject[4] = localObject;
    localObject = paramGame.getDeveloperName();
    arrayOfObject[5] = localObject;
    localObject = paramGame.getIconImageUri();
    arrayOfObject[6] = localObject;
    localObject = paramGame.getHiResImageUri();
    arrayOfObject[7] = localObject;
    localObject = paramGame.getFeaturedImageUri();
    arrayOfObject[8] = localObject;
    localObject = Boolean.valueOf(paramGame.zzvx());
    arrayOfObject[9] = localObject;
    localObject = Boolean.valueOf(paramGame.zzvz());
    arrayOfObject[10] = localObject;
    localObject = paramGame.zzvA();
    arrayOfObject[11] = localObject;
    localObject = Integer.valueOf(paramGame.zzvB());
    arrayOfObject[12] = localObject;
    localObject = Integer.valueOf(paramGame.getAchievementTotalCount());
    arrayOfObject[13] = localObject;
    localObject = Integer.valueOf(paramGame.getLeaderboardCount());
    arrayOfObject[14] = localObject;
    localObject = Boolean.valueOf(paramGame.isRealTimeMultiplayerEnabled());
    arrayOfObject[15] = localObject;
    localObject = Boolean.valueOf(paramGame.isTurnBasedMultiplayerEnabled());
    arrayOfObject[16] = localObject;
    localObject = Boolean.valueOf(paramGame.isMuted());
    arrayOfObject[17] = localObject;
    localObject = Boolean.valueOf(paramGame.zzvy());
    arrayOfObject[18] = localObject;
    localObject = Boolean.valueOf(paramGame.areSnapshotsEnabled());
    arrayOfObject[19] = localObject;
    localObject = paramGame.getThemeColor();
    arrayOfObject[20] = localObject;
    localObject = Boolean.valueOf(paramGame.hasGamepadSupport());
    arrayOfObject[21] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(Game paramGame, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Game;
    if (!bool2) {
      bool1 = false;
    }
    while (paramGame == paramObject) {
      return bool1;
    }
    paramObject = (Game)paramObject;
    Object localObject1 = ((Game)paramObject).getApplicationId();
    Object localObject2 = paramGame.getApplicationId();
    bool2 = zzw.equal(localObject1, localObject2);
    boolean bool4;
    if (bool2)
    {
      localObject1 = ((Game)paramObject).getDisplayName();
      localObject2 = paramGame.getDisplayName();
      bool2 = zzw.equal(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = ((Game)paramObject).getPrimaryCategory();
        localObject2 = paramGame.getPrimaryCategory();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Game)paramObject).getSecondaryCategory();
          localObject2 = paramGame.getSecondaryCategory();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((Game)paramObject).getDescription();
            localObject2 = paramGame.getDescription();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((Game)paramObject).getDeveloperName();
              localObject2 = paramGame.getDeveloperName();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Game)paramObject).getIconImageUri();
                localObject2 = paramGame.getIconImageUri();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((Game)paramObject).getHiResImageUri();
                  localObject2 = paramGame.getHiResImageUri();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((Game)paramObject).getFeaturedImageUri();
                    localObject2 = paramGame.getFeaturedImageUri();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = Boolean.valueOf(((Game)paramObject).zzvx());
                      boolean bool3 = paramGame.zzvx();
                      localObject2 = Boolean.valueOf(bool3);
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        localObject1 = Boolean.valueOf(((Game)paramObject).zzvz());
                        bool3 = paramGame.zzvz();
                        localObject2 = Boolean.valueOf(bool3);
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((Game)paramObject).zzvA();
                          localObject2 = paramGame.zzvA();
                          bool2 = zzw.equal(localObject1, localObject2);
                          if (bool2)
                          {
                            localObject1 = Integer.valueOf(((Game)paramObject).zzvB());
                            int i = paramGame.zzvB();
                            localObject2 = Integer.valueOf(i);
                            bool2 = zzw.equal(localObject1, localObject2);
                            if (bool2)
                            {
                              localObject1 = Integer.valueOf(((Game)paramObject).getAchievementTotalCount());
                              i = paramGame.getAchievementTotalCount();
                              localObject2 = Integer.valueOf(i);
                              bool2 = zzw.equal(localObject1, localObject2);
                              if (bool2)
                              {
                                localObject1 = Integer.valueOf(((Game)paramObject).getLeaderboardCount());
                                i = paramGame.getLeaderboardCount();
                                localObject2 = Integer.valueOf(i);
                                bool2 = zzw.equal(localObject1, localObject2);
                                if (bool2)
                                {
                                  localObject1 = Boolean.valueOf(((Game)paramObject).isRealTimeMultiplayerEnabled());
                                  bool4 = paramGame.isRealTimeMultiplayerEnabled();
                                  localObject2 = Boolean.valueOf(bool4);
                                  bool2 = zzw.equal(localObject1, localObject2);
                                  if (bool2)
                                  {
                                    localObject2 = Boolean.valueOf(((Game)paramObject).isTurnBasedMultiplayerEnabled());
                                    bool2 = paramGame.isTurnBasedMultiplayerEnabled();
                                    if (!bool2) {
                                      break label760;
                                    }
                                    localObject1 = Boolean.valueOf(((Game)paramObject).isMuted());
                                    boolean bool5 = paramGame.isMuted();
                                    Boolean localBoolean = Boolean.valueOf(bool5);
                                    bool2 = zzw.equal(localObject1, localBoolean);
                                    if (!bool2) {
                                      break label760;
                                    }
                                    localObject1 = Boolean.valueOf(((Game)paramObject).zzvy());
                                    bool5 = paramGame.zzvy();
                                    localBoolean = Boolean.valueOf(bool5);
                                    bool2 = zzw.equal(localObject1, localBoolean);
                                    if (!bool2) {
                                      break label760;
                                    }
                                    bool2 = bool1;
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
    for (;;)
    {
      localObject1 = Boolean.valueOf(bool2);
      bool2 = zzw.equal(localObject2, localObject1);
      if (bool2)
      {
        localObject1 = Boolean.valueOf(((Game)paramObject).areSnapshotsEnabled());
        bool4 = paramGame.areSnapshotsEnabled();
        localObject2 = Boolean.valueOf(bool4);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Game)paramObject).getThemeColor();
          localObject2 = paramGame.getThemeColor();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = Boolean.valueOf(((Game)paramObject).hasGamepadSupport());
            bool4 = paramGame.hasGamepadSupport();
            localObject2 = Boolean.valueOf(bool4);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2) {
              break;
            }
          }
        }
      }
      bool1 = false;
      break;
      label760:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  static String zzb(Game paramGame)
  {
    zzw.zza localzza = zzw.zzy(paramGame);
    Object localObject = paramGame.getApplicationId();
    localzza = localzza.zzg("ApplicationId", localObject);
    localObject = paramGame.getDisplayName();
    localzza = localzza.zzg("DisplayName", localObject);
    localObject = paramGame.getPrimaryCategory();
    localzza = localzza.zzg("PrimaryCategory", localObject);
    localObject = paramGame.getSecondaryCategory();
    localzza = localzza.zzg("SecondaryCategory", localObject);
    localObject = paramGame.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = paramGame.getDeveloperName();
    localzza = localzza.zzg("DeveloperName", localObject);
    localObject = paramGame.getIconImageUri();
    localzza = localzza.zzg("IconImageUri", localObject);
    localObject = paramGame.getIconImageUrl();
    localzza = localzza.zzg("IconImageUrl", localObject);
    localObject = paramGame.getHiResImageUri();
    localzza = localzza.zzg("HiResImageUri", localObject);
    localObject = paramGame.getHiResImageUrl();
    localzza = localzza.zzg("HiResImageUrl", localObject);
    localObject = paramGame.getFeaturedImageUri();
    localzza = localzza.zzg("FeaturedImageUri", localObject);
    localObject = paramGame.getFeaturedImageUrl();
    localzza = localzza.zzg("FeaturedImageUrl", localObject);
    localObject = Boolean.valueOf(paramGame.zzvx());
    localzza = localzza.zzg("PlayEnabledGame", localObject);
    localObject = Boolean.valueOf(paramGame.zzvz());
    localzza = localzza.zzg("InstanceInstalled", localObject);
    localObject = paramGame.zzvA();
    localzza = localzza.zzg("InstancePackageName", localObject);
    localObject = Integer.valueOf(paramGame.getAchievementTotalCount());
    localzza = localzza.zzg("AchievementTotalCount", localObject);
    localObject = Integer.valueOf(paramGame.getLeaderboardCount());
    localzza = localzza.zzg("LeaderboardCount", localObject);
    localObject = Boolean.valueOf(paramGame.isRealTimeMultiplayerEnabled());
    localzza = localzza.zzg("RealTimeMultiplayerEnabled", localObject);
    localObject = Boolean.valueOf(paramGame.isTurnBasedMultiplayerEnabled());
    localzza = localzza.zzg("TurnBasedMultiplayerEnabled", localObject);
    localObject = Boolean.valueOf(paramGame.areSnapshotsEnabled());
    localzza = localzza.zzg("AreSnapshotsEnabled", localObject);
    localObject = paramGame.getThemeColor();
    localzza = localzza.zzg("ThemeColor", localObject);
    localObject = Boolean.valueOf(paramGame.hasGamepadSupport());
    return localzza.zzg("HasGamepadSupport", localObject).toString();
  }
  
  public boolean areSnapshotsEnabled()
  {
    return this.zzaCs;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Game freeze()
  {
    return this;
  }
  
  public int getAchievementTotalCount()
  {
    return this.zzaCk;
  }
  
  public String getApplicationId()
  {
    return this.zzZC;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaxl, paramCharArrayBuffer);
  }
  
  public String getDeveloperName()
  {
    return this.zzaCc;
  }
  
  public void getDeveloperName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaCc, paramCharArrayBuffer);
  }
  
  public String getDisplayName()
  {
    return this.zzWQ;
  }
  
  public void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzWQ, paramCharArrayBuffer);
  }
  
  public Uri getFeaturedImageUri()
  {
    return this.zzaCf;
  }
  
  public String getFeaturedImageUrl()
  {
    return this.zzaCq;
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
  
  public int getLeaderboardCount()
  {
    return this.zzaCl;
  }
  
  public String getPrimaryCategory()
  {
    return this.zzaCa;
  }
  
  public String getSecondaryCategory()
  {
    return this.zzaCb;
  }
  
  public String getThemeColor()
  {
    return this.zzaCt;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean hasGamepadSupport()
  {
    return this.zzaCu;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public boolean isMuted()
  {
    return this.zzDZ;
  }
  
  public boolean isRealTimeMultiplayerEnabled()
  {
    return this.zzaCm;
  }
  
  public boolean isTurnBasedMultiplayerEnabled()
  {
    return this.zzaCn;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    String str = null;
    int j = zzqC();
    if (j == 0)
    {
      GameEntityCreator.zza(this, paramParcel, paramInt);
      return;
    }
    Object localObject = this.zzZC;
    paramParcel.writeString((String)localObject);
    localObject = this.zzWQ;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaCa;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaCb;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaxl;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaCc;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaCd;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      label112:
      paramParcel.writeString((String)localObject);
      localObject = this.zzaCe;
      if (localObject != null) {
        break label257;
      }
      j = 0;
      localObject = null;
      label135:
      paramParcel.writeString((String)localObject);
      localObject = this.zzaCf;
      if (localObject != null) {
        break label269;
      }
      label152:
      paramParcel.writeString(str);
      j = this.zzaCg;
      if (j == 0) {
        break label285;
      }
      j = i;
      label172:
      paramParcel.writeInt(j);
      boolean bool = this.zzaCh;
      if (!bool) {
        break label294;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      localObject = this.zzaCi;
      paramParcel.writeString((String)localObject);
      int k = this.zzaCj;
      paramParcel.writeInt(k);
      k = this.zzaCk;
      paramParcel.writeInt(k);
      k = this.zzaCl;
      paramParcel.writeInt(k);
      break;
      localObject = this.zzaCd.toString();
      break label112;
      label257:
      localObject = this.zzaCe.toString();
      break label135;
      label269:
      localObject = this.zzaCf;
      str = ((Uri)localObject).toString();
      break label152;
      label285:
      k = 0;
      localObject = null;
      break label172;
      label294:
      i = 0;
    }
  }
  
  public String zzvA()
  {
    return this.zzaCi;
  }
  
  public int zzvB()
  {
    return this.zzaCj;
  }
  
  public boolean zzvx()
  {
    return this.zzaCg;
  }
  
  public boolean zzvy()
  {
    return this.zzaCr;
  }
  
  public boolean zzvz()
  {
    return this.zzaCh;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\GameEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */