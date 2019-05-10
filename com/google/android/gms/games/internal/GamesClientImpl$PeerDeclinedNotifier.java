package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import java.util.ArrayList;

final class GamesClientImpl$PeerDeclinedNotifier
  extends GamesClientImpl.AbstractPeerStatusNotifier
{
  GamesClientImpl$PeerDeclinedNotifier(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    super(paramDataHolder, paramArrayOfString);
  }
  
  protected void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList paramArrayList)
  {
    paramRoomStatusUpdateListener.onPeerDeclined(paramRoom, paramArrayList);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$PeerDeclinedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */