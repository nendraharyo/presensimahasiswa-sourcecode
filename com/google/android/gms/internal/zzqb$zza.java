package com.google.android.gms.internal;

public final class zzqb$zza
  extends zzsu
{
  private static volatile zza[] zzaZZ;
  public Integer zzaZr;
  public zzqb.zzf zzbaa;
  public zzqb.zzf zzbab;
  public Boolean zzbac;
  
  public zzqb$zza()
  {
    zzDQ();
  }
  
  public static zza[] zzDP()
  {
    zza[] arrayOfzza = zzaZZ;
    if (arrayOfzza == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzza = zzaZZ;
      if (arrayOfzza == null)
      {
        arrayOfzza = null;
        arrayOfzza = new zza[0];
        zzaZZ = arrayOfzza;
      }
      return zzaZZ;
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
        Object localObject2;
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
        localObject1 = this.zzbaa;
        if (localObject1 == null)
        {
          localObject1 = ((zza)paramObject).zzbaa;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbaa;
          localObject2 = ((zza)paramObject).zzbaa;
          bool2 = ((zzqb.zzf)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzbab;
        if (localObject1 == null)
        {
          localObject1 = ((zza)paramObject).zzbab;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbab;
          localObject2 = ((zza)paramObject).zzbab;
          bool2 = ((zzqb.zzf)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzbac;
        if (localObject1 == null)
        {
          localObject1 = ((zza)paramObject).zzbac;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbac;
          localObject2 = ((zza)paramObject).zzbac;
          bool2 = ((Boolean)localObject1).equals(localObject2);
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
    Boolean localBoolean1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject = this.zzaZr;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzbaa;
      if (localObject != null) {
        break label133;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = this.zzbab;
      if (localObject != null) {
        break label148;
      }
      j = 0;
      localObject = null;
      label95:
      j = (j + k) * 31;
      Boolean localBoolean2 = this.zzbac;
      if (localBoolean2 != null) {
        break label163;
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.zzaZr;
      j = ((Integer)localObject).hashCode();
      break;
      label133:
      localObject = this.zzbaa;
      j = ((zzqb.zzf)localObject).hashCode();
      break label68;
      label148:
      localObject = this.zzbab;
      j = ((zzqb.zzf)localObject).hashCode();
      break label95;
      label163:
      localBoolean1 = this.zzbac;
      i = localBoolean1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzaZr;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.zzaZr;
      int j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    localObject1 = this.zzbaa;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzbaa;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    localObject1 = this.zzbab;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzbab;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    localObject1 = this.zzbac;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.zzbac;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzC(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject;
      switch (i)
      {
      default: 
        boolean bool1 = zzsx.zzb(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 8: 
        int j = paramzzsm.zzJb();
        localObject = Integer.valueOf(j);
        this.zzaZr = ((Integer)localObject);
        break;
      case 18: 
        localObject = this.zzbaa;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzqb$zzf;
          ((zzqb.zzf)localObject).<init>();
          this.zzbaa = ((zzqb.zzf)localObject);
        }
        localObject = this.zzbaa;
        paramzzsm.zza((zzsu)localObject);
        break;
      case 26: 
        localObject = this.zzbab;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzqb$zzf;
          ((zzqb.zzf)localObject).<init>();
          this.zzbab = ((zzqb.zzf)localObject);
        }
        localObject = this.zzbab;
        paramzzsm.zza((zzsu)localObject);
        break;
      case 32: 
        boolean bool2 = paramzzsm.zzJc();
        localObject = Boolean.valueOf(bool2);
        this.zzbac = ((Boolean)localObject);
      }
    }
  }
  
  public zza zzDQ()
  {
    this.zzaZr = null;
    this.zzbaa = null;
    this.zzbab = null;
    this.zzbac = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.zzaZr;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZr;
      int j = ((Integer)localObject2).intValue();
      k = zzsn.zzC(1, j);
      i += k;
    }
    localObject1 = this.zzbaa;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaa;
      k = zzsn.zzc(2, (zzsu)localObject2);
      i += k;
    }
    localObject1 = this.zzbab;
    if (localObject1 != null)
    {
      localObject2 = this.zzbab;
      k = zzsn.zzc(3, (zzsu)localObject2);
      i += k;
    }
    localObject1 = this.zzbac;
    if (localObject1 != null)
    {
      localObject2 = this.zzbac;
      boolean bool = ((Boolean)localObject2).booleanValue();
      k = zzsn.zzf(4, bool);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */