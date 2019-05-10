package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class GameInstanceBuffer
  extends AbstractDataBuffer
{
  public GameInstanceBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public GameInstance zzgA(int paramInt)
  {
    GameInstanceRef localGameInstanceRef = new com/google/android/gms/games/internal/game/GameInstanceRef;
    DataHolder localDataHolder = this.zzahi;
    localGameInstanceRef.<init>(localDataHolder, paramInt);
    return localGameInstanceRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\game\GameInstanceBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */