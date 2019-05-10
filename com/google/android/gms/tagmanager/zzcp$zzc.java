package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzrs.zza;
import com.google.android.gms.internal.zzrs.zze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class zzcp$zzc
{
  private final Map zzbkJ;
  private final Map zzbkK;
  private final Map zzbkL;
  private final Map zzbkM;
  private zzrs.zza zzbkN;
  private final Set zzbky;
  
  public zzcp$zzc()
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzbky = ((Set)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbkJ = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbkL = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbkK = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbkM = ((Map)localObject);
  }
  
  public Set zzHi()
  {
    return this.zzbky;
  }
  
  public Map zzHj()
  {
    return this.zzbkJ;
  }
  
  public Map zzHk()
  {
    return this.zzbkL;
  }
  
  public Map zzHl()
  {
    return this.zzbkM;
  }
  
  public Map zzHm()
  {
    return this.zzbkK;
  }
  
  public zzrs.zza zzHn()
  {
    return this.zzbkN;
  }
  
  public void zza(zzrs.zze paramzze)
  {
    this.zzbky.add(paramzze);
  }
  
  public void zza(zzrs.zze paramzze, zzrs.zza paramzza)
  {
    Object localObject = (List)this.zzbkJ.get(paramzze);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      Map localMap = this.zzbkJ;
      localMap.put(paramzze, localObject);
    }
    ((List)localObject).add(paramzza);
  }
  
  public void zza(zzrs.zze paramzze, String paramString)
  {
    Object localObject = (List)this.zzbkL.get(paramzze);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      Map localMap = this.zzbkL;
      localMap.put(paramzze, localObject);
    }
    ((List)localObject).add(paramString);
  }
  
  public void zzb(zzrs.zza paramzza)
  {
    this.zzbkN = paramzza;
  }
  
  public void zzb(zzrs.zze paramzze, zzrs.zza paramzza)
  {
    Object localObject = (List)this.zzbkK.get(paramzze);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      Map localMap = this.zzbkK;
      localMap.put(paramzze, localObject);
    }
    ((List)localObject).add(paramzza);
  }
  
  public void zzb(zzrs.zze paramzze, String paramString)
  {
    Object localObject = (List)this.zzbkM.get(paramzze);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      Map localMap = this.zzbkM;
      localMap.put(paramzze, localObject);
    }
    ((List)localObject).add(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcp$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */