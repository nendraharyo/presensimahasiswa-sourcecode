package com.google.android.gms.games.stats;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Stats$LoadPlayerStatsResult
  extends Releasable, Result
{
  public abstract PlayerStats getPlayerStats();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\stats\Stats$LoadPlayerStatsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */