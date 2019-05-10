package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzs$5
  extends zzt
{
  zzs$5(zzs paramzzs, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected BooleanResult zzA(Status paramStatus)
  {
    BooleanResult localBooleanResult = new com/google/android/gms/common/api/BooleanResult;
    localBooleanResult.<init>(paramStatus, false);
    return localBooleanResult;
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    zzs.5.1 local1 = new com/google/android/gms/drive/internal/zzs$5$1;
    local1.<init>(this, this);
    localzzam.zze(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */