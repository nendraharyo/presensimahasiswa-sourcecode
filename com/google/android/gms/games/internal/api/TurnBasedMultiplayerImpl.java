package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import java.util.List;

public final class TurnBasedMultiplayerImpl
  implements TurnBasedMultiplayer
{
  public PendingResult acceptInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    TurnBasedMultiplayerImpl.3 local3 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$3;
    local3.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public PendingResult cancelMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    TurnBasedMultiplayerImpl.8 local8 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$8;
    local8.<init>(this, paramString, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local8);
  }
  
  public PendingResult createMatch(GoogleApiClient paramGoogleApiClient, TurnBasedMatchConfig paramTurnBasedMatchConfig)
  {
    TurnBasedMultiplayerImpl.1 local1 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramTurnBasedMatchConfig);
    return paramGoogleApiClient.zzb(local1);
  }
  
  public void declineInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null)
    {
      int i = 1;
      localGamesClientImpl.zzr(paramString, i);
    }
  }
  
  public void dismissInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null)
    {
      int i = 1;
      localGamesClientImpl.zzq(paramString, i);
    }
  }
  
  public void dismissMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzdH(paramString);
    }
  }
  
  public PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    ((ParticipantResult[])null);
    return finishMatch(paramGoogleApiClient, paramString, null, null);
  }
  
  public PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, List paramList)
  {
    int i;
    if (paramList == null) {
      i = 0;
    }
    for (ParticipantResult[] arrayOfParticipantResult = null;; arrayOfParticipantResult = (ParticipantResult[])paramList.toArray(arrayOfParticipantResult))
    {
      return finishMatch(paramGoogleApiClient, paramString, paramArrayOfByte, arrayOfParticipantResult);
      i = paramList.size();
      arrayOfParticipantResult = new ParticipantResult[i];
    }
  }
  
  public PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, ParticipantResult... paramVarArgs)
  {
    TurnBasedMultiplayerImpl.5 local5 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$5;
    local5.<init>(this, paramGoogleApiClient, paramString, paramArrayOfByte, paramVarArgs);
    return paramGoogleApiClient.zzb(local5);
  }
  
  public Intent getInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwB();
  }
  
  public int getMaxMatchDataSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwL();
  }
  
  public Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    return Games.zzh(paramGoogleApiClient).zzb(paramInt1, paramInt2, true);
  }
  
  public Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return Games.zzh(paramGoogleApiClient).zzb(paramInt1, paramInt2, paramBoolean);
  }
  
  public PendingResult leaveMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    TurnBasedMultiplayerImpl.6 local6 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$6;
    local6.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult leaveMatchDuringTurn(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    TurnBasedMultiplayerImpl.7 local7 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$7;
    local7.<init>(this, paramGoogleApiClient, paramString1, paramString2);
    return paramGoogleApiClient.zzb(local7);
  }
  
  public PendingResult loadMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    TurnBasedMultiplayerImpl.10 local10 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$10;
    local10.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(local10);
  }
  
  public PendingResult loadMatchesByStatus(GoogleApiClient paramGoogleApiClient, int paramInt, int[] paramArrayOfInt)
  {
    TurnBasedMultiplayerImpl.9 local9 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$9;
    local9.<init>(this, paramGoogleApiClient, paramInt, paramArrayOfInt);
    return paramGoogleApiClient.zza(local9);
  }
  
  public PendingResult loadMatchesByStatus(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt)
  {
    return loadMatchesByStatus(paramGoogleApiClient, 0, paramArrayOfInt);
  }
  
  public void registerMatchUpdateListener(GoogleApiClient paramGoogleApiClient, OnTurnBasedMatchUpdateReceivedListener paramOnTurnBasedMatchUpdateReceivedListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null)
    {
      zzq localzzq = paramGoogleApiClient.zzr(paramOnTurnBasedMatchUpdateReceivedListener);
      localGamesClientImpl.zzb(localzzq);
    }
  }
  
  public PendingResult rematch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    TurnBasedMultiplayerImpl.2 local2 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$2;
    local2.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    ((ParticipantResult[])null);
    return takeTurn(paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, null);
  }
  
  public PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, List paramList)
  {
    if (paramList == null) {}
    Object localObject2;
    for (Object localObject1 = null;; localObject1 = localObject2)
    {
      localObject2 = this;
      return takeTurn(paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, (ParticipantResult[])localObject1);
      int i = paramList.size();
      localObject2 = new ParticipantResult[i];
      localObject2 = (ParticipantResult[])paramList.toArray((Object[])localObject2);
    }
  }
  
  public PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult... paramVarArgs)
  {
    TurnBasedMultiplayerImpl.4 local4 = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$4;
    local4.<init>(this, paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, paramVarArgs);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public void unregisterMatchUpdateListener(GoogleApiClient paramGoogleApiClient)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzwE();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */