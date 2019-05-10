package com.google.android.gms.common.api.internal;

import android.support.v4.app.i;
import android.support.v4.app.m;

class zzj$6
  implements Runnable
{
  zzj$6(zzj paramzzj, i parami) {}
  
  public void run()
  {
    Object localObject = this.zzaih;
    boolean bool = ((i)localObject).isFinishing();
    if (!bool)
    {
      localObject = this.zzaih.getSupportFragmentManager();
      bool = ((m)localObject).f();
      if (!bool) {
        break label32;
      }
    }
    for (;;)
    {
      return;
      label32:
      localObject = zzw.zzb(this.zzaih);
      zzj localzzj = this.zzaid;
      int i = zzj.zze(localzzj);
      ((zzw)localObject).zzbD(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzj$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */