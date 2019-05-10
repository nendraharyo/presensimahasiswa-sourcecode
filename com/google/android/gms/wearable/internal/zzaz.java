package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageApi.MessageListener;

public final class zzaz
  implements MessageApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzq localzzq = paramGoogleApiClient.zzr(paramMessageListener);
    zzaz.zza localzza = new com/google/android/gms/wearable/internal/zzaz$zza;
    localzza.<init>(paramGoogleApiClient, paramMessageListener, localzzq, paramArrayOfIntentFilter, null);
    return paramGoogleApiClient.zza(localzza);
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener)
  {
    IntentFilter[] arrayOfIntentFilter = new IntentFilter[1];
    IntentFilter localIntentFilter = zzbn.zzgM("com.google.android.gms.wearable.MESSAGE_RECEIVED");
    arrayOfIntentFilter[0] = localIntentFilter;
    return zza(paramGoogleApiClient, paramMessageListener, arrayOfIntentFilter);
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener, Uri paramUri, int paramInt)
  {
    int i = 1;
    int k;
    if (paramUri != null)
    {
      int j = i;
      String str = "uri must not be null";
      zzx.zzb(j, str);
      if ((paramInt != 0) && (paramInt != i)) {
        break label86;
      }
      k = i;
    }
    for (;;)
    {
      zzx.zzb(k, "invalid filter type");
      IntentFilter localIntentFilter = zzbn.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED", paramUri, paramInt);
      IntentFilter[] arrayOfIntentFilter = new IntentFilter[i];
      arrayOfIntentFilter[0] = localIntentFilter;
      return zza(paramGoogleApiClient, paramMessageListener, arrayOfIntentFilter);
      int m = 0;
      localIntentFilter = null;
      break;
      label86:
      m = 0;
      localIntentFilter = null;
    }
  }
  
  public PendingResult removeListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener)
  {
    zzaz.2 local2 = new com/google/android/gms/wearable/internal/zzaz$2;
    local2.<init>(this, paramGoogleApiClient, paramMessageListener);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult sendMessage(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    zzaz.1 local1 = new com/google/android/gms/wearable/internal/zzaz$1;
    local1.<init>(this, paramGoogleApiClient, paramString1, paramString2, paramArrayOfByte);
    return paramGoogleApiClient.zza(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzaz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */