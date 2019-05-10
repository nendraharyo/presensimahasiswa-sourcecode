package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.events.EventsStorageListener;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.concurrent.ScheduledExecutorService;

class AnswersEventsHandler$4
  implements Runnable
{
  AnswersEventsHandler$4(AnswersEventsHandler paramAnswersEventsHandler) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.this$0;
      localObject1 = AnswersEventsHandler.access$000((AnswersEventsHandler)localObject1);
      SessionEventMetadata localSessionEventMetadata = ((SessionMetadataCollector)localObject1).getMetadata();
      localObject1 = this.this$0;
      localObject1 = AnswersEventsHandler.access$100((AnswersEventsHandler)localObject1);
      SessionAnalyticsFilesManager localSessionAnalyticsFilesManager = ((AnswersFilesManagerProvider)localObject1).getAnalyticsFilesManager();
      localObject1 = this.this$0;
      localSessionAnalyticsFilesManager.registerRollOverListener((EventsStorageListener)localObject1);
      AnswersEventsHandler localAnswersEventsHandler = this.this$0;
      localObject1 = new com/crashlytics/android/answers/EnabledSessionAnalyticsManagerStrategy;
      localObject2 = this.this$0;
      localObject2 = AnswersEventsHandler.access$200((AnswersEventsHandler)localObject2);
      localObject3 = this.this$0;
      localObject3 = AnswersEventsHandler.access$300((AnswersEventsHandler)localObject3);
      localObject4 = this.this$0;
      localObject4 = ((AnswersEventsHandler)localObject4).executor;
      Object localObject5 = this.this$0;
      localObject5 = AnswersEventsHandler.access$400((AnswersEventsHandler)localObject5);
      Object localObject6 = this.this$0;
      localObject6 = AnswersEventsHandler.access$500((AnswersEventsHandler)localObject6);
      ((EnabledSessionAnalyticsManagerStrategy)localObject1).<init>((Kit)localObject2, (Context)localObject3, (ScheduledExecutorService)localObject4, localSessionAnalyticsFilesManager, (HttpRequestFactory)localObject5, localSessionEventMetadata, (FirebaseAnalyticsApiAdapter)localObject6);
      localAnswersEventsHandler.strategy = ((SessionAnalyticsManagerStrategy)localObject1);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = Fabric.getLogger();
        Object localObject3 = "Answers";
        Object localObject4 = "Failed to enable events";
        ((Logger)localObject2).e((String)localObject3, (String)localObject4, localException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersEventsHandler$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */