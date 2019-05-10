package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

final class zzjf$2
  implements Runnable
{
  zzjf$2(AtomicInteger paramAtomicInteger, int paramInt, zzjd paramzzjd, List paramList) {}
  
  public void run()
  {
    Object localObject1 = this.zzNi;
    int i = ((AtomicInteger)localObject1).incrementAndGet();
    int j = this.zzNj;
    if (i >= j) {}
    try
    {
      localObject1 = this.zzNk;
      localObject2 = this.zzNl;
      localObject2 = zzjf.zzn((List)localObject2);
      ((zzjd)localObject1).zzg(localObject2);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject2 = "Unable to convert list of futures to a future of list";
        zzin.zzd((String)localObject2, localInterruptedException);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjf$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */