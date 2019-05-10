package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;

class CrashlyticsBackgroundWorker$2
  implements Callable
{
  CrashlyticsBackgroundWorker$2(CrashlyticsBackgroundWorker paramCrashlyticsBackgroundWorker, Callable paramCallable) {}
  
  public Object call()
  {
    try
    {
      localObject1 = this.val$callable;
      localObject1 = ((Callable)localObject1).call();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Logger localLogger = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        String str2 = "Failed to execute task.";
        localLogger.e(str1, str2, localException);
        Object localObject2 = null;
      }
    }
    return localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsBackgroundWorker$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */