package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class zziq$4
  implements Runnable
{
  zziq$4(zzjd paramzzjd, Future paramFuture) {}
  
  public void run()
  {
    Object localObject = this.zzLX;
    boolean bool1 = ((zzjd)localObject).isCancelled();
    if (bool1)
    {
      localObject = this.zzLZ;
      boolean bool2 = true;
      ((Future)localObject).cancel(bool2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziq$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */