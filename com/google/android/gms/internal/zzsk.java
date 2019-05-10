package com.google.android.gms.internal;

public final class zzsk
  extends zzso
{
  public String[] zzbtT;
  public int[] zzbtU;
  public byte[][] zzbtV;
  
  public zzsk()
  {
    zzIW();
  }
  
  public static zzsk zzB(byte[] paramArrayOfByte)
  {
    zzsk localzzsk = new com/google/android/gms/internal/zzsk;
    localzzsk.<init>();
    return (zzsk)zzsu.mergeFrom(localzzsk, paramArrayOfByte);
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
      boolean bool3 = paramObject instanceof zzsk;
      if (bool3)
      {
        paramObject = (zzsk)paramObject;
        Object localObject1 = this.zzbtT;
        Object localObject2 = ((zzsk)paramObject).zzbtT;
        bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (bool3)
        {
          localObject1 = this.zzbtU;
          localObject2 = ((zzsk)paramObject).zzbtU;
          bool3 = zzss.equals((int[])localObject1, (int[])localObject2);
          if (bool3)
          {
            localObject1 = this.zzbtV;
            localObject2 = ((zzsk)paramObject).zzbtV;
            bool3 = zzss.zza((byte[][])localObject1, (byte[][])localObject2);
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
                localObject1 = ((zzsk)paramObject).zzbuj;
                if (localObject1 != null)
                {
                  localObject1 = ((zzsk)paramObject).zzbuj;
                  bool3 = ((zzsq)localObject1).isEmpty();
                  if (!bool3) {
                    continue;
                  }
                }
                bool2 = bool1;
                continue;
              }
              localzzsq1 = this.zzbuj;
              zzsq localzzsq2 = ((zzsk)paramObject).zzbuj;
              bool2 = localzzsq1.equals(localzzsq2);
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = zzss.hashCode(this.zzbtT);
    i = (i + m) * 31;
    m = zzss.hashCode(this.zzbtU);
    i = (i + m) * 31;
    byte[][] arrayOfByte = this.zzbtV;
    m = zzss.zza(arrayOfByte);
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
    Object localObject1 = this.zzbtT;
    int j;
    Object localObject2;
    int k;
    int m;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtT;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbtT;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzbtT[j];
          if (localObject2 != null)
          {
            m = 1;
            paramzzsn.zzn(m, (String)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzbtU;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtU;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbtU;
          k = localObject2.length;
          if (j >= k) {
            break;
          }
          k = 2;
          int[] arrayOfInt = this.zzbtU;
          m = arrayOfInt[j];
          paramzzsn.zzA(k, m);
          j += 1;
        }
      }
    }
    localObject1 = this.zzbtV;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtV;
      j = localObject1.length;
      if (j > 0) {
        for (;;)
        {
          localObject1 = this.zzbtV;
          j = localObject1.length;
          if (i >= j) {
            break;
          }
          localObject1 = this.zzbtV[i];
          if (localObject1 != null)
          {
            k = 3;
            paramzzsn.zza(k, (byte[])localObject1);
          }
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zzsk zzIW()
  {
    Object localObject = zzsx.zzbuB;
    this.zzbtT = ((String[])localObject);
    localObject = zzsx.zzbuw;
    this.zzbtU = ((int[])localObject);
    localObject = zzsx.zzbuC;
    this.zzbtV = ((byte[][])localObject);
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzsk zzO(zzsm paramzzsm)
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
        localObject1 = this.zzbtT;
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
            localObject3 = this.zzbtT;
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
          localObject1 = this.zzbtT;
          j = localObject1.length;
        }
        localObject3 = paramzzsm.readString();
        localObject2[j] = localObject3;
        this.zzbtT = ((String[])localObject2);
        break;
      case 16: 
        j = 16;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbtU;
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
            localObject3 = this.zzbtU;
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
          localObject1 = this.zzbtU;
          j = localObject1.length;
        }
        m = paramzzsm.zzJb();
        localObject2[j] = m;
        this.zzbtU = ((int[])localObject2);
        break;
      case 18: 
        j = paramzzsm.zzJf();
        m = paramzzsm.zzmq(j);
        k = paramzzsm.getPosition();
        j = 0;
        localObject1 = null;
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
        localObject2 = this.zzbtU;
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
            int[] arrayOfInt = this.zzbtU;
            System.arraycopy(arrayOfInt, 0, localObject1, 0, k);
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
          localObject2 = this.zzbtU;
          k = localObject2.length;
        }
        this.zzbtU = ((int[])localObject1);
        paramzzsm.zzmr(m);
        break;
      case 26: 
        j = 26;
        k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbtV;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          k += j;
          localObject2 = new byte[k][];
          if (j != 0)
          {
            localObject3 = this.zzbtV;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            m = localObject2.length + -1;
            if (j >= m) {
              break;
            }
            localObject3 = paramzzsm.readBytes();
            localObject2[j] = localObject3;
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbtV;
          j = localObject1.length;
        }
        localObject3 = paramzzsm.readBytes();
        localObject2[j] = localObject3;
        this.zzbtV = ((byte[][])localObject2);
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int j = super.zzz();
    String[] arrayOfString = this.zzbtT;
    int k;
    int m;
    Object localObject1;
    int n;
    if (arrayOfString != null)
    {
      arrayOfString = this.zzbtT;
      k = arrayOfString.length;
      if (k > 0)
      {
        k = 0;
        arrayOfString = null;
        m = 0;
        localObject1 = null;
        n = 0;
        for (;;)
        {
          Object localObject2 = this.zzbtT;
          int i1 = localObject2.length;
          if (k >= i1) {
            break;
          }
          localObject2 = this.zzbtT[k];
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
      localObject1 = this.zzbtU;
      Object localObject3;
      if (localObject1 != null)
      {
        localObject1 = this.zzbtU;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          n = 0;
          for (;;)
          {
            localObject3 = this.zzbtU;
            j = localObject3.length;
            if (m >= j) {
              break;
            }
            localObject3 = this.zzbtU;
            j = zzsn.zzmx(localObject3[m]);
            n += j;
            m += 1;
          }
          k += n;
          localObject1 = this.zzbtU;
          m = localObject1.length * 1;
          k += m;
        }
      }
      localObject1 = this.zzbtV;
      if (localObject1 != null)
      {
        localObject1 = this.zzbtV;
        m = localObject1.length;
        if (m > 0)
        {
          m = 0;
          localObject1 = null;
          n = 0;
          for (;;)
          {
            localObject3 = this.zzbtV;
            j = localObject3.length;
            if (i >= j) {
              break;
            }
            localObject3 = this.zzbtV[i];
            if (localObject3 != null)
            {
              n += 1;
              j = zzsn.zzG((byte[])localObject3);
              m += j;
            }
            i += 1;
          }
          k += m;
          i = n * 1;
          k += i;
        }
      }
      return k;
      k = j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */