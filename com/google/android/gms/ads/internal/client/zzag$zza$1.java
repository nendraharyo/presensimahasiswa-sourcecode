package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzag$zza$1
  implements Runnable
{
  zzag$zza$1(zzag.zza paramzza) {}
  
  public void run()
  {
    Object localObject = zzag.zza(this.zzuZ.zzuY);
    if (localObject != null) {}
    try
    {
      localObject = this.zzuZ;
      localObject = ((zzag.zza)localObject).zzuY;
      localObject = zzag.zza((zzag)localObject);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzag$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */