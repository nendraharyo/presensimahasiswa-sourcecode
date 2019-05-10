package com.google.android.gms.ads.internal.overlay;

class zzc$5
  implements Runnable
{
  zzc$5(zzc paramzzc) {}
  
  public void run()
  {
    zzh localzzh = zzc.zza(this.zzEd);
    if (localzzh != null)
    {
      zzc.zza(this.zzEd).onPaused();
      localzzh = zzc.zza(this.zzEd);
      localzzh.zzfC();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzc$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */