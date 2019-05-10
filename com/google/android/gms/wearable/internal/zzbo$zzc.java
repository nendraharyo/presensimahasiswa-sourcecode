package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zzc
  extends zzbo.zzb
{
  public zzbo$zzc(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(CloseChannelResponse paramCloseChannelResponse)
  {
    Status localStatus = new com/google/android/gms/common/api/Status;
    int i = paramCloseChannelResponse.statusCode;
    localStatus.<init>(i);
    zzX(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */