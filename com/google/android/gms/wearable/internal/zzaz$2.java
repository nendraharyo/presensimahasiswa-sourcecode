package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi.MessageListener;

class zzaz$2
  extends zzi
{
  zzaz$2(zzaz paramzzaz, GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    MessageApi.MessageListener localMessageListener = this.zzbsR;
    paramzzbp.zza(this, localMessageListener);
  }
  
  public Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzaz$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */