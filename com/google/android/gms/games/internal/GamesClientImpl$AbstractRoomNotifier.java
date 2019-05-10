package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zze;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

abstract class GamesClientImpl$AbstractRoomNotifier
  extends zze
{
  GamesClientImpl$AbstractRoomNotifier(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected void zza(RoomUpdateListener paramRoomUpdateListener, DataHolder paramDataHolder)
  {
    Room localRoom = GamesClientImpl.zzZ(paramDataHolder);
    int i = paramDataHolder.getStatusCode();
    zza(paramRoomUpdateListener, localRoom, i);
  }
  
  protected abstract void zza(RoomUpdateListener paramRoomUpdateListener, Room paramRoom, int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$AbstractRoomNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */