package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$AppContentLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaEl;
  
  public GamesClientImpl$AppContentLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaEl = localzzb;
  }
  
  public void zza(DataHolder[] paramArrayOfDataHolder)
  {
    zza.zzb localzzb = this.zzaEl;
    GamesClientImpl.LoadAppContentsResultImpl localLoadAppContentsResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadAppContentsResultImpl;
    localLoadAppContentsResultImpl.<init>(paramArrayOfDataHolder);
    localzzb.zzs(localLoadAppContentsResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$AppContentLoadedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */