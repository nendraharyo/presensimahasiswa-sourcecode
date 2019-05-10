package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;

final class zzl$zza
  implements ChannelApi.OpenChannelResult
{
  private final Status zzUX;
  private final Channel zzbrY;
  
  zzl$zza(Status paramStatus, Channel paramChannel)
  {
    Status localStatus = (Status)zzx.zzz(paramStatus);
    this.zzUX = localStatus;
    this.zzbrY = paramChannel;
  }
  
  public Channel getChannel()
  {
    return this.zzbrY;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzl$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */