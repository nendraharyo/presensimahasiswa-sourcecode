package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzb;

final class PendingResults$zzc
  extends zzb
{
  public PendingResults$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected Result zzc(Status paramStatus)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Creating failed results is not supported");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\PendingResults$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */