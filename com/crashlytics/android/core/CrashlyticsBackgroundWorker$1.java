package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

class CrashlyticsBackgroundWorker$1
  implements Runnable
{
  CrashlyticsBackgroundWorker$1(CrashlyticsBackgroundWorker paramCrashlyticsBackgroundWorker, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      Runnable localRunnable = this.val$runnable;
      localRunnable.run();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        String str2 = "Failed to execute task.";
        localLogger.e(str1, str2, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsBackgroundWorker$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */