package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.PutDataRequest;

class zzx$1
  extends zzi
{
  zzx$1(zzx paramzzx, GoogleApiClient paramGoogleApiClient, PutDataRequest paramPutDataRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    PutDataRequest localPutDataRequest = this.zzbsp;
    paramzzbp.zza(this, localPutDataRequest);
  }
  
  public DataApi.DataItemResult zzbv(Status paramStatus)
  {
    zzx.zza localzza = new com/google/android/gms/wearable/internal/zzx$zza;
    localzza.<init>(paramStatus, null);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */