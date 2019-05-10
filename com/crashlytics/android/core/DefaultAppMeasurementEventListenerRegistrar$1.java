package com.crashlytics.android.core;

import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class DefaultAppMeasurementEventListenerRegistrar$1
  implements InvocationHandler
{
  DefaultAppMeasurementEventListenerRegistrar$1(DefaultAppMeasurementEventListenerRegistrar paramDefaultAppMeasurementEventListenerRegistrar) {}
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    int i = paramArrayOfObject.length;
    int j = 4;
    if (i != j)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("Unexpected AppMeasurement.OnEventListener signature");
      throw ((Throwable)localObject);
    }
    i = 0;
    Object localObject = (String)paramArrayOfObject[0];
    j = 1;
    String str1 = (String)paramArrayOfObject[j];
    int k = 2;
    Bundle localBundle = (Bundle)paramArrayOfObject[k];
    if (localObject != null)
    {
      String str2 = "crash";
      boolean bool = ((String)localObject).equals(str2);
      if (!bool)
      {
        localObject = DefaultAppMeasurementEventListenerRegistrar.access$000(this.this$0);
        DefaultAppMeasurementEventListenerRegistrar.access$100((CrashlyticsCore)localObject, str1, localBundle);
      }
    }
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\DefaultAppMeasurementEventListenerRegistrar$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */