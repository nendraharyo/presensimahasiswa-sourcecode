package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFz;
  
  public GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFz = localzzb;
  }
  
  public void zzw(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFz;
    GamesClientImpl.UpdateMatchResultImpl localUpdateMatchResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$UpdateMatchResultImpl;
    localUpdateMatchResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localUpdateMatchResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */