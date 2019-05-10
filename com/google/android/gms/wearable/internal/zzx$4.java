package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

class zzx$4
  extends zzi
{
  zzx$4(zzx paramzzx, GoogleApiClient paramGoogleApiClient, Uri paramUri, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    Uri localUri = this.zzbds;
    int i = this.zzbsr;
    paramzzbp.zza(this, localUri, i);
  }
  
  protected DataItemBuffer zzbw(Status paramStatus)
  {
    DataItemBuffer localDataItemBuffer = new com/google/android/gms/wearable/DataItemBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(paramStatus.getStatusCode());
    localDataItemBuffer.<init>(localDataHolder);
    return localDataItemBuffer;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */