package android.support.v7.media;

import android.content.Intent;

public abstract class MediaRouteProvider$RouteController
{
  public boolean onControlRequest(Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    return false;
  }
  
  public void onRelease() {}
  
  public void onSelect() {}
  
  public void onSetVolume(int paramInt) {}
  
  public void onUnselect() {}
  
  public void onUnselect(int paramInt)
  {
    onUnselect();
  }
  
  public void onUpdateVolume(int paramInt) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProvider$RouteController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */