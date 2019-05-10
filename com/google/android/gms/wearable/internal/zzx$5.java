package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;

class zzx$5
  extends zzi
{
  zzx$5(zzx paramzzx, GoogleApiClient paramGoogleApiClient, Uri paramUri, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    Uri localUri = this.zzbds;
    int i = this.zzbsr;
    paramzzbp.zzb(this, localUri, i);
  }
  
  protected DataApi.DeleteDataItemsResult zzbx(Status paramStatus)
  {
    zzx.zzb localzzb = new com/google/android/gms/wearable/internal/zzx$zzb;
    localzzb.<init>(paramStatus, 0);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */