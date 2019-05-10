package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players.LoadPlayersResult;

class PlayersImpl$LoadPlayersImpl$1
  implements Players.LoadPlayersResult
{
  PlayersImpl$LoadPlayersImpl$1(PlayersImpl.LoadPlayersImpl paramLoadPlayersImpl, Status paramStatus) {}
  
  public PlayerBuffer getPlayers()
  {
    PlayerBuffer localPlayerBuffer = new com/google/android/gms/games/PlayerBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localPlayerBuffer.<init>(localDataHolder);
    return localPlayerBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\PlayersImpl$LoadPlayersImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */