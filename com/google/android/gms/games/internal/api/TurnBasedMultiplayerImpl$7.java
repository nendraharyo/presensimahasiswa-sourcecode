package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class TurnBasedMultiplayerImpl$7
  extends TurnBasedMultiplayerImpl.LeaveMatchImpl
{
  TurnBasedMultiplayerImpl$7(TurnBasedMultiplayerImpl paramTurnBasedMultiplayerImpl, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str1 = this.zzaHI;
    String str2 = this.zzaHM;
    paramGamesClientImpl.zza(this, str1, str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */