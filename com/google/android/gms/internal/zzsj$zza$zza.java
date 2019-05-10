package com.google.android.gms.internal;

public final class zzsj$zza$zza
  extends zzso
{
  private static volatile zza[] zzbtD;
  public int type;
  public zzsj.zza.zza.zza zzbtE;
  
  public zzsj$zza$zza()
  {
    zzIU();
  }
  
  public static zza[] zzIT()
  {
    zza[] arrayOfzza = zzbtD;
    if (arrayOfzza == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzza = zzbtD;
      if (arrayOfzza == null)
      {
        arrayOfzza = null;
        arrayOfzza = new zza[0];
        zzbtD = arrayOfzza;
      }
      return zzbtD;
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
          Object localObject = this.zzbtE;
          if (localObject == null)
          {
            localObject = ((zza)paramObject).zzbtE;
            if (localObject != null) {}
          }
          else
          {
            boolean bool4;
            do
            {
              localObject = this.zzbuj;
              if (localObject != null)
              {
                localObject = this.zzbuj;
                bool4 = ((zzsq)localObject).isEmpty();
                if (!bool4) {
                  break label165;
                }
              }
              localObject = ((zza)paramObject).zzbuj;
              if (localObject != null)
              {
                localObject = ((zza)paramObject).zzbuj;
                bool4 = ((zzsq)localObject).isEmpty();
                if (!bool4) {
                  break;
                }
              }
              bool2 = bool1;
              break;
              localObject = this.zzbtE;
              zzsj.zza.zza.zza localzza = ((zza)paramObject).zzbtE;
              bool4 = ((zzsj.zza.zza.zza)localObject).equals(localzza);
            } while (bool4);
            continue;
            label165:
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
    zzsq localzzsq1 = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    int k = this.type;
    j += k;
    k = j * 31;
    zzsj.zza.zza.zza localzza = this.zzbtE;
    if (localzza == null)
    {
      j = 0;
      localzza = null;
      j = (j + k) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool = localzzsq2.isEmpty();
        if (!bool) {
          break label111;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localzza = this.zzbtE;
      j = localzza.hashCode();
      break;
      label111:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 1;
    int j = this.type;
    paramzzsn.zzA(i, j);
    zzsj.zza.zza.zza localzza1 = this.zzbtE;
    if (localzza1 != null)
    {
      i = 2;
      zzsj.zza.zza.zza localzza2 = this.zzbtE;
      paramzzsn.zza(i, localzza2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzIU()
  {
    this.type = 1;
    this.zzbtE = null;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zza zzM(zzsm paramzzsm)
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
      case 8: 
        int j = paramzzsm.zzJb();
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
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
          this.type = j;
        }
        break;
      case 18: 
        zzsj.zza.zza.zza localzza = this.zzbtE;
        if (localzza == null)
        {
          localzza = new com/google/android/gms/internal/zzsj$zza$zza$zza;
          localzza.<init>();
          this.zzbtE = localzza;
        }
        localzza = this.zzbtE;
        paramzzsm.zza(localzza);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    int j = this.type;
    int k = zzsn.zzC(1, j);
    i += k;
    zzsj.zza.zza.zza localzza1 = this.zzbtE;
    if (localzza1 != null)
    {
      zzsj.zza.zza.zza localzza2 = this.zzbtE;
      k = zzsn.zzc(2, localzza2);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsj$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */