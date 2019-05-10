package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class zzcb
{
  private final Object zzpV;
  private final Map zzxA;
  private String zzxB;
  private zzbz zzxC;
  private zzcb zzxD;
  boolean zzxi;
  private final List zzxz;
  
  public zzcb(boolean paramBoolean, String paramString1, String paramString2)
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.zzxz = ((List)localObject);
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    this.zzxA = ((Map)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzxi = paramBoolean;
    this.zzxA.put("action", paramString1);
    this.zzxA.put("ad_format", paramString2);
  }
  
  public void zzN(String paramString)
  {
    boolean bool = this.zzxi;
    if (!bool) {}
    for (;;)
    {
      return;
      synchronized (this.zzpV)
      {
        this.zzxB = paramString;
      }
    }
  }
  
  public boolean zza(zzbz paramzzbz, long paramLong, String... paramVarArgs)
  {
    synchronized (this.zzpV)
    {
      int i = paramVarArgs.length;
      int j = 0;
      Object localObject2 = null;
      while (j < i)
      {
        Object localObject4 = paramVarArgs[j];
        zzbz localzzbz = new com/google/android/gms/internal/zzbz;
        localzzbz.<init>(paramLong, (String)localObject4, paramzzbz);
        localObject4 = this.zzxz;
        ((List)localObject4).add(localzzbz);
        j += 1;
      }
      j = 1;
      return j;
    }
  }
  
  public boolean zza(zzbz paramzzbz, String... paramVarArgs)
  {
    boolean bool = this.zzxi;
    zzmq localzzmq;
    if ((!bool) || (paramzzbz == null))
    {
      bool = false;
      localzzmq = null;
    }
    for (;;)
    {
      return bool;
      localzzmq = zzr.zzbG();
      long l = localzzmq.elapsedRealtime();
      bool = zza(paramzzbz, l, paramVarArgs);
    }
  }
  
  public zzbz zzb(long paramLong)
  {
    Object localObject = null;
    boolean bool = this.zzxi;
    if (!bool) {}
    for (;;)
    {
      return (zzbz)localObject;
      zzbz localzzbz = new com/google/android/gms/internal/zzbz;
      localzzbz.<init>(paramLong, null, null);
      localObject = localzzbz;
    }
  }
  
  public void zzc(zzcb paramzzcb)
  {
    synchronized (this.zzpV)
    {
      this.zzxD = paramzzcb;
      return;
    }
  }
  
  public void zzc(String paramString1, String paramString2)
  {
    boolean bool = this.zzxi;
    if (bool)
    {
      bool = TextUtils.isEmpty(paramString2);
      if (!bool) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      label19:
      Object localObject1 = zzr.zzbF().zzhb();
      if (localObject1 == null) {
        continue;
      }
      synchronized (this.zzpV)
      {
        localObject1 = ((zzbv)localObject1).zzL(paramString1);
        Map localMap = this.zzxA;
        ((zzby)localObject1).zza(localMap, paramString1, paramString2);
      }
    }
  }
  
  public zzbz zzdB()
  {
    long l = zzr.zzbG().elapsedRealtime();
    return zzb(l);
  }
  
  public void zzdC()
  {
    synchronized (this.zzpV)
    {
      zzbz localzzbz = zzdB();
      this.zzxC = localzzbz;
      return;
    }
  }
  
  public String zzdD()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzxz;
      Iterator localIterator = ((List)localObject2).iterator();
      long l1;
      String str;
      boolean bool2;
      do
      {
        do
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (zzbz)localObject2;
          l1 = ((zzbz)localObject2).getTime();
          str = ((zzbz)localObject2).zzdy();
          localObject2 = ((zzbz)localObject2).zzdz();
        } while (localObject2 == null);
        l2 = 0L;
        bool2 = l1 < l2;
      } while (!bool2);
      long l2 = ((zzbz)localObject2).getTime();
      l1 -= l2;
      localObject2 = localStringBuilder.append(str);
      char c1 = '.';
      localObject2 = ((StringBuilder)localObject2).append(c1);
      localObject2 = ((StringBuilder)localObject2).append(l1);
      char c2 = ',';
      ((StringBuilder)localObject2).append(c2);
    }
    Object localObject4 = this.zzxz;
    ((List)localObject4).clear();
    localObject4 = this.zzxB;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject4);
    if (!bool1)
    {
      localObject4 = this.zzxB;
      localStringBuilder.append((String)localObject4);
    }
    for (;;)
    {
      localObject4 = localStringBuilder.toString();
      return (String)localObject4;
      int i = localStringBuilder.length();
      if (i > 0)
      {
        i = localStringBuilder.length() + -1;
        localStringBuilder.setLength(i);
      }
    }
  }
  
  public zzbz zzdE()
  {
    synchronized (this.zzpV)
    {
      zzbz localzzbz = this.zzxC;
      return localzzbz;
    }
  }
  
  Map zzn()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = zzr.zzbF();
      localObject2 = ((zzih)localObject2).zzhb();
      if (localObject2 != null)
      {
        localObject4 = this.zzxD;
        if (localObject4 != null) {}
      }
      else
      {
        localObject2 = this.zzxA;
        return (Map)localObject2;
      }
      Object localObject4 = this.zzxA;
      Object localObject5 = this.zzxD;
      localObject5 = ((zzcb)localObject5).zzn();
      localObject2 = ((zzbv)localObject2).zza((Map)localObject4, (Map)localObject5);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */