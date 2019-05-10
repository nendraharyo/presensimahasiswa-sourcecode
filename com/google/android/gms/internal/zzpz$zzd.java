package com.google.android.gms.internal;

public final class zzpz$zzd
  extends zzsu
{
  public Integer zzaZF;
  public Boolean zzaZG;
  public String zzaZH;
  public String zzaZI;
  public String zzaZJ;
  
  public zzpz$zzd()
  {
    zzDG();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzd;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzd)paramObject;
        Object localObject1 = this.zzaZF;
        Object localObject2;
        if (localObject1 == null)
        {
          localObject1 = ((zzd)paramObject).zzaZF;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZF;
          localObject2 = ((zzd)paramObject).zzaZF;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZG;
        if (localObject1 == null)
        {
          localObject1 = ((zzd)paramObject).zzaZG;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZG;
          localObject2 = ((zzd)paramObject).zzaZG;
          bool2 = ((Boolean)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZH;
        if (localObject1 == null)
        {
          localObject1 = ((zzd)paramObject).zzaZH;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZH;
          localObject2 = ((zzd)paramObject).zzaZH;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZI;
        if (localObject1 == null)
        {
          localObject1 = ((zzd)paramObject).zzaZI;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZI;
          localObject2 = ((zzd)paramObject).zzaZI;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZJ;
        if (localObject1 == null)
        {
          localObject1 = ((zzd)paramObject).zzaZJ;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZJ;
          localObject2 = ((zzd)paramObject).zzaZJ;
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
    Object localObject = this.zzaZF;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzaZG;
      if (localObject != null) {
        break label160;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = this.zzaZH;
      if (localObject != null) {
        break label175;
      }
      j = 0;
      localObject = null;
      label95:
      j += k;
      k = j * 31;
      localObject = this.zzaZI;
      if (localObject != null) {
        break label190;
      }
      j = 0;
      localObject = null;
      label122:
      j = (j + k) * 31;
      String str2 = this.zzaZJ;
      if (str2 != null) {
        break label205;
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.zzaZF;
      j = ((Integer)localObject).intValue();
      break;
      label160:
      localObject = this.zzaZG;
      j = ((Boolean)localObject).hashCode();
      break label68;
      label175:
      localObject = this.zzaZH;
      j = ((String)localObject).hashCode();
      break label95;
      label190:
      localObject = this.zzaZI;
      j = ((String)localObject).hashCode();
      break label122;
      label205:
      str1 = this.zzaZJ;
      i = str1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzaZF;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.zzaZF;
      int j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    localObject1 = this.zzaZG;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzaZG;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    localObject1 = this.zzaZH;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzaZH;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzaZI;
    if (localObject1 != null)
    {
      i = 4;
      localObject2 = this.zzaZI;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzaZJ;
    if (localObject1 != null)
    {
      i = 5;
      localObject2 = this.zzaZJ;
      paramzzsn.zzn(i, (String)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzd zzDG()
  {
    this.zzaZF = null;
    this.zzaZG = null;
    this.zzaZH = null;
    this.zzaZI = null;
    this.zzaZJ = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzd zzw(zzsm paramzzsm)
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
        switch (j)
        {
        default: 
          break;
        case 0: 
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          localObject = Integer.valueOf(j);
          this.zzaZF = ((Integer)localObject);
        }
        break;
      case 16: 
        boolean bool2 = paramzzsm.zzJc();
        localObject = Boolean.valueOf(bool2);
        this.zzaZG = ((Boolean)localObject);
        break;
      case 26: 
        localObject = paramzzsm.readString();
        this.zzaZH = ((String)localObject);
        break;
      case 34: 
        localObject = paramzzsm.readString();
        this.zzaZI = ((String)localObject);
        break;
      case 42: 
        localObject = paramzzsm.readString();
        this.zzaZJ = ((String)localObject);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.zzaZF;
    Object localObject2;
    int k;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZF;
      int j = ((Integer)localObject2).intValue();
      k = zzsn.zzC(1, j);
      i += k;
    }
    localObject1 = this.zzaZG;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZG;
      boolean bool = ((Boolean)localObject2).booleanValue();
      k = zzsn.zzf(2, bool);
      i += k;
    }
    localObject1 = this.zzaZH;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZH;
      k = zzsn.zzo(3, (String)localObject2);
      i += k;
    }
    localObject1 = this.zzaZI;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZI;
      k = zzsn.zzo(4, (String)localObject2);
      i += k;
    }
    localObject1 = this.zzaZJ;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZJ;
      k = zzsn.zzo(5, (String)localObject2);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpz$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */