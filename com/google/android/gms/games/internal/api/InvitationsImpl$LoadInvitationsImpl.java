package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;

abstract class InvitationsImpl$LoadInvitationsImpl
  extends Games.BaseGamesApiMethodImpl
{
  private InvitationsImpl$LoadInvitationsImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Invitations.LoadInvitationsResult zzaj(Status paramStatus)
  {
    InvitationsImpl.LoadInvitationsImpl.1 local1 = new com/google/android/gms/games/internal/api/InvitationsImpl$LoadInvitationsImpl$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\InvitationsImpl$LoadInvitationsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */