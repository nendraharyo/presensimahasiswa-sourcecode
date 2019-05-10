package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;

abstract class zzoe$zzc
  extends zzoe.zza
{
  zzoe$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected Status zzb(Status paramStatus)
  {
    boolean bool = paramStatus.isSuccess();
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      zzx.zzac(bool);
      return paramStatus;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzoe$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */