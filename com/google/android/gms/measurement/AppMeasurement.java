package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzw;

public class AppMeasurement
{
  private final zzw zzaTV;
  
  public AppMeasurement(zzw paramzzw)
  {
    zzx.zzz(paramzzw);
    this.zzaTV = paramzzw;
  }
  
  public static AppMeasurement getInstance(Context paramContext)
  {
    return zzw.zzaT(paramContext).zzCV();
  }
  
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    this.zzaTV.zzCf().setMeasurementEnabled(paramBoolean);
  }
  
  public void zzd(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    this.zzaTV.zzCf().zze(paramString1, paramString2, paramBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\AppMeasurement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */