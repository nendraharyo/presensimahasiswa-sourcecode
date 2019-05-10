package com.google.android.gms.fitness.request;

import java.util.HashMap;
import java.util.Map;

public class zza$zza
{
  private static final zza zzaAz;
  private final Map zzaAA;
  
  static
  {
    zza localzza = new com/google/android/gms/fitness/request/zza$zza;
    localzza.<init>();
    zzaAz = localzza;
  }
  
  private zza$zza()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaAA = localHashMap;
  }
  
  public static zza zzuJ()
  {
    return zzaAz;
  }
  
  public zza zza(BleScanCallback paramBleScanCallback)
  {
    synchronized (this.zzaAA)
    {
      Object localObject1 = this.zzaAA;
      localObject1 = ((Map)localObject1).get(paramBleScanCallback);
      localObject1 = (zza)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/fitness/request/zza;
        Map localMap2 = null;
        ((zza)localObject1).<init>(paramBleScanCallback, null);
        localMap2 = this.zzaAA;
        localMap2.put(paramBleScanCallback, localObject1);
      }
      return (zza)localObject1;
    }
  }
  
  public zza zzb(BleScanCallback paramBleScanCallback)
  {
    synchronized (this.zzaAA)
    {
      Object localObject1 = this.zzaAA;
      localObject1 = ((Map)localObject1).get(paramBleScanCallback);
      localObject1 = (zza)localObject1;
      if (localObject1 != null) {
        return (zza)localObject1;
      }
      localObject1 = new com/google/android/gms/fitness/request/zza;
      ((zza)localObject1).<init>(paramBleScanCallback, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */