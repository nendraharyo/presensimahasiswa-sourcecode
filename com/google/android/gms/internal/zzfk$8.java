package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzfk$8
  implements Runnable
{
  zzfk$8(zzfk paramzzfk) {}
  
  public void run()
  {
    try
    {
      Object localObject = this.zzCQ;
      localObject = zzfk.zza((zzfk)localObject);
      ((zzez)localObject).onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdLoaded.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfk$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */