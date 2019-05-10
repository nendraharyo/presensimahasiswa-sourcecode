package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

class AnswersEventsHandler$1
  implements Runnable
{
  AnswersEventsHandler$1(AnswersEventsHandler paramAnswersEventsHandler, AnalyticsSettingsData paramAnalyticsSettingsData, String paramString) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject1 = ((AnswersEventsHandler)localObject1).strategy;
      localObject2 = this.val$analyticsSettingsData;
      str1 = this.val$protocolAndHostOverride;
      ((SessionAnalyticsManagerStrategy)localObject1).setAnalyticsSettingsData((AnalyticsSettingsData)localObject2, str1);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = Fabric.getLogger();
        String str1 = "Answers";
        String str2 = "Failed to set analytics settings data";
        ((Logger)localObject2).e(str1, str2, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersEventsHandler$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */