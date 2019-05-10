package id.ac.ugm.presensi.presensimahasiswa.Notify.response;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import id.ac.ugm.presensi.presensimahasiswa.Dashboard.response.DashboardActivity;

class NotificationActivity$1
  implements View.OnTouchListener
{
  NotificationActivity$1(NotificationActivity paramNotificationActivity) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    NotificationActivity.a(this.a).stop();
    Intent localIntent = new android/content/Intent;
    NotificationActivity localNotificationActivity = this.a;
    localIntent.<init>(localNotificationActivity, DashboardActivity.class);
    localIntent.setFlags(268468224);
    this.a.startActivity(localIntent);
    this.a.finish();
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Notify\response\NotificationActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */