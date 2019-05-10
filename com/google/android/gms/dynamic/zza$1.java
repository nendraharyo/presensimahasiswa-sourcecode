package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

class zza$1
  implements zzf
{
  zza$1(zza paramzza) {}
  
  public void zza(LifecycleDelegate paramLifecycleDelegate)
  {
    zza.zza(this.zzavB, paramLifecycleDelegate);
    Object localObject = zza.zza(this.zzavB);
    Iterator localIterator = ((LinkedList)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zza.zza)localIterator.next();
      LifecycleDelegate localLifecycleDelegate = zza.zzb(this.zzavB);
      ((zza.zza)localObject).zzb(localLifecycleDelegate);
    }
    zza.zza(this.zzavB).clear();
    zza.zza(this.zzavB, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */