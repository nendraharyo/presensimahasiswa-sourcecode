package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$GetServerAuthCodeBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  public GamesClientImpl$GetServerAuthCodeBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zzg(int paramInt, String paramString)
  {
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.GetServerAuthCodeResultImpl localGetServerAuthCodeResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$GetServerAuthCodeResultImpl;
    localGetServerAuthCodeResultImpl.<init>(localStatus, paramString);
    localzzb.zzs(localGetServerAuthCodeResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$GetServerAuthCodeBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */