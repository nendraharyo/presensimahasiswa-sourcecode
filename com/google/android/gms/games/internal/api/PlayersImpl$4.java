package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class PlayersImpl$4
  extends PlayersImpl.LoadPlayersImpl
{
  PlayersImpl$4(PlayersImpl paramPlayersImpl, GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    int i = this.zzaGL;
    boolean bool = this.zzaFO;
    paramGamesClientImpl.zza(this, i, false, bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\PlayersImpl$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */