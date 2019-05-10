package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzqk$zzd
  extends zzqk.zzb
{
  private final zza.zzb zzamC;
  private final zzq zzbbg;
  
  public zzqk$zzd(zza.zzb paramzzb, zzq paramzzq1, zzq paramzzq2)
  {
    super(paramzzq2);
    Object localObject = (zza.zzb)zzx.zzz(paramzzb);
    this.zzamC = ((zza.zzb)localObject);
    localObject = (zzq)zzx.zzz(paramzzq1);
    this.zzbbg = ((zzq)localObject);
  }
  
  public void zza(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    zzq localzzq = this.zzbbg;
    zzqk.zzd.1 local1 = new com/google/android/gms/internal/zzqk$zzd$1;
    local1.<init>(this, paramString, paramInt, paramArrayOfByte);
    localzzq.zza(local1);
  }
  
  public void zziY(int paramInt)
  {
    zza.zzb localzzb = this.zzamC;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt);
    localzzb.zzs(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */