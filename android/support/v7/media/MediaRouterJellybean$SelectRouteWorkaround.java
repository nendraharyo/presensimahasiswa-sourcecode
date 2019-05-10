package android.support.v7.media;

import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybean$SelectRouteWorkaround
{
  private Method mSelectRouteIntMethod;
  
  public MediaRouterJellybean$SelectRouteWorkaround()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j)
    {
      i = Build.VERSION.SDK_INT;
      j = 17;
      if (i <= j) {}
    }
    else
    {
      localObject = new java/lang/UnsupportedOperationException;
      ((UnsupportedOperationException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    Object localObject = MediaRouter.class;
    String str = "selectRouteInt";
    int k = 2;
    try
    {
      Class[] arrayOfClass = new Class[k];
      int m = 0;
      Class localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      m = 1;
      localClass = MediaRouter.RouteInfo.class;
      arrayOfClass[m] = localClass;
      localObject = ((Class)localObject).getMethod(str, arrayOfClass);
      this.mSelectRouteIntMethod = ((Method)localObject);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public void selectRoute(Object paramObject1, int paramInt, Object paramObject2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.RouteInfo)paramObject2;
    int i = ((MediaRouter.RouteInfo)paramObject2).getSupportedTypes();
    int j = 8388608;
    i &= j;
    Method localMethod;
    if (i == 0)
    {
      localMethod = this.mSelectRouteIntMethod;
      if (localMethod == null) {
        break label148;
      }
    }
    for (;;)
    {
      try
      {
        localMethod = this.mSelectRouteIntMethod;
        j = 2;
        localObject = new Object[j];
        int k = 0;
        str2 = null;
        Integer localInteger = Integer.valueOf(paramInt);
        localObject[0] = localInteger;
        k = 1;
        localObject[k] = paramObject2;
        localMethod.invoke(paramObject1, (Object[])localObject);
        return;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject = "MediaRouterJellybean";
        str2 = "Cannot programmatically select non-user route.  Media routing may not work.";
        Log.w((String)localObject, str2, localIllegalAccessException);
        ((MediaRouter)paramObject1).selectRoute(paramInt, (MediaRouter.RouteInfo)paramObject2);
        continue;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localObject = "MediaRouterJellybean";
        String str2 = "Cannot programmatically select non-user route.  Media routing may not work.";
        Log.w((String)localObject, str2, localInvocationTargetException);
        continue;
      }
      label148:
      String str1 = "MediaRouterJellybean";
      Object localObject = "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.";
      Log.w(str1, (String)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybean$SelectRouteWorkaround.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */