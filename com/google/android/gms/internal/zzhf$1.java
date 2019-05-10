package com.google.android.gms.internal;

import java.util.Map;

class zzhf$1
  implements zzdf
{
  zzhf$1(zzhf paramzzhf) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = this.zzJm;
    for (;;)
    {
      synchronized (zzhf.zza((zzhf)localObject1))
      {
        localObject1 = this.zzJm;
        localObject1 = zzhf.zzb((zzhf)localObject1);
        boolean bool = ((zzjd)localObject1).isDone();
        if (bool) {
          return;
        }
        localObject1 = this.zzJm;
        localObject1 = zzhf.zzc((zzhf)localObject1);
        localObject4 = "request_id";
        localObject4 = paramMap.get(localObject4);
        bool = ((String)localObject1).equals(localObject4);
        if (bool) {}
      }
      zzhi localzzhi = new com/google/android/gms/internal/zzhi;
      int i = 1;
      localzzhi.<init>(i, paramMap);
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      Object localObject5 = "Invalid ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject5 = localzzhi.getType();
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject5 = " request error: ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject5 = localzzhi.zzgE();
      localObject4 = ((StringBuilder)localObject4).append(localObject5);
      localObject4 = ((StringBuilder)localObject4).toString();
      zzin.zzaK((String)localObject4);
      localObject4 = this.zzJm;
      localObject4 = zzhf.zzb((zzhf)localObject4);
      ((zzjd)localObject4).zzg(localzzhi);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhf$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */