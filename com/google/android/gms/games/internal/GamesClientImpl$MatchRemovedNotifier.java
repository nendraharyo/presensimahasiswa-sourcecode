package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;

final class GamesClientImpl$MatchRemovedNotifier
  implements zzq.zzb
{
  private final String zzaER;
  
  GamesClientImpl$MatchRemovedNotifier(String paramString)
  {
    this.zzaER = paramString;
  }
  
  public void zza(OnTurnBasedMatchUpdateReceivedListener paramOnTurnBasedMatchUpdateReceivedListener)
  {
    String str = this.zzaER;
    paramOnTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchRemoved(str);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$MatchRemovedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */