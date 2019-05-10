package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$GameMuteStatusChangedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$GameMuteStatusChangedBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zza(int paramInt, String paramString, boolean paramBoolean)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.GameMuteStatusChangeResultImpl localGameMuteStatusChangeResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;
    localGameMuteStatusChangeResultImpl.<init>(paramInt, paramString, paramBoolean);
    localzzb.zzs(localGameMuteStatusChangeResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$GameMuteStatusChangedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */