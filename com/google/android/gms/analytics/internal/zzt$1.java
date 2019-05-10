package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.measurement.zzg;

class zzt$1
  implements Runnable
{
  zzt$1(zzt paramzzt) {}
  
  public void run()
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = Looper.getMainLooper();
    if (localObject1 == localObject2)
    {
      localObject1 = zzt.zza(this.zzRF).zzjo();
      ((zzg)localObject1).zzf(this);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzRF;
      boolean bool = ((zzt)localObject1).zzbw();
      localObject2 = this.zzRF;
      long l = 0L;
      zzt.zza((zzt)localObject2, l);
      if (bool)
      {
        localObject1 = this.zzRF;
        bool = zzt.zzb((zzt)localObject1);
        if (!bool)
        {
          localObject1 = this.zzRF;
          ((zzt)localObject1).run();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzt$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */