package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;

class WearableListenerService$zza$6
  implements Runnable
{
  WearableListenerService$zza$6(WearableListenerService.zza paramzza, CapabilityInfoParcelable paramCapabilityInfoParcelable) {}
  
  public void run()
  {
    WearableListenerService localWearableListenerService = this.zzbrs.zzbrq;
    CapabilityInfoParcelable localCapabilityInfoParcelable = this.zzbrw;
    localWearableListenerService.onCapabilityChanged(localCapabilityInfoParcelable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableListenerService$zza$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */