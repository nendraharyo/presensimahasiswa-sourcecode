package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

final class GamesClientImpl$RoomConnectingNotifier
  extends GamesClientImpl.AbstractRoomStatusNotifier
{
  GamesClientImpl$RoomConnectingNotifier(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
  {
    paramRoomStatusUpdateListener.onRoomConnecting(paramRoom);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RoomConnectingNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */