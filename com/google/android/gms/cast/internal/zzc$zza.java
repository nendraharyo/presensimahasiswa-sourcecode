package com.google.android.gms.cast.internal;

import android.os.SystemClock;

class zzc$zza
  implements Runnable
{
  private zzc$zza(zzc paramzzc) {}
  
  public void run()
  {
    this.zzadt.zzads = false;
    long l = SystemClock.elapsedRealtime();
    boolean bool = this.zzadt.zzz(l);
    this.zzadt.zzW(bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */