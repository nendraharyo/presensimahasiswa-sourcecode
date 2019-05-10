package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzb;
import java.util.Map;

public class zzds
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = zzr.zzbR();
    String str = "abort";
    boolean bool1 = paramMap.containsKey(str);
    if (bool1)
    {
      bool1 = ((zzdq)localObject1).zzd(paramzzjp);
      if (!bool1)
      {
        str = "Precache abort but no preload task running.";
        zzin.zzaK(str);
      }
    }
    label187:
    for (;;)
    {
      return;
      str = (String)paramMap.get("src");
      if (str == null)
      {
        str = "Precache video action is missing the src parameter.";
        zzin.zzaK(str);
      }
      else
      {
        Object localObject2 = "player";
        try
        {
          localObject2 = paramMap.get(localObject2);
          localObject2 = (String)localObject2;
          int i = Integer.parseInt((String)localObject2);
          j = i;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          int j;
          for (;;)
          {
            boolean bool3;
            boolean bool2 = false;
            localObject3 = null;
            j = 0;
            localzzdp = null;
            continue;
            localObject3 = "";
          }
          zzb.zzv(paramzzjp.zzhR());
          localObject1 = paramzzjp.zzhR().zzpw;
          Object localObject3 = ((zzdt)localObject1).zza(paramzzjp, j, (String)localObject3);
          zzdp localzzdp = new com/google/android/gms/internal/zzdp;
          localzzdp.<init>(paramzzjp, (zzdr)localObject3, str);
          localzzdp.zzhn();
        }
        localObject2 = "mimetype";
        bool2 = paramMap.containsKey(localObject2);
        if (bool2)
        {
          localObject2 = (String)paramMap.get("mimetype");
          bool3 = ((zzdq)localObject1).zze(paramzzjp);
          if (!bool3) {
            break label187;
          }
          str = "Precache task already running.";
          zzin.zzaK(str);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzds.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */