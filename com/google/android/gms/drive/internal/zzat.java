package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzso;
import com.google.android.gms.internal.zzsq;
import com.google.android.gms.internal.zzsu;

public final class zzat
  extends zzso
{
  public int versionCode;
  public long zzarW;
  public String zzarY;
  public long zzarZ;
  public int zzasa;
  
  public zzat()
  {
    zztl();
  }
  
  public static zzat zzm(byte[] paramArrayOfByte)
  {
    zzat localzzat = new com/google/android/gms/drive/internal/zzat;
    localzzat.<init>();
    return (zzat)zzsu.mergeFrom(localzzat, paramArrayOfByte);
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
      boolean bool3 = paramObject instanceof zzat;
      if (bool3)
      {
        paramObject = (zzat)paramObject;
        int i = this.versionCode;
        int k = ((zzat)paramObject).versionCode;
        if (i == k)
        {
          Object localObject = this.zzarY;
          if (localObject == null)
          {
            localObject = ((zzat)paramObject).zzarY;
            if (localObject != null) {}
          }
          else
          {
            boolean bool5;
            do
            {
              long l1 = this.zzarZ;
              long l2 = ((zzat)paramObject).zzarZ;
              boolean bool4 = l1 < l2;
              if (bool4) {
                break;
              }
              l1 = this.zzarW;
              l2 = ((zzat)paramObject).zzarW;
              bool4 = l1 < l2;
              if (bool4) {
                break;
              }
              int j = this.zzasa;
              k = ((zzat)paramObject).zzasa;
              if (j != k) {
                break;
              }
              localObject = this.zzbuj;
              if (localObject != null)
              {
                localObject = this.zzbuj;
                bool5 = ((zzsq)localObject).isEmpty();
                if (!bool5) {
                  break label232;
                }
              }
              localObject = ((zzat)paramObject).zzbuj;
              if (localObject != null)
              {
                localObject = ((zzat)paramObject).zzbuj;
                bool5 = ((zzsq)localObject).isEmpty();
                if (!bool5) {
                  break;
                }
              }
              bool2 = bool1;
              break;
              localObject = this.zzarY;
              String str = ((zzat)paramObject).zzarY;
              bool5 = ((String)localObject).equals(str);
            } while (bool5);
            continue;
            label232:
            localzzsq1 = this.zzbuj;
            zzsq localzzsq2 = ((zzat)paramObject).zzbuj;
            bool2 = localzzsq1.equals(localzzsq2);
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 32;
    int j = 0;
    zzsq localzzsq1 = null;
    int k = (getClass().getName().hashCode() + 527) * 31;
    int m = this.versionCode;
    k += m;
    m = k * 31;
    String str = this.zzarY;
    if (str == null)
    {
      k = 0;
      str = null;
      k = (k + m) * 31;
      long l1 = this.zzarZ;
      long l2 = this.zzarZ >>> i;
      m = (int)(l1 ^ l2);
      k = (k + m) * 31;
      l1 = this.zzarW;
      l2 = this.zzarW >>> i;
      l1 ^= l2;
      m = (int)l1;
      k = (k + m) * 31;
      m = this.zzasa;
      k = (k + m) * 31;
      zzsq localzzsq2 = this.zzbuj;
      if (localzzsq2 != null)
      {
        localzzsq2 = this.zzbuj;
        boolean bool = localzzsq2.isEmpty();
        if (!bool) {
          break label207;
        }
      }
    }
    for (;;)
    {
      return k + j;
      str = this.zzarY;
      k = str.hashCode();
      break;
      label207:
      localzzsq1 = this.zzbuj;
      j = localzzsq1.hashCode();
    }
  }
  
  public void writeTo(zzsn paramzzsn)
  {
    int i = this.versionCode;
    paramzzsn.zzA(1, i);
    String str = this.zzarY;
    paramzzsn.zzn(2, str);
    long l = this.zzarZ;
    paramzzsn.zzc(3, l);
    l = this.zzarW;
    paramzzsn.zzc(4, l);
    int j = this.zzasa;
    i = -1;
    if (j != i)
    {
      j = 5;
      i = this.zzasa;
      paramzzsn.zzA(j, i);
    }
    super.writeTo(paramzzsn);
  }
  
  public zzat zzm(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      long l;
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
        this.versionCode = j;
        break;
      case 18: 
        String str = paramzzsm.readString();
        this.zzarY = str;
        break;
      case 24: 
        l = paramzzsm.zzJe();
        this.zzarZ = l;
        break;
      case 32: 
        l = paramzzsm.zzJe();
        this.zzarW = l;
        break;
      case 40: 
        j = paramzzsm.zzJb();
        this.zzasa = j;
      }
    }
  }
  
  public zzat zztl()
  {
    long l = -1;
    int i = -1;
    this.versionCode = 1;
    this.zzarY = "";
    this.zzarZ = l;
    this.zzarW = l;
    this.zzasa = i;
    this.zzbuj = null;
    this.zzbuu = i;
    return this;
  }
  
  protected int zzz()
  {
    int i = super.zzz();
    int j = this.versionCode;
    int k = zzsn.zzC(1, j);
    i += k;
    String str = this.zzarY;
    k = zzsn.zzo(2, str);
    i += k;
    long l = this.zzarZ;
    k = zzsn.zze(3, l);
    i += k;
    l = this.zzarW;
    k = zzsn.zze(4, l);
    i += k;
    k = this.zzasa;
    j = -1;
    if (k != j)
    {
      j = this.zzasa;
      k = zzsn.zzC(5, j);
      i += k;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */