package com.google.android.gms.internal;

import java.util.Map;

class zzeg$1$3
  implements zzdf
{
  zzeg$1$3(zzeg.1 param1, zzed paramzzed, zzja paramzzja) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = zzeg.zzc(this.zzBg.zzBe);
    Object localObject2 = "JS Engine is requesting an update";
    try
    {
      zzin.zzaJ((String)localObject2);
      localObject2 = this.zzBg;
      localObject2 = ((zzeg.1)localObject2).zzBe;
      int i = zzeg.zze((zzeg)localObject2);
      if (i == 0)
      {
        localObject2 = "Starting reload.";
        zzin.zzaJ((String)localObject2);
        localObject2 = this.zzBg;
        localObject2 = ((zzeg.1)localObject2).zzBe;
        int j = 2;
        zzeg.zza((zzeg)localObject2, j);
        localObject2 = this.zzBg;
        localObject2 = ((zzeg.1)localObject2).zzBe;
        ((zzeg)localObject2).zzeq();
      }
      zzed localzzed = this.zzBf;
      String str = "/requestReload";
      localObject2 = this.zzBj;
      localObject2 = ((zzja)localObject2).get();
      localObject2 = (zzdf)localObject2;
      localzzed.zzb(str, (zzdf)localObject2);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeg$1$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */