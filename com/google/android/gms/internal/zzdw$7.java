package com.google.android.gms.internal;

import android.os.RemoteException;

class zzdw$7
  implements Runnable
{
  zzdw$7(zzdw paramzzdw, zzdw.zza paramzza, zzdx paramzzdx) {}
  
  public void run()
  {
    try
    {
      zzdw.zza localzza = this.zzAo;
      localObject = this.zzAp;
      localzza.zzb((zzdx)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Could not propagate interstitial ad event.";
        zzin.zzd((String)localObject, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdw$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */