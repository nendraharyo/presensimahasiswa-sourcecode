package com.google.android.gms.internal;

public final class zzsy$zzb
  extends zzsu
{
  private static volatile zzb[] zzbuF;
  public String name;
  public Integer zzbuG;
  public Boolean zzbuH;
  
  public zzsy$zzb()
  {
    zzJB();
  }
  
  public static zzb[] zzJA()
  {
    zzb[] arrayOfzzb = zzbuF;
    if (arrayOfzzb == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzb = zzbuF;
      if (arrayOfzzb == null)
      {
        arrayOfzzb = null;
        arrayOfzzb = new zzb[0];
        zzbuF = arrayOfzzb;
      }
      return zzbuF;
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
        Object localObject1 = this.name;
        Object localObject2;
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
        localObject1 = this.zzbuG;
        if (localObject1 == null)
        {
          localObject1 = ((zzb)paramObject).zzbuG;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbuG;
          localObject2 = ((zzb)paramObject).zzbuG;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzbuH;
        if (localObject1 == null)
        {
          localObject1 = ((zzb)paramObject).zzbuH;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzbuH;
          localObject2 = ((zzb)paramObject).zzbuH;
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
    Object localObject = this.name;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzbuG;
      if (localObject != null) {
        break label106;
      }
      j = 0;
      localObject = null;
      label68:
      j = (j + k) * 31;
      Boolean localBoolean2 = this.zzbuH;
      if (localBoolean2 != null) {
        break label121;
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.name;
      j = ((String)localObject).hashCode();
      break;
      label106:
      localObject = this.zzbuG;
      j = ((Integer)localObject).intValue();
      break label68;
      label121:
      localBoolean1 = this.zzbuH;
      i = localBoolean1.hashCode();
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
    localObject1 = this.zzbuG;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzbuG;
      int j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    localObject1 = this.zzbuH;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.zzbuH;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzb zzJB()
  {
    this.name = null;
    this.zzbuG = null;
    this.zzbuH = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzb zzR(zzsm paramzzsm)
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
      case 10: 
        localObject = paramzzsm.readString();
        this.name = ((String)localObject);
        break;
      case 24: 
        int j = paramzzsm.zzJb();
        switch (j)
        {
        default: 
          break;
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
          localObject = Integer.valueOf(j);
          this.zzbuG = ((Integer)localObject);
        }
        break;
      case 32: 
        boolean bool2 = paramzzsm.zzJc();
        localObject = Boolean.valueOf(bool2);
        this.zzbuH = ((Boolean)localObject);
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
    localObject1 = this.zzbuG;
    if (localObject1 != null)
    {
      localObject2 = this.zzbuG;
      int k = ((Integer)localObject2).intValue();
      j = zzsn.zzC(3, k);
      i += j;
    }
    localObject1 = this.zzbuH;
    if (localObject1 != null)
    {
      localObject2 = this.zzbuH;
      boolean bool = ((Boolean)localObject2).booleanValue();
      j = zzsn.zzf(4, bool);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsy$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */