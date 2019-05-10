package com.google.android.gms.games.multiplayer.turnbased;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import java.util.List;

public abstract interface TurnBasedMultiplayer
{
  public abstract PendingResult acceptInvitation(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult cancelMatch(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult createMatch(GoogleApiClient paramGoogleApiClient, TurnBasedMatchConfig paramTurnBasedMatchConfig);
  
  public abstract void declineInvitation(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract void dismissInvitation(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract void dismissMatch(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, List paramList);
  
  public abstract PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, ParticipantResult... paramVarArgs);
  
  public abstract Intent getInboxIntent(GoogleApiClient paramGoogleApiClient);
  
  public abstract int getMaxMatchDataSize(GoogleApiClient paramGoogleApiClient);
  
  public abstract Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2);
  
  public abstract Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public abstract PendingResult leaveMatch(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult leaveMatchDuringTurn(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2);
  
  public abstract PendingResult loadMatch(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult loadMatchesByStatus(GoogleApiClient paramGoogleApiClient, int paramInt, int[] paramArrayOfInt);
  
  public abstract PendingResult loadMatchesByStatus(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt);
  
  public abstract void registerMatchUpdateListener(GoogleApiClient paramGoogleApiClient, OnTurnBasedMatchUpdateReceivedListener paramOnTurnBasedMatchUpdateReceivedListener);
  
  public abstract PendingResult rematch(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2);
  
  public abstract PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, List paramList);
  
  public abstract PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult... paramVarArgs);
  
  public abstract void unregisterMatchUpdateListener(GoogleApiClient paramGoogleApiClient);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMultiplayer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */