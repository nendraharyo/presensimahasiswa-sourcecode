package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItemAsset;

class zzx$7
  extends zzi
{
  zzx$7(zzx paramzzx, GoogleApiClient paramGoogleApiClient, DataItemAsset paramDataItemAsset)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    DataItemAsset localDataItemAsset = this.zzbst;
    paramzzbp.zza(this, localDataItemAsset);
  }
  
  protected DataApi.GetFdForAssetResult zzby(Status paramStatus)
  {
    zzx.zzc localzzc = new com/google/android/gms/wearable/internal/zzx$zzc;
    localzzc.<init>(paramStatus, null);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */