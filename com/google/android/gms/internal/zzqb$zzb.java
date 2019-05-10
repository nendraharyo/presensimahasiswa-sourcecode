package com.google.android.gms.internal;

public final class zzqb$zzb
  extends zzsu
{
  private static volatile zzb[] zzbad;
  public Integer count;
  public String name;
  public zzqb.zzc[] zzbae;
  public Long zzbaf;
  public Long zzbag;
  
  public zzqb$zzb()
  {
    zzDS();
  }
  
  public static zzb[] zzDR()
  {
    zzb[] arrayOfzzb = zzbad;
    if (arrayOfzzb == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzb = zzbad;
      if (arrayOfzzb == null)
      {
        arrayOfzzb = null;
        arrayOfzzb = new zzb[0];
        zzbad = arrayOfzzb;
      }
      return zzbad;
    }
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
        Object localObject1 = this.zzbae;
        Object localObject2 = ((zzb)paramObject).zzbae;
        bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          localObject1 = this.name;
          if (localObject1 == null)
          {
            localObject1 = ((zzb)paramObject).name;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.name;
            localObject2 = ((zzb)paramObject).name;
            bool2 = ((String)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              continue;
            }
          }
          localObject1 = this.zzbaf;
          if (localObject1 == null)
          {
            localObject1 = ((zzb)paramObject).zzbaf;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.zzbaf;
            localObject2 = ((zzb)paramObject).zzbaf;
            bool2 = ((Long)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              continue;
            }
          }
          localObject1 = this.zzbag;
          if (localObject1 == null)
          {
            localObject1 = ((zzb)paramObject).zzbag;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.zzbag;
            localObject2 = ((zzb)paramObject).zzbag;
            bool2 = ((Long)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              continue;
            }
          }
          localObject1 = this.count;
          if (localObject1 == null)
          {
            localObject1 = ((zzb)paramObject).count;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.count;
            localObject2 = ((zzb)paramObject).count;
            bool2 = ((Integer)localObject1).equals(localObject2);
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
    Integer localInteger = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    Object localObject1 = this.zzbae;
    int k = zzss.hashCode((Object[])localObject1);
    j += k;
    k = j * 31;
    Object localObject2 = this.name;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      j += k;
      k = j * 31;
      localObject2 = this.zzbaf;
      if (localObject2 != null) {
        break label154;
      }
      j = 0;
      localObject2 = null;
      label89:
      j += k;
      k = j * 31;
      localObject2 = this.zzbag;
      if (localObject2 != null) {
        break label169;
      }
      j = 0;
      localObject2 = null;
      label116:
      j = (j + k) * 31;
      localObject1 = this.count;
      if (localObject1 != null) {
        break label184;
      }
    }
    for (;;)
    {
      return j + i;
      localObject2 = this.name;
      j = ((String)localObject2).hashCode();
      break;
      label154:
      localObject2 = this.zzbaf;
      j = ((Long)localObject2).hashCode();
      break label89;
      label169:
      localObject2 = this.zzbag;
      j = ((Long)localObject2).hashCode();
      break label116;
      label184:
      localInteger = this.count;
      i = localInteger.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzbae;
    int i;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject1 = this.zzbae;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbae;
          j = localObject2.length;
          if (i >= j) {
            break;
          }
          localObject2 = this.zzbae[i];
          if (localObject2 != null)
          {
            int k = 1;
            paramzzsn.zza(k, (zzsu)localObject2);
          }
          i += 1;
        }
      }
    }
    localObject1 = this.name;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.name;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzbaf;
    long l;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzbaf;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.zzbag;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.zzbag;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.count;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = this.count;
      j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzb zzD(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject1;
      long l;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        j = 10;
        int k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbae;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        zzqb.zzc[] arrayOfzzc;
        for (;;)
        {
          k += j;
          arrayOfzzc = new zzqb.zzc[k];
          if (j != 0)
          {
            localObject2 = this.zzbae;
            System.arraycopy(localObject2, 0, arrayOfzzc, 0, j);
          }
          for (;;)
          {
            int m = arrayOfzzc.length + -1;
            if (j >= m) {
              break;
            }
            localObject2 = new com/google/android/gms/internal/zzqb$zzc;
            ((zzqb.zzc)localObject2).<init>();
            arrayOfzzc[j] = localObject2;
            localObject2 = arrayOfzzc[j];
            paramzzsm.zza((zzsu)localObject2);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbae;
          j = localObject1.length;
        }
        Object localObject2 = new com/google/android/gms/internal/zzqb$zzc;
        ((zzqb.zzc)localObject2).<init>();
        arrayOfzzc[j] = localObject2;
        localObject1 = arrayOfzzc[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzbae = arrayOfzzc;
        break;
      case 18: 
        localObject1 = paramzzsm.readString();
        this.name = ((String)localObject1);
        break;
      case 24: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbaf = ((Long)localObject1);
        break;
      case 32: 
        l = paramzzsm.zzJa();
        localObject1 = Long.valueOf(l);
        this.zzbag = ((Long)localObject1);
        break;
      case 40: 
        j = paramzzsm.zzJb();
        localObject1 = Integer.valueOf(j);
        this.count = ((Integer)localObject1);
      }
    }
  }
  
  public zzb zzDS()
  {
    zzqb.zzc[] arrayOfzzc = zzqb.zzc.zzDT();
    this.zzbae = arrayOfzzc;
    this.name = null;
    this.zzbaf = null;
    this.zzbag = null;
    this.count = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.zzbae;
    int j;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject1 = this.zzbae;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbae;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzbae[j];
          if (localObject2 != null)
          {
            int m = 1;
            k = zzsn.zzc(m, (zzsu)localObject2);
            i += k;
          }
          j += 1;
        }
      }
    }
    localObject1 = this.name;
    if (localObject1 != null)
    {
      localObject2 = this.name;
      j = zzsn.zzo(2, (String)localObject2);
      i += j;
    }
    localObject1 = this.zzbaf;
    long l;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaf;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(3, l);
      i += j;
    }
    localObject1 = this.zzbag;
    if (localObject1 != null)
    {
      localObject2 = this.zzbag;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(4, l);
      i += j;
    }
    localObject1 = this.count;
    if (localObject1 != null)
    {
      localObject2 = this.count;
      k = ((Integer)localObject2).intValue();
      j = zzsn.zzC(5, k);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqb$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */