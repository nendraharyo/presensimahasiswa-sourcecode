package com.google.android.gms.internal;

public final class zzqb$zzf
  extends zzsu
{
  public long[] zzbaG;
  public long[] zzbaH;
  
  public zzqb$zzf()
  {
    zzDY();
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
        long[] arrayOfLong1 = this.zzbaG;
        long[] arrayOfLong2 = ((zzf)paramObject).zzbaG;
        bool2 = zzss.equals(arrayOfLong1, arrayOfLong2);
        if (!bool2)
        {
          bool1 = false;
        }
        else
        {
          arrayOfLong1 = this.zzbaH;
          arrayOfLong2 = ((zzf)paramObject).zzbaH;
          bool2 = zzss.equals(arrayOfLong1, arrayOfLong2);
          if (!bool2) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int j = zzss.hashCode(this.zzbaG);
    i = (i + j) * 31;
    j = zzss.hashCode(this.zzbaH);
    return i + j;
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 0;
    long[] arrayOfLong1 = this.zzbaG;
    int j;
    long[] arrayOfLong2;
    if (arrayOfLong1 != null)
    {
      arrayOfLong1 = this.zzbaG;
      j = arrayOfLong1.length;
      if (j > 0)
      {
        j = 0;
        arrayOfLong1 = null;
        for (;;)
        {
          arrayOfLong2 = this.zzbaG;
          int k = arrayOfLong2.length;
          if (j >= k) {
            break;
          }
          k = 1;
          long[] arrayOfLong3 = this.zzbaG;
          long l1 = arrayOfLong3[j];
          paramzzsn.zza(k, l1);
          j += 1;
        }
      }
    }
    arrayOfLong1 = this.zzbaH;
    if (arrayOfLong1 != null)
    {
      arrayOfLong1 = this.zzbaH;
      j = arrayOfLong1.length;
      if (j > 0) {
        for (;;)
        {
          arrayOfLong1 = this.zzbaH;
          j = arrayOfLong1.length;
          if (i >= j) {
            break;
          }
          j = 2;
          arrayOfLong2 = this.zzbaH;
          long l2 = arrayOfLong2[i];
          paramzzsn.zza(j, l2);
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zzf zzDY()
  {
    long[] arrayOfLong = zzsx.zzbux;
    this.zzbaG = arrayOfLong;
    arrayOfLong = zzsx.zzbux;
    this.zzbaH = arrayOfLong;
    this.zzbuu = -1;
    return this;
  }
  
  public zzf zzH(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      int k;
      long[] arrayOfLong1;
      long[] arrayOfLong2;
      long[] arrayOfLong3;
      int m;
      long l;
      int n;
      long[] arrayOfLong4;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = 8;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfLong1 = this.zzbaG;
        if (arrayOfLong1 == null)
        {
          j = 0;
          arrayOfLong1 = null;
        }
        for (;;)
        {
          k += j;
          arrayOfLong2 = new long[k];
          if (j != 0)
          {
            arrayOfLong3 = this.zzbaG;
            System.arraycopy(arrayOfLong3, 0, arrayOfLong2, 0, j);
          }
          for (;;)
          {
            m = arrayOfLong2.length + -1;
            if (j >= m) {
              break;
            }
            l = paramzzsm.zzIZ();
            arrayOfLong2[j] = l;
            paramzzsm.zzIX();
            j += 1;
          }
          arrayOfLong1 = this.zzbaG;
          j = arrayOfLong1.length;
        }
        l = paramzzsm.zzIZ();
        arrayOfLong2[j] = l;
        this.zzbaG = arrayOfLong2;
        break;
      case 10: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfLong1 = null;
        for (;;)
        {
          n = paramzzsm.zzJk();
          if (n <= 0) {
            break;
          }
          paramzzsm.zzIZ();
          j += 1;
        }
        paramzzsm.zzms(k);
        arrayOfLong2 = this.zzbaG;
        if (arrayOfLong2 == null)
        {
          k = 0;
          arrayOfLong2 = null;
        }
        for (;;)
        {
          j += k;
          arrayOfLong1 = new long[j];
          if (k != 0)
          {
            arrayOfLong4 = this.zzbaG;
            System.arraycopy(arrayOfLong4, 0, arrayOfLong1, 0, k);
          }
          for (;;)
          {
            n = arrayOfLong1.length;
            if (k >= n) {
              break;
            }
            l = paramzzsm.zzIZ();
            arrayOfLong1[k] = l;
            k += 1;
          }
          arrayOfLong2 = this.zzbaG;
          k = arrayOfLong2.length;
        }
        this.zzbaG = arrayOfLong1;
        paramzzsm.zzmr(m);
        break;
      case 16: 
        j = 16;
        k = zzsx.zzc(paramzzsm, j);
        arrayOfLong1 = this.zzbaH;
        if (arrayOfLong1 == null)
        {
          j = 0;
          arrayOfLong1 = null;
        }
        for (;;)
        {
          k += j;
          arrayOfLong2 = new long[k];
          if (j != 0)
          {
            arrayOfLong3 = this.zzbaH;
            System.arraycopy(arrayOfLong3, 0, arrayOfLong2, 0, j);
          }
          for (;;)
          {
            m = arrayOfLong2.length + -1;
            if (j >= m) {
              break;
            }
            l = paramzzsm.zzIZ();
            arrayOfLong2[j] = l;
            paramzzsm.zzIX();
            j += 1;
          }
          arrayOfLong1 = this.zzbaH;
          j = arrayOfLong1.length;
        }
        l = paramzzsm.zzIZ();
        arrayOfLong2[j] = l;
        this.zzbaH = arrayOfLong2;
        break;
      case 18: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        arrayOfLong1 = null;
        for (;;)
        {
          n = paramzzsm.zzJk();
          if (n <= 0) {
            break;
          }
          paramzzsm.zzIZ();
          j += 1;
        }
        paramzzsm.zzms(k);
        arrayOfLong2 = this.zzbaH;
        if (arrayOfLong2 == null)
        {
          k = 0;
          arrayOfLong2 = null;
        }
        for (;;)
        {
          j += k;
          arrayOfLong1 = new long[j];
          if (k != 0)
          {
            arrayOfLong4 = this.zzbaH;
            System.arraycopy(arrayOfLong4, 0, arrayOfLong1, 0, k);
          }
          for (;;)
          {
            n = arrayOfLong1.length;
            if (k >= n) {
              break;
            }
            l = paramzzsm.zzIZ();
            arrayOfLong1[k] = l;
            k += 1;
          }
          arrayOfLong2 = this.zzbaH;
          k = arrayOfLong2.length;
        }
        this.zzbaH = arrayOfLong1;
        paramzzsm.zzmr(m);
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    long[] arrayOfLong1 = null;
    int j = super.zzz();
    long[] arrayOfLong2 = this.zzbaG;
    int k;
    int m;
    long[] arrayOfLong3;
    long l;
    if (arrayOfLong2 != null)
    {
      arrayOfLong2 = this.zzbaG;
      k = arrayOfLong2.length;
      if (k > 0)
      {
        k = 0;
        arrayOfLong2 = null;
        m = 0;
        arrayOfLong3 = null;
        for (;;)
        {
          long[] arrayOfLong4 = this.zzbaG;
          int n = arrayOfLong4.length;
          if (k >= n) {
            break;
          }
          arrayOfLong4 = this.zzbaG;
          l = arrayOfLong4[k];
          n = zzsn.zzar(l);
          m += n;
          k += 1;
        }
        k = j + m;
        arrayOfLong3 = this.zzbaG;
        m = arrayOfLong3.length * 1;
        k += m;
      }
    }
    for (;;)
    {
      arrayOfLong3 = this.zzbaH;
      if (arrayOfLong3 != null)
      {
        arrayOfLong3 = this.zzbaH;
        m = arrayOfLong3.length;
        if (m > 0)
        {
          m = 0;
          arrayOfLong3 = null;
          for (;;)
          {
            long[] arrayOfLong5 = this.zzbaH;
            j = arrayOfLong5.length;
            if (i >= j) {
              break;
            }
            arrayOfLong5 = this.zzbaH;
            l = arrayOfLong5[i];
            j = zzsn.zzar(l);
            m += j;
            i += 1;
          }
          k += m;
          arrayOfLong1 = this.zzbaH;
          i = arrayOfLong1.length * 1;
          k += i;
        }
      }
      return k;
      k = j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqb$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */