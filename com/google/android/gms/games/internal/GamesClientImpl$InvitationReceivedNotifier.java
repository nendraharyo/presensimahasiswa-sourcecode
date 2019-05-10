package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

final class GamesClientImpl$InvitationReceivedNotifier
  implements zzq.zzb
{
  private final Invitation zzaEu;
  
  GamesClientImpl$InvitationReceivedNotifier(Invitation paramInvitation)
  {
    this.zzaEu = paramInvitation;
  }
  
  public void zza(OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    Invitation localInvitation = this.zzaEu;
    paramOnInvitationReceivedListener.onInvitationReceived(localInvitation);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$InvitationReceivedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */