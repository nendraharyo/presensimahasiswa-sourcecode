package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.NodeListener;

public final class zzbb
  implements NodeApi
{
  private static zzb.zza zza(IntentFilter[] paramArrayOfIntentFilter)
  {
    zzbb.3 local3 = new com/google/android/gms/wearable/internal/zzbb$3;
    local3.<init>(paramArrayOfIntentFilter);
    return local3;
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener)
  {
    Object localObject = new IntentFilter[1];
    IntentFilter localIntentFilter = zzbn.zzgM("com.google.android.gms.wearable.NODE_CHANGED");
    localObject[0] = localIntentFilter;
    localObject = zza((IntentFilter[])localObject);
    return zzb.zza(paramGoogleApiClient, (zzb.zza)localObject, paramNodeListener);
  }
  
  public PendingResult getConnectedNodes(GoogleApiClient paramGoogleApiClient)
  {
    zzbb.2 local2 = new com/google/android/gms/wearable/internal/zzbb$2;
    local2.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult getLocalNode(GoogleApiClient paramGoogleApiClient)
  {
    zzbb.1 local1 = new com/google/android/gms/wearable/internal/zzbb$1;
    local1.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult removeListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener)
  {
    zzbb.4 local4 = new com/google/android/gms/wearable/internal/zzbb$4;
    local4.<init>(this, paramGoogleApiClient, paramNodeListener);
    return paramGoogleApiClient.zza(local4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */