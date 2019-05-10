package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;

class zzcp$zzb
{
  private zzbw zzbkH;
  private zzag.zza zzbkI;
  
  public zzcp$zzb(zzbw paramzzbw, zzag.zza paramzza)
  {
    this.zzbkH = paramzzbw;
    this.zzbkI = paramzza;
  }
  
  public int getSize()
  {
    int i = ((zzag.zza)this.zzbkH.getObject()).getCachedSize();
    zzag.zza localzza = this.zzbkI;
    int j;
    if (localzza == null)
    {
      j = 0;
      localzza = null;
    }
    for (;;)
    {
      return j + i;
      localzza = this.zzbkI;
      j = localzza.getCachedSize();
    }
  }
  
  public zzbw zzHg()
  {
    return this.zzbkH;
  }
  
  public zzag.zza zzHh()
  {
    return this.zzbkI;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcp$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */