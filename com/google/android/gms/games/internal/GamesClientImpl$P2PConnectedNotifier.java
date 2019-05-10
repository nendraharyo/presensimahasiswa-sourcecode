package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

final class GamesClientImpl$P2PConnectedNotifier
  implements zzq.zzb
{
  private final String zzaFa;
  
  GamesClientImpl$P2PConnectedNotifier(String paramString)
  {
    this.zzaFa = paramString;
  }
  
  public void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener)
  {
    String str = this.zzaFa;
    paramRoomStatusUpdateListener.onP2PConnected(str);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$P2PConnectedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */