package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzlw
  extends zzj
{
  public zzlw(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 40, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public void zza(zzlx paramzzlx, LogEventParcelable paramLogEventParcelable)
  {
    ((zzly)zzqJ()).zza(paramzzlx, paramLogEventParcelable);
  }
  
  protected zzly zzaK(IBinder paramIBinder)
  {
    return zzly.zza.zzaM(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.clearcut.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */