package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

public final class zzl
  implements ChannelApi
{
  private static zzb.zza zza(IntentFilter[] paramArrayOfIntentFilter)
  {
    zzl.2 local2 = new com/google/android/gms/wearable/internal/zzl$2;
    local2.<init>(paramArrayOfIntentFilter);
    return local2;
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramChannelListener, "listener is null");
    Object localObject = new IntentFilter[1];
    IntentFilter localIntentFilter = zzbn.zzgM("com.google.android.gms.wearable.CHANNEL_EVENT");
    localObject[0] = localIntentFilter;
    localObject = zza((IntentFilter[])localObject);
    return zzb.zza(paramGoogleApiClient, (zzb.zza)localObject, paramChannelListener);
  }
  
  public PendingResult openChannel(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramString1, "nodeId is null");
    zzx.zzb(paramString2, "path is null");
    zzl.1 local1 = new com/google/android/gms/wearable/internal/zzl$1;
    local1.<init>(this, paramGoogleApiClient, paramString1, paramString2);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult removeListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramChannelListener, "listener is null");
    zzl.zzb localzzb = new com/google/android/gms/wearable/internal/zzl$zzb;
    localzzb.<init>(paramGoogleApiClient, paramChannelListener, null);
    return paramGoogleApiClient.zza(localzzb);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */