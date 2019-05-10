package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult;
import com.google.android.gms.common.api.Status;

final class zzli$zzd
  implements GameManagerClient.GameManagerInstanceResult
{
  private final Status zzUX;
  private final GameManagerClient zzacV;
  
  zzli$zzd(Status paramStatus, GameManagerClient paramGameManagerClient)
  {
    this.zzUX = paramStatus;
    this.zzacV = paramGameManagerClient;
  }
  
  public GameManagerClient getGameManagerClient()
  {
    return this.zzacV;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */