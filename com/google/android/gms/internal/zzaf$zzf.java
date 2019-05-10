package com.google.android.gms.internal;

public final class zzaf$zzf
  extends zzso
{
  public String version;
  public String[] zziG;
  public String[] zziH;
  public zzag.zza[] zziI;
  public zzaf.zze[] zziJ;
  public zzaf.zzb[] zziK;
  public zzaf.zzb[] zziL;
  public zzaf.zzb[] zziM;
  public zzaf.zzg[] zziN;
  public String zziO;
  public String zziP;
  public String zziQ;
  public zzaf.zza zziR;
  public float zziS;
  public boolean zziT;
  public String[] zziU;
  public int zziV;
  
  public zzaf$zzf()
  {
    zzJ();
  }
  
  public static zzf zzc(byte[] paramArrayOfByte)
  {
    zzf localzzf = new com/google/android/gms/internal/zzaf$zzf;
    localzzf.<init>();
    return (zzf)zzsu.mergeFrom(localzzf, paramArrayOfByte);
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
      boolean bool3 = paramObject instanceof zzf;
      if (bool3)
      {
        paramObject = (zzf)paramObject;
        Object localObject1 = this.zziG;
        Object localObject2 = ((zzf)paramObject).zziG;
        bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (bool3)
        {
          localObject1 = this.zziH;
          localObject2 = ((zzf)paramObject).zziH;
          bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
          if (bool3)
          {
            localObject1 = this.zziI;
            localObject2 = ((zzf)paramObject).zziI;
            bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (bool3)
            {
              localObject1 = this.zziJ;
              localObject2 = ((zzf)paramObject).zziJ;
              bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
              if (bool3)
              {
                localObject1 = this.zziK;
                localObject2 = ((zzf)paramObject).zziK;
                bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
                if (bool3)
                {
                  localObject1 = this.zziL;
                  localObject2 = ((zzf)paramObject).zziL;
                  bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
                  if (bool3)
                  {
                    localObject1 = this.zziM;
                    localObject2 = ((zzf)paramObject).zziM;
                    bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
                    if (bool3)
                    {
                      localObject1 = this.zziN;
                      localObject2 = ((zzf)paramObject).zziN;
                      bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
                      if (bool3)
                      {
                        localObject1 = this.zziO;
                        if (localObject1 == null)
                        {
                          localObject1 = ((zzf)paramObject).zziO;
                          if (localObject1 != null) {
                            continue;
                          }
                          label262:
                          localObject1 = this.zziP;
                          if (localObject1 != null) {
                            break label539;
                          }
                          localObject1 = ((zzf)paramObject).zziP;
                          if (localObject1 != null) {
                            continue;
                          }
                          label284:
                          localObject1 = this.zziQ;
                          if (localObject1 != null) {
                            break label568;
                          }
                          localObject1 = ((zzf)paramObject).zziQ;
                          if (localObject1 != null) {
                            continue;
                          }
                          label306:
                          localObject1 = this.version;
                          if (localObject1 != null) {
                            break label597;
                          }
                          localObject1 = ((zzf)paramObject).version;
                          if (localObject1 != null) {
                            continue;
                          }
                          label328:
                          localObject1 = this.zziR;
                          if (localObject1 != null) {
                            break label626;
                          }
                          localObject1 = ((zzf)paramObject).zziR;
                          if (localObject1 != null) {
                            continue;
                          }
                        }
                        boolean bool5;
                        label539:
                        label568:
                        label597:
                        label626:
                        do
                        {
                          float f1 = this.zziS;
                          int i = Float.floatToIntBits(f1);
                          float f2 = ((zzf)paramObject).zziS;
                          int k = Float.floatToIntBits(f2);
                          if (i != k) {
                            break;
                          }
                          boolean bool4 = this.zziT;
                          boolean bool6 = ((zzf)paramObject).zziT;
                          if (bool4 != bool6) {
                            break;
                          }
                          localObject1 = this.zziU;
                          localObject2 = ((zzf)paramObject).zziU;
                          bool4 = zzss.equals((Object[])localObject1, (Object[])localObject2);
                          if (!bool4) {
                            break;
                          }
                          int j = this.zziV;
                          int m = ((zzf)paramObject).zziV;
                          if (j != m) {
                            break;
                          }
                          localObject1 = this.zzbuj;
                          if (localObject1 != null)
                          {
                            localObject1 = this.zzbuj;
                            bool5 = ((zzsq)localObject1).isEmpty();
                            if (!bool5) {
                              break label655;
                            }
                          }
                          localObject1 = ((zzf)paramObject).zzbuj;
                          if (localObject1 != null)
                          {
                            localObject1 = ((zzf)paramObject).zzbuj;
                            bool5 = ((zzsq)localObject1).isEmpty();
                            if (!bool5) {
                              break;
                            }
                          }
                          bool2 = bool1;
                          break;
                          localObject1 = this.zziO;
                          localObject2 = ((zzf)paramObject).zziO;
                          bool5 = ((String)localObject1).equals(localObject2);
                          if (bool5) {
                            break label262;
                          }
                          break;
                          localObject1 = this.zziP;
                          localObject2 = ((zzf)paramObject).zziP;
                          bool5 = ((String)localObject1).equals(localObject2);
                          if (bool5) {
                            break label284;
                          }
                          break;
                          localObject1 = this.zziQ;
                          localObject2 = ((zzf)paramObject).zziQ;
                          bool5 = ((String)localObject1).equals(localObject2);
                          if (bool5) {
                            break label306;
                          }
                          break;
                          localObject1 = this.version;
                          localObject2 = ((zzf)paramObject).version;
                          bool5 = ((String)localObject1).equals(localObject2);
                          if (bool5) {
                            break label328;
                          }
                          break;
                          localObject1 = this.zziR;
                          localObject2 = ((zzf)paramObject).zziR;
                          bool5 = ((zzaf.zza)localObject1).equals(localObject2);
                        } while (bool5);
                        continue;
                        label655:
                        localzzsq1 = this.zzbuj;
                        zzsq localzzsq2 = ((zzf)paramObject).zzbuj;
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
  
  public int hashCode()
  {
    int i = 0;
    zzsq localzzsq = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    int m = zzss.hashCode(this.zziG);
    j = (j + m) * 31;
    m = zzss.hashCode(this.zziH);
    j = (j + m) * 31;
    m = zzss.hashCode(this.zziI);
    j = (j + m) * 31;
    m = zzss.hashCode(this.zziJ);
    j = (j + m) * 31;
    m = zzss.hashCode(this.zziK);
    j = (j + m) * 31;
    m = zzss.hashCode(this.zziL);
    j = (j + m) * 31;
    m = zzss.hashCode(this.zziM);
    j = (j + m) * 31;
    Object localObject1 = this.zziN;
    m = zzss.hashCode((Object[])localObject1);
    j += m;
    m = j * 31;
    Object localObject2 = this.zziO;
    label208:
    label235:
    label262:
    label289:
    int k;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      j += m;
      m = j * 31;
      localObject2 = this.zziP;
      if (localObject2 != null) {
        break label419;
      }
      j = 0;
      localObject2 = null;
      j += m;
      m = j * 31;
      localObject2 = this.zziQ;
      if (localObject2 != null) {
        break label434;
      }
      j = 0;
      localObject2 = null;
      j += m;
      m = j * 31;
      localObject2 = this.version;
      if (localObject2 != null) {
        break label449;
      }
      j = 0;
      localObject2 = null;
      j += m;
      m = j * 31;
      localObject2 = this.zziR;
      if (localObject2 != null) {
        break label464;
      }
      j = 0;
      localObject2 = null;
      j = (j + m) * 31;
      float f = this.zziS;
      m = Float.floatToIntBits(f);
      m = (j + m) * 31;
      boolean bool1 = this.zziT;
      if (!bool1) {
        break label479;
      }
      k = 1231;
      label332:
      k = (k + m) * 31;
      m = zzss.hashCode(this.zziU);
      k = (k + m) * 31;
      m = this.zziV;
      k = (k + m) * 31;
      localObject1 = this.zzbuj;
      if (localObject1 != null)
      {
        localObject1 = this.zzbuj;
        boolean bool2 = ((zzsq)localObject1).isEmpty();
        if (!bool2) {
          break label486;
        }
      }
    }
    for (;;)
    {
      return k + i;
      localObject2 = this.zziO;
      k = ((String)localObject2).hashCode();
      break;
      label419:
      localObject2 = this.zziP;
      k = ((String)localObject2).hashCode();
      break label208;
      label434:
      localObject2 = this.zziQ;
      k = ((String)localObject2).hashCode();
      break label235;
      label449:
      localObject2 = this.version;
      k = ((String)localObject2).hashCode();
      break label262;
      label464:
      localObject2 = this.zziR;
      k = ((zzaf.zza)localObject2).hashCode();
      break label289;
      label479:
      k = 1237;
      break label332;
      label486:
      localzzsq = this.zzbuj;
      i = localzzsq.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 0;
    Object localObject1 = this.zziH;
    int j;
    int i5;
    if (localObject1 != null)
    {
      localObject1 = this.zziH;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zziH;
          i3 = localObject2.length;
          if (j >= i3) {
            break;
          }
          localObject2 = this.zziH[j];
          if (localObject2 != null)
          {
            i5 = 1;
            paramzzsn.zzn(i5, (String)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziI;
    if (localObject1 != null)
    {
      localObject1 = this.zziI;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zziI;
          i3 = localObject2.length;
          if (j >= i3) {
            break;
          }
          localObject2 = this.zziI[j];
          if (localObject2 != null)
          {
            i5 = 2;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziJ;
    if (localObject1 != null)
    {
      localObject1 = this.zziJ;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zziJ;
          i3 = localObject2.length;
          if (j >= i3) {
            break;
          }
          localObject2 = this.zziJ[j];
          if (localObject2 != null)
          {
            i5 = 3;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziK;
    if (localObject1 != null)
    {
      localObject1 = this.zziK;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zziK;
          i3 = localObject2.length;
          if (j >= i3) {
            break;
          }
          localObject2 = this.zziK[j];
          if (localObject2 != null)
          {
            i5 = 4;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziL;
    if (localObject1 != null)
    {
      localObject1 = this.zziL;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zziL;
          i3 = localObject2.length;
          if (j >= i3) {
            break;
          }
          localObject2 = this.zziL[j];
          if (localObject2 != null)
          {
            i5 = 5;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziM;
    if (localObject1 != null)
    {
      localObject1 = this.zziM;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zziM;
          i3 = localObject2.length;
          if (j >= i3) {
            break;
          }
          localObject2 = this.zziM[j];
          if (localObject2 != null)
          {
            i5 = 6;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziN;
    if (localObject1 != null)
    {
      localObject1 = this.zziN;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zziN;
          i3 = localObject2.length;
          if (j >= i3) {
            break;
          }
          localObject2 = this.zziN[j];
          if (localObject2 != null)
          {
            i5 = 7;
            paramzzsn.zza(i5, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zziO;
    Object localObject2 = "";
    boolean bool1 = ((String)localObject1).equals(localObject2);
    if (!bool1)
    {
      int k = 9;
      f1 = 1.3E-44F;
      localObject2 = this.zziO;
      paramzzsn.zzn(k, (String)localObject2);
    }
    localObject1 = this.zziP;
    localObject2 = "";
    boolean bool2 = ((String)localObject1).equals(localObject2);
    if (!bool2)
    {
      int m = 10;
      f1 = 1.4E-44F;
      localObject2 = this.zziP;
      paramzzsn.zzn(m, (String)localObject2);
    }
    localObject1 = this.zziQ;
    localObject2 = "0";
    boolean bool3 = ((String)localObject1).equals(localObject2);
    if (!bool3)
    {
      int n = 12;
      f1 = 1.7E-44F;
      localObject2 = this.zziQ;
      paramzzsn.zzn(n, (String)localObject2);
    }
    localObject1 = this.version;
    localObject2 = "";
    boolean bool4 = ((String)localObject1).equals(localObject2);
    if (!bool4)
    {
      i1 = 13;
      f1 = 1.8E-44F;
      localObject2 = this.version;
      paramzzsn.zzn(i1, (String)localObject2);
    }
    localObject1 = this.zziR;
    if (localObject1 != null)
    {
      i1 = 14;
      f1 = 2.0E-44F;
      localObject2 = this.zziR;
      paramzzsn.zza(i1, (zzsu)localObject2);
    }
    float f1 = this.zziS;
    int i1 = Float.floatToIntBits(f1);
    float f2 = 0.0F;
    localObject2 = null;
    int i3 = Float.floatToIntBits(0.0F);
    if (i1 != i3)
    {
      i1 = 15;
      f1 = 2.1E-44F;
      f2 = this.zziS;
      paramzzsn.zzb(i1, f2);
    }
    localObject1 = this.zziU;
    if (localObject1 != null)
    {
      localObject1 = this.zziU;
      i1 = localObject1.length;
      if (i1 > 0)
      {
        i1 = 0;
        localObject1 = null;
        f1 = 0.0F;
        for (;;)
        {
          localObject2 = this.zziU;
          i3 = localObject2.length;
          if (i1 >= i3) {
            break;
          }
          localObject2 = this.zziU[i1];
          if (localObject2 != null)
          {
            i5 = 16;
            paramzzsn.zzn(i5, (String)localObject2);
          }
          i1 += 1;
        }
      }
    }
    i1 = this.zziV;
    if (i1 != 0)
    {
      i1 = 17;
      f1 = 2.4E-44F;
      i3 = this.zziV;
      paramzzsn.zzA(i1, i3);
    }
    boolean bool5 = this.zziT;
    int i2;
    if (bool5)
    {
      i2 = 18;
      f1 = 2.5E-44F;
      boolean bool6 = this.zziT;
      paramzzsn.zze(i2, bool6);
    }
    localObject1 = this.zziG;
    if (localObject1 != null)
    {
      localObject1 = this.zziG;
      i2 = localObject1.length;
      if (i2 > 0) {
        for (;;)
        {
          localObject1 = this.zziG;
          i2 = localObject1.length;
          if (i >= i2) {
            break;
          }
          localObject1 = this.zziG[i];
          if (localObject1 != null)
          {
            int i4 = 19;
            f2 = 2.7E-44F;
            paramzzsn.zzn(i4, (String)localObject1);
          }
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zzf zzJ()
  {
    Object localObject = zzsx.zzbuB;
    this.zziG = ((String[])localObject);
    localObject = zzsx.zzbuB;
    this.zziH = ((String[])localObject);
    localObject = zzag.zza.zzQ();
    this.zziI = ((zzag.zza[])localObject);
    localObject = zzaf.zze.zzH();
    this.zziJ = ((zzaf.zze[])localObject);
    localObject = zzaf.zzb.zzC();
    this.zziK = ((zzaf.zzb[])localObject);
    localObject = zzaf.zzb.zzC();
    this.zziL = ((zzaf.zzb[])localObject);
    localObject = zzaf.zzb.zzC();
    this.zziM = ((zzaf.zzb[])localObject);
    localObject = zzaf.zzg.zzK();
    this.zziN = ((zzaf.zzg[])localObject);
    this.zziO = "";
    this.zziP = "";
    this.zziQ = "0";
    this.version = "";
    this.zziR = null;
    this.zziS = 0.0F;
    this.zziT = false;
    localObject = zzsx.zzbuB;
    this.zziU = ((String[])localObject);
    this.zziV = 0;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzf zzf(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      float f;
      int m;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      int n;
      switch (i)
      {
      default: 
        boolean bool1 = zza(paramzzsm, i);
        if (bool1) {}
        break;
      case 0: 
        return this;
      case 10: 
        j = 10;
        f = 1.4E-44F;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziH;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += j;
          localObject2 = new String[m];
          if (j != 0)
          {
            localObject3 = this.zziH;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = paramzzsm.readString();
            localObject2[j] = localObject3;
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziH;
          j = localObject1.length;
        }
        localObject3 = paramzzsm.readString();
        localObject2[j] = localObject3;
        this.zziH = ((String[])localObject2);
        break;
      case 18: 
        j = 18;
        f = 2.5E-44F;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziI;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zzag.zza[m];
          if (j != 0)
          {
            localObject3 = this.zziI;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzag$zza;
            ((zzag.zza)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziI;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzag$zza;
        ((zzag.zza)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziI = ((zzag.zza[])localObject2);
        break;
      case 26: 
        j = 26;
        f = 3.6E-44F;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziJ;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zzaf.zze[m];
          if (j != 0)
          {
            localObject3 = this.zziJ;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzaf$zze;
            ((zzaf.zze)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziJ;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzaf$zze;
        ((zzaf.zze)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziJ = ((zzaf.zze[])localObject2);
        break;
      case 34: 
        j = 34;
        f = 4.8E-44F;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziK;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zzaf.zzb[m];
          if (j != 0)
          {
            localObject3 = this.zziK;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzaf$zzb;
            ((zzaf.zzb)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziK;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzaf$zzb;
        ((zzaf.zzb)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziK = ((zzaf.zzb[])localObject2);
        break;
      case 42: 
        j = 42;
        f = 5.9E-44F;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziL;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zzaf.zzb[m];
          if (j != 0)
          {
            localObject3 = this.zziL;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzaf$zzb;
            ((zzaf.zzb)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziL;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzaf$zzb;
        ((zzaf.zzb)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziL = ((zzaf.zzb[])localObject2);
        break;
      case 50: 
        j = 50;
        f = 7.0E-44F;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziM;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zzaf.zzb[m];
          if (j != 0)
          {
            localObject3 = this.zziM;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzaf$zzb;
            ((zzaf.zzb)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziM;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzaf$zzb;
        ((zzaf.zzb)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziM = ((zzaf.zzb[])localObject2);
        break;
      case 58: 
        j = 58;
        f = 8.1E-44F;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziN;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += j;
          localObject2 = new zzaf.zzg[m];
          if (j != 0)
          {
            localObject3 = this.zziN;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = new com/google/android/gms/internal/zzaf$zzg;
            ((zzaf.zzg)localObject3).<init>();
            localObject2[j] = localObject3;
            localObject3 = localObject2[j];
            paramzzsm.zza((zzsu)localObject3);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziN;
          j = localObject1.length;
        }
        localObject3 = new com/google/android/gms/internal/zzaf$zzg;
        ((zzaf.zzg)localObject3).<init>();
        localObject2[j] = localObject3;
        localObject1 = localObject2[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zziN = ((zzaf.zzg[])localObject2);
        break;
      case 74: 
        localObject1 = paramzzsm.readString();
        this.zziO = ((String)localObject1);
        break;
      case 82: 
        localObject1 = paramzzsm.readString();
        this.zziP = ((String)localObject1);
        break;
      case 98: 
        localObject1 = paramzzsm.readString();
        this.zziQ = ((String)localObject1);
        break;
      case 106: 
        localObject1 = paramzzsm.readString();
        this.version = ((String)localObject1);
        break;
      case 114: 
        localObject1 = this.zziR;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/zzaf$zza;
          ((zzaf.zza)localObject1).<init>();
          this.zziR = ((zzaf.zza)localObject1);
        }
        localObject1 = this.zziR;
        paramzzsm.zza((zzsu)localObject1);
        break;
      case 125: 
        f = paramzzsm.readFloat();
        this.zziS = f;
        break;
      case 130: 
        j = 130;
        f = 1.82E-43F;
        m = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zziU;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += j;
          localObject2 = new String[m];
          if (j != 0)
          {
            localObject3 = this.zziU;
            System.arraycopy(localObject3, 0, localObject2, 0, j);
          }
          for (;;)
          {
            n = localObject2.length + -1;
            if (j >= n) {
              break;
            }
            localObject3 = paramzzsm.readString();
            localObject2[j] = localObject3;
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zziU;
          j = localObject1.length;
        }
        localObject3 = paramzzsm.readString();
        localObject2[j] = localObject3;
        this.zziU = ((String[])localObject2);
        break;
      case 136: 
        j = paramzzsm.zzJb();
        this.zziV = j;
        break;
      case 144: 
        boolean bool2 = paramzzsm.zzJc();
        this.zziT = bool2;
        break;
      case 154: 
        int k = 154;
        f = 2.16E-43F;
        m = zzsx.zzc(paramzzsm, k);
        localObject1 = this.zziG;
        if (localObject1 == null)
        {
          k = 0;
          localObject1 = null;
          f = 0.0F;
        }
        for (;;)
        {
          m += k;
          localObject2 = new String[m];
          if (k != 0)
          {
            localObject3 = this.zziG;
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
          localObject1 = this.zziG;
          k = localObject1.length;
        }
        localObject3 = paramzzsm.readString();
        localObject2[k] = localObject3;
        this.zziG = ((String[])localObject2);
      }
    }
  }
  
  protected int zzz()
  {
    int i = 0;
    int j = super.zzz();
    String[] arrayOfString = this.zziH;
    int k;
    int m;
    Object localObject1;
    float f1;
    int i5;
    Object localObject2;
    float f2;
    Object localObject3;
    int i7;
    if (arrayOfString != null)
    {
      arrayOfString = this.zziH;
      k = arrayOfString.length;
      if (k > 0)
      {
        k = 0;
        arrayOfString = null;
        m = 0;
        localObject1 = null;
        f1 = 0.0F;
        i5 = 0;
        localObject2 = null;
        f2 = 0.0F;
        for (;;)
        {
          localObject3 = this.zziH;
          i7 = localObject3.length;
          if (k >= i7) {
            break;
          }
          localObject3 = this.zziH[k];
          if (localObject3 != null)
          {
            i5 += 1;
            i7 = zzsn.zzgO((String)localObject3);
            m += i7;
          }
          k += 1;
        }
        k = j + m;
        m = i5 * 1;
        k += m;
      }
    }
    for (;;)
    {
      localObject1 = this.zziI;
      if (localObject1 != null)
      {
        localObject1 = this.zziI;
        m = localObject1.length;
        if (m > 0)
        {
          m = k;
          k = 0;
          arrayOfString = null;
          for (;;)
          {
            localObject2 = this.zziI;
            i5 = localObject2.length;
            if (k >= i5) {
              break;
            }
            localObject2 = this.zziI[k];
            if (localObject2 != null)
            {
              j = 2;
              i5 = zzsn.zzc(j, (zzsu)localObject2);
              m += i5;
            }
            k += 1;
          }
          k = m;
        }
      }
      localObject1 = this.zziJ;
      if (localObject1 != null)
      {
        localObject1 = this.zziJ;
        m = localObject1.length;
        if (m > 0)
        {
          m = k;
          k = 0;
          arrayOfString = null;
          for (;;)
          {
            localObject2 = this.zziJ;
            i5 = localObject2.length;
            if (k >= i5) {
              break;
            }
            localObject2 = this.zziJ[k];
            if (localObject2 != null)
            {
              j = 3;
              i5 = zzsn.zzc(j, (zzsu)localObject2);
              m += i5;
            }
            k += 1;
          }
          k = m;
        }
      }
      localObject1 = this.zziK;
      if (localObject1 != null)
      {
        localObject1 = this.zziK;
        m = localObject1.length;
        if (m > 0)
        {
          m = k;
          k = 0;
          arrayOfString = null;
          for (;;)
          {
            localObject2 = this.zziK;
            i5 = localObject2.length;
            if (k >= i5) {
              break;
            }
            localObject2 = this.zziK[k];
            if (localObject2 != null)
            {
              j = 4;
              i5 = zzsn.zzc(j, (zzsu)localObject2);
              m += i5;
            }
            k += 1;
          }
          k = m;
        }
      }
      localObject1 = this.zziL;
      if (localObject1 != null)
      {
        localObject1 = this.zziL;
        m = localObject1.length;
        if (m > 0)
        {
          m = k;
          k = 0;
          arrayOfString = null;
          for (;;)
          {
            localObject2 = this.zziL;
            i5 = localObject2.length;
            if (k >= i5) {
              break;
            }
            localObject2 = this.zziL[k];
            if (localObject2 != null)
            {
              j = 5;
              i5 = zzsn.zzc(j, (zzsu)localObject2);
              m += i5;
            }
            k += 1;
          }
          k = m;
        }
      }
      localObject1 = this.zziM;
      if (localObject1 != null)
      {
        localObject1 = this.zziM;
        m = localObject1.length;
        if (m > 0)
        {
          m = k;
          k = 0;
          arrayOfString = null;
          for (;;)
          {
            localObject2 = this.zziM;
            i5 = localObject2.length;
            if (k >= i5) {
              break;
            }
            localObject2 = this.zziM[k];
            if (localObject2 != null)
            {
              j = 6;
              i5 = zzsn.zzc(j, (zzsu)localObject2);
              m += i5;
            }
            k += 1;
          }
          k = m;
        }
      }
      localObject1 = this.zziN;
      if (localObject1 != null)
      {
        localObject1 = this.zziN;
        m = localObject1.length;
        if (m > 0)
        {
          m = k;
          k = 0;
          arrayOfString = null;
          for (;;)
          {
            localObject2 = this.zziN;
            i5 = localObject2.length;
            if (k >= i5) {
              break;
            }
            localObject2 = this.zziN[k];
            if (localObject2 != null)
            {
              j = 7;
              i5 = zzsn.zzc(j, (zzsu)localObject2);
              m += i5;
            }
            k += 1;
          }
          k = m;
        }
      }
      localObject1 = this.zziO;
      localObject2 = "";
      boolean bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1)
      {
        f1 = 1.3E-44F;
        localObject2 = this.zziO;
        int n = zzsn.zzo(9, (String)localObject2);
        k += n;
      }
      localObject1 = this.zziP;
      localObject2 = "";
      boolean bool2 = ((String)localObject1).equals(localObject2);
      if (!bool2)
      {
        f1 = 1.4E-44F;
        localObject2 = this.zziP;
        int i1 = zzsn.zzo(10, (String)localObject2);
        k += i1;
      }
      localObject1 = this.zziQ;
      localObject2 = "0";
      boolean bool3 = ((String)localObject1).equals(localObject2);
      if (!bool3)
      {
        f1 = 1.7E-44F;
        localObject2 = this.zziQ;
        int i2 = zzsn.zzo(12, (String)localObject2);
        k += i2;
      }
      localObject1 = this.version;
      localObject2 = "";
      boolean bool4 = ((String)localObject1).equals(localObject2);
      if (!bool4)
      {
        f1 = 1.8E-44F;
        localObject2 = this.version;
        i3 = zzsn.zzo(13, (String)localObject2);
        k += i3;
      }
      localObject1 = this.zziR;
      if (localObject1 != null)
      {
        f1 = 2.0E-44F;
        localObject2 = this.zziR;
        i3 = zzsn.zzc(14, (zzsu)localObject2);
        k += i3;
      }
      f1 = this.zziS;
      int i3 = Float.floatToIntBits(f1);
      f2 = 0.0F;
      localObject2 = null;
      i5 = Float.floatToIntBits(0.0F);
      if (i3 != i5)
      {
        f1 = 2.1E-44F;
        f2 = this.zziS;
        i3 = zzsn.zzc(15, f2);
        k += i3;
      }
      localObject1 = this.zziU;
      Object localObject4;
      if (localObject1 != null)
      {
        localObject1 = this.zziU;
        i3 = localObject1.length;
        if (i3 > 0)
        {
          i3 = 0;
          localObject1 = null;
          f1 = 0.0F;
          i5 = 0;
          localObject2 = null;
          f2 = 0.0F;
          j = 0;
          localObject4 = null;
          for (;;)
          {
            localObject3 = this.zziU;
            i7 = localObject3.length;
            if (i3 >= i7) {
              break;
            }
            localObject3 = this.zziU[i3];
            if (localObject3 != null)
            {
              j += 1;
              i7 = zzsn.zzgO((String)localObject3);
              i5 += i7;
            }
            i3 += 1;
          }
          k += i5;
          i3 = j * 2;
          k += i3;
        }
      }
      i3 = this.zziV;
      if (i3 != 0)
      {
        f1 = 2.4E-44F;
        i5 = this.zziV;
        i3 = zzsn.zzC(17, i5);
        k += i3;
      }
      boolean bool5 = this.zziT;
      boolean bool6;
      int i4;
      if (bool5)
      {
        f1 = 2.5E-44F;
        bool6 = this.zziT;
        i4 = zzsn.zzf(18, bool6);
        k += i4;
      }
      localObject1 = this.zziG;
      if (localObject1 != null)
      {
        localObject1 = this.zziG;
        i4 = localObject1.length;
        if (i4 > 0)
        {
          i4 = 0;
          localObject1 = null;
          f1 = 0.0F;
          bool6 = false;
          localObject2 = null;
          f2 = 0.0F;
          int i6;
          for (;;)
          {
            localObject4 = this.zziG;
            j = localObject4.length;
            if (i >= j) {
              break;
            }
            localObject4 = this.zziG[i];
            if (localObject4 != null)
            {
              bool6 += true;
              j = zzsn.zzgO((String)localObject4);
              i4 += j;
            }
            i += 1;
          }
          k += i4;
          i = i6 * 2;
          k += i;
        }
      }
      return k;
      k = j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */