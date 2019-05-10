package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.ActivityLifecycleManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.ScheduledExecutorService;

class SessionAnalyticsManager
  implements BackgroundManager.Listener
{
  static final String EXECUTOR_SERVICE = "Answers Events Handler";
  static final String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
  final BackgroundManager backgroundManager;
  final AnswersEventsHandler eventsHandler;
  private final long installedAt;
  final ActivityLifecycleManager lifecycleManager;
  final AnswersPreferenceManager preferenceManager;
  
  SessionAnalyticsManager(AnswersEventsHandler paramAnswersEventsHandler, ActivityLifecycleManager paramActivityLifecycleManager, BackgroundManager paramBackgroundManager, AnswersPreferenceManager paramAnswersPreferenceManager, long paramLong)
  {
    this.eventsHandler = paramAnswersEventsHandler;
    this.lifecycleManager = paramActivityLifecycleManager;
    this.backgroundManager = paramBackgroundManager;
    this.preferenceManager = paramAnswersPreferenceManager;
    this.installedAt = paramLong;
  }
  
  public static SessionAnalyticsManager build(Kit paramKit, Context paramContext, IdManager paramIdManager, String paramString1, String paramString2, long paramLong)
  {
    Object localObject1 = new com/crashlytics/android/answers/SessionMetadataCollector;
    ((SessionMetadataCollector)localObject1).<init>(paramContext, paramIdManager, paramString1, paramString2);
    Object localObject2 = new com/crashlytics/android/answers/AnswersFilesManagerProvider;
    Object localObject3 = new io/fabric/sdk/android/services/persistence/FileStoreImpl;
    ((FileStoreImpl)localObject3).<init>(paramKit);
    ((AnswersFilesManagerProvider)localObject2).<init>(paramContext, (FileStore)localObject3);
    Object localObject4 = new io/fabric/sdk/android/services/network/DefaultHttpRequestFactory;
    localObject3 = Fabric.getLogger();
    ((DefaultHttpRequestFactory)localObject4).<init>((Logger)localObject3);
    ActivityLifecycleManager localActivityLifecycleManager = new io/fabric/sdk/android/ActivityLifecycleManager;
    localActivityLifecycleManager.<init>(paramContext);
    ScheduledExecutorService localScheduledExecutorService = ExecutorUtils.buildSingleThreadScheduledExecutorService("Answers Events Handler");
    BackgroundManager localBackgroundManager = new com/crashlytics/android/answers/BackgroundManager;
    localBackgroundManager.<init>(localScheduledExecutorService);
    FirebaseAnalyticsApiAdapter localFirebaseAnalyticsApiAdapter = new com/crashlytics/android/answers/FirebaseAnalyticsApiAdapter;
    localFirebaseAnalyticsApiAdapter.<init>(paramContext);
    localObject3 = new com/crashlytics/android/answers/AnswersEventsHandler;
    Object localObject5 = paramKit;
    ((AnswersEventsHandler)localObject3).<init>(paramKit, paramContext, (AnswersFilesManagerProvider)localObject2, (SessionMetadataCollector)localObject1, (HttpRequestFactory)localObject4, localScheduledExecutorService, localFirebaseAnalyticsApiAdapter);
    localObject4 = AnswersPreferenceManager.build(paramContext);
    localObject5 = new com/crashlytics/android/answers/SessionAnalyticsManager;
    localObject2 = localActivityLifecycleManager;
    localObject1 = localBackgroundManager;
    ((SessionAnalyticsManager)localObject5).<init>((AnswersEventsHandler)localObject3, localActivityLifecycleManager, localBackgroundManager, (AnswersPreferenceManager)localObject4, paramLong);
    return (SessionAnalyticsManager)localObject5;
  }
  
  public void disable()
  {
    this.lifecycleManager.resetCallbacks();
    this.eventsHandler.disable();
  }
  
  public void enable()
  {
    this.eventsHandler.enable();
    Object localObject = this.lifecycleManager;
    AnswersLifecycleCallbacks localAnswersLifecycleCallbacks = new com/crashlytics/android/answers/AnswersLifecycleCallbacks;
    BackgroundManager localBackgroundManager = this.backgroundManager;
    localAnswersLifecycleCallbacks.<init>(this, localBackgroundManager);
    ((ActivityLifecycleManager)localObject).registerCallbacks(localAnswersLifecycleCallbacks);
    localObject = this.backgroundManager;
    ((BackgroundManager)localObject).registerListener(this);
    boolean bool = isFirstLaunch();
    if (bool)
    {
      long l = this.installedAt;
      onInstall(l);
      localObject = this.preferenceManager;
      ((AnswersPreferenceManager)localObject).setAnalyticsLaunched();
    }
  }
  
  boolean isFirstLaunch()
  {
    AnswersPreferenceManager localAnswersPreferenceManager = this.preferenceManager;
    boolean bool = localAnswersPreferenceManager.hasAnalyticsLaunched();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAnswersPreferenceManager = null;
    }
  }
  
  public void onBackground()
  {
    Fabric.getLogger().d("Answers", "Flush events when app is backgrounded");
    this.eventsHandler.flushEvents();
  }
  
  public void onCrash(String paramString1, String paramString2)
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = Looper.getMainLooper();
    if (localObject1 == localObject2)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("onCrash called from main thread!!!");
      throw ((Throwable)localObject1);
    }
    Fabric.getLogger().d("Answers", "Logged crash");
    localObject1 = this.eventsHandler;
    localObject2 = SessionEvent.crashEventBuilder(paramString1, paramString2);
    ((AnswersEventsHandler)localObject1).processEventSync((SessionEvent.Builder)localObject2);
  }
  
  public void onCustom(CustomEvent paramCustomEvent)
  {
    Object localObject1 = Fabric.getLogger();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Logged custom event: " + paramCustomEvent;
    ((Logger)localObject1).d("Answers", (String)localObject2);
    localObject1 = this.eventsHandler;
    SessionEvent.Builder localBuilder = SessionEvent.customEventBuilder(paramCustomEvent);
    ((AnswersEventsHandler)localObject1).processEventAsync(localBuilder);
  }
  
  public void onError(String paramString) {}
  
  public void onInstall(long paramLong)
  {
    Fabric.getLogger().d("Answers", "Logged install");
    AnswersEventsHandler localAnswersEventsHandler = this.eventsHandler;
    SessionEvent.Builder localBuilder = SessionEvent.installEventBuilder(paramLong);
    localAnswersEventsHandler.processEventAsyncAndFlush(localBuilder);
  }
  
  public void onLifecycle(Activity paramActivity, SessionEvent.Type paramType)
  {
    Object localObject1 = Fabric.getLogger();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Logged lifecycle event: ");
    String str = paramType.name();
    localObject2 = str;
    ((Logger)localObject1).d("Answers", (String)localObject2);
    localObject1 = this.eventsHandler;
    SessionEvent.Builder localBuilder = SessionEvent.lifecycleEventBuilder(paramType, paramActivity);
    ((AnswersEventsHandler)localObject1).processEventAsync(localBuilder);
  }
  
  public void onPredefined(PredefinedEvent paramPredefinedEvent)
  {
    Object localObject1 = Fabric.getLogger();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Logged predefined event: " + paramPredefinedEvent;
    ((Logger)localObject1).d("Answers", (String)localObject2);
    localObject1 = this.eventsHandler;
    SessionEvent.Builder localBuilder = SessionEvent.predefinedEventBuilder(paramPredefinedEvent);
    ((AnswersEventsHandler)localObject1).processEventAsync(localBuilder);
  }
  
  public void setAnalyticsSettingsData(AnalyticsSettingsData paramAnalyticsSettingsData, String paramString)
  {
    BackgroundManager localBackgroundManager = this.backgroundManager;
    boolean bool = paramAnalyticsSettingsData.flushOnBackground;
    localBackgroundManager.setFlushOnBackground(bool);
    this.eventsHandler.setAnalyticsSettingsData(paramAnalyticsSettingsData, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionAnalyticsManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */