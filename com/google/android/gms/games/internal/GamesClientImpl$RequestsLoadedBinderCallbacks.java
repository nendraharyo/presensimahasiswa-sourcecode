package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$RequestsLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFl;
  
  public GamesClientImpl$RequestsLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFl = localzzb;
  }
  
  public void zzd(int paramInt, Bundle paramBundle)
  {
    Object localObject = getClass().getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject);
    localObject = GamesStatusCodes.zzgc(paramInt);
    zza.zzb localzzb = this.zzaFl;
    GamesClientImpl.LoadRequestsResultImpl localLoadRequestsResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadRequestsResultImpl;
    localLoadRequestsResultImpl.<init>((Status)localObject, paramBundle);
    localzzb.zzs(localLoadRequestsResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RequestsLoadedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */