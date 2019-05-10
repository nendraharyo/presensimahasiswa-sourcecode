package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

class WearableListenerService$zza$1
  implements Runnable
{
  WearableListenerService$zza$1(WearableListenerService.zza paramzza, DataHolder paramDataHolder) {}
  
  public void run()
  {
    DataEventBuffer localDataEventBuffer = new com/google/android/gms/wearable/DataEventBuffer;
    Object localObject1 = this.zzbrr;
    localDataEventBuffer.<init>((DataHolder)localObject1);
    try
    {
      localObject1 = this.zzbrs;
      localObject1 = ((WearableListenerService.zza)localObject1).zzbrq;
      ((WearableListenerService)localObject1).onDataChanged(localDataEventBuffer);
      return;
    }
    finally
    {
      localDataEventBuffer.release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\WearableListenerService$zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */