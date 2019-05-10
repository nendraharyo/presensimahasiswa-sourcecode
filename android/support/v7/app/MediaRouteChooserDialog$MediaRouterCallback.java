package android.support.v7.app;

import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;

final class MediaRouteChooserDialog$MediaRouterCallback
  extends MediaRouter.Callback
{
  private MediaRouteChooserDialog$MediaRouterCallback(MediaRouteChooserDialog paramMediaRouteChooserDialog) {}
  
  public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.this$0.refreshRoutes();
  }
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.this$0.refreshRoutes();
  }
  
  public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.this$0.refreshRoutes();
  }
  
  public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.this$0.dismiss();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteChooserDialog$MediaRouterCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */