package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzcc
  extends zzak
{
  private static final String ID = zzad.zzbP.toString();
  private static final String zzbjY = zzae.zzgm.toString();
  private static final String zzbjZ = zzae.zzgk.toString();
  
  public zzcc()
  {
    super(str, arrayOfString);
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    long l1 = 0L;
    double d1 = 0.0D;
    long l2 = 4746794007244308480L;
    double d2 = 2.147483647E9D;
    Object localObject1 = zzbjY;
    localObject1 = (zzag.zza)paramMap.get(localObject1);
    Object localObject2 = zzbjZ;
    localObject2 = (zzag.zza)paramMap.get(localObject2);
    double d3;
    double d4;
    if (localObject1 != null)
    {
      Object localObject3 = zzdf.zzHF();
      if ((localObject1 != localObject3) && (localObject2 != null))
      {
        localObject3 = zzdf.zzHF();
        if (localObject2 != localObject3)
        {
          localObject1 = zzdf.zzh((zzag.zza)localObject1);
          localObject2 = zzdf.zzh((zzag.zza)localObject2);
          localObject3 = zzdf.zzHD();
          if (localObject1 != localObject3)
          {
            localObject3 = zzdf.zzHD();
            if (localObject2 != localObject3)
            {
              d3 = ((zzde)localObject1).doubleValue();
              d4 = ((zzde)localObject2).doubleValue();
              boolean bool = d3 < d4;
              if (bool) {}
            }
          }
        }
      }
    }
    for (d2 = d3;; d2 = d1)
    {
      d3 = Math.random();
      return zzdf.zzR(Long.valueOf(Math.round((d4 - d2) * d3 + d2)));
      d4 = d2;
      l2 = l1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */