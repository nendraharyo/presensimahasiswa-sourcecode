package com.crashlytics.android.core;

import java.util.concurrent.Callable;

class CrashlyticsController$8
  implements Callable
{
  CrashlyticsController$8(CrashlyticsController paramCrashlyticsController, long paramLong, String paramString) {}
  
  public Void call()
  {
    Object localObject = this.this$0;
    boolean bool = ((CrashlyticsController)localObject).isHandlingException();
    if (!bool)
    {
      localObject = CrashlyticsController.access$1000(this.this$0);
      long l = this.val$timestamp;
      String str = this.val$msg;
      ((LogFileManager)localObject).writeToLog(l, str);
    }
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */