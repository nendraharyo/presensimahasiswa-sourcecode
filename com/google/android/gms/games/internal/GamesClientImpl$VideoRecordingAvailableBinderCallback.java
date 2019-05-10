package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$VideoRecordingAvailableBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$VideoRecordingAvailableBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zzd(int paramInt, boolean paramBoolean)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.VideoAvailableResultImpl localVideoAvailableResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$VideoAvailableResultImpl;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt);
    localVideoAvailableResultImpl.<init>(localStatus, paramBoolean);
    localzzb.zzs(localVideoAvailableResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$VideoRecordingAvailableBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */