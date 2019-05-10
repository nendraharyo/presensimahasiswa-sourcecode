package com.google.android.gms.fitness.data;

import com.google.android.gms.fitness.request.OnDataPointListener;
import java.util.HashMap;
import java.util.Map;

public class zzl$zza
{
  private static final zza zzaxc;
  private final Map zzaxd;
  
  static
  {
    zza localzza = new com/google/android/gms/fitness/data/zzl$zza;
    localzza.<init>();
    zzaxc = localzza;
  }
  
  private zzl$zza()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaxd = localHashMap;
  }
  
  public static zza zzuu()
  {
    return zzaxc;
  }
  
  public zzl zza(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (this.zzaxd)
    {
      Object localObject1 = this.zzaxd;
      localObject1 = ((Map)localObject1).get(paramOnDataPointListener);
      localObject1 = (zzl)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/fitness/data/zzl;
        Map localMap2 = null;
        ((zzl)localObject1).<init>(paramOnDataPointListener, null);
        localMap2 = this.zzaxd;
        localMap2.put(paramOnDataPointListener, localObject1);
      }
      return (zzl)localObject1;
    }
  }
  
  public zzl zzb(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (this.zzaxd)
    {
      Object localObject1 = this.zzaxd;
      localObject1 = ((Map)localObject1).get(paramOnDataPointListener);
      localObject1 = (zzl)localObject1;
      return (zzl)localObject1;
    }
  }
  
  public zzl zzc(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (this.zzaxd)
    {
      Object localObject1 = this.zzaxd;
      localObject1 = ((Map)localObject1).remove(paramOnDataPointListener);
      localObject1 = (zzl)localObject1;
      if (localObject1 != null) {
        return (zzl)localObject1;
      }
      localObject1 = new com/google/android/gms/fitness/data/zzl;
      ((zzl)localObject1).<init>(paramOnDataPointListener, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzl$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */