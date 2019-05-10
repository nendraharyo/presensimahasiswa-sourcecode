package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi.NodeListener;

class zzbb$4
  extends zzi
{
  zzbb$4(zzbb paramzzbb, GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    NodeApi.NodeListener localNodeListener = this.zzbsV;
    paramzzbp.zza(this, localNodeListener);
  }
  
  public Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbb$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */