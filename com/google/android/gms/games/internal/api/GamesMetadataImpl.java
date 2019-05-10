package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class GamesMetadataImpl
  implements GamesMetadata
{
  public Game getCurrentGame(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwy();
  }
  
  public PendingResult loadGame(GoogleApiClient paramGoogleApiClient)
  {
    GamesMetadataImpl.1 local1 = new com/google/android/gms/games/internal/api/GamesMetadataImpl$1;
    local1.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\GamesMetadataImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */