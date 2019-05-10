package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class ChannelImpl$5
  extends zzi
{
  ChannelImpl$5(ChannelImpl paramChannelImpl, GoogleApiClient paramGoogleApiClient, Uri paramUri, boolean paramBoolean)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str = ChannelImpl.zza(this.zzbsd);
    Uri localUri = this.zzbds;
    boolean bool = this.zzbse;
    paramzzbp.zza(this, str, localUri, bool);
  }
  
  public Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelImpl$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */