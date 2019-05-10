package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzqk$zzg
  extends zzqj
{
  private final zza.zzb zzamC;
  private final zzq zzbbi;
  
  zzqk$zzg(zza.zzb paramzzb, zzq paramzzq)
  {
    Object localObject = (zza.zzb)zzx.zzz(paramzzb);
    this.zzamC = ((zza.zzb)localObject);
    localObject = (zzq)zzx.zzz(paramzzq);
    this.zzbbi = ((zzq)localObject);
  }
  
  public void onEndpointFound(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    zzq localzzq = this.zzbbi;
    zzqk.zzg.1 local1 = new com/google/android/gms/internal/zzqk$zzg$1;
    local1.<init>(this, paramString1, paramString2, paramString3, paramString4);
    localzzq.zza(local1);
  }
  
  public void onEndpointLost(String paramString)
  {
    zzq localzzq = this.zzbbi;
    zzqk.zzg.2 local2 = new com/google/android/gms/internal/zzqk$zzg$2;
    local2.<init>(this, paramString);
    localzzq.zza(local2);
  }
  
  public void zziW(int paramInt)
  {
    zza.zzb localzzb = this.zzamC;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt);
    localzzb.zzs(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */