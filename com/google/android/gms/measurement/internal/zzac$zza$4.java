package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurementService;

class zzac$zza$4
  implements Runnable
{
  zzac$zza$4(zzac.zza paramzza) {}
  
  public void run()
  {
    zzac localzzac = this.zzaYY.zzaYU;
    ComponentName localComponentName = new android/content/ComponentName;
    Context localContext = this.zzaYY.zzaYU.getContext();
    localComponentName.<init>(localContext, AppMeasurementService.class);
    zzac.zza(localzzac, localComponentName);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzac$zza$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */