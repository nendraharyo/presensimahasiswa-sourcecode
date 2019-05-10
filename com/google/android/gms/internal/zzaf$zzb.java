package com.google.android.gms.internal;

public final class zzaf$zzb
  extends zzso
{
  private static volatile zzb[] zzis;
  public int name;
  public int[] zzit;
  public int zziu;
  public boolean zziv;
  public boolean zziw;
  
  public zzaf$zzb()
  {
    zzD();
  }
  
  public static zzb[] zzC()
  {
    zzb[] arrayOfzzb = zzis;
    if (arrayOfzzb == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzb = zzis;
      if (arrayOfzzb == null)
      {
        arrayOfzzb = null;
        arrayOfzzb = new zzb[0];
        zzis = arrayOfzzb;
      }
      return zzis;
    }
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
      boolean bool3 = paramObject instanceof zzb;
      if (bool3)
      {
        paramObject = (zzb)paramObject;
        Object localObject = this.zzit;
        int[] arrayOfInt = ((zzb)paramObject).zzit;
        bool3 = zzss.equals((int[])localObject, arrayOfInt);
        if (bool3)
        {
          int i = this.zziu;
          int j = ((zzb)paramObject).zziu;
          if (i == j)
          {
            i = this.name;
            j = ((zzb)paramObject).name;
            if (i == j)
            {
              boolean bool4 = this.zziv;
              boolean bool5 = ((zzb)paramObject).zziv;
              if (bool4 == bool5)
              {
                bool4 = this.zziw;
                bool5 = ((zzb)paramObject).zziw;
                if (bool4 == bool5)
                {
                  localObject = this.zzbuj;
                  if (localObject != null)
                  {
                    localObject = this.zzbuj;
                    bool4 = ((zzsq)localObject).isEmpty();
                    if (!bool4) {}
                  }
                  else
                  {
                    localObject = ((zzb)paramObject).zzbuj;
                    if (localObject != null)
                    {
                      localObject = ((zzb)paramObject).zzbuj;
                      bool4 = ((zzsq)localObject).isEmpty();
                      if (!bool4) {
                        continue;
                      }
                    }
                    bool2 = bool1;
                    continue;
                  }
                  localzzsq1 = this.zzbuj;
                  zzsq localzzsq2 = ((zzb)paramObject).zzbuj;
                  bool2 = localzzsq1.equals(localzzsq2);
                }
              }
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 1237;
    float f = 1.733E-42F;
    int j = 1231;
    Object localObject = getClass().getName();
    int k = (((String)localObject).hashCode() + 527) * 31;
    int[] arrayOfInt = this.zzit;
    int i3 = zzss.hashCode(arrayOfInt);
    k = (k + i3) * 31;
    i3 = this.zziu;
    k = (k + i3) * 31;
    i3 = this.name;
    i3 = (k + i3) * 31;
    int m = this.zziv;
    label124:
    int i1;
    if (m != 0)
    {
      m = j;
      int n = (m + i3) * 31;
      boolean bool = this.zziw;
      if (!bool) {
        break label182;
      }
      n += j;
      j = n * 31;
      localObject = this.zzbuj;
      if (localObject != null)
      {
        localObject = this.zzbuj;
        i1 = ((zzsq)localObject).isEmpty();
        if (i1 == 0) {
          break label187;
        }
      }
      i1 = 0;
      localObject = null;
    }
    for (;;)
    {
      return i1 + j;
      i1 = i;
      break;
      label182:
      j = i;
      break label124;
      label187:
      localObject = this.zzbuj;
      int i2 = ((zzsq)localObject).hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = this.zziw;
    if (i != 0)
    {
      i = 1;
      boolean bool2 = this.zziw;
      paramzzsn.zze(i, bool2);
    }
    int j = 2;
    int m = this.zziu;
    paramzzsn.zzA(j, m);
    int[] arrayOfInt1 = this.zzit;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzit;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          int[] arrayOfInt2 = this.zzit;
          m = arrayOfInt2.length;
          if (j >= m) {
            break;
          }
          m = 3;
          int[] arrayOfInt3 = this.zzit;
          int n = arrayOfInt3[j];
          paramzzsn.zzA(m, n);
          j += 1;
        }
      }
    }
    j = this.name;
    if (j != 0)
    {
      j = 4;
      m = this.name;
      paramzzsn.zzA(j, m);
    }
    boolean bool1 = this.zziv;
    if (bool1)
    {
      int k = 6;
      boolean bool3 = this.zziv;
      paramzzsn.zze(k, bool3);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzb zzD()
  {
    int[] arrayOfInt = zzsx.zzbuw;
    this.zzit = arrayOfInt;
    this.zziu = 0;
    this.name = 0;
    this.zziv = false;
    this.zziw = false;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzb zzb(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      boolean bool1;
      int j;
      int k;
      int[] arrayOfInt1;
      int[] arrayOfInt2;
      int m;
      switch (i)
      {
      default: 
        bool1 = zza(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 8: 
        bool1 = paramzzsm.zzJc();
        this.zziw = bool1;
        break;
      case 16: 
        j = paramzzsm.zzJb();
        this.zziu = j;
        break;
      case 24: 
        j = 24;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzit;
        if (arrayOfInt1 == null)
        {
          j = 0;
          arrayOfInt1 = null;
        }
        for (;;)
        {
          k += j;
          arrayOfInt2 = new int[k];
          if (j != 0)
          {
            int[] arrayOfInt3 = this.zzit;
            System.arraycopy(arrayOfInt3, 0, arrayOfInt2, 0, j);
          }
          for (;;)
          {
            m = arrayOfInt2.length + -1;
            if (j >= m) {
              break;
            }
            m = paramzzsm.zzJb();
            arrayOfInt2[j] = m;
            paramzzsm.zzIX();
            j += 1;
          }
          arrayOfInt1 = this.zzit;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzit = arrayOfInt2;
        break;
      case 26: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
        int n;
        for (;;)
        {
          n = paramzzsm.zzJk();
          if (n <= 0) {
            break;
          }
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(k);
        arrayOfInt2 = this.zzit;
        if (arrayOfInt2 == null)
        {
          k = 0;
          arrayOfInt2 = null;
        }
        for (;;)
        {
          j += k;
          arrayOfInt1 = new int[j];
          if (k != 0)
          {
            int[] arrayOfInt4 = this.zzit;
            System.arraycopy(arrayOfInt4, 0, arrayOfInt1, 0, k);
          }
          for (;;)
          {
            n = arrayOfInt1.length;
            if (k >= n) {
              break;
            }
            n = paramzzsm.zzJb();
            arrayOfInt1[k] = n;
            k += 1;
          }
          arrayOfInt2 = this.zzit;
          k = arrayOfInt2.length;
        }
        this.zzit = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 32: 
        j = paramzzsm.zzJb();
        this.name = j;
        break;
      case 48: 
        boolean bool2 = paramzzsm.zzJc();
        this.zziv = bool2;
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int[] arrayOfInt1 = null;
    int k = super.zzz();
    boolean bool2 = this.zziw;
    if (bool2)
    {
      boolean bool3 = this.zziw;
      m = zzsn.zzf(1, bool3);
      k += m;
    }
    int i1 = this.zziu;
    int m = zzsn.zzC(2, i1) + k;
    int[] arrayOfInt2 = this.zzit;
    if (arrayOfInt2 != null)
    {
      arrayOfInt2 = this.zzit;
      k = arrayOfInt2.length;
      if (k > 0)
      {
        k = 0;
        arrayOfInt2 = null;
        for (;;)
        {
          int[] arrayOfInt3 = this.zzit;
          i1 = arrayOfInt3.length;
          if (k >= i1) {
            break;
          }
          arrayOfInt3 = this.zzit;
          i1 = zzsn.zzmx(arrayOfInt3[k]);
          i += i1;
          k += 1;
        }
        k = m + i;
        arrayOfInt1 = this.zzit;
        i = arrayOfInt1.length * 1;
        k += i;
      }
    }
    for (;;)
    {
      i = this.name;
      if (i != 0)
      {
        m = this.name;
        i = zzsn.zzC(4, m);
        k += i;
      }
      boolean bool1 = this.zziv;
      int n;
      if (bool1)
      {
        n = this.zziv;
        int j = zzsn.zzf(6, n);
        k += j;
      }
      return k;
      k = n;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */