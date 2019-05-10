package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameBadgeEntity
  extends GamesDowngradeableSafeParcel
  implements GameBadge
{
  public static final GameBadgeEntityCreator CREATOR;
  private final int mVersionCode;
  private Uri zzaCd;
  private int zzabB;
  private String zzapg;
  private String zzaxl;
  
  static
  {
    GameBadgeEntity.GameBadgeEntityCreatorCompat localGameBadgeEntityCreatorCompat = new com/google/android/gms/games/internal/game/GameBadgeEntity$GameBadgeEntityCreatorCompat;
    localGameBadgeEntityCreatorCompat.<init>();
    CREATOR = localGameBadgeEntityCreatorCompat;
  }
  
  GameBadgeEntity(int paramInt1, int paramInt2, String paramString1, String paramString2, Uri paramUri)
  {
    this.mVersionCode = paramInt1;
    this.zzabB = paramInt2;
    this.zzapg = paramString1;
    this.zzaxl = paramString2;
    this.zzaCd = paramUri;
  }
  
  public GameBadgeEntity(GameBadge paramGameBadge)
  {
    this.mVersionCode = 1;
    int i = paramGameBadge.getType();
    this.zzabB = i;
    Object localObject = paramGameBadge.getTitle();
    this.zzapg = ((String)localObject);
    localObject = paramGameBadge.getDescription();
    this.zzaxl = ((String)localObject);
    localObject = paramGameBadge.getIconImageUri();
    this.zzaCd = ((Uri)localObject);
  }
  
  static int zza(GameBadge paramGameBadge)
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = Integer.valueOf(paramGameBadge.getType());
    arrayOfObject[0] = localObject;
    localObject = paramGameBadge.getTitle();
    arrayOfObject[1] = localObject;
    localObject = paramGameBadge.getDescription();
    arrayOfObject[2] = localObject;
    localObject = paramGameBadge.getIconImageUri();
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(GameBadge paramGameBadge, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof GameBadge;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramGameBadge != paramObject)
      {
        paramObject = (GameBadge)paramObject;
        Object localObject1 = Integer.valueOf(((GameBadge)paramObject).getType());
        Object localObject2 = paramGameBadge.getTitle();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((GameBadge)paramObject).getDescription();
          localObject2 = paramGameBadge.getIconImageUri();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  static String zzb(GameBadge paramGameBadge)
  {
    zzw.zza localzza = zzw.zzy(paramGameBadge);
    Object localObject = Integer.valueOf(paramGameBadge.getType());
    localzza = localzza.zzg("Type", localObject);
    localObject = paramGameBadge.getTitle();
    localzza = localzza.zzg("Title", localObject);
    localObject = paramGameBadge.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = paramGameBadge.getIconImageUri();
    return localzza.zzg("IconImageUri", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public Uri getIconImageUri()
  {
    return this.zzaCd;
  }
  
  public String getTitle()
  {
    return this.zzapg;
  }
  
  public int getType()
  {
    return this.zzabB;
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
    if (!bool)
    {
      GameBadgeEntityCreator.zza(this, paramParcel, paramInt);
      return;
    }
    int i = this.zzabB;
    paramParcel.writeInt(i);
    Object localObject = this.zzapg;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaxl;
    paramParcel.writeString((String)localObject);
    localObject = this.zzaCd;
    if (localObject == null) {
      i = 0;
    }
    for (localObject = null;; localObject = this.zzaCd.toString())
    {
      paramParcel.writeString((String)localObject);
      break;
    }
  }
  
  public GameBadge zzxm()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\game\GameBadgeEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */