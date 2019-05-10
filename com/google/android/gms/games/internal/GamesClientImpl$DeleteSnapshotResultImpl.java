package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;

final class GamesClientImpl$DeleteSnapshotResultImpl
  implements Snapshots.DeleteSnapshotResult
{
  private final Status zzUX;
  private final String zzaEp;
  
  GamesClientImpl$DeleteSnapshotResultImpl(int paramInt, String paramString)
  {
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    this.zzUX = localStatus;
    this.zzaEp = paramString;
  }
  
  public String getSnapshotId()
  {
    return this.zzaEp;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$DeleteSnapshotResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */