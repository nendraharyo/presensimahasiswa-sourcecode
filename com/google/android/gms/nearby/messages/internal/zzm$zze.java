package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.zzq;

class zzm$zze
  extends zzh.zza
  implements zzm.zza
{
  private final zzq zzbcH;
  
  private zzm$zze(zzq paramzzq)
  {
    this.zzbcH = paramzzq;
  }
  
  public void onPermissionChanged(boolean paramBoolean)
  {
    zzq localzzq = this.zzbcH;
    zzm.zze.1 local1 = new com/google/android/gms/nearby/messages/internal/zzm$zze$1;
    local1.<init>(this, paramBoolean);
    localzzq.zza(local1);
  }
  
  public zzq zzEE()
  {
    return this.zzbcH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */