package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;

class zzj$3
  extends zzi
{
  zzj$3(zzj paramzzj, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str = this.zzbrM;
    paramzzbp.zzr(this, str);
  }
  
  protected CapabilityApi.AddLocalCapabilityResult zzbq(Status paramStatus)
  {
    zzj.zza localzza = new com/google/android/gms/wearable/internal/zzj$zza;
    localzza.<init>(paramStatus);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */