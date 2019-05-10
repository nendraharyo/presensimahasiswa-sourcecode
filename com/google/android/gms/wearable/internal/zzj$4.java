package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult;

class zzj$4
  extends zzi
{
  zzj$4(zzj paramzzj, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str = this.zzbrM;
    paramzzbp.zzs(this, str);
  }
  
  protected CapabilityApi.RemoveLocalCapabilityResult zzbr(Status paramStatus)
  {
    zzj.zza localzza = new com/google/android/gms/wearable/internal/zzj$zza;
    localzza.<init>(paramStatus);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */