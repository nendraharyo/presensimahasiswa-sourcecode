package com.google.android.gms.games.stats;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class PlayerStatsBuffer
  extends AbstractDataBuffer
{
  public PlayerStatsBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public PlayerStats zzgV(int paramInt)
  {
    PlayerStatsRef localPlayerStatsRef = new com/google/android/gms/games/stats/PlayerStatsRef;
    DataHolder localDataHolder = this.zzahi;
    localPlayerStatsRef.<init>(localDataHolder, paramInt);
    return localPlayerStatsRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\stats\PlayerStatsBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */