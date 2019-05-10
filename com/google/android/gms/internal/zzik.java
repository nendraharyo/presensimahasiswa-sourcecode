package com.google.android.gms.internal;

import android.os.Bundle;

public class zzik
{
  private int zzLJ;
  private int zzLK;
  private final String zzLh;
  private final Object zzpV;
  private final zzih zzqV;
  
  zzik(zzih paramzzih, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzqV = paramzzih;
    this.zzLh = paramString;
  }
  
  public zzik(String paramString)
  {
    this(localzzih, paramString);
  }
  
  public Bundle toBundle()
  {
    synchronized (this.zzpV)
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      String str = "pmnli";
      int i = this.zzLJ;
      localBundle.putInt(str, i);
      str = "pmnll";
      i = this.zzLK;
      localBundle.putInt(str, i);
      return localBundle;
    }
  }
  
  public void zzg(int paramInt1, int paramInt2)
  {
    synchronized (this.zzpV)
    {
      this.zzLJ = paramInt1;
      this.zzLK = paramInt2;
      zzih localzzih = this.zzqV;
      String str = this.zzLh;
      localzzih.zza(str, this);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzik.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */