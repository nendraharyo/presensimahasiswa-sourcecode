package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

class zzac$4
  implements Runnable
{
  zzac$4(zzac paramzzac, String paramString, EventParcel paramEventParcel) {}
  
  public void run()
  {
    Object localObject1 = zzac.zzc(this.zzaYU);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = this.zzaYU.zzAo().zzCE();
      localObject2 = "Discarding data. Failed to send event to service";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
      return;
    }
    for (;;)
    {
      try
      {
        localObject2 = this.zzaHU;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool) {
          break label140;
        }
        localObject2 = this.zzaYz;
        localObject3 = this.zzaYU;
        localObject3 = ((zzac)localObject3).zzCg();
        localObject4 = this.zzaYU;
        localObject4 = ((zzac)localObject4).zzAo();
        localObject4 = ((zzp)localObject4).zzCL();
        localObject3 = ((zzn)localObject3).zzfe((String)localObject4);
        ((zzm)localObject1).zza((EventParcel)localObject2, (AppMetadata)localObject3);
        localObject1 = this.zzaYU;
        zzac.zzd((zzac)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        localObject2 = this.zzaYU.zzAo().zzCE();
        localObject3 = "Failed to send event to AppMeasurementService";
        ((zzp.zza)localObject2).zzj((String)localObject3, localRemoteException);
      }
      break;
      label140:
      localObject2 = this.zzaYz;
      Object localObject3 = this.zzaHU;
      Object localObject4 = this.zzaYU;
      localObject4 = ((zzac)localObject4).zzAo();
      localObject4 = ((zzp)localObject4).zzCL();
      localRemoteException.zza((EventParcel)localObject2, (String)localObject3, (String)localObject4);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzac$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */