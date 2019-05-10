package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;

public abstract class zzb
  extends zza.zza
{
  public zzb(GoogleApiClient paramGoogleApiClient)
  {
    super(localzzc, paramGoogleApiClient);
  }
  
  public void zzbj(int paramInt)
  {
    Object localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(paramInt);
    localObject = zzc((Status)localObject);
    zza((Result)localObject);
  }
  
  public void zze(int paramInt, String paramString)
  {
    Object localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(paramInt, paramString, null);
    localObject = zzc((Status)localObject);
    zza((Result)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */