package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;

class TurnBasedMultiplayerImpl$LoadMatchesImpl$1
  implements TurnBasedMultiplayer.LoadMatchesResult
{
  TurnBasedMultiplayerImpl$LoadMatchesImpl$1(TurnBasedMultiplayerImpl.LoadMatchesImpl paramLoadMatchesImpl, Status paramStatus) {}
  
  public LoadMatchesResponse getMatches()
  {
    LoadMatchesResponse localLoadMatchesResponse = new com/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localLoadMatchesResponse.<init>(localBundle);
    return localLoadMatchesResponse;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\TurnBasedMultiplayerImpl$LoadMatchesImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */