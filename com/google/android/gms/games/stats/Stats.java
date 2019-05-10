package com.google.android.gms.games.stats;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Stats
{
  public abstract PendingResult loadPlayerStats(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\stats\Stats.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */