package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.SubscribeOptions;

class zzn$5
  extends zzn.zza
{
  zzn$5(zzn paramzzn, GoogleApiClient paramGoogleApiClient, zzq paramzzq, MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzm paramzzm)
  {
    zzq localzzq = this.zzbbv;
    MessageListener localMessageListener = this.zzbcQ;
    SubscribeOptions localSubscribeOptions = this.zzbcR;
    paramzzm.zza(this, localzzq, localMessageListener, localSubscribeOptions, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzn$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */