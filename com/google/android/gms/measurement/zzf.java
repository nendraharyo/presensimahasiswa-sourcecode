package com.google.android.gms.measurement;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class zzf
{
  private final zzg zzaUs;
  protected final zzc zzaUt;
  private final List zzaUu;
  
  protected zzf(zzg paramzzg, zzmq paramzzmq)
  {
    zzx.zzz(paramzzg);
    this.zzaUs = paramzzg;
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzaUu = ((List)localObject);
    localObject = new com/google/android/gms/measurement/zzc;
    ((zzc)localObject).<init>(this, paramzzmq);
    ((zzc)localObject).zzAE();
    this.zzaUt = ((zzc)localObject);
  }
  
  protected zzg zzAC()
  {
    return this.zzaUs;
  }
  
  public zzc zzAF()
  {
    return this.zzaUt;
  }
  
  public List zzAG()
  {
    return this.zzaUt.zzAw();
  }
  
  protected void zza(zzc paramzzc) {}
  
  protected void zzd(zzc paramzzc)
  {
    Object localObject = this.zzaUu;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzd)localIterator.next();
      ((zzd)localObject).zza(this, paramzzc);
    }
  }
  
  public zzc zziy()
  {
    zzc localzzc = this.zzaUt.zzAu();
    zzd(localzzc);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */