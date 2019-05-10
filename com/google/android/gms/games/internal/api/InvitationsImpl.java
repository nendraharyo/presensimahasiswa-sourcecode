package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

public final class InvitationsImpl
  implements Invitations
{
  public Intent getInvitationInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwC();
  }
  
  public PendingResult loadInvitations(GoogleApiClient paramGoogleApiClient)
  {
    return loadInvitations(paramGoogleApiClient, 0);
  }
  
  public PendingResult loadInvitations(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    InvitationsImpl.1 local1 = new com/google/android/gms/games/internal/api/InvitationsImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramInt);
    return paramGoogleApiClient.zza(local1);
  }
  
  public void registerInvitationListener(GoogleApiClient paramGoogleApiClient, OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null)
    {
      zzq localzzq = paramGoogleApiClient.zzr(paramOnInvitationReceivedListener);
      localGamesClientImpl.zza(localzzq);
    }
  }
  
  public void unregisterInvitationListener(GoogleApiClient paramGoogleApiClient)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzwD();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\InvitationsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */