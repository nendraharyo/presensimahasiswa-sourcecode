package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final class zzjf$1
  implements Runnable
{
  zzjf$1(zzjd paramzzjd, zzjf.zza paramzza, zzjg paramzzjg) {}
  
  public void run()
  {
    try
    {
      zzjd localzzjd1 = this.zzNf;
      Object localObject1 = this.zzNg;
      Object localObject2 = this.zzNh;
      localObject2 = ((zzjg)localObject2).get();
      localObject1 = ((zzjf.zza)localObject1).zzf(localObject2);
      localzzjd1.zzg(localObject1);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        zzjd localzzjd2 = this.zzNf;
        boolean bool = true;
        localzzjd2.cancel(bool);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjf$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */