package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class PlayersImpl$7
  extends PlayersImpl.LoadPlayersImpl
{
  PlayersImpl$7(PlayersImpl paramPlayersImpl, GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    int i = this.zzaGL;
    paramGamesClientImpl.zza(this, "played_with", i, true, false);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\PlayersImpl$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */