package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqb.zzb;
import com.google.android.gms.internal.zzqb.zze;
import java.util.ArrayList;
import java.util.List;

class zzw$zza
  implements zze.zzb
{
  zzqb.zze zzaYt;
  List zzaYu;
  long zzaYv;
  List zzpH;
  
  private zzw$zza(zzw paramzzw) {}
  
  private long zza(zzqb.zzb paramzzb)
  {
    long l = 60;
    return paramzzb.zzbaf.longValue() / 1000L / l / l;
  }
  
  boolean isEmpty()
  {
    List localList = this.zzpH;
    boolean bool;
    if (localList != null)
    {
      localList = this.zzpH;
      bool = localList.isEmpty();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  public boolean zza(long paramLong, zzqb.zzb paramzzb)
  {
    zzx.zzz(paramzzb);
    Object localObject1 = this.zzpH;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.zzpH = ((List)localObject1);
    }
    localObject1 = this.zzaYu;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.zzaYu = ((List)localObject1);
    }
    localObject1 = this.zzpH;
    int i = ((List)localObject1).size();
    long l1;
    long l2;
    boolean bool;
    if (i > 0)
    {
      localObject1 = (zzqb.zzb)this.zzpH.get(0);
      l1 = zza((zzqb.zzb)localObject1);
      l2 = zza(paramzzb);
      bool = l1 < l2;
      if (bool)
      {
        bool = false;
        localObject1 = null;
      }
    }
    for (;;)
    {
      return bool;
      l1 = this.zzaYv;
      l2 = paramzzb.getSerializedSize();
      l1 += l2;
      localObject1 = this.zzaYs.zzCp();
      l2 = ((zzd)localObject1).zzBT();
      bool = l1 < l2;
      if (!bool)
      {
        bool = false;
        localObject1 = null;
      }
      else
      {
        this.zzaYv = l1;
        this.zzpH.add(paramzzb);
        localObject1 = this.zzaYu;
        Object localObject2 = Long.valueOf(paramLong);
        ((List)localObject1).add(localObject2);
        localObject1 = this.zzpH;
        int j = ((List)localObject1).size();
        localObject2 = this.zzaYs.zzCp();
        int k = ((zzd)localObject2).zzBU();
        if (j >= k)
        {
          j = 0;
          localObject1 = null;
        }
        else
        {
          j = 1;
        }
      }
    }
  }
  
  public void zzc(zzqb.zze paramzze)
  {
    zzx.zzz(paramzze);
    this.zzaYt = paramzze;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */