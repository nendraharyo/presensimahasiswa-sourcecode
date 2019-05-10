package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

public class TimeBasedFileRollOverRunnable
  implements Runnable
{
  private final Context context;
  private final FileRollOverManager fileRollOverManager;
  
  public TimeBasedFileRollOverRunnable(Context paramContext, FileRollOverManager paramFileRollOverManager)
  {
    this.context = paramContext;
    this.fileRollOverManager = paramFileRollOverManager;
  }
  
  public void run()
  {
    try
    {
      Object localObject1 = this.context;
      localObject2 = "Performing time based file roll over.";
      CommonUtils.logControlled((Context)localObject1, (String)localObject2);
      localObject1 = this.fileRollOverManager;
      boolean bool = ((FileRollOverManager)localObject1).rollFileOver();
      if (!bool)
      {
        localObject1 = this.fileRollOverManager;
        ((FileRollOverManager)localObject1).cancelTimeBasedFileRollOver();
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = this.context;
        String str = "Failed to roll over file";
        CommonUtils.logControlledError((Context)localObject2, str, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\TimeBasedFileRollOverRunnable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */