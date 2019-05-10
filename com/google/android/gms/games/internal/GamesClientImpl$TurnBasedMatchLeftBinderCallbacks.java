package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$TurnBasedMatchLeftBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFx;
  
  public GamesClientImpl$TurnBasedMatchLeftBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFx = localzzb;
  }
  
  public void zzx(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFx;
    GamesClientImpl.LeaveMatchResultImpl localLeaveMatchResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LeaveMatchResultImpl;
    localLeaveMatchResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localLeaveMatchResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$TurnBasedMatchLeftBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */