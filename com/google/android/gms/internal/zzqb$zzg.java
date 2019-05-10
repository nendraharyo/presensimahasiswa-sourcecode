package com.google.android.gms.internal;

public final class zzqb$zzg
  extends zzsu
{
  private static volatile zzg[] zzbaI;
  public String name;
  public Float zzaZo;
  public String zzamJ;
  public Long zzbaJ;
  public Long zzbai;
  
  public zzqb$zzg()
  {
    zzEa();
  }
  
  public static zzg[] zzDZ()
  {
    zzg[] arrayOfzzg = zzbaI;
    if (arrayOfzzg == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzg = zzbaI;
      if (arrayOfzzg == null)
      {
        arrayOfzzg = null;
        arrayOfzzg = new zzg[0];
        zzbaI = arrayOfzzg;
      }
      return zzbaI;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzg;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzg)paramObject;
        Object localObject1 = this.zzbaJ;
        Object localObject2;
        if (localObject1 == null)
        {
          localObject1 = ((zzg)paramObject).zzbaJ;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbaJ;
          localObject2 = ((zzg)paramObject).zzbaJ;
          bool2 = ((Long)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.name;
        if (localObject1 == null)
        {
          localObject1 = ((zzg)paramObject).name;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.name;
          localObject2 = ((zzg)paramObject).name;
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
          localObject1 = ((zzg)paramObject).zzamJ;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzamJ;
          localObject2 = ((zzg)paramObject).zzamJ;
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
          localObject1 = ((zzg)paramObject).zzbai;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbai;
          localObject2 = ((zzg)paramObject).zzbai;
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
          localObject1 = ((zzg)paramObject).zzaZo;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZo;
          localObject2 = ((zzg)paramObject).zzaZo;
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
    Object localObject = this.zzbaJ;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.name;
      if (localObject != null) {
        break label160;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = this.zzamJ;
      if (localObject != null) {
        break label175;
      }
      j = 0;
      localObject = null;
      label95:
      j += k;
      k = j * 31;
      localObject = this.zzbai;
      if (localObject != null) {
        break label190;
      }
      j = 0;
      localObject = null;
      label122:
      j = (j + k) * 31;
      Float localFloat2 = this.zzaZo;
      if (localFloat2 != null) {
        break label205;
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.zzbaJ;
      j = ((Long)localObject).hashCode();
      break;
      label160:
      localObject = this.name;
      j = ((String)localObject).hashCode();
      break label68;
      label175:
      localObject = this.zzamJ;
      j = ((String)localObject).hashCode();
      break label95;
      label190:
      localObject = this.zzbai;
      j = ((Long)localObject).hashCode();
      break label122;
      label205:
      localFloat1 = this.zzaZo;
      i = localFloat1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzbaJ;
    int i;
    Object localObject2;
    long l;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.zzbaJ;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.name;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.name;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzamJ;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzamJ;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzbai;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.zzbai;
      l = ((Long)localObject2).longValue();
      paramzzsn.zzb(i, l);
    }
    localObject1 = this.zzaZo;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = this.zzaZo;
      float f = ((Float)localObject2).floatValue();
      paramzzsn.zzb(i, f);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzg zzEa()
  {
    this.zzbaJ = null;
    this.name = null;
    this.zzamJ = null;
    this.zzbai = null;
    this.zzaZo = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzg zzI(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      long l;
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
        l = paramzzsm.zzJa();
        localObject = Long.valueOf(l);
        this.zzbaJ = ((Long)localObject);
        break;
      case 18: 
        localObject = paramzzsm.readString();
        this.name = ((String)localObject);
        break;
      case 26: 
        localObject = paramzzsm.readString();
        this.zzamJ = ((String)localObject);
        break;
      case 32: 
        l = paramzzsm.zzJa();
        localObject = Long.valueOf(l);
        this.zzbai = ((Long)localObject);
        break;
      case 45: 
        float f = paramzzsm.readFloat();
        localObject = Float.valueOf(f);
        this.zzaZo = ((Float)localObject);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.zzbaJ;
    Object localObject2;
    long l;
    int j;
    if (localObject1 != null)
    {
      localObject2 = this.zzbaJ;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(1, l);
      i += j;
    }
    localObject1 = this.name;
    if (localObject1 != null)
    {
      localObject2 = this.name;
      j = zzsn.zzo(2, (String)localObject2);
      i += j;
    }
    localObject1 = this.zzamJ;
    if (localObject1 != null)
    {
      localObject2 = this.zzamJ;
      j = zzsn.zzo(3, (String)localObject2);
      i += j;
    }
    localObject1 = this.zzbai;
    if (localObject1 != null)
    {
      localObject2 = this.zzbai;
      l = ((Long)localObject2).longValue();
      j = zzsn.zzd(4, l);
      i += j;
    }
    localObject1 = this.zzaZo;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZo;
      float f = ((Float)localObject2).floatValue();
      j = zzsn.zzc(5, f);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqb$zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */