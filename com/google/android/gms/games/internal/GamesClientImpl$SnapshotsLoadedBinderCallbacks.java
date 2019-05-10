package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$SnapshotsLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFs;
  
  public GamesClientImpl$SnapshotsLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFs = localzzb;
  }
  
  public void zzN(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFs;
    GamesClientImpl.LoadSnapshotsResultImpl localLoadSnapshotsResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadSnapshotsResultImpl;
    localLoadSnapshotsResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localLoadSnapshotsResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$SnapshotsLoadedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */