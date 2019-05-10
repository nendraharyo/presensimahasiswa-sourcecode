package android.support.v7.app;

import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.ProviderInfo;
import android.support.v7.media.MediaRouter.RouteInfo;
import java.lang.ref.WeakReference;

final class MediaRouteActionProvider$MediaRouterCallback
  extends MediaRouter.Callback
{
  private final WeakReference mProviderWeak;
  
  public MediaRouteActionProvider$MediaRouterCallback(MediaRouteActionProvider paramMediaRouteActionProvider)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramMediaRouteActionProvider);
    this.mProviderWeak = localWeakReference;
  }
  
  private void refreshRoute(MediaRouter paramMediaRouter)
  {
    MediaRouteActionProvider localMediaRouteActionProvider = (MediaRouteActionProvider)this.mProviderWeak.get();
    if (localMediaRouteActionProvider != null) {
      MediaRouteActionProvider.access$000(localMediaRouteActionProvider);
    }
    for (;;)
    {
      return;
      paramMediaRouter.removeCallback(this);
    }
  }
  
  public void onProviderAdded(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onProviderChanged(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onProviderRemoved(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    refreshRoute(paramMediaRouter);
  }
  
  public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    refreshRoute(paramMediaRouter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteActionProvider$MediaRouterCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */