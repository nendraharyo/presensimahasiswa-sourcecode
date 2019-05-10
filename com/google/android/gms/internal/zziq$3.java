package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzr;
import java.util.concurrent.Callable;

final class zziq$3
  implements Runnable
{
  zziq$3(zzjd paramzzjd, Callable paramCallable) {}
  
  public void run()
  {
    boolean bool = true;
    int i = 10;
    try
    {
      Process.setThreadPriority(i);
      zzjd localzzjd1 = this.zzLX;
      localObject = this.zzLY;
      localObject = ((Callable)localObject).call();
      localzzjd1.zzg(localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = zzr.zzbF();
        ((zzih)localObject).zzb(localException, bool);
        zzjd localzzjd2 = this.zzLX;
        localzzjd2.cancel(bool);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziq$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */