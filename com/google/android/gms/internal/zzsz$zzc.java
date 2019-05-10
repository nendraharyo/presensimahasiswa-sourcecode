package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzsz$zzc
  extends zzso
{
  public byte[] zzbuO;
  public byte[][] zzbuP;
  public boolean zzbuQ;
  
  public zzsz$zzc()
  {
    zzJE();
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
      boolean bool3 = paramObject instanceof zzc;
      if (bool3)
      {
        paramObject = (zzc)paramObject;
        Object localObject1 = this.zzbuO;
        Object localObject2 = ((zzc)paramObject).zzbuO;
        bool3 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
        if (bool3)
        {
          localObject1 = this.zzbuP;
          localObject2 = ((zzc)paramObject).zzbuP;
          bool3 = zzss.zza((byte[][])localObject1, (byte[][])localObject2);
          if (bool3)
          {
            bool3 = this.zzbuQ;
            boolean bool4 = ((zzc)paramObject).zzbuQ;
            if (bool3 == bool4)
            {
              localObject1 = this.zzbuj;
              if (localObject1 != null)
              {
                localObject1 = this.zzbuj;
                bool3 = ((zzsq)localObject1).isEmpty();
                if (!bool3) {}
              }
              else
              {
                localObject1 = ((zzc)paramObject).zzbuj;
                if (localObject1 != null)
                {
                  localObject1 = ((zzc)paramObject).zzbuj;
                  bool3 = ((zzsq)localObject1).isEmpty();
                  if (!bool3) {
                    continue;
                  }
                }
                bool2 = bool1;
                continue;
              }
              localzzsq1 = this.zzbuj;
              zzsq localzzsq2 = ((zzc)paramObject).zzbuj;
              bool2 = localzzsq1.equals(localzzsq2);
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object localObject = getClass().getName();
    int i = (((String)localObject).hashCode() + 527) * 31;
    int n = Arrays.hashCode(this.zzbuO);
    i = (i + n) * 31;
    byte[][] arrayOfByte = this.zzbuP;
    n = zzss.zza(arrayOfByte);
    n = (i + n) * 31;
    boolean bool = this.zzbuQ;
    int k;
    if (bool)
    {
      int j = 1231;
      j += n;
      n = j * 31;
      localObject = this.zzbuj;
      if (localObject != null)
      {
        localObject = this.zzbuj;
        k = ((zzsq)localObject).isEmpty();
        if (k == 0) {
          break label114;
        }
      }
      k = 0;
      localObject = null;
    }
    for (;;)
    {
      return k + n;
      int m = 1237;
      break;
      label114:
      localObject = this.zzbuj;
      m = ((zzsq)localObject).hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzbuO;
    Object localObject2 = zzsx.zzbuD;
    int i = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    if (i == 0)
    {
      i = 1;
      localObject2 = this.zzbuO;
      paramzzsn.zza(i, (byte[])localObject2);
    }
    localObject1 = this.zzbuP;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuP;
      int j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbuP;
          int m = localObject2.length;
          if (j >= m) {
            break;
          }
          localObject2 = this.zzbuP[j];
          if (localObject2 != null)
          {
            int n = 2;
            paramzzsn.zza(n, (byte[])localObject2);
          }
          j += 1;
        }
      }
    }
    boolean bool1 = this.zzbuQ;
    if (bool1)
    {
      int k = 3;
      boolean bool2 = this.zzbuQ;
      paramzzsn.zze(k, bool2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzc zzJE()
  {
    Object localObject = zzsx.zzbuD;
    this.zzbuO = ((byte[])localObject);
    localObject = zzsx.zzbuC;
    this.zzbuP = ((byte[][])localObject);
    this.zzbuQ = false;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzc zzU(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject1;
      switch (i)
      {
      default: 
        boolean bool1 = zza(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 10: 
        localObject1 = paramzzsm.readBytes();
        this.zzbuO = ((byte[])localObject1);
        break;
      case 18: 
        int j = 18;
        int k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbuP;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        byte[][] arrayOfByte;
        for (;;)
        {
          k += j;
          arrayOfByte = new byte[k][];
          if (j != 0)
          {
            localObject2 = this.zzbuP;
            System.arraycopy(localObject2, 0, arrayOfByte, 0, j);
          }
          for (;;)
          {
            int m = arrayOfByte.length + -1;
            if (j >= m) {
              break;
            }
            localObject2 = paramzzsm.readBytes();
            arrayOfByte[j] = localObject2;
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbuP;
          j = localObject1.length;
        }
        Object localObject2 = paramzzsm.readBytes();
        arrayOfByte[j] = localObject2;
        this.zzbuP = arrayOfByte;
        break;
      case 24: 
        boolean bool2 = paramzzsm.zzJc();
        this.zzbuQ = bool2;
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int k = super.zzz();
    Object localObject1 = this.zzbuO;
    byte[] arrayOfByte = zzsx.zzbuD;
    boolean bool2 = Arrays.equals((byte[])localObject1, arrayOfByte);
    int m;
    if (!bool2)
    {
      arrayOfByte = this.zzbuO;
      m = zzsn.zzb(1, arrayOfByte);
      k += m;
    }
    localObject1 = this.zzbuP;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuP;
      m = localObject1.length;
      if (m > 0)
      {
        m = 0;
        localObject1 = null;
        int n = 0;
        arrayOfByte = null;
        for (;;)
        {
          Object localObject2 = this.zzbuP;
          int i1 = localObject2.length;
          if (i >= i1) {
            break;
          }
          localObject2 = this.zzbuP[i];
          if (localObject2 != null)
          {
            n += 1;
            i1 = zzsn.zzG((byte[])localObject2);
            m += i1;
          }
          i += 1;
        }
        k += m;
        i = n * 1;
        k += i;
      }
    }
    boolean bool1 = this.zzbuQ;
    if (bool1)
    {
      boolean bool3 = this.zzbuQ;
      int j = zzsn.zzf(3, bool3);
      k += j;
    }
    return k;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsz$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */