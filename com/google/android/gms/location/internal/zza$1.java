package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zza$1
  extends zza.zza
{
  zza$1(zza paramzza, GoogleApiClient paramGoogleApiClient, long paramLong, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    long l = this.zzaOp;
    PendingIntent localPendingIntent = this.zzaOq;
    paramzzl.zza(l, localPendingIntent);
    Status localStatus = Status.zzagC;
    zza(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */