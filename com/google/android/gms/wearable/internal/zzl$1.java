package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;

class zzl$1
  extends zzi
{
  zzl$1(zzl paramzzl, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    String str1 = this.zzbrW;
    String str2 = this.zzAP;
    paramzzbp.zze(this, str1, str2);
  }
  
  public ChannelApi.OpenChannelResult zzbs(Status paramStatus)
  {
    zzl.zza localzza = new com/google/android/gms/wearable/internal/zzl$zza;
    localzza.<init>(paramStatus, null);
    return localzza;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */