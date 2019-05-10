package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players.LoadPlayersResult;

final class GamesClientImpl$LoadPlayersResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Players.LoadPlayersResult
{
  private final PlayerBuffer zzaEJ;
  
  GamesClientImpl$LoadPlayersResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    PlayerBuffer localPlayerBuffer = new com/google/android/gms/games/PlayerBuffer;
    localPlayerBuffer.<init>(paramDataHolder);
    this.zzaEJ = localPlayerBuffer;
  }
  
  public PlayerBuffer getPlayers()
  {
    return this.zzaEJ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadPlayersResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */