package com.google.android.gms.internal;

public final class zzsz$zze
  extends zzso
{
  private static volatile zze[] zzbvj;
  public String key;
  public String value;
  
  public zzsz$zze()
  {
    zzJH();
  }
  
  public static zze[] zzJG()
  {
    zze[] arrayOfzze = zzbvj;
    if (arrayOfzze == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzze = zzbvj;
      if (arrayOfzze == null)
      {
        arrayOfzze = null;
        arrayOfzze = new zze[0];
        zzbvj = arrayOfzze;
      }
      return zzbvj;
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
      boolean bool3 = paramObject instanceof zze;
      if (bool3)
      {
        paramObject = (zze)paramObject;
        Object localObject = this.key;
        if (localObject == null)
        {
          localObject = ((zze)paramObject).key;
          if (localObject != null) {
            continue;
          }
          label54:
          localObject = this.value;
          if (localObject != null) {
            break label168;
          }
          localObject = ((zze)paramObject).value;
          if (localObject != null) {
            continue;
          }
        }
        label168:
        do
        {
          localObject = this.zzbuj;
          if (localObject != null)
          {
            localObject = this.zzbuj;
            bool3 = ((zzsq)localObject).isEmpty();
            if (!bool3) {
              break label197;
            }
          }
          localObject = ((zze)paramObject).zzbuj;
          if (localObject != null)
          {
            localObject = ((zze)paramObject).zzbuj;
            bool3 = ((zzsq)localObject).isEmpty();
            if (!bool3) {
              break;
            }
          }
          bool2 = bool1;
          break;
          localObject = this.key;
          String str = ((zze)paramObject).key;
          bool3 = ((String)localObject).equals(str);
          if (bool3) {
            break label54;
          }
          break;
          localObject = this.value;
          str = ((zze)paramObject).value;
          bool3 = ((String)localObject).equals(str);
        } while (bool3);
        continue;
        label197:
        localzzsq1 = this.zzbuj;
        zzsq localzzsq2 = ((zze)paramObject).zzbuj;
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
    String str = this.key;
    if (str == null)
    {
      j = 0;
      str = null;
      j += k;
      k = j * 31;
      str = this.value;
      if (str != null) {
        break label124;
      }
      j = 0;
      str = null;
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
      str = this.key;
      j = str.hashCode();
      break;
      label124:
      str = this.value;
      j = str.hashCode();
      break label68;
      label139:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    String str1 = this.key;
    String str2 = "";
    int i = str1.equals(str2);
    if (i == 0)
    {
      i = 1;
      str2 = this.key;
      paramzzsn.zzn(i, str2);
    }
    str1 = this.value;
    str2 = "";
    boolean bool = str1.equals(str2);
    if (!bool)
    {
      int j = 2;
      str2 = this.value;
      paramzzsn.zzn(j, str2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zze zzJH()
  {
    this.key = "";
    this.value = "";
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zze zzW(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      String str;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        str = paramzzsm.readString();
        this.key = str;
        break;
      case 18: 
        str = paramzzsm.readString();
        this.value = str;
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    String str1 = this.key;
    String str2 = "";
    boolean bool1 = str1.equals(str2);
    if (!bool1)
    {
      str2 = this.key;
      int j = zzsn.zzo(1, str2);
      i += j;
    }
    str1 = this.value;
    str2 = "";
    boolean bool2 = str1.equals(str2);
    if (!bool2)
    {
      str2 = this.value;
      int k = zzsn.zzo(2, str2);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsz$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */