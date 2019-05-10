package com.google.android.gms.internal;

public final class zzaf$zzd
  extends zzso
{
  public zzag.zza[] zziC;
  public zzag.zza[] zziD;
  public zzaf.zzc[] zziE;
  
  public zzaf$zzd()
  {
    zzG();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    zzsq localzzsq1 = null;
    if (paramObject == this) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      boolean bool3 = paramObject instanceof zzd;
      if (bool3)
      {
        paramObject = (zzd)paramObject;
        Object localObject1 = this.zziC;
        Object localObject2 = ((zzd)paramObject).zziC;
        bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (bool3)
        {
          localObject1 = this.zziD;
          localObject2 = ((zzd)paramObject).zziD;
          bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
          if (bool3)
          {
            localObject1 = this.zziE;
            localObject2 = ((zzd)paramObject).zziE;
            bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (bool3)
            {
              localObject1 = this.zzbuj;
              if (localObject1 != null)
              {
                localObject1 = this.zzbuj;
                bool3 = ((zzsq)localObject1).isEmpty();
                if (!bool3) {}
              }
              else
              {
                localObject1 = ((zzd)paramObject).zzbuj;
                if (localObject1 != null)
                {
                  localObject1 = ((zzd)paramObject).zzbuj;
                  bool3 = ((zzsq)localObject1).isEmpty();
                  if (!bool3) {
                    continue;
                  }
                }
                bool2 = bool1;
                continue;
              }
              localzzsq1 = this.zzbuj;
              zzsq localzzsq2 = ((zzd)paramObject).zzbuj;
              bool2 = localzzsq1.equals(localzzsq2);
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = zzss.hashCode(this.zziC);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zziD);
    i = (i + m) * 31;
    zzaf.zzc[] arrayOfzzc = this.zziE;
    m = zzss.hashCode(arrayOfzzc);
    i += m;
    m = i * 31;
    zzsq localzzsq = this.zzbuj;
    int j;
    if (localzzsq != null)
    {
      localzzsq = this.zzbuj;
      j = localzzsq.isEmpty();
      if (j == 0) {}
    }
    else
    {
      j = 0;
      localzzsq = null;
    }
    for (;;)
    {
      return j + m;
      localzzsq = this.zzbuj;
      int k = localzzsq.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 0;
    Object localObject1 = this.zziC;
    int j;
    Object localObject2;
    int k;
    int m;
    if (localObject1 != null)
    {
      localObject1 = this.zziC;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zziC;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zziC[j];
          if (localObject2 != null)
          {
            m = 1;
            paramzzsn.zza(m, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziD;
    if (localObject1 != null)
    {
      localObject1 = this.zziD;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zziD;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zziD[j];
          if (localObject2 != null)
          {
            m = 2;
            paramzzsn.zza(m, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziE;
    if (localObject1 != null)
    {
      localObject1 = this.zziE;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = this.zziE;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          localObject1 = this.zziE[i];
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
  
  public zzd zzG()
  {
    Object localObject = zzag.zza.zzQ();
    this.zziC = ((zzag.zza[])localObject);
    localObject = zzag.zza.zzQ();
    this.zziD = ((zzag.zza[])localObject);
    localObject = zzaf.zzc.zzE();
    this.zziE = ((zzaf.zzc[])localObject);
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzd zzd(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      int k;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      int m;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        j = 10;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziC;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new zzag.zza[k];
          if (j != 0)
          {
            localObject3 = this.zziC;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzag$zza;
            ((zzag.zza)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziC;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzag$zza;
        ((zzag.zza)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziC = ((zzag.zza[])localObject2);
        break;
      case 18: 
        j = 18;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziD;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new zzag.zza[k];
          if (j != 0)
          {
            localObject3 = this.zziD;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzag$zza;
            ((zzag.zza)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziD;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzag$zza;
        ((zzag.zza)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziD = ((zzag.zza[])localObject2);
        break;
      case 26: 
        j = 26;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziE;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new zzaf.zzc[k];
          if (j != 0)
          {
            localObject3 = this.zziE;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzaf$zzc;
            ((zzaf.zzc)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziE;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzaf$zzc;
        ((zzaf.zzc)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziE = ((zzaf.zzc[])localObject2);
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int j = super.zzz();
    Object localObject1 = this.zziC;
    int k;
    Object localObject2;
    int m;
    int n;
    if (localObject1 != null)
    {
      localObject1 = this.zziC;
      k = localObject1.length;
      if (k > 0)
      {
        k = j;
        j = 0;
        for (;;)
        {
          localObject2 = this.zziC;
          m = localObject2.length;
          if (j >= m) {
            break;
          }
          localObject2 = this.zziC[j];
          if (localObject2 != null)
          {
            n = 1;
            m = zzsn.zzc(n, (zzsu)localObject2);
            k += m;
          }
          j += 1;
        }
        j = k;
      }
    }
    localObject1 = this.zziD;
    if (localObject1 != null)
    {
      localObject1 = this.zziD;
      k = localObject1.length;
      if (k > 0)
      {
        k = j;
        j = 0;
        for (;;)
        {
          localObject2 = this.zziD;
          m = localObject2.length;
          if (j >= m) {
            break;
          }
          localObject2 = this.zziD[j];
          if (localObject2 != null)
          {
            n = 2;
            m = zzsn.zzc(n, (zzsu)localObject2);
            k += m;
          }
          j += 1;
        }
        j = k;
      }
    }
    localObject1 = this.zziE;
    if (localObject1 != null)
    {
      localObject1 = this.zziE;
      k = localObject1.length;
      if (k > 0) {
        for (;;)
        {
          localObject1 = this.zziE;
          k = localObject1.length;
          if (i >= k) {
            break;
          }
          localObject1 = this.zziE[i];
          if (localObject1 != null)
          {
            m = 3;
            k = zzsn.zzc(m, (zzsu)localObject1);
            j += k;
          }
          i += 1;
        }
      }
    }
    return j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */