package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import java.util.ArrayList;

abstract class GamesClientImpl$AbstractPeerStatusNotifier
  extends GamesClientImpl.AbstractRoomStatusNotifier
{
  private final ArrayList zzaEj;
  
  GamesClientImpl$AbstractPeerStatusNotifier(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    super(paramDataHolder);
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    this.zzaEj = localArrayList1;
    int i = 0;
    localArrayList1 = null;
    int j = paramArrayOfString.length;
    while (i < j)
    {
      ArrayList localArrayList2 = this.zzaEj;
      String str = paramArrayOfString[i];
      localArrayList2.add(str);
      i += 1;
    }
  }
  
  protected void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
  {
    ArrayList localArrayList = this.zzaEj;
    zza(paramRoomStatusUpdateListener, paramRoom, localArrayList);
  }
  
  protected abstract void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList paramArrayList);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$AbstractPeerStatusNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */