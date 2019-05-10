package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class zzbq
{
  private final Collection zzvu;
  private final Collection zzvv;
  private final Collection zzvw;
  
  public zzbq()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzvu = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzvv = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzvw = localArrayList;
  }
  
  public void zza(zzbp paramzzbp)
  {
    this.zzvu.add(paramzzbp);
  }
  
  public void zzb(zzbp paramzzbp)
  {
    this.zzvv.add(paramzzbp);
  }
  
  public void zzc(zzbp paramzzbp)
  {
    this.zzvw.add(paramzzbp);
  }
  
  public List zzdr()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.zzvv;
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)((zzbp)localIterator.next()).get();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public List zzds()
  {
    List localList = zzdr();
    Object localObject = this.zzvw;
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)((zzbp)localIterator.next()).get();
      if (localObject != null) {
        localList.add(localObject);
      }
    }
    return localList;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */