package android.support.v7.media;

import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.VolumeCallback;

class MediaRouterJellybean$VolumeCallbackProxy
  extends MediaRouter.VolumeCallback
{
  protected final MediaRouterJellybean.VolumeCallback mCallback;
  
  public MediaRouterJellybean$VolumeCallbackProxy(MediaRouterJellybean.VolumeCallback paramVolumeCallback)
  {
    this.mCallback = paramVolumeCallback;
  }
  
  public void onVolumeSetRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    this.mCallback.onVolumeSetRequest(paramRouteInfo, paramInt);
  }
  
  public void onVolumeUpdateRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    this.mCallback.onVolumeUpdateRequest(paramRouteInfo, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybean$VolumeCallbackProxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */