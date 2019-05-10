package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFy;
  
  public GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFy = localzzb;
  }
  
  public void zzu(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFy;
    GamesClientImpl.LoadMatchResultImpl localLoadMatchResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadMatchResultImpl;
    localLoadMatchResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localLoadMatchResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */