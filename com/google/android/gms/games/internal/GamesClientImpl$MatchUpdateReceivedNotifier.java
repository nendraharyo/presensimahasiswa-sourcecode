package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

final class GamesClientImpl$MatchUpdateReceivedNotifier
  implements zzq.zzb
{
  private final TurnBasedMatch zzaES;
  
  GamesClientImpl$MatchUpdateReceivedNotifier(TurnBasedMatch paramTurnBasedMatch)
  {
    this.zzaES = paramTurnBasedMatch;
  }
  
  public void zza(OnTurnBasedMatchUpdateReceivedListener paramOnTurnBasedMatchUpdateReceivedListener)
  {
    TurnBasedMatch localTurnBasedMatch = this.zzaES;
    paramOnTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchReceived(localTurnBasedMatch);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$MatchUpdateReceivedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */