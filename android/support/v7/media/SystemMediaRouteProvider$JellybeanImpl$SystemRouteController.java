package android.support.v7.media;

public final class SystemMediaRouteProvider$JellybeanImpl$SystemRouteController
  extends MediaRouteProvider.RouteController
{
  private final Object mRouteObj;
  
  public SystemMediaRouteProvider$JellybeanImpl$SystemRouteController(SystemMediaRouteProvider.JellybeanImpl paramJellybeanImpl, Object paramObject)
  {
    this.mRouteObj = paramObject;
  }
  
  public void onSetVolume(int paramInt)
  {
    MediaRouterJellybean.RouteInfo.requestSetVolume(this.mRouteObj, paramInt);
  }
  
  public void onUpdateVolume(int paramInt)
  {
    MediaRouterJellybean.RouteInfo.requestUpdateVolume(this.mRouteObj, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\SystemMediaRouteProvider$JellybeanImpl$SystemRouteController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */