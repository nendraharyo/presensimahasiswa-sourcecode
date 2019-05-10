package com.google.android.gms.internal;

public final class zzaf$zzj
  extends zzso
{
  public zzaf.zzi[] zzjt;
  public zzaf.zzf zzju;
  public String zzjv;
  
  public zzaf$zzj()
  {
    zzP();
  }
  
  public static zzj zzd(byte[] paramArrayOfByte)
  {
    zzj localzzj = new com/google/android/gms/internal/zzaf$zzj;
    localzzj.<init>();
    return (zzj)zzsu.mergeFrom(localzzj, paramArrayOfByte);
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
      boolean bool3 = paramObject instanceof zzj;
      if (bool3)
      {
        paramObject = (zzj)paramObject;
        Object localObject1 = this.zzjt;
        Object localObject2 = ((zzj)paramObject).zzjt;
        bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
        if (bool3)
        {
          localObject1 = this.zzju;
          if (localObject1 == null)
          {
            localObject1 = ((zzj)paramObject).zzju;
            if (localObject1 != null) {
              continue;
            }
            label80:
            localObject1 = this.zzjv;
            if (localObject1 != null) {
              break label194;
            }
            localObject1 = ((zzj)paramObject).zzjv;
            if (localObject1 != null) {
              continue;
            }
          }
          label194:
          do
          {
            localObject1 = this.zzbuj;
            if (localObject1 != null)
            {
              localObject1 = this.zzbuj;
              bool3 = ((zzsq)localObject1).isEmpty();
              if (!bool3) {
                break label223;
              }
            }
            localObject1 = ((zzj)paramObject).zzbuj;
            if (localObject1 != null)
            {
              localObject1 = ((zzj)paramObject).zzbuj;
              bool3 = ((zzsq)localObject1).isEmpty();
              if (!bool3) {
                break;
              }
            }
            bool2 = bool1;
            break;
            localObject1 = this.zzju;
            localObject2 = ((zzj)paramObject).zzju;
            bool3 = ((zzaf.zzf)localObject1).equals(localObject2);
            if (bool3) {
              break label80;
            }
            break;
            localObject1 = this.zzjv;
            localObject2 = ((zzj)paramObject).zzjv;
            bool3 = ((String)localObject1).equals(localObject2);
          } while (bool3);
          continue;
          label223:
          localzzsq1 = this.zzbuj;
          zzsq localzzsq2 = ((zzj)paramObject).zzbuj;
          bool2 = localzzsq1.equals(localzzsq2);
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    zzsq localzzsq = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    Object localObject1 = this.zzjt;
    int k = zzss.hashCode((Object[])localObject1);
    j += k;
    k = j * 31;
    Object localObject2 = this.zzju;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      j += k;
      k = j * 31;
      localObject2 = this.zzjv;
      if (localObject2 != null) {
        break label145;
      }
      j = 0;
      localObject2 = null;
      label89:
      j = (j + k) * 31;
      localObject1 = this.zzbuj;
      if (localObject1 != null)
      {
        localObject1 = this.zzbuj;
        boolean bool = ((zzsq)localObject1).isEmpty();
        if (!bool) {
          break label160;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject2 = this.zzju;
      j = ((zzaf.zzf)localObject2).hashCode();
      break;
      label145:
      localObject2 = this.zzjv;
      j = ((String)localObject2).hashCode();
      break label89;
      label160:
      localzzsq = this.zzbuj;
      i = localzzsq.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.zzjt;
    int i;
    if (localObject1 != null)
    {
      localObject1 = this.zzjt;
      i = localObject1.length;
      if (i > 0)
      {
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzjt;
          int k = localObject2.length;
          if (i >= k) {
            break;
          }
          localObject2 = this.zzjt[i];
          if (localObject2 != null)
          {
            int m = 1;
            paramzzsn.zza(m, (zzsu)localObject2);
          }
          i += 1;
        }
      }
    }
    localObject1 = this.zzju;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzju;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    localObject1 = this.zzjv;
    Object localObject2 = "";
    boolean bool = ((String)localObject1).equals(localObject2);
    if (!bool)
    {
      int j = 3;
      localObject2 = this.zzjv;
      paramzzsn.zzn(j, (String)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzj zzP()
  {
    zzaf.zzi[] arrayOfzzi = zzaf.zzi.zzN();
    this.zzjt = arrayOfzzi;
    this.zzju = null;
    this.zzjv = "";
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzj zzj(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject1;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        int j = 10;
        int k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzjt;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        zzaf.zzi[] arrayOfzzi;
        for (;;)
        {
          k += j;
          arrayOfzzi = new zzaf.zzi[k];
          if (j != 0)
          {
            localObject2 = this.zzjt;
            System.arraycopy(localObject2, 0, arrayOfzzi, 0, j);
          }
          for (;;)
          {
            int m = arrayOfzzi.length + -1;
            if (j >= m) {
              break;
            }
            localObject2 = new com/google/android/gms/internal/zzaf$zzi;
            ((zzaf.zzi)localObject2).<init>();
            arrayOfzzi[j] = localObject2;
            localObject2 = arrayOfzzi[j];
            paramzzsm.zza((zzsu)localObject2);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzjt;
          j = localObject1.length;
        }
        Object localObject2 = new com/google/android/gms/internal/zzaf$zzi;
        ((zzaf.zzi)localObject2).<init>();
        arrayOfzzi[j] = localObject2;
        localObject1 = arrayOfzzi[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzjt = arrayOfzzi;
        break;
      case 18: 
        localObject1 = this.zzju;
        if (localObject1 == null)
        {
          localObject1 = new com/google/android/gms/internal/zzaf$zzf;
          ((zzaf.zzf)localObject1).<init>();
          this.zzju = ((zzaf.zzf)localObject1);
        }
        localObject1 = this.zzju;
        paramzzsm.zza((zzsu)localObject1);
        break;
      case 26: 
        localObject1 = paramzzsm.readString();
        this.zzjv = ((String)localObject1);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.zzjt;
    int j;
    if (localObject1 != null)
    {
      localObject1 = this.zzjt;
      j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzjt;
          int m = localObject2.length;
          if (j >= m) {
            break;
          }
          localObject2 = this.zzjt[j];
          if (localObject2 != null)
          {
            int n = 1;
            m = zzsn.zzc(n, (zzsu)localObject2);
            i += m;
          }
          j += 1;
        }
      }
    }
    localObject1 = this.zzju;
    if (localObject1 != null)
    {
      localObject2 = this.zzju;
      j = zzsn.zzc(2, (zzsu)localObject2);
      i += j;
    }
    localObject1 = this.zzjv;
    Object localObject2 = "";
    boolean bool = ((String)localObject1).equals(localObject2);
    if (!bool)
    {
      localObject2 = this.zzjv;
      int k = zzsn.zzo(3, (String)localObject2);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */