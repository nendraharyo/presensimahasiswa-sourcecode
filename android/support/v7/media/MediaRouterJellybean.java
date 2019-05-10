package android.support.v7.media;

import android.content.Context;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteCategory;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import java.util.ArrayList;
import java.util.List;

final class MediaRouterJellybean
{
  public static final int ALL_ROUTE_TYPES = 8388611;
  public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
  public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
  public static final int ROUTE_TYPE_USER = 8388608;
  private static final String TAG = "MediaRouterJellybean";
  
  public static void addCallback(Object paramObject1, int paramInt, Object paramObject2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.Callback)paramObject2;
    ((MediaRouter)paramObject1).addCallback(paramInt, (MediaRouter.Callback)paramObject2);
  }
  
  public static void addUserRoute(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.UserRouteInfo)paramObject2;
    ((MediaRouter)paramObject1).addUserRoute((MediaRouter.UserRouteInfo)paramObject2);
  }
  
  public static Object createCallback(MediaRouterJellybean.Callback paramCallback)
  {
    MediaRouterJellybean.CallbackProxy localCallbackProxy = new android/support/v7/media/MediaRouterJellybean$CallbackProxy;
    localCallbackProxy.<init>(paramCallback);
    return localCallbackProxy;
  }
  
  public static Object createRouteCategory(Object paramObject, String paramString, boolean paramBoolean)
  {
    return ((MediaRouter)paramObject).createRouteCategory(paramString, paramBoolean);
  }
  
  public static Object createUserRoute(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.RouteCategory)paramObject2;
    return ((MediaRouter)paramObject1).createUserRoute((MediaRouter.RouteCategory)paramObject2);
  }
  
  public static Object createVolumeCallback(MediaRouterJellybean.VolumeCallback paramVolumeCallback)
  {
    MediaRouterJellybean.VolumeCallbackProxy localVolumeCallbackProxy = new android/support/v7/media/MediaRouterJellybean$VolumeCallbackProxy;
    localVolumeCallbackProxy.<init>(paramVolumeCallback);
    return localVolumeCallbackProxy;
  }
  
  public static List getCategories(Object paramObject)
  {
    paramObject = (MediaRouter)paramObject;
    int i = ((MediaRouter)paramObject).getCategoryCount();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(i);
    int j = 0;
    while (j < i)
    {
      MediaRouter.RouteCategory localRouteCategory = ((MediaRouter)paramObject).getCategoryAt(j);
      localArrayList.add(localRouteCategory);
      j += 1;
    }
    return localArrayList;
  }
  
  public static Object getMediaRouter(Context paramContext)
  {
    return paramContext.getSystemService("media_router");
  }
  
  public static List getRoutes(Object paramObject)
  {
    paramObject = (MediaRouter)paramObject;
    int i = ((MediaRouter)paramObject).getRouteCount();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(i);
    int j = 0;
    while (j < i)
    {
      MediaRouter.RouteInfo localRouteInfo = ((MediaRouter)paramObject).getRouteAt(j);
      localArrayList.add(localRouteInfo);
      j += 1;
    }
    return localArrayList;
  }
  
  public static Object getSelectedRoute(Object paramObject, int paramInt)
  {
    return ((MediaRouter)paramObject).getSelectedRoute(paramInt);
  }
  
  public static void removeCallback(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.Callback)paramObject2;
    ((MediaRouter)paramObject1).removeCallback((MediaRouter.Callback)paramObject2);
  }
  
  public static void removeUserRoute(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.UserRouteInfo)paramObject2;
    ((MediaRouter)paramObject1).removeUserRoute((MediaRouter.UserRouteInfo)paramObject2);
  }
  
  public static void selectRoute(Object paramObject1, int paramInt, Object paramObject2)
  {
    paramObject1 = (MediaRouter)paramObject1;
    paramObject2 = (MediaRouter.RouteInfo)paramObject2;
    ((MediaRouter)paramObject1).selectRoute(paramInt, (MediaRouter.RouteInfo)paramObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybean.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */