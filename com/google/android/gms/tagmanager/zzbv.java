package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

abstract class zzbv
  extends zzca
{
  public zzbv(String paramString)
  {
    super(paramString);
  }
  
  protected boolean zza(zzag.zza paramzza1, zzag.zza paramzza2, Map paramMap)
  {
    zzde localzzde1 = zzdf.zzh(paramzza1);
    zzde localzzde2 = zzdf.zzh(paramzza2);
    zzde localzzde3 = zzdf.zzHD();
    boolean bool;
    if (localzzde1 != localzzde3)
    {
      localzzde3 = zzdf.zzHD();
      if (localzzde2 != localzzde3) {}
    }
    else
    {
      bool = false;
      localzzde1 = null;
    }
    for (;;)
    {
      return bool;
      bool = zza(localzzde1, localzzde2, paramMap);
    }
  }
  
  protected abstract boolean zza(zzde paramzzde1, zzde paramzzde2, Map paramMap);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzbv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */