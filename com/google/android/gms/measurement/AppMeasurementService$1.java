package com.google.android.gms.measurement;

import android.os.Handler;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzw;

class AppMeasurementService$1
  implements Runnable
{
  AppMeasurementService$1(AppMeasurementService paramAppMeasurementService, zzw paramzzw, int paramInt, zzp paramzzp) {}
  
  public void run()
  {
    this.zzaTW.zzDc();
    Handler localHandler = AppMeasurementService.zza(this.zzaTY);
    AppMeasurementService.1.1 local1 = new com/google/android/gms/measurement/AppMeasurementService$1$1;
    local1.<init>(this);
    localHandler.post(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\AppMeasurementService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */