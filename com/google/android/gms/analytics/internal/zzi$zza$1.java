package com.google.android.gms.analytics.internal;

class zzi$zza$1
  implements Runnable
{
  zzi$zza$1(zzi.zza paramzza, zzac paramzzac) {}
  
  public void run()
  {
    zzi localzzi = this.zzQP.zzQL;
    boolean bool = localzzi.isConnected();
    if (!bool)
    {
      this.zzQP.zzQL.zzbe("Connected to service after a timeout");
      localzzi = this.zzQP.zzQL;
      zzac localzzac = this.zzQO;
      zzi.zza(localzzi, localzzac);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzi$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */