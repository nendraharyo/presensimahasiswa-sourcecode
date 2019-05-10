package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zze;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

abstract class GamesClientImpl$AbstractRoomStatusNotifier
  extends zze
{
  GamesClientImpl$AbstractRoomStatusNotifier(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, DataHolder paramDataHolder)
  {
    Room localRoom = GamesClientImpl.zzZ(paramDataHolder);
    zza(paramRoomStatusUpdateListener, localRoom);
  }
  
  protected abstract void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$AbstractRoomStatusNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */