package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;

public class zzj
  implements CapabilityApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzb.zza localzza = zza(paramArrayOfIntentFilter);
    return zzb.zza(paramGoogleApiClient, localzza, paramCapabilityListener);
  }
  
  private static zzb.zza zza(IntentFilter[] paramArrayOfIntentFilter)
  {
    zzj.5 local5 = new com/google/android/gms/wearable/internal/zzj$5;
    local5.<init>(paramArrayOfIntentFilter);
    return local5;
  }
  
  public PendingResult addCapabilityListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramString != null) {
      bool2 = bool1;
    }
    for (;;)
    {
      zzx.zzb(bool2, "capability must not be null");
      zzj.zzb localzzb = new com/google/android/gms/wearable/internal/zzj$zzb;
      localzzb.<init>(paramCapabilityListener, paramString);
      IntentFilter localIntentFilter = zzbn.zzgM("com.google.android.gms.wearable.CAPABILITY_CHANGED");
      Object localObject = "/";
      boolean bool3 = paramString.startsWith((String)localObject);
      if (!bool3)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "/";
        localObject = ((StringBuilder)localObject).append(str).append(paramString);
        paramString = ((StringBuilder)localObject).toString();
      }
      localIntentFilter.addDataPath(paramString, 0);
      IntentFilter[] arrayOfIntentFilter = new IntentFilter[bool1];
      arrayOfIntentFilter[0] = localIntentFilter;
      return zza(paramGoogleApiClient, localzzb, arrayOfIntentFilter);
      bool2 = false;
      localzzb = null;
    }
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, Uri paramUri, int paramInt)
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
      IntentFilter localIntentFilter = zzbn.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", paramUri, paramInt);
      IntentFilter[] arrayOfIntentFilter = new IntentFilter[i];
      arrayOfIntentFilter[0] = localIntentFilter;
      return zza(paramGoogleApiClient, paramCapabilityListener, arrayOfIntentFilter);
      int m = 0;
      localIntentFilter = null;
      break;
      label86:
      m = 0;
      localIntentFilter = null;
    }
  }
  
  public PendingResult addLocalCapability(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzj.3 local3 = new com/google/android/gms/wearable/internal/zzj$3;
    local3.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(local3);
  }
  
  public PendingResult getAllCapabilities(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    int i = 1;
    if ((paramInt == 0) || (paramInt == i)) {}
    for (;;)
    {
      zzx.zzac(i);
      zzj.2 local2 = new com/google/android/gms/wearable/internal/zzj$2;
      local2.<init>(this, paramGoogleApiClient, paramInt);
      return paramGoogleApiClient.zza(local2);
      i = 0;
      local2 = null;
    }
  }
  
  public PendingResult getCapability(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    int i = 1;
    if ((paramInt == 0) || (paramInt == i)) {}
    for (;;)
    {
      zzx.zzac(i);
      zzj.1 local1 = new com/google/android/gms/wearable/internal/zzj$1;
      local1.<init>(this, paramGoogleApiClient, paramString, paramInt);
      return paramGoogleApiClient.zza(local1);
      i = 0;
      local1 = null;
    }
  }
  
  public PendingResult removeCapabilityListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    zzj.zzb localzzb = new com/google/android/gms/wearable/internal/zzj$zzb;
    localzzb.<init>(paramCapabilityListener, paramString);
    zzj.zzf localzzf = new com/google/android/gms/wearable/internal/zzj$zzf;
    localzzf.<init>(paramGoogleApiClient, localzzb, null);
    return paramGoogleApiClient.zza(localzzf);
  }
  
  public PendingResult removeListener(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    zzj.zzf localzzf = new com/google/android/gms/wearable/internal/zzj$zzf;
    localzzf.<init>(paramGoogleApiClient, paramCapabilityListener, null);
    return paramGoogleApiClient.zza(localzzf);
  }
  
  public PendingResult removeLocalCapability(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzj.4 local4 = new com/google/android/gms/wearable/internal/zzj$4;
    local4.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(local4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */