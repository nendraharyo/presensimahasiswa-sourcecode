package com.google.android.gms.internal;

public final class zzpz$zzc
  extends zzsu
{
  private static volatile zzc[] zzaZA;
  public zzpz.zzf zzaZB;
  public zzpz.zzd zzaZC;
  public Boolean zzaZD;
  public String zzaZE;
  
  public zzpz$zzc()
  {
    zzDF();
  }
  
  public static zzc[] zzDE()
  {
    zzc[] arrayOfzzc = zzaZA;
    if (arrayOfzzc == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzc = zzaZA;
      if (arrayOfzzc == null)
      {
        arrayOfzzc = null;
        arrayOfzzc = new zzc[0];
        zzaZA = arrayOfzzc;
      }
      return zzaZA;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzc;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzc)paramObject;
        Object localObject1 = this.zzaZB;
        Object localObject2;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).zzaZB;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZB;
          localObject2 = ((zzc)paramObject).zzaZB;
          bool2 = ((zzpz.zzf)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZC;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).zzaZC;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZC;
          localObject2 = ((zzc)paramObject).zzaZC;
          bool2 = ((zzpz.zzd)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZD;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).zzaZD;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZD;
          localObject2 = ((zzc)paramObject).zzaZD;
          bool2 = ((Boolean)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZE;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).zzaZE;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZE;
          localObject2 = ((zzc)paramObject).zzaZE;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    String str1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject = this.zzaZB;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzaZC;
      if (localObject != null) {
        break label133;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = this.zzaZD;
      if (localObject != null) {
        break label148;
      }
      j = 0;
      localObject = null;
      label95:
      j = (j + k) * 31;
      String str2 = this.zzaZE;
      if (str2 != null) {
        break label163;
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.zzaZB;
      j = ((zzpz.zzf)localObject).hashCode();
      break;
      label133:
      localObject = this.zzaZC;
      j = ((zzpz.zzd)localObject).hashCode();
      break label68;
      label148:
      localObject = this.zzaZD;
      j = ((Boolean)localObject).hashCode();
      break label95;
      label163:
      str1 = this.zzaZE;
      i = str1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzaZB;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.zzaZB;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    localObject1 = this.zzaZC;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzaZC;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    localObject1 = this.zzaZD;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzaZD;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    localObject1 = this.zzaZE;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.zzaZE;
      paramzzsn.zzn(i, (String)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzc zzDF()
  {
    this.zzaZB = null;
    this.zzaZC = null;
    this.zzaZD = null;
    this.zzaZE = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzc zzv(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      boolean bool;
      Object localObject;
      switch (i)
      {
      default: 
        bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        localObject = this.zzaZB;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzpz$zzf;
          ((zzpz.zzf)localObject).<init>();
          this.zzaZB = ((zzpz.zzf)localObject);
        }
        localObject = this.zzaZB;
        paramzzsm.zza((zzsu)localObject);
        break;
      case 18: 
        localObject = this.zzaZC;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzpz$zzd;
          ((zzpz.zzd)localObject).<init>();
          this.zzaZC = ((zzpz.zzd)localObject);
        }
        localObject = this.zzaZC;
        paramzzsm.zza((zzsu)localObject);
        break;
      case 24: 
        bool = paramzzsm.zzJc();
        localObject = Boolean.valueOf(bool);
        this.zzaZD = ((Boolean)localObject);
        break;
      case 34: 
        localObject = paramzzsm.readString();
        this.zzaZE = ((String)localObject);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.zzaZB;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZB;
      j = zzsn.zzc(1, (zzsu)localObject2);
      i += j;
    }
    localObject1 = this.zzaZC;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZC;
      j = zzsn.zzc(2, (zzsu)localObject2);
      i += j;
    }
    localObject1 = this.zzaZD;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZD;
      boolean bool = ((Boolean)localObject2).booleanValue();
      j = zzsn.zzf(3, bool);
      i += j;
    }
    localObject1 = this.zzaZE;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZE;
      j = zzsn.zzo(4, (String)localObject2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpz$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */