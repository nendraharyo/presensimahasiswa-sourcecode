package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.zzq;

class zzm$zzc
  extends zzd.zza
  implements zzm.zza
{
  private final zzq zzbbi;
  
  private zzm$zzc(zzq paramzzq)
  {
    this.zzbbi = paramzzq;
  }
  
  public zzq zzEE()
  {
    return this.zzbbi;
  }
  
  public void zza(MessageWrapper paramMessageWrapper)
  {
    zzq localzzq = this.zzbbi;
    zzm.zzc.1 local1 = new com/google/android/gms/nearby/messages/internal/zzm$zzc$1;
    local1.<init>(this, paramMessageWrapper);
    localzzq.zza(local1);
  }
  
  public void zza(MessageWrapper[] paramArrayOfMessageWrapper)
  {
    zzq localzzq = this.zzbbi;
    zzm.zzc.2 local2 = new com/google/android/gms/nearby/messages/internal/zzm$zzc$2;
    local2.<init>(this, paramArrayOfMessageWrapper);
    localzzq.zza(local2);
  }
  
  public void zzb(MessageWrapper paramMessageWrapper)
  {
    zzq localzzq = this.zzbbi;
    zzm.zzc.3 local3 = new com/google/android/gms/nearby/messages/internal/zzm$zzc$3;
    local3.<init>(this, paramMessageWrapper);
    localzzq.zza(local3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */