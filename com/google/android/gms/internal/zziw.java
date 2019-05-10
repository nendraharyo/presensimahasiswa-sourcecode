package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;

public class zziw
{
  private static zzl zzMy;
  public static final zziw.zza zzMz;
  private static final Object zzqy;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
    localObject = new com/google/android/gms/internal/zziw$1;
    ((zziw.1)localObject).<init>();
    zzMz = (zziw.zza)localObject;
  }
  
  public zziw(Context paramContext)
  {
    zzMy = zzS(paramContext);
  }
  
  private static zzl zzS(Context paramContext)
  {
    synchronized (zzqy)
    {
      Object localObject2 = zzMy;
      if (localObject2 == null)
      {
        localObject2 = paramContext.getApplicationContext();
        localObject2 = zzac.zza((Context)localObject2);
        zzMy = (zzl)localObject2;
      }
      localObject2 = zzMy;
      return (zzl)localObject2;
    }
  }
  
  public zzjg zza(String paramString, zziw.zza paramzza)
  {
    zziw.zzc localzzc = new com/google/android/gms/internal/zziw$zzc;
    localzzc.<init>(this, null);
    zzl localzzl = zzMy;
    zziw.zzb localzzb = new com/google/android/gms/internal/zziw$zzb;
    localzzb.<init>(paramString, paramzza, localzzc);
    localzzl.zze(localzzb);
    return localzzc;
  }
  
  public zzjg zzb(String paramString, Map paramMap)
  {
    zziw.zzc localzzc = new com/google/android/gms/internal/zziw$zzc;
    localzzc.<init>(this, null);
    zziw.2 local2 = new com/google/android/gms/internal/zziw$2;
    local2.<init>(this, paramString, localzzc);
    zziw.3 local3 = new com/google/android/gms/internal/zziw$3;
    local3.<init>(this, paramString, localzzc, local2, paramMap);
    zzMy.zze(local3);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */