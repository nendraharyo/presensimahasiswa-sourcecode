package com.google.android.gms.measurement;

import java.util.Iterator;
import java.util.List;

class zzg$1
  implements Runnable
{
  zzg$1(zzg paramzzg, zzc paramzzc) {}
  
  public void run()
  {
    Object localObject1 = this.zzaUA.zzAB();
    Object localObject2 = this.zzaUA;
    ((zzf)localObject1).zza((zzc)localObject2);
    localObject1 = zzg.zza(this.zzaUB);
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzh)((Iterator)localObject2).next();
      zzc localzzc = this.zzaUA;
      ((zzh)localObject1).zza(localzzc);
    }
    localObject1 = this.zzaUB;
    localObject2 = this.zzaUA;
    zzg.zza((zzg)localObject1, (zzc)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzg$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */