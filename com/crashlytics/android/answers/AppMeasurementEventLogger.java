package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

public class AppMeasurementEventLogger
  implements EventLogger
{
  private static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
  private static final String GET_INSTANCE_METHOD = "getInstance";
  private static final String LOG_METHOD = "logEventInternal";
  private final Object logEventInstance;
  private final Method logEventMethod;
  
  public AppMeasurementEventLogger(Object paramObject, Method paramMethod)
  {
    this.logEventInstance = paramObject;
    this.logEventMethod = paramMethod;
  }
  
  private static Class getClass(Context paramContext)
  {
    try
    {
      localObject1 = paramContext.getClassLoader();
      String str = "com.google.android.gms.measurement.AppMeasurement";
      localObject1 = ((ClassLoader)localObject1).loadClass(str);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (Class)localObject1;
  }
  
  public static EventLogger getEventLogger(Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = getClass(paramContext);
    if (localObject2 == null) {}
    for (;;)
    {
      return (EventLogger)localObject1;
      Object localObject3 = getInstance(paramContext, (Class)localObject2);
      if (localObject3 != null)
      {
        localObject2 = getLogEventMethod(paramContext, (Class)localObject2);
        if (localObject2 != null)
        {
          localObject1 = new com/crashlytics/android/answers/AppMeasurementEventLogger;
          ((AppMeasurementEventLogger)localObject1).<init>(localObject3, (Method)localObject2);
        }
      }
    }
  }
  
  private static Object getInstance(Context paramContext, Class paramClass)
  {
    Object localObject1 = "getInstance";
    int i = 1;
    try
    {
      Object localObject3 = new Class[i];
      Class localClass = Context.class;
      localObject3[0] = localClass;
      localObject1 = paramClass.getDeclaredMethod((String)localObject1, (Class[])localObject3);
      i = 1;
      localObject3 = new Object[i];
      localObject3[0] = paramContext;
      localObject1 = ((Method)localObject1).invoke(paramClass, (Object[])localObject3);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return localObject1;
  }
  
  private static Method getLogEventMethod(Context paramContext, Class paramClass)
  {
    Object localObject1 = "logEventInternal";
    int i = 3;
    try
    {
      Class[] arrayOfClass = new Class[i];
      int j = 0;
      Class localClass = String.class;
      arrayOfClass[0] = localClass;
      j = 1;
      localClass = String.class;
      arrayOfClass[j] = localClass;
      j = 2;
      localClass = Bundle.class;
      arrayOfClass[j] = localClass;
      localObject1 = paramClass.getDeclaredMethod((String)localObject1, arrayOfClass);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (Method)localObject1;
  }
  
  public void logEvent(String paramString, Bundle paramBundle)
  {
    logEvent("fab", paramString, paramBundle);
  }
  
  public void logEvent(String paramString1, String paramString2, Bundle paramBundle)
  {
    try
    {
      Method localMethod = this.logEventMethod;
      Object localObject = this.logEventInstance;
      int i = 3;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      arrayOfObject[0] = paramString1;
      j = 1;
      arrayOfObject[j] = paramString2;
      j = 2;
      arrayOfObject[j] = paramBundle;
      localMethod.invoke(localObject, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AppMeasurementEventLogger.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */