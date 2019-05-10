package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.events.EventsStorageListener;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

class AnswersEventsHandler
  implements EventsStorageListener
{
  private final Context context;
  final ScheduledExecutorService executor;
  private final AnswersFilesManagerProvider filesManagerProvider;
  private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
  private final Kit kit;
  private final SessionMetadataCollector metadataCollector;
  private final HttpRequestFactory requestFactory;
  SessionAnalyticsManagerStrategy strategy;
  
  public AnswersEventsHandler(Kit paramKit, Context paramContext, AnswersFilesManagerProvider paramAnswersFilesManagerProvider, SessionMetadataCollector paramSessionMetadataCollector, HttpRequestFactory paramHttpRequestFactory, ScheduledExecutorService paramScheduledExecutorService, FirebaseAnalyticsApiAdapter paramFirebaseAnalyticsApiAdapter)
  {
    DisabledSessionAnalyticsManagerStrategy localDisabledSessionAnalyticsManagerStrategy = new com/crashlytics/android/answers/DisabledSessionAnalyticsManagerStrategy;
    localDisabledSessionAnalyticsManagerStrategy.<init>();
    this.strategy = localDisabledSessionAnalyticsManagerStrategy;
    this.kit = paramKit;
    this.context = paramContext;
    this.filesManagerProvider = paramAnswersFilesManagerProvider;
    this.metadataCollector = paramSessionMetadataCollector;
    this.requestFactory = paramHttpRequestFactory;
    this.executor = paramScheduledExecutorService;
    this.firebaseAnalyticsApiAdapter = paramFirebaseAnalyticsApiAdapter;
  }
  
  private void executeAsync(Runnable paramRunnable)
  {
    try
    {
      ScheduledExecutorService localScheduledExecutorService = this.executor;
      localScheduledExecutorService.submit(paramRunnable);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "Answers";
        String str2 = "Failed to submit events task";
        localLogger.e(str1, str2, localException);
      }
    }
  }
  
  private void executeSync(Runnable paramRunnable)
  {
    try
    {
      Object localObject = this.executor;
      localObject = ((ScheduledExecutorService)localObject).submit(paramRunnable);
      ((Future)localObject).get();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "Answers";
        String str2 = "Failed to run events task";
        localLogger.e(str1, str2, localException);
      }
    }
  }
  
  public void disable()
  {
    AnswersEventsHandler.2 local2 = new com/crashlytics/android/answers/AnswersEventsHandler$2;
    local2.<init>(this);
    executeAsync(local2);
  }
  
  public void enable()
  {
    AnswersEventsHandler.4 local4 = new com/crashlytics/android/answers/AnswersEventsHandler$4;
    local4.<init>(this);
    executeAsync(local4);
  }
  
  public void flushEvents()
  {
    AnswersEventsHandler.5 local5 = new com/crashlytics/android/answers/AnswersEventsHandler$5;
    local5.<init>(this);
    executeAsync(local5);
  }
  
  public void onRollOver(String paramString)
  {
    AnswersEventsHandler.3 local3 = new com/crashlytics/android/answers/AnswersEventsHandler$3;
    local3.<init>(this);
    executeAsync(local3);
  }
  
  void processEvent(SessionEvent.Builder paramBuilder, boolean paramBoolean1, boolean paramBoolean2)
  {
    AnswersEventsHandler.6 local6 = new com/crashlytics/android/answers/AnswersEventsHandler$6;
    local6.<init>(this, paramBuilder, paramBoolean2);
    if (paramBoolean1) {
      executeSync(local6);
    }
    for (;;)
    {
      return;
      executeAsync(local6);
    }
  }
  
  public void processEventAsync(SessionEvent.Builder paramBuilder)
  {
    processEvent(paramBuilder, false, false);
  }
  
  public void processEventAsyncAndFlush(SessionEvent.Builder paramBuilder)
  {
    processEvent(paramBuilder, false, true);
  }
  
  public void processEventSync(SessionEvent.Builder paramBuilder)
  {
    processEvent(paramBuilder, true, false);
  }
  
  public void setAnalyticsSettingsData(AnalyticsSettingsData paramAnalyticsSettingsData, String paramString)
  {
    AnswersEventsHandler.1 local1 = new com/crashlytics/android/answers/AnswersEventsHandler$1;
    local1.<init>(this, paramAnalyticsSettingsData, paramString);
    executeAsync(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersEventsHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */