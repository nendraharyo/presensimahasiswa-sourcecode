package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.support.v4.h.m;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.internal.zzcp;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzin;

class zzp$4
  implements Runnable
{
  zzp$4(zzp paramzzp, String paramString, zzif paramzzif) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = this.zzqC;
      localObject1 = ((zzp)localObject1).zzpj;
      localObject1 = ((zzs)localObject1).zzrC;
      localObject2 = this.zzqF;
      localObject1 = ((m)localObject1).get(localObject2);
      localObject1 = (zzcu)localObject1;
      localObject2 = this.zzpF;
      localObject2 = ((zzif)localObject2).zzLa;
      localObject2 = (zzf)localObject2;
      ((zzcu)localObject1).zza((zzcp)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().";
        zzin.zzd((String)localObject2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzp$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */