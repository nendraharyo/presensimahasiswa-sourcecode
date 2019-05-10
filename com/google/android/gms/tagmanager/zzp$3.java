package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzmq;

class zzp$3
  implements zzp.zza
{
  zzp$3(zzp paramzzp, boolean paramBoolean) {}
  
  public boolean zzb(Container paramContainer)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzbin;
    if (bool2)
    {
      long l1 = paramContainer.getLastRefreshTime() + 43200000L;
      zzmq localzzmq = zzp.zzc(this.zzbim);
      long l2 = localzzmq.currentTimeMillis();
      bool2 = l1 < l2;
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      bool2 = paramContainer.isDefault();
      if (bool2) {
        bool1 = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzp$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */