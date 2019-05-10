package com.google.android.gms.internal;

public final class zzrq$zza
  extends zzso
{
  public long zzbmd;
  public zzaf.zzj zzbme;
  public zzaf.zzf zzju;
  
  public zzrq$zza()
  {
    zzHG();
  }
  
  public static zza zzy(byte[] paramArrayOfByte)
  {
    zza localzza = new com/google/android/gms/internal/zzrq$zza;
    localzza.<init>();
    return (zza)zzsu.mergeFrom(localzza, paramArrayOfByte);
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
        long l1 = this.zzbmd;
        long l2 = ((zza)paramObject).zzbmd;
        bool3 = l1 < l2;
        if (!bool3)
        {
          Object localObject1 = this.zzju;
          if (localObject1 == null)
          {
            localObject1 = ((zza)paramObject).zzju;
            if (localObject1 != null) {
              continue;
            }
            label78:
            localObject1 = this.zzbme;
            if (localObject1 != null) {
              break label192;
            }
            localObject1 = ((zza)paramObject).zzbme;
            if (localObject1 != null) {
              continue;
            }
          }
          label192:
          do
          {
            localObject1 = this.zzbuj;
            if (localObject1 != null)
            {
              localObject1 = this.zzbuj;
              bool3 = ((zzsq)localObject1).isEmpty();
              if (!bool3) {
                break label221;
              }
            }
            localObject1 = ((zza)paramObject).zzbuj;
            if (localObject1 != null)
            {
              localObject1 = ((zza)paramObject).zzbuj;
              bool3 = ((zzsq)localObject1).isEmpty();
              if (!bool3) {
                break;
              }
            }
            bool2 = bool1;
            break;
            localObject1 = this.zzju;
            Object localObject2 = ((zza)paramObject).zzju;
            bool3 = ((zzaf.zzf)localObject1).equals(localObject2);
            if (bool3) {
              break label78;
            }
            break;
            localObject1 = this.zzbme;
            localObject2 = ((zza)paramObject).zzbme;
            bool3 = ((zzaf.zzj)localObject1).equals(localObject2);
          } while (bool3);
          continue;
          label221:
          localzzsq1 = this.zzbuj;
          zzsq localzzsq2 = ((zza)paramObject).zzbuj;
          bool2 = localzzsq1.equals(localzzsq2);
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    zzsq localzzsq1 = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    long l1 = this.zzbmd;
    long l2 = this.zzbmd;
    int k = 32;
    l2 >>>= k;
    l1 ^= l2;
    int m = (int)l1;
    j += m;
    m = j * 31;
    Object localObject = this.zzju;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += m;
      m = j * 31;
      localObject = this.zzbme;
      if (localObject != null) {
        break label167;
      }
      j = 0;
      localObject = null;
      label111:
      j = (j + m) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool = localzzsq2.isEmpty();
        if (!bool) {
          break label182;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.zzju;
      j = ((zzaf.zzf)localObject).hashCode();
      break;
      label167:
      localObject = this.zzbme;
      j = ((zzaf.zzj)localObject).hashCode();
      break label111;
      label182:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 1;
    long l = this.zzbmd;
    paramzzsn.zzb(i, l);
    Object localObject1 = this.zzju;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzju;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    localObject1 = this.zzbme;
    if (localObject1 != null)
    {
      i = 3;
      localObject2 = this.zzbme;
      paramzzsn.zza(i, (zzsu)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzHG()
  {
    this.zzbmd = 0L;
    this.zzju = null;
    this.zzbme = null;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zza zzJ(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      Object localObject;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        long l = paramzzsm.zzJa();
        this.zzbmd = l;
        break;
      case 18: 
        localObject = this.zzju;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzaf$zzf;
          ((zzaf.zzf)localObject).<init>();
          this.zzju = ((zzaf.zzf)localObject);
        }
        localObject = this.zzju;
        paramzzsm.zza((zzsu)localObject);
        break;
      case 26: 
        localObject = this.zzbme;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzaf$zzj;
          ((zzaf.zzj)localObject).<init>();
          this.zzbme = ((zzaf.zzj)localObject);
        }
        localObject = this.zzbme;
        paramzzsm.zza((zzsu)localObject);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    long l = this.zzbmd;
    int j = zzsn.zzd(1, l);
    i += j;
    Object localObject1 = this.zzju;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = this.zzju;
      j = zzsn.zzc(2, (zzsu)localObject2);
      i += j;
    }
    localObject1 = this.zzbme;
    if (localObject1 != null)
    {
      localObject2 = this.zzbme;
      j = zzsn.zzc(3, (zzsu)localObject2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrq$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */