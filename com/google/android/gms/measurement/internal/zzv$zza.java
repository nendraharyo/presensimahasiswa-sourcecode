package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzv$zza
  extends FutureTask
{
  private final String zzaXR;
  
  zzv$zza(zzv paramzzv, Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, null);
    zzx.zzz(paramString);
    this.zzaXR = paramString;
  }
  
  zzv$zza(zzv paramzzv, Callable paramCallable, String paramString)
  {
    super(paramCallable);
    zzx.zzz(paramString);
    this.zzaXR = paramString;
  }
  
  protected void setException(Throwable paramThrowable)
  {
    zzp.zza localzza = this.zzaXS.zzAo().zzCE();
    String str = this.zzaXR;
    localzza.zzj(str, paramThrowable);
    super.setException(paramThrowable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzv$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */