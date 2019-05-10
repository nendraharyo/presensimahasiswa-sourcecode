package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$SnapshotCommittedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFq;
  
  public GamesClientImpl$SnapshotCommittedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFq = localzzb;
  }
  
  public void zzO(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFq;
    GamesClientImpl.CommitSnapshotResultImpl localCommitSnapshotResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$CommitSnapshotResultImpl;
    localCommitSnapshotResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localCommitSnapshotResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$SnapshotCommittedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */