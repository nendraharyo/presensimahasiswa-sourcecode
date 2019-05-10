package com.google.android.gms.wearable;

import java.util.List;

class WearableListenerService$zza$5
  implements Runnable
{
  WearableListenerService$zza$5(WearableListenerService.zza paramzza, List paramList) {}
  
  public void run()
  {
    WearableListenerService localWearableListenerService = this.zzbrs.zzbrq;
    List localList = this.zzbrv;
    localWearableListenerService.onConnectedNodes(localList);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableListenerService$zza$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */