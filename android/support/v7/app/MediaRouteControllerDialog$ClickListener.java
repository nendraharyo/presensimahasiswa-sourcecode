package android.support.v7.app;

import android.content.IntentSender;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.g;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R.id;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

final class MediaRouteControllerDialog$ClickListener
  implements View.OnClickListener
{
  private MediaRouteControllerDialog$ClickListener(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    int j = R.id.stop;
    Object localObject1;
    int m;
    Object localObject2;
    if (i != j)
    {
      j = R.id.disconnect;
      if (i != j) {}
    }
    else
    {
      localObject1 = MediaRouteControllerDialog.access$600(this.this$0);
      boolean bool = ((MediaRouter.RouteInfo)localObject1).isSelected();
      if (bool)
      {
        localObject1 = MediaRouteControllerDialog.access$1200(this.this$0);
        m = R.id.stop;
        if (i == m)
        {
          i = 2;
          ((MediaRouter)localObject1).unselect(i);
        }
      }
      else
      {
        localObject2 = this.this$0;
        ((MediaRouteControllerDialog)localObject2).dismiss();
      }
    }
    for (;;)
    {
      return;
      i = 1;
      break;
      int k = R.id.play_pause;
      if (i == k)
      {
        localObject2 = MediaRouteControllerDialog.access$800(this.this$0);
        if (localObject2 != null)
        {
          localObject2 = MediaRouteControllerDialog.access$1000(this.this$0);
          if (localObject2 != null)
          {
            localObject2 = MediaRouteControllerDialog.access$1000(this.this$0);
            i = ((PlaybackStateCompat)localObject2).a();
            k = 3;
            if (i == k)
            {
              localObject2 = MediaRouteControllerDialog.access$800(this.this$0).a();
              ((MediaControllerCompat.g)localObject2).b();
            }
            else
            {
              localObject2 = MediaRouteControllerDialog.access$800(this.this$0).a();
              ((MediaControllerCompat.g)localObject2).a();
            }
          }
        }
      }
      else
      {
        k = R.id.settings;
        if (i == k)
        {
          localObject2 = MediaRouteControllerDialog.access$600(this.this$0).getSettingsIntent();
          if (localObject2 != null)
          {
            k = 0;
            localObject1 = null;
            m = 0;
            String str = null;
            try
            {
              ((IntentSender)localObject2).sendIntent(null, 0, null, null, null);
              localObject2 = this.this$0;
              ((MediaRouteControllerDialog)localObject2).dismiss();
            }
            catch (Exception localException)
            {
              localObject1 = "MediaRouteControllerDialog";
              str = "Error opening route settings.";
              Log.e((String)localObject1, str, localException);
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteControllerDialog$ClickListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */