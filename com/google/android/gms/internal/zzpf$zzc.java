package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzpf$zzc
  extends zzow.zza
{
  private final zzpf.zza zzaAq;
  private final zza.zzb zzamC;
  
  private zzpf$zzc(zza.zzb paramzzb, zzpf.zza paramzza)
  {
    this.zzamC = paramzzb;
    this.zzaAq = paramzza;
  }
  
  public void zzp(Status paramStatus)
  {
    zzpf.zza localzza = this.zzaAq;
    if (localzza != null)
    {
      boolean bool = paramStatus.isSuccess();
      if (bool)
      {
        localzza = this.zzaAq;
        localzza.zzuI();
      }
    }
    this.zzamC.zzs(paramStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpf$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */