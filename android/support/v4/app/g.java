package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;

public final class g
{
  public static IBinder a(Bundle paramBundle, String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    if (i >= j) {}
    for (IBinder localIBinder = paramBundle.getBinder(paramString);; localIBinder = g.a.a(paramBundle, paramString)) {
      return localIBinder;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */