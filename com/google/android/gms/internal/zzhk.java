package com.google.android.gms.internal;

import android.content.Context;
import java.util.WeakHashMap;

public final class zzhk
{
  private WeakHashMap zzKm;
  
  public zzhk()
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    this.zzKm = localWeakHashMap;
  }
  
  public zzhj zzE(Context paramContext)
  {
    Object localObject1 = (zzhk.zza)this.zzKm.get(paramContext);
    Object localObject2;
    if (localObject1 != null)
    {
      boolean bool = ((zzhk.zza)localObject1).hasExpired();
      if (!bool)
      {
        localObject2 = (Boolean)zzbt.zzwL.get();
        bool = ((Boolean)localObject2).booleanValue();
        if (bool)
        {
          localObject2 = new com/google/android/gms/internal/zzhj$zza;
          localObject1 = ((zzhk.zza)localObject1).zzKo;
          ((zzhj.zza)localObject2).<init>(paramContext, (zzhj)localObject1);
        }
      }
    }
    for (localObject1 = ((zzhj.zza)localObject2).zzgI();; localObject1 = ((zzhj.zza)localObject1).zzgI())
    {
      localObject2 = this.zzKm;
      zzhk.zza localzza = new com/google/android/gms/internal/zzhk$zza;
      localzza.<init>(this, (zzhj)localObject1);
      ((WeakHashMap)localObject2).put(paramContext, localzza);
      return (zzhj)localObject1;
      localObject1 = new com/google/android/gms/internal/zzhj$zza;
      ((zzhj.zza)localObject1).<init>(paramContext);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */