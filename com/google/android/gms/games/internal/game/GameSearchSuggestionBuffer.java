package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class GameSearchSuggestionBuffer
  extends AbstractDataBuffer
{
  public GameSearchSuggestionBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public GameSearchSuggestion zzgB(int paramInt)
  {
    GameSearchSuggestionRef localGameSearchSuggestionRef = new com/google/android/gms/games/internal/game/GameSearchSuggestionRef;
    DataHolder localDataHolder = this.zzahi;
    localGameSearchSuggestionRef.<init>(localDataHolder, paramInt);
    return localGameSearchSuggestionRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\game\GameSearchSuggestionBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */