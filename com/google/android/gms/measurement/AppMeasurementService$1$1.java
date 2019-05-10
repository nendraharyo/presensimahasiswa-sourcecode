package com.google.android.gms.measurement;

import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzp.zza;
import com.google.android.gms.measurement.internal.zzw;

class AppMeasurementService$1$1
  implements Runnable
{
  AppMeasurementService$1$1(AppMeasurementService.1 param1) {}
  
  public void run()
  {
    Object localObject1 = this.zzaTZ.zzaTY;
    Object localObject2 = this.zzaTZ;
    int i = ((AppMeasurementService.1)localObject2).zzOP;
    boolean bool = ((AppMeasurementService)localObject1).stopSelfResult(i);
    if (bool)
    {
      localObject1 = this.zzaTZ.zzaTW.zzCp();
      bool = ((zzd)localObject1).zzkr();
      if (!bool) {
        break label72;
      }
      localObject1 = this.zzaTZ.zzaTX.zzCK();
      localObject2 = "Device AppMeasurementService processed last upload request";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
    for (;;)
    {
      return;
      label72:
      localObject1 = this.zzaTZ.zzaTX.zzCK();
      localObject2 = "Local AppMeasurementService processed last upload request";
      ((zzp.zza)localObject1).zzfg((String)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\AppMeasurementService$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */