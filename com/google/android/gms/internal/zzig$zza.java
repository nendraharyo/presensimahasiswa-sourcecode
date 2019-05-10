package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

final class zzig$zza
{
  private long zzLo;
  private long zzLp;
  
  public zzig$zza()
  {
    this.zzLo = l;
    this.zzLp = l;
  }
  
  public Bundle toBundle()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    long l = this.zzLo;
    localBundle.putLong("topen", l);
    l = this.zzLp;
    localBundle.putLong("tclose", l);
    return localBundle;
  }
  
  public long zzgV()
  {
    return this.zzLp;
  }
  
  public void zzgW()
  {
    long l = SystemClock.elapsedRealtime();
    this.zzLp = l;
  }
  
  public void zzgX()
  {
    long l = SystemClock.elapsedRealtime();
    this.zzLo = l;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzig$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */