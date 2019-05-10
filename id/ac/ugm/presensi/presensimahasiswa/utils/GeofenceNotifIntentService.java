package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.w.b;
import android.support.v4.app.w.c;
import android.support.v4.app.w.d;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.location.GeofencingEvent;
import id.ac.ugm.presensi.presensimahasiswa.Dashboard.response.DashboardActivity;
import id.ac.ugm.presensi.presensimahasiswa.Notify.response.NotificationActivity;
import java.util.Calendar;

public class GeofenceNotifIntentService
  extends IntentService
{
  public GeofenceNotifIntentService()
  {
    super("GeofenceTransitionsIntentService");
  }
  
  public void a(String paramString1, String paramString2)
  {
    int i = 1;
    NotificationManager localNotificationManager = (NotificationManager)getSystemService("notification");
    f.a(getApplicationContext(), "user_login", false);
    Object localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>(this, DashboardActivity.class);
    ((Intent)localObject1).addFlags(603979776);
    localObject1 = PendingIntent.getActivity(this, 0, (Intent)localObject1, 134217728);
    Object localObject2 = new android/support/v4/app/w$c;
    ((w.c)localObject2).<init>(this);
    localObject1 = ((w.c)localObject2).a(2131558400).a("Presensi Mahasiswa Alert!").b(paramString1).a((PendingIntent)localObject1);
    localObject2 = new android/support/v4/app/w$b;
    ((w.b)localObject2).<init>();
    localObject2 = ((w.b)localObject2).a(paramString2);
    localObject1 = ((w.c)localObject1).a((w.d)localObject2).b(i).b(i).a();
    localNotificationManager.notify(0, (Notification)localObject1);
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = "onHandleIntent";
    Log.i("GeofenceTransitions", (String)localObject1);
    Object localObject2 = GeofencingEvent.fromIntent(paramIntent);
    boolean bool = ((GeofencingEvent)localObject2).hasError();
    Object localObject3;
    String str;
    int m;
    if (bool)
    {
      localObject1 = "GeofenceTransitions";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      str = "Goefencing Error ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      m = ((GeofencingEvent)localObject2).getErrorCode();
      localObject2 = m;
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      m = ((GeofencingEvent)localObject2).getGeofenceTransition();
      localObject1 = getApplicationContext();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "geofenceTransition = " + m + " Enter : " + j + "Exit : " + i;
      Toast.makeText((Context)localObject1, (CharSequence)localObject3, j).show();
      localObject1 = "GeofenceTransitions";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("geofenceTransition = ").append(m).append(" Enter : ").append(j);
      str = "Exit : ";
      localObject3 = str + i;
      Log.i((String)localObject1, (String)localObject3);
      if (m != j)
      {
        int k = 4;
        if (m != k) {
          if (m == i)
          {
            Log.i("GeofenceTransitions", "Showing Notification...");
            localObject1 = Calendar.getInstance();
            m = 13;
            ((Calendar)localObject1).add(m, j);
            localObject2 = new android/content/Intent;
            ((Intent)localObject2).<init>(this, NotificationActivity.class);
            int n = 12345;
            localObject3 = PendingIntent.getActivity(this, n, (Intent)localObject2, 268435456);
            localObject2 = (AlarmManager)getSystemService("alarm");
            str = null;
            long l = ((Calendar)localObject1).getTimeInMillis();
            ((AlarmManager)localObject2).set(0, l, (PendingIntent)localObject3);
          }
          else
          {
            a("Error", "Error");
            localObject2 = "GeofenceTransitions";
            localObject1 = "Error ";
            Log.e((String)localObject2, (String)localObject1);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\GeofenceNotifIntentService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */