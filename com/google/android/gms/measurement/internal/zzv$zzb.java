package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;

final class zzv$zzb
  implements Thread.UncaughtExceptionHandler
{
  private final String zzaXR;
  
  public zzv$zzb(zzv paramzzv, String paramString)
  {
    zzx.zzz(paramString);
    this.zzaXR = paramString;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    try
    {
      Object localObject1 = this.zzaXS;
      localObject1 = ((zzv)localObject1).zzAo();
      localObject1 = ((zzp)localObject1).zzCE();
      String str = this.zzaXR;
      ((zzp.zza)localObject1).zzj(str, paramThrowable);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzv$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */