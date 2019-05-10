package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zzp
  extends zzbo.zzb
{
  public zzbo$zzp(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(OpenChannelResponse paramOpenChannelResponse)
  {
    zzl.zza localzza = new com/google/android/gms/wearable/internal/zzl$zza;
    Status localStatus = zzbk.zzgc(paramOpenChannelResponse.statusCode);
    ChannelImpl localChannelImpl = paramOpenChannelResponse.zzbsc;
    localzza.<init>(localStatus, localChannelImpl);
    zzX(localzza);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */