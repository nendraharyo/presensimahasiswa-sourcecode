package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;

final class GamesClientImpl$LoadGamesResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements GamesMetadata.LoadGamesResult
{
  private final GameBuffer zzaEE;
  
  GamesClientImpl$LoadGamesResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    GameBuffer localGameBuffer = new com/google/android/gms/games/GameBuffer;
    localGameBuffer.<init>(paramDataHolder);
    this.zzaEE = localGameBuffer;
  }
  
  public GameBuffer getGames()
  {
    return this.zzaEE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadGamesResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */