package android.support.v7.app;

import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;

final class MediaRouteControllerDialog$MediaRouterCallback
  extends MediaRouter.Callback
{
  private MediaRouteControllerDialog$MediaRouterCallback(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    MediaRouteControllerDialog.access$700(this.this$0);
  }
  
  public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    MediaRouteControllerDialog.access$700(this.this$0);
  }
  
  public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    Object localObject = MediaRouteControllerDialog.access$600(this.this$0);
    if (paramRouteInfo == localObject)
    {
      localObject = this.this$0;
      MediaRouteControllerDialog.access$400((MediaRouteControllerDialog)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteControllerDialog$MediaRouterCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */