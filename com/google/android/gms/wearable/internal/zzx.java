package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.PutDataRequest;

public final class zzx
  implements DataApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    zzb.zza localzza = zza(paramArrayOfIntentFilter);
    return zzb.zza(paramGoogleApiClient, localzza, paramDataListener);
  }
  
  private static zzb.zza zza(IntentFilter[] paramArrayOfIntentFilter)
  {
    zzx.8 local8 = new com/google/android/gms/wearable/internal/zzx$8;
    local8.<init>(paramArrayOfIntentFilter);
    return local8;
  }
  
  private void zza(Asset paramAsset)
  {
    if (paramAsset == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("asset is null");
      throw ((Throwable)localObject);
    }
    Object localObject = paramAsset.getDigest();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("invalid asset");
      throw ((Throwable)localObject);
    }
    localObject = paramAsset.getData();
    if (localObject != null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("invalid asset");
      throw ((Throwable)localObject);
    }
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener)
  {
    IntentFilter[] arrayOfIntentFilter = new IntentFilter[1];
    IntentFilter localIntentFilter = zzbn.zzgM("com.google.android.gms.wearable.DATA_CHANGED");
    arrayOfIntentFilter[0] = localIntentFilter;
    return zza(paramGoogleApiClient, paramDataListener, arrayOfIntentFilter);
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener, Uri paramUri, int paramInt)
  {
    int i = 1;
    int k;
    if (paramUri != null)
    {
      int j = i;
      String str = "uri must not be null";
      com.google.android.gms.common.internal.zzx.zzb(j, str);
      if ((paramInt != 0) && (paramInt != i)) {
        break label86;
      }
      k = i;
    }
    for (;;)
    {
      com.google.android.gms.common.internal.zzx.zzb(k, "invalid filter type");
      IntentFilter localIntentFilter = zzbn.zza("com.google.android.gms.wearable.DATA_CHANGED", paramUri, paramInt);
      IntentFilter[] arrayOfIntentFilter = new IntentFilter[i];
      arrayOfIntentFilter[0] = localIntentFilter;
      return zza(paramGoogleApiClient, paramDataListener, arrayOfIntentFilter);
      int m = 0;
      localIntentFilter = null;
      break;
      label86:
      m = 0;
      localIntentFilter = null;
    }
  }
  
  public PendingResult deleteDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return deleteDataItems(paramGoogleApiClient, paramUri, 0);
  }
  
  public PendingResult deleteDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri, int paramInt)
  {
    boolean bool = false;
    int i = 1;
    int j;
    if (paramUri != null) {
      j = i;
    }
    for (;;)
    {
      String str = "uri must not be null";
      com.google.android.gms.common.internal.zzx.zzb(j, str);
      if ((paramInt == 0) || (paramInt == i)) {
        bool = i;
      }
      com.google.android.gms.common.internal.zzx.zzb(bool, "invalid filter type");
      zzx.5 local5 = new com/google/android/gms/wearable/internal/zzx$5;
      local5.<init>(this, paramGoogleApiClient, paramUri, paramInt);
      return paramGoogleApiClient.zza(local5);
      int k = 0;
      local5 = null;
    }
  }
  
  public PendingResult getDataItem(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    zzx.2 local2 = new com/google/android/gms/wearable/internal/zzx$2;
    local2.<init>(this, paramGoogleApiClient, paramUri);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult getDataItems(GoogleApiClient paramGoogleApiClient)
  {
    zzx.3 local3 = new com/google/android/gms/wearable/internal/zzx$3;
    local3.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local3);
  }
  
  public PendingResult getDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return getDataItems(paramGoogleApiClient, paramUri, 0);
  }
  
  public PendingResult getDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri, int paramInt)
  {
    boolean bool = false;
    int i = 1;
    int j;
    if (paramUri != null) {
      j = i;
    }
    for (;;)
    {
      String str = "uri must not be null";
      com.google.android.gms.common.internal.zzx.zzb(j, str);
      if ((paramInt == 0) || (paramInt == i)) {
        bool = i;
      }
      com.google.android.gms.common.internal.zzx.zzb(bool, "invalid filter type");
      zzx.4 local4 = new com/google/android/gms/wearable/internal/zzx$4;
      local4.<init>(this, paramGoogleApiClient, paramUri, paramInt);
      return paramGoogleApiClient.zza(local4);
      int k = 0;
      local4 = null;
    }
  }
  
  public PendingResult getFdForAsset(GoogleApiClient paramGoogleApiClient, Asset paramAsset)
  {
    zza(paramAsset);
    zzx.6 local6 = new com/google/android/gms/wearable/internal/zzx$6;
    local6.<init>(this, paramGoogleApiClient, paramAsset);
    return paramGoogleApiClient.zza(local6);
  }
  
  public PendingResult getFdForAsset(GoogleApiClient paramGoogleApiClient, DataItemAsset paramDataItemAsset)
  {
    zzx.7 local7 = new com/google/android/gms/wearable/internal/zzx$7;
    local7.<init>(this, paramGoogleApiClient, paramDataItemAsset);
    return paramGoogleApiClient.zza(local7);
  }
  
  public PendingResult putDataItem(GoogleApiClient paramGoogleApiClient, PutDataRequest paramPutDataRequest)
  {
    zzx.1 local1 = new com/google/android/gms/wearable/internal/zzx$1;
    local1.<init>(this, paramGoogleApiClient, paramPutDataRequest);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult removeListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener)
  {
    zzx.9 local9 = new com/google/android/gms/wearable/internal/zzx$9;
    local9.<init>(this, paramGoogleApiClient, paramDataListener);
    return paramGoogleApiClient.zza(local9);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */