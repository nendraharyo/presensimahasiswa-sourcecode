package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class AchievementRef
  extends zzc
  implements Achievement
{
  AchievementRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Achievement freeze()
  {
    AchievementEntity localAchievementEntity = new com/google/android/gms/games/achievement/AchievementEntity;
    localAchievementEntity.<init>(this);
    return localAchievementEntity;
  }
  
  public String getAchievementId()
  {
    return getString("external_achievement_id");
  }
  
  public int getCurrentSteps()
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      return getInteger("current_steps");
      i = 0;
    }
  }
  
  public String getDescription()
  {
    return getString("description");
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public String getFormattedCurrentSteps()
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      return getString("formatted_current_steps");
      i = 0;
    }
  }
  
  public void getFormattedCurrentSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      zza("formatted_current_steps", paramCharArrayBuffer);
      return;
      i = 0;
    }
  }
  
  public String getFormattedTotalSteps()
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      return getString("formatted_total_steps");
      i = 0;
    }
  }
  
  public void getFormattedTotalSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      zza("formatted_total_steps", paramCharArrayBuffer);
      return;
      i = 0;
    }
  }
  
  public long getLastUpdatedTimestamp()
  {
    return getLong("last_updated_timestamp");
  }
  
  public String getName()
  {
    return getString("name");
  }
  
  public void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("name", paramCharArrayBuffer);
  }
  
  public Player getPlayer()
  {
    PlayerRef localPlayerRef = new com/google/android/gms/games/PlayerRef;
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    localPlayerRef.<init>(localDataHolder, i);
    return localPlayerRef;
  }
  
  public Uri getRevealedImageUri()
  {
    return zzcA("revealed_icon_image_uri");
  }
  
  public String getRevealedImageUrl()
  {
    return getString("revealed_icon_image_url");
  }
  
  public int getState()
  {
    return getInteger("state");
  }
  
  public int getTotalSteps()
  {
    int i = 1;
    int j = getType();
    if (j == i) {}
    for (;;)
    {
      zzb.zzab(i);
      return getInteger("total_steps");
      i = 0;
    }
  }
  
  public int getType()
  {
    return getInteger("type");
  }
  
  public Uri getUnlockedImageUri()
  {
    return zzcA("unlocked_icon_image_uri");
  }
  
  public String getUnlockedImageUrl()
  {
    return getString("unlocked_icon_image_url");
  }
  
  public long getXpValue()
  {
    String str = "instance_xp_value";
    boolean bool = zzcz(str);
    if (bool)
    {
      str = "instance_xp_value";
      bool = zzcB(str);
      if (!bool) {}
    }
    else
    {
      str = "definition_xp_value";
    }
    for (long l = getLong(str);; l = getLong(str))
    {
      return l;
      str = "instance_xp_value";
    }
  }
  
  public String toString()
  {
    return AchievementEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AchievementEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\achievement\AchievementRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */