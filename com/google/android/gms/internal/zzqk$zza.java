package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzqk$zza
  extends zzqk.zzb
{
  private final zza.zzb zzamC;
  
  public zzqk$zza(zza.zzb paramzzb, zzq paramzzq)
  {
    super(paramzzq);
    zza.zzb localzzb = (zza.zzb)zzx.zzz(paramzzb);
    this.zzamC = localzzb;
  }
  
  public void zziZ(int paramInt)
  {
    zza.zzb localzzb = this.zzamC;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt);
    localzzb.zzs(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */