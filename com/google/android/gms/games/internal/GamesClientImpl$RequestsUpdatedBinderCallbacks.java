package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$RequestsUpdatedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFm;
  
  public GamesClientImpl$RequestsUpdatedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFm = localzzb;
  }
  
  public void zzK(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFm;
    GamesClientImpl.UpdateRequestsResultImpl localUpdateRequestsResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$UpdateRequestsResultImpl;
    localUpdateRequestsResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localUpdateRequestsResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RequestsUpdatedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */