package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataListener;

class zzx$9
  extends zzi
{
  zzx$9(zzx paramzzx, GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    DataApi.DataListener localDataListener = this.zzbsu;
    paramzzbp.zza(this, localDataListener);
  }
  
  public Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */