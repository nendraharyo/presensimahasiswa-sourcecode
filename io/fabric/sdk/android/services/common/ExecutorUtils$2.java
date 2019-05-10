package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

final class ExecutorUtils$2
  extends BackgroundPriorityRunnable
{
  ExecutorUtils$2(String paramString, ExecutorService paramExecutorService, long paramLong, TimeUnit paramTimeUnit) {}
  
  public void onRun()
  {
    try
    {
      Object localObject1 = Fabric.getLogger();
      localObject3 = "Fabric";
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      str1 = "Executing shutdown hook for ";
      localObject4 = ((StringBuilder)localObject4).append(str1);
      str1 = this.val$serviceName;
      localObject4 = ((StringBuilder)localObject4).append(str1);
      localObject4 = ((StringBuilder)localObject4).toString();
      ((Logger)localObject1).d((String)localObject3, (String)localObject4);
      localObject1 = this.val$service;
      ((ExecutorService)localObject1).shutdown();
      localObject1 = this.val$service;
      long l = this.val$terminationTimeout;
      localObject3 = this.val$timeUnit;
      boolean bool = ((ExecutorService)localObject1).awaitTermination(l, (TimeUnit)localObject3);
      if (!bool)
      {
        localObject1 = Fabric.getLogger();
        localObject3 = "Fabric";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        str1 = this.val$serviceName;
        localObject4 = ((StringBuilder)localObject4).append(str1);
        str1 = " did not shut down in the allocated time. Requesting immediate shutdown.";
        localObject4 = ((StringBuilder)localObject4).append(str1);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((Logger)localObject1).d((String)localObject3, (String)localObject4);
        localObject1 = this.val$service;
        ((ExecutorService)localObject1).shutdownNow();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject2 = Fabric.getLogger();
        Object localObject3 = "Fabric";
        Object localObject4 = Locale.US;
        String str1 = "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.";
        int i = 1;
        Object[] arrayOfObject = new Object[i];
        String str2 = this.val$serviceName;
        arrayOfObject[0] = str2;
        localObject4 = String.format((Locale)localObject4, str1, arrayOfObject);
        ((Logger)localObject2).d((String)localObject3, (String)localObject4);
        localObject2 = this.val$service;
        ((ExecutorService)localObject2).shutdownNow();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\ExecutorUtils$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */