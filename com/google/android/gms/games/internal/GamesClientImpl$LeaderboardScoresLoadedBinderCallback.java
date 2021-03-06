package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$LeaderboardScoresLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$LeaderboardScoresLoadedBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zza(DataHolder paramDataHolder1, DataHolder paramDataHolder2)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.LoadScoresResultImpl localLoadScoresResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadScoresResultImpl;
    localLoadScoresResultImpl.<init>(paramDataHolder1, paramDataHolder2);
    localzzb.zzs(localLoadScoresResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LeaderboardScoresLoadedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */