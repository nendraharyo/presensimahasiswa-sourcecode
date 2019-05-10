package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;

abstract class TurnBasedMultiplayerImpl$CancelMatchImpl
  extends Games.BaseGamesApiMethodImpl
{
  private final String zzyv;
  
  public TurnBasedMultiplayerImpl$CancelMatchImpl(String paramString, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    this.zzyv = paramString;
  }
  
  public TurnBasedMultiplayer.CancelMatchResult zzaI(Status paramStatus)
  {
    TurnBasedMultiplayerImpl.CancelMatchImpl.1 local1 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$CancelMatchImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl$CancelMatchImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */