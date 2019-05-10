package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzfk$7
  implements Runnable
{
  zzfk$7(zzfk paramzzfk) {}
  
  public void run()
  {
    try
    {
      Object localObject = this.zzCQ;
      localObject = zzfk.zza((zzfk)localObject);
      ((zzez)localObject).onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not call onAdOpened.";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfk$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */