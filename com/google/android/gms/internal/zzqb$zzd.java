package com.google.android.gms.internal;

public final class zzqb$zzd
  extends zzsu
{
  public zzqb.zze[] zzbaj;
  
  public zzqb$zzd()
  {
    zzDV();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzd;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzd)paramObject;
        zzqb.zze[] arrayOfzze1 = this.zzbaj;
        zzqb.zze[] arrayOfzze2 = ((zzd)paramObject).zzbaj;
        bool2 = zzss.equals(arrayOfzze1, arrayOfzze2);
        if (!bool2) {
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int j = zzss.hashCode(this.zzbaj);
    return i + j;
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    zzqb.zze[] arrayOfzze = this.zzbaj;
    if (arrayOfzze != null)
    {
      arrayOfzze = this.zzbaj;
      int i = arrayOfzze.length;
      if (i > 0)
      {
        i = 0;
        arrayOfzze = null;
        for (;;)
        {
          Object localObject = this.zzbaj;
          int j = localObject.length;
          if (i >= j) {
            break;
          }
          localObject = this.zzbaj[i];
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
  
  public zzd zzDV()
  {
    zzqb.zze[] arrayOfzze = zzqb.zze.zzDW();
    this.zzbaj = arrayOfzze;
    this.zzbuu = -1;
    return this;
  }
  
  public zzd zzF(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        int j = 10;
        int k = zzsx.zzc(paramzzsm, j);
        zzqb.zze[] arrayOfzze1 = this.zzbaj;
        if (arrayOfzze1 == null)
        {
          j = 0;
          arrayOfzze1 = null;
        }
        zzqb.zze[] arrayOfzze2;
        for (;;)
        {
          k += j;
          arrayOfzze2 = new zzqb.zze[k];
          if (j != 0)
          {
            localObject = this.zzbaj;
            System.arraycopy(localObject, 0, arrayOfzze2, 0, j);
          }
          for (;;)
          {
            int m = arrayOfzze2.length + -1;
            if (j >= m) {
              break;
            }
            localObject = new com/google/android/gms/internal/zzqb$zze;
            ((zzqb.zze)localObject).<init>();
            arrayOfzze2[j] = localObject;
            localObject = arrayOfzze2[j];
            paramzzsm.zza((zzsu)localObject);
            paramzzsm.zzIX();
            j += 1;
          }
          arrayOfzze1 = this.zzbaj;
          j = arrayOfzze1.length;
        }
        Object localObject = new com/google/android/gms/internal/zzqb$zze;
        ((zzqb.zze)localObject).<init>();
        arrayOfzze2[j] = localObject;
        arrayOfzze1 = arrayOfzze2[j];
        paramzzsm.zza(arrayOfzze1);
        this.zzbaj = arrayOfzze2;
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    zzqb.zze[] arrayOfzze = this.zzbaj;
    if (arrayOfzze != null)
    {
      arrayOfzze = this.zzbaj;
      int j = arrayOfzze.length;
      if (j > 0)
      {
        j = 0;
        arrayOfzze = null;
        for (;;)
        {
          Object localObject = this.zzbaj;
          int k = localObject.length;
          if (j >= k) {
            break;
          }
          localObject = this.zzbaj[j];
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqb$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */