package android.support.v7.app;

import android.support.v7.media.MediaRouter.RouteInfo;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class MediaRouteControllerDialog$1
  implements SeekBar.OnSeekBarChangeListener
{
  private final Runnable mStopTrackingTouch;
  
  MediaRouteControllerDialog$1(MediaRouteControllerDialog paramMediaRouteControllerDialog)
  {
    MediaRouteControllerDialog.1.1 local1 = new android/support/v7/app/MediaRouteControllerDialog$1$1;
    local1.<init>(this);
    this.mStopTrackingTouch = local1;
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      MediaRouter.RouteInfo localRouteInfo = MediaRouteControllerDialog.access$600(this.this$0);
      localRouteInfo.requestSetVolume(paramInt);
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    Object localObject = this.this$0;
    boolean bool1 = MediaRouteControllerDialog.access$300((MediaRouteControllerDialog)localObject);
    if (bool1)
    {
      localObject = MediaRouteControllerDialog.access$500(this.this$0);
      Runnable localRunnable = this.mStopTrackingTouch;
      ((SeekBar)localObject).removeCallbacks(localRunnable);
    }
    for (;;)
    {
      return;
      localObject = this.this$0;
      boolean bool2 = true;
      MediaRouteControllerDialog.access$302((MediaRouteControllerDialog)localObject, bool2);
    }
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    SeekBar localSeekBar = MediaRouteControllerDialog.access$500(this.this$0);
    Runnable localRunnable = this.mStopTrackingTouch;
    localSeekBar.postDelayed(localRunnable, 250L);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteControllerDialog$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */