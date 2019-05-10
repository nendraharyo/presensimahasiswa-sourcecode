package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.SubscribeOptions;

class zzn$6
  extends zzn.zza
{
  zzn$6(zzn paramzzn, GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzm paramzzm)
  {
    PendingIntent localPendingIntent = this.zzaAp;
    SubscribeOptions localSubscribeOptions = this.zzbcR;
    paramzzm.zza(this, localPendingIntent, localSubscribeOptions);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzn$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */