package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;

final class GamesClientImpl$StartRecordingBinderCallback
  extends AbstractGamesCallbacks
{
  private final Games.BaseGamesApiMethodImpl zzaFt;
  
  GamesClientImpl$StartRecordingBinderCallback(Games.BaseGamesApiMethodImpl paramBaseGamesApiMethodImpl)
  {
    Games.BaseGamesApiMethodImpl localBaseGamesApiMethodImpl = (Games.BaseGamesApiMethodImpl)zzx.zzb(paramBaseGamesApiMethodImpl, "Holder must not be null");
    this.zzaFt = localBaseGamesApiMethodImpl;
  }
  
  public void zzgq(int paramInt)
  {
    Games.BaseGamesApiMethodImpl localBaseGamesApiMethodImpl = this.zzaFt;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt);
    localBaseGamesApiMethodImpl.zza(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$StartRecordingBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */