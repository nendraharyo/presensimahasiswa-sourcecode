package com.google.android.gms.internal;

public final class zzqa$zza
  extends zzsu
{
  private static volatile zza[] zzaZR;
  public String name;
  public Boolean zzaZS;
  
  public zzqa$zza()
  {
    zzDL();
  }
  
  public static zza[] zzDK()
  {
    zza[] arrayOfzza = zzaZR;
    if (arrayOfzza == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzza = zzaZR;
      if (arrayOfzza == null)
      {
        arrayOfzza = null;
        arrayOfzza = new zza[0];
        zzaZR = arrayOfzza;
      }
      return zzaZR;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zza;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zza)paramObject;
        Object localObject1 = this.name;
        Object localObject2;
        if (localObject1 == null)
        {
          localObject1 = ((zza)paramObject).name;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.name;
          localObject2 = ((zza)paramObject).name;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        localObject1 = this.zzaZS;
        if (localObject1 == null)
        {
          localObject1 = ((zza)paramObject).zzaZS;
          if (localObject1 != null) {
            bool1 = false;
          }
        }
        else
        {
          localObject1 = this.zzaZS;
          localObject2 = ((zza)paramObject).zzaZS;
          bool2 = ((Boolean)localObject1).equals(localObject2);
          if (!bool2) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    Boolean localBoolean1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    String str = this.name;
    if (str == null)
    {
      j = 0;
      str = null;
      j = (j + k) * 31;
      Boolean localBoolean2 = this.zzaZS;
      if (localBoolean2 != null) {
        break label79;
      }
    }
    for (;;)
    {
      return j + i;
      str = this.name;
      j = str.hashCode();
      break;
      label79:
      localBoolean1 = this.zzaZS;
      i = localBoolean1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    Object localObject1 = this.name;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      i = 1;
      localObject2 = this.name;
      paramzzsn.zzn(i, (String)localObject2);
    }
    localObject1 = this.zzaZS;
    if (localObject1 != null)
    {
      i = 2;
      localObject2 = this.zzaZS;
      boolean bool = ((Boolean)localObject2).booleanValue();
      paramzzsn.zze(i, bool);
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzDL()
  {
    this.name = null;
    this.zzaZS = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    Object localObject1 = this.name;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = this.name;
      j = zzsn.zzo(1, (String)localObject2);
      i += j;
    }
    localObject1 = this.zzaZS;
    if (localObject1 != null)
    {
      localObject2 = this.zzaZS;
      boolean bool = ((Boolean)localObject2).booleanValue();
      j = zzsn.zzf(2, bool);
      i += j;
    }
    return i;
  }
  
  public zza zzz(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      boolean bool;
      Object localObject;
      switch (i)
      {
      default: 
        bool = zzsx.zzb(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        localObject = paramzzsm.readString();
        this.name = ((String)localObject);
        break;
      case 16: 
        bool = paramzzsm.zzJc();
        localObject = Boolean.valueOf(bool);
        this.zzaZS = ((Boolean)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqa$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */