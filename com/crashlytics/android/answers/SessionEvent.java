package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

final class SessionEvent
{
  static final String ACTIVITY_KEY = "activity";
  static final String EXCEPTION_NAME_KEY = "exceptionName";
  static final String INSTALLED_AT_KEY = "installedAt";
  static final String SESSION_ID_KEY = "sessionId";
  public final Map customAttributes;
  public final String customType;
  public final Map details;
  public final Map predefinedAttributes;
  public final String predefinedType;
  public final SessionEventMetadata sessionEventMetadata;
  private String stringRepresentation;
  public final long timestamp;
  public final SessionEvent.Type type;
  
  private SessionEvent(SessionEventMetadata paramSessionEventMetadata, long paramLong, SessionEvent.Type paramType, Map paramMap1, String paramString1, Map paramMap2, String paramString2, Map paramMap3)
  {
    this.sessionEventMetadata = paramSessionEventMetadata;
    this.timestamp = paramLong;
    this.type = paramType;
    this.details = paramMap1;
    this.customType = paramString1;
    this.customAttributes = paramMap2;
    this.predefinedType = paramString2;
    this.predefinedAttributes = paramMap3;
  }
  
  public static SessionEvent.Builder crashEventBuilder(String paramString)
  {
    Map localMap = Collections.singletonMap("sessionId", paramString);
    SessionEvent.Builder localBuilder = new com/crashlytics/android/answers/SessionEvent$Builder;
    SessionEvent.Type localType = SessionEvent.Type.CRASH;
    localBuilder.<init>(localType);
    return localBuilder.details(localMap);
  }
  
  public static SessionEvent.Builder crashEventBuilder(String paramString1, String paramString2)
  {
    SessionEvent.Builder localBuilder = crashEventBuilder(paramString1);
    Map localMap = Collections.singletonMap("exceptionName", paramString2);
    return localBuilder.customAttributes(localMap);
  }
  
  public static SessionEvent.Builder customEventBuilder(CustomEvent paramCustomEvent)
  {
    SessionEvent.Builder localBuilder = new com/crashlytics/android/answers/SessionEvent$Builder;
    Object localObject = SessionEvent.Type.CUSTOM;
    localBuilder.<init>((SessionEvent.Type)localObject);
    localObject = paramCustomEvent.getCustomType();
    localBuilder = localBuilder.customType((String)localObject);
    localObject = paramCustomEvent.getCustomAttributes();
    return localBuilder.customAttributes((Map)localObject);
  }
  
  public static SessionEvent.Builder installEventBuilder(long paramLong)
  {
    SessionEvent.Builder localBuilder = new com/crashlytics/android/answers/SessionEvent$Builder;
    Object localObject = SessionEvent.Type.INSTALL;
    localBuilder.<init>((SessionEvent.Type)localObject);
    String str = String.valueOf(paramLong);
    localObject = Collections.singletonMap("installedAt", str);
    return localBuilder.details((Map)localObject);
  }
  
  public static SessionEvent.Builder lifecycleEventBuilder(SessionEvent.Type paramType, Activity paramActivity)
  {
    Object localObject = paramActivity.getClass().getName();
    Map localMap = Collections.singletonMap("activity", localObject);
    localObject = new com/crashlytics/android/answers/SessionEvent$Builder;
    ((SessionEvent.Builder)localObject).<init>(paramType);
    return ((SessionEvent.Builder)localObject).details(localMap);
  }
  
  public static SessionEvent.Builder predefinedEventBuilder(PredefinedEvent paramPredefinedEvent)
  {
    SessionEvent.Builder localBuilder = new com/crashlytics/android/answers/SessionEvent$Builder;
    Object localObject = SessionEvent.Type.PREDEFINED;
    localBuilder.<init>((SessionEvent.Type)localObject);
    localObject = paramPredefinedEvent.getPredefinedType();
    localBuilder = localBuilder.predefinedType((String)localObject);
    localObject = paramPredefinedEvent.getPredefinedAttributes();
    localBuilder = localBuilder.predefinedAttributes((Map)localObject);
    localObject = paramPredefinedEvent.getCustomAttributes();
    return localBuilder.customAttributes((Map)localObject);
  }
  
  public String toString()
  {
    Object localObject1 = this.stringRepresentation;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("[");
      Object localObject2 = getClass().getSimpleName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(": ").append("timestamp=");
      long l = this.timestamp;
      localObject1 = ((StringBuilder)localObject1).append(l).append(", type=");
      localObject2 = this.type;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(", details=");
      localObject2 = this.details;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(", customType=");
      localObject2 = this.customType;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", customAttributes=");
      localObject2 = this.customAttributes;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(", predefinedType=");
      localObject2 = this.predefinedType;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", predefinedAttributes=");
      localObject2 = this.predefinedAttributes;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(", metadata=[");
      localObject2 = this.sessionEventMetadata;
      localObject1 = ((StringBuilder)localObject1).append(localObject2);
      localObject2 = "]]";
      localObject1 = (String)localObject2;
      this.stringRepresentation = ((String)localObject1);
    }
    return this.stringRepresentation;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */