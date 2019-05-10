package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;

class zzx$2
  extends zzi
{
  zzx$2(zzx paramzzx, GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    Uri localUri = this.zzbds;
    paramzzbp.zza(this, localUri);
  }
  
  protected DataApi.DataItemResult zzbv(Status paramStatus)
  {
    zzx.zza localzza = new com/google/android/gms/wearable/internal/zzx$zza;
    localzza.<init>(paramStatus, null);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */