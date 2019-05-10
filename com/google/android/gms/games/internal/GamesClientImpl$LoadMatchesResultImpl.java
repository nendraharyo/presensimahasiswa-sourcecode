package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;

final class GamesClientImpl$LoadMatchesResultImpl
  implements TurnBasedMultiplayer.LoadMatchesResult
{
  private final Status zzUX;
  private final LoadMatchesResponse zzaEG;
  
  GamesClientImpl$LoadMatchesResultImpl(Status paramStatus, Bundle paramBundle)
  {
    this.zzUX = paramStatus;
    LoadMatchesResponse localLoadMatchesResponse = new com/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;
    localLoadMatchesResponse.<init>(paramBundle);
    this.zzaEG = localLoadMatchesResponse;
  }
  
  public LoadMatchesResponse getMatches()
  {
    return this.zzaEG;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    this.zzaEG.release();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadMatchesResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */