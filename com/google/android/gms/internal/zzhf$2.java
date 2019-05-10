package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;

class zzhf$2
  implements zzdf
{
  zzhf$2(zzhf paramzzhf) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = this.zzJm;
    for (;;)
    {
      Object localObject5;
      boolean bool2;
      synchronized (zzhf.zza((zzhf)localObject1))
      {
        localObject1 = this.zzJm;
        localObject1 = zzhf.zzb((zzhf)localObject1);
        boolean bool1 = ((zzjd)localObject1).isDone();
        if (bool1) {
          return;
        }
        localObject5 = new com/google/android/gms/internal/zzhi;
        int i = -2;
        ((zzhi)localObject5).<init>(i, paramMap);
        localObject1 = this.zzJm;
        localObject1 = zzhf.zzc((zzhf)localObject1);
        localObject6 = ((zzhi)localObject5).getRequestId();
        bool2 = ((String)localObject1).equals(localObject6);
        if (!bool2)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject5 = ((zzhi)localObject5).getRequestId();
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject5 = " ==== ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject5 = this.zzJm;
          localObject5 = zzhf.zzc((zzhf)localObject5);
          localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
          localObject1 = ((StringBuilder)localObject1).toString();
          zzin.zzaK((String)localObject1);
        }
      }
      Object localObject6 = ((zzhi)localObject5).getUrl();
      Object localObject3;
      if (localObject6 == null)
      {
        localObject3 = "URL missing in loadAdUrl GMSG.";
        zzin.zzaK((String)localObject3);
      }
      else
      {
        localObject3 = "%40mediation_adapters%40";
        bool2 = ((String)localObject6).contains((CharSequence)localObject3);
        if (bool2)
        {
          Object localObject7 = paramzzjp.getContext();
          localObject3 = "check_adapters";
          localObject3 = paramMap.get(localObject3);
          localObject3 = (String)localObject3;
          Object localObject8 = this.zzJm;
          localObject8 = zzhf.zzd((zzhf)localObject8);
          localObject3 = zzil.zza((Context)localObject7, (String)localObject3, (String)localObject8);
          localObject7 = "%40mediation_adapters%40";
          localObject3 = ((String)localObject6).replaceAll((String)localObject7, (String)localObject3);
          ((zzhi)localObject5).setUrl((String)localObject3);
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject7 = "Ad request URL modified to ";
          localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
          localObject3 = ((StringBuilder)localObject6).append((String)localObject3);
          localObject3 = ((StringBuilder)localObject3).toString();
          zzin.v((String)localObject3);
        }
        localObject3 = this.zzJm;
        localObject3 = zzhf.zzb((zzhf)localObject3);
        ((zzjd)localObject3).zzg(localObject5);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhf$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */