package com.google.android.gms.internal;

public final class zzpz$zza
  extends zzsu
{
  private static volatile zza[] zzaZq;
  public Integer zzaZr;
  public zzpz.zze[] zzaZs;
  public zzpz.zzb[] zzaZt;
  
  public zzpz$zza()
  {
    zzDB();
  }
  
  public static zza[] zzDA()
  {
    zza[] arrayOfzza = zzaZq;
    if (arrayOfzza == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzza = zzaZq;
      if (arrayOfzza == null)
      {
        arrayOfzza = null;
        arrayOfzza = new zza[0];
        zzaZq = arrayOfzza;
      }
      return zzaZq;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zza;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zza)paramObject;
        Object localObject1 = this.zzaZr;
        if (localObject1 == null)
        {
          localObject1 = ((zza)paramObject).zzaZr;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZr;
          localObject2 = ((zza)paramObject).zzaZr;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZs;
        Object localObject2 = ((zza)paramObject).zzaZs;
        bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          localObject1 = this.zzaZt;
          localObject2 = ((zza)paramObject).zzaZt;
          bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
          if (!bool2) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = getClass().getName().hashCode() + 527;
    int j = i * 31;
    Integer localInteger = this.zzaZr;
    if (localInteger == null)
    {
      i = 0;
      localInteger = null;
    }
    for (;;)
    {
      i = (i + j) * 31;
      j = zzss.hashCode(this.zzaZs);
      i = (i + j) * 31;
      j = zzss.hashCode(this.zzaZt);
      return i + j;
      localInteger = this.zzaZr;
      i = localInteger.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 0;
    Object localObject1 = this.zzaZr;
    int j;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      j = 1;
      localObject2 = this.zzaZr;
      k = ((Integer)localObject2).intValue();
      paramzzsn.zzA(j, k);
    }
    localObject1 = this.zzaZs;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZs;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzaZs;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzaZs[j];
          if (localObject2 != null)
          {
            int m = 2;
            paramzzsn.zza(m, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzaZt;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZt;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = this.zzaZt;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          localObject1 = this.zzaZt[i];
          if (localObject1 != null)
          {
            k = 3;
            paramzzsn.zza(k, (zzsu)localObject1);
          }
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzDB()
  {
    this.zzaZr = null;
    Object localObject = zzpz.zze.zzDH();
    this.zzaZs = ((zzpz.zze[])localObject);
    localObject = zzpz.zzb.zzDC();
    this.zzaZt = ((zzpz.zzb[])localObject);
    this.zzbuu = -1;
    return this;
  }
  
  public zza zzt(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject1;
      int k;
      Object localObject2;
      Object localObject3;
      int m;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = paramzzsm.zzJb();
        localObject1 = Integer.valueOf(j);
        this.zzaZr = ((Integer)localObject1);
        break;
      case 18: 
        j = 18;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzaZs;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new zzpz.zze[k];
          if (j != 0)
          {
            localObject3 = this.zzaZs;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzpz$zze;
            ((zzpz.zze)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzaZs;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzpz$zze;
        ((zzpz.zze)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzaZs = ((zzpz.zze[])localObject2);
        break;
      case 26: 
        j = 26;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzaZt;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new zzpz.zzb[k];
          if (j != 0)
          {
            localObject3 = this.zzaZt;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzpz$zzb;
            ((zzpz.zzb)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzaZt;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzpz$zzb;
        ((zzpz.zzb)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzaZt = ((zzpz.zzb[])localObject2);
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int j = super.zzz();
    Object localObject1 = this.zzaZr;
    Object localObject2;
    int k;
    int m;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZr;
      k = ((Integer)localObject2).intValue();
      m = zzsn.zzC(1, k);
      j += m;
    }
    localObject1 = this.zzaZs;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZs;
      m = localObject1.length;
      if (m > 0)
      {
        m = j;
        j = 0;
        for (;;)
        {
          localObject2 = this.zzaZs;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzaZs[j];
          if (localObject2 != null)
          {
            int n = 2;
            k = zzsn.zzc(n, (zzsu)localObject2);
            m += k;
          }
          j += 1;
        }
        j = m;
      }
    }
    localObject1 = this.zzaZt;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZt;
      m = localObject1.length;
      if (m > 0) {
        for (;;)
        {
          localObject1 = this.zzaZt;
          m = localObject1.length;
          if (i >= m) {
            break;
          }
          localObject1 = this.zzaZt[i];
          if (localObject1 != null)
          {
            k = 3;
            m = zzsn.zzc(k, (zzsu)localObject1);
            j += m;
          }
          i += 1;
        }
      }
    }
    return j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpz$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */