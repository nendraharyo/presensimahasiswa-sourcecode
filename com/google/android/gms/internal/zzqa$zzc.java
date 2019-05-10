package com.google.android.gms.internal;

public final class zzqa$zzc
  extends zzsu
{
  private static volatile zzc[] zzaZY;
  public String key;
  public String value;
  
  public zzqa$zzc()
  {
    zzDO();
  }
  
  public static zzc[] zzDN()
  {
    zzc[] arrayOfzzc = zzaZY;
    if (arrayOfzzc == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzc = zzaZY;
      if (arrayOfzzc == null)
      {
        arrayOfzzc = null;
        arrayOfzzc = new zzc[0];
        zzaZY = arrayOfzzc;
      }
      return zzaZY;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzc;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzc)paramObject;
        String str1 = this.key;
        String str2;
        if (str1 == null)
        {
          str1 = ((zzc)paramObject).key;
          if (str1 != null) {
            bool1 = false;
          }
        }
        else
        {
          str1 = this.key;
          str2 = ((zzc)paramObject).key;
          bool2 = str1.equals(str2);
          if (!bool2)
          {
            bool1 = false;
            continue;
          }
        }
        str1 = this.value;
        if (str1 == null)
        {
          str1 = ((zzc)paramObject).value;
          if (str1 != null) {
            bool1 = false;
          }
        }
        else
        {
          str1 = this.value;
          str2 = ((zzc)paramObject).value;
          bool2 = str1.equals(str2);
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
    String str1 = null;
    int j = getClass().getName().hashCode() + 527;
    int k = j * 31;
    String str2 = this.key;
    if (str2 == null)
    {
      j = 0;
      str2 = null;
      j = (j + k) * 31;
      String str3 = this.value;
      if (str3 != null) {
        break label79;
      }
    }
    for (;;)
    {
      return j + i;
      str2 = this.key;
      j = str2.hashCode();
      break;
      label79:
      str1 = this.value;
      i = str1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    String str1 = this.key;
    int i;
    String str2;
    if (str1 != null)
    {
      i = 1;
      str2 = this.key;
      paramzzsn.zzn(i, str2);
    }
    str1 = this.value;
    if (str1 != null)
    {
      i = 2;
      str2 = this.value;
      paramzzsn.zzn(i, str2);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzc zzB(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      String str;
      switch (i)
      {
      default: 
        boolean bool = zzsx.zzb(paramzzsm, i);
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
  
  public zzc zzDO()
  {
    this.key = null;
    this.value = null;
    this.zzbuu = -1;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    String str1 = this.key;
    String str2;
    int j;
    if (str1 != null)
    {
      str2 = this.key;
      j = zzsn.zzo(1, str2);
      i += j;
    }
    str1 = this.value;
    if (str1 != null)
    {
      str2 = this.value;
      j = zzsn.zzo(2, str2);
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqa$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */