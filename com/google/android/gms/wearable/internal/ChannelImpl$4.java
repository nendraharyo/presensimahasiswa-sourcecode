package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;

class ChannelImpl$4
  extends zzi
{
  ChannelImpl$4(ChannelImpl paramChannelImpl, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str = ChannelImpl.zza(this.zzbsd);
    paramzzbp.zzv(this, str);
  }
  
  public Channel.GetOutputStreamResult zzbu(Status paramStatus)
  {
    ChannelImpl.zzb localzzb = new com/google/android/gms/wearable/internal/ChannelImpl$zzb;
    localzzb.<init>(paramStatus, null);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelImpl$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */