package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

class zzjq$zzd
  implements zzdf
{
  private zzjq$zzd(zzjq paramzzjq) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject = paramMap.keySet();
    String str = "start";
    boolean bool = ((Set)localObject).contains(str);
    if (bool)
    {
      localObject = this.zzNL;
      zzjq.zza((zzjq)localObject);
    }
    for (;;)
    {
      return;
      localObject = paramMap.keySet();
      str = "stop";
      bool = ((Set)localObject).contains(str);
      if (bool)
      {
        localObject = this.zzNL;
        zzjq.zzb((zzjq)localObject);
      }
      else
      {
        localObject = paramMap.keySet();
        str = "cancel";
        bool = ((Set)localObject).contains(str);
        if (bool)
        {
          localObject = this.zzNL;
          zzjq.zzc((zzjq)localObject);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjq$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */