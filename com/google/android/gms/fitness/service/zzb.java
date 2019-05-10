package com.google.android.gms.fitness.service;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.zzk;
import java.util.Iterator;
import java.util.List;

class zzb
  implements SensorEventDispatcher
{
  private final zzk zzaBh;
  
  zzb(zzk paramzzk)
  {
    zzk localzzk = (zzk)zzx.zzz(paramzzk);
    this.zzaBh = localzzk;
  }
  
  public void publish(DataPoint paramDataPoint)
  {
    paramDataPoint.zzui();
    this.zzaBh.zzc(paramDataPoint);
  }
  
  public void publish(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      DataPoint localDataPoint = (DataPoint)localIterator.next();
      publish(localDataPoint);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\service\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */