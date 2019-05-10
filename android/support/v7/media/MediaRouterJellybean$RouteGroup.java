package android.support.v7.media;

import android.media.MediaRouter.RouteGroup;
import android.media.MediaRouter.RouteInfo;
import java.util.ArrayList;
import java.util.List;

public final class MediaRouterJellybean$RouteGroup
{
  public static List getGroupedRoutes(Object paramObject)
  {
    paramObject = (MediaRouter.RouteGroup)paramObject;
    int i = ((MediaRouter.RouteGroup)paramObject).getRouteCount();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(i);
    int j = 0;
    while (j < i)
    {
      MediaRouter.RouteInfo localRouteInfo = ((MediaRouter.RouteGroup)paramObject).getRouteAt(j);
      localArrayList.add(localRouteInfo);
      j += 1;
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybean$RouteGroup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */