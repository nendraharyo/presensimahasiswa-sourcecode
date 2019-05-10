package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;

final class GamesClientImpl$SnapshotOpenedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFr;
  
  public GamesClientImpl$SnapshotOpenedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFr = localzzb;
  }
  
  public void zza(DataHolder paramDataHolder, Contents paramContents)
  {
    zza.zzb localzzb = this.zzaFr;
    GamesClientImpl.OpenSnapshotResultImpl localOpenSnapshotResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$OpenSnapshotResultImpl;
    localOpenSnapshotResultImpl.<init>(paramDataHolder, paramContents);
    localzzb.zzs(localOpenSnapshotResultImpl);
  }
  
  public void zza(DataHolder paramDataHolder, String paramString, Contents paramContents1, Contents paramContents2, Contents paramContents3)
  {
    zza.zzb localzzb = this.zzaFr;
    GamesClientImpl.OpenSnapshotResultImpl localOpenSnapshotResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$OpenSnapshotResultImpl;
    localOpenSnapshotResultImpl.<init>(paramDataHolder, paramString, paramContents1, paramContents2, paramContents3);
    localzzb.zzs(localOpenSnapshotResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$SnapshotOpenedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */