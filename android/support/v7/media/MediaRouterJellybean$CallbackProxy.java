package android.support.v7.media;

import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteGroup;
import android.media.MediaRouter.RouteInfo;

class MediaRouterJellybean$CallbackProxy
  extends MediaRouter.Callback
{
  protected final MediaRouterJellybean.Callback mCallback;
  
  public MediaRouterJellybean$CallbackProxy(MediaRouterJellybean.Callback paramCallback)
  {
    this.mCallback = paramCallback;
  }
  
  public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.mCallback.onRouteAdded(paramRouteInfo);
  }
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.mCallback.onRouteChanged(paramRouteInfo);
  }
  
  public void onRouteGrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup, int paramInt)
  {
    this.mCallback.onRouteGrouped(paramRouteInfo, paramRouteGroup, paramInt);
  }
  
  public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.mCallback.onRouteRemoved(paramRouteInfo);
  }
  
  public void onRouteSelected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.mCallback.onRouteSelected(paramInt, paramRouteInfo);
  }
  
  public void onRouteUngrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup)
  {
    this.mCallback.onRouteUngrouped(paramRouteInfo, paramRouteGroup);
  }
  
  public void onRouteUnselected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.mCallback.onRouteUnselected(paramInt, paramRouteInfo);
  }
  
  public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.mCallback.onRouteVolumeChanged(paramRouteInfo);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybean$CallbackProxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */