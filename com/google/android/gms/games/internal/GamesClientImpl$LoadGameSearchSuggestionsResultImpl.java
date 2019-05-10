package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;

final class GamesClientImpl$LoadGameSearchSuggestionsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements GamesMetadata.LoadGameSearchSuggestionsResult
{
  private final GameSearchSuggestionBuffer zzaED;
  
  GamesClientImpl$LoadGameSearchSuggestionsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    GameSearchSuggestionBuffer localGameSearchSuggestionBuffer = new com/google/android/gms/games/internal/game/GameSearchSuggestionBuffer;
    localGameSearchSuggestionBuffer.<init>(paramDataHolder);
    this.zzaED = localGameSearchSuggestionBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadGameSearchSuggestionsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */