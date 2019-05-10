package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.zzq;

class zzqk$zzb
  extends zzqj
{
  private final zzq zzbbb;
  
  zzqk$zzb(zzq paramzzq)
  {
    this.zzbbb = paramzzq;
  }
  
  public void onDisconnected(String paramString)
  {
    zzq localzzq = this.zzbbb;
    zzqk.zzb.2 local2 = new com/google/android/gms/internal/zzqk$zzb$2;
    local2.<init>(this, paramString);
    localzzq.zza(local2);
  }
  
  public void onMessageReceived(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    zzq localzzq = this.zzbbb;
    zzqk.zzb.1 local1 = new com/google/android/gms/internal/zzqk$zzb$1;
    local1.<init>(this, paramString, paramArrayOfByte, paramBoolean);
    localzzq.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */