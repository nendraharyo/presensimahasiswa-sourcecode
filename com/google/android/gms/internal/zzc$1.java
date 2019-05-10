package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

class zzc$1
  implements Runnable
{
  zzc$1(zzc paramzzc, zzk paramzzk) {}
  
  public void run()
  {
    try
    {
      Object localObject = this.zzn;
      localObject = zzc.zza((zzc)localObject);
      zzk localzzk = this.zzm;
      ((BlockingQueue)localObject).put(localzzk);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */