package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFA;
  
  public GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFA = localzzb;
  }
  
  public void zzc(int paramInt, Bundle paramBundle)
  {
    Object localObject = getClass().getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject);
    localObject = GamesStatusCodes.zzgc(paramInt);
    zza.zzb localzzb = this.zzaFA;
    GamesClientImpl.LoadMatchesResultImpl localLoadMatchesResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadMatchesResultImpl;
    localLoadMatchesResultImpl.<init>((Status)localObject, paramBundle);
    localzzb.zzs(localLoadMatchesResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */