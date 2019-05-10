package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

final class GamesClientImpl$LeftRoomNotifier
  implements zzq.zzb
{
  private final String zzaEw;
  private final int zzade;
  
  GamesClientImpl$LeftRoomNotifier(int paramInt, String paramString)
  {
    this.zzade = paramInt;
    this.zzaEw = paramString;
  }
  
  public void zza(RoomUpdateListener paramRoomUpdateListener)
  {
    int i = this.zzade;
    String str = this.zzaEw;
    paramRoomUpdateListener.onLeftRoom(i, str);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LeftRoomNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */