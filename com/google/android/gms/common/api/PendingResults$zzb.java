package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzb;

final class PendingResults$zzb
  extends zzb
{
  private final Result zzagy;
  
  public PendingResults$zzb(GoogleApiClient paramGoogleApiClient, Result paramResult)
  {
    super(paramGoogleApiClient);
    this.zzagy = paramResult;
  }
  
  protected Result zzc(Status paramStatus)
  {
    return this.zzagy;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\PendingResults$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */