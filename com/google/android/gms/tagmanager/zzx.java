package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class zzx
  extends zzdd
{
  private static final String ID = zzad.zzcg.toString();
  private static final String VALUE = zzae.zzih.toString();
  private static final String zzbiL = zzae.zzes.toString();
  private final DataLayer zzbhN;
  
  public zzx(DataLayer paramDataLayer)
  {
    super(str1, arrayOfString);
    this.zzbhN = paramDataLayer;
  }
  
  private void zza(zzag.zza paramzza)
  {
    Object localObject1;
    if (paramzza != null)
    {
      localObject1 = zzdf.zzHz();
      if (paramzza != localObject1) {
        break label14;
      }
    }
    for (;;)
    {
      return;
      label14:
      localObject1 = zzdf.zzg(paramzza);
      Object localObject2 = zzdf.zzHE();
      if (localObject1 != localObject2)
      {
        localObject2 = this.zzbhN;
        ((DataLayer)localObject2).zzfX((String)localObject1);
      }
    }
  }
  
  private void zzb(zzag.zza paramzza)
  {
    if (paramzza != null)
    {
      localObject = zzdf.zzHz();
      if (paramzza != localObject) {
        break label14;
      }
    }
    label14:
    boolean bool1;
    do
    {
      return;
      localObject = zzdf.zzl(paramzza);
      bool1 = localObject instanceof List;
    } while (!bool1);
    Object localObject = (List)localObject;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = localIterator.next();
      boolean bool3 = localObject instanceof Map;
      if (bool3)
      {
        localObject = (Map)localObject;
        DataLayer localDataLayer = this.zzbhN;
        localDataLayer.push((Map)localObject);
      }
    }
  }
  
  public void zzR(Map paramMap)
  {
    Object localObject = VALUE;
    localObject = (zzag.zza)paramMap.get(localObject);
    zzb((zzag.zza)localObject);
    localObject = zzbiL;
    localObject = (zzag.zza)paramMap.get(localObject);
    zza((zzag.zza)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */