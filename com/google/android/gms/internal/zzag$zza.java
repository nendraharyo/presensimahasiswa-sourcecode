package com.google.android.gms.internal;

public final class zzag$zza
  extends zzso
{
  private static volatile zza[] zzjw;
  public int type;
  public zza[] zzjA;
  public String zzjB;
  public String zzjC;
  public long zzjD;
  public boolean zzjE;
  public zza[] zzjF;
  public int[] zzjG;
  public boolean zzjH;
  public String zzjx;
  public zza[] zzjy;
  public zza[] zzjz;
  
  public zzag$zza()
  {
    zzR();
  }
  
  public static zza[] zzQ()
  {
    zza[] arrayOfzza = zzjw;
    if (arrayOfzza == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzza = zzjw;
      if (arrayOfzza == null)
      {
        arrayOfzza = null;
        arrayOfzza = new zza[0];
        zzjw = arrayOfzza;
      }
      return zzjw;
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
      boolean bool3 = paramObject instanceof zza;
      if (bool3)
      {
        paramObject = (zza)paramObject;
        int i = this.type;
        int j = ((zza)paramObject).type;
        if (i == j)
        {
          Object localObject1 = this.zzjx;
          label73:
          Object localObject2;
          boolean bool4;
          if (localObject1 == null)
          {
            localObject1 = ((zza)paramObject).zzjx;
            if (localObject1 != null) {
              continue;
            }
            localObject1 = this.zzjy;
            localObject2 = ((zza)paramObject).zzjy;
            bool4 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (!bool4) {
              continue;
            }
            localObject1 = this.zzjz;
            localObject2 = ((zza)paramObject).zzjz;
            bool4 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (!bool4) {
              continue;
            }
            localObject1 = this.zzjA;
            localObject2 = ((zza)paramObject).zzjA;
            bool4 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (!bool4) {
              continue;
            }
            localObject1 = this.zzjB;
            if (localObject1 != null) {
              break label401;
            }
            localObject1 = ((zza)paramObject).zzjB;
            if (localObject1 != null) {
              continue;
            }
            label173:
            localObject1 = this.zzjC;
            if (localObject1 != null) {
              break label430;
            }
            localObject1 = ((zza)paramObject).zzjC;
            if (localObject1 != null) {
              continue;
            }
          }
          label401:
          label430:
          do
          {
            long l1 = this.zzjD;
            long l2 = ((zza)paramObject).zzjD;
            bool4 = l1 < l2;
            if (bool4) {
              break;
            }
            bool4 = this.zzjE;
            boolean bool5 = ((zza)paramObject).zzjE;
            if (bool4 != bool5) {
              break;
            }
            localObject1 = this.zzjF;
            localObject2 = ((zza)paramObject).zzjF;
            bool4 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (!bool4) {
              break;
            }
            localObject1 = this.zzjG;
            localObject2 = ((zza)paramObject).zzjG;
            bool4 = zzss.equals((int[])localObject1, (int[])localObject2);
            if (!bool4) {
              break;
            }
            bool4 = this.zzjH;
            bool5 = ((zza)paramObject).zzjH;
            if (bool4 != bool5) {
              break;
            }
            localObject1 = this.zzbuj;
            if (localObject1 != null)
            {
              localObject1 = this.zzbuj;
              bool4 = ((zzsq)localObject1).isEmpty();
              if (!bool4) {
                break label459;
              }
            }
            localObject1 = ((zza)paramObject).zzbuj;
            if (localObject1 != null)
            {
              localObject1 = ((zza)paramObject).zzbuj;
              bool4 = ((zzsq)localObject1).isEmpty();
              if (!bool4) {
                break;
              }
            }
            bool2 = bool1;
            break;
            localObject1 = this.zzjx;
            localObject2 = ((zza)paramObject).zzjx;
            bool4 = ((String)localObject1).equals(localObject2);
            if (bool4) {
              break label73;
            }
            break;
            localObject1 = this.zzjB;
            localObject2 = ((zza)paramObject).zzjB;
            bool4 = ((String)localObject1).equals(localObject2);
            if (bool4) {
              break label173;
            }
            break;
            localObject1 = this.zzjC;
            localObject2 = ((zza)paramObject).zzjC;
            bool4 = ((String)localObject1).equals(localObject2);
          } while (bool4);
          continue;
          label459:
          localzzsq1 = this.zzbuj;
          zzsq localzzsq2 = ((zza)paramObject).zzbuj;
          bool2 = localzzsq1.equals(localzzsq2);
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 1237;
    float f = 1.733E-42F;
    int j = 1231;
    int k = 0;
    zzsq localzzsq1 = null;
    int m = (getClass().getName().hashCode() + 527) * 31;
    int i2 = this.type;
    m += i2;
    i2 = m * 31;
    String str = this.zzjx;
    label165:
    label196:
    label265:
    int i1;
    label328:
    boolean bool1;
    if (str == null)
    {
      m = 0;
      str = null;
      m = (m + i2) * 31;
      i2 = zzss.hashCode(this.zzjy);
      m = (m + i2) * 31;
      i2 = zzss.hashCode(this.zzjz);
      m = (m + i2) * 31;
      Object localObject = this.zzjA;
      i2 = zzss.hashCode((Object[])localObject);
      m += i2;
      i2 = m * 31;
      str = this.zzjB;
      if (str != null) {
        break label386;
      }
      m = 0;
      str = null;
      m += i2;
      i2 = m * 31;
      str = this.zzjC;
      if (str != null) {
        break label402;
      }
      m = 0;
      str = null;
      m = (m + i2) * 31;
      long l1 = this.zzjD;
      long l2 = this.zzjD;
      int i4 = 32;
      l2 >>>= i4;
      l1 ^= l2;
      i2 = (int)l1;
      i2 = (m + i2) * 31;
      int n = this.zzjE;
      if (n == 0) {
        break label418;
      }
      n = j;
      i1 = (n + i2) * 31;
      int i3 = zzss.hashCode(this.zzjF);
      i1 = (i1 + i3) * 31;
      localObject = this.zzjG;
      i3 = zzss.hashCode((int[])localObject);
      i1 = (i1 + i3) * 31;
      boolean bool2 = this.zzjH;
      if (!bool2) {
        break label424;
      }
      i1 = (i1 + j) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        bool1 = localzzsq2.isEmpty();
        if (!bool1) {
          break label429;
        }
      }
    }
    for (;;)
    {
      return i1 + k;
      str = this.zzjx;
      i1 = str.hashCode();
      break;
      label386:
      str = this.zzjB;
      i1 = str.hashCode();
      break label165;
      label402:
      str = this.zzjC;
      i1 = str.hashCode();
      break label196;
      label418:
      i1 = i;
      break label265;
      label424:
      bool1 = i;
      break label328;
      label429:
      localzzsq1 = this.zzbuj;
      k = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 0;
    int j = this.type;
    paramzzsn.zzA(1, j);
    Object localObject1 = this.zzjx;
    Object localObject2 = "";
    boolean bool3 = ((String)localObject1).equals(localObject2);
    int m;
    if (!bool3)
    {
      m = 2;
      localObject2 = this.zzjx;
      paramzzsn.zzn(m, (String)localObject2);
    }
    localObject1 = this.zzjy;
    int i5;
    if (localObject1 != null)
    {
      localObject1 = this.zzjy;
      m = localObject1.length;
      if (m > 0)
      {
        m = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzjy;
          j = localObject2.length;
          if (m >= j) {
            break;
          }
          localObject2 = this.zzjy[m];
          if (localObject2 != null)
          {
            i5 = 3;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          m += 1;
        }
      }
    }
    localObject1 = this.zzjz;
    if (localObject1 != null)
    {
      localObject1 = this.zzjz;
      m = localObject1.length;
      if (m > 0)
      {
        m = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzjz;
          j = localObject2.length;
          if (m >= j) {
            break;
          }
          localObject2 = this.zzjz[m];
          if (localObject2 != null)
          {
            i5 = 4;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          m += 1;
        }
      }
    }
    localObject1 = this.zzjA;
    if (localObject1 != null)
    {
      localObject1 = this.zzjA;
      m = localObject1.length;
      if (m > 0)
      {
        m = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzjA;
          j = localObject2.length;
          if (m >= j) {
            break;
          }
          localObject2 = this.zzjA[m];
          if (localObject2 != null)
          {
            i5 = 5;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          m += 1;
        }
      }
    }
    localObject1 = this.zzjB;
    localObject2 = "";
    boolean bool4 = ((String)localObject1).equals(localObject2);
    if (!bool4)
    {
      int n = 6;
      localObject2 = this.zzjB;
      paramzzsn.zzn(n, (String)localObject2);
    }
    localObject1 = this.zzjC;
    localObject2 = "";
    boolean bool5 = ((String)localObject1).equals(localObject2);
    if (!bool5)
    {
      int i1 = 7;
      localObject2 = this.zzjC;
      paramzzsn.zzn(i1, (String)localObject2);
    }
    long l1 = this.zzjD;
    long l2 = 0L;
    boolean bool6 = l1 < l2;
    if (bool6)
    {
      int i2 = 8;
      l1 = this.zzjD;
      paramzzsn.zzb(i2, l1);
    }
    boolean bool7 = this.zzjH;
    int i3;
    if (bool7)
    {
      i3 = 9;
      boolean bool2 = this.zzjH;
      paramzzsn.zze(i3, bool2);
    }
    localObject1 = this.zzjG;
    int k;
    if (localObject1 != null)
    {
      localObject1 = this.zzjG;
      i3 = localObject1.length;
      if (i3 > 0)
      {
        i3 = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzjG;
          k = localObject2.length;
          if (i3 >= k) {
            break;
          }
          k = 10;
          int[] arrayOfInt = this.zzjG;
          i5 = arrayOfInt[i3];
          paramzzsn.zzA(k, i5);
          i3 += 1;
        }
      }
    }
    localObject1 = this.zzjF;
    if (localObject1 != null)
    {
      localObject1 = this.zzjF;
      i3 = localObject1.length;
      if (i3 > 0) {
        for (;;)
        {
          localObject1 = this.zzjF;
          i3 = localObject1.length;
          if (i >= i3) {
            break;
          }
          localObject1 = this.zzjF[i];
          if (localObject1 != null)
          {
            k = 11;
            paramzzsn.zza(k, (zzsu)localObject1);
          }
          i += 1;
        }
      }
    }
    boolean bool8 = this.zzjE;
    if (bool8)
    {
      int i4 = 12;
      boolean bool1 = this.zzjE;
      paramzzsn.zze(i4, bool1);
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzR()
  {
    this.type = 1;
    this.zzjx = "";
    Object localObject = zzQ();
    this.zzjy = ((zza[])localObject);
    localObject = zzQ();
    this.zzjz = ((zza[])localObject);
    localObject = zzQ();
    this.zzjA = ((zza[])localObject);
    this.zzjB = "";
    this.zzjC = "";
    this.zzjD = 0L;
    this.zzjE = false;
    localObject = zzQ();
    this.zzjF = ((zza[])localObject);
    localObject = zzsx.zzbuw;
    this.zzjG = ((int[])localObject);
    this.zzjH = false;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zza zzk(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject1;
      int m;
      Object localObject2;
      Object localObject3;
      int n;
      int k;
      int i1;
      label956:
      int[] arrayOfInt2;
      switch (i)
      {
      default: 
        boolean bool1 = zza(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = paramzzsm.zzJb();
        switch (j)
        {
        default: 
          break;
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
          this.type = j;
        }
        break;
      case 18: 
        localObject1 = paramzzsm.readString();
        this.zzjx = ((String)localObject1);
        break;
      case 26: 
        j = 26;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzjy;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zza[m];
          if (j != 0)
          {
            localObject3 = this.zzjy;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzag$zza;
            ((zza)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzjy;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzag$zza;
        ((zza)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzjy = ((zza[])localObject2);
        break;
      case 34: 
        j = 34;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzjz;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zza[m];
          if (j != 0)
          {
            localObject3 = this.zzjz;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzag$zza;
            ((zza)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzjz;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzag$zza;
        ((zza)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzjz = ((zza[])localObject2);
        break;
      case 42: 
        j = 42;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzjA;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zza[m];
          if (j != 0)
          {
            localObject3 = this.zzjA;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzag$zza;
            ((zza)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzjA;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzag$zza;
        ((zza)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzjA = ((zza[])localObject2);
        break;
      case 50: 
        localObject1 = paramzzsm.readString();
        this.zzjB = ((String)localObject1);
        break;
      case 58: 
        localObject1 = paramzzsm.readString();
        this.zzjC = ((String)localObject1);
        break;
      case 64: 
        long l = paramzzsm.zzJa();
        this.zzjD = l;
        break;
      case 72: 
        boolean bool2 = paramzzsm.zzJc();
        this.zzjH = bool2;
        break;
      case 80: 
        k = 80;
        i1 = zzsx.zzc(paramzzsm, k);
        int[] arrayOfInt1 = new int[i1];
        n = 0;
        localObject3 = null;
        m = 0;
        localObject2 = null;
        if (n < i1)
        {
          if (n != 0) {
            paramzzsm.zzIX();
          }
          int i2 = paramzzsm.zzJb();
          switch (i2)
          {
          default: 
            k = m;
          }
          for (;;)
          {
            n += 1;
            m = k;
            break;
            k = m + 1;
            arrayOfInt1[m] = i2;
          }
        }
        if (m != 0)
        {
          localObject1 = this.zzjG;
          if (localObject1 == null)
          {
            k = 0;
            localObject1 = null;
          }
          for (;;)
          {
            if (k != 0) {
              break label956;
            }
            n = arrayOfInt1.length;
            if (m != n) {
              break label956;
            }
            this.zzjG = arrayOfInt1;
            break;
            localObject1 = this.zzjG;
            k = localObject1.length;
          }
          n = k + m;
          localObject3 = new int[n];
          if (k != 0)
          {
            arrayOfInt2 = this.zzjG;
            System.arraycopy(arrayOfInt2, 0, localObject3, 0, k);
          }
          System.arraycopy(arrayOfInt1, 0, localObject3, k, m);
          this.zzjG = ((int[])localObject3);
        }
        break;
      case 82: 
        k = paramzzsm.zzJf();
        n = paramzzsm.zzmq(k);
        m = paramzzsm.getPosition();
        k = 0;
        localObject1 = null;
        for (;;)
        {
          i1 = paramzzsm.zzJk();
          if (i1 <= 0) {
            break;
          }
          i1 = paramzzsm.zzJb();
          switch (i1)
          {
          default: 
            break;
          case 1: 
          case 2: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          case 13: 
          case 14: 
          case 15: 
          case 16: 
          case 17: 
            k += 1;
          }
        }
        if (k != 0)
        {
          paramzzsm.zzms(m);
          localObject2 = this.zzjG;
          if (localObject2 == null)
          {
            m = 0;
            localObject2 = null;
          }
          for (;;)
          {
            k += m;
            arrayOfInt2 = new int[k];
            if (m != 0)
            {
              localObject1 = this.zzjG;
              System.arraycopy(localObject1, 0, arrayOfInt2, 0, m);
            }
            for (;;)
            {
              k = paramzzsm.zzJk();
              if (k <= 0) {
                break;
              }
              int i3 = paramzzsm.zzJb();
              switch (i3)
              {
              default: 
                break;
              case 1: 
              case 2: 
              case 3: 
              case 4: 
              case 5: 
              case 6: 
              case 7: 
              case 8: 
              case 9: 
              case 10: 
              case 11: 
              case 12: 
              case 13: 
              case 14: 
              case 15: 
              case 16: 
              case 17: 
                k = m + 1;
                arrayOfInt2[m] = i3;
                m = k;
              }
            }
            localObject2 = this.zzjG;
            m = localObject2.length;
          }
          this.zzjG = arrayOfInt2;
        }
        paramzzsm.zzmr(n);
        break;
      case 90: 
        k = 90;
        m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zzjF;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
        }
        for (;;)
        {
          m += k;
          localObject2 = new zza[m];
          if (k != 0)
          {
            localObject3 = this.zzjF;
            System.arraycopy(localObject3, 0, localObject2, 0, k);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (k >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzag$zza;
            ((zza)localObject3).<init>();
            localObject2[k] = localObject3;
            localObject3 = localObject2[k];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.zzjF;
          k = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzag$zza;
        ((zza)localObject3).<init>();
        localObject2[k] = localObject3;
        localObject1 = localObject2[k];
        paramzzsm.zza((zzsu)localObject1);
        this.zzjF = ((zza[])localObject2);
        break;
      case 96: 
        boolean bool3 = paramzzsm.zzJc();
        this.zzjE = bool3;
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int k = super.zzz();
    int m = this.type;
    int i2 = zzsn.zzC(1, m);
    k += i2;
    Object localObject1 = this.zzjx;
    Object localObject2 = "";
    boolean bool2 = ((String)localObject1).equals(localObject2);
    int i3;
    if (!bool2)
    {
      localObject2 = this.zzjx;
      i3 = zzsn.zzo(2, (String)localObject2);
      k += i3;
    }
    localObject1 = this.zzjy;
    int i8;
    if (localObject1 != null)
    {
      localObject1 = this.zzjy;
      i3 = localObject1.length;
      if (i3 > 0)
      {
        i3 = k;
        k = 0;
        for (;;)
        {
          localObject2 = this.zzjy;
          m = localObject2.length;
          if (k >= m) {
            break;
          }
          localObject2 = this.zzjy[k];
          if (localObject2 != null)
          {
            i8 = 3;
            m = zzsn.zzc(i8, (zzsu)localObject2);
            i3 += m;
          }
          k += 1;
        }
        k = i3;
      }
    }
    localObject1 = this.zzjz;
    if (localObject1 != null)
    {
      localObject1 = this.zzjz;
      i3 = localObject1.length;
      if (i3 > 0)
      {
        i3 = k;
        k = 0;
        for (;;)
        {
          localObject2 = this.zzjz;
          m = localObject2.length;
          if (k >= m) {
            break;
          }
          localObject2 = this.zzjz[k];
          if (localObject2 != null)
          {
            i8 = 4;
            m = zzsn.zzc(i8, (zzsu)localObject2);
            i3 += m;
          }
          k += 1;
        }
        k = i3;
      }
    }
    localObject1 = this.zzjA;
    if (localObject1 != null)
    {
      localObject1 = this.zzjA;
      i3 = localObject1.length;
      if (i3 > 0)
      {
        i3 = k;
        k = 0;
        for (;;)
        {
          localObject2 = this.zzjA;
          m = localObject2.length;
          if (k >= m) {
            break;
          }
          localObject2 = this.zzjA[k];
          if (localObject2 != null)
          {
            i8 = 5;
            m = zzsn.zzc(i8, (zzsu)localObject2);
            i3 += m;
          }
          k += 1;
        }
        k = i3;
      }
    }
    localObject1 = this.zzjB;
    localObject2 = "";
    boolean bool3 = ((String)localObject1).equals(localObject2);
    if (!bool3)
    {
      localObject2 = this.zzjB;
      int i4 = zzsn.zzo(6, (String)localObject2);
      k += i4;
    }
    localObject1 = this.zzjC;
    localObject2 = "";
    boolean bool4 = ((String)localObject1).equals(localObject2);
    if (!bool4)
    {
      localObject2 = this.zzjC;
      int i5 = zzsn.zzo(7, (String)localObject2);
      k += i5;
    }
    long l1 = this.zzjD;
    long l2 = 0L;
    boolean bool5 = l1 < l2;
    if (bool5)
    {
      l2 = this.zzjD;
      int i6 = zzsn.zzd(8, l2);
      k += i6;
    }
    boolean bool6 = this.zzjH;
    int n;
    int i7;
    if (bool6)
    {
      n = this.zzjH;
      i7 = zzsn.zzf(9, n);
      k += i7;
    }
    localObject1 = this.zzjG;
    int i1;
    if (localObject1 != null)
    {
      localObject1 = this.zzjG;
      i7 = localObject1.length;
      if (i7 > 0)
      {
        i7 = 0;
        localObject1 = null;
        n = 0;
        localObject2 = null;
        for (;;)
        {
          int[] arrayOfInt = this.zzjG;
          i8 = arrayOfInt.length;
          if (i7 >= i8) {
            break;
          }
          arrayOfInt = this.zzjG;
          i8 = zzsn.zzmx(arrayOfInt[i7]);
          n += i8;
          i7 += 1;
        }
        k += i1;
        localObject1 = this.zzjG;
        i7 = localObject1.length * 1;
        k += i7;
      }
    }
    localObject1 = this.zzjF;
    if (localObject1 != null)
    {
      localObject1 = this.zzjF;
      i7 = localObject1.length;
      if (i7 > 0) {
        for (;;)
        {
          localObject1 = this.zzjF;
          i7 = localObject1.length;
          if (i >= i7) {
            break;
          }
          localObject1 = this.zzjF[i];
          if (localObject1 != null)
          {
            i1 = 11;
            i7 = zzsn.zzc(i1, (zzsu)localObject1);
            k += i7;
          }
          i += 1;
        }
      }
    }
    boolean bool1 = this.zzjE;
    if (bool1)
    {
      boolean bool7 = this.zzjE;
      int j = zzsn.zzf(12, bool7);
      k += j;
    }
    return k;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzag$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */