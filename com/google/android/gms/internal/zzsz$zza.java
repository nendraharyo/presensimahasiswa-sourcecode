package com.google.android.gms.internal;

public final class zzsz$zza
  extends zzso
{
  public String[] zzbuI;
  public String[] zzbuJ;
  public int[] zzbuK;
  public long[] zzbuL;
  
  public zzsz$zza()
  {
    zzJC();
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
        Object localObject1 = this.zzbuI;
        Object localObject2 = ((zza)paramObject).zzbuI;
        bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (bool3)
        {
          localObject1 = this.zzbuJ;
          localObject2 = ((zza)paramObject).zzbuJ;
          bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
          if (bool3)
          {
            localObject1 = this.zzbuK;
            localObject2 = ((zza)paramObject).zzbuK;
            bool3 = zzss.equals((int[])localObject1, (int[])localObject2);
            if (bool3)
            {
              localObject1 = this.zzbuL;
              localObject2 = ((zza)paramObject).zzbuL;
              bool3 = zzss.equals((long[])localObject1, (long[])localObject2);
              if (bool3)
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
                  localObject1 = ((zza)paramObject).zzbuj;
                  if (localObject1 != null)
                  {
                    localObject1 = ((zza)paramObject).zzbuj;
                    bool3 = ((zzsq)localObject1).isEmpty();
                    if (!bool3) {
                      continue;
                    }
                  }
                  bool2 = bool1;
                  continue;
                }
                localzzsq1 = this.zzbuj;
                zzsq localzzsq2 = ((zza)paramObject).zzbuj;
                bool2 = localzzsq1.equals(localzzsq2);
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
    int m = zzss.hashCode(this.zzbuI);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzbuJ);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzbuK);
    i = (i + m) * 31;
    long[] arrayOfLong = this.zzbuL;
    m = zzss.hashCode(arrayOfLong);
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
    Object localObject1 = this.zzbuI;
    int j;
    Object localObject2;
    int k;
    int m;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuI;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbuI;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzbuI[j];
          if (localObject2 != null)
          {
            m = 1;
            paramzzsn.zzn(m, (String)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzbuJ;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuJ;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbuJ;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzbuJ[j];
          if (localObject2 != null)
          {
            m = 2;
            paramzzsn.zzn(m, (String)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzbuK;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuK;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbuK;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          k = 3;
          int[] arrayOfInt = this.zzbuK;
          m = arrayOfInt[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    localObject1 = this.zzbuL;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuL;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = this.zzbuL;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          j = 4;
          localObject2 = this.zzbuL;
          long l = localObject2[i];
          paramzzsn.zzb(j, l);
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzJC()
  {
    Object localObject = zzsx.zzbuB;
    this.zzbuI = ((String[])localObject);
    localObject = zzsx.zzbuB;
    this.zzbuJ = ((String[])localObject);
    localObject = zzsx.zzbuw;
    this.zzbuK = ((int[])localObject);
    localObject = zzsx.zzbux;
    this.zzbuL = ((long[])localObject);
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zza zzS(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      int k;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      int m;
      int n;
      Object localObject4;
      long l;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        j = 10;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbuI;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new String[k];
          if (j != 0)
          {
            localObject3 = this.zzbuI;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = paramzzsm.readString();
            localObject2[j] = localObject3;
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbuI;
          j = localObject1.length;
        }
        localObject3 = paramzzsm.readString();
        localObject2[j] = localObject3;
        this.zzbuI = ((String[])localObject2);
        break;
      case 18: 
        j = 18;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbuJ;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new String[k];
          if (j != 0)
          {
            localObject3 = this.zzbuJ;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = paramzzsm.readString();
            localObject2[j] = localObject3;
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbuJ;
          j = localObject1.length;
        }
        localObject3 = paramzzsm.readString();
        localObject2[j] = localObject3;
        this.zzbuJ = ((String[])localObject2);
        break;
      case 24: 
        j = 24;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbuK;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new int[k];
          if (j != 0)
          {
            localObject3 = this.zzbuK;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            m = paramzzsm.zzJb();
            localObject2[j] = m;
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbuK;
          j = localObject1.length;
        }
        m = paramzzsm.zzJb();
        localObject2[j] = m;
        this.zzbuK = ((int[])localObject2);
        break;
      case 26: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        localObject1 = null;
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
        localObject2 = this.zzbuK;
        if (localObject2 == null)
        {
          k = 0;
          localObject2 = null;
        }
        for (;;)
        {
          j += k;
          localObject1 = new int[j];
          if (k != 0)
          {
            localObject4 = this.zzbuK;
            System.arraycopy(localObject4, 0, localObject1, 0, k);
          }
          for (;;)
          {
            n = localObject1.length;
            if (k >= n) {
              break;
            }
            n = paramzzsm.zzJb();
            localObject1[k] = n;
            k += 1;
          }
          localObject2 = this.zzbuK;
          k = localObject2.length;
        }
        this.zzbuK = ((int[])localObject1);
        paramzzsm.zzmr(m);
        break;
      case 32: 
        j = 32;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbuL;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new long[k];
          if (j != 0)
          {
            localObject3 = this.zzbuL;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            l = paramzzsm.zzJa();
            localObject2[j] = l;
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbuL;
          j = localObject1.length;
        }
        l = paramzzsm.zzJa();
        localObject2[j] = l;
        this.zzbuL = ((long[])localObject2);
        break;
      case 34: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        localObject1 = null;
        for (;;)
        {
          n = paramzzsm.zzJk();
          if (n <= 0) {
            break;
          }
          paramzzsm.zzJa();
          j += 1;
        }
        paramzzsm.zzms(k);
        localObject2 = this.zzbuL;
        if (localObject2 == null)
        {
          k = 0;
          localObject2 = null;
        }
        for (;;)
        {
          j += k;
          localObject1 = new long[j];
          if (k != 0)
          {
            localObject4 = this.zzbuL;
            System.arraycopy(localObject4, 0, localObject1, 0, k);
          }
          for (;;)
          {
            n = localObject1.length;
            if (k >= n) {
              break;
            }
            l = paramzzsm.zzJa();
            localObject1[k] = l;
            k += 1;
          }
          localObject2 = this.zzbuL;
          k = localObject2.length;
        }
        this.zzbuL = ((long[])localObject1);
        paramzzsm.zzmr(m);
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    long[] arrayOfLong1 = null;
    int j = super.zzz();
    String[] arrayOfString = this.zzbuI;
    int k;
    int m;
    Object localObject1;
    int n;
    long[] arrayOfLong2;
    Object localObject2;
    int i1;
    if (arrayOfString != null)
    {
      arrayOfString = this.zzbuI;
      k = arrayOfString.length;
      if (k > 0)
      {
        k = 0;
        arrayOfString = null;
        m = 0;
        localObject1 = null;
        n = 0;
        arrayOfLong2 = null;
        for (;;)
        {
          localObject2 = this.zzbuI;
          i1 = localObject2.length;
          if (k >= i1) {
            break;
          }
          localObject2 = this.zzbuI[k];
          if (localObject2 != null)
          {
            n += 1;
            i1 = zzsn.zzgO((String)localObject2);
            m += i1;
          }
          k += 1;
        }
        k = j + m;
        m = n * 1;
        k += m;
      }
    }
    for (;;)
    {
      localObject1 = this.zzbuJ;
      int[] arrayOfInt;
      if (localObject1 != null)
      {
        localObject1 = this.zzbuJ;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          n = 0;
          arrayOfLong2 = null;
          j = 0;
          arrayOfInt = null;
          for (;;)
          {
            localObject2 = this.zzbuJ;
            i1 = localObject2.length;
            if (m >= i1) {
              break;
            }
            localObject2 = this.zzbuJ[m];
            if (localObject2 != null)
            {
              j += 1;
              i1 = zzsn.zzgO((String)localObject2);
              n += i1;
            }
            m += 1;
          }
          k += n;
          m = j * 1;
          k += m;
        }
      }
      localObject1 = this.zzbuK;
      if (localObject1 != null)
      {
        localObject1 = this.zzbuK;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          n = 0;
          arrayOfLong2 = null;
          for (;;)
          {
            arrayOfInt = this.zzbuK;
            j = arrayOfInt.length;
            if (m >= j) {
              break;
            }
            arrayOfInt = this.zzbuK;
            j = zzsn.zzmx(arrayOfInt[m]);
            n += j;
            m += 1;
          }
          k += n;
          localObject1 = this.zzbuK;
          m = localObject1.length * 1;
          k += m;
        }
      }
      localObject1 = this.zzbuL;
      if (localObject1 != null)
      {
        localObject1 = this.zzbuL;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          for (;;)
          {
            arrayOfLong2 = this.zzbuL;
            n = arrayOfLong2.length;
            if (i >= n) {
              break;
            }
            arrayOfLong2 = this.zzbuL;
            long l = arrayOfLong2[i];
            n = zzsn.zzas(l);
            m += n;
            i += 1;
          }
          k += m;
          arrayOfLong1 = this.zzbuL;
          i = arrayOfLong1.length * 1;
          k += i;
        }
      }
      return k;
      k = j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsz$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */