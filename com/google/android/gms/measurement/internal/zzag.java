package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.measurement.AppMeasurementService;

public class zzag
  extends zzz
{
  private boolean zzRH;
  private final AlarmManager zzRI;
  
  protected zzag(zzw paramzzw)
  {
    super(paramzzw);
    AlarmManager localAlarmManager = (AlarmManager)getContext().getSystemService("alarm");
    this.zzRI = localAlarmManager;
  }
  
  private PendingIntent zzld()
  {
    Intent localIntent = new android/content/Intent;
    Context localContext = getContext();
    localIntent.<init>(localContext, AppMeasurementReceiver.class);
    localIntent.setAction("com.google.android.gms.measurement.UPLOAD");
    return PendingIntent.getBroadcast(getContext(), 0, localIntent, 0);
  }
  
  public void cancel()
  {
    zzjv();
    this.zzRH = false;
    AlarmManager localAlarmManager = this.zzRI;
    PendingIntent localPendingIntent = zzld();
    localAlarmManager.cancel(localPendingIntent);
  }
  
  protected void zziJ()
  {
    AlarmManager localAlarmManager = this.zzRI;
    PendingIntent localPendingIntent = zzld();
    localAlarmManager.cancel(localPendingIntent);
  }
  
  public void zzt(long paramLong)
  {
    boolean bool1 = true;
    zzjv();
    long l1 = 0L;
    boolean bool2 = paramLong < l1;
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      zzx.zzac(bool2);
      zzx.zza(AppMeasurementReceiver.zzY(getContext()), "Receiver not registered/enabled");
      zzx.zza(AppMeasurementService.zzZ(getContext()), "Service not registered/enabled");
      cancel();
      l1 = zzjl().elapsedRealtime() + paramLong;
      this.zzRH = bool1;
      AlarmManager localAlarmManager = this.zzRI;
      long l2 = Math.max(zzCp().zzBZ(), paramLong);
      PendingIntent localPendingIntent = zzld();
      localAlarmManager.setInexactRepeating(2, l1, l2, localPendingIntent);
      return;
      bool2 = false;
      localAlarmManager = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */