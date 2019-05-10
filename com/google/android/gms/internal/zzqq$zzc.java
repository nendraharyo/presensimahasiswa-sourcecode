package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zza.zza;

abstract class zzqq$zzc
  extends zza.zza
{
  protected zzqq$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(localzzc, paramGoogleApiClient);
  }
  
  protected abstract void zza(Context paramContext, zzqp paramzzqp);
  
  protected final void zza(zzqr paramzzqr)
  {
    Context localContext = paramzzqr.getContext();
    zzqp localzzqp = (zzqp)paramzzqr.zzqJ();
    zza(localContext, localzzqp);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqq$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */