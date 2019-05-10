package android.support.v7.media;

import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybean$GetDefaultRouteWorkaround
{
  private Method mGetSystemAudioRouteMethod;
  
  public MediaRouterJellybean$GetDefaultRouteWorkaround()
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
    String str = "getSystemAudioRoute";
    Class[] arrayOfClass = null;
    try
    {
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getMethod(str, arrayOfClass);
      this.mGetSystemAudioRouteMethod = ((Method)localObject);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public Object getDefaultRoute(Object paramObject)
  {
    paramObject = (MediaRouter)paramObject;
    Object localObject = this.mGetSystemAudioRouteMethod;
    if (localObject != null) {}
    try
    {
      localObject = this.mGetSystemAudioRouteMethod;
      Object[] arrayOfObject = null;
      arrayOfObject = new Object[0];
      localObject = ((Method)localObject).invoke(paramObject, arrayOfObject);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        MediaRouter.RouteInfo localRouteInfo = ((MediaRouter)paramObject).getRouteAt(0);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    return localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybean$GetDefaultRouteWorkaround.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */