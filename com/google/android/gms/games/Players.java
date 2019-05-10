package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Players
{
  public static final String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";
  
  public abstract Intent getCompareProfileIntent(GoogleApiClient paramGoogleApiClient, Player paramPlayer);
  
  public abstract Player getCurrentPlayer(GoogleApiClient paramGoogleApiClient);
  
  public abstract String getCurrentPlayerId(GoogleApiClient paramGoogleApiClient);
  
  public abstract Intent getPlayerSearchIntent(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult loadConnectedPlayers(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
  
  public abstract PendingResult loadInvitablePlayers(GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean);
  
  public abstract PendingResult loadMoreInvitablePlayers(GoogleApiClient paramGoogleApiClient, int paramInt);
  
  public abstract PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient paramGoogleApiClient, int paramInt);
  
  public abstract PendingResult loadPlayer(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult loadPlayer(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean);
  
  public abstract PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\Players.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */