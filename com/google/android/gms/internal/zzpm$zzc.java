package com.google.android.gms.internal;

public final class zzpm$zzc
  extends zzso
{
  public String type;
  public zzpm.zzb[] zzaMu;
  
  public zzpm$zzc()
  {
    zzyu();
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
      boolean bool3 = paramObject instanceof zzc;
      if (bool3)
      {
        paramObject = (zzc)paramObject;
        Object localObject1 = this.type;
        if (localObject1 == null)
        {
          localObject1 = ((zzc)paramObject).type;
          if (localObject1 != null) {}
        }
        else
        {
          do
          {
            localObject1 = this.zzaMu;
            Object localObject2 = ((zzc)paramObject).zzaMu;
            bool3 = zzss.equals((Object[])localObject1, (Object[])localObject2);
            if (!bool3) {
              break;
            }
            localObject1 = this.zzbuj;
            if (localObject1 != null)
            {
              localObject1 = this.zzbuj;
              bool3 = ((zzsq)localObject1).isEmpty();
              if (!bool3) {
                break label172;
              }
            }
            localObject1 = ((zzc)paramObject).zzbuj;
            if (localObject1 != null)
            {
              localObject1 = ((zzc)paramObject).zzbuj;
              bool3 = ((zzsq)localObject1).isEmpty();
              if (!bool3) {
                break;
              }
            }
            bool2 = bool1;
            break;
            localObject1 = this.type;
            localObject2 = ((zzc)paramObject).type;
            bool3 = ((String)localObject1).equals(localObject2);
          } while (bool3);
          continue;
          label172:
          localzzsq1 = this.zzbuj;
          zzsq localzzsq2 = ((zzc)paramObject).zzbuj;
          bool2 = localzzsq1.equals(localzzsq2);
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    zzsq localzzsq1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    String str = this.type;
    if (str == null)
    {
      j = 0;
      str = null;
      j = (j + k) * 31;
      k = zzss.hashCode(this.zzaMu);
      j = (j + k) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool = localzzsq2.isEmpty();
        if (!bool) {
          break label114;
        }
      }
    }
    for (;;)
    {
      return j + i;
      str = this.type;
      j = str.hashCode();
      break;
      label114:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.type;
    Object localObject2 = "";
    int i = ((String)localObject1).equals(localObject2);
    if (i == 0)
    {
      i = 1;
      localObject2 = this.type;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzaMu;
    if (localObject1 != null)
    {
      localObject1 = this.zzaMu;
      int j = localObject1.length;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = this.zzaMu;
          int k = localObject2.length;
          if (j >= k) {
            break;
          }
          localObject2 = this.zzaMu[j];
          if (localObject2 != null)
          {
            int m = 2;
            paramzzsn.zza(m, (zzsu)localObject2);
          }
          j += 1;
        }
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public zzc zzr(zzsm paramzzsm)
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
        localObject1 = paramzzsm.readString();
        this.type = ((String)localObject1);
        break;
      case 18: 
        int j = 18;
        int k = zzsx.zzc(paramzzsm, j);
        localObject1 = this.zzaMu;
        if (localObject1 == null)
        {
          j = 0;
          localObject1 = null;
        }
        zzpm.zzb[] arrayOfzzb;
        for (;;)
        {
          k += j;
          arrayOfzzb = new zzpm.zzb[k];
          if (j != 0)
          {
            localObject2 = this.zzaMu;
            System.arraycopy(localObject2, 0, arrayOfzzb, 0, j);
          }
          for (;;)
          {
            int m = arrayOfzzb.length + -1;
            if (j >= m) {
              break;
            }
            localObject2 = new com/google/android/gms/internal/zzpm$zzb;
            ((zzpm.zzb)localObject2).<init>();
            arrayOfzzb[j] = localObject2;
            localObject2 = arrayOfzzb[j];
            paramzzsm.zza((zzsu)localObject2);
            paramzzsm.zzIX();
            j += 1;
          }
          localObject1 = this.zzaMu;
          j = localObject1.length;
        }
        Object localObject2 = new com/google/android/gms/internal/zzpm$zzb;
        ((zzpm.zzb)localObject2).<init>();
        arrayOfzzb[j] = localObject2;
        localObject1 = arrayOfzzb[j];
        paramzzsm.zza((zzsu)localObject1);
        this.zzaMu = arrayOfzzb;
      }
    }
  }
  
  public zzc zzyu()
  {
    this.type = "";
    zzpm.zzb[] arrayOfzzb = zzpm.zzb.zzys();
    this.zzaMu = arrayOfzzb;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.type;
    Object localObject2 = "";
    boolean bool = ((String)localObject1).equals(localObject2);
    int j;
    if (!bool)
    {
      localObject2 = this.type;
      j = zzsn.zzo(1, (String)localObject2);
      i += j;
    }
    localObject1 = this.zzaMu;
    if (localObject1 != null)
    {
      localObject1 = this.zzaMu;
      j = localObject1.length;
      if (j > 0)
      {
        localObject1 = null;
        j = i;
        i = 0;
        for (;;)
        {
          localObject2 = this.zzaMu;
          int k = localObject2.length;
          if (i >= k) {
            break;
          }
          localObject2 = this.zzaMu[i];
          if (localObject2 != null)
          {
            int m = 2;
            k = zzsn.zzc(m, (zzsu)localObject2);
            j += k;
          }
          i += 1;
        }
        i = j;
      }
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpm$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */