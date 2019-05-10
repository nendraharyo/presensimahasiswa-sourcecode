package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;

final class GamesClientImpl$LoadInvitationsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Invitations.LoadInvitationsResult
{
  private final InvitationBuffer zzaEF;
  
  GamesClientImpl$LoadInvitationsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    InvitationBuffer localInvitationBuffer = new com/google/android/gms/games/multiplayer/InvitationBuffer;
    localInvitationBuffer.<init>(paramDataHolder);
    this.zzaEF = localInvitationBuffer;
  }
  
  public InvitationBuffer getInvitations()
  {
    return this.zzaEF;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadInvitationsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */