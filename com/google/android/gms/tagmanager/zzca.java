package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class zzca
  extends zzak
{
  private static final String zzbiQ = zzae.zzdV.toString();
  private static final String zzbjO = zzae.zzdW.toString();
  
  public zzca(String paramString)
  {
    super(paramString, arrayOfString);
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject1 = paramMap.values();
    Object localObject2 = ((Collection)localObject1).iterator();
    boolean bool;
    zzag.zza localzza;
    do
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (zzag.zza)((Iterator)localObject2).next();
      localzza = zzdf.zzHF();
    } while (localObject1 != localzza);
    localObject1 = zzdf.zzR(Boolean.valueOf(false));
    return (zzag.zza)localObject1;
    localObject1 = zzbiQ;
    localObject1 = (zzag.zza)paramMap.get(localObject1);
    localObject2 = zzbjO;
    localObject2 = (zzag.zza)paramMap.get(localObject2);
    if ((localObject1 == null) || (localObject2 == null))
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      localObject1 = zzdf.zzR(Boolean.valueOf(bool));
      break;
      bool = zza((zzag.zza)localObject1, (zzag.zza)localObject2, paramMap);
    }
  }
  
  protected abstract boolean zza(zzag.zza paramzza1, zzag.zza paramzza2, Map paramMap);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzca.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */