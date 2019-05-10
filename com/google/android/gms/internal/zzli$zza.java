package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient.GameManagerResult;
import com.google.android.gms.common.api.Status;

public abstract class zzli$zza
  extends zzli.zzb
{
  public zzli$zza(zzli paramzzli)
  {
    super(paramzzli);
    zzli.zza.1 local1 = new com/google/android/gms/internal/zzli$zza$1;
    local1.<init>(this, paramzzli);
    this.zzacm = local1;
  }
  
  public GameManagerClient.GameManagerResult zzr(Status paramStatus)
  {
    zzli.zze localzze = new com/google/android/gms/internal/zzli$zze;
    localzze.<init>(paramStatus, null, -1, null);
    return localzze;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */