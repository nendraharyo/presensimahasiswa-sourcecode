package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class zzeu$2
  implements Runnable
{
  zzeu$2(zzeu paramzzeu, zzjg paramzzjg) {}
  
  public void run()
  {
    Object localObject1 = zzeu.zze(this.zzCB).keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzjg)localIterator.next();
      Object localObject2 = this.zzCC;
      if (localObject1 != localObject2)
      {
        localObject2 = zzeu.zze(this.zzCB);
        localObject1 = (zzer)((Map)localObject2).get(localObject1);
        ((zzer)localObject1).cancel();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeu$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */