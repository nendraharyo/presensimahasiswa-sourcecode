package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.internal.zzcn;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzin;

class zzp$3
  implements Runnable
{
  zzp$3(zzp paramzzp, zze paramzze) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.zzqC;
      localObject1 = ((zzp)localObject1).zzpj;
      localObject1 = ((zzs)localObject1).zzrA;
      localObject2 = this.zzqE;
      ((zzcs)localObject1).zza((zzcn)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call OnContentAdLoadedListener.onContentAdLoaded().";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzp$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */