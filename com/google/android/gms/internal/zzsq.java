package com.google.android.gms.internal;

public final class zzsq
  implements Cloneable
{
  private static final zzsr zzbum;
  private int mSize;
  private boolean zzbun = false;
  private int[] zzbuo;
  private zzsr[] zzbup;
  
  static
  {
    zzsr localzzsr = new com/google/android/gms/internal/zzsr;
    localzzsr.<init>();
    zzbum = localzzsr;
  }
  
  zzsq()
  {
    this(10);
  }
  
  zzsq(int paramInt)
  {
    int i = idealIntArraySize(paramInt);
    int[] arrayOfInt = new int[i];
    this.zzbuo = arrayOfInt;
    zzsr[] arrayOfzzsr = new zzsr[i];
    this.zzbup = arrayOfzzsr;
    this.mSize = 0;
  }
  
  private void gc()
  {
    int i = this.mSize;
    int[] arrayOfInt = this.zzbuo;
    zzsr[] arrayOfzzsr = this.zzbup;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      zzsr localzzsr1 = arrayOfzzsr[j];
      zzsr localzzsr2 = zzbum;
      if (localzzsr1 != localzzsr2)
      {
        if (j != k)
        {
          int m = arrayOfInt[j];
          arrayOfInt[k] = m;
          arrayOfzzsr[k] = localzzsr1;
          localzzsr1 = null;
          arrayOfzzsr[j] = null;
        }
        k += 1;
      }
      j += 1;
    }
    this.zzbun = false;
    this.mSize = k;
  }
  
  private int idealByteArraySize(int paramInt)
  {
    int i = 1;
    int j = 4;
    for (;;)
    {
      int k = 32;
      if (j < k)
      {
        k = (i << j) + -12;
        if (paramInt <= k)
        {
          j = i << j;
          paramInt = j + -12;
        }
      }
      else
      {
        return paramInt;
      }
      j += 1;
    }
  }
  
  private int idealIntArraySize(int paramInt)
  {
    int i = paramInt * 4;
    return idealByteArraySize(i) / 4;
  }
  
  private boolean zza(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    boolean bool = false;
    int i = 0;
    if (i < paramInt)
    {
      int j = paramArrayOfInt1[i];
      int k = paramArrayOfInt2[i];
      if (j == k) {}
    }
    for (;;)
    {
      return bool;
      i += 1;
      break;
      bool = true;
    }
  }
  
  private boolean zza(zzsr[] paramArrayOfzzsr1, zzsr[] paramArrayOfzzsr2, int paramInt)
  {
    boolean bool1 = false;
    int i = 0;
    if (i < paramInt)
    {
      zzsr localzzsr1 = paramArrayOfzzsr1[i];
      zzsr localzzsr2 = paramArrayOfzzsr2[i];
      boolean bool2 = localzzsr1.equals(localzzsr2);
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      i += 1;
      break;
      bool1 = true;
    }
  }
  
  private int zzmH(int paramInt)
  {
    int i = 0;
    int j = this.mSize + -1;
    int k;
    for (;;)
    {
      if (i > j) {
        break label67;
      }
      k = i + j >>> 1;
      int[] arrayOfInt = this.zzbuo;
      int m = arrayOfInt[k];
      if (m < paramInt)
      {
        i = k + 1;
      }
      else
      {
        if (m <= paramInt) {
          break;
        }
        j = k + -1;
      }
    }
    label67:
    for (j = k;; j = i ^ 0xFFFFFFFF) {
      return j;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzsq;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzsq)paramObject;
        int i = size();
        int j = ((zzsq)paramObject).size();
        if (i != j)
        {
          bool1 = false;
        }
        else
        {
          Object localObject1 = this.zzbuo;
          Object localObject2 = ((zzsq)paramObject).zzbuo;
          int k = this.mSize;
          boolean bool3 = zza((int[])localObject1, (int[])localObject2, k);
          if (bool3)
          {
            localObject1 = this.zzbup;
            localObject2 = ((zzsq)paramObject).zzbup;
            k = this.mSize;
            bool3 = zza((zzsr[])localObject1, (zzsr[])localObject2, k);
            if (bool3) {}
          }
          else
          {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.zzbun;
    if (i != 0) {
      gc();
    }
    int k = 17;
    i = 0;
    for (;;)
    {
      int m = this.mSize;
      if (i >= m) {
        break;
      }
      k *= 31;
      int n = this.zzbuo[i];
      k = (k + n) * 31;
      zzsr localzzsr = this.zzbup[i];
      n = localzzsr.hashCode();
      k += n;
      int j;
      i += 1;
    }
    return k;
  }
  
  public boolean isEmpty()
  {
    int i = size();
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  int size()
  {
    boolean bool = this.zzbun;
    if (bool) {
      gc();
    }
    return this.mSize;
  }
  
  public final zzsq zzJq()
  {
    int i = 0;
    int j = size();
    zzsq localzzsq = new com/google/android/gms/internal/zzsq;
    localzzsq.<init>(j);
    Object localObject1 = this.zzbuo;
    Object localObject2 = localzzsq.zzbuo;
    System.arraycopy(localObject1, 0, localObject2, 0, j);
    while (i < j)
    {
      localObject1 = this.zzbup[i];
      if (localObject1 != null)
      {
        localObject1 = localzzsq.zzbup;
        localObject2 = this.zzbup[i].zzJr();
        localObject1[i] = localObject2;
      }
      i += 1;
    }
    localzzsq.mSize = j;
    return localzzsq;
  }
  
  void zza(int paramInt, zzsr paramzzsr)
  {
    int i = zzmH(paramInt);
    Object localObject1;
    if (i >= 0)
    {
      localObject1 = this.zzbup;
      localObject1[i] = paramzzsr;
    }
    for (;;)
    {
      return;
      i ^= 0xFFFFFFFF;
      int j = this.mSize;
      if (i < j)
      {
        localObject1 = this.zzbup[i];
        localObject2 = zzbum;
        if (localObject1 == localObject2)
        {
          this.zzbuo[i] = paramInt;
          localObject1 = this.zzbup;
          localObject1[i] = paramzzsr;
          continue;
        }
      }
      boolean bool = this.zzbun;
      if (bool)
      {
        k = this.mSize;
        localObject2 = this.zzbuo;
        m = localObject2.length;
        if (k >= m)
        {
          gc();
          i = zzmH(paramInt) ^ 0xFFFFFFFF;
        }
      }
      int k = this.mSize;
      Object localObject2 = this.zzbuo;
      int m = localObject2.length;
      int n;
      if (k >= m)
      {
        k = this.mSize + 1;
        k = idealIntArraySize(k);
        localObject2 = new int[k];
        localObject1 = new zzsr[k];
        Object localObject3 = this.zzbuo;
        n = this.zzbuo.length;
        System.arraycopy(localObject3, 0, localObject2, 0, n);
        localObject3 = this.zzbup;
        zzsr[] arrayOfzzsr = this.zzbup;
        n = arrayOfzzsr.length;
        System.arraycopy(localObject3, 0, localObject1, 0, n);
        this.zzbuo = ((int[])localObject2);
        this.zzbup = ((zzsr[])localObject1);
      }
      k = this.mSize - i;
      if (k != 0)
      {
        localObject1 = this.zzbuo;
        localObject2 = this.zzbuo;
        int i1 = i + 1;
        n = this.mSize - i;
        System.arraycopy(localObject1, i, localObject2, i1, n);
        localObject1 = this.zzbup;
        localObject2 = this.zzbup;
        i1 = i + 1;
        n = this.mSize - i;
        System.arraycopy(localObject1, i, localObject2, i1, n);
      }
      this.zzbuo[i] = paramInt;
      localObject1 = this.zzbup;
      localObject1[i] = paramzzsr;
      i = this.mSize + 1;
      this.mSize = i;
    }
  }
  
  zzsr zzmF(int paramInt)
  {
    int i = zzmH(paramInt);
    Object localObject;
    if (i >= 0)
    {
      localObject = this.zzbup[i];
      zzsr localzzsr1 = zzbum;
      if (localObject != localzzsr1) {}
    }
    else
    {
      i = 0;
    }
    for (zzsr localzzsr2 = null;; localzzsr2 = localObject[i])
    {
      return localzzsr2;
      localObject = this.zzbup;
    }
  }
  
  zzsr zzmG(int paramInt)
  {
    boolean bool = this.zzbun;
    if (bool) {
      gc();
    }
    return this.zzbup[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */