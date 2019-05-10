package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl
  implements Players
{
  public Intent getCompareProfileIntent(GoogleApiClient paramGoogleApiClient, Player paramPlayer)
  {
    GamesClientImpl localGamesClientImpl = Games.zzh(paramGoogleApiClient);
    PlayerEntity localPlayerEntity = new com/google/android/gms/games/PlayerEntity;
    localPlayerEntity.<init>(paramPlayer);
    return localGamesClientImpl.zza(localPlayerEntity);
  }
  
  public Player getCurrentPlayer(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwx();
  }
  
  public String getCurrentPlayerId(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzah(true);
  }
  
  public Intent getPlayerSearchIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwH();
  }
  
  public PendingResult loadConnectedPlayers(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    PlayersImpl.8 local8 = new com/google/android/gms/games/internal/api/PlayersImpl$8;
    local8.<init>(this, paramGoogleApiClient, paramBoolean);
    return paramGoogleApiClient.zza(local8);
  }
  
  public PendingResult loadInvitablePlayers(GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean)
  {
    PlayersImpl.4 local4 = new com/google/android/gms/games/internal/api/PlayersImpl$4;
    local4.<init>(this, paramGoogleApiClient, paramInt, paramBoolean);
    return paramGoogleApiClient.zza(local4);
  }
  
  public PendingResult loadMoreInvitablePlayers(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    PlayersImpl.5 local5 = new com/google/android/gms/games/internal/api/PlayersImpl$5;
    local5.<init>(this, paramGoogleApiClient, paramInt);
    return paramGoogleApiClient.zza(local5);
  }
  
  public PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    PlayersImpl.7 local7 = new com/google/android/gms/games/internal/api/PlayersImpl$7;
    local7.<init>(this, paramGoogleApiClient, paramInt);
    return paramGoogleApiClient.zza(local7);
  }
  
  public PendingResult loadPlayer(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    PlayersImpl.1 local1 = new com/google/android/gms/games/internal/api/PlayersImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult loadPlayer(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    PlayersImpl.2 local2 = new com/google/android/gms/games/internal/api/PlayersImpl$2;
    local2.<init>(this, paramGoogleApiClient, paramString, paramBoolean);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean)
  {
    PlayersImpl.6 local6 = new com/google/android/gms/games/internal/api/PlayersImpl$6;
    local6.<init>(this, paramGoogleApiClient, paramInt, paramBoolean);
    return paramGoogleApiClient.zza(local6);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\PlayersImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */