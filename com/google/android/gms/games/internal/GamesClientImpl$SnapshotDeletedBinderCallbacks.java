package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$SnapshotDeletedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  public GamesClientImpl$SnapshotDeletedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zzj(int paramInt, String paramString)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.DeleteSnapshotResultImpl localDeleteSnapshotResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$DeleteSnapshotResultImpl;
    localDeleteSnapshotResultImpl.<init>(paramInt, paramString);
    localzzb.zzs(localDeleteSnapshotResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$SnapshotDeletedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */