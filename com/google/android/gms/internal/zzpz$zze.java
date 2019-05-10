package com.google.android.gms.internal;

public final class zzpz$zze
  extends zzsu
{
  private static volatile zze[] zzaZK;
  public String zzaZL;
  public zzpz.zzc zzaZM;
  public Integer zzaZv;
  
  public zzpz$zze()
  {
    zzDI();
  }
  
  public static zze[] zzDH()
  {
    zze[] arrayOfzze = zzaZK;
    if (arrayOfzze == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzze = zzaZK;
      if (arrayOfzze == null)
      {
        arrayOfzze = null;
        arrayOfzze = new zze[0];
        zzaZK = arrayOfzze;
      }
      return zzaZK;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zze;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zze)paramObject;
        Object localObject1 = this.zzaZv;
        Object localObject2;
        if (localObject1 == null)
        {
          localObject1 = ((zze)paramObject).zzaZv;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZv;
          localObject2 = ((zze)paramObject).zzaZv;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZL;
        if (localObject1 == null)
        {
          localObject1 = ((zze)paramObject).zzaZL;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZL;
          localObject2 = ((zze)paramObject).zzaZL;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZM;
        if (localObject1 == null)
        {
          localObject1 = ((zze)paramObject).zzaZM;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZM;
          localObject2 = ((zze)paramObject).zzaZM;
          bool2 = ((zzpz.zzc)localObject1).equals(localObject2);
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
    zzpz.zzc localzzc1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject = this.zzaZv;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzaZL;
      if (localObject != null) {
        break label106;
      }
      j = 0;
      localObject = null;
      label68:
      j = (j + k) * 31;
      zzpz.zzc localzzc2 = this.zzaZM;
      if (localzzc2 != null) {
        break label121;
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.zzaZv;
      j = ((Integer)localObject).hashCode();
      break;
      label106:
      localObject = this.zzaZL;
      j = ((String)localObject).hashCode();
      break label68;
      label121:
      localzzc1 = this.zzaZM;
      i = localzzc1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzaZv;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.zzaZv;
      int j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    localObject1 = this.zzaZL;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzaZL;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzaZM;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzaZM;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zze zzDI()
  {
    this.zzaZv = null;
    this.zzaZL = null;
    this.zzaZM = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zze zzx(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        int j = paramzzsm.zzJb();
        localObject = Integer.valueOf(j);
        this.zzaZv = ((Integer)localObject);
        break;
      case 18: 
        localObject = paramzzsm.readString();
        this.zzaZL = ((String)localObject);
        break;
      case 26: 
        localObject = this.zzaZM;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzpz$zzc;
          ((zzpz.zzc)localObject).<init>();
          this.zzaZM = ((zzpz.zzc)localObject);
        }
        localObject = this.zzaZM;
        paramzzsm.zza((zzsu)localObject);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.zzaZv;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZv;
      int j = ((Integer)localObject2).intValue();
      k = zzsn.zzC(1, j);
      i += k;
    }
    localObject1 = this.zzaZL;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZL;
      k = zzsn.zzo(2, (String)localObject2);
      i += k;
    }
    localObject1 = this.zzaZM;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZM;
      k = zzsn.zzc(3, (zzsu)localObject2);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpz$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */