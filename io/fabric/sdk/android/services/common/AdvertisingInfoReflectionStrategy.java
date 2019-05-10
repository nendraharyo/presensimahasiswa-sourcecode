package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.lang.reflect.Method;

class AdvertisingInfoReflectionStrategy
  implements AdvertisingInfoStrategy
{
  private static final String CLASS_NAME_ADVERTISING_ID_CLIENT = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
  private static final String CLASS_NAME_ADVERTISING_ID_CLIENT_INFO = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
  private static final String CLASS_NAME_GOOGLE_PLAY_SERVICES_UTILS = "com.google.android.gms.common.GooglePlayServicesUtil";
  private static final int GOOGLE_PLAY_SERVICES_SUCCESS_CODE = 0;
  private static final String METHOD_NAME_GET_ADVERTISING_ID_INFO = "getAdvertisingIdInfo";
  private static final String METHOD_NAME_GET_ID = "getId";
  private static final String METHOD_NAME_IS_GOOGLE_PLAY_SERVICES_AVAILABLE = "isGooglePlayServicesAvailable";
  private static final String METHOD_NAME_IS_LIMITED_AD_TRACKING_ENABLED = "isLimitAdTrackingEnabled";
  private final Context context;
  
  public AdvertisingInfoReflectionStrategy(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.context = localContext;
  }
  
  private String getAdvertisingId()
  {
    Object localObject1 = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      localObject2 = "getId";
      localObject3 = null;
      localObject3 = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject2 = getInfo();
      localObject3 = null;
      localObject3 = new Object[0];
      localObject1 = ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
      localObject1 = (String)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        Object localObject2 = "Fabric";
        Object localObject3 = "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
        localLogger.w((String)localObject2, (String)localObject3);
        localLogger = null;
      }
    }
    return (String)localObject1;
  }
  
  private Object getInfo()
  {
    Object localObject1 = null;
    Object localObject2 = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    try
    {
      localObject2 = Class.forName((String)localObject2);
      str = "getAdvertisingIdInfo";
      int i = 1;
      localObject3 = new Class[i];
      Object localObject4 = Context.class;
      localObject3[0] = localObject4;
      localObject2 = ((Class)localObject2).getMethod(str, (Class[])localObject3);
      str = null;
      i = 1;
      localObject3 = new Object[i];
      localObject4 = this.context;
      localObject3[0] = localObject4;
      localObject1 = ((Method)localObject2).invoke(null, (Object[])localObject3);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str = "Fabric";
        Object localObject3 = "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient";
        localLogger.w(str, (String)localObject3);
      }
    }
    return localObject1;
  }
  
  private boolean isLimitAdTrackingEnabled()
  {
    Object localObject1 = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
    try
    {
      localObject1 = Class.forName((String)localObject1);
      localObject2 = "isLimitAdTrackingEnabled";
      localObject3 = null;
      localObject3 = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject2 = getInfo();
      localObject3 = null;
      localObject3 = new Object[0];
      localObject1 = ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
      localObject1 = (Boolean)localObject1;
      bool = ((Boolean)localObject1).booleanValue();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        Object localObject2 = "Fabric";
        Object localObject3 = "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";
        localLogger.w((String)localObject2, (String)localObject3);
        boolean bool = false;
        localLogger = null;
      }
    }
    return bool;
  }
  
  public AdvertisingInfo getAdvertisingInfo()
  {
    Object localObject = this.context;
    boolean bool1 = isGooglePlayServiceAvailable((Context)localObject);
    if (bool1)
    {
      localObject = new io/fabric/sdk/android/services/common/AdvertisingInfo;
      String str = getAdvertisingId();
      boolean bool2 = isLimitAdTrackingEnabled();
      ((AdvertisingInfo)localObject).<init>(str, bool2);
    }
    for (;;)
    {
      return (AdvertisingInfo)localObject;
      bool1 = false;
      localObject = null;
    }
  }
  
  boolean isGooglePlayServiceAvailable(Context paramContext)
  {
    int i = 1;
    for (Object localObject1 = "com.google.android.gms.common.GooglePlayServicesUtil";; localObject1 = null)
    {
      try
      {
        localObject1 = Class.forName((String)localObject1);
        String str = "isGooglePlayServicesAvailable";
        int j = 1;
        Object localObject3 = new Class[j];
        Class localClass = Context.class;
        localObject3[0] = localClass;
        localObject1 = ((Class)localObject1).getMethod(str, (Class[])localObject3);
        str = null;
        j = 1;
        localObject3 = new Object[j];
        localObject3[0] = paramContext;
        localObject1 = ((Method)localObject1).invoke(null, (Object[])localObject3);
        localObject1 = (Integer)localObject1;
        k = ((Integer)localObject1).intValue();
        if (k != 0) {
          break label91;
        }
        k = i;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int k;
          label91:
          int m = 0;
          Object localObject2 = null;
        }
      }
      return k;
      m = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\AdvertisingInfoReflectionStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */