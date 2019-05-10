package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzsj$zza$zza$zza
  extends zzso
{
  public byte[] zzbtF;
  public String zzbtG;
  public double zzbtH;
  public float zzbtI;
  public long zzbtJ;
  public int zzbtK;
  public int zzbtL;
  public boolean zzbtM;
  public zzsj.zza[] zzbtN;
  public zzsj.zza.zza[] zzbtO;
  public String[] zzbtP;
  public long[] zzbtQ;
  public float[] zzbtR;
  public long zzbtS;
  
  public zzsj$zza$zza$zza()
  {
    zzIV();
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
        Object localObject1 = this.zzbtF;
        Object localObject2 = ((zza)paramObject).zzbtF;
        bool3 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
        if (bool3)
        {
          localObject1 = this.zzbtG;
          if (localObject1 == null)
          {
            localObject1 = ((zza)paramObject).zzbtG;
            if (localObject1 != null) {}
          }
          else
          {
            boolean bool5;
            do
            {
              double d1 = this.zzbtH;
              long l1 = Double.doubleToLongBits(d1);
              double d2 = ((zza)paramObject).zzbtH;
              long l2 = Double.doubleToLongBits(d2);
              bool3 = l1 < l2;
              if (bool3) {
                break;
              }
              float f1 = this.zzbtI;
              int i = Float.floatToIntBits(f1);
              float f2 = ((zza)paramObject).zzbtI;
              int k = Float.floatToIntBits(f2);
              if (i != k) {
                break;
              }
              l1 = this.zzbtJ;
              l2 = ((zza)paramObject).zzbtJ;
              boolean bool4 = l1 < l2;
              if (bool4) {
                break;
              }
              int j = this.zzbtK;
              k = ((zza)paramObject).zzbtK;
              if (j != k) {
                break;
              }
              j = this.zzbtL;
              k = ((zza)paramObject).zzbtL;
              if (j != k) {
                break;
              }
              bool5 = this.zzbtM;
              boolean bool6 = ((zza)paramObject).zzbtM;
              if (bool5 != bool6) {
                break;
              }
              localObject1 = this.zzbtN;
              localObject2 = ((zza)paramObject).zzbtN;
              bool5 = zzss.equals((Object[])localObject1, (Object[])localObject2);
              if (!bool5) {
                break;
              }
              localObject1 = this.zzbtO;
              localObject2 = ((zza)paramObject).zzbtO;
              bool5 = zzss.equals((Object[])localObject1, (Object[])localObject2);
              if (!bool5) {
                break;
              }
              localObject1 = this.zzbtP;
              localObject2 = ((zza)paramObject).zzbtP;
              bool5 = zzss.equals((Object[])localObject1, (Object[])localObject2);
              if (!bool5) {
                break;
              }
              localObject1 = this.zzbtQ;
              localObject2 = ((zza)paramObject).zzbtQ;
              bool5 = zzss.equals((long[])localObject1, (long[])localObject2);
              if (!bool5) {
                break;
              }
              localObject1 = this.zzbtR;
              localObject2 = ((zza)paramObject).zzbtR;
              bool5 = zzss.equals((float[])localObject1, (float[])localObject2);
              if (!bool5) {
                break;
              }
              l1 = this.zzbtS;
              l2 = ((zza)paramObject).zzbtS;
              bool5 = l1 < l2;
              if (bool5) {
                break;
              }
              localObject1 = this.zzbuj;
              if (localObject1 != null)
              {
                localObject1 = this.zzbuj;
                bool5 = ((zzsq)localObject1).isEmpty();
                if (!bool5) {
                  break label478;
                }
              }
              localObject1 = ((zza)paramObject).zzbuj;
              if (localObject1 != null)
              {
                localObject1 = ((zza)paramObject).zzbuj;
                bool5 = ((zzsq)localObject1).isEmpty();
                if (!bool5) {
                  break;
                }
              }
              bool2 = bool1;
              break;
              localObject1 = this.zzbtG;
              localObject2 = ((zza)paramObject).zzbtG;
              bool5 = ((String)localObject1).equals(localObject2);
            } while (bool5);
            continue;
            label478:
            localzzsq1 = this.zzbuj;
            zzsq localzzsq2 = ((zza)paramObject).zzbuj;
            bool2 = localzzsq1.equals(localzzsq2);
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    zzsq localzzsq = null;
    int j = 32;
    int k = (getClass().getName().hashCode() + 527) * 31;
    Object localObject = this.zzbtF;
    int n = Arrays.hashCode((byte[])localObject);
    k += n;
    n = k * 31;
    String str = this.zzbtG;
    int m;
    if (str == null)
    {
      k = 0;
      str = null;
      k += n;
      double d = this.zzbtH;
      long l1 = Double.doubleToLongBits(d);
      k *= 31;
      long l2 = l1 >>> j;
      n = (int)(l1 ^ l2);
      k = (k + n) * 31;
      float f = this.zzbtI;
      n = Float.floatToIntBits(f);
      k = (k + n) * 31;
      l1 = this.zzbtJ;
      l2 = this.zzbtJ >>> j;
      l1 ^= l2;
      n = (int)l1;
      k = (k + n) * 31;
      n = this.zzbtK;
      k = (k + n) * 31;
      n = this.zzbtL;
      n = (k + n) * 31;
      boolean bool1 = this.zzbtM;
      if (!bool1) {
        break label419;
      }
      m = 1231;
      label228:
      m = (m + n) * 31;
      n = zzss.hashCode(this.zzbtN);
      m = (m + n) * 31;
      n = zzss.hashCode(this.zzbtO);
      m = (m + n) * 31;
      n = zzss.hashCode(this.zzbtP);
      m = (m + n) * 31;
      n = zzss.hashCode(this.zzbtQ);
      m = (m + n) * 31;
      n = zzss.hashCode(this.zzbtR);
      m = (m + n) * 31;
      l1 = this.zzbtS;
      l2 = this.zzbtS >>> j;
      l1 ^= l2;
      n = (int)l1;
      m = (m + n) * 31;
      localObject = this.zzbuj;
      if (localObject != null)
      {
        localObject = this.zzbuj;
        boolean bool2 = ((zzsq)localObject).isEmpty();
        if (!bool2) {
          break label427;
        }
      }
    }
    for (;;)
    {
      return m + i;
      str = this.zzbtG;
      m = str.hashCode();
      break;
      label419:
      m = 1237;
      break label228;
      label427:
      localzzsq = this.zzbuj;
      i = localzzsq.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    long l1 = 0L;
    int i = 0;
    Object localObject1 = this.zzbtF;
    Object localObject2 = zzsx.zzbuD;
    int j = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    if (j == 0)
    {
      j = 1;
      f1 = Float.MIN_VALUE;
      localObject2 = this.zzbtF;
      paramzzsn.zza(j, (byte[])localObject2);
    }
    localObject1 = this.zzbtG;
    localObject2 = "";
    boolean bool1 = ((String)localObject1).equals(localObject2);
    if (!bool1)
    {
      int k = 2;
      f1 = 2.8E-45F;
      localObject2 = this.zzbtG;
      paramzzsn.zzn(k, (String)localObject2);
    }
    double d1 = this.zzbtH;
    long l2 = Double.doubleToLongBits(d1);
    double d2 = 0.0D;
    long l3 = Double.doubleToLongBits(d2);
    boolean bool2 = l2 < l3;
    if (bool2)
    {
      m = 3;
      f1 = 4.2E-45F;
      d1 = this.zzbtH;
      paramzzsn.zza(m, d1);
    }
    float f1 = this.zzbtI;
    int m = Float.floatToIntBits(f1);
    float f2 = 0.0F;
    localObject2 = null;
    int i3 = Float.floatToIntBits(0.0F);
    if (m != i3)
    {
      m = 4;
      f1 = 5.6E-45F;
      f2 = this.zzbtI;
      paramzzsn.zzb(m, f2);
    }
    l2 = this.zzbtJ;
    boolean bool3 = l2 < l1;
    if (bool3)
    {
      n = 5;
      f1 = 7.0E-45F;
      l2 = this.zzbtJ;
      paramzzsn.zzb(n, l2);
    }
    int n = this.zzbtK;
    if (n != 0)
    {
      n = 6;
      f1 = 8.4E-45F;
      i3 = this.zzbtK;
      paramzzsn.zzA(n, i3);
    }
    n = this.zzbtL;
    if (n != 0)
    {
      n = 7;
      f1 = 9.8E-45F;
      i3 = this.zzbtL;
      paramzzsn.zzB(n, i3);
    }
    boolean bool4 = this.zzbtM;
    int i1;
    if (bool4)
    {
      i1 = 8;
      f1 = 1.1E-44F;
      boolean bool6 = this.zzbtM;
      paramzzsn.zze(i1, bool6);
    }
    localObject1 = this.zzbtN;
    int i4;
    int i5;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtN;
      i1 = localObject1.length;
      if (i1 > 0)
      {
        i1 = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zzbtN;
          i4 = localObject2.length;
          if (i1 >= i4) {
            break;
          }
          localObject2 = this.zzbtN[i1];
          if (localObject2 != null)
          {
            i5 = 9;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          i1 += 1;
        }
      }
    }
    localObject1 = this.zzbtO;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtO;
      i1 = localObject1.length;
      if (i1 > 0)
      {
        i1 = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zzbtO;
          i4 = localObject2.length;
          if (i1 >= i4) {
            break;
          }
          localObject2 = this.zzbtO[i1];
          if (localObject2 != null)
          {
            i5 = 10;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          i1 += 1;
        }
      }
    }
    localObject1 = this.zzbtP;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtP;
      i1 = localObject1.length;
      if (i1 > 0)
      {
        i1 = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zzbtP;
          i4 = localObject2.length;
          if (i1 >= i4) {
            break;
          }
          localObject2 = this.zzbtP[i1];
          if (localObject2 != null)
          {
            i5 = 11;
            paramzzsn.zzn(i5, (String)localObject2);
          }
          i1 += 1;
        }
      }
    }
    localObject1 = this.zzbtQ;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtQ;
      i1 = localObject1.length;
      if (i1 > 0)
      {
        i1 = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zzbtQ;
          i4 = localObject2.length;
          if (i1 >= i4) {
            break;
          }
          i4 = 12;
          f2 = 1.7E-44F;
          long[] arrayOfLong = this.zzbtQ;
          l3 = arrayOfLong[i1];
          paramzzsn.zzb(i4, l3);
          i1 += 1;
        }
      }
    }
    l2 = this.zzbtS;
    boolean bool5 = l2 < l1;
    int i2;
    if (bool5)
    {
      i2 = 13;
      f1 = 1.8E-44F;
      l2 = this.zzbtS;
      paramzzsn.zzb(i2, l2);
    }
    localObject1 = this.zzbtR;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtR;
      i2 = localObject1.length;
      if (i2 > 0) {
        for (;;)
        {
          localObject1 = this.zzbtR;
          i2 = localObject1.length;
          if (i >= i2) {
            break;
          }
          i2 = 14;
          f1 = 2.0E-44F;
          localObject2 = this.zzbtR;
          f2 = localObject2[i];
          paramzzsn.zzb(i2, f2);
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzIV()
  {
    long l = 0L;
    Object localObject = zzsx.zzbuD;
    this.zzbtF = ((byte[])localObject);
    this.zzbtG = "";
    this.zzbtH = 0.0D;
    this.zzbtI = 0.0F;
    this.zzbtJ = l;
    this.zzbtK = 0;
    this.zzbtL = 0;
    this.zzbtM = false;
    localObject = zzsj.zza.zzIR();
    this.zzbtN = ((zzsj.zza[])localObject);
    localObject = zzsj.zza.zza.zzIT();
    this.zzbtO = ((zzsj.zza.zza[])localObject);
    localObject = zzsx.zzbuB;
    this.zzbtP = ((String[])localObject);
    localObject = zzsx.zzbux;
    this.zzbtQ = ((long[])localObject);
    localObject = zzsx.zzbuy;
    this.zzbtR = ((float[])localObject);
    this.zzbtS = l;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zza zzN(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject1;
      float f1;
      long l1;
      int j;
      int k;
      int m;
      Object localObject2;
      Object localObject3;
      int n;
      long l2;
      int i1;
      Object localObject4;
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
        this.zzbtF = ((byte[])localObject1);
        break;
      case 18: 
        localObject1 = paramzzsm.readString();
        this.zzbtG = ((String)localObject1);
        break;
      case 25: 
        double d = paramzzsm.readDouble();
        this.zzbtH = d;
        break;
      case 37: 
        f1 = paramzzsm.readFloat();
        this.zzbtI = f1;
        break;
      case 40: 
        l1 = paramzzsm.zzJa();
        this.zzbtJ = l1;
        break;
      case 48: 
        j = paramzzsm.zzJb();
        this.zzbtK = j;
        break;
      case 56: 
        j = paramzzsm.zzJd();
        this.zzbtL = j;
        break;
      case 64: 
        boolean bool2 = paramzzsm.zzJc();
        this.zzbtM = bool2;
        break;
      case 74: 
        k = 74;
        f1 = 1.04E-43F;
        m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zzbtN;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
          f1 = 0.0F;
        }
        for (;;)
        {
          m += k;
          localObject2 = new zzsj.zza[m];
          if (k != 0)
          {
            localObject3 = this.zzbtN;
            System.arraycopy(localObject3, 0, localObject2, 0, k);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (k >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzsj$zza;
            ((zzsj.zza)localObject3).<init>();
            localObject2[k] = localObject3;
            localObject3 = localObject2[k];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.zzbtN;
          k = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzsj$zza;
        ((zzsj.zza)localObject3).<init>();
        localObject2[k] = localObject3;
        localObject1 = localObject2[k];
        paramzzsm.zza((zzsu)localObject1);
        this.zzbtN = ((zzsj.zza[])localObject2);
        break;
      case 82: 
        k = 82;
        f1 = 1.15E-43F;
        m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zzbtO;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
          f1 = 0.0F;
        }
        for (;;)
        {
          m += k;
          localObject2 = new zzsj.zza.zza[m];
          if (k != 0)
          {
            localObject3 = this.zzbtO;
            System.arraycopy(localObject3, 0, localObject2, 0, k);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (k >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzsj$zza$zza;
            ((zzsj.zza.zza)localObject3).<init>();
            localObject2[k] = localObject3;
            localObject3 = localObject2[k];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.zzbtO;
          k = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzsj$zza$zza;
        ((zzsj.zza.zza)localObject3).<init>();
        localObject2[k] = localObject3;
        localObject1 = localObject2[k];
        paramzzsm.zza((zzsu)localObject1);
        this.zzbtO = ((zzsj.zza.zza[])localObject2);
        break;
      case 90: 
        k = 90;
        f1 = 1.26E-43F;
        m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zzbtP;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
          f1 = 0.0F;
        }
        for (;;)
        {
          m += k;
          localObject2 = new String[m];
          if (k != 0)
          {
            localObject3 = this.zzbtP;
            System.arraycopy(localObject3, 0, localObject2, 0, k);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (k >= n) {
              break;
            }
            localObject3 = paramzzsm.readString();
            localObject2[k] = localObject3;
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.zzbtP;
          k = localObject1.length;
        }
        localObject3 = paramzzsm.readString();
        localObject2[k] = localObject3;
        this.zzbtP = ((String[])localObject2);
        break;
      case 96: 
        k = 96;
        f1 = 1.35E-43F;
        m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zzbtQ;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
          f1 = 0.0F;
        }
        for (;;)
        {
          m += k;
          localObject2 = new long[m];
          if (k != 0)
          {
            localObject3 = this.zzbtQ;
            System.arraycopy(localObject3, 0, localObject2, 0, k);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (k >= n) {
              break;
            }
            l2 = paramzzsm.zzJa();
            localObject2[k] = l2;
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.zzbtQ;
          k = localObject1.length;
        }
        l2 = paramzzsm.zzJa();
        localObject2[k] = l2;
        this.zzbtQ = ((long[])localObject2);
        break;
      case 98: 
        k = paramzzsm.zzJf();
        n = paramzzsm.zzmq(k);
        m = paramzzsm.getPosition();
        k = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          i1 = paramzzsm.zzJk();
          if (i1 <= 0) {
            break;
          }
          paramzzsm.zzJa();
          k += 1;
        }
        paramzzsm.zzms(m);
        localObject2 = this.zzbtQ;
        if (localObject2 == null)
        {
          m = 0;
          localObject2 = null;
        }
        for (;;)
        {
          k += m;
          localObject1 = new long[k];
          if (m != 0)
          {
            localObject4 = this.zzbtQ;
            System.arraycopy(localObject4, 0, localObject1, 0, m);
          }
          for (;;)
          {
            i1 = localObject1.length;
            if (m >= i1) {
              break;
            }
            l2 = paramzzsm.zzJa();
            localObject1[m] = l2;
            m += 1;
          }
          localObject2 = this.zzbtQ;
          m = localObject2.length;
        }
        this.zzbtQ = ((long[])localObject1);
        paramzzsm.zzmr(n);
        break;
      case 104: 
        l1 = paramzzsm.zzJa();
        this.zzbtS = l1;
        break;
      case 117: 
        k = 117;
        f1 = 1.64E-43F;
        m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zzbtR;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
          f1 = 0.0F;
        }
        for (;;)
        {
          m += k;
          localObject2 = new float[m];
          if (k != 0)
          {
            localObject3 = this.zzbtR;
            System.arraycopy(localObject3, 0, localObject2, 0, k);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (k >= n) {
              break;
            }
            f2 = paramzzsm.readFloat();
            localObject2[k] = f2;
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.zzbtR;
          k = localObject1.length;
        }
        float f2 = paramzzsm.readFloat();
        localObject2[k] = f2;
        this.zzbtR = ((float[])localObject2);
        break;
      case 114: 
        k = paramzzsm.zzJf();
        m = paramzzsm.zzmq(k);
        n = k / 4;
        localObject1 = this.zzbtR;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
          f1 = 0.0F;
        }
        for (;;)
        {
          n += k;
          localObject3 = new float[n];
          if (k != 0)
          {
            localObject4 = this.zzbtR;
            System.arraycopy(localObject4, 0, localObject3, 0, k);
          }
          for (;;)
          {
            i1 = localObject3.length;
            if (k >= i1) {
              break;
            }
            float f3 = paramzzsm.readFloat();
            localObject3[k] = f3;
            k += 1;
          }
          localObject1 = this.zzbtR;
          k = localObject1.length;
        }
        this.zzbtR = ((float[])localObject3);
        paramzzsm.zzmr(m);
      }
    }
  }
  
  protected int zzz()
  {
    long l1 = 0L;
    int i = 0;
    Object localObject1 = null;
    int k = super.zzz();
    Object localObject2 = this.zzbtF;
    Object localObject3 = zzsx.zzbuD;
    boolean bool2 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
    if (!bool2)
    {
      f1 = Float.MIN_VALUE;
      localObject3 = this.zzbtF;
      int m = zzsn.zzb(1, (byte[])localObject3);
      k += m;
    }
    localObject2 = this.zzbtG;
    localObject3 = "";
    boolean bool3 = ((String)localObject2).equals(localObject3);
    if (!bool3)
    {
      f1 = 2.8E-45F;
      localObject3 = this.zzbtG;
      int n = zzsn.zzo(2, (String)localObject3);
      k += n;
    }
    double d1 = this.zzbtH;
    long l2 = Double.doubleToLongBits(d1);
    double d2 = 0.0D;
    long l3 = Double.doubleToLongBits(d2);
    boolean bool4 = l2 < l3;
    if (bool4)
    {
      f1 = 4.2E-45F;
      d2 = this.zzbtH;
      i1 = zzsn.zzb(3, d2);
      k += i1;
    }
    float f1 = this.zzbtI;
    int i1 = Float.floatToIntBits(f1);
    float f2 = 0.0F;
    localObject3 = null;
    int i4 = Float.floatToIntBits(0.0F);
    if (i1 != i4)
    {
      f1 = 5.6E-45F;
      f2 = this.zzbtI;
      i1 = zzsn.zzc(4, f2);
      k += i1;
    }
    l2 = this.zzbtJ;
    boolean bool5 = l2 < l1;
    if (bool5)
    {
      f1 = 7.0E-45F;
      l3 = this.zzbtJ;
      i2 = zzsn.zzd(5, l3);
      k += i2;
    }
    int i2 = this.zzbtK;
    if (i2 != 0)
    {
      f1 = 8.4E-45F;
      i4 = this.zzbtK;
      i2 = zzsn.zzC(6, i4);
      k += i2;
    }
    i2 = this.zzbtL;
    if (i2 != 0)
    {
      f1 = 9.8E-45F;
      i4 = this.zzbtL;
      i2 = zzsn.zzD(7, i4);
      k += i2;
    }
    boolean bool6 = this.zzbtM;
    int i3;
    if (bool6)
    {
      f1 = 1.1E-44F;
      boolean bool7 = this.zzbtM;
      i3 = zzsn.zzf(8, bool7);
      k += i3;
    }
    localObject2 = this.zzbtN;
    int i5;
    int i6;
    if (localObject2 != null)
    {
      localObject2 = this.zzbtN;
      i3 = localObject2.length;
      if (i3 > 0)
      {
        i3 = k;
        k = 0;
        for (;;)
        {
          localObject3 = this.zzbtN;
          i5 = localObject3.length;
          if (k >= i5) {
            break;
          }
          localObject3 = this.zzbtN[k];
          if (localObject3 != null)
          {
            i6 = 9;
            i5 = zzsn.zzc(i6, (zzsu)localObject3);
            i3 += i5;
          }
          k += 1;
        }
        k = i3;
      }
    }
    localObject2 = this.zzbtO;
    if (localObject2 != null)
    {
      localObject2 = this.zzbtO;
      i3 = localObject2.length;
      if (i3 > 0)
      {
        i3 = k;
        k = 0;
        for (;;)
        {
          localObject3 = this.zzbtO;
          i5 = localObject3.length;
          if (k >= i5) {
            break;
          }
          localObject3 = this.zzbtO[k];
          if (localObject3 != null)
          {
            i6 = 10;
            i5 = zzsn.zzc(i6, (zzsu)localObject3);
            i3 += i5;
          }
          k += 1;
        }
        k = i3;
      }
    }
    localObject2 = this.zzbtP;
    if (localObject2 != null)
    {
      localObject2 = this.zzbtP;
      i3 = localObject2.length;
      if (i3 > 0)
      {
        i3 = 0;
        localObject2 = null;
        f1 = 0.0F;
        i5 = 0;
        localObject3 = null;
        f2 = 0.0F;
        i6 = 0;
        for (;;)
        {
          Object localObject4 = this.zzbtP;
          int i7 = localObject4.length;
          if (i3 >= i7) {
            break;
          }
          localObject4 = this.zzbtP[i3];
          if (localObject4 != null)
          {
            i6 += 1;
            i7 = zzsn.zzgO((String)localObject4);
            i5 += i7;
          }
          i3 += 1;
        }
        k += i5;
        i3 = i6 * 1;
        k += i3;
      }
    }
    localObject2 = this.zzbtQ;
    if (localObject2 != null)
    {
      localObject2 = this.zzbtQ;
      i3 = localObject2.length;
      if (i3 > 0)
      {
        i3 = 0;
        localObject2 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject3 = this.zzbtQ;
          i5 = localObject3.length;
          if (i >= i5) {
            break;
          }
          localObject3 = this.zzbtQ;
          l3 = localObject3[i];
          i5 = zzsn.zzas(l3);
          i3 += i5;
          i += 1;
        }
        k += i3;
        localObject1 = this.zzbtQ;
        i = localObject1.length * 1;
        k += i;
      }
    }
    l2 = this.zzbtS;
    boolean bool1 = l2 < l1;
    int j;
    if (bool1)
    {
      l2 = this.zzbtS;
      j = zzsn.zzd(13, l2);
      k += j;
    }
    localObject1 = this.zzbtR;
    if (localObject1 != null)
    {
      localObject1 = this.zzbtR;
      j = localObject1.length;
      if (j > 0)
      {
        j = this.zzbtR.length * 4;
        k += j;
        localObject1 = this.zzbtR;
        j = localObject1.length * 1;
        k += j;
      }
    }
    return k;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsj$zza$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */