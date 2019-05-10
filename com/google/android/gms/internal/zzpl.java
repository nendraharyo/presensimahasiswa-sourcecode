package com.google.android.gms.internal;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.concurrent.Callable;

public class zzpl
{
  public static Object zzb(Callable paramCallable)
  {
    localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      localObject1 = StrictMode.ThreadPolicy.LAX;
      StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject1);
      localObject1 = paramCallable.call();
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
    finally
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3 = null;
        StrictMode.setThreadPolicy(localThreadPolicy);
      }
    }
    return localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */