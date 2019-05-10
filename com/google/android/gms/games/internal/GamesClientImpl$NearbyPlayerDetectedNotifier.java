package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.OnNearbyPlayerDetectedListener;
import com.google.android.gms.games.Player;

final class GamesClientImpl$NearbyPlayerDetectedNotifier
  implements zzq.zzb
{
  private final Player zzaEU;
  
  public void zza(OnNearbyPlayerDetectedListener paramOnNearbyPlayerDetectedListener)
  {
    Player localPlayer = this.zzaEU;
    paramOnNearbyPlayerDetectedListener.zza(localPlayer);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$NearbyPlayerDetectedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */