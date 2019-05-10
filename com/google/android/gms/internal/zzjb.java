package com.google.android.gms.internal;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.ads.internal.zzr;
import java.util.concurrent.Callable;

public class zzjb
{
  public static Object zzb(Callable paramCallable)
  {
    localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      localObject1 = new android/os/StrictMode$ThreadPolicy$Builder;
      ((StrictMode.ThreadPolicy.Builder)localObject1).<init>(localThreadPolicy);
      localObject1 = ((StrictMode.ThreadPolicy.Builder)localObject1).permitDiskReads();
      localObject1 = ((StrictMode.ThreadPolicy.Builder)localObject1).permitDiskWrites();
      localObject1 = ((StrictMode.ThreadPolicy.Builder)localObject1).build();
      StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject1);
      localObject1 = paramCallable.call();
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
    finally
    {
      for (;;)
      {
        Object localObject1;
        Object localObject4 = "Unexpected exception.";
        try
        {
          zzin.zzb((String)localObject4, localThrowable);
          localObject4 = zzr.zzbF();
          boolean bool = true;
          ((zzih)localObject4).zzb(localThrowable, bool);
          Object localObject2 = null;
          StrictMode.setThreadPolicy(localThreadPolicy);
        }
        finally
        {
          StrictMode.setThreadPolicy(localThreadPolicy);
        }
      }
    }
    return localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */