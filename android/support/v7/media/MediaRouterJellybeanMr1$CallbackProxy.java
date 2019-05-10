package android.support.v7.media;

import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;

class MediaRouterJellybeanMr1$CallbackProxy
  extends MediaRouterJellybean.CallbackProxy
{
  public MediaRouterJellybeanMr1$CallbackProxy(MediaRouterJellybeanMr1.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public void onRoutePresentationDisplayChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    ((MediaRouterJellybeanMr1.Callback)this.mCallback).onRoutePresentationDisplayChanged(paramRouteInfo);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybeanMr1$CallbackProxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */