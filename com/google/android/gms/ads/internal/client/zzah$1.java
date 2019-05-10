package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzah$1
  implements Runnable
{
  zzah$1(zzah paramzzah) {}
  
  public void run()
  {
    Object localObject = zzah.zza(this.zzva);
    if (localObject != null) {}
    try
    {
      localObject = this.zzva;
      localObject = zzah.zza((zzah)localObject);
      int i = 1;
      ((zzq)localObject).onAdFailedToLoad(i);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not notify onAdFailedToLoad event.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzah$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */