package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;

final class GamesClientImpl$LoadGameInstancesResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements GamesMetadata.LoadGameInstancesResult
{
  private final GameInstanceBuffer zzaEC;
  
  GamesClientImpl$LoadGameInstancesResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    GameInstanceBuffer localGameInstanceBuffer = new com/google/android/gms/games/internal/game/GameInstanceBuffer;
    localGameInstanceBuffer.<init>(paramDataHolder);
    this.zzaEC = localGameInstanceBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadGameInstancesResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */