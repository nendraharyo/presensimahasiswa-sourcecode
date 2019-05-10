package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzfk$10
  implements Runnable
{
  zzfk$10(zzfk paramzzfk, AdRequest.ErrorCode paramErrorCode) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.zzCQ;
      localObject1 = zzfk.zza((zzfk)localObject1);
      localObject2 = this.zzCR;
      int i = zzfl.zza((AdRequest.ErrorCode)localObject2);
      ((zzez)localObject1).onAdFailedToLoad(i);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onAdFailedToLoad.";
        zzb.zzd((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfk$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */