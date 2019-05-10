package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class zzdq
  implements Iterable
{
  private final List zzzM;
  
  public zzdq()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    this.zzzM = localLinkedList;
  }
  
  private zzdp zzf(zzjp paramzzjp)
  {
    Object localObject = zzr.zzbR();
    Iterator localIterator = ((zzdq)localObject).iterator();
    boolean bool;
    zzjp localzzjp;
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzdp)localIterator.next();
      localzzjp = ((zzdp)localObject).zzpD;
    } while (localzzjp != paramzzjp);
    for (;;)
    {
      return (zzdp)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  public Iterator iterator()
  {
    return this.zzzM.iterator();
  }
  
  public void zza(zzdp paramzzdp)
  {
    this.zzzM.add(paramzzdp);
  }
  
  public void zzb(zzdp paramzzdp)
  {
    this.zzzM.remove(paramzzdp);
  }
  
  public boolean zzd(zzjp paramzzjp)
  {
    Object localObject = zzf(paramzzjp);
    boolean bool;
    if (localObject != null)
    {
      localObject = ((zzdp)localObject).zzzJ;
      ((zzdr)localObject).abort();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean zze(zzjp paramzzjp)
  {
    zzdp localzzdp = zzf(paramzzjp);
    boolean bool;
    if (localzzdp != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzdp = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */