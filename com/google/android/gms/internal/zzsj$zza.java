package com.google.android.gms.internal;

public final class zzsj$zza
  extends zzso
{
  private static volatile zza[] zzbtB;
  public String name;
  public zzsj.zza.zza zzbtC;
  
  public zzsj$zza()
  {
    zzIS();
  }
  
  public static zza[] zzIR()
  {
    zza[] arrayOfzza = zzbtB;
    if (arrayOfzza == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzza = zzbtB;
      if (arrayOfzza == null)
      {
        arrayOfzza = null;
        arrayOfzza = new zza[0];
        zzbtB = arrayOfzza;
      }
      return zzbtB;
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
        Object localObject1 = this.name;
        if (localObject1 == null)
        {
          localObject1 = ((zza)paramObject).name;
          if (localObject1 != null) {
            continue;
          }
          label54:
          localObject1 = this.zzbtC;
          if (localObject1 != null) {
            break label168;
          }
          localObject1 = ((zza)paramObject).zzbtC;
          if (localObject1 != null) {
            continue;
          }
        }
        label168:
        do
        {
          localObject1 = this.zzbuj;
          if (localObject1 != null)
          {
            localObject1 = this.zzbuj;
            bool3 = ((zzsq)localObject1).isEmpty();
            if (!bool3) {
              break label197;
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
          localObject1 = this.name;
          Object localObject2 = ((zza)paramObject).name;
          bool3 = ((String)localObject1).equals(localObject2);
          if (bool3) {
            break label54;
          }
          break;
          localObject1 = this.zzbtC;
          localObject2 = ((zza)paramObject).zzbtC;
          bool3 = ((zzsj.zza.zza)localObject1).equals(localObject2);
        } while (bool3);
        continue;
        label197:
        localzzsq1 = this.zzbuj;
        zzsq localzzsq2 = ((zza)paramObject).zzbuj;
        bool2 = localzzsq1.equals(localzzsq2);
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    zzsq localzzsq1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    Object localObject = this.name;
    if (localObject == null)
    {
      j = 0;
      localObject = null;
      j += k;
      k = j * 31;
      localObject = this.zzbtC;
      if (localObject != null) {
        break label124;
      }
      j = 0;
      localObject = null;
      label68:
      j = (j + k) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool = localzzsq2.isEmpty();
        if (!bool) {
          break label139;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.name;
      j = ((String)localObject).hashCode();
      break;
      label124:
      localObject = this.zzbtC;
      j = ((zzsj.zza.zza)localObject).hashCode();
      break label68;
      label139:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = 1;
    Object localObject = this.name;
    paramzzsn.zzn(i, (String)localObject);
    zzsj.zza.zza localzza = this.zzbtC;
    if (localzza != null)
    {
      i = 2;
      localObject = this.zzbtC;
      paramzzsn.zza(i, (zzsu)localObject);
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzIS()
  {
    this.name = "";
    this.zzbtC = null;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zza zzL(zzsm paramzzsm)
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
      case 10: 
        localObject = paramzzsm.readString();
        this.name = ((String)localObject);
        break;
      case 18: 
        localObject = this.zzbtC;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzsj$zza$zza;
          ((zzsj.zza.zza)localObject).<init>();
          this.zzbtC = ((zzsj.zza.zza)localObject);
        }
        localObject = this.zzbtC;
        paramzzsm.zza((zzsu)localObject);
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject = this.name;
    int j = zzsn.zzo(1, (String)localObject);
    i += j;
    zzsj.zza.zza localzza = this.zzbtC;
    if (localzza != null)
    {
      localObject = this.zzbtC;
      j = zzsn.zzc(2, (zzsu)localObject);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */