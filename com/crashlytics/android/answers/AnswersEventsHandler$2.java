package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

class AnswersEventsHandler$2
  implements Runnable
{
  AnswersEventsHandler$2(AnswersEventsHandler paramAnswersEventsHandler) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject1 = ((AnswersEventsHandler)localObject1).strategy;
      localObject2 = this.this$0;
      localObject3 = new com/crashlytics/android/answers/DisabledSessionAnalyticsManagerStrategy;
      ((DisabledSessionAnalyticsManagerStrategy)localObject3).<init>();
      ((AnswersEventsHandler)localObject2).strategy = ((SessionAnalyticsManagerStrategy)localObject3);
      ((SessionAnalyticsManagerStrategy)localObject1).deleteAllEvents();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = Fabric.getLogger();
        Object localObject3 = "Answers";
        String str = "Failed to disable events";
        ((Logger)localObject2).e((String)localObject3, str, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersEventsHandler$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */