package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzsz$zzd
  extends zzso
{
  public String tag;
  public long zzbuR;
  public long zzbuS;
  public long zzbuT;
  public int zzbuU;
  public boolean zzbuV;
  public zzsz.zze[] zzbuW;
  public zzsz.zzb zzbuX;
  public byte[] zzbuY;
  public byte[] zzbuZ;
  public byte[] zzbva;
  public zzsz.zza zzbvb;
  public String zzbvc;
  public long zzbvd;
  public zzsz.zzc zzbve;
  public byte[] zzbvf;
  public int zzbvg;
  public int[] zzbvh;
  public long zzbvi;
  public int zzob;
  
  public zzsz$zzd()
  {
    zzJF();
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
      boolean bool3 = paramObject instanceof zzd;
      if (bool3)
      {
        paramObject = (zzd)paramObject;
        long l1 = this.zzbuR;
        long l2 = ((zzd)paramObject).zzbuR;
        bool3 = l1 < l2;
        if (!bool3)
        {
          l1 = this.zzbuS;
          l2 = ((zzd)paramObject).zzbuS;
          bool3 = l1 < l2;
          if (!bool3)
          {
            l1 = this.zzbuT;
            l2 = ((zzd)paramObject).zzbuT;
            bool3 = l1 < l2;
            if (!bool3)
            {
              Object localObject1 = this.tag;
              label126:
              boolean bool4;
              Object localObject2;
              if (localObject1 == null)
              {
                localObject1 = ((zzd)paramObject).tag;
                if (localObject1 != null) {
                  continue;
                }
                int i = this.zzbuU;
                int k = ((zzd)paramObject).zzbuU;
                if (i != k) {
                  continue;
                }
                i = this.zzob;
                k = ((zzd)paramObject).zzob;
                if (i != k) {
                  continue;
                }
                bool4 = this.zzbuV;
                boolean bool6 = ((zzd)paramObject).zzbuV;
                if (bool4 != bool6) {
                  continue;
                }
                localObject1 = this.zzbuW;
                localObject2 = ((zzd)paramObject).zzbuW;
                bool4 = zzss.equals((Object[])localObject1, (Object[])localObject2);
                if (!bool4) {
                  continue;
                }
                localObject1 = this.zzbuX;
                if (localObject1 != null) {
                  break label586;
                }
                localObject1 = ((zzd)paramObject).zzbuX;
                if (localObject1 != null) {
                  continue;
                }
                label231:
                localObject1 = this.zzbuY;
                localObject2 = ((zzd)paramObject).zzbuY;
                bool4 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
                if (!bool4) {
                  continue;
                }
                localObject1 = this.zzbuZ;
                localObject2 = ((zzd)paramObject).zzbuZ;
                bool4 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
                if (!bool4) {
                  continue;
                }
                localObject1 = this.zzbva;
                localObject2 = ((zzd)paramObject).zzbva;
                bool4 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
                if (!bool4) {
                  continue;
                }
                localObject1 = this.zzbvb;
                if (localObject1 != null) {
                  break label615;
                }
                localObject1 = ((zzd)paramObject).zzbvb;
                if (localObject1 != null) {
                  continue;
                }
                label331:
                localObject1 = this.zzbvc;
                if (localObject1 != null) {
                  break label644;
                }
                localObject1 = ((zzd)paramObject).zzbvc;
                if (localObject1 != null) {
                  continue;
                }
                label353:
                l1 = this.zzbvd;
                l2 = ((zzd)paramObject).zzbvd;
                bool4 = l1 < l2;
                if (bool4) {
                  continue;
                }
                localObject1 = this.zzbve;
                if (localObject1 != null) {
                  break label673;
                }
                localObject1 = ((zzd)paramObject).zzbve;
                if (localObject1 != null) {
                  continue;
                }
              }
              boolean bool5;
              label586:
              label615:
              label644:
              label673:
              do
              {
                localObject1 = this.zzbvf;
                localObject2 = ((zzd)paramObject).zzbvf;
                bool4 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
                if (!bool4) {
                  break;
                }
                int j = this.zzbvg;
                int m = ((zzd)paramObject).zzbvg;
                if (j != m) {
                  break;
                }
                localObject1 = this.zzbvh;
                localObject2 = ((zzd)paramObject).zzbvh;
                bool5 = zzss.equals((int[])localObject1, (int[])localObject2);
                if (!bool5) {
                  break;
                }
                l1 = this.zzbvi;
                l2 = ((zzd)paramObject).zzbvi;
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
                    break label702;
                  }
                }
                localObject1 = ((zzd)paramObject).zzbuj;
                if (localObject1 != null)
                {
                  localObject1 = ((zzd)paramObject).zzbuj;
                  bool5 = ((zzsq)localObject1).isEmpty();
                  if (!bool5) {
                    break;
                  }
                }
                bool2 = bool1;
                break;
                localObject1 = this.tag;
                localObject2 = ((zzd)paramObject).tag;
                bool5 = ((String)localObject1).equals(localObject2);
                if (bool5) {
                  break label126;
                }
                break;
                localObject1 = this.zzbuX;
                localObject2 = ((zzd)paramObject).zzbuX;
                bool5 = ((zzsz.zzb)localObject1).equals(localObject2);
                if (bool5) {
                  break label231;
                }
                break;
                localObject1 = this.zzbvb;
                localObject2 = ((zzd)paramObject).zzbvb;
                bool5 = ((zzsz.zza)localObject1).equals(localObject2);
                if (bool5) {
                  break label331;
                }
                break;
                localObject1 = this.zzbvc;
                localObject2 = ((zzd)paramObject).zzbvc;
                bool5 = ((String)localObject1).equals(localObject2);
                if (bool5) {
                  break label353;
                }
                break;
                localObject1 = this.zzbve;
                localObject2 = ((zzd)paramObject).zzbve;
                bool5 = ((zzsz.zzc)localObject1).equals(localObject2);
              } while (bool5);
              continue;
              label702:
              localzzsq1 = this.zzbuj;
              zzsq localzzsq2 = ((zzd)paramObject).zzbuj;
              bool2 = localzzsq1.equals(localzzsq2);
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 32;
    int j = 0;
    zzsq localzzsq = null;
    int k = (getClass().getName().hashCode() + 527) * 31;
    long l1 = this.zzbuR;
    long l2 = this.zzbuR >>> i;
    int n = (int)(l1 ^ l2);
    k = (k + n) * 31;
    l1 = this.zzbuS;
    l2 = this.zzbuS >>> i;
    n = (int)(l1 ^ l2);
    k = (k + n) * 31;
    l1 = this.zzbuT;
    l2 = this.zzbuT >>> i;
    l1 ^= l2;
    n = (int)l1;
    k += n;
    n = k * 31;
    Object localObject1 = this.tag;
    int m;
    if (localObject1 == null)
    {
      k = 0;
      localObject1 = null;
      k = (k + n) * 31;
      n = this.zzbuU;
      k = (k + n) * 31;
      n = this.zzob;
      n = (k + n) * 31;
      boolean bool1 = this.zzbuV;
      if (!bool1) {
        break label599;
      }
      m = 1231;
      label205:
      m = (m + n) * 31;
      Object localObject2 = this.zzbuW;
      n = zzss.hashCode((Object[])localObject2);
      m += n;
      n = m * 31;
      localObject1 = this.zzbuX;
      if (localObject1 != null) {
        break label607;
      }
      m = 0;
      localObject1 = null;
      label259:
      m = (m + n) * 31;
      n = Arrays.hashCode(this.zzbuY);
      m = (m + n) * 31;
      n = Arrays.hashCode(this.zzbuZ);
      m = (m + n) * 31;
      localObject2 = this.zzbva;
      n = Arrays.hashCode((byte[])localObject2);
      m += n;
      n = m * 31;
      localObject1 = this.zzbvb;
      if (localObject1 != null) {
        break label623;
      }
      m = 0;
      localObject1 = null;
      label351:
      m += n;
      n = m * 31;
      localObject1 = this.zzbvc;
      if (localObject1 != null) {
        break label639;
      }
      m = 0;
      localObject1 = null;
      label382:
      m = (m + n) * 31;
      l1 = this.zzbvd;
      l2 = this.zzbvd >>> i;
      l1 ^= l2;
      n = (int)l1;
      m += n;
      n = m * 31;
      localObject1 = this.zzbve;
      if (localObject1 != null) {
        break label655;
      }
      m = 0;
      localObject1 = null;
      label449:
      m = (m + n) * 31;
      n = Arrays.hashCode(this.zzbvf);
      m = (m + n) * 31;
      n = this.zzbvg;
      m = (m + n) * 31;
      n = zzss.hashCode(this.zzbvh);
      m = (m + n) * 31;
      l1 = this.zzbvi;
      l2 = this.zzbvi >>> i;
      l1 ^= l2;
      n = (int)l1;
      m = (m + n) * 31;
      localObject2 = this.zzbuj;
      if (localObject2 != null)
      {
        localObject2 = this.zzbuj;
        boolean bool2 = ((zzsq)localObject2).isEmpty();
        if (!bool2) {
          break label671;
        }
      }
    }
    for (;;)
    {
      return m + j;
      localObject1 = this.tag;
      m = ((String)localObject1).hashCode();
      break;
      label599:
      m = 1237;
      break label205;
      label607:
      localObject1 = this.zzbuX;
      m = ((zzsz.zzb)localObject1).hashCode();
      break label259;
      label623:
      localObject1 = this.zzbvb;
      m = ((zzsz.zza)localObject1).hashCode();
      break label351;
      label639:
      localObject1 = this.zzbvc;
      m = ((String)localObject1).hashCode();
      break label382;
      label655:
      localObject1 = this.zzbve;
      m = ((zzsz.zzc)localObject1).hashCode();
      break label449;
      label671:
      localzzsq = this.zzbuj;
      j = localzzsq.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 0;
    long l1 = 0L;
    long l2 = this.zzbuR;
    int j = l2 < l1;
    if (j != 0)
    {
      j = 1;
      l2 = this.zzbuR;
      paramzzsn.zzb(j, l2);
    }
    Object localObject1 = this.tag;
    Object localObject2 = "";
    boolean bool1 = ((String)localObject1).equals(localObject2);
    int k;
    if (!bool1)
    {
      k = 2;
      localObject2 = this.tag;
      paramzzsn.zzn(k, (String)localObject2);
    }
    localObject1 = this.zzbuW;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuW;
      k = localObject1.length;
      if (k > 0)
      {
        k = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbuW;
          int i9 = localObject2.length;
          if (k >= i9) {
            break;
          }
          localObject2 = this.zzbuW[k];
          if (localObject2 != null)
          {
            int i11 = 3;
            paramzzsn.zza(i11, (zzsu)localObject2);
          }
          k += 1;
        }
      }
    }
    localObject1 = this.zzbuY;
    localObject2 = zzsx.zzbuD;
    boolean bool2 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    int m;
    if (!bool2)
    {
      m = 6;
      localObject2 = this.zzbuY;
      paramzzsn.zza(m, (byte[])localObject2);
    }
    localObject1 = this.zzbvb;
    if (localObject1 != null)
    {
      m = 7;
      localObject2 = this.zzbvb;
      paramzzsn.zza(m, (zzsu)localObject2);
    }
    localObject1 = this.zzbuZ;
    localObject2 = zzsx.zzbuD;
    boolean bool3 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    int n;
    if (!bool3)
    {
      n = 8;
      localObject2 = this.zzbuZ;
      paramzzsn.zza(n, (byte[])localObject2);
    }
    localObject1 = this.zzbuX;
    if (localObject1 != null)
    {
      n = 9;
      localObject2 = this.zzbuX;
      paramzzsn.zza(n, (zzsu)localObject2);
    }
    boolean bool4 = this.zzbuV;
    if (bool4)
    {
      i1 = 10;
      boolean bool12 = this.zzbuV;
      paramzzsn.zze(i1, bool12);
    }
    int i1 = this.zzbuU;
    int i10;
    if (i1 != 0)
    {
      i1 = 11;
      i10 = this.zzbuU;
      paramzzsn.zzA(i1, i10);
    }
    i1 = this.zzob;
    if (i1 != 0)
    {
      i1 = 12;
      i10 = this.zzob;
      paramzzsn.zzA(i1, i10);
    }
    localObject1 = this.zzbva;
    localObject2 = zzsx.zzbuD;
    boolean bool5 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    if (!bool5)
    {
      int i2 = 13;
      localObject2 = this.zzbva;
      paramzzsn.zza(i2, (byte[])localObject2);
    }
    localObject1 = this.zzbvc;
    localObject2 = "";
    boolean bool6 = ((String)localObject1).equals(localObject2);
    if (!bool6)
    {
      int i3 = 14;
      localObject2 = this.zzbvc;
      paramzzsn.zzn(i3, (String)localObject2);
    }
    l2 = this.zzbvd;
    long l3 = 180000L;
    boolean bool7 = l2 < l3;
    int i4;
    if (bool7)
    {
      i4 = 15;
      l2 = this.zzbvd;
      paramzzsn.zzc(i4, l2);
    }
    localObject1 = this.zzbve;
    if (localObject1 != null)
    {
      i4 = 16;
      localObject2 = this.zzbve;
      paramzzsn.zza(i4, (zzsu)localObject2);
    }
    l2 = this.zzbuS;
    boolean bool8 = l2 < l1;
    if (bool8)
    {
      int i5 = 17;
      l2 = this.zzbuS;
      paramzzsn.zzb(i5, l2);
    }
    localObject1 = this.zzbvf;
    localObject2 = zzsx.zzbuD;
    boolean bool9 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    if (!bool9)
    {
      i6 = 18;
      localObject2 = this.zzbvf;
      paramzzsn.zza(i6, (byte[])localObject2);
    }
    int i6 = this.zzbvg;
    if (i6 != 0)
    {
      i6 = 19;
      i10 = this.zzbvg;
      paramzzsn.zzA(i6, i10);
    }
    localObject1 = this.zzbvh;
    if (localObject1 != null)
    {
      localObject1 = this.zzbvh;
      i6 = localObject1.length;
      if (i6 > 0) {
        for (;;)
        {
          localObject1 = this.zzbvh;
          i6 = localObject1.length;
          if (i >= i6) {
            break;
          }
          i6 = 20;
          localObject2 = this.zzbvh;
          i10 = localObject2[i];
          paramzzsn.zzA(i6, i10);
          i += 1;
        }
      }
    }
    long l4 = this.zzbuT;
    boolean bool10 = l4 < l1;
    if (bool10)
    {
      int i7 = 21;
      l2 = this.zzbuT;
      paramzzsn.zzb(i7, l2);
    }
    l4 = this.zzbvi;
    boolean bool11 = l4 < l1;
    if (bool11)
    {
      int i8 = 22;
      l2 = this.zzbvi;
      paramzzsn.zzb(i8, l2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzd zzJF()
  {
    long l = 0L;
    this.zzbuR = l;
    this.zzbuS = l;
    this.zzbuT = l;
    this.tag = "";
    this.zzbuU = 0;
    this.zzob = 0;
    this.zzbuV = false;
    Object localObject = zzsz.zze.zzJG();
    this.zzbuW = ((zzsz.zze[])localObject);
    this.zzbuX = null;
    localObject = zzsx.zzbuD;
    this.zzbuY = ((byte[])localObject);
    localObject = zzsx.zzbuD;
    this.zzbuZ = ((byte[])localObject);
    localObject = zzsx.zzbuD;
    this.zzbva = ((byte[])localObject);
    this.zzbvb = null;
    this.zzbvc = "";
    this.zzbvd = 180000L;
    this.zzbve = null;
    localObject = zzsx.zzbuD;
    this.zzbvf = ((byte[])localObject);
    this.zzbvg = 0;
    localObject = zzsx.zzbuw;
    this.zzbvh = ((int[])localObject);
    this.zzbvi = l;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzd zzV(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      long l;
      Object localObject1;
      int m;
      Object localObject2;
      Object localObject3;
      int n;
      int k;
      switch (i)
      {
      default: 
        boolean bool1 = zza(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 8: 
        l = paramzzsm.zzJa();
        this.zzbuR = l;
        break;
      case 18: 
        localObject1 = paramzzsm.readString();
        this.tag = ((String)localObject1);
        break;
      case 26: 
        int j = 26;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzbuW;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zzsz.zze[m];
          if (j != 0)
          {
            localObject3 = this.zzbuW;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzsz$zze;
            ((zzsz.zze)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzbuW;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzsz$zze;
        ((zzsz.zze)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzbuW = ((zzsz.zze[])localObject2);
        break;
      case 50: 
        localObject1 = paramzzsm.readBytes();
        this.zzbuY = ((byte[])localObject1);
        break;
      case 58: 
        localObject1 = this.zzbvb;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/zzsz$zza;
          ((zzsz.zza)localObject1).<init>();
          this.zzbvb = ((zzsz.zza)localObject1);
        }
        localObject1 = this.zzbvb;
        paramzzsm.zza((zzsu)localObject1);
        break;
      case 66: 
        localObject1 = paramzzsm.readBytes();
        this.zzbuZ = ((byte[])localObject1);
        break;
      case 74: 
        localObject1 = this.zzbuX;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/zzsz$zzb;
          ((zzsz.zzb)localObject1).<init>();
          this.zzbuX = ((zzsz.zzb)localObject1);
        }
        localObject1 = this.zzbuX;
        paramzzsm.zza((zzsu)localObject1);
        break;
      case 80: 
        boolean bool2 = paramzzsm.zzJc();
        this.zzbuV = bool2;
        break;
      case 88: 
        k = paramzzsm.zzJb();
        this.zzbuU = k;
        break;
      case 96: 
        k = paramzzsm.zzJb();
        this.zzob = k;
        break;
      case 106: 
        localObject1 = paramzzsm.readBytes();
        this.zzbva = ((byte[])localObject1);
        break;
      case 114: 
        localObject1 = paramzzsm.readString();
        this.zzbvc = ((String)localObject1);
        break;
      case 120: 
        l = paramzzsm.zzJe();
        this.zzbvd = l;
        break;
      case 130: 
        localObject1 = this.zzbve;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/zzsz$zzc;
          ((zzsz.zzc)localObject1).<init>();
          this.zzbve = ((zzsz.zzc)localObject1);
        }
        localObject1 = this.zzbve;
        paramzzsm.zza((zzsu)localObject1);
        break;
      case 136: 
        l = paramzzsm.zzJa();
        this.zzbuS = l;
        break;
      case 146: 
        localObject1 = paramzzsm.readBytes();
        this.zzbvf = ((byte[])localObject1);
        break;
      case 152: 
        k = paramzzsm.zzJb();
        switch (k)
        {
        default: 
          break;
        case 0: 
        case 1: 
        case 2: 
          this.zzbvg = k;
        }
        break;
      case 160: 
        k = 160;
        m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zzbvh;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
        }
        for (;;)
        {
          m += k;
          localObject2 = new int[m];
          if (k != 0)
          {
            localObject3 = this.zzbvh;
            System.arraycopy(localObject3, 0, localObject2, 0, k);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (k >= n) {
              break;
            }
            n = paramzzsm.zzJb();
            localObject2[k] = n;
            paramzzsm.zzIX();
            k += 1;
          }
          localObject1 = this.zzbvh;
          k = localObject1.length;
        }
        n = paramzzsm.zzJb();
        localObject2[k] = n;
        this.zzbvh = ((int[])localObject2);
        break;
      case 162: 
        k = paramzzsm.zzJf();
        n = paramzzsm.zzmq(k);
        m = paramzzsm.getPosition();
        k = 0;
        localObject1 = null;
        int i1;
        for (;;)
        {
          i1 = paramzzsm.zzJk();
          if (i1 <= 0) {
            break;
          }
          paramzzsm.zzJb();
          k += 1;
        }
        paramzzsm.zzms(m);
        localObject2 = this.zzbvh;
        if (localObject2 == null)
        {
          m = 0;
          localObject2 = null;
        }
        for (;;)
        {
          k += m;
          localObject1 = new int[k];
          if (m != 0)
          {
            int[] arrayOfInt = this.zzbvh;
            System.arraycopy(arrayOfInt, 0, localObject1, 0, m);
          }
          for (;;)
          {
            i1 = localObject1.length;
            if (m >= i1) {
              break;
            }
            i1 = paramzzsm.zzJb();
            localObject1[m] = i1;
            m += 1;
          }
          localObject2 = this.zzbvh;
          m = localObject2.length;
        }
        this.zzbvh = ((int[])localObject1);
        paramzzsm.zzmr(n);
        break;
      case 168: 
        l = paramzzsm.zzJa();
        this.zzbuT = l;
        break;
      case 176: 
        l = paramzzsm.zzJa();
        this.zzbvi = l;
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int[] arrayOfInt = null;
    long l1 = 0L;
    int m = super.zzz();
    long l2 = this.zzbuR;
    boolean bool3 = l2 < l1;
    if (bool3)
    {
      l3 = this.zzbuR;
      int n = zzsn.zzd(1, l3);
      m += n;
    }
    Object localObject1 = this.tag;
    Object localObject2 = "";
    boolean bool4 = ((String)localObject1).equals(localObject2);
    int i1;
    if (!bool4)
    {
      localObject2 = this.tag;
      i1 = zzsn.zzo(2, (String)localObject2);
      m += i1;
    }
    localObject1 = this.zzbuW;
    if (localObject1 != null)
    {
      localObject1 = this.zzbuW;
      i1 = localObject1.length;
      if (i1 > 0)
      {
        i1 = m;
        m = 0;
        for (;;)
        {
          localObject2 = this.zzbuW;
          int i10 = localObject2.length;
          if (m >= i10) {
            break;
          }
          localObject2 = this.zzbuW[m];
          if (localObject2 != null)
          {
            int i12 = 3;
            i10 = zzsn.zzc(i12, (zzsu)localObject2);
            i1 += i10;
          }
          m += 1;
        }
        m = i1;
      }
    }
    localObject1 = this.zzbuY;
    localObject2 = zzsx.zzbuD;
    boolean bool5 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    int i2;
    if (!bool5)
    {
      localObject2 = this.zzbuY;
      i2 = zzsn.zzb(6, (byte[])localObject2);
      m += i2;
    }
    localObject1 = this.zzbvb;
    if (localObject1 != null)
    {
      localObject2 = this.zzbvb;
      i2 = zzsn.zzc(7, (zzsu)localObject2);
      m += i2;
    }
    localObject1 = this.zzbuZ;
    localObject2 = zzsx.zzbuD;
    boolean bool6 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    int i3;
    if (!bool6)
    {
      localObject2 = this.zzbuZ;
      i3 = zzsn.zzb(8, (byte[])localObject2);
      m += i3;
    }
    localObject1 = this.zzbuX;
    if (localObject1 != null)
    {
      localObject2 = this.zzbuX;
      i3 = zzsn.zzc(9, (zzsu)localObject2);
      m += i3;
    }
    boolean bool7 = this.zzbuV;
    if (bool7)
    {
      boolean bool13 = this.zzbuV;
      i4 = zzsn.zzf(10, bool13);
      m += i4;
    }
    int i4 = this.zzbuU;
    int i11;
    if (i4 != 0)
    {
      i11 = this.zzbuU;
      i4 = zzsn.zzC(11, i11);
      m += i4;
    }
    i4 = this.zzob;
    if (i4 != 0)
    {
      i11 = this.zzob;
      i4 = zzsn.zzC(12, i11);
      m += i4;
    }
    localObject1 = this.zzbva;
    localObject2 = zzsx.zzbuD;
    boolean bool8 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    if (!bool8)
    {
      localObject2 = this.zzbva;
      int i5 = zzsn.zzb(13, (byte[])localObject2);
      m += i5;
    }
    localObject1 = this.zzbvc;
    localObject2 = "";
    boolean bool9 = ((String)localObject1).equals(localObject2);
    if (!bool9)
    {
      localObject2 = this.zzbvc;
      int i6 = zzsn.zzo(14, (String)localObject2);
      m += i6;
    }
    l2 = this.zzbvd;
    long l3 = 180000L;
    boolean bool10 = l2 < l3;
    int i7;
    if (bool10)
    {
      l3 = this.zzbvd;
      i7 = zzsn.zze(15, l3);
      m += i7;
    }
    localObject1 = this.zzbve;
    if (localObject1 != null)
    {
      localObject2 = this.zzbve;
      i7 = zzsn.zzc(16, (zzsu)localObject2);
      m += i7;
    }
    l2 = this.zzbuS;
    boolean bool11 = l2 < l1;
    if (bool11)
    {
      l3 = this.zzbuS;
      int i8 = zzsn.zzd(17, l3);
      m += i8;
    }
    localObject1 = this.zzbvf;
    localObject2 = zzsx.zzbuD;
    boolean bool12 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
    if (!bool12)
    {
      localObject2 = this.zzbvf;
      i9 = zzsn.zzb(18, (byte[])localObject2);
      m += i9;
    }
    int i9 = this.zzbvg;
    if (i9 != 0)
    {
      i11 = this.zzbvg;
      i9 = zzsn.zzC(19, i11);
      m += i9;
    }
    localObject1 = this.zzbvh;
    if (localObject1 != null)
    {
      localObject1 = this.zzbvh;
      i9 = localObject1.length;
      if (i9 > 0)
      {
        i9 = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzbvh;
          i11 = localObject2.length;
          if (i >= i11) {
            break;
          }
          localObject2 = this.zzbvh;
          i11 = zzsn.zzmx(localObject2[i]);
          i9 += i11;
          i += 1;
        }
        m += i9;
        arrayOfInt = this.zzbvh;
        i = arrayOfInt.length * 2;
        m += i;
      }
    }
    l2 = this.zzbuT;
    boolean bool1 = l2 < l1;
    if (bool1)
    {
      l2 = this.zzbuT;
      int j = zzsn.zzd(21, l2);
      m += j;
    }
    l2 = this.zzbvi;
    boolean bool2 = l2 < l1;
    if (bool2)
    {
      l2 = this.zzbvi;
      int k = zzsn.zzd(22, l2);
      m += k;
    }
    return m;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsz$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */