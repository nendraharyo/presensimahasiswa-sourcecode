package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class TurnBasedMatchBuffer
  extends zzf
{
  public TurnBasedMatchBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected String zzqg()
  {
    return "external_match_id";
  }
  
  protected TurnBasedMatch zzs(int paramInt1, int paramInt2)
  {
    TurnBasedMatchRef localTurnBasedMatchRef = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;
    DataHolder localDataHolder = this.zzahi;
    localTurnBasedMatchRef.<init>(localDataHolder, paramInt1, paramInt2);
    return localTurnBasedMatchRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMatchBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */