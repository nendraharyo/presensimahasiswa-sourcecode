package com.google.android.gms.nearby.messages.internal;

import android.support.v4.h.m;
import com.google.android.gms.common.api.internal.zzq;

abstract class zzm$zzg
{
  private final m zzanP;
  
  private zzm$zzg()
  {
    m localm = new android/support/v4/h/m;
    localm.<init>(1);
    this.zzanP = localm;
  }
  
  zzm.zza zzG(Object paramObject)
  {
    return (zzm.zza)this.zzanP.get(paramObject);
  }
  
  zzm.zza zzH(Object paramObject)
  {
    zzm.zza localzza = (zzm.zza)this.zzanP.remove(paramObject);
    if (localzza != null)
    {
      zzq localzzq = localzza.zzEE();
      localzzq.clear();
    }
    return localzza;
  }
  
  zzm.zza zza(zzq paramzzq, Object paramObject)
  {
    zzm.zza localzza = (zzm.zza)this.zzanP.get(paramObject);
    if (localzza != null) {
      paramzzq.clear();
    }
    for (;;)
    {
      return localzza;
      localzza = zzf(paramzzq);
      m localm = this.zzanP;
      localm.put(paramObject, localzza);
    }
  }
  
  protected abstract zzm.zza zzf(zzq paramzzq);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm$zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */