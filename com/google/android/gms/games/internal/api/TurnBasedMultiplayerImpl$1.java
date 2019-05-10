package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;

class TurnBasedMultiplayerImpl$1
  extends TurnBasedMultiplayerImpl.InitiateMatchImpl
{
  TurnBasedMultiplayerImpl$1(TurnBasedMultiplayerImpl paramTurnBasedMultiplayerImpl, GoogleApiClient paramGoogleApiClient, TurnBasedMatchConfig paramTurnBasedMatchConfig)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    TurnBasedMatchConfig localTurnBasedMatchConfig = this.zzaHG;
    paramGamesClientImpl.zza(this, localTurnBasedMatchConfig);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */