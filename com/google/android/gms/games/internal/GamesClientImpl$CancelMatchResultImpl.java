package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;

final class GamesClientImpl$CancelMatchResultImpl
  implements TurnBasedMultiplayer.CancelMatchResult
{
  private final Status zzUX;
  private final String zzaEm;
  
  GamesClientImpl$CancelMatchResultImpl(Status paramStatus, String paramString)
  {
    this.zzUX = paramStatus;
    this.zzaEm = paramString;
  }
  
  public String getMatchId()
  {
    return this.zzaEm;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$CancelMatchResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */