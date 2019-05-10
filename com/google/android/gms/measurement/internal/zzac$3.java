package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

class zzac$3
  implements Runnable
{
  zzac$3(zzac paramzzac) {}
  
  public void run()
  {
    Object localObject1 = zzac.zzc(this.zzaYU);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = this.zzaYU.zzAo().zzCE();
      localObject2 = "Failed to send measurementEnabled to service";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject2 = this.zzaYU;
        localObject2 = ((zzac)localObject2).zzCg();
        localObject3 = this.zzaYU;
        localObject3 = ((zzac)localObject3).zzAo();
        localObject3 = ((zzp)localObject3).zzCL();
        localObject2 = ((zzn)localObject2).zzfe((String)localObject3);
        ((zzm)localObject1).zzb((AppMetadata)localObject2);
        localObject1 = this.zzaYU;
        zzac.zzd((zzac)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = this.zzaYU.zzAo().zzCE();
        Object localObject3 = "Failed to send measurementEnabled to AppMeasurementService";
        ((zzp.zza)localObject2).zzj((String)localObject3, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzac$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */