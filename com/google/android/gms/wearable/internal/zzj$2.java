package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;

class zzj$2
  extends zzi
{
  zzj$2(zzj paramzzj, GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    int i = this.zzbrN;
    paramzzbp.zzb(this, i);
  }
  
  protected CapabilityApi.GetAllCapabilitiesResult zzbp(Status paramStatus)
  {
    zzj.zzd localzzd = new com/google/android/gms/wearable/internal/zzj$zzd;
    localzzd.<init>(paramStatus, null);
    return localzzd;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */