package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface TurnBasedMultiplayer$LoadMatchesResult
  extends Releasable, Result
{
  public abstract LoadMatchesResponse getMatches();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMultiplayer$LoadMatchesResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */