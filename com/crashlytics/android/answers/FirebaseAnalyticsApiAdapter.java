package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Bundle;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

class FirebaseAnalyticsApiAdapter
{
  private final Context context;
  private EventLogger eventLogger;
  private final FirebaseAnalyticsEventMapper eventMapper;
  
  public FirebaseAnalyticsApiAdapter(Context paramContext)
  {
    this(paramContext, localFirebaseAnalyticsEventMapper);
  }
  
  public FirebaseAnalyticsApiAdapter(Context paramContext, FirebaseAnalyticsEventMapper paramFirebaseAnalyticsEventMapper)
  {
    this.context = paramContext;
    this.eventMapper = paramFirebaseAnalyticsEventMapper;
  }
  
  public EventLogger getFirebaseAnalytics()
  {
    EventLogger localEventLogger = this.eventLogger;
    if (localEventLogger == null)
    {
      localEventLogger = AppMeasurementEventLogger.getEventLogger(this.context);
      this.eventLogger = localEventLogger;
    }
    return this.eventLogger;
  }
  
  public void processEvent(SessionEvent paramSessionEvent)
  {
    Object localObject1 = getFirebaseAnalytics();
    Object localObject2;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "Answers";
      localObject3 = "Firebase analytics logging was enabled, but not available...";
      ((Logger)localObject1).d((String)localObject2, (String)localObject3);
    }
    for (;;)
    {
      return;
      localObject2 = this.eventMapper.mapEvent(paramSessionEvent);
      Object localObject4;
      if (localObject2 == null)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "Answers";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "Fabric event was not mappable to Firebase event: ";
        localObject3 = (String)localObject4 + paramSessionEvent;
        ((Logger)localObject1).d((String)localObject2, (String)localObject3);
      }
      else
      {
        localObject3 = ((FirebaseAnalyticsEvent)localObject2).getEventName();
        localObject4 = ((FirebaseAnalyticsEvent)localObject2).getEventParams();
        ((EventLogger)localObject1).logEvent((String)localObject3, (Bundle)localObject4);
        localObject3 = "levelEnd";
        localObject4 = paramSessionEvent.predefinedType;
        boolean bool = ((String)localObject3).equals(localObject4);
        if (bool)
        {
          localObject3 = "post_score";
          localObject2 = ((FirebaseAnalyticsEvent)localObject2).getEventParams();
          ((EventLogger)localObject1).logEvent((String)localObject3, (Bundle)localObject2);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\FirebaseAnalyticsApiAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */