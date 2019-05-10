package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

class DataLayer$2
  implements DataLayer.zzc.zza
{
  DataLayer$2(DataLayer paramDataLayer) {}
  
  public void zzB(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (DataLayer.zza)localIterator.next();
      DataLayer localDataLayer1 = this.zzbiz;
      DataLayer localDataLayer2 = this.zzbiz;
      String str = ((DataLayer.zza)localObject).zzvs;
      localObject = ((DataLayer.zza)localObject).zzNc;
      localObject = localDataLayer2.zzn(str, localObject);
      DataLayer.zza(localDataLayer1, (Map)localObject);
    }
    DataLayer.zza(this.zzbiz).countDown();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\DataLayer$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */