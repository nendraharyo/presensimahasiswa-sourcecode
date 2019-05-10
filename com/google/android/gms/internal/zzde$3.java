package com.google.android.gms.internal;

import java.util.Map;

final class zzde$3
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject = (Boolean)zzbt.zzwT.get();
    boolean bool = ((Boolean)localObject).booleanValue();
    if (!bool) {
      return;
    }
    localObject = (String)paramMap.get("disabled");
    bool = Boolean.parseBoolean((String)localObject);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      paramzzjp.zzF(bool);
      break;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzde$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */