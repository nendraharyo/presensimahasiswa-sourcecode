package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

final class GamesClientImpl$InvitationRemovedNotifier
  implements zzq.zzb
{
  private final String zzUO;
  
  GamesClientImpl$InvitationRemovedNotifier(String paramString)
  {
    this.zzUO = paramString;
  }
  
  public void zza(OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    String str = this.zzUO;
    paramOnInvitationReceivedListener.onInvitationRemoved(str);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$InvitationRemovedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */