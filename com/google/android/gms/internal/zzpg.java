package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import java.util.concurrent.TimeUnit;

public class zzpg
  implements SessionsApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    zzpg.2 local2 = new com/google/android/gms/internal/zzpg$2;
    local2.<init>(this, paramGoogleApiClient, paramString1, paramString2);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult insertSession(GoogleApiClient paramGoogleApiClient, SessionInsertRequest paramSessionInsertRequest)
  {
    zzpg.3 local3 = new com/google/android/gms/internal/zzpg$3;
    local3.<init>(this, paramGoogleApiClient, paramSessionInsertRequest);
    return paramGoogleApiClient.zza(local3);
  }
  
  public PendingResult readSession(GoogleApiClient paramGoogleApiClient, SessionReadRequest paramSessionReadRequest)
  {
    zzpg.4 local4 = new com/google/android/gms/internal/zzpg$4;
    local4.<init>(this, paramGoogleApiClient, paramSessionReadRequest);
    return paramGoogleApiClient.zza(local4);
  }
  
  public PendingResult registerForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return zza(paramGoogleApiClient, paramPendingIntent, 0);
  }
  
  public PendingResult startSession(GoogleApiClient paramGoogleApiClient, Session paramSession)
  {
    zzx.zzb(paramSession, "Session cannot be null");
    Object localObject = TimeUnit.MILLISECONDS;
    long l1 = paramSession.getEndTime((TimeUnit)localObject);
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "Cannot start a session which has already ended");
      localObject = new com/google/android/gms/internal/zzpg$1;
      ((zzpg.1)localObject).<init>(this, paramGoogleApiClient, paramSession);
      return paramGoogleApiClient.zzb((zza.zza)localObject);
      bool = false;
      localObject = null;
    }
  }
  
  public PendingResult stopSession(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return zza(paramGoogleApiClient, null, paramString);
  }
  
  public PendingResult unregisterForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    zzpg.6 local6 = new com/google/android/gms/internal/zzpg$6;
    local6.<init>(this, paramGoogleApiClient, paramPendingIntent);
    return paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, int paramInt)
  {
    zzpg.5 local5 = new com/google/android/gms/internal/zzpg$5;
    local5.<init>(this, paramGoogleApiClient, paramPendingIntent, paramInt);
    return paramGoogleApiClient.zzb(local5);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */