package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzcv;

public class zzn
{
  private static final Object zzqy;
  private static zzn zzur;
  private final zza zzus;
  private final zze zzut;
  private final zzl zzuu;
  private final zzaf zzuv;
  private final zzcv zzuw;
  private final zzf zzux;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
    localObject = new com/google/android/gms/ads/internal/client/zzn;
    ((zzn)localObject).<init>();
    zza((zzn)localObject);
  }
  
  protected zzn()
  {
    Object localObject = new com/google/android/gms/ads/internal/util/client/zza;
    ((zza)localObject).<init>();
    this.zzus = ((zza)localObject);
    localObject = new com/google/android/gms/ads/internal/client/zze;
    ((zze)localObject).<init>();
    this.zzut = ((zze)localObject);
    localObject = new com/google/android/gms/ads/internal/client/zzl;
    ((zzl)localObject).<init>();
    this.zzuu = ((zzl)localObject);
    localObject = new com/google/android/gms/ads/internal/client/zzaf;
    ((zzaf)localObject).<init>();
    this.zzuv = ((zzaf)localObject);
    localObject = new com/google/android/gms/internal/zzcv;
    ((zzcv)localObject).<init>();
    this.zzuw = ((zzcv)localObject);
    localObject = new com/google/android/gms/ads/internal/reward/client/zzf;
    ((zzf)localObject).<init>();
    this.zzux = ((zzf)localObject);
  }
  
  protected static void zza(zzn paramzzn)
  {
    synchronized (zzqy)
    {
      zzur = paramzzn;
      return;
    }
  }
  
  private static zzn zzcR()
  {
    synchronized (zzqy)
    {
      zzn localzzn = zzur;
      return localzzn;
    }
  }
  
  public static zza zzcS()
  {
    return zzcR().zzus;
  }
  
  public static zze zzcT()
  {
    return zzcR().zzut;
  }
  
  public static zzl zzcU()
  {
    return zzcR().zzuu;
  }
  
  public static zzaf zzcV()
  {
    return zzcR().zzuv;
  }
  
  public static zzcv zzcW()
  {
    return zzcR().zzuw;
  }
  
  public static zzf zzcX()
  {
    return zzcR().zzux;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */