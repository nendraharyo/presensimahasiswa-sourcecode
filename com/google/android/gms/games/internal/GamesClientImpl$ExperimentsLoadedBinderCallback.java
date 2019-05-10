package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$ExperimentsLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$ExperimentsLoadedBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zza(int paramInt, long[] paramArrayOfLong)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.LoadExperimentsResultImpl localLoadExperimentsResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadExperimentsResultImpl;
    localLoadExperimentsResultImpl.<init>(paramInt, paramArrayOfLong);
    localzzb.zzs(localLoadExperimentsResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$ExperimentsLoadedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */