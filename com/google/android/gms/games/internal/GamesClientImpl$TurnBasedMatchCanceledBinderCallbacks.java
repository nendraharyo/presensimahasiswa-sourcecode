package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFv;
  
  public GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFv = localzzb;
  }
  
  public void zzi(int paramInt, String paramString)
  {
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    zza.zzb localzzb = this.zzaFv;
    GamesClientImpl.CancelMatchResultImpl localCancelMatchResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$CancelMatchResultImpl;
    localCancelMatchResultImpl.<init>(localStatus, paramString);
    localzzb.zzs(localCancelMatchResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */