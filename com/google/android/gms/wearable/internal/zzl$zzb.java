package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

final class zzl$zzb
  extends zzi
{
  private final String zzVo;
  private ChannelApi.ChannelListener zzbrZ;
  
  zzl$zzb(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener, String paramString)
  {
    super(paramGoogleApiClient);
    ChannelApi.ChannelListener localChannelListener = (ChannelApi.ChannelListener)zzx.zzz(paramChannelListener);
    this.zzbrZ = localChannelListener;
    this.zzVo = paramString;
  }
  
  protected void zza(zzbp paramzzbp)
  {
    ChannelApi.ChannelListener localChannelListener = this.zzbrZ;
    String str = this.zzVo;
    paramzzbp.zza(this, localChannelListener, str);
    this.zzbrZ = null;
  }
  
  public Status zzb(Status paramStatus)
  {
    this.zzbrZ = null;
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzl$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */