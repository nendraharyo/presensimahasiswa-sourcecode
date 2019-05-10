package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class zzbd
{
  private final Object zzpV;
  private int zzsW;
  private List zzsX;
  
  public zzbd()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.zzsX = ((List)localObject);
  }
  
  public boolean zza(zzbc paramzzbc)
  {
    synchronized (this.zzpV)
    {
      List localList = this.zzsX;
      boolean bool = localList.contains(paramzzbc);
      if (bool)
      {
        bool = true;
        return bool;
      }
      bool = false;
      localList = null;
    }
  }
  
  public boolean zzb(zzbc paramzzbc)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsX;
      Iterator localIterator = ((List)localObject2).iterator();
      do
      {
        do
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (zzbc)localObject2;
        } while (paramzzbc == localObject2);
        localObject2 = ((zzbc)localObject2).zzcy();
        String str = paramzzbc.zzcy();
        bool = ((String)localObject2).equals(str);
      } while (!bool);
      localIterator.remove();
      boolean bool = true;
      return bool;
      bool = false;
      localObject2 = null;
    }
  }
  
  public void zzc(zzbc paramzzbc)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsX;
      int i = ((List)localObject2).size();
      int j = 10;
      if (i >= j)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject4 = "Queue is full, current size = ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject4 = this.zzsX;
        j = ((List)localObject4).size();
        localObject2 = ((StringBuilder)localObject2).append(j);
        localObject2 = ((StringBuilder)localObject2).toString();
        zzin.zzaI((String)localObject2);
        localObject2 = this.zzsX;
        j = 0;
        localObject4 = null;
        ((List)localObject2).remove(0);
      }
      i = this.zzsW;
      j = i + 1;
      this.zzsW = j;
      paramzzbc.zzh(i);
      localObject2 = this.zzsX;
      ((List)localObject2).add(paramzzbc);
      return;
    }
  }
  
  public zzbc zzcF()
  {
    Object localObject1 = null;
    for (;;)
    {
      int m;
      synchronized (this.zzpV)
      {
        Object localObject3 = this.zzsX;
        int i = ((List)localObject3).size();
        if (i == 0)
        {
          localObject3 = "Queue empty";
          zzin.zzaI((String)localObject3);
          return (zzbc)localObject1;
        }
        localObject3 = this.zzsX;
        i = ((List)localObject3).size();
        k = 2;
        if (i >= k)
        {
          m = -1 << -1;
          localObject3 = this.zzsX;
          Iterator localIterator = ((List)localObject3).iterator();
          j = localIterator.hasNext();
          if (j != 0)
          {
            localObject3 = localIterator.next();
            localObject3 = (zzbc)localObject3;
            k = ((zzbc)localObject3).getScore();
            if (k <= m) {
              break label194;
            }
            localObject6 = localObject3;
            j = k;
            m = j;
            localObject1 = localObject6;
            continue;
          }
          localObject3 = this.zzsX;
          ((List)localObject3).remove(localObject1);
        }
      }
      Object localObject5 = this.zzsX;
      int k = 0;
      Object localObject6 = null;
      localObject5 = ((List)localObject5).get(0);
      localObject5 = (zzbc)localObject5;
      ((zzbc)localObject5).zzcA();
      localObject1 = localObject5;
      continue;
      label194:
      int j = m;
      localObject6 = localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */