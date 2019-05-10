package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.zzb;

final class PendingResults$zza
  extends zzb
{
  private final Result zzagx;
  
  public PendingResults$zza(Result paramResult)
  {
    super(localLooper);
    this.zzagx = paramResult;
  }
  
  protected Result zzc(Status paramStatus)
  {
    int i = paramStatus.getStatusCode();
    Status localStatus = this.zzagx.getStatus();
    int j = localStatus.getStatusCode();
    if (i != j)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("Creating failed results is not supported");
      throw localUnsupportedOperationException;
    }
    return this.zzagx;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\PendingResults$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */