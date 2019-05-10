package com.google.android.gms.internal;

public final class zzsy$zza
  extends zzsu
{
  public String name;
  public zzsy.zzb[] zzbuE;
  
  public zzsy$zza()
  {
    zzJz();
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
        Object localObject1 = this.name;
        if (localObject1 == null)
        {
          localObject1 = ((zza)paramObject).name;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.name;
          localObject2 = ((zza)paramObject).name;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzbuE;
        Object localObject2 = ((zza)paramObject).zzbuE;
        bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (!bool2) {
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = getClass().getName().hashCode() + 527;
    int j = i * 31;
    String str = this.name;
    if (str == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      i = (i + j) * 31;
      j = zzss.hashCode(this.zzbuE);
      return i + j;
      str = this.name;
      i = str.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.name;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.name;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzbuE;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuE;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbuE;
          int j = localObject2.length;
          if (i >= j) {
            break;
          }
          localObject2 = this.zzbuE[i];
          if (localObject2 != null)
          {
            int k = 2;
            paramzzsn.zza(k, (zzsu)localObject2);
          }
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzJz()
  {
    this.name = null;
    zzsy.zzb[] arrayOfzzb = zzsy.zzb.zzJA();
    this.zzbuE = arrayOfzzb;
    this.zzbuu = -1;
    return this;
  }
  
  public zza zzQ(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject1;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        localObject1 = paramzzsm.readString();
        this.name = ((String)localObject1);
        break;
      case 18: 
        int j = 18;
        int k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbuE;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        zzsy.zzb[] arrayOfzzb;
        for (;;)
        {
          k += j;
          arrayOfzzb = new zzsy.zzb[k];
          if (j != 0)
          {
            localObject2 = this.zzbuE;
            System.arraycopy(localObject2, 0, arrayOfzzb, 0, j);
          }
          for (;;)
          {
            int m = arrayOfzzb.length + -1;
            if (j >= m) {
              break;
            }
            localObject2 = new com/google/android/gms/internal/zzsy$zzb;
            ((zzsy.zzb)localObject2).<init>();
            arrayOfzzb[j] = localObject2;
            localObject2 = arrayOfzzb[j];
            paramzzsm.zza((zzsu)localObject2);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbuE;
          j = localObject1.length;
        }
        Object localObject2 = new com/google/android/gms/internal/zzsy$zzb;
        ((zzsy.zzb)localObject2).<init>();
        arrayOfzzb[j] = localObject2;
        localObject1 = arrayOfzzb[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzbuE = arrayOfzzb;
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.name;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = this.name;
      j = zzsn.zzo(1, (String)localObject2);
      i += j;
    }
    localObject1 = this.zzbuE;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuE;
      j = localObject1.length;
      if (j > 0)
      {
        localObject1 = null;
        j = i;
        i = 0;
        for (;;)
        {
          localObject2 = this.zzbuE;
          int k = localObject2.length;
          if (i >= k) {
            break;
          }
          localObject2 = this.zzbuE[i];
          if (localObject2 != null)
          {
            int m = 2;
            k = zzsn.zzc(m, (zzsu)localObject2);
            j += k;
          }
          i += 1;
        }
        i = j;
      }
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsy$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */