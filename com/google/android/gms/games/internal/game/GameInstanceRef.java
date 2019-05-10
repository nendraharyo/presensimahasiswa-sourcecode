package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.constants.PlatformType;

public final class GameInstanceRef
  extends zzc
  implements GameInstance
{
  GameInstanceRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public String getApplicationId()
  {
    return getString("external_game_id");
  }
  
  public String getDisplayName()
  {
    return getString("instance_display_name");
  }
  
  public String getPackageName()
  {
    return getString("package_name");
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = getApplicationId();
    localzza = localzza.zzg("ApplicationId", localObject);
    localObject = getDisplayName();
    localzza = localzza.zzg("DisplayName", localObject);
    localObject = Boolean.valueOf(zzxn());
    localzza = localzza.zzg("SupportsRealTime", localObject);
    localObject = Boolean.valueOf(zzxo());
    localzza = localzza.zzg("SupportsTurnBased", localObject);
    localObject = PlatformType.zzgw(zzur());
    localzza = localzza.zzg("PlatformType", localObject);
    localObject = getPackageName();
    localzza = localzza.zzg("PackageName", localObject);
    localObject = Boolean.valueOf(zzxp());
    localzza = localzza.zzg("PiracyCheckEnabled", localObject);
    localObject = Boolean.valueOf(zzxq());
    return localzza.zzg("Installed", localObject).toString();
  }
  
  public int zzur()
  {
    return getInteger("platform_type");
  }
  
  public boolean zzxn()
  {
    String str = "real_time_support";
    int i = getInteger(str);
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  public boolean zzxo()
  {
    String str = "turn_based_support";
    int i = getInteger(str);
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  public boolean zzxp()
  {
    String str = "piracy_check";
    int i = getInteger(str);
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  public boolean zzxq()
  {
    String str = "installed";
    int i = getInteger(str);
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\game\GameInstanceRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */