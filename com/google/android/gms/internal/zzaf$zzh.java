package com.google.android.gms.internal;

public final class zzaf$zzh
  extends zzso
{
  public static final zzsp zzjh = zzsp.zza(11, zzh.class, 810L);
  private static final zzh[] zzji = new zzh[0];
  public int[] zzjj;
  public int[] zzjk;
  public int[] zzjl;
  public int zzjm;
  public int[] zzjn;
  public int zzjo;
  public int zzjp;
  
  public zzaf$zzh()
  {
    zzM();
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
      boolean bool3 = paramObject instanceof zzh;
      if (bool3)
      {
        paramObject = (zzh)paramObject;
        Object localObject = this.zzjj;
        int[] arrayOfInt = ((zzh)paramObject).zzjj;
        bool3 = zzss.equals((int[])localObject, arrayOfInt);
        if (bool3)
        {
          localObject = this.zzjk;
          arrayOfInt = ((zzh)paramObject).zzjk;
          bool3 = zzss.equals((int[])localObject, arrayOfInt);
          if (bool3)
          {
            localObject = this.zzjl;
            arrayOfInt = ((zzh)paramObject).zzjl;
            bool3 = zzss.equals((int[])localObject, arrayOfInt);
            if (bool3)
            {
              int i = this.zzjm;
              int k = ((zzh)paramObject).zzjm;
              if (i == k)
              {
                localObject = this.zzjn;
                arrayOfInt = ((zzh)paramObject).zzjn;
                boolean bool4 = zzss.equals((int[])localObject, arrayOfInt);
                if (bool4)
                {
                  int j = this.zzjo;
                  k = ((zzh)paramObject).zzjo;
                  if (j == k)
                  {
                    j = this.zzjp;
                    k = ((zzh)paramObject).zzjp;
                    if (j == k)
                    {
                      localObject = this.zzbuj;
                      boolean bool5;
                      if (localObject != null)
                      {
                        localObject = this.zzbuj;
                        bool5 = ((zzsq)localObject).isEmpty();
                        if (!bool5) {}
                      }
                      else
                      {
                        localObject = ((zzh)paramObject).zzbuj;
                        if (localObject != null)
                        {
                          localObject = ((zzh)paramObject).zzbuj;
                          bool5 = ((zzsq)localObject).isEmpty();
                          if (!bool5) {
                            continue;
                          }
                        }
                        bool2 = bool1;
                        continue;
                      }
                      localzzsq1 = this.zzbuj;
                      zzsq localzzsq2 = ((zzh)paramObject).zzbuj;
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
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = zzss.hashCode(this.zzjj);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzjk);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzjl);
    i = (i + m) * 31;
    m = this.zzjm;
    i = (i + m) * 31;
    int[] arrayOfInt = this.zzjn;
    m = zzss.hashCode(arrayOfInt);
    i = (i + m) * 31;
    m = this.zzjo;
    i = (i + m) * 31;
    m = this.zzjp;
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
    int[] arrayOfInt1 = this.zzjj;
    int[] arrayOfInt2;
    int k;
    int[] arrayOfInt3;
    int m;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjj;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzjj;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 1;
          arrayOfInt3 = this.zzjj;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzjk;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjk;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzjk;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 2;
          arrayOfInt3 = this.zzjk;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    arrayOfInt1 = this.zzjl;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjl;
      j = arrayOfInt1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfInt1 = null;
        for (;;)
        {
          arrayOfInt2 = this.zzjl;
          k = arrayOfInt2.length;
          if (j >= k) {
            break;
          }
          k = 3;
          arrayOfInt3 = this.zzjl;
          m = arrayOfInt3[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    int j = this.zzjm;
    if (j != 0)
    {
      j = 4;
      k = this.zzjm;
      paramzzsn.zzA(j, k);
    }
    arrayOfInt1 = this.zzjn;
    if (arrayOfInt1 != null)
    {
      arrayOfInt1 = this.zzjn;
      j = arrayOfInt1.length;
      if (j > 0) {
        for (;;)
        {
          arrayOfInt1 = this.zzjn;
          j = arrayOfInt1.length;
          if (i >= j) {
            break;
          }
          j = 5;
          arrayOfInt2 = this.zzjn;
          k = arrayOfInt2[i];
          paramzzsn.zzA(j, k);
          i += 1;
        }
      }
    }
    j = this.zzjo;
    if (j != 0)
    {
      j = 6;
      i = this.zzjo;
      paramzzsn.zzA(j, i);
    }
    j = this.zzjp;
    if (j != 0)
    {
      j = 7;
      i = this.zzjp;
      paramzzsn.zzA(j, i);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzh zzM()
  {
    int[] arrayOfInt = zzsx.zzbuw;
    this.zzjj = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzjk = arrayOfInt;
    arrayOfInt = zzsx.zzbuw;
    this.zzjl = arrayOfInt;
    this.zzjm = 0;
    arrayOfInt = zzsx.zzbuw;
    this.zzjn = arrayOfInt;
    this.zzjo = 0;
    this.zzjp = 0;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzh zzh(zzsm paramzzsm)
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
        arrayOfInt1 = this.zzjj;
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
            arrayOfInt3 = this.zzjj;
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
          arrayOfInt1 = this.zzjj;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjj = arrayOfInt2;
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
        arrayOfInt2 = this.zzjj;
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
            arrayOfInt4 = this.zzjj;
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
          arrayOfInt2 = this.zzjj;
          k = arrayOfInt2.length;
        }
        this.zzjj = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 16: 
        j = 16;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzjk;
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
            arrayOfInt3 = this.zzjk;
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
          arrayOfInt1 = this.zzjk;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjk = arrayOfInt2;
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
        arrayOfInt2 = this.zzjk;
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
            arrayOfInt4 = this.zzjk;
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
          arrayOfInt2 = this.zzjk;
          k = arrayOfInt2.length;
        }
        this.zzjk = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 24: 
        j = 24;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzjl;
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
            arrayOfInt3 = this.zzjl;
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
          arrayOfInt1 = this.zzjl;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjl = arrayOfInt2;
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
        arrayOfInt2 = this.zzjl;
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
            arrayOfInt4 = this.zzjl;
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
          arrayOfInt2 = this.zzjl;
          k = arrayOfInt2.length;
        }
        this.zzjl = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 32: 
        j = paramzzsm.zzJb();
        this.zzjm = j;
        break;
      case 40: 
        j = 40;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfInt1 = this.zzjn;
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
            arrayOfInt3 = this.zzjn;
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
          arrayOfInt1 = this.zzjn;
          j = arrayOfInt1.length;
        }
        m = paramzzsm.zzJb();
        arrayOfInt2[j] = m;
        this.zzjn = arrayOfInt2;
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
        arrayOfInt2 = this.zzjn;
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
            arrayOfInt4 = this.zzjn;
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
          arrayOfInt2 = this.zzjn;
          k = arrayOfInt2.length;
        }
        this.zzjn = arrayOfInt1;
        paramzzsm.zzmr(m);
        break;
      case 48: 
        j = paramzzsm.zzJb();
        this.zzjo = j;
        break;
      case 56: 
        j = paramzzsm.zzJb();
        this.zzjp = j;
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int[] arrayOfInt1 = null;
    int j = super.zzz();
    int[] arrayOfInt2 = this.zzjj;
    int k;
    int m;
    int[] arrayOfInt3;
    int[] arrayOfInt4;
    int n;
    if (arrayOfInt2 != null)
    {
      arrayOfInt2 = this.zzjj;
      k = arrayOfInt2.length;
      if (k > 0)
      {
        k = 0;
        arrayOfInt2 = null;
        m = 0;
        arrayOfInt3 = null;
        for (;;)
        {
          arrayOfInt4 = this.zzjj;
          n = arrayOfInt4.length;
          if (k >= n) {
            break;
          }
          arrayOfInt4 = this.zzjj;
          n = zzsn.zzmx(arrayOfInt4[k]);
          m += n;
          k += 1;
        }
        k = j + m;
        arrayOfInt3 = this.zzjj;
        m = arrayOfInt3.length * 1;
        k += m;
      }
    }
    for (;;)
    {
      arrayOfInt3 = this.zzjk;
      int[] arrayOfInt5;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzjk;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zzjk;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zzjk;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zzjk;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      arrayOfInt3 = this.zzjl;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzjl;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          j = 0;
          arrayOfInt5 = null;
          for (;;)
          {
            arrayOfInt4 = this.zzjl;
            n = arrayOfInt4.length;
            if (m >= n) {
              break;
            }
            arrayOfInt4 = this.zzjl;
            n = zzsn.zzmx(arrayOfInt4[m]);
            j += n;
            m += 1;
          }
          k += j;
          arrayOfInt3 = this.zzjl;
          m = arrayOfInt3.length * 1;
          k += m;
        }
      }
      m = this.zzjm;
      if (m != 0)
      {
        j = this.zzjm;
        m = zzsn.zzC(4, j);
        k += m;
      }
      arrayOfInt3 = this.zzjn;
      if (arrayOfInt3 != null)
      {
        arrayOfInt3 = this.zzjn;
        m = arrayOfInt3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfInt3 = null;
          for (;;)
          {
            arrayOfInt5 = this.zzjn;
            j = arrayOfInt5.length;
            if (i >= j) {
              break;
            }
            arrayOfInt5 = this.zzjn;
            j = zzsn.zzmx(arrayOfInt5[i]);
            m += j;
            i += 1;
          }
          k += m;
          arrayOfInt1 = this.zzjn;
          i = arrayOfInt1.length * 1;
          k += i;
        }
      }
      i = this.zzjo;
      if (i != 0)
      {
        m = this.zzjo;
        i = zzsn.zzC(6, m);
        k += i;
      }
      i = this.zzjp;
      if (i != 0)
      {
        m = this.zzjp;
        i = zzsn.zzC(7, m);
        k += i;
      }
      return k;
      k = j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */