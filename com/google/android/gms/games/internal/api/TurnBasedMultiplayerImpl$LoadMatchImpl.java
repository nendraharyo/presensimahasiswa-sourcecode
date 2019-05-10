package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;

abstract class TurnBasedMultiplayerImpl$LoadMatchImpl
  extends Games.BaseGamesApiMethodImpl
{
  private TurnBasedMultiplayerImpl$LoadMatchImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public TurnBasedMultiplayer.LoadMatchResult zzaL(Status paramStatus)
  {
    TurnBasedMultiplayerImpl.LoadMatchImpl.1 local1 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$LoadMatchImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl$LoadMatchImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */