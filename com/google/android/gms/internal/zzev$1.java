package com.google.android.gms.internal;

import android.os.RemoteException;

class zzev$1
  implements Runnable
{
  zzev$1(zzev paramzzev, zzes paramzzes) {}
  
  public void run()
  {
    try
    {
      Object localObject = this.zzCE;
      localObject = ((zzes)localObject).zzCq;
      ((zzey)localObject).destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Could not destroy mediation adapter.";
        zzin.zzd(str, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzev$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */