package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class RoomBuffer
  extends zzf
{
  public RoomBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected String zzqg()
  {
    return "external_match_id";
  }
  
  protected Room zzr(int paramInt1, int paramInt2)
  {
    RoomRef localRoomRef = new com/google/android/gms/games/multiplayer/realtime/RoomRef;
    DataHolder localDataHolder = this.zzahi;
    localRoomRef.<init>(localDataHolder, paramInt1, paramInt2);
    return localRoomRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\realtime\RoomBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */