package android.support.v7.media;

import android.content.Context;

class RemoteControlClientCompat$JellybeanImpl
  extends RemoteControlClientCompat
{
  private boolean mRegistered;
  private final Object mRouterObj;
  private final Object mUserRouteCategoryObj;
  private final Object mUserRouteObj;
  
  public RemoteControlClientCompat$JellybeanImpl(Context paramContext, Object paramObject)
  {
    super(paramContext, paramObject);
    Object localObject1 = MediaRouterJellybean.getMediaRouter(paramContext);
    this.mRouterObj = localObject1;
    localObject1 = MediaRouterJellybean.createRouteCategory(this.mRouterObj, "", false);
    this.mUserRouteCategoryObj = localObject1;
    localObject1 = this.mRouterObj;
    Object localObject2 = this.mUserRouteCategoryObj;
    localObject1 = MediaRouterJellybean.createUserRoute(localObject1, localObject2);
    this.mUserRouteObj = localObject1;
  }
  
  public void setPlaybackInfo(RemoteControlClientCompat.PlaybackInfo paramPlaybackInfo)
  {
    Object localObject1 = this.mUserRouteObj;
    int i = paramPlaybackInfo.volume;
    MediaRouterJellybean.UserRouteInfo.setVolume(localObject1, i);
    localObject1 = this.mUserRouteObj;
    i = paramPlaybackInfo.volumeMax;
    MediaRouterJellybean.UserRouteInfo.setVolumeMax(localObject1, i);
    localObject1 = this.mUserRouteObj;
    i = paramPlaybackInfo.volumeHandling;
    MediaRouterJellybean.UserRouteInfo.setVolumeHandling(localObject1, i);
    localObject1 = this.mUserRouteObj;
    i = paramPlaybackInfo.playbackStream;
    MediaRouterJellybean.UserRouteInfo.setPlaybackStream(localObject1, i);
    localObject1 = this.mUserRouteObj;
    i = paramPlaybackInfo.playbackType;
    MediaRouterJellybean.UserRouteInfo.setPlaybackType(localObject1, i);
    boolean bool = this.mRegistered;
    if (!bool)
    {
      bool = true;
      this.mRegistered = bool;
      localObject1 = this.mUserRouteObj;
      Object localObject2 = new android/support/v7/media/RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper;
      ((RemoteControlClientCompat.JellybeanImpl.VolumeCallbackWrapper)localObject2).<init>(this);
      localObject2 = MediaRouterJellybean.createVolumeCallback((MediaRouterJellybean.VolumeCallback)localObject2);
      MediaRouterJellybean.UserRouteInfo.setVolumeCallback(localObject1, localObject2);
      localObject1 = this.mUserRouteObj;
      localObject2 = this.mRcc;
      MediaRouterJellybean.UserRouteInfo.setRemoteControlClient(localObject1, localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\RemoteControlClientCompat$JellybeanImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */