package android.support.v7.media;

final class MediaRouter$CallbackRecord
{
  public final MediaRouter.Callback mCallback;
  public int mFlags;
  public final MediaRouter mRouter;
  public MediaRouteSelector mSelector;
  
  public MediaRouter$CallbackRecord(MediaRouter paramMediaRouter, MediaRouter.Callback paramCallback)
  {
    this.mRouter = paramMediaRouter;
    this.mCallback = paramCallback;
    MediaRouteSelector localMediaRouteSelector = MediaRouteSelector.EMPTY;
    this.mSelector = localMediaRouteSelector;
  }
  
  public boolean filterRouteEvent(MediaRouter.RouteInfo paramRouteInfo)
  {
    int i = this.mFlags & 0x2;
    MediaRouteSelector localMediaRouteSelector;
    boolean bool;
    if (i == 0)
    {
      localMediaRouteSelector = this.mSelector;
      bool = paramRouteInfo.matchesSelector(localMediaRouteSelector);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMediaRouteSelector = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$CallbackRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */