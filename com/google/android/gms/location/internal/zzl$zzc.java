package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationSettingsResult;

final class zzl$zzc
  extends zzj.zza
{
  private zza.zzb zzaON;
  
  public zzl$zzc(zza.zzb paramzzb)
  {
    if (paramzzb != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "listener can't be null.");
      this.zzaON = paramzzb;
      return;
    }
  }
  
  public void zza(LocationSettingsResult paramLocationSettingsResult)
  {
    this.zzaON.zzs(paramLocationSettingsResult);
    this.zzaON = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzl$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */