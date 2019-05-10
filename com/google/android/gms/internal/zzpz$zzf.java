package com.google.android.gms.internal;

public final class zzpz$zzf
  extends zzsu
{
  public Integer zzaZN;
  public String zzaZO;
  public Boolean zzaZP;
  public String[] zzaZQ;
  
  public zzpz$zzf()
  {
    zzDJ();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzf;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzf)paramObject;
        Object localObject1 = this.zzaZN;
        if (localObject1 == null)
        {
          localObject1 = ((zzf)paramObject).zzaZN;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZN;
          localObject2 = ((zzf)paramObject).zzaZN;
          bool2 = ((Integer)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZO;
        if (localObject1 == null)
        {
          localObject1 = ((zzf)paramObject).zzaZO;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZO;
          localObject2 = ((zzf)paramObject).zzaZO;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZP;
        if (localObject1 == null)
        {
          localObject1 = ((zzf)paramObject).zzaZP;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZP;
          localObject2 = ((zzf)paramObject).zzaZP;
          bool2 = ((Boolean)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZQ;
        Object localObject2 = ((zzf)paramObject).zzaZQ;
        bool2 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (!bool2) {
          bool1 = false;
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
    Object localObject = this.zzaZN;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzaZO;
      if (localObject != null) {
        break label121;
      }
      j = 0;
      localObject = null;
      label68:
      j = (j + k) * 31;
      Boolean localBoolean2 = this.zzaZP;
      if (localBoolean2 != null) {
        break label136;
      }
    }
    for (;;)
    {
      j = (j + i) * 31;
      i = zzss.hashCode(this.zzaZQ);
      return j + i;
      localObject = this.zzaZN;
      j = ((Integer)localObject).intValue();
      break;
      label121:
      localObject = this.zzaZO;
      j = ((String)localObject).hashCode();
      break label68;
      label136:
      localBoolean1 = this.zzaZP;
      i = localBoolean1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzaZN;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.zzaZN;
      int j = ((Integer)localObject2).intValue();
      paramzzsn.zzA(i, j);
    }
    localObject1 = this.zzaZO;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzaZO;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzaZP;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzaZP;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    localObject1 = this.zzaZQ;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZQ;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzaZQ;
          int k = localObject2.length;
          if (i >= k) {
            break;
          }
          localObject2 = this.zzaZQ[i];
          if (localObject2 != null)
          {
            int m = 4;
            paramzzsn.zzn(m, (String)localObject2);
          }
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zzf zzDJ()
  {
    this.zzaZN = null;
    this.zzaZO = null;
    this.zzaZP = null;
    String[] arrayOfString = zzsx.zzbuB;
    this.zzaZQ = arrayOfString;
    this.zzbuu = -1;
    return this;
  }
  
  public zzf zzy(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
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
        case 5: 
        case 6: 
          localObject1 = Integer.valueOf(j);
          this.zzaZN = ((Integer)localObject1);
        }
        break;
      case 18: 
        localObject1 = paramzzsm.readString();
        this.zzaZO = ((String)localObject1);
        break;
      case 24: 
        boolean bool2 = paramzzsm.zzJc();
        localObject1 = Boolean.valueOf(bool2);
        this.zzaZP = ((Boolean)localObject1);
        break;
      case 34: 
        int k = 34;
        int m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zzaZQ;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
        }
        String[] arrayOfString;
        for (;;)
        {
          m += k;
          arrayOfString = new String[m];
          if (k != 0)
          {
            localObject2 = this.zzaZQ;
            System.arraycopy(localObject2, 0, arrayOfString, 0, k);
          }
          for (;;)
          {
            int n = arrayOfString.length + -1;
            if (k >= n) {
              break;
            }
            localObject2 = paramzzsm.readString();
            arrayOfString[k] = localObject2;
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.zzaZQ;
          k = localObject1.length;
        }
        Object localObject2 = paramzzsm.readString();
        arrayOfString[k] = localObject2;
        this.zzaZQ = arrayOfString;
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int j = super.zzz();
    Object localObject1 = this.zzaZN;
    Object localObject2;
    int n;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZN;
      int k = ((Integer)localObject2).intValue();
      n = zzsn.zzC(1, k);
      j += n;
    }
    localObject1 = this.zzaZO;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZO;
      n = zzsn.zzo(2, (String)localObject2);
      j += n;
    }
    localObject1 = this.zzaZP;
    boolean bool;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZP;
      bool = ((Boolean)localObject2).booleanValue();
      n = zzsn.zzf(3, bool);
      j += n;
    }
    localObject1 = this.zzaZQ;
    if (localObject1 != null)
    {
      localObject1 = this.zzaZQ;
      n = localObject1.length;
      if (n > 0)
      {
        n = 0;
        localObject1 = null;
        bool = false;
        localObject2 = null;
        int m;
        for (;;)
        {
          Object localObject3 = this.zzaZQ;
          int i1 = localObject3.length;
          if (i >= i1) {
            break;
          }
          localObject3 = this.zzaZQ[i];
          if (localObject3 != null)
          {
            bool += true;
            i1 = zzsn.zzgO((String)localObject3);
            n += i1;
          }
          i += 1;
        }
        j += n;
        i = m * 1;
        j += i;
      }
    }
    return j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpz$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */