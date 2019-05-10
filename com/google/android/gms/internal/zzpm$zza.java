package com.google.android.gms.internal;

public final class zzpm$zza
  extends zzso
{
  public zzpm.zza.zza[] zzaMo;
  
  public zzpm$zza()
  {
    zzyp();
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
        Object localObject = this.zzaMo;
        zzpm.zza.zza[] arrayOfzza = ((zza)paramObject).zzaMo;
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
            localObject = ((zza)paramObject).zzbuj;
            if (localObject != null)
            {
              localObject = ((zza)paramObject).zzbuj;
              bool3 = ((zzsq)localObject).isEmpty();
              if (!bool3) {
                continue;
              }
            }
            bool2 = bool1;
            continue;
          }
          localzzsq1 = this.zzbuj;
          zzsq localzzsq2 = ((zza)paramObject).zzbuj;
          bool2 = localzzsq1.equals(localzzsq2);
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    zzpm.zza.zza[] arrayOfzza = this.zzaMo;
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
    zzpm.zza.zza[] arrayOfzza = this.zzaMo;
    if (arrayOfzza != null)
    {
      arrayOfzza = this.zzaMo;
      int i = arrayOfzza.length;
      if (i > 0)
      {
        i = 0;
        arrayOfzza = null;
        for (;;)
        {
          Object localObject = this.zzaMo;
          int j = localObject.length;
          if (i >= j) {
            break;
          }
          localObject = this.zzaMo[i];
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
  
  public zza zzo(zzsm paramzzsm)
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
        zzpm.zza.zza[] arrayOfzza1 = this.zzaMo;
        if (arrayOfzza1 == null)
        {
          j = 0;
          arrayOfzza1 = null;
        }
        zzpm.zza.zza[] arrayOfzza2;
        for (;;)
        {
          k += j;
          arrayOfzza2 = new zzpm.zza.zza[k];
          if (j != 0)
          {
            localObject = this.zzaMo;
            System.arraycopy(localObject, 0, arrayOfzza2, 0, j);
          }
          for (;;)
          {
            int m = arrayOfzza2.length + -1;
            if (j >= m) {
              break;
            }
            localObject = new com/google/android/gms/internal/zzpm$zza$zza;
            ((zzpm.zza.zza)localObject).<init>();
            arrayOfzza2[j] = localObject;
            localObject = arrayOfzza2[j];
            paramzzsm.zza((zzsu)localObject);
            paramzzsm.zzIX();
            j += 1;
          }
          arrayOfzza1 = this.zzaMo;
          j = arrayOfzza1.length;
        }
        Object localObject = new com/google/android/gms/internal/zzpm$zza$zza;
        ((zzpm.zza.zza)localObject).<init>();
        arrayOfzza2[j] = localObject;
        arrayOfzza1 = arrayOfzza2[j];
        paramzzsm.zza(arrayOfzza1);
        this.zzaMo = arrayOfzza2;
      }
    }
  }
  
  public zza zzyp()
  {
    zzpm.zza.zza[] arrayOfzza = zzpm.zza.zza.zzyq();
    this.zzaMo = arrayOfzza;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    zzpm.zza.zza[] arrayOfzza = this.zzaMo;
    if (arrayOfzza != null)
    {
      arrayOfzza = this.zzaMo;
      int j = arrayOfzza.length;
      if (j > 0)
      {
        j = 0;
        arrayOfzza = null;
        for (;;)
        {
          Object localObject = this.zzaMo;
          int k = localObject.length;
          if (j >= k) {
            break;
          }
          localObject = this.zzaMo[j];
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpm$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */