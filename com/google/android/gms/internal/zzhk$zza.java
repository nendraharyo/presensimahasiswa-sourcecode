package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;

class zzhk$zza
{
  public final long zzKn;
  public final zzhj zzKo;
  
  public zzhk$zza(zzhk paramzzhk, zzhj paramzzhj)
  {
    long l = zzr.zzbG().currentTimeMillis();
    this.zzKn = l;
    this.zzKo = paramzzhj;
  }
  
  public boolean hasExpired()
  {
    long l1 = this.zzKn;
    Long localLong = (Long)zzbt.zzwM.get();
    long l2 = localLong.longValue() + l1;
    zzmq localzzmq = zzr.zzbG();
    l1 = localzzmq.currentTimeMillis();
    boolean bool = l2 < l1;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLong = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */