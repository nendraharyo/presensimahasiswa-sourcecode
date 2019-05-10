package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.wearable.NodeApi.NodeListener;

final class zzbq$6
  implements zzq.zzb
{
  zzbq$6(NodeParcelable paramNodeParcelable) {}
  
  public void zza(NodeApi.NodeListener paramNodeListener)
  {
    NodeParcelable localNodeParcelable = this.zzbru;
    paramNodeListener.onPeerDisconnected(localNodeParcelable);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbq$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */