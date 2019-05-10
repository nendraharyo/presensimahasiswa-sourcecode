package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$RequestSummariesLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFk;
  
  public GamesClientImpl$RequestSummariesLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFk = localzzb;
  }
  
  public void zzM(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFk;
    GamesClientImpl.LoadRequestSummariesResultImpl localLoadRequestSummariesResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadRequestSummariesResultImpl;
    localLoadRequestSummariesResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localLoadRequestSummariesResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RequestSummariesLoadedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */