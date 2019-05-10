package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzt
  extends zzak
{
  private static final String ID = zzad.zzbJ.toString();
  private static final String zzbhF = zzae.zzdI.toString();
  private static final String zzbip = zzae.zzfH.toString();
  private final zzt.zza zzbiq;
  
  public zzt(zzt.zza paramzza)
  {
    super(str1, arrayOfString);
    this.zzbiq = paramzza;
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject1 = zzbip;
    Object localObject3 = zzdf.zzg((zzag.zza)paramMap.get(localObject1));
    Object localObject4 = new java/util/HashMap;
    ((HashMap)localObject4).<init>();
    localObject1 = zzbhF;
    localObject1 = (zzag.zza)paramMap.get(localObject1);
    if (localObject1 != null)
    {
      localObject1 = zzdf.zzl((zzag.zza)localObject1);
      boolean bool1 = localObject1 instanceof Map;
      if (!bool1)
      {
        zzbg.zzaK("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
        localObject1 = zzdf.zzHF();
      }
    }
    for (;;)
    {
      return (zzag.zza)localObject1;
      localObject1 = ((Map)localObject1).entrySet();
      Object localObject5 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject5).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject5).next();
        String str = ((Map.Entry)localObject1).getKey().toString();
        localObject1 = ((Map.Entry)localObject1).getValue();
        ((Map)localObject4).put(str, localObject1);
      }
      try
      {
        localObject1 = this.zzbiq;
        localObject1 = ((zzt.zza)localObject1).zzc((String)localObject3, (Map)localObject4);
        localObject1 = zzdf.zzR(localObject1);
      }
      catch (Exception localException)
      {
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = "Custom macro/tag ";
        localObject3 = ((StringBuilder)localObject4).append((String)localObject5).append((String)localObject3);
        localObject4 = " threw exception ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        Object localObject2 = localException.getMessage();
        zzbg.zzaK((String)localObject2);
        localObject2 = zzdf.zzHF();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */