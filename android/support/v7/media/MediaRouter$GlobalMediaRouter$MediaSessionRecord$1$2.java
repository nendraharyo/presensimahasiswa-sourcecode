package android.support.v7.media;

class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2
  implements Runnable
{
  MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2(MediaRouter.GlobalMediaRouter.MediaSessionRecord.1 param1, int paramInt) {}
  
  public void run()
  {
    MediaRouter.RouteInfo localRouteInfo = MediaRouter.GlobalMediaRouter.access$1200(this.this$2.this$1.this$0);
    if (localRouteInfo != null)
    {
      localRouteInfo = MediaRouter.GlobalMediaRouter.access$1200(this.this$2.this$1.this$0);
      int i = this.val$direction;
      localRouteInfo.requestUpdateVolume(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */