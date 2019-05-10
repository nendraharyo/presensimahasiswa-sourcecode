package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

abstract class zzh$zzf
  implements Runnable
{
  private zzh$zzf(zzh paramzzh) {}
  
  public void run()
  {
    Lock localLock1 = zzh.zzc(this.zzahC);
    localLock1.lock();
    for (;;)
    {
      try
      {
        boolean bool = Thread.interrupted();
        if (bool)
        {
          localLock1 = zzh.zzc(this.zzahC);
          localLock1.unlock();
          return;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject2 = this.zzahC;
        localObject2 = zzh.zzd((zzh)localObject2);
        ((zzl)localObject2).zza(localRuntimeException);
        Lock localLock2 = zzh.zzc(this.zzahC);
        localLock2.unlock();
        continue;
      }
      finally
      {
        zzh.zzc(this.zzahC).unlock();
      }
      zzpt();
      localLock1 = zzh.zzc(this.zzahC);
      localLock1.unlock();
    }
  }
  
  protected abstract void zzpt();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzh$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */