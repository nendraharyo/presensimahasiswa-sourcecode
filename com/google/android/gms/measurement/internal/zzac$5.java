package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

class zzac$5
  implements Runnable
{
  zzac$5(zzac paramzzac, UserAttributeParcel paramUserAttributeParcel) {}
  
  public void run()
  {
    Object localObject1 = zzac.zzc(this.zzaYU);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = this.zzaYU.zzAo().zzCE();
      localObject2 = "Discarding data. Failed to set user attribute";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      return;
      try
      {
        localObject2 = this.zzaYB;
        localObject3 = this.zzaYU;
        localObject3 = ((zzac)localObject3).zzCg();
        Object localObject4 = this.zzaYU;
        localObject4 = ((zzac)localObject4).zzAo();
        localObject4 = ((zzp)localObject4).zzCL();
        localObject3 = ((zzn)localObject3).zzfe((String)localObject4);
        ((zzm)localObject1).zza((UserAttributeParcel)localObject2, (AppMetadata)localObject3);
        localObject1 = this.zzaYU;
        zzac.zzd((zzac)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = this.zzaYU.zzAo().zzCE();
        Object localObject3 = "Failed to send attribute to AppMeasurementService";
        ((zzp.zza)localObject2).zzj((String)localObject3, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzac$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */