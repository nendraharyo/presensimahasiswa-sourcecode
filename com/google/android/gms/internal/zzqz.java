package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public final class zzqz
  implements People
{
  public Person getCurrentPerson(GoogleApiClient paramGoogleApiClient)
  {
    return Plus.zzf(paramGoogleApiClient, true).zzFa();
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, Collection paramCollection)
  {
    zzqz.4 local4 = new com/google/android/gms/internal/zzqz$4;
    local4.<init>(this, paramGoogleApiClient, paramCollection);
    return paramGoogleApiClient.zza(local4);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, String... paramVarArgs)
  {
    zzqz.5 local5 = new com/google/android/gms/internal/zzqz$5;
    local5.<init>(this, paramGoogleApiClient, paramVarArgs);
    return paramGoogleApiClient.zza(local5);
  }
  
  public PendingResult loadConnected(GoogleApiClient paramGoogleApiClient)
  {
    zzqz.3 local3 = new com/google/android/gms/internal/zzqz$3;
    local3.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local3);
  }
  
  public PendingResult loadVisible(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString)
  {
    zzqz.1 local1 = new com/google/android/gms/internal/zzqz$1;
    local1.<init>(this, paramGoogleApiClient, paramInt, paramString);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult loadVisible(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzqz.2 local2 = new com/google/android/gms/internal/zzqz$2;
    local2.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */