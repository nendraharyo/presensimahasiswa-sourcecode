package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.safetynet.SafetyNetApi;
import java.util.List;

public class zzre
  implements SafetyNetApi
{
  public PendingResult attest(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte)
  {
    zzre.1 local1 = new com/google/android/gms/internal/zzre$1;
    local1.<init>(this, paramGoogleApiClient, paramArrayOfByte);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult lookupUri(GoogleApiClient paramGoogleApiClient, List paramList, String paramString)
  {
    if (paramList == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Null threatTypes in lookupUri");
      throw ((Throwable)localObject);
    }
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Null or empty uri in lookupUri");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/internal/zzre$2;
    ((zzre.2)localObject).<init>(this, paramGoogleApiClient, paramList, paramString);
    return paramGoogleApiClient.zza((zza.zza)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzre.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */