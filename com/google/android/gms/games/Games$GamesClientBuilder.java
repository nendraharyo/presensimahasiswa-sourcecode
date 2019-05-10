package com.google.android.gms.games;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.games.internal.GamesClientImpl;

abstract class Games$GamesClientBuilder
  extends Api.zza
{
  public int getPriority()
  {
    return 1;
  }
  
  public GamesClientImpl zza(Context paramContext, Looper paramLooper, zzf paramzzf, Games.GamesOptions paramGamesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    Games.GamesOptions localGamesOptions;
    GamesClientImpl localGamesClientImpl;
    if (paramGamesOptions == null)
    {
      localGamesOptions = new com/google/android/gms/games/Games$GamesOptions;
      localGamesClientImpl = null;
      localGamesOptions.<init>(null);
    }
    for (;;)
    {
      localGamesClientImpl = new com/google/android/gms/games/internal/GamesClientImpl;
      localGamesClientImpl.<init>(paramContext, paramLooper, paramzzf, localGamesOptions, paramConnectionCallbacks, paramOnConnectionFailedListener);
      return localGamesClientImpl;
      localGamesOptions = paramGamesOptions;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\Games$GamesClientBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */