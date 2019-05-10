package android.support.v4.app;

import android.app.Notification;
import android.os.Build.VERSION;
import android.os.Bundle;

public class w
{
  public static Bundle a(Notification paramNotification)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    Bundle localBundle;
    if (i >= j) {
      localBundle = paramNotification.extras;
    }
    for (;;)
    {
      return localBundle;
      i = Build.VERSION.SDK_INT;
      j = 16;
      if (i >= j)
      {
        localBundle = y.a(paramNotification);
      }
      else
      {
        i = 0;
        localBundle = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */