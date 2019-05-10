package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public class zze
  implements zzn
{
  private final Executor zzs;
  
  public zze(Handler paramHandler)
  {
    zze.1 local1 = new com/google/android/gms/internal/zze$1;
    local1.<init>(this, paramHandler);
    this.zzs = local1;
  }
  
  public void zza(zzk paramzzk, zzm paramzzm)
  {
    zza(paramzzk, paramzzm, null);
  }
  
  public void zza(zzk paramzzk, zzm paramzzm, Runnable paramRunnable)
  {
    paramzzk.zzv();
    paramzzk.zzc("post-response");
    Executor localExecutor = this.zzs;
    zze.zza localzza = new com/google/android/gms/internal/zze$zza;
    localzza.<init>(this, paramzzk, paramzzm, paramRunnable);
    localExecutor.execute(localzza);
  }
  
  public void zza(zzk paramzzk, zzr paramzzr)
  {
    paramzzk.zzc("post-error");
    zzm localzzm = zzm.zzd(paramzzr);
    Executor localExecutor = this.zzs;
    zze.zza localzza = new com/google/android/gms/internal/zze$zza;
    localzza.<init>(this, paramzzk, localzzm, null);
    localExecutor.execute(localzza);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */