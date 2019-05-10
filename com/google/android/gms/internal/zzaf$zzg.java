package com.google.android.gms.internal;

public final class zzaf$zzg
  extends zzso
{
  private static volatile zzg[] zziW;
  public int[] zziX;
  public int[] zziY;
  public int[] zziZ;
  public int[] zzja;
  public int[] zzjb;
  public int[] zzjc;
  public int[] zzjd;
  public int[] zzje;
  public int[] zzjf;
  public int[] zzjg;
  
  public zzaf$zzg()
  {
    zzL();
  }
  
  public static zzg[] zzK()
  {
    zzg[] arrayOfzzg = zziW;
    if (arrayOfzzg == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzg = zziW;
      if (arrayOfzzg == null)
      {
        arrayOfzzg = null;
        arrayOfzzg = new zzg[0];
        zziW = arrayOfzzg;
      }
      return zziW;
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
      boolean bool3 = paramObject instanceof zzg;
      if (bool3)
      {
        paramObject = (zzg)paramObject;
        Object localObject = this.zziX;
        int[] arrayOfInt = ((zzg)paramObject).zziX;
        bool3 = zzss.equals((int[])localObject, arrayOfInt);
        if (bool3)
        {
          localObject = this.zziY;
          arrayOfInt = ((zzg)paramObject).zziY;
          bool3 = zzss.equals((int[])localObject, arrayOfInt);
          if (bool3)
          {
            localObject = this.zziZ;
            arrayOfInt = ((zzg)paramObject).zziZ;
            bool3 = zzss.equals((int[])localObject, arrayOfInt);
            if (bool3)
            {
              localObject = this.zzja;
              arrayOfInt = ((zzg)paramObject).zzja;
              bool3 = zzss.equals((int[])localObject, arrayOfInt);
              if (bool3)
              {
                localObject = this.zzjb;
                arrayOfInt = ((zzg)paramObject).zzjb;
                bool3 = zzss.equals((int[])localObject, arrayOfInt);
                if (bool3)
                {
                  localObject = this.zzjc;
                  arrayOfInt = ((zzg)paramObject).zzjc;
                  bool3 = zzss.equals((int[])localObject, arrayOfInt);
                  if (bool3)
                  {
                    localObject = this.zzjd;
                    arrayOfInt = ((zzg)paramObject).zzjd;
                    bool3 = zzss.equals((int[])localObject, arrayOfInt);
                    if (bool3)
                    {
                      localObject = this.zzje;
                      arrayOfInt = ((zzg)paramObject).zzje;
                      bool3 = zzss.equals((int[])localObject, arrayOfInt);
                      if (bool3)
                      {
                        localObject = this.zzjf;
                        arrayOfInt = ((zzg)paramObject).zzjf;
                        bool3 = zzss.equals((int[])localObject, arrayOfInt);
                        if (bool3)
                        {
                          localObject = this.zzjg;
                          arrayOfInt = ((zzg)paramObject).zzjg;
                          bool3 = zzss.equals((int[])localObject, arrayOfInt);
                          if (bool3)
                          {
                            localObject = this.zzbuj;
                            if (localObject != null)
                            {
                              localObject = this.zzbuj;
                              bool3 = ((zzsq)localObject).isEmpty();
                              if (!bool3) {}
                            }
                            else
                            {
                              localObject = ((zzg)paramObject).zzbuj;
                              if (localObject != null)
                              {
                                localObject = ((zzg)paramObject).zzbuj;
                                bool3 = ((zzsq)localObject).isEmpty();
                                if (!bool3) {
                                  continue;
                                }
                              }
                              bool2 = bool1;
                              continue;
                            }
                            localzzsq1 = this.zzbuj;
                            zzsq localzzsq2 = ((zzg)paramObject).zzbuj;
                            bool2 = localzzsq1.equals(localzzsq2);
                          }
                        }
                      }
                    }
                  }
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
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = zzss.hashCode(this.zziX);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zziY);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zziZ);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzja);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzjb);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzjc);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzjd);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzje);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzjf);
    i = (i + m) * 31;
    int[] arrayOfInt = this.zzjg;
    m = zzss.hashCode(arrayOfInt);
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
    int i = 0;
    int[] arrayOfInt1 = this.zziX;
    int j;
    int[] arrayOfInt2;
    int k;
    int[] arrayOfInt3;
    int m;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zziX;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zziX;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 1;
          arrayOfInt3 = this.zziX;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zziY;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zziY;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zziY;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 2;
          arrayOfInt3 = this.zziY;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zziZ;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zziZ;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zziZ;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 3;
          arrayOfInt3 = this.zziZ;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzja;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzja;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzja;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 4;
          arrayOfInt3 = this.zzja;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzjb;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjb;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzjb;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 5;
          arrayOfInt3 = this.zzjb;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzjc;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjc;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzjc;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 6;
          arrayOfInt3 = this.zzjc;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzjd;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjd;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzjd;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 7;
          arrayOfInt3 = this.zzjd;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzje;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzje;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzje;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 8;
          arrayOfInt3 = this.zzje;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzjf;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjf;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzjf;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 9;
          arrayOfInt3 = this.zzjf;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzjg;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjg;
      j = arrayOfInt1.length;
      if (j > 0) {
        for (;;)
        {
          arrayOfInt1 = this.zzjg;
          j = arrayOfInt1.length;
          if (i >= j) {
            break;
          }
          j = 10;
          arrayOfInt2 = this.zzjg;
          k = arrayOfInt2[i];
          paramzzsn.zzA(j, k);
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zzg zzL()
  {
    int[] arrayOfInt = zzsx.zzbuw;
    this.zziX = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zziY = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zziZ = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzja = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzjb = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzjc = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzjd = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzje = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzjf = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzjg = arrayOfInt;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzg zzg(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      int k;
      int[] arrayOfInt1;
      int[] arrayOfInt2;
      int[] arrayOfInt3;
      int m;
      int n;
      int[] arrayOfInt4;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = 8;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zziX;
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
            arrayOfInt3 = this.zziX;
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
          arrayOfInt1 = this.zziX;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zziX = arrayOfInt2;
        break;
      case 10: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zziX;
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
            arrayOfInt4 = this.zziX;
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
          arrayOfInt2 = this.zziX;
          k = arrayOfInt2.length;
        }
        this.zziX = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 16: 
        j = 16;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zziY;
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
            arrayOfInt3 = this.zziY;
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
          arrayOfInt1 = this.zziY;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zziY = arrayOfInt2;
        break;
      case 18: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zziY;
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
            arrayOfInt4 = this.zziY;
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
          arrayOfInt2 = this.zziY;
          k = arrayOfInt2.length;
        }
        this.zziY = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 24: 
        j = 24;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zziZ;
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
            arrayOfInt3 = this.zziZ;
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
          arrayOfInt1 = this.zziZ;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zziZ = arrayOfInt2;
        break;
      case 26: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zziZ;
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
            arrayOfInt4 = this.zziZ;
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
          arrayOfInt2 = this.zziZ;
          k = arrayOfInt2.length;
        }
        this.zziZ = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 32: 
        j = 32;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzja;
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
            arrayOfInt3 = this.zzja;
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
          arrayOfInt1 = this.zzja;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzja = arrayOfInt2;
        break;
      case 34: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zzja;
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
            arrayOfInt4 = this.zzja;
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
          arrayOfInt2 = this.zzja;
          k = arrayOfInt2.length;
        }
        this.zzja = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 40: 
        j = 40;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzjb;
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
            arrayOfInt3 = this.zzjb;
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
          arrayOfInt1 = this.zzjb;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjb = arrayOfInt2;
        break;
      case 42: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zzjb;
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
            arrayOfInt4 = this.zzjb;
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
          arrayOfInt2 = this.zzjb;
          k = arrayOfInt2.length;
        }
        this.zzjb = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 48: 
        j = 48;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzjc;
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
            arrayOfInt3 = this.zzjc;
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
          arrayOfInt1 = this.zzjc;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjc = arrayOfInt2;
        break;
      case 50: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zzjc;
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
            arrayOfInt4 = this.zzjc;
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
          arrayOfInt2 = this.zzjc;
          k = arrayOfInt2.length;
        }
        this.zzjc = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 56: 
        j = 56;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzjd;
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
            arrayOfInt3 = this.zzjd;
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
          arrayOfInt1 = this.zzjd;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjd = arrayOfInt2;
        break;
      case 58: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zzjd;
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
            arrayOfInt4 = this.zzjd;
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
          arrayOfInt2 = this.zzjd;
          k = arrayOfInt2.length;
        }
        this.zzjd = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 64: 
        j = 64;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzje;
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
            arrayOfInt3 = this.zzje;
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
          arrayOfInt1 = this.zzje;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzje = arrayOfInt2;
        break;
      case 66: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zzje;
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
            arrayOfInt4 = this.zzje;
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
          arrayOfInt2 = this.zzje;
          k = arrayOfInt2.length;
        }
        this.zzje = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 72: 
        j = 72;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzjf;
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
            arrayOfInt3 = this.zzjf;
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
          arrayOfInt1 = this.zzjf;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjf = arrayOfInt2;
        break;
      case 74: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zzjf;
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
            arrayOfInt4 = this.zzjf;
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
          arrayOfInt2 = this.zzjf;
          k = arrayOfInt2.length;
        }
        this.zzjf = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 80: 
        j = 80;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzjg;
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
            arrayOfInt3 = this.zzjg;
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
          arrayOfInt1 = this.zzjg;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjg = arrayOfInt2;
        break;
      case 82: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfInt1 = null;
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
        arrayOfInt2 = this.zzjg;
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
            arrayOfInt4 = this.zzjg;
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
          arrayOfInt2 = this.zzjg;
          k = arrayOfInt2.length;
        }
        this.zzjg = arrayOfInt1;
        paramzzsm.zzmr(m);
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int[] arrayOfInt1 = null;
    int j = super.zzz();
    int[] arrayOfInt2 = this.zziX;
    int k;
    int m;
    int[] arrayOfInt3;
    int[] arrayOfInt4;
    int n;
    if (arrayOfInt2 != null)
    {
      arrayOfInt2 = this.zziX;
      k = arrayOfInt2.length;
      if (k > 0)
      {
        k = 0;
        arrayOfInt2 = null;
        m = 0;
        arrayOfInt3 = null;
        for (;;)
        {
          arrayOfInt4 = this.zziX;
          n = arrayOfInt4.length;
          if (k >= n) {
            break;
          }
          arrayOfInt4 = this.zziX;
          n = zzsn.zzmx(arrayOfInt4[k]);
          m += n;
          k += 1;
        }
        k = j + m;
        arrayOfInt3 = this.zziX;
        m = arrayOfInt3.length * 1;
        k += m;
      }
    }
    for (;;)
    {
      arrayOfInt3 = this.zziY;
      int[] arrayOfInt5;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zziY;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zziY;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zziY;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zziY;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zziZ;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zziZ;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zziZ;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zziZ;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zziZ;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zzja;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzja;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zzja;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zzja;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zzja;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zzjb;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzjb;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zzjb;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zzjb;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zzjb;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zzjc;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzjc;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zzjc;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zzjc;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zzjc;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zzjd;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzjd;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zzjd;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zzjd;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zzjd;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zzje;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzje;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zzje;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zzje;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zzje;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zzjf;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzjf;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zzjf;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zzjf;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zzjf;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zzjg;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzjg;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          for (;;)
          {
            arrayOfInt5 = this.zzjg;
            j = arrayOfInt5.length;
            if (i >= j) {
              break;
            }
            arrayOfInt5 = this.zzjg;
            j = zzsn.zzmx(arrayOfInt5[i]);
            m += j;
            i += 1;
          }
          k += m;
          arrayOfInt1 = this.zzjg;
          i = arrayOfInt1.length * 1;
          k += i;
        }
      }
      return k;
      k = j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */