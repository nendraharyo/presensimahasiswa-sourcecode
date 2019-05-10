package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzp
  extends zze.zza
{
  private final zza.zzb zzbcS;
  
  private zzp(zza.zzb paramzzb)
  {
    this.zzbcS = paramzzb;
  }
  
  static zzp zzn(zza.zzb paramzzb)
  {
    zzp localzzp = new com/google/android/gms/nearby/messages/internal/zzp;
    localzzp.<init>(paramzzb);
    return localzzp;
  }
  
  public void zzbb(Status paramStatus)
  {
    this.zzbcS.zzs(paramStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */