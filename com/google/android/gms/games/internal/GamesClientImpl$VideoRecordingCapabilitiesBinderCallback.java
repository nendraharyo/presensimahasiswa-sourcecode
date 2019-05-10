package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.video.VideoCapabilities;

final class GamesClientImpl$VideoRecordingCapabilitiesBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$VideoRecordingCapabilitiesBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zza(int paramInt, VideoCapabilities paramVideoCapabilities)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.VideoCapabilitiesResultImpl localVideoCapabilitiesResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$VideoCapabilitiesResultImpl;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt);
    localVideoCapabilitiesResultImpl.<init>(localStatus, paramVideoCapabilities);
    localzzb.zzs(localVideoCapabilitiesResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$VideoRecordingCapabilitiesBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */