package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;

class TurnBasedMultiplayerImpl$4
  extends TurnBasedMultiplayerImpl.UpdateMatchImpl
{
  TurnBasedMultiplayerImpl$4(TurnBasedMultiplayerImpl paramTurnBasedMultiplayerImpl, GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult[] paramArrayOfParticipantResult)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    String str1 = this.zzaHI;
    byte[] arrayOfByte = this.zzaHL;
    String str2 = this.zzaHM;
    ParticipantResult[] arrayOfParticipantResult = this.zzaHN;
    paramGamesClientImpl.zza(this, str1, arrayOfByte, str2, arrayOfParticipantResult);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */