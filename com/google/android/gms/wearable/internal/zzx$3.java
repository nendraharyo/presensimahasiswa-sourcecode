package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

class zzx$3
  extends zzi
{
  zzx$3(zzx paramzzx, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzr(this);
  }
  
  protected DataItemBuffer zzbw(Status paramStatus)
  {
    DataItemBuffer localDataItemBuffer = new com/google/android/gms/wearable/DataItemBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(paramStatus.getStatusCode());
    localDataItemBuffer.<init>(localDataHolder);
    return localDataItemBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */