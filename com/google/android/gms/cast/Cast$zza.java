package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

abstract class Cast$zza
  extends zzb
{
  public Cast$zza(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Cast.ApplicationConnectionResult zzo(Status paramStatus)
  {
    Cast.zza.1 local1 = new com/google/android/gms/cast/Cast$zza$1;
    local1.<init>(this, paramStatus);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */