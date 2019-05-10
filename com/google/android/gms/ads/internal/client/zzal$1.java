package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzal$1
  implements Runnable
{
  zzal$1(zzal paramzzal) {}
  
  public void run()
  {
    Object localObject = zzal.zza(this.zzvc);
    if (localObject != null) {}
    try
    {
      localObject = this.zzvc;
      localObject = zzal.zza((zzal)localObject);
      int i = 1;
      ((zzd)localObject).onRewardedVideoAdFailedToLoad(i);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not notify onRewardedVideoAdFailedToLoad event.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzal$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */