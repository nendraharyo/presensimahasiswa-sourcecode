package com.google.android.gms.internal;

import java.util.Map;

public class zzdi
  implements zzdf
{
  private final zzdj zzzy;
  
  public zzdi(zzdj paramzzdj)
  {
    this.zzzy = paramzzdj;
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = paramMap.get("transparentBackground");
    boolean bool1 = "1".equals(localObject1);
    localObject1 = paramMap.get("blur");
    boolean bool2 = "1".equals(localObject1);
    localObject1 = null;
    Object localObject2 = "blurRadius";
    try
    {
      localObject2 = paramMap.get(localObject2);
      if (localObject2 == null) {
        break label121;
      }
      localObject2 = "blurRadius";
      localObject2 = paramMap.get(localObject2);
      localObject2 = (String)localObject2;
      f = Float.parseFloat((String)localObject2);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str = "Fail to parse float";
        zzin.zzb(str, localNumberFormatException);
        Object localObject3 = null;
        float f = 0.0F;
      }
    }
    this.zzzy.zzd(bool1);
    this.zzzy.zza(bool2, f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */