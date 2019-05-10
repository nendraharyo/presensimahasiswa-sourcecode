package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.internal.zzcl;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzin;

class zzp$2
  implements Runnable
{
  zzp$2(zzp paramzzp, zzd paramzzd) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.zzqC;
      localObject1 = ((zzp)localObject1).zzpj;
      localObject1 = ((zzs)localObject1).zzrz;
      localObject2 = this.zzqD;
      ((zzcr)localObject1).zza((zzcl)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzp$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */