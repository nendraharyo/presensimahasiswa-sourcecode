package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zza.zzb;

abstract class zzbo$zzb
  extends zza
{
  private zza.zzb zzUz;
  
  public zzbo$zzb(zza.zzb paramzzb)
  {
    this.zzUz = paramzzb;
  }
  
  public void zzX(Object paramObject)
  {
    zza.zzb localzzb = this.zzUz;
    if (localzzb != null)
    {
      localzzb.zzs(paramObject);
      localzzb = null;
      this.zzUz = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */