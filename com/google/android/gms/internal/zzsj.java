package com.google.android.gms.internal;

public final class zzsj
  extends zzso
{
  public zzsj.zza[] zzbtA;
  
  public zzsj()
  {
    zzIQ();
  }
  
  public static zzsj zzA(byte[] paramArrayOfByte)
  {
    zzsj localzzsj = new com/google/android/gms/internal/zzsj;
    localzzsj.<init>();
    return (zzsj)zzsu.mergeFrom(localzzsj, paramArrayOfByte);
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
      boolean bool3 = paramObject instanceof zzsj;
      if (bool3)
      {
        paramObject = (zzsj)paramObject;
        Object localObject = this.zzbtA;
        zzsj.zza[] arrayOfzza = ((zzsj)paramObject).zzbtA;
        bool3 = zzss.equals((Object[])localObject, arrayOfzza);
        if (bool3)
        {
          localObject = this.zzbuj;
          if (localObject != null)
          {
            localObject = this.zzbuj;
            bool3 = ((zzsq)localObject).isEmpty();
            if (!bool3) {}
          }
          else
          {
            localObject = ((zzsj)paramObject).zzbuj;
            if (localObject != null)
            {
              localObject = ((zzsj)paramObject).zzbuj;
              bool3 = ((zzsq)localObject).isEmpty();
              if (!bool3) {
                continue;
              }
            }
            bool2 = bool1;
            continue;
          }
          localzzsq1 = this.zzbuj;
          zzsq localzzsq2 = ((zzsj)paramObject).zzbuj;
          bool2 = localzzsq1.equals(localzzsq2);
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    zzsj.zza[] arrayOfzza = this.zzbtA;
    int m = zzss.hashCode(arrayOfzza);
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
    zzsj.zza[] arrayOfzza = this.zzbtA;
    if (arrayOfzza != null)
    {
      arrayOfzza = this.zzbtA;
      int i = arrayOfzza.length;
      if (i > 0)
      {
        i = 0;
        arrayOfzza = null;
        for (;;)
        {
          Object localObject = this.zzbtA;
          int j = localObject.length;
          if (i >= j) {
            break;
          }
          localObject = this.zzbtA[i];
          if (localObject != null)
          {
            int k = 1;
            paramzzsn.zza(k, (zzsu)localObject);
          }
          i += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zzsj zzIQ()
  {
    zzsj.zza[] arrayOfzza = zzsj.zza.zzIR();
    this.zzbtA = arrayOfzza;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzsj zzK(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
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
        zzsj.zza[] arrayOfzza1 = this.zzbtA;
        if (arrayOfzza1 == null)
        {
          j = 0;
          arrayOfzza1 = null;
        }
        zzsj.zza[] arrayOfzza2;
        for (;;)
        {
          k += j;
          arrayOfzza2 = new zzsj.zza[k];
          if (j != 0)
          {
            localObject = this.zzbtA;
            System.arraycopy(localObject, 0, arrayOfzza2, 0, j);
          }
          for (;;)
          {
            int m = arrayOfzza2.length + -1;
            if (j >= m) {
              break;
            }
            localObject = new com/google/android/gms/internal/zzsj$zza;
            ((zzsj.zza)localObject).<init>();
            arrayOfzza2[j] = localObject;
            localObject = arrayOfzza2[j];
            paramzzsm.zza((zzsu)localObject);
            paramzzsm.zzIX();
            j += 1;
          }
          arrayOfzza1 = this.zzbtA;
          j = arrayOfzza1.length;
        }
        Object localObject = new com/google/android/gms/internal/zzsj$zza;
        ((zzsj.zza)localObject).<init>();
        arrayOfzza2[j] = localObject;
        arrayOfzza1 = arrayOfzza2[j];
        paramzzsm.zza(arrayOfzza1);
        this.zzbtA = arrayOfzza2;
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    zzsj.zza[] arrayOfzza = this.zzbtA;
    if (arrayOfzza != null)
    {
      arrayOfzza = this.zzbtA;
      int j = arrayOfzza.length;
      if (j > 0)
      {
        j = 0;
        arrayOfzza = null;
        for (;;)
        {
          Object localObject = this.zzbtA;
          int k = localObject.length;
          if (j >= k) {
            break;
          }
          localObject = this.zzbtA[j];
          if (localObject != null)
          {
            int m = 1;
            k = zzsn.zzc(m, (zzsu)localObject);
            i += k;
          }
          j += 1;
        }
      }
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */