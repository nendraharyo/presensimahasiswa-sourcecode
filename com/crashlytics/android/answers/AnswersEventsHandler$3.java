package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

class AnswersEventsHandler$3
  implements Runnable
{
  AnswersEventsHandler$3(AnswersEventsHandler paramAnswersEventsHandler) {}
  
  public void run()
  {
    try
    {
      Object localObject = this.this$0;
      localObject = ((AnswersEventsHandler)localObject).strategy;
      ((SessionAnalyticsManagerStrategy)localObject).sendEvents();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "Answers";
        String str2 = "Failed to send events files";
        localLogger.e(str1, str2, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersEventsHandler$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */