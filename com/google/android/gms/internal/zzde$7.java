package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzd;
import java.util.Map;

final class zzde$7
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject = paramzzjp.zzhS();
    if (localObject != null) {
      ((zzd)localObject).close();
    }
    for (;;)
    {
      return;
      localObject = paramzzjp.zzhT();
      if (localObject != null)
      {
        ((zzd)localObject).close();
      }
      else
      {
        localObject = "A GMSG tried to close something that wasn't an overlay.";
        zzin.zzaK((String)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzde$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */