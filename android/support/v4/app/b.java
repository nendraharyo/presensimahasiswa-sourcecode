package android.support.v4.app;

import android.app.ActivityManager;
import android.os.Build.VERSION;

public final class b
{
  public static boolean a(ActivityManager paramActivityManager)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {}
    for (boolean bool = paramActivityManager.isLowRamDevice();; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */