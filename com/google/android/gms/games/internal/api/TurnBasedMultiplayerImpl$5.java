package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;

class TurnBasedMultiplayerImpl$5
  extends TurnBasedMultiplayerImpl.UpdateMatchImpl
{
  TurnBasedMultiplayerImpl$5(TurnBasedMultiplayerImpl paramTurnBasedMultiplayerImpl, GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, ParticipantResult[] paramArrayOfParticipantResult)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str = this.zzaHI;
    byte[] arrayOfByte = this.zzaHL;
    ParticipantResult[] arrayOfParticipantResult = this.zzaHN;
    paramGamesClientImpl.zza(this, str, arrayOfByte, arrayOfParticipantResult);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */