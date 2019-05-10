package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;

class zzx$6
  extends zzi
{
  zzx$6(zzx paramzzx, GoogleApiClient paramGoogleApiClient, Asset paramAsset)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    Asset localAsset = this.zzbss;
    paramzzbp.zza(this, localAsset);
  }
  
  protected DataApi.GetFdForAssetResult zzby(Status paramStatus)
  {
    zzx.zzc localzzc = new com/google/android/gms/wearable/internal/zzx$zzc;
    localzzc.<init>(paramStatus, null);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */