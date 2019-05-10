package com.google.android.gms.internal;

public final class zzqb$zzc
  extends zzsu
{
  private static volatile zzc[] zzbah;
  public String name;
  public Float zzaZo;
  public String zzamJ;
  public Long zzbai;
  
  public zzqb$zzc()
  {
    zzDU();
  }
  
  public static zzc[] zzDT()
  {
    zzc[] arrayOfzzc = zzbah;
    if (arrayOfzzc == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzc = zzbah;
      if (arrayOfzzc == null)
      {
        arrayOfzzc = null;
        arrayOfzzc = new zzc[0];
        zzbah = arrayOfzzc;
      }
      return zzbah;
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
        Object localObject1 = this.name;
        Object localObject2;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).name;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.name;
          localObject2 = ((zzc)paramObject).name;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzamJ;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).zzamJ;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzamJ;
          localObject2 = ((zzc)paramObject).zzamJ;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzbai;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).zzbai;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbai;
          localObject2 = ((zzc)paramObject).zzbai;
          bool2 = ((Long)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZo;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).zzaZo;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZo;
          localObject2 = ((zzc)paramObject).zzaZo;
          bool2 = ((Float)localObject1).equals(localObject2);
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
    Float localFloat1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject = this.name;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzamJ;
      if (localObject != null) {
        break label133;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = this.zzbai;
      if (localObject != null) {
        break label148;
      }
      j = 0;
      localObject = null;
      label95:
      j = (j + k) * 31;
      Float localFloat2 = this.zzaZo;
      if (localFloat2 != null) {
        break label163;
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.name;
      j = ((String)localObject).hashCode();
      break;
      label133:
      localObject = this.zzamJ;
      j = ((String)localObject).hashCode();
      break label68;
      label148:
      localObject = this.zzbai;
      j = ((Long)localObject).hashCode();
      break label95;
      label163:
      localFloat1 = this.zzaZo;
      i = localFloat1.hashCode();
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
    localObject1 = this.zzamJ;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzamJ;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzbai;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzbai;
      long l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.zzaZo;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.zzaZo;
      float f = ((Float)localObject2).floatValue();
      paramzzsn.zzb(i, f);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzc zzDU()
  {
    this.name = null;
    this.zzamJ = null;
    this.zzbai = null;
    this.zzaZo = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzc zzE(zzsm paramzzsm)
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
      case 10: 
        localObject = paramzzsm.readString();
        this.name = ((String)localObject);
        break;
      case 18: 
        localObject = paramzzsm.readString();
        this.zzamJ = ((String)localObject);
        break;
      case 24: 
        long l = paramzzsm.zzJa();
        localObject = Long.valueOf(l);
        this.zzbai = ((Long)localObject);
        break;
      case 37: 
        float f = paramzzsm.readFloat();
        localObject = Float.valueOf(f);
        this.zzaZo = ((Float)localObject);
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
    localObject1 = this.zzamJ;
    if (localObject1 != null)
    {
      localObject2 = this.zzamJ;
      j = zzsn.zzo(2, (String)localObject2);
      i += j;
    }
    localObject1 = this.zzbai;
    if (localObject1 != null)
    {
      localObject2 = this.zzbai;
      long l = ((Long)localObject2).longValue();
      j = zzsn.zzd(3, l);
      i += j;
    }
    localObject1 = this.zzaZo;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZo;
      float f = ((Float)localObject2).floatValue();
      j = zzsn.zzc(4, f);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqb$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */