package com.google.android.gms.internal;

public final class zzsz$zzb
  extends zzso
{
  public String version;
  public int zzbuM;
  public String zzbuN;
  
  public zzsz$zzb()
  {
    zzJD();
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
        int i = this.zzbuM;
        int j = ((zzb)paramObject).zzbuM;
        if (i == j)
        {
          Object localObject = this.zzbuN;
          if (localObject == null)
          {
            localObject = ((zzb)paramObject).zzbuN;
            if (localObject != null) {
              continue;
            }
            label73:
            localObject = this.version;
            if (localObject != null) {
              break label187;
            }
            localObject = ((zzb)paramObject).version;
            if (localObject != null) {
              continue;
            }
          }
          boolean bool4;
          label187:
          do
          {
            localObject = this.zzbuj;
            if (localObject != null)
            {
              localObject = this.zzbuj;
              bool4 = ((zzsq)localObject).isEmpty();
              if (!bool4) {
                break label216;
              }
            }
            localObject = ((zzb)paramObject).zzbuj;
            if (localObject != null)
            {
              localObject = ((zzb)paramObject).zzbuj;
              bool4 = ((zzsq)localObject).isEmpty();
              if (!bool4) {
                break;
              }
            }
            bool2 = bool1;
            break;
            localObject = this.zzbuN;
            String str = ((zzb)paramObject).zzbuN;
            bool4 = ((String)localObject).equals(str);
            if (bool4) {
              break label73;
            }
            break;
            localObject = this.version;
            str = ((zzb)paramObject).version;
            bool4 = ((String)localObject).equals(str);
          } while (bool4);
          continue;
          label216:
          localzzsq1 = this.zzbuj;
          zzsq localzzsq2 = ((zzb)paramObject).zzbuj;
          bool2 = localzzsq1.equals(localzzsq2);
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    zzsq localzzsq1 = null;
    int j = (getClass().getName().hashCode() + 527) * 31;
    int k = this.zzbuM;
    j += k;
    k = j * 31;
    String str = this.zzbuN;
    if (str == null)
    {
      j = 0;
      str = null;
      j += k;
      k = j * 31;
      str = this.version;
      if (str != null) {
        break label138;
      }
      j = 0;
      str = null;
      label82:
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
      str = this.zzbuN;
      j = str.hashCode();
      break;
      label138:
      str = this.version;
      j = str.hashCode();
      break label82;
      label153:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = this.zzbuM;
    if (i != 0)
    {
      i = 1;
      int m = this.zzbuM;
      paramzzsn.zzA(i, m);
    }
    String str1 = this.zzbuN;
    String str2 = "";
    boolean bool1 = str1.equals(str2);
    if (!bool1)
    {
      int j = 2;
      str2 = this.zzbuN;
      paramzzsn.zzn(j, str2);
    }
    str1 = this.version;
    str2 = "";
    boolean bool2 = str1.equals(str2);
    if (!bool2)
    {
      int k = 3;
      str2 = this.version;
      paramzzsn.zzn(k, str2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzb zzJD()
  {
    this.zzbuM = 0;
    this.zzbuN = "";
    this.version = "";
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzb zzT(zzsm paramzzsm)
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
      case 8: 
        int j = paramzzsm.zzJb();
        switch (j)
        {
        default: 
          break;
        case 0: 
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
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
          this.zzbuM = j;
        }
        break;
      case 18: 
        str = paramzzsm.readString();
        this.zzbuN = str;
        break;
      case 26: 
        str = paramzzsm.readString();
        this.version = str;
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    int j = this.zzbuM;
    if (j != 0)
    {
      int n = this.zzbuM;
      j = zzsn.zzC(1, n);
      i += j;
    }
    String str1 = this.zzbuN;
    String str2 = "";
    boolean bool1 = str1.equals(str2);
    if (!bool1)
    {
      str2 = this.zzbuN;
      int k = zzsn.zzo(2, str2);
      i += k;
    }
    str1 = this.version;
    str2 = "";
    boolean bool2 = str1.equals(str2);
    if (!bool2)
    {
      str2 = this.version;
      int m = zzsn.zzo(3, str2);
      i += m;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsz$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */