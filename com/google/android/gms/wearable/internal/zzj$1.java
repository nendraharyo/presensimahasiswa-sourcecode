package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;

class zzj$1
  extends zzi
{
  zzj$1(zzj paramzzj, GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str = this.zzbrM;
    int i = this.zzbrN;
    paramzzbp.zzg(this, str, i);
  }
  
  protected CapabilityApi.GetCapabilityResult zzbo(Status paramStatus)
  {
    zzj.zze localzze = new com/google/android/gms/wearable/internal/zzj$zze;
    localzze.<init>(paramStatus, null);
    return localzze;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */