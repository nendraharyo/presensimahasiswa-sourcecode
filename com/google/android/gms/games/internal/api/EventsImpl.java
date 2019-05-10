package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl
  implements Events
{
  public void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    Object localObject = Games.zzc(paramGoogleApiClient, false);
    if (localObject == null) {}
    for (;;)
    {
      return;
      boolean bool = ((GamesClientImpl)localObject).isConnected();
      if (bool)
      {
        ((GamesClientImpl)localObject).zzp(paramString, paramInt);
      }
      else
      {
        localObject = new com/google/android/gms/games/internal/api/EventsImpl$3;
        ((EventsImpl.3)localObject).<init>(this, paramGoogleApiClient, paramString, paramInt);
        paramGoogleApiClient.zzb((zza.zza)localObject);
      }
    }
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    EventsImpl.2 local2 = new com/google/android/gms/games/internal/api/EventsImpl$2;
    local2.<init>(this, paramGoogleApiClient, paramBoolean);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult loadByIds(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, String... paramVarArgs)
  {
    EventsImpl.1 local1 = new com/google/android/gms/games/internal/api/EventsImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramBoolean, paramVarArgs);
    return paramGoogleApiClient.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\EventsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */