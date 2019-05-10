package android.support.v7.media;

import android.media.MediaRouter;
import android.media.MediaRouter.Callback;

final class MediaRouterJellybeanMr2
{
  public static void addCallback(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.Callback)paramObject2;
    ((MediaRouter)paramObject1).addCallback(paramInt1, (MediaRouter.Callback)paramObject2, paramInt2);
  }
  
  public static Object getDefaultRoute(Object paramObject)
  {
    return ((MediaRouter)paramObject).getDefaultRoute();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybeanMr2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */