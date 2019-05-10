package com.google.android.gms.internal;

public final class zzpm$zza$zza
  extends zzso
{
  private static volatile zza[] zzaMp;
  public int viewId;
  public String zzaMq;
  public String zzaMr;
  
  public zzpm$zza$zza()
  {
    zzyr();
  }
  
  public static zza[] zzyq()
  {
    zza[] arrayOfzza = zzaMp;
    if (arrayOfzza == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzza = zzaMp;
      if (arrayOfzza == null)
      {
        arrayOfzza = null;
        arrayOfzza = new zza[0];
        zzaMp = arrayOfzza;
      }
      return zzaMp;
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
        Object localObject = this.zzaMq;
        if (localObject == null)
        {
          localObject = ((zza)paramObject).zzaMq;
          if (localObject != null) {
            continue;
          }
          label54:
          localObject = this.zzaMr;
          if (localObject != null) {
            break label187;
          }
          localObject = ((zza)paramObject).zzaMr;
          if (localObject != null) {
            continue;
          }
        }
        boolean bool4;
        label187:
        do
        {
          int i = this.viewId;
          int j = ((zza)paramObject).viewId;
          if (i != j) {
            break;
          }
          localObject = this.zzbuj;
          if (localObject != null)
          {
            localObject = this.zzbuj;
            bool4 = ((zzsq)localObject).isEmpty();
            if (!bool4) {
              break label216;
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
          localObject = this.zzaMq;
          String str = ((zza)paramObject).zzaMq;
          bool4 = ((String)localObject).equals(str);
          if (bool4) {
            break label54;
          }
          break;
          localObject = this.zzaMr;
          str = ((zza)paramObject).zzaMr;
          bool4 = ((String)localObject).equals(str);
        } while (bool4);
        continue;
        label216:
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
    String str = this.zzaMq;
    if (str == null)
    {
      j = 0;
      str = null;
      j += k;
      k = j * 31;
      str = this.zzaMr;
      if (str != null) {
        break label138;
      }
      j = 0;
      str = null;
      label68:
      j = (j + k) * 31;
      k = this.viewId;
      j = (j + k) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool = localzzsq2.isEmpty();
        if (!bool) {
          break label153;
        }
      }
    }
    for (;;)
    {
      return j + i;
      str = this.zzaMq;
      j = str.hashCode();
      break;
      label138:
      str = this.zzaMr;
      j = str.hashCode();
      break label68;
      label153:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    String str1 = this.zzaMq;
    String str2 = "";
    int i = str1.equals(str2);
    if (i == 0)
    {
      i = 1;
      str2 = this.zzaMq;
      paramzzsn.zzn(i, str2);
    }
    str1 = this.zzaMr;
    str2 = "";
    boolean bool = str1.equals(str2);
    if (!bool)
    {
      j = 2;
      str2 = this.zzaMr;
      paramzzsn.zzn(j, str2);
    }
    int j = this.viewId;
    if (j != 0)
    {
      j = 3;
      int k = this.viewId;
      paramzzsn.zzA(j, k);
    }
    super.writeTo(paramzzsn);
  }
  
  public zza zzp(zzsm paramzzsm)
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
        this.zzaMq = str;
        break;
      case 18: 
        str = paramzzsm.readString();
        this.zzaMr = str;
        break;
      case 24: 
        int j = paramzzsm.zzJb();
        this.viewId = j;
      }
    }
  }
  
  public zza zzyr()
  {
    this.zzaMq = "";
    this.zzaMr = "";
    this.viewId = 0;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    String str1 = this.zzaMq;
    String str2 = "";
    boolean bool1 = str1.equals(str2);
    if (!bool1)
    {
      str2 = this.zzaMq;
      int j = zzsn.zzo(1, str2);
      i += j;
    }
    str1 = this.zzaMr;
    str2 = "";
    boolean bool2 = str1.equals(str2);
    if (!bool2)
    {
      str2 = this.zzaMr;
      k = zzsn.zzo(2, str2);
      i += k;
    }
    int k = this.viewId;
    if (k != 0)
    {
      int m = this.viewId;
      k = zzsn.zzC(3, m);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpm$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */