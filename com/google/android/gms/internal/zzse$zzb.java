package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzse$zzb
  extends zzse.zza
{
  private final zza.zzb zzamC;
  
  public zzse$zzb(zza.zzb paramzzb)
  {
    super(null);
    this.zzamC = paramzzb;
  }
  
  public void zza(Status paramStatus, boolean paramBoolean, Bundle paramBundle)
  {
    zza.zzb localzzb = this.zzamC;
    BooleanResult localBooleanResult = new com/google/android/gms/common/api/BooleanResult;
    localBooleanResult.<init>(paramStatus, paramBoolean);
    localzzb.zzs(localBooleanResult);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzse$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */