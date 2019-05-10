package com.google.android.gms.internal;

import java.util.Map;

final class zzde$2
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("tx");
    String str3 = (String)paramMap.get("ty");
    String str4 = (String)paramMap.get("td");
    try
    {
      int i = Integer.parseInt(str1);
      int j = Integer.parseInt(str3);
      int k = Integer.parseInt(str4);
      Object localObject = paramzzjp.zzhW();
      if (localObject != null)
      {
        localObject = ((zzan)localObject).zzab();
        ((zzaj)localObject).zza(i, j, k);
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str2 = "Could not parse touch parameters from gmsg.";
        zzin.zzaK(str2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzde$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */