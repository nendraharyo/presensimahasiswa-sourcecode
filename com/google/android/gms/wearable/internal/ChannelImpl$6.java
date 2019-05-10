package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class ChannelImpl$6
  extends zzi
{
  ChannelImpl$6(ChannelImpl paramChannelImpl, GoogleApiClient paramGoogleApiClient, Uri paramUri, long paramLong1, long paramLong2)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str = ChannelImpl.zza(this.zzbsd);
    Uri localUri = this.zzbds;
    long l1 = this.zzbsf;
    long l2 = this.zzbsg;
    paramzzbp.zza(this, str, localUri, l1, l2);
  }
  
  public Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelImpl$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */