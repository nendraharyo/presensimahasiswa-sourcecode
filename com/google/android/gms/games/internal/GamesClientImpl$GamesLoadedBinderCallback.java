package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$GamesLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$GamesLoadedBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zzn(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.LoadGamesResultImpl localLoadGamesResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadGamesResultImpl;
    localLoadGamesResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localLoadGamesResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$GamesLoadedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */