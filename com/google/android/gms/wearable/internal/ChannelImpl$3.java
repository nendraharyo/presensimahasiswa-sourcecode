package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;

class ChannelImpl$3
  extends zzi
{
  ChannelImpl$3(ChannelImpl paramChannelImpl, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str = ChannelImpl.zza(this.zzbsd);
    paramzzbp.zzu(this, str);
  }
  
  public Channel.GetInputStreamResult zzbt(Status paramStatus)
  {
    ChannelImpl.zza localzza = new com/google/android/gms/wearable/internal/ChannelImpl$zza;
    localzza.<init>(paramStatus, null);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelImpl$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */