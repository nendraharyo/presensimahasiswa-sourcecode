package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzso;
import com.google.android.gms.internal.zzsq;

public final class zzau
  extends zzso
{
  public long zzarW;
  public long zzarZ;
  
  public zzau()
  {
    zztm();
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
      boolean bool3 = paramObject instanceof zzau;
      if (bool3)
      {
        paramObject = (zzau)paramObject;
        long l1 = this.zzarZ;
        long l2 = ((zzau)paramObject).zzarZ;
        bool3 = l1 < l2;
        if (!bool3)
        {
          l1 = this.zzarW;
          l2 = ((zzau)paramObject).zzarW;
          bool3 = l1 < l2;
          if (!bool3)
          {
            zzsq localzzsq2 = this.zzbuj;
            if (localzzsq2 != null)
            {
              localzzsq2 = this.zzbuj;
              bool3 = localzzsq2.isEmpty();
              if (!bool3) {}
            }
            else
            {
              localzzsq2 = ((zzau)paramObject).zzbuj;
              if (localzzsq2 != null)
              {
                localzzsq2 = ((zzau)paramObject).zzbuj;
                bool3 = localzzsq2.isEmpty();
                if (!bool3) {
                  continue;
                }
              }
              bool2 = bool1;
              continue;
            }
            localzzsq1 = this.zzbuj;
            zzsq localzzsq3 = ((zzau)paramObject).zzbuj;
            bool2 = localzzsq1.equals(localzzsq3);
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 32;
    int j = (getClass().getName().hashCode() + 527) * 31;
    long l1 = this.zzarZ;
    long l2 = this.zzarZ >>> i;
    int n = (int)(l1 ^ l2);
    j = (j + n) * 31;
    l1 = this.zzarW;
    l2 = this.zzarW >>> i;
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
    long l = this.zzarZ;
    paramzzsn.zzc(1, l);
    l = this.zzarW;
    paramzzsn.zzc(2, l);
    super.writeTo(paramzzsn);
  }
  
  public zzau zzn(zzsm paramzzsm)
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
        l = paramzzsm.zzJe();
        this.zzarZ = l;
        break;
      case 16: 
        l = paramzzsm.zzJe();
        this.zzarW = l;
      }
    }
  }
  
  public zzau zztm()
  {
    long l = -1;
    this.zzarZ = l;
    this.zzarW = l;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    long l = this.zzarZ;
    int j = zzsn.zze(1, l);
    i += j;
    l = this.zzarW;
    j = zzsn.zze(2, l);
    return i + j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzau.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */