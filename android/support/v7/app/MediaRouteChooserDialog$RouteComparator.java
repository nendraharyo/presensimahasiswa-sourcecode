package android.support.v7.app;

import android.support.v7.media.MediaRouter.RouteInfo;
import java.util.Comparator;

final class MediaRouteChooserDialog$RouteComparator
  implements Comparator
{
  public static final RouteComparator sInstance;
  
  static
  {
    RouteComparator localRouteComparator = new android/support/v7/app/MediaRouteChooserDialog$RouteComparator;
    localRouteComparator.<init>();
    sInstance = localRouteComparator;
  }
  
  public int compare(MediaRouter.RouteInfo paramRouteInfo1, MediaRouter.RouteInfo paramRouteInfo2)
  {
    String str1 = paramRouteInfo1.getName();
    String str2 = paramRouteInfo2.getName();
    return str1.compareTo(str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteChooserDialog$RouteComparator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */