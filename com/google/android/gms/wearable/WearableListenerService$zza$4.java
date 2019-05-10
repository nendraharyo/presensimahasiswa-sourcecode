package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.NodeParcelable;

class WearableListenerService$zza$4
  implements Runnable
{
  WearableListenerService$zza$4(WearableListenerService.zza paramzza, NodeParcelable paramNodeParcelable) {}
  
  public void run()
  {
    WearableListenerService localWearableListenerService = this.zzbrs.zzbrq;
    NodeParcelable localNodeParcelable = this.zzbru;
    localWearableListenerService.onPeerDisconnected(localNodeParcelable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableListenerService$zza$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */