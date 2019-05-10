package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class PlayersImpl$1
  extends PlayersImpl.LoadPlayersImpl
{
  PlayersImpl$1(PlayersImpl paramPlayersImpl, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str = this.zzacQ;
    paramGamesClientImpl.zza(this, str, false);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\PlayersImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */