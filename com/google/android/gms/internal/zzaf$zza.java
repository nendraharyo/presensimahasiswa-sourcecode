package com.google.android.gms.internal;

public final class zzaf$zza
  extends zzso
{
  public int level;
  public int zziq;
  public int zzir;
  
  public zzaf$zza()
  {
    zzB();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    zzsq localzzsq1 = null;
    if (paramObject == this) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      boolean bool3 = paramObject instanceof zza;
      if (bool3)
      {
        paramObject = (zza)paramObject;
        int i = this.level;
        int j = ((zza)paramObject).level;
        if (i == j)
        {
          i = this.zziq;
          j = ((zza)paramObject).zziq;
          if (i == j)
          {
            i = this.zzir;
            j = ((zza)paramObject).zzir;
            if (i == j)
            {
              zzsq localzzsq2 = this.zzbuj;
              boolean bool4;
              if (localzzsq2 != null)
              {
                localzzsq2 = this.zzbuj;
                bool4 = localzzsq2.isEmpty();
                if (!bool4) {}
              }
              else
              {
                localzzsq2 = ((zza)paramObject).zzbuj;
                if (localzzsq2 != null)
                {
                  localzzsq2 = ((zza)paramObject).zzbuj;
                  bool4 = localzzsq2.isEmpty();
                  if (!bool4) {
                    continue;
                  }
                }
                bool2 = bool1;
                continue;
              }
              localzzsq1 = this.zzbuj;
              zzsq localzzsq3 = ((zza)paramObject).zzbuj;
              bool2 = localzzsq1.equals(localzzsq3);
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = this.level;
    i = (i + m) * 31;
    m = this.zziq;
    i = (i + m) * 31;
    m = this.zzir;
    i += m;
    m = i * 31;
    zzsq localzzsq = this.zzbuj;
    int j;
    if (localzzsq != null)
    {
      localzzsq = this.zzbuj;
      j = localzzsq.isEmpty();
      if (j == 0) {}
    }
    else
    {
      j = 0;
      localzzsq = null;
    }
    for (;;)
    {
      return j + m;
      localzzsq = this.zzbuj;
      int k = localzzsq.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 1;
    int j = this.level;
    if (j != i)
    {
      j = this.level;
      paramzzsn.zzA(i, j);
    }
    j = this.zziq;
    if (j != 0)
    {
      j = 2;
      i = this.zziq;
      paramzzsn.zzA(j, i);
    }
    j = this.zzir;
    if (j != 0)
    {
      j = 3;
      i = this.zzir;
      paramzzsn.zzA(j, i);
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzB()
  {
    this.level = 1;
    this.zziq = 0;
    this.zzir = 0;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zza zza(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = paramzzsm.zzJb();
        switch (j)
        {
        default: 
          break;
        case 1: 
        case 2: 
        case 3: 
          this.level = j;
        }
        break;
      case 16: 
        j = paramzzsm.zzJb();
        this.zziq = j;
        break;
      case 24: 
        j = paramzzsm.zzJb();
        this.zzir = j;
      }
    }
  }
  
  protected int zzz()
  {
    int i = 1;
    int j = super.zzz();
    int k = this.level;
    if (k != i)
    {
      k = this.level;
      k = zzsn.zzC(i, k);
      j += k;
    }
    k = this.zziq;
    if (k != 0)
    {
      i = this.zziq;
      k = zzsn.zzC(2, i);
      j += k;
    }
    k = this.zzir;
    if (k != 0)
    {
      i = this.zzir;
      k = zzsn.zzC(3, i);
      j += k;
    }
    return j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */