package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$RequestSentBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFj;
  
  public GamesClientImpl$RequestSentBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFj = localzzb;
  }
  
  public void zzL(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFj;
    GamesClientImpl.SendRequestResultImpl localSendRequestResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$SendRequestResultImpl;
    localSendRequestResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localSendRequestResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RequestSentBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */