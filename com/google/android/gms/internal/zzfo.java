package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

public class zzfo
{
  private final boolean zzDp;
  private final String zzDq;
  private final zzjp zzpD;
  
  public zzfo(zzjp paramzzjp, Map paramMap)
  {
    this.zzpD = paramzzjp;
    String str = (String)paramMap.get("forceOrientation");
    this.zzDq = str;
    str = "allowOrientationChange";
    boolean bool = paramMap.containsKey(str);
    if (bool)
    {
      str = (String)paramMap.get("allowOrientationChange");
      bool = Boolean.parseBoolean(str);
    }
    for (this.zzDp = bool;; this.zzDp = bool)
    {
      return;
      bool = true;
    }
  }
  
  public void execute()
  {
    Object localObject1 = this.zzpD;
    if (localObject1 == null)
    {
      localObject1 = "AdWebView is null";
      zzin.zzaK((String)localObject1);
      return;
    }
    localObject1 = "portrait";
    Object localObject2 = this.zzDq;
    boolean bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    int i;
    if (bool1)
    {
      localObject1 = zzr.zzbE();
      i = ((zzis)localObject1).zzhw();
    }
    for (;;)
    {
      localObject2 = this.zzpD;
      ((zzjp)localObject2).setRequestedOrientation(i);
      break;
      localObject1 = "landscape";
      localObject2 = this.zzDq;
      boolean bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (bool2)
      {
        localObject1 = zzr.zzbE();
        int j = ((zzis)localObject1).zzhv();
      }
      else
      {
        boolean bool3 = this.zzDp;
        int k;
        if (bool3)
        {
          k = -1;
        }
        else
        {
          localObject1 = zzr.zzbE();
          k = ((zzis)localObject1).zzhx();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */