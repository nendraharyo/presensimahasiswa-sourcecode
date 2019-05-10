package com.google.android.gms.tagmanager;

import android.util.LruCache;

class zzba
  implements zzl
{
  private LruCache zzbjq;
  
  zzba(int paramInt, zzm.zza paramzza)
  {
    zzba.1 local1 = new com/google/android/gms/tagmanager/zzba$1;
    local1.<init>(this, paramInt, paramzza);
    this.zzbjq = local1;
  }
  
  public Object get(Object paramObject)
  {
    return this.zzbjq.get(paramObject);
  }
  
  public void zzh(Object paramObject1, Object paramObject2)
  {
    this.zzbjq.put(paramObject1, paramObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzba.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */