package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult;
import com.google.android.gms.common.api.Status;

public abstract class zzli$zzc
  extends zzli.zzb
{
  private GameManagerClient zzacV;
  
  public zzli$zzc(zzli paramzzli, GameManagerClient paramGameManagerClient)
  {
    super(paramzzli);
    this.zzacV = paramGameManagerClient;
    zzli.zzc.1 local1 = new com/google/android/gms/internal/zzli$zzc$1;
    local1.<init>(this, paramzzli);
    this.zzacm = local1;
  }
  
  public GameManagerClient.GameManagerInstanceResult zzs(Status paramStatus)
  {
    zzli.zzd localzzd = new com/google/android/gms/internal/zzli$zzd;
    localzzd.<init>(paramStatus, null);
    return localzzd;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */