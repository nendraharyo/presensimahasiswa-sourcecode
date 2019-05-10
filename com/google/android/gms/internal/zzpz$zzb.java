package com.google.android.gms.internal;

public final class zzpz$zzb
  extends zzsu
{
  private static volatile zzb[] zzaZu;
  public Integer zzaZv;
  public String zzaZw;
  public zzpz.zzc[] zzaZx;
  public Boolean zzaZy;
  public zzpz.zzd zzaZz;
  
  public zzpz$zzb()
  {
    zzDD();
  }
  
  public static zzb[] zzDC()
  {
    zzb[] arrayOfzzb = zzaZu;
    if (arrayOfzzb == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzb = zzaZu;
      if (arrayOfzzb == null)
      {
        arrayOfzzb = null;
        arrayOfzzb = new zzb[0];
        zzaZu = arrayOfzzb;
      }
      return zzaZu;
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
        Object localObject1 = this.zzaZv;
        if (localObject1 == null)
        {
          localObject1 = ((zzb)paramObject).zzaZv;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZv;
          localObject2 = ((zzb)paramObject).zzaZv;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZw;
        if (localObject1 == null)
        {
          localObject1 = ((zzb)paramObject).zzaZw;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZw;
          localObject2 = ((zzb)paramObject).zzaZw;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZx;
        Object localObject2 = ((zzb)paramObject).zzaZx;
        bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          localObject1 = this.zzaZy;
          if (localObject1 == null)
          {
            localObject1 = ((zzb)paramObject).zzaZy;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.zzaZy;
            localObject2 = ((zzb)paramObject).zzaZy;
            bool2 = ((Boolean)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              continue;
            }
          }
          localObject1 = this.zzaZz;
          if (localObject1 == null)
          {
            localObject1 = ((zzb)paramObject).zzaZz;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.zzaZz;
            localObject2 = ((zzb)paramObject).zzaZz;
            bool2 = ((zzpz.zzd)localObject1).equals(localObject2);
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
    zzpz.zzd localzzd = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject1 = this.zzaZv;
    if (localObject1 == null)
    {
      j = 0;
      localObject1 = null;
      j += k;
      k = j * 31;
      localObject1 = this.zzaZw;
      if (localObject1 != null) {
        break label154;
      }
      j = 0;
      localObject1 = null;
      label68:
      j = (j + k) * 31;
      Object localObject2 = this.zzaZx;
      k = zzss.hashCode((Object[])localObject2);
      j += k;
      k = j * 31;
      localObject1 = this.zzaZy;
      if (localObject1 != null) {
        break label169;
      }
      j = 0;
      localObject1 = null;
      label116:
      j = (j + k) * 31;
      localObject2 = this.zzaZz;
      if (localObject2 != null) {
        break label184;
      }
    }
    for (;;)
    {
      return j + i;
      localObject1 = this.zzaZv;
      j = ((Integer)localObject1).hashCode();
      break;
      label154:
      localObject1 = this.zzaZw;
      j = ((String)localObject1).hashCode();
      break label68;
      label169:
      localObject1 = this.zzaZy;
      j = ((Boolean)localObject1).hashCode();
      break label116;
      label184:
      localzzd = this.zzaZz;
      i = localzzd.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzaZv;
    int i;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.zzaZv;
      j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    localObject1 = this.zzaZw;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzaZw;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzaZx;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZx;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzaZx;
          j = localObject2.length;
          if (i >= j) {
            break;
          }
          localObject2 = this.zzaZx[i];
          if (localObject2 != null)
          {
            int k = 3;
            paramzzsn.zza(k, (zzsu)localObject2);
          }
          i += 1;
        }
      }
    }
    localObject1 = this.zzaZy;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.zzaZy;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    localObject1 = this.zzaZz;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = this.zzaZz;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzb zzDD()
  {
    this.zzaZv = null;
    this.zzaZw = null;
    zzpz.zzc[] arrayOfzzc = zzpz.zzc.zzDE();
    this.zzaZx = arrayOfzzc;
    this.zzaZy = null;
    this.zzaZz = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzb zzu(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject1;
      switch (i)
      {
      default: 
        boolean bool1 = zzsx.zzb(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = paramzzsm.zzJb();
        localObject1 = Integer.valueOf(j);
        this.zzaZv = ((Integer)localObject1);
        break;
      case 18: 
        localObject1 = paramzzsm.readString();
        this.zzaZw = ((String)localObject1);
        break;
      case 26: 
        j = 26;
        int k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzaZx;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        zzpz.zzc[] arrayOfzzc;
        for (;;)
        {
          k += j;
          arrayOfzzc = new zzpz.zzc[k];
          if (j != 0)
          {
            localObject2 = this.zzaZx;
            System.arraycopy(localObject2, 0, arrayOfzzc, 0, j);
          }
          for (;;)
          {
            int m = arrayOfzzc.length + -1;
            if (j >= m) {
              break;
            }
            localObject2 = new com/google/android/gms/internal/zzpz$zzc;
            ((zzpz.zzc)localObject2).<init>();
            arrayOfzzc[j] = localObject2;
            localObject2 = arrayOfzzc[j];
            paramzzsm.zza((zzsu)localObject2);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzaZx;
          j = localObject1.length;
        }
        Object localObject2 = new com/google/android/gms/internal/zzpz$zzc;
        ((zzpz.zzc)localObject2).<init>();
        arrayOfzzc[j] = localObject2;
        localObject1 = arrayOfzzc[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzaZx = arrayOfzzc;
        break;
      case 32: 
        boolean bool2 = paramzzsm.zzJc();
        localObject1 = Boolean.valueOf(bool2);
        this.zzaZy = ((Boolean)localObject1);
        break;
      case 42: 
        localObject1 = this.zzaZz;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/zzpz$zzd;
          ((zzpz.zzd)localObject1).<init>();
          this.zzaZz = ((zzpz.zzd)localObject1);
        }
        localObject1 = this.zzaZz;
        paramzzsm.zza((zzsu)localObject1);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.zzaZv;
    Object localObject2;
    int j;
    int k;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZv;
      j = ((Integer)localObject2).intValue();
      k = zzsn.zzC(1, j);
      i += k;
    }
    localObject1 = this.zzaZw;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZw;
      k = zzsn.zzo(2, (String)localObject2);
      i += k;
    }
    localObject1 = this.zzaZx;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZx;
      k = localObject1.length;
      if (k > 0)
      {
        localObject1 = null;
        k = i;
        i = 0;
        for (;;)
        {
          localObject2 = this.zzaZx;
          j = localObject2.length;
          if (i >= j) {
            break;
          }
          localObject2 = this.zzaZx[i];
          if (localObject2 != null)
          {
            int m = 3;
            j = zzsn.zzc(m, (zzsu)localObject2);
            k += j;
          }
          i += 1;
        }
        i = k;
      }
    }
    localObject1 = this.zzaZy;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZy;
      boolean bool = ((Boolean)localObject2).booleanValue();
      k = zzsn.zzf(4, bool);
      i += k;
    }
    localObject1 = this.zzaZz;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZz;
      k = zzsn.zzc(5, (zzsu)localObject2);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpz$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */