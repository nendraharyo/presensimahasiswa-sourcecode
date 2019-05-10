package com.google.android.gms.measurement;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzc
{
  private final zzf zzaUi;
  private boolean zzaUj;
  private long zzaUk;
  private long zzaUl;
  private long zzaUm;
  private long zzaUn;
  private long zzaUo;
  private boolean zzaUp;
  private final Map zzaUq;
  private final List zzaUr;
  private final zzmq zzqW;
  
  zzc(zzc paramzzc)
  {
    Object localObject1 = paramzzc.zzaUi;
    this.zzaUi = ((zzf)localObject1);
    localObject1 = paramzzc.zzqW;
    this.zzqW = ((zzmq)localObject1);
    long l = paramzzc.zzaUk;
    this.zzaUk = l;
    l = paramzzc.zzaUl;
    this.zzaUl = l;
    l = paramzzc.zzaUm;
    this.zzaUm = l;
    l = paramzzc.zzaUn;
    this.zzaUn = l;
    l = paramzzc.zzaUo;
    this.zzaUo = l;
    localObject1 = new java/util/ArrayList;
    Object localObject2 = paramzzc.zzaUr;
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    this.zzaUr = ((List)localObject1);
    localObject1 = new java/util/HashMap;
    localObject2 = paramzzc.zzaUq;
    int i = ((Map)localObject2).size();
    ((HashMap)localObject1).<init>(i);
    this.zzaUq = ((Map)localObject1);
    localObject1 = paramzzc.zzaUq.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      zze localzze = zzg((Class)((Map.Entry)localObject1).getKey());
      ((zze)((Map.Entry)localObject1).getValue()).zza(localzze);
      localObject2 = this.zzaUq;
      localObject1 = ((Map.Entry)localObject1).getKey();
      ((Map)localObject2).put(localObject1, localzze);
    }
  }
  
  zzc(zzf paramzzf, zzmq paramzzmq)
  {
    zzx.zzz(paramzzf);
    zzx.zzz(paramzzmq);
    this.zzaUi = paramzzf;
    this.zzqW = paramzzmq;
    this.zzaUn = 1800000L;
    this.zzaUo = 3024000000L;
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzaUq = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzaUr = ((List)localObject);
  }
  
  private static zze zzg(Class paramClass)
  {
    try
    {
      Object localObject = paramClass.newInstance();
      return (zze)localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("dataType doesn't have default constructor", localInstantiationException);
      throw localIllegalArgumentException;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("dataType default constructor is not accessible", localIllegalAccessException);
      throw localIllegalArgumentException;
    }
  }
  
  void zzAA()
  {
    zzmq localzzmq = this.zzqW;
    long l1 = localzzmq.elapsedRealtime();
    this.zzaUm = l1;
    l1 = this.zzaUl;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool) {
      l1 = this.zzaUl;
    }
    for (this.zzaUk = l1;; this.zzaUk = l1)
    {
      this.zzaUj = true;
      return;
      localzzmq = this.zzqW;
      l1 = localzzmq.currentTimeMillis();
    }
  }
  
  zzf zzAB()
  {
    return this.zzaUi;
  }
  
  zzg zzAC()
  {
    return this.zzaUi.zzAC();
  }
  
  boolean zzAD()
  {
    return this.zzaUp;
  }
  
  void zzAE()
  {
    this.zzaUp = true;
  }
  
  public zzc zzAu()
  {
    zzc localzzc = new com/google/android/gms/measurement/zzc;
    localzzc.<init>(this);
    return localzzc;
  }
  
  public Collection zzAv()
  {
    return this.zzaUq.values();
  }
  
  public List zzAw()
  {
    return this.zzaUr;
  }
  
  public long zzAx()
  {
    return this.zzaUk;
  }
  
  public void zzAy()
  {
    zzAC().zze(this);
  }
  
  public boolean zzAz()
  {
    return this.zzaUj;
  }
  
  public void zzM(long paramLong)
  {
    this.zzaUl = paramLong;
  }
  
  public void zzb(zze paramzze)
  {
    zzx.zzz(paramzze);
    Object localObject = paramzze.getClass();
    Class localClass1 = ((Class)localObject).getSuperclass();
    Class localClass2 = zze.class;
    if (localClass1 != localClass2)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = zzf((Class)localObject);
    paramzze.zza((zze)localObject);
  }
  
  public zze zze(Class paramClass)
  {
    return (zze)this.zzaUq.get(paramClass);
  }
  
  public zze zzf(Class paramClass)
  {
    zze localzze = (zze)this.zzaUq.get(paramClass);
    if (localzze == null)
    {
      localzze = zzg(paramClass);
      Map localMap = this.zzaUq;
      localMap.put(paramClass, localzze);
    }
    return localzze;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */