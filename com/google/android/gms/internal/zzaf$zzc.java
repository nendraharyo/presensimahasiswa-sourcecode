package com.google.android.gms.internal;

public final class zzaf$zzc
  extends zzso
{
  private static volatile zzc[] zzix;
  public String key;
  public boolean zziA;
  public long zziB;
  public long zziy;
  public long zziz;
  
  public zzaf$zzc()
  {
    zzF();
  }
  
  public static zzc[] zzE()
  {
    zzc[] arrayOfzzc = zzix;
    if (arrayOfzzc == null) {}
    synchronized (zzss.zzbut)
    {
      arrayOfzzc = zzix;
      if (arrayOfzzc == null)
      {
        arrayOfzzc = null;
        arrayOfzzc = new zzc[0];
        zzix = arrayOfzzc;
      }
      return zzix;
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
      boolean bool3 = paramObject instanceof zzc;
      if (bool3)
      {
        paramObject = (zzc)paramObject;
        Object localObject = this.key;
        if (localObject == null)
        {
          localObject = ((zzc)paramObject).key;
          if (localObject != null) {}
        }
        else
        {
          do
          {
            long l1 = this.zziy;
            long l2 = ((zzc)paramObject).zziy;
            bool3 = l1 < l2;
            if (bool3) {
              break;
            }
            l1 = this.zziz;
            l2 = ((zzc)paramObject).zziz;
            bool3 = l1 < l2;
            if (bool3) {
              break;
            }
            bool3 = this.zziA;
            boolean bool4 = ((zzc)paramObject).zziA;
            if (bool3 != bool4) {
              break;
            }
            l1 = this.zziB;
            l2 = ((zzc)paramObject).zziB;
            bool3 = l1 < l2;
            if (bool3) {
              break;
            }
            localObject = this.zzbuj;
            if (localObject != null)
            {
              localObject = this.zzbuj;
              bool3 = ((zzsq)localObject).isEmpty();
              if (!bool3) {
                break label237;
              }
            }
            localObject = ((zzc)paramObject).zzbuj;
            if (localObject != null)
            {
              localObject = ((zzc)paramObject).zzbuj;
              bool3 = ((zzsq)localObject).isEmpty();
              if (!bool3) {
                break;
              }
            }
            bool2 = bool1;
            break;
            localObject = this.key;
            String str = ((zzc)paramObject).key;
            bool3 = ((String)localObject).equals(str);
          } while (bool3);
          continue;
          label237:
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
    int j = 32;
    int k = getClass().getName().hashCode() + 527;
    int n = k * 31;
    String str = this.key;
    int m;
    if (str == null)
    {
      k = 0;
      str = null;
      k = (k + n) * 31;
      long l1 = this.zziy;
      long l2 = this.zziy >>> j;
      n = (int)(l1 ^ l2);
      k = (k + n) * 31;
      l1 = this.zziz;
      l2 = this.zziz >>> j;
      l1 ^= l2;
      n = (int)l1;
      n = (k + n) * 31;
      boolean bool1 = this.zziA;
      if (!bool1) {
        break label237;
      }
      m = 1231;
      label141:
      m = (m + n) * 31;
      l1 = this.zziB;
      l2 = this.zziB >>> j;
      l1 ^= l2;
      n = (int)l1;
      m = (m + n) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool2 = localzzsq2.isEmpty();
        if (!bool2) {
          break label245;
        }
      }
    }
    for (;;)
    {
      return m + i;
      str = this.key;
      m = str.hashCode();
      break;
      label237:
      m = 1237;
      break label141;
      label245:
      localzzsq1 = this.zzbuj;
      i = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    long l1 = 0L;
    String str1 = this.key;
    String str2 = "";
    int i = str1.equals(str2);
    if (i == 0)
    {
      i = 1;
      str2 = this.key;
      paramzzsn.zzn(i, str2);
    }
    long l2 = this.zziy;
    boolean bool1 = l2 < l1;
    if (bool1)
    {
      int j = 2;
      l3 = this.zziy;
      paramzzsn.zzb(j, l3);
    }
    l2 = this.zziz;
    long l3 = 2147483647L;
    boolean bool2 = l2 < l3;
    if (bool2)
    {
      int k = 3;
      l3 = this.zziz;
      paramzzsn.zzb(k, l3);
    }
    boolean bool3 = this.zziA;
    if (bool3)
    {
      int m = 4;
      boolean bool5 = this.zziA;
      paramzzsn.zze(m, bool5);
    }
    l2 = this.zziB;
    boolean bool4 = l2 < l1;
    if (bool4)
    {
      int n = 5;
      l3 = this.zziB;
      paramzzsn.zzb(n, l3);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzc zzF()
  {
    long l = 0L;
    this.key = "";
    this.zziy = l;
    this.zziz = 2147483647L;
    this.zziA = false;
    this.zziB = l;
    this.zzbuj = null;
    this.zzbuu = -1;
    return this;
  }
  
  public zzc zzc(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      boolean bool;
      long l;
      switch (i)
      {
      default: 
        bool = zza(paramzzsm, i);
        if (bool) {}
        break;
      case 0: 
        return this;
      case 10: 
        String str = paramzzsm.readString();
        this.key = str;
        break;
      case 16: 
        l = paramzzsm.zzJa();
        this.zziy = l;
        break;
      case 24: 
        l = paramzzsm.zzJa();
        this.zziz = l;
        break;
      case 32: 
        bool = paramzzsm.zzJc();
        this.zziA = bool;
        break;
      case 40: 
        l = paramzzsm.zzJa();
        this.zziB = l;
      }
    }
  }
  
  protected int zzz()
  {
    long l1 = 0L;
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
    long l2 = this.zziy;
    boolean bool2 = l2 < l1;
    if (bool2)
    {
      l2 = this.zziy;
      int k = zzsn.zzd(2, l2);
      i += k;
    }
    l2 = this.zziz;
    long l3 = 2147483647L;
    boolean bool3 = l2 < l3;
    if (bool3)
    {
      l2 = this.zziz;
      int m = zzsn.zzd(3, l2);
      i += m;
    }
    boolean bool4 = this.zziA;
    if (bool4)
    {
      boolean bool6 = this.zziA;
      int n = zzsn.zzf(4, bool6);
      i += n;
    }
    l2 = this.zziB;
    boolean bool5 = l2 < l1;
    if (bool5)
    {
      l2 = this.zziB;
      int i1 = zzsn.zzd(5, l2);
      i += i1;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaf$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */