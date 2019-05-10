package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

class AnswersEventsHandler$6
  implements Runnable
{
  AnswersEventsHandler$6(AnswersEventsHandler paramAnswersEventsHandler, SessionEvent.Builder paramBuilder, boolean paramBoolean) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject1 = ((AnswersEventsHandler)localObject1).strategy;
      localObject2 = this.val$eventBuilder;
      ((SessionAnalyticsManagerStrategy)localObject1).processEvent((SessionEvent.Builder)localObject2);
      boolean bool = this.val$flush;
      if (bool)
      {
        localObject1 = this.this$0;
        localObject1 = ((AnswersEventsHandler)localObject1).strategy;
        ((SessionAnalyticsManagerStrategy)localObject1).rollFileOver();
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = Fabric.getLogger();
        String str1 = "Answers";
        String str2 = "Failed to process event";
        ((Logger)localObject2).e(str1, str2, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersEventsHandler$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */