package com.google.android.gms.internal;

public final class zzqa$zzb
  extends zzsu
{
  public String zzaVt;
  public Long zzaZT;
  public Integer zzaZU;
  public zzqa.zzc[] zzaZV;
  public zzqa.zza[] zzaZW;
  public zzpz.zza[] zzaZX;
  
  public zzqa$zzb()
  {
    zzDM();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzb;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzb)paramObject;
        Object localObject1 = this.zzaZT;
        if (localObject1 == null)
        {
          localObject1 = ((zzb)paramObject).zzaZT;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZT;
          localObject2 = ((zzb)paramObject).zzaZT;
          bool2 = ((Long)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaVt;
        if (localObject1 == null)
        {
          localObject1 = ((zzb)paramObject).zzaVt;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaVt;
          localObject2 = ((zzb)paramObject).zzaVt;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZU;
        if (localObject1 == null)
        {
          localObject1 = ((zzb)paramObject).zzaZU;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZU;
          localObject2 = ((zzb)paramObject).zzaZU;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZV;
        Object localObject2 = ((zzb)paramObject).zzaZV;
        bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          localObject1 = this.zzaZW;
          localObject2 = ((zzb)paramObject).zzaZW;
          bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
          if (!bool2)
          {
            bool1 = false;
          }
          else
          {
            localObject1 = this.zzaZX;
            localObject2 = ((zzb)paramObject).zzaZX;
            bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    Integer localInteger1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject = this.zzaZT;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzaVt;
      if (localObject != null) {
        break label151;
      }
      j = 0;
      localObject = null;
      label68:
      j = (j + k) * 31;
      Integer localInteger2 = this.zzaZU;
      if (localInteger2 != null) {
        break label166;
      }
    }
    for (;;)
    {
      j = (j + i) * 31;
      i = zzss.hashCode(this.zzaZV);
      j = (j + i) * 31;
      i = zzss.hashCode(this.zzaZW);
      j = (j + i) * 31;
      i = zzss.hashCode(this.zzaZX);
      return j + i;
      localObject = this.zzaZT;
      j = ((Long)localObject).hashCode();
      break;
      label151:
      localObject = this.zzaVt;
      j = ((String)localObject).hashCode();
      break label68;
      label166:
      localInteger1 = this.zzaZU;
      i = localInteger1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 0;
    Object localObject1 = this.zzaZT;
    int j;
    Object localObject2;
    if (localObject1 != null)
    {
      j = 1;
      localObject2 = this.zzaZT;
      long l = ((Long)localObject2).longValue();
      paramzzsn.zzb(j, l);
    }
    localObject1 = this.zzaVt;
    if (localObject1 != null)
    {
      j = 2;
      localObject2 = this.zzaVt;
      paramzzsn.zzn(j, (String)localObject2);
    }
    localObject1 = this.zzaZU;
    int k;
    if (localObject1 != null)
    {
      j = 3;
      localObject2 = this.zzaZU;
      k = ((Integer)localObject2).intValue();
      paramzzsn.zzA(j, k);
    }
    localObject1 = this.zzaZV;
    int m;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZV;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzaZV;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzaZV[j];
          if (localObject2 != null)
          {
            m = 4;
            paramzzsn.zza(m, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzaZW;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZW;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzaZW;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzaZW[j];
          if (localObject2 != null)
          {
            m = 5;
            paramzzsn.zza(m, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzaZX;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZX;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = this.zzaZX;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          localObject1 = this.zzaZX[i];
          if (localObject1 != null)
          {
            k = 6;
            paramzzsn.zza(k, (zzsu)localObject1);
          }
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zzb zzA(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject1;
      int j;
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
        long l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzaZT = ((Long)localObject1);
        break;
      case 18: 
        localObject1 = paramzzsm.readString();
        this.zzaVt = ((String)localObject1);
        break;
      case 24: 
        j = paramzzsm.zzJb();
        localObject1 = Integer.valueOf(j);
        this.zzaZU = ((Integer)localObject1);
        break;
      case 34: 
        j = 34;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzaZV;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new zzqa.zzc[k];
          if (j != 0)
          {
            localObject3 = this.zzaZV;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzqa$zzc;
            ((zzqa.zzc)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzaZV;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzqa$zzc;
        ((zzqa.zzc)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzaZV = ((zzqa.zzc[])localObject2);
        break;
      case 42: 
        j = 42;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzaZW;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new zzqa.zza[k];
          if (j != 0)
          {
            localObject3 = this.zzaZW;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzqa$zza;
            ((zzqa.zza)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzaZW;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzqa$zza;
        ((zzqa.zza)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzaZW = ((zzqa.zza[])localObject2);
        break;
      case 50: 
        j = 50;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzaZX;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new zzpz.zza[k];
          if (j != 0)
          {
            localObject3 = this.zzaZX;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzpz$zza;
            ((zzpz.zza)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzaZX;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzpz$zza;
        ((zzpz.zza)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzaZX = ((zzpz.zza[])localObject2);
      }
    }
  }
  
  public zzb zzDM()
  {
    this.zzaZT = null;
    this.zzaVt = null;
    this.zzaZU = null;
    Object localObject = zzqa.zzc.zzDN();
    this.zzaZV = ((zzqa.zzc[])localObject);
    localObject = zzqa.zza.zzDK();
    this.zzaZW = ((zzqa.zza[])localObject);
    localObject = zzpz.zza.zzDA();
    this.zzaZX = ((zzpz.zza[])localObject);
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = 0;
    int j = super.zzz();
    Object localObject1 = this.zzaZT;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZT;
      long l = ((Long)localObject2).longValue();
      k = zzsn.zzd(1, l);
      j += k;
    }
    localObject1 = this.zzaVt;
    if (localObject1 != null)
    {
      localObject2 = this.zzaVt;
      k = zzsn.zzo(2, (String)localObject2);
      j += k;
    }
    localObject1 = this.zzaZU;
    int m;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZU;
      m = ((Integer)localObject2).intValue();
      k = zzsn.zzC(3, m);
      j += k;
    }
    localObject1 = this.zzaZV;
    int n;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZV;
      k = localObject1.length;
      if (k > 0)
      {
        k = j;
        j = 0;
        for (;;)
        {
          localObject2 = this.zzaZV;
          m = localObject2.length;
          if (j >= m) {
            break;
          }
          localObject2 = this.zzaZV[j];
          if (localObject2 != null)
          {
            n = 4;
            m = zzsn.zzc(n, (zzsu)localObject2);
            k += m;
          }
          j += 1;
        }
        j = k;
      }
    }
    localObject1 = this.zzaZW;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZW;
      k = localObject1.length;
      if (k > 0)
      {
        k = j;
        j = 0;
        for (;;)
        {
          localObject2 = this.zzaZW;
          m = localObject2.length;
          if (j >= m) {
            break;
          }
          localObject2 = this.zzaZW[j];
          if (localObject2 != null)
          {
            n = 5;
            m = zzsn.zzc(n, (zzsu)localObject2);
            k += m;
          }
          j += 1;
        }
        j = k;
      }
    }
    localObject1 = this.zzaZX;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZX;
      k = localObject1.length;
      if (k > 0) {
        for (;;)
        {
          localObject1 = this.zzaZX;
          k = localObject1.length;
          if (i >= k) {
            break;
          }
          localObject1 = this.zzaZX[i];
          if (localObject1 != null)
          {
            m = 6;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqa$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */