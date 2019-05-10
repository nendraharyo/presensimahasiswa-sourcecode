package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.Cast.Listener;

class zze$zzb$1
  implements Runnable
{
  zze$zzb$1(zze.zzb paramzzb, zze paramzze, int paramInt) {}
  
  public void run()
  {
    Cast.Listener localListener = zze.zzd(this.zzadV);
    int i = this.zzadW;
    localListener.onApplicationDisconnected(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zze$zzb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */