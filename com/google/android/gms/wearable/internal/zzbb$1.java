package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;

class zzbb$1
  extends zzi
{
  zzbb$1(zzbb paramzzbb, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzs(this);
  }
  
  protected NodeApi.GetLocalNodeResult zzbA(Status paramStatus)
  {
    zzbb.zzb localzzb = new com/google/android/gms/wearable/internal/zzbb$zzb;
    localzzb.<init>(paramStatus, null);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */