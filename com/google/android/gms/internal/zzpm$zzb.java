package com.google.android.gms.internal;

public final class zzpm$zzb
  extends zzso
{
  private static volatile zzb[] zzaMs;
  public String name;
  public zzpm.zzd zzaMt;
  
  public zzpm$zzb()
  {
    zzyt();
  }
  
  public static zzb[] zzys()
  {
    zzb[] arrayOfzzb = zzaMs;
    if (arrayOfzzb == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzb = zzaMs;
      if (arrayOfzzb == null)
      {
        arrayOfzzb = null;
        arrayOfzzb = new zzb[0];
        zzaMs = arrayOfzzb;
      }
      return zzaMs;
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
      boolean bool3 = paramObject instanceof zzb;
      if (bool3)
      {
        paramObject = (zzb)paramObject;
        Object localObject1 = this.name;
        if (localObject1 == null)
        {
          localObject1 = ((zzb)paramObject).name;
          if (localObject1 != null) {
            continue;
          }
          label54:
          localObject1 = this.zzaMt;
          if (localObject1 != null) {
            break label168;
          }
          localObject1 = ((zzb)paramObject).zzaMt;
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
          localObject1 = ((zzb)paramObject).zzbuj;
          if (localObject1 != null)
          {
            localObject1 = ((zzb)paramObject).zzbuj;
            bool3 = ((zzsq)localObject1).isEmpty();
            if (!bool3) {
              break;
            }
          }
          bool2 = bool1;
          break;
          localObject1 = this.name;
          Object localObject2 = ((zzb)paramObject).name;
          bool3 = ((String)localObject1).equals(localObject2);
          if (bool3) {
            break label54;
          }
          break;
          localObject1 = this.zzaMt;
          localObject2 = ((zzb)paramObject).zzaMt;
          bool3 = ((zzpm.zzd)localObject1).equals(localObject2);
        } while (bool3);
        continue;
        label197:
        localzzsq1 = this.zzbuj;
        zzsq localzzsq2 = ((zzb)paramObject).zzbuj;
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
      localObject = this.zzaMt;
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
      localObject = this.zzaMt;
      j = ((zzpm.zzd)localObject).hashCode();
      break label68;
      label139:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.name;
    Object localObject2 = "";
    int i = ((String)localObject1).equals(localObject2);
    if (i == 0)
    {
      i = 1;
      localObject2 = this.name;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzaMt;
    if (localObject1 != null)
    {
      int j = 2;
      localObject2 = this.zzaMt;
      paramzzsn.zza(j, (zzsu)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzb zzq(zzsm paramzzsm)
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
        localObject = this.zzaMt;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzpm$zzd;
          ((zzpm.zzd)localObject).<init>();
          this.zzaMt = ((zzpm.zzd)localObject);
        }
        localObject = this.zzaMt;
        paramzzsm.zza((zzsu)localObject);
      }
    }
  }
  
  public zzb zzyt()
  {
    this.name = "";
    this.zzaMt = null;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.name;
    Object localObject2 = "";
    boolean bool = ((String)localObject1).equals(localObject2);
    int j;
    if (!bool)
    {
      localObject2 = this.name;
      j = zzsn.zzo(1, (String)localObject2);
      i += j;
    }
    localObject1 = this.zzaMt;
    if (localObject1 != null)
    {
      localObject2 = this.zzaMt;
      j = zzsn.zzc(2, (zzsu)localObject2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpm$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */