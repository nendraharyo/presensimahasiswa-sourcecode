package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.PublishOptions;

class zzn$3
  extends zzn.zza
{
  zzn$3(zzn paramzzn, GoogleApiClient paramGoogleApiClient, Message paramMessage, PublishOptions paramPublishOptions)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzm paramzzm)
  {
    MessageWrapper localMessageWrapper = MessageWrapper.zzb(this.zzbcO);
    PublishOptions localPublishOptions = this.zzbcP;
    paramzzm.zza(this, localMessageWrapper, localPublishOptions);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzn$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */