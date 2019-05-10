package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;

public class zzoc
  extends zzny
{
  public zzoc(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 61, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf);
  }
  
  protected zzon zzbx(IBinder paramIBinder)
  {
    return zzon.zza.zzbI(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.fitness.InternalApi";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.fitness.internal.IGoogleFitInternalApi";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzoc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */