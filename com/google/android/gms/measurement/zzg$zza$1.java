package com.google.android.gms.measurement;

import android.util.Log;
import java.util.concurrent.FutureTask;

class zzg$zza$1
  extends FutureTask
{
  zzg$zza$1(zzg.zza paramzza, Runnable paramRunnable, Object paramObject)
  {
    super(paramRunnable, paramObject);
  }
  
  protected void setException(Throwable paramThrowable)
  {
    Object localObject1 = zzg.zzb(this.zzaUC.zzaUB);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = Thread.currentThread();
      ((Thread.UncaughtExceptionHandler)localObject1).uncaughtException((Thread)localObject2, paramThrowable);
    }
    for (;;)
    {
      super.setException(paramThrowable);
      return;
      localObject1 = "GAv4";
      int i = 6;
      boolean bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = "GAv4";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "MeasurementExecutor: job failed with ";
        localObject2 = str + paramThrowable;
        Log.e((String)localObject1, (String)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzg$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */