package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.events.TimeBasedFileRollOverRunnable;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class EnabledSessionAnalyticsManagerStrategy
  implements SessionAnalyticsManagerStrategy
{
  static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = 255;
  ApiKey apiKey;
  private final Context context;
  boolean customEventsEnabled;
  EventFilter eventFilter;
  private final ScheduledExecutorService executorService;
  private final SessionAnalyticsFilesManager filesManager;
  FilesSender filesSender;
  private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
  boolean forwardToFirebaseAnalyticsEnabled;
  private final HttpRequestFactory httpRequestFactory;
  boolean includePurchaseEventsInForwardedEvents;
  private final Kit kit;
  final SessionEventMetadata metadata;
  boolean predefinedEventsEnabled;
  private final AtomicReference rolloverFutureRef;
  volatile int rolloverIntervalSeconds;
  
  public EnabledSessionAnalyticsManagerStrategy(Kit paramKit, Context paramContext, ScheduledExecutorService paramScheduledExecutorService, SessionAnalyticsFilesManager paramSessionAnalyticsFilesManager, HttpRequestFactory paramHttpRequestFactory, SessionEventMetadata paramSessionEventMetadata, FirebaseAnalyticsApiAdapter paramFirebaseAnalyticsApiAdapter)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    this.rolloverFutureRef = ((AtomicReference)localObject);
    localObject = new io/fabric/sdk/android/services/common/ApiKey;
    ((ApiKey)localObject).<init>();
    this.apiKey = ((ApiKey)localObject);
    localObject = new com/crashlytics/android/answers/KeepAllEventFilter;
    ((KeepAllEventFilter)localObject).<init>();
    this.eventFilter = ((EventFilter)localObject);
    this.customEventsEnabled = bool;
    this.predefinedEventsEnabled = bool;
    this.rolloverIntervalSeconds = -1;
    this.forwardToFirebaseAnalyticsEnabled = false;
    this.includePurchaseEventsInForwardedEvents = false;
    this.kit = paramKit;
    this.context = paramContext;
    this.executorService = paramScheduledExecutorService;
    this.filesManager = paramSessionAnalyticsFilesManager;
    this.httpRequestFactory = paramHttpRequestFactory;
    this.metadata = paramSessionEventMetadata;
    this.firebaseAnalyticsApiAdapter = paramFirebaseAnalyticsApiAdapter;
  }
  
  public void cancelTimeBasedFileRollOver()
  {
    Object localObject = this.rolloverFutureRef.get();
    if (localObject != null)
    {
      CommonUtils.logControlled(this.context, "Cancelling time-based rollover because no events are currently being generated.");
      ((ScheduledFuture)this.rolloverFutureRef.get()).cancel(false);
      localObject = this.rolloverFutureRef;
      ((AtomicReference)localObject).set(null);
    }
  }
  
  public void deleteAllEvents()
  {
    this.filesManager.deleteAllEventsFiles();
  }
  
  public void processEvent(SessionEvent.Builder paramBuilder)
  {
    Object localObject1 = this.metadata;
    localObject3 = paramBuilder.build((SessionEventMetadata)localObject1);
    bool1 = this.customEventsEnabled;
    if (!bool1)
    {
      localObject1 = SessionEvent.Type.CUSTOM;
      localObject4 = ((SessionEvent)localObject3).type;
      bool1 = ((SessionEvent.Type)localObject1).equals(localObject4);
      if (bool1)
      {
        localObject1 = Fabric.getLogger();
        localObject4 = "Answers";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject6 = "Custom events tracking disabled - skipping event: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject3 = localObject3;
        ((Logger)localObject1).d((String)localObject4, (String)localObject3);
      }
    }
    for (;;)
    {
      return;
      bool1 = this.predefinedEventsEnabled;
      if (!bool1)
      {
        localObject1 = SessionEvent.Type.PREDEFINED;
        localObject4 = ((SessionEvent)localObject3).type;
        bool1 = ((SessionEvent.Type)localObject1).equals(localObject4);
        if (bool1)
        {
          localObject1 = Fabric.getLogger();
          localObject4 = "Answers";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject6 = "Predefined events tracking disabled - skipping event: ";
          localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
          localObject3 = localObject3;
          ((Logger)localObject1).d((String)localObject4, (String)localObject3);
          continue;
        }
      }
      localObject1 = this.eventFilter;
      bool1 = ((EventFilter)localObject1).skipEvent((SessionEvent)localObject3);
      if (bool1)
      {
        localObject1 = Fabric.getLogger();
        localObject4 = "Answers";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject6 = "Skipping filtered event: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject3 = localObject3;
        ((Logger)localObject1).d((String)localObject4, (String)localObject3);
      }
      try
      {
        localObject1 = this.filesManager;
        ((SessionAnalyticsFilesManager)localObject1).writeEvent(localObject3);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          boolean bool2;
          boolean bool3;
          localObject4 = Fabric.getLogger();
          localObject5 = "Answers";
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          String str = "Failed to write event: ";
          localObject6 = str + localObject3;
          ((Logger)localObject4).e((String)localObject5, (String)localObject6, localIOException);
          continue;
          bool1 = false;
          Object localObject2 = null;
        }
      }
      scheduleTimeBasedRollOverIfNeeded();
      localObject1 = SessionEvent.Type.CUSTOM;
      localObject4 = ((SessionEvent)localObject3).type;
      bool1 = ((SessionEvent.Type)localObject1).equals(localObject4);
      if (!bool1)
      {
        localObject1 = SessionEvent.Type.PREDEFINED;
        localObject4 = ((SessionEvent)localObject3).type;
        bool1 = ((SessionEvent.Type)localObject1).equals(localObject4);
        if (!bool1) {
          break;
        }
      }
      bool1 = true;
      localObject4 = "purchase";
      localObject5 = ((SessionEvent)localObject3).predefinedType;
      bool2 = ((String)localObject4).equals(localObject5);
      bool3 = this.forwardToFirebaseAnalyticsEnabled;
      if ((bool3) && (bool1)) {
        if (bool2)
        {
          bool1 = this.includePurchaseEventsInForwardedEvents;
          if (!bool1) {}
        }
        else
        {
          try
          {
            localObject1 = this.firebaseAnalyticsApiAdapter;
            ((FirebaseAnalyticsApiAdapter)localObject1).processEvent((SessionEvent)localObject3);
          }
          catch (Exception localException)
          {
            localObject4 = Fabric.getLogger();
            localObject5 = "Answers";
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            str = "Failed to map event to Firebase: ";
            localObject6 = ((StringBuilder)localObject6).append(str);
            localObject3 = localObject3;
            ((Logger)localObject4).e((String)localObject5, (String)localObject3, localException);
          }
        }
      }
    }
  }
  
  public boolean rollFileOver()
  {
    try
    {
      SessionAnalyticsFilesManager localSessionAnalyticsFilesManager = this.filesManager;
      bool = localSessionAnalyticsFilesManager.rollFileOver();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Context localContext = this.context;
        String str = "Failed to roll file over.";
        CommonUtils.logControlledError(localContext, str, localIOException);
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
  
  void scheduleTimeBasedFileRollOver(long paramLong1, long paramLong2)
  {
    Object localObject1 = this.rolloverFutureRef.get();
    int i;
    if (localObject1 == null) {
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject2 = new io/fabric/sdk/android/services/events/TimeBasedFileRollOverRunnable;
        localObject1 = this.context;
        ((TimeBasedFileRollOverRunnable)localObject2).<init>((Context)localObject1, this);
        localObject1 = this.context;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Scheduling time based file roll over every ").append(paramLong2);
        String str = " seconds";
        localObject3 = str;
        CommonUtils.logControlled((Context)localObject1, (String)localObject3);
      }
      try
      {
        AtomicReference localAtomicReference = this.rolloverFutureRef;
        localObject1 = this.executorService;
        TimeUnit localTimeUnit = TimeUnit.SECONDS;
        localObject1 = ((ScheduledExecutorService)localObject1).scheduleAtFixedRate((Runnable)localObject2, paramLong1, paramLong2, localTimeUnit);
        localAtomicReference.set(localObject1);
        return;
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        for (;;)
        {
          localObject2 = this.context;
          localObject3 = "Failed to schedule time based file roll over";
          CommonUtils.logControlledError((Context)localObject2, (String)localObject3, localRejectedExecutionException);
        }
      }
      i = 0;
      localObject1 = null;
    }
  }
  
  public void scheduleTimeBasedRollOverIfNeeded()
  {
    int i = this.rolloverIntervalSeconds;
    int j = -1;
    if (i != j) {}
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        i = this.rolloverIntervalSeconds;
        long l1 = i;
        int k = this.rolloverIntervalSeconds;
        long l2 = k;
        scheduleTimeBasedFileRollOver(l1, l2);
      }
      return;
    }
  }
  
  public void sendEvents()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.filesSender;
    if (localObject2 == null)
    {
      localObject2 = this.context;
      localObject1 = "skipping files send because we don't yet know the target endpoint";
      CommonUtils.logControlled((Context)localObject2, (String)localObject1);
      return;
    }
    CommonUtils.logControlled(this.context, "Sending all files");
    Object localObject3 = this.filesManager.getBatchOfFilesToSend();
    int j = 0;
    localObject2 = null;
    for (;;)
    {
      try
      {
        i = ((List)localObject3).size();
        if (i > 0)
        {
          localObject1 = this.context;
          localObject4 = Locale.US;
          str = "attempt to send batch of %d files";
          int k = 1;
          Object[] arrayOfObject = new Object[k];
          int m = ((List)localObject3).size();
          Integer localInteger = Integer.valueOf(m);
          arrayOfObject[0] = localInteger;
          localObject4 = String.format((Locale)localObject4, str, arrayOfObject);
          CommonUtils.logControlled((Context)localObject1, (String)localObject4);
          localObject1 = this.filesSender;
          bool = ((FilesSender)localObject1).send((List)localObject3);
          if (bool) {
            i = ((List)localObject3).size() + j;
          }
        }
      }
      catch (Exception localException1)
      {
        try
        {
          boolean bool;
          localObject2 = this.filesManager;
          ((SessionAnalyticsFilesManager)localObject2).deleteSentFiles((List)localObject3);
          j = i;
          if (!bool)
          {
            if (j != 0) {
              break;
            }
            localObject2 = this.filesManager;
            ((SessionAnalyticsFilesManager)localObject2).deleteOldestInRollOverIfOverMax();
            break;
          }
          localObject1 = this.filesManager;
          localObject1 = ((SessionAnalyticsFilesManager)localObject1).getBatchOfFilesToSend();
          localObject3 = localObject1;
        }
        catch (Exception localException2)
        {
          Object localObject4;
          String str;
          for (;;) {}
        }
        localException1 = localException1;
        i = j;
        localObject2 = localException1;
      }
      localObject3 = this.context;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("Failed to send batch of analytics files to server: ");
      str = ((Exception)localObject2).getMessage();
      localObject4 = str;
      CommonUtils.logControlledError((Context)localObject3, (String)localObject4, (Throwable)localObject2);
      j = i;
    }
  }
  
  public void setAnalyticsSettingsData(AnalyticsSettingsData paramAnalyticsSettingsData, String paramString)
  {
    Object localObject1 = new com/crashlytics/android/answers/SessionAnalyticsFilesSender;
    Object localObject2 = this.kit;
    Object localObject3 = paramAnalyticsSettingsData.analyticsURL;
    HttpRequestFactory localHttpRequestFactory = this.httpRequestFactory;
    Object localObject4 = this.apiKey;
    Object localObject5 = this.context;
    localObject5 = ((ApiKey)localObject4).getValue((Context)localObject5);
    localObject4 = paramString;
    ((SessionAnalyticsFilesSender)localObject1).<init>((Kit)localObject2, paramString, (String)localObject3, localHttpRequestFactory, (String)localObject5);
    localObject1 = AnswersRetryFilesSender.build((SessionAnalyticsFilesSender)localObject1);
    this.filesSender = ((FilesSender)localObject1);
    this.filesManager.setAnalyticsSettingsData(paramAnalyticsSettingsData);
    boolean bool = paramAnalyticsSettingsData.forwardToFirebaseAnalytics;
    this.forwardToFirebaseAnalyticsEnabled = bool;
    bool = paramAnalyticsSettingsData.includePurchaseEventsInForwardedEvents;
    this.includePurchaseEventsInForwardedEvents = bool;
    localObject2 = Fabric.getLogger();
    localObject4 = "Answers";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject3 = ((StringBuilder)localObject1).append("Firebase analytics forwarding ");
    bool = this.forwardToFirebaseAnalyticsEnabled;
    if (bool)
    {
      localObject1 = "enabled";
      localObject1 = (String)localObject1;
      ((Logger)localObject2).d((String)localObject4, (String)localObject1);
      localObject2 = Fabric.getLogger();
      localObject4 = "Answers";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = ((StringBuilder)localObject1).append("Firebase analytics including purchase events ");
      bool = this.includePurchaseEventsInForwardedEvents;
      if (!bool) {
        break label463;
      }
      localObject1 = "enabled";
      label203:
      localObject1 = (String)localObject1;
      ((Logger)localObject2).d((String)localObject4, (String)localObject1);
      bool = paramAnalyticsSettingsData.trackCustomEvents;
      this.customEventsEnabled = bool;
      localObject2 = Fabric.getLogger();
      localObject4 = "Answers";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = ((StringBuilder)localObject1).append("Custom event tracking ");
      bool = this.customEventsEnabled;
      if (!bool) {
        break label470;
      }
      localObject1 = "enabled";
      label276:
      localObject1 = (String)localObject1;
      ((Logger)localObject2).d((String)localObject4, (String)localObject1);
      bool = paramAnalyticsSettingsData.trackPredefinedEvents;
      this.predefinedEventsEnabled = bool;
      localObject2 = Fabric.getLogger();
      localObject4 = "Answers";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = ((StringBuilder)localObject1).append("Predefined event tracking ");
      bool = this.predefinedEventsEnabled;
      if (!bool) {
        break label477;
      }
    }
    label463:
    label470:
    label477:
    for (localObject1 = "enabled";; localObject1 = "disabled")
    {
      localObject1 = (String)localObject1;
      ((Logger)localObject2).d((String)localObject4, (String)localObject1);
      int i = paramAnalyticsSettingsData.samplingRate;
      int j = 1;
      if (i > j)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "Answers";
        localObject4 = "Event sampling enabled";
        ((Logger)localObject1).d((String)localObject2, (String)localObject4);
        localObject1 = new com/crashlytics/android/answers/SamplingEventFilter;
        j = paramAnalyticsSettingsData.samplingRate;
        ((SamplingEventFilter)localObject1).<init>(j);
        this.eventFilter = ((EventFilter)localObject1);
      }
      i = paramAnalyticsSettingsData.flushIntervalSeconds;
      this.rolloverIntervalSeconds = i;
      long l = this.rolloverIntervalSeconds;
      scheduleTimeBasedFileRollOver(0L, l);
      return;
      localObject1 = "disabled";
      break;
      localObject1 = "disabled";
      break label203;
      localObject1 = "disabled";
      break label276;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\EnabledSessionAnalyticsManagerStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */