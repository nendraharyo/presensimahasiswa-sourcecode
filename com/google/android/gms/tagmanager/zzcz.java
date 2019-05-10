package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

abstract class zzcz
  extends zzca
{
  public zzcz(String paramString)
  {
    super(paramString);
  }
  
  protected boolean zza(zzag.zza paramzza1, zzag.zza paramzza2, Map paramMap)
  {
    String str1 = zzdf.zzg(paramzza1);
    String str2 = zzdf.zzg(paramzza2);
    String str3 = zzdf.zzHE();
    boolean bool;
    if (str1 != str3)
    {
      str3 = zzdf.zzHE();
      if (str2 != str3) {}
    }
    else
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      bool = zza(str1, str2, paramMap);
    }
  }
  
  protected abstract boolean zza(String paramString1, String paramString2, Map paramMap);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */