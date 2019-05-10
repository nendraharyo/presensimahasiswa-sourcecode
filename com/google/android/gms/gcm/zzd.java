package com.google.android.gms.gcm;

import android.os.Bundle;

public class zzd
{
  public static final zzd zzaMc;
  public static final zzd zzaMd;
  private final int zzaMe;
  private final int zzaMf;
  private final int zzaMg;
  
  static
  {
    int i = 3600;
    int j = 30;
    zzd localzzd = new com/google/android/gms/gcm/zzd;
    localzzd.<init>(0, j, i);
    zzaMc = localzzd;
    localzzd = new com/google/android/gms/gcm/zzd;
    localzzd.<init>(1, j, i);
    zzaMd = localzzd;
  }
  
  private zzd(int paramInt1, int paramInt2, int paramInt3)
  {
    this.zzaMe = paramInt1;
    this.zzaMf = paramInt2;
    this.zzaMg = paramInt3;
  }
  
  public Bundle zzF(Bundle paramBundle)
  {
    int i = this.zzaMe;
    paramBundle.putInt("retry_policy", i);
    i = this.zzaMf;
    paramBundle.putInt("initial_backoff_seconds", i);
    i = this.zzaMg;
    paramBundle.putInt("maximum_backoff_seconds", i);
    return paramBundle;
  }
  
  public int zzym()
  {
    return this.zzaMe;
  }
  
  public int zzyn()
  {
    return this.zzaMf;
  }
  
  public int zzyo()
  {
    return this.zzaMg;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */