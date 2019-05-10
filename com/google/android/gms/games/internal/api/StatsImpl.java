package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.stats.Stats;

public final class StatsImpl
  implements Stats
{
  public PendingResult loadPlayerStats(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    StatsImpl.1 local1 = new com/google/android/gms/games/internal/api/StatsImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramBoolean);
    return paramGoogleApiClient.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\StatsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */