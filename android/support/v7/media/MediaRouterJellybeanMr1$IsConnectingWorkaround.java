package android.support.v7.media;

import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybeanMr1$IsConnectingWorkaround
{
  private Method mGetStatusCodeMethod;
  private int mStatusConnecting;
  
  public MediaRouterJellybeanMr1$IsConnectingWorkaround()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i != j)
    {
      localObject = new java/lang/UnsupportedOperationException;
      ((UnsupportedOperationException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    Object localObject = MediaRouter.RouteInfo.class;
    String str = "STATUS_CONNECTING";
    try
    {
      localObject = ((Class)localObject).getField(str);
      j = 0;
      str = null;
      i = ((Field)localObject).getInt(null);
      this.mStatusConnecting = i;
      localObject = MediaRouter.RouteInfo.class;
      str = "getStatusCode";
      Class[] arrayOfClass = null;
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getMethod(str, arrayOfClass);
      this.mGetStatusCodeMethod = ((Method)localObject);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  public boolean isConnecting(Object paramObject)
  {
    paramObject = (MediaRouter.RouteInfo)paramObject;
    Object localObject1 = this.mGetStatusCodeMethod;
    if (localObject1 != null) {
      for (;;)
      {
        try
        {
          localObject1 = this.mGetStatusCodeMethod;
          int i = 0;
          Object[] arrayOfObject = null;
          arrayOfObject = new Object[0];
          localObject1 = ((Method)localObject1).invoke(paramObject, arrayOfObject);
          localObject1 = (Integer)localObject1;
          j = ((Integer)localObject1).intValue();
          i = this.mStatusConnecting;
          if (j != i) {
            continue;
          }
          j = 1;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          int j;
          int k = 0;
          Object localObject2 = null;
          continue;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          continue;
        }
        return j;
        k = 0;
        localObject1 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybeanMr1$IsConnectingWorkaround.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */