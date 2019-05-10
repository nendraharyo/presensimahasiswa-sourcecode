package com.google.android.gms.measurement.internal;

import android.os.Looper;

class zzf$1
  implements Runnable
{
  zzf$1(zzf paramzzf) {}
  
  public void run()
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = Looper.getMainLooper();
    if (localObject1 == localObject2)
    {
      localObject1 = zzf.zza(this.zzaVJ).zzCn();
      ((zzv)localObject1).zzg(this);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzaVJ;
      boolean bool = ((zzf)localObject1).zzbw();
      localObject2 = this.zzaVJ;
      long l = 0L;
      zzf.zza((zzf)localObject2, l);
      if (bool)
      {
        localObject1 = this.zzaVJ;
        bool = zzf.zzb((zzf)localObject1);
        if (bool)
        {
          localObject1 = this.zzaVJ;
          ((zzf)localObject1).run();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzf$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */