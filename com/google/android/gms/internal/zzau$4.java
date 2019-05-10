package com.google.android.gms.internal;

import java.util.Map;

class zzau$4
  implements zzdf
{
  zzau$4(zzau paramzzau) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = this.zzsp;
    boolean bool = ((zzau)localObject1).zzb(paramMap);
    if (!bool) {}
    do
    {
      return;
      localObject1 = "isVisible";
      bool = paramMap.containsKey(localObject1);
    } while (!bool);
    localObject1 = "1";
    Object localObject2 = paramMap.get("isVisible");
    bool = ((String)localObject1).equals(localObject2);
    if (!bool)
    {
      localObject1 = "true";
      localObject2 = paramMap.get("isVisible");
      bool = ((String)localObject1).equals(localObject2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      localObject1 = Boolean.valueOf(bool);
      localObject2 = this.zzsp;
      bool = ((Boolean)localObject1).booleanValue();
      ((zzau)localObject2).zzg(bool);
      break;
      bool = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzau$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */