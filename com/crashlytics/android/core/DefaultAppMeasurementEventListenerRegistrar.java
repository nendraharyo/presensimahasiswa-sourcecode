package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class DefaultAppMeasurementEventListenerRegistrar
  implements AppMeasurementEventListenerRegistrar
{
  private static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
  private static final String ANALYTIC_CLASS_ON_EVENT_LISTENER = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";
  private static final String CRASH_ORIGIN = "crash";
  private static final String GET_INSTANCE_METHOD = "getInstance";
  private static final String NAME = "name";
  private static final String PARAMETERS = "parameters";
  private static final String REGISTER_METHOD = "registerOnMeasurementEventListener";
  private final CrashlyticsCore crashlyticsCore;
  
  private DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore paramCrashlyticsCore)
  {
    this.crashlyticsCore = paramCrashlyticsCore;
  }
  
  private Class getClass(String paramString)
  {
    try
    {
      localObject1 = this.crashlyticsCore;
      localObject1 = ((CrashlyticsCore)localObject1).getContext();
      localObject1 = ((Context)localObject1).getClassLoader();
      localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
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
  
  private Object getInstance(Class paramClass)
  {
    Object localObject1 = "getInstance";
    int i = 1;
    try
    {
      localObject3 = new Class[i];
      str = null;
      localObject4 = Context.class;
      localObject3[0] = localObject4;
      localObject1 = paramClass.getDeclaredMethod((String)localObject1, (Class[])localObject3);
      i = 1;
      localObject3 = new Object[i];
      str = null;
      localObject4 = this.crashlyticsCore;
      localObject4 = ((CrashlyticsCore)localObject4).getContext();
      localObject3[0] = localObject4;
      localObject1 = ((Method)localObject1).invoke(paramClass, (Object[])localObject3);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3 = Fabric.getLogger();
        String str = "CrashlyticsCore";
        Object localObject4 = "Could not get instance of com.google.android.gms.measurement.AppMeasurement";
        ((Logger)localObject3).d(str, (String)localObject4, localException);
        Object localObject2 = null;
      }
    }
    return localObject1;
  }
  
  static AppMeasurementEventListenerRegistrar instanceFrom(CrashlyticsCore paramCrashlyticsCore)
  {
    DefaultAppMeasurementEventListenerRegistrar localDefaultAppMeasurementEventListenerRegistrar = new com/crashlytics/android/core/DefaultAppMeasurementEventListenerRegistrar;
    localDefaultAppMeasurementEventListenerRegistrar.<init>(paramCrashlyticsCore);
    return localDefaultAppMeasurementEventListenerRegistrar;
  }
  
  private boolean invoke(Class paramClass, Object paramObject, String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = getClass("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
    Object localObject2;
    if (localObject1 == null)
    {
      Logger localLogger = Fabric.getLogger();
      localObject1 = "CrashlyticsCore";
      localObject2 = "Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener";
      localLogger.d((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return bool2;
      int i = 1;
      try
      {
        localObject2 = new Class[i];
        int j = 0;
        localObject3 = null;
        localObject2[0] = localObject1;
        localObject2 = paramClass.getDeclaredMethod(paramString, (Class[])localObject2);
        j = 1;
        localObject3 = new Object[j];
        str = null;
        localObject1 = onEventListenerProxy((Class)localObject1);
        localObject3[0] = localObject1;
        ((Method)localObject2).invoke(paramObject, (Object[])localObject3);
        bool2 = bool1;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "CrashlyticsCore";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str = "Expected method missing: ";
        localObject3 = str + paramString;
        ((Logger)localObject1).w((String)localObject2, (String)localObject3, localNoSuchMethodException);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "CrashlyticsCore";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str = "Cannot invoke method: ";
        localObject3 = str + paramString;
        ((Logger)localObject1).w((String)localObject2, (String)localObject3, localInvocationTargetException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "CrashlyticsCore";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Cannot access method: ";
        localObject3 = str + paramString;
        ((Logger)localObject1).w((String)localObject2, (String)localObject3, localIllegalAccessException);
      }
    }
  }
  
  private Object onEventListenerProxy(Class paramClass)
  {
    ClassLoader localClassLoader = this.crashlyticsCore.getContext().getClassLoader();
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = paramClass;
    DefaultAppMeasurementEventListenerRegistrar.1 local1 = new com/crashlytics/android/core/DefaultAppMeasurementEventListenerRegistrar$1;
    local1.<init>(this);
    return Proxy.newProxyInstance(localClassLoader, arrayOfClass, local1);
  }
  
  private static String serializeEvent(String paramString, Bundle paramBundle)
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    JSONObject localJSONObject2 = new org/json/JSONObject;
    localJSONObject2.<init>();
    Object localObject1 = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = paramBundle.get((String)localObject1);
      localJSONObject2.put((String)localObject1, localObject2);
    }
    localJSONObject1.put("name", paramString);
    localJSONObject1.put("parameters", localJSONObject2);
    return localJSONObject1.toString();
  }
  
  private static void writeEventToUserLog(CrashlyticsCore paramCrashlyticsCore, String paramString, Bundle paramBundle)
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str1 = "$A$:";
      localObject1 = ((StringBuilder)localObject1).append(str1);
      str1 = serializeEvent(paramString, paramBundle);
      localObject1 = ((StringBuilder)localObject1).append(str1);
      localObject1 = ((StringBuilder)localObject1).toString();
      paramCrashlyticsCore.log((String)localObject1);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "Unable to serialize Firebase Analytics event; ";
        localObject2 = str2 + paramString;
        localLogger.w(str1, (String)localObject2);
      }
    }
  }
  
  public boolean register()
  {
    boolean bool = false;
    String str1 = null;
    Object localObject1 = getClass("com.google.android.gms.measurement.AppMeasurement");
    Object localObject2;
    String str2;
    if (localObject1 == null)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = "CrashlyticsCore";
      str2 = "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.";
      ((Logger)localObject1).w((String)localObject2, str2);
    }
    for (;;)
    {
      return bool;
      localObject2 = getInstance((Class)localObject1);
      if (localObject2 == null)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "CrashlyticsCore";
        str2 = "Could not create an instance of Firebase Analytics.";
        ((Logger)localObject1).w((String)localObject2, str2);
      }
      else
      {
        str1 = "registerOnMeasurementEventListener";
        bool = invoke((Class)localObject1, localObject2, str1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\DefaultAppMeasurementEventListenerRegistrar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */