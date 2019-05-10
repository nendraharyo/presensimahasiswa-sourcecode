package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.GameRef;

public final class ExperienceEventRef
  extends zzc
  implements ExperienceEvent
{
  private final GameRef zzaIk;
  
  public ExperienceEventRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    Object localObject = "external_game_id";
    boolean bool = zzcB((String)localObject);
    if (bool)
    {
      bool = false;
      localObject = null;
    }
    for (this.zzaIk = null;; this.zzaIk = ((GameRef)localObject))
    {
      return;
      localObject = new com/google/android/gms/games/GameRef;
      DataHolder localDataHolder = this.zzahi;
      int i = this.zzaje;
      ((GameRef)localObject).<init>(localDataHolder, i);
    }
  }
  
  public String getIconImageUrl()
  {
    return getString("icon_url");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\experience\ExperienceEventRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */