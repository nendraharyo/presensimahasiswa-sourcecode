package com.google.android.gms.internal;

public final class zzaf$zze
  extends zzso
{
  private static volatile zze[] zziF;
  public int key;
  public int value;
  
  public zzaf$zze()
  {
    zzI();
  }
  
  public static zze[] zzH()
  {
    zze[] arrayOfzze = zziF;
    if (arrayOfzze == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzze = zziF;
      if (arrayOfzze == null)
      {
        arrayOfzze = null;
        arrayOfzze = new zze[0];
        zziF = arrayOfzze;
      }
      return zziF;
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
        int i = this.key;
        int j = ((zze)paramObject).key;
        if (i == j)
        {
          i = this.value;
          j = ((zze)paramObject).value;
          if (i == j)
          {
            zzsq localzzsq2 = this.zzbuj;
            boolean bool4;
            if (localzzsq2 != null)
            {
              localzzsq2 = this.zzbuj;
              bool4 = localzzsq2.isEmpty();
              if (!bool4) {}
            }
            else
            {
              localzzsq2 = ((zze)paramObject).zzbuj;
              if (localzzsq2 != null)
              {
                localzzsq2 = ((zze)paramObject).zzbuj;
                bool4 = localzzsq2.isEmpty();
                if (!bool4) {
                  continue;
                }
              }
              bool2 = bool1;
              continue;
            }
            localzzsq1 = this.zzbuj;
            zzsq localzzsq3 = ((zze)paramObject).zzbuj;
            bool2 = localzzsq1.equals(localzzsq3);
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = (getClass().getName().hashCode() + 527) * 31;
    int m = this.key;
    i = (i + m) * 31;
    m = this.value;
    i += m;
    m = i * 31;
    zzsq localzzsq = this.zzbuj;
    int j;
    if (localzzsq != null)
    {
      localzzsq = this.zzbuj;
      j = localzzsq.isEmpty();
      if (j == 0) {}
    }
    else
    {
      j = 0;
      localzzsq = null;
    }
    for (;;)
    {
      return j + m;
      localzzsq = this.zzbuj;
      int k = localzzsq.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = this.key;
    paramzzsn.zzA(1, i);
    i = this.value;
    paramzzsn.zzA(2, i);
    super.writeTo(paramzzsn);
  }
  
  public zze zzI()
  {
    this.key = 0;
    this.value = 0;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zze zze(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      switch (i)
      {
      default: 
        boolean bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = paramzzsm.zzJb();
        this.key = j;
        break;
      case 16: 
        j = paramzzsm.zzJb();
        this.value = j;
      }
    }
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    int j = this.key;
    int k = zzsn.zzC(1, j);
    i += k;
    j = this.value;
    k = zzsn.zzC(2, j);
    return i + k;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */