package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.model.moments.Moment;

public final class zzqy
  implements Moments
{
  public PendingResult load(GoogleApiClient paramGoogleApiClient)
  {
    zzqy.1 local1 = new com/google/android/gms/internal/zzqy$1;
    local1.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    zzqy.2 local2 = new com/google/android/gms/internal/zzqy$2;
    local2.<init>(this, paramGoogleApiClient, paramInt, paramString1, paramUri, paramString2, paramString3);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult remove(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzqy.4 local4 = new com/google/android/gms/internal/zzqy$4;
    local4.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public PendingResult write(GoogleApiClient paramGoogleApiClient, Moment paramMoment)
  {
    zzqy.3 local3 = new com/google/android/gms/internal/zzqy$3;
    local3.<init>(this, paramGoogleApiClient, paramMoment);
    return paramGoogleApiClient.zzb(local3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */