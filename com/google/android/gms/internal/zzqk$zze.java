package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzqk$zze
  extends zzqj
{
  private final zza.zzb zzamC;
  private final zzq zzbbi;
  
  zzqk$zze(zza.zzb paramzzb, zzq paramzzq)
  {
    Object localObject = (zza.zzb)zzx.zzz(paramzzb);
    this.zzamC = ((zza.zzb)localObject);
    localObject = (zzq)zzx.zzz(paramzzq);
    this.zzbbi = ((zzq)localObject);
  }
  
  public void onConnectionRequest(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    zzq localzzq = this.zzbbi;
    zzqk.zze.1 local1 = new com/google/android/gms/internal/zzqk$zze$1;
    local1.<init>(this, paramString1, paramString2, paramString3, paramArrayOfByte);
    localzzq.zza(local1);
  }
  
  public void zzm(int paramInt, String paramString)
  {
    zza.zzb localzzb = this.zzamC;
    zzqk.zzf localzzf = new com/google/android/gms/internal/zzqk$zzf;
    Status localStatus = new com/google/android/gms/common/api/Status;
    localStatus.<init>(paramInt);
    localzzf.<init>(localStatus, paramString);
    localzzb.zzs(localzzf);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */