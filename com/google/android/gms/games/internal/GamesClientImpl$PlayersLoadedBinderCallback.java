package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$PlayersLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$PlayersLoadedBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zzl(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.LoadPlayersResultImpl localLoadPlayersResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadPlayersResultImpl;
    localLoadPlayersResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localLoadPlayersResultImpl);
  }
  
  public void zzm(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.LoadPlayersResultImpl localLoadPlayersResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadPlayersResultImpl;
    localLoadPlayersResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localLoadPlayersResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$PlayersLoadedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */