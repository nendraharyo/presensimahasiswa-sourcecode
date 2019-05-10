package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

public class zzbu
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzbu(zza.zzb paramzzb)
  {
    this.zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    this.zzamC.zzs(paramStatus);
  }
  
  public void onSuccess()
  {
    zza.zzb localzzb = this.zzamC;
    Status localStatus = Status.zzagC;
    localzzb.zzs(localStatus);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */