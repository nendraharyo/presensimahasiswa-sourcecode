package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzso;
import com.google.android.gms.internal.zzsq;

public final class zzas
  extends zzso
{
  public int versionCode;
  public long zzarV;
  public long zzarW;
  public long zzarX;
  
  public zzas()
  {
    zztk();
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
      boolean bool3 = paramObject instanceof zzas;
      if (bool3)
      {
        paramObject = (zzas)paramObject;
        int i = this.versionCode;
        int j = ((zzas)paramObject).versionCode;
        if (i == j)
        {
          long l1 = this.zzarV;
          long l2 = ((zzas)paramObject).zzarV;
          boolean bool4 = l1 < l2;
          if (!bool4)
          {
            l1 = this.zzarW;
            l2 = ((zzas)paramObject).zzarW;
            bool4 = l1 < l2;
            if (!bool4)
            {
              l1 = this.zzarX;
              l2 = ((zzas)paramObject).zzarX;
              bool4 = l1 < l2;
              if (!bool4)
              {
                zzsq localzzsq2 = this.zzbuj;
                if (localzzsq2 != null)
                {
                  localzzsq2 = this.zzbuj;
                  bool4 = localzzsq2.isEmpty();
                  if (!bool4) {}
                }
                else
                {
                  localzzsq2 = ((zzas)paramObject).zzbuj;
                  if (localzzsq2 != null)
                  {
                    localzzsq2 = ((zzas)paramObject).zzbuj;
                    bool4 = localzzsq2.isEmpty();
                    if (!bool4) {
                      continue;
                    }
                  }
                  bool2 = bool1;
                  continue;
                }
                localzzsq1 = this.zzbuj;
                zzsq localzzsq3 = ((zzas)paramObject).zzbuj;
                bool2 = localzzsq1.equals(localzzsq3);
              }
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 32;
    int j = (getClass().getName().hashCode() + 527) * 31;
    int n = this.versionCode;
    j = (j + n) * 31;
    long l1 = this.zzarV;
    long l2 = this.zzarV >>> i;
    n = (int)(l1 ^ l2);
    j = (j + n) * 31;
    l1 = this.zzarW;
    l2 = this.zzarW >>> i;
    n = (int)(l1 ^ l2);
    j = (j + n) * 31;
    l1 = this.zzarX;
    l2 = this.zzarX >>> i;
    l1 ^= l2;
    n = (int)l1;
    j += n;
    n = j * 31;
    zzsq localzzsq = this.zzbuj;
    int k;
    if (localzzsq != null)
    {
      localzzsq = this.zzbuj;
      k = localzzsq.isEmpty();
      if (k == 0) {}
    }
    else
    {
      k = 0;
      localzzsq = null;
    }
    for (;;)
    {
      return k + n;
      localzzsq = this.zzbuj;
      int m = localzzsq.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = this.versionCode;
    paramzzsn.zzA(1, i);
    long l = this.zzarV;
    paramzzsn.zzc(2, l);
    l = this.zzarW;
    paramzzsn.zzc(3, l);
    l = this.zzarX;
    paramzzsn.zzc(4, l);
    super.writeTo(paramzzsn);
  }
  
  public zzas zzl(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      long l;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        int j = paramzzsm.zzJb();
        this.versionCode = j;
        break;
      case 16: 
        l = paramzzsm.zzJe();
        this.zzarV = l;
        break;
      case 24: 
        l = paramzzsm.zzJe();
        this.zzarW = l;
        break;
      case 32: 
        l = paramzzsm.zzJe();
        this.zzarX = l;
      }
    }
  }
  
  public zzas zztk()
  {
    long l = -1;
    this.versionCode = 1;
    this.zzarV = l;
    this.zzarW = l;
    this.zzarX = l;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    int j = this.versionCode;
    int k = zzsn.zzC(1, j);
    i += k;
    long l = this.zzarV;
    k = zzsn.zze(2, l);
    i += k;
    l = this.zzarW;
    k = zzsn.zze(3, l);
    i += k;
    l = this.zzarX;
    k = zzsn.zze(4, l);
    return i + k;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzas.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */