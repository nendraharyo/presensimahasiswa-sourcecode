package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataEventBuffer;

final class zzbq$3
  implements zzq.zzb
{
  zzbq$3(DataHolder paramDataHolder) {}
  
  public void zza(DataApi.DataListener paramDataListener)
  {
    try
    {
      DataEventBuffer localDataEventBuffer = new com/google/android/gms/wearable/DataEventBuffer;
      DataHolder localDataHolder = this.zzbrr;
      localDataEventBuffer.<init>(localDataHolder);
      paramDataListener.onDataChanged(localDataEventBuffer);
      return;
    }
    finally
    {
      this.zzbrr.close();
    }
  }
  
  public void zzpr()
  {
    this.zzbrr.close();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbq$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */