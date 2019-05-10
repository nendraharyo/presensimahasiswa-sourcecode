package android.support.v7.media;

final class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord
  implements RemoteControlClientCompat.VolumeCallback
{
  private boolean mDisconnected;
  private final RemoteControlClientCompat mRccCompat;
  
  public MediaRouter$GlobalMediaRouter$RemoteControlClientRecord(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter, Object paramObject)
  {
    RemoteControlClientCompat localRemoteControlClientCompat = RemoteControlClientCompat.obtain(MediaRouter.GlobalMediaRouter.access$1100(paramGlobalMediaRouter), paramObject);
    this.mRccCompat = localRemoteControlClientCompat;
    this.mRccCompat.setVolumeCallback(this);
    updatePlaybackInfo();
  }
  
  public void disconnect()
  {
    this.mDisconnected = true;
    this.mRccCompat.setVolumeCallback(null);
  }
  
  public Object getRemoteControlClient()
  {
    return this.mRccCompat.getRemoteControlClient();
  }
  
  public void onVolumeSetRequest(int paramInt)
  {
    boolean bool = this.mDisconnected;
    if (!bool)
    {
      MediaRouter.RouteInfo localRouteInfo = MediaRouter.GlobalMediaRouter.access$1200(this.this$0);
      if (localRouteInfo != null)
      {
        localRouteInfo = MediaRouter.GlobalMediaRouter.access$1200(this.this$0);
        localRouteInfo.requestSetVolume(paramInt);
      }
    }
  }
  
  public void onVolumeUpdateRequest(int paramInt)
  {
    boolean bool = this.mDisconnected;
    if (!bool)
    {
      MediaRouter.RouteInfo localRouteInfo = MediaRouter.GlobalMediaRouter.access$1200(this.this$0);
      if (localRouteInfo != null)
      {
        localRouteInfo = MediaRouter.GlobalMediaRouter.access$1200(this.this$0);
        localRouteInfo.requestUpdateVolume(paramInt);
      }
    }
  }
  
  public void updatePlaybackInfo()
  {
    RemoteControlClientCompat localRemoteControlClientCompat = this.mRccCompat;
    RemoteControlClientCompat.PlaybackInfo localPlaybackInfo = MediaRouter.GlobalMediaRouter.access$1400(this.this$0);
    localRemoteControlClientCompat.setPlaybackInfo(localPlaybackInfo);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$GlobalMediaRouter$RemoteControlClientRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */