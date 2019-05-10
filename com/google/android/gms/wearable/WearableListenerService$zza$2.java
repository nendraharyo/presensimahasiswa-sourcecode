package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

class WearableListenerService$zza$2
  implements Runnable
{
  WearableListenerService$zza$2(WearableListenerService.zza paramzza, MessageEventParcelable paramMessageEventParcelable) {}
  
  public void run()
  {
    WearableListenerService localWearableListenerService = this.zzbrs.zzbrq;
    MessageEventParcelable localMessageEventParcelable = this.zzbrt;
    localWearableListenerService.onMessageReceived(localMessageEventParcelable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableListenerService$zza$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */