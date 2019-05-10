package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzbo$zzt
  extends zzbo.zzb
{
  public zzbo$zzt(zza.zzb paramzzb)
  {
    super(paramzzb);
  }
  
  public void zza(SendMessageResponse paramSendMessageResponse)
  {
    zzaz.zzb localzzb = new com/google/android/gms/wearable/internal/zzaz$zzb;
    Status localStatus = zzbk.zzgc(paramSendMessageResponse.statusCode);
    int i = paramSendMessageResponse.zzaNj;
    localzzb.<init>(localStatus, i);
    zzX(localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */