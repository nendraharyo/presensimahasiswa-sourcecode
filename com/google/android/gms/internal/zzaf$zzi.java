package com.google.android.gms.internal;

public final class zzaf$zzi
  extends zzso
{
  private static volatile zzi[] zzjq;
  public String name;
  public zzag.zza zzjr;
  public zzaf.zzd zzjs;
  
  public zzaf$zzi()
  {
    zzO();
  }
  
  public static zzi[] zzN()
  {
    zzi[] arrayOfzzi = zzjq;
    if (arrayOfzzi == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzi = zzjq;
      if (arrayOfzzi == null)
      {
        arrayOfzzi = null;
        arrayOfzzi = new zzi[0];
        zzjq = arrayOfzzi;
      }
      return zzjq;
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
      boolean bool3 = paramObject instanceof zzi;
      if (bool3)
      {
        paramObject = (zzi)paramObject;
        Object localObject1 = this.name;
        if (localObject1 == null)
        {
          localObject1 = ((zzi)paramObject).name;
          if (localObject1 != null) {
            continue;
          }
          label54:
          localObject1 = this.zzjr;
          if (localObject1 != null) {
            break label190;
          }
          localObject1 = ((zzi)paramObject).zzjr;
          if (localObject1 != null) {
            continue;
          }
          label76:
          localObject1 = this.zzjs;
          if (localObject1 != null) {
            break label219;
          }
          localObject1 = ((zzi)paramObject).zzjs;
          if (localObject1 != null) {
            continue;
          }
        }
        label190:
        label219:
        do
        {
          localObject1 = this.zzbuj;
          if (localObject1 != null)
          {
            localObject1 = this.zzbuj;
            bool3 = ((zzsq)localObject1).isEmpty();
            if (!bool3) {
              break label248;
            }
          }
          localObject1 = ((zzi)paramObject).zzbuj;
          if (localObject1 != null)
          {
            localObject1 = ((zzi)paramObject).zzbuj;
            bool3 = ((zzsq)localObject1).isEmpty();
            if (!bool3) {
              break;
            }
          }
          bool2 = bool1;
          break;
          localObject1 = this.name;
          Object localObject2 = ((zzi)paramObject).name;
          bool3 = ((String)localObject1).equals(localObject2);
          if (bool3) {
            break label54;
          }
          break;
          localObject1 = this.zzjr;
          localObject2 = ((zzi)paramObject).zzjr;
          bool3 = ((zzag.zza)localObject1).equals(localObject2);
          if (bool3) {
            break label76;
          }
          break;
          localObject1 = this.zzjs;
          localObject2 = ((zzi)paramObject).zzjs;
          bool3 = ((zzaf.zzd)localObject1).equals(localObject2);
        } while (bool3);
        continue;
        label248:
        localzzsq1 = this.zzbuj;
        zzsq localzzsq2 = ((zzi)paramObject).zzbuj;
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
      localObject = this.zzjr;
      if (localObject != null) {
        break label151;
      }
      j = 0;
      localObject = null;
      label68:
      j += k;
      k = j * 31;
      localObject = this.zzjs;
      if (localObject != null) {
        break label166;
      }
      j = 0;
      localObject = null;
      label95:
      j = (j + k) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool = localzzsq2.isEmpty();
        if (!bool) {
          break label181;
        }
      }
    }
    for (;;)
    {
      return j + i;
      localObject = this.name;
      j = ((String)localObject).hashCode();
      break;
      label151:
      localObject = this.zzjr;
      j = ((zzag.zza)localObject).hashCode();
      break label68;
      label166:
      localObject = this.zzjs;
      j = ((zzaf.zzd)localObject).hashCode();
      break label95;
      label181:
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
    localObject1 = this.zzjr;
    int j;
    if (localObject1 != null)
    {
      j = 2;
      localObject2 = this.zzjr;
      paramzzsn.zza(j, (zzsu)localObject2);
    }
    localObject1 = this.zzjs;
    if (localObject1 != null)
    {
      j = 3;
      localObject2 = this.zzjs;
      paramzzsn.zza(j, (zzsu)localObject2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzi zzO()
  {
    this.name = "";
    this.zzjr = null;
    this.zzjs = null;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzi zzi(zzsm paramzzsm)
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
        localObject = this.zzjr;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzag$zza;
          ((zzag.zza)localObject).<init>();
          this.zzjr = ((zzag.zza)localObject);
        }
        localObject = this.zzjr;
        paramzzsm.zza((zzsu)localObject);
        break;
      case 26: 
        localObject = this.zzjs;
        if (localObject == null)
        {
          localObject = new com/google/android/gms/internal/zzaf$zzd;
          ((zzaf.zzd)localObject).<init>();
          this.zzjs = ((zzaf.zzd)localObject);
        }
        localObject = this.zzjs;
        paramzzsm.zza((zzsu)localObject);
      }
    }
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
    localObject1 = this.zzjr;
    if (localObject1 != null)
    {
      localObject2 = this.zzjr;
      j = zzsn.zzc(2, (zzsu)localObject2);
      i += j;
    }
    localObject1 = this.zzjs;
    if (localObject1 != null)
    {
      localObject2 = this.zzjs;
      j = zzsn.zzc(3, (zzsu)localObject2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */