package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzaf.zzc;
import com.google.android.gms.internal.zzaf.zzd;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzaj
{
  private static void zza(DataLayer paramDataLayer, zzaf.zzd paramzzd)
  {
    zzag.zza[] arrayOfzza = paramzzd.zziD;
    int i = arrayOfzza.length;
    int j = 0;
    while (j < i)
    {
      String str = zzdf.zzg(arrayOfzza[j]);
      paramDataLayer.zzfX(str);
      j += 1;
    }
  }
  
  public static void zza(DataLayer paramDataLayer, zzaf.zzi paramzzi)
  {
    Object localObject = paramzzi.zzjs;
    if (localObject == null)
    {
      localObject = "supplemental missing experimentSupplemental";
      zzbg.zzaK((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = paramzzi.zzjs;
      zza(paramDataLayer, (zzaf.zzd)localObject);
      localObject = paramzzi.zzjs;
      zzb(paramDataLayer, (zzaf.zzd)localObject);
      localObject = paramzzi.zzjs;
      zzc(paramDataLayer, (zzaf.zzd)localObject);
    }
  }
  
  private static void zzb(DataLayer paramDataLayer, zzaf.zzd paramzzd)
  {
    zzag.zza[] arrayOfzza = paramzzd.zziC;
    int i = arrayOfzza.length;
    int j = 0;
    while (j < i)
    {
      Map localMap = zzc(arrayOfzza[j]);
      if (localMap != null) {
        paramDataLayer.push(localMap);
      }
      j += 1;
    }
  }
  
  private static Map zzc(zzag.zza paramzza)
  {
    Object localObject1 = zzdf.zzl(paramzza);
    boolean bool = localObject1 instanceof Map;
    if (!bool)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "value: ";
      localObject1 = ((StringBuilder)localObject2).append(str).append(localObject1);
      localObject2 = " is not a map value, ignored.";
      zzbg.zzaK((String)localObject2);
    }
    for (localObject1 = null;; localObject1 = (Map)localObject1) {
      return (Map)localObject1;
    }
  }
  
  private static void zzc(DataLayer paramDataLayer, zzaf.zzd paramzzd)
  {
    zzaf.zzc[] arrayOfzzc = paramzzd.zziE;
    int i = arrayOfzzc.length;
    int j = 0;
    while (j < i)
    {
      Object localObject1 = arrayOfzzc[j];
      Object localObject2 = ((zzaf.zzc)localObject1).key;
      if (localObject2 == null)
      {
        localObject2 = "GaExperimentRandom: No key";
        zzbg.zzaK((String)localObject2);
        int k = j + 1;
        j = k;
      }
      else
      {
        localObject2 = ((zzaf.zzc)localObject1).key;
        Object localObject3 = paramDataLayer.get((String)localObject2);
        boolean bool1 = localObject3 instanceof Number;
        label90:
        long l1;
        label221:
        Object localObject4;
        if (!bool1)
        {
          bool1 = false;
          localObject2 = null;
          l1 = ((zzaf.zzc)localObject1).zziy;
          long l2 = ((zzaf.zzc)localObject1).zziz;
          boolean bool2 = ((zzaf.zzc)localObject1).zziA;
          if ((bool2) && (localObject2 != null))
          {
            long l3 = ((Long)localObject2).longValue();
            bool2 = l3 < l1;
            if (!bool2)
            {
              l3 = ((Long)localObject2).longValue();
              bool1 = l3 < l2;
              if (!bool1) {
                break label221;
              }
            }
          }
          bool1 = l1 < l2;
          if (bool1) {
            break label396;
          }
          double d1 = Math.random();
          l2 -= l1;
          double d2 = l2;
          d1 *= d2;
          double d3 = l1;
          d1 += d3;
          long l4 = Math.round(d1);
          localObject3 = Long.valueOf(l4);
          localObject2 = ((zzaf.zzc)localObject1).key;
          paramDataLayer.zzfX((String)localObject2);
          localObject2 = ((zzaf.zzc)localObject1).key;
          localObject3 = paramDataLayer.zzn((String)localObject2, localObject3);
          l1 = ((zzaf.zzc)localObject1).zziB;
          l2 = 0L;
          d2 = 0.0D;
          bool1 = l1 < l2;
          if (bool1)
          {
            localObject2 = "gtm";
            bool1 = ((Map)localObject3).containsKey(localObject2);
            if (bool1) {
              break label408;
            }
            localObject2 = "gtm";
            int m = 2;
            localObject4 = new Object[m];
            String str = "lifetime";
            localObject4[0] = str;
            int n = 1;
            l2 = ((zzaf.zzc)localObject1).zziB;
            localObject1 = Long.valueOf(l2);
            localObject4[n] = localObject1;
            localObject1 = DataLayer.mapOf((Object[])localObject4);
            ((Map)localObject3).put(localObject2, localObject1);
          }
        }
        for (;;)
        {
          paramDataLayer.push((Map)localObject3);
          break;
          localObject2 = localObject3;
          l1 = ((Number)localObject3).longValue();
          localObject2 = Long.valueOf(l1);
          break label90;
          label396:
          localObject2 = "GaExperimentRandom: random range invalid";
          zzbg.zzaK((String)localObject2);
          break;
          label408:
          localObject2 = ((Map)localObject3).get("gtm");
          boolean bool3 = localObject2 instanceof Map;
          if (bool3)
          {
            localObject2 = (Map)localObject2;
            localObject4 = "lifetime";
            l1 = ((zzaf.zzc)localObject1).zziB;
            localObject1 = Long.valueOf(l1);
            ((Map)localObject2).put(localObject4, localObject1);
          }
          else
          {
            localObject2 = "GaExperimentRandom: gtm not a map";
            zzbg.zzaK((String)localObject2);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzaj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */