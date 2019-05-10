package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

class WearableListenerService$zza$9
  implements Runnable
{
  WearableListenerService$zza$9(WearableListenerService.zza paramzza, ChannelEventParcelable paramChannelEventParcelable) {}
  
  public void run()
  {
    ChannelEventParcelable localChannelEventParcelable = this.zzbrz;
    WearableListenerService localWearableListenerService = this.zzbrs.zzbrq;
    localChannelEventParcelable.zza(localWearableListenerService);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableListenerService$zza$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */