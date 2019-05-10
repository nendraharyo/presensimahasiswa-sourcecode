package com.crashlytics.android.core;

import java.util.Date;

class CrashlyticsController$9
  implements Runnable
{
  CrashlyticsController$9(CrashlyticsController paramCrashlyticsController, Date paramDate, Thread paramThread, Throwable paramThrowable) {}
  
  public void run()
  {
    CrashlyticsController localCrashlyticsController = this.this$0;
    boolean bool = localCrashlyticsController.isHandlingException();
    if (!bool)
    {
      localCrashlyticsController = this.this$0;
      Date localDate = this.val$now;
      Thread localThread = this.val$thread;
      Throwable localThrowable = this.val$ex;
      CrashlyticsController.access$1100(localCrashlyticsController, localDate, localThread, localThrowable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */