package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;

final class GamesClientImpl$MessageReceivedNotifier
  implements zzq.zzb
{
  private final RealTimeMessage zzaET;
  
  GamesClientImpl$MessageReceivedNotifier(RealTimeMessage paramRealTimeMessage)
  {
    this.zzaET = paramRealTimeMessage;
  }
  
  public void zza(RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener)
  {
    RealTimeMessage localRealTimeMessage = this.zzaET;
    paramRealTimeMessageReceivedListener.onRealTimeMessageReceived(localRealTimeMessage);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$MessageReceivedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */