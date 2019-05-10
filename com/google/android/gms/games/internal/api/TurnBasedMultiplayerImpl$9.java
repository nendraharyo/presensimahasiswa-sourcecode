package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class TurnBasedMultiplayerImpl$9
  extends TurnBasedMultiplayerImpl.LoadMatchesImpl
{
  TurnBasedMultiplayerImpl$9(TurnBasedMultiplayerImpl paramTurnBasedMultiplayerImpl, GoogleApiClient paramGoogleApiClient, int paramInt, int[] paramArrayOfInt)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    int i = this.zzaHJ;
    int[] arrayOfInt = this.zzaHK;
    paramGamesClientImpl.zza(this, i, arrayOfInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */