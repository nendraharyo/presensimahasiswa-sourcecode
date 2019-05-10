package com.google.android.gms.drive.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.zzm;

public abstract interface zzan
  extends IInterface
{
  public abstract void onError(Status paramStatus);
  
  public abstract void onSuccess();
  
  public abstract void zza(ChangeSequenceNumber paramChangeSequenceNumber);
  
  public abstract void zza(GetPermissionsResponse paramGetPermissionsResponse);
  
  public abstract void zza(OnChangesResponse paramOnChangesResponse);
  
  public abstract void zza(OnContentsResponse paramOnContentsResponse);
  
  public abstract void zza(OnDeviceUsagePreferenceResponse paramOnDeviceUsagePreferenceResponse);
  
  public abstract void zza(OnDownloadProgressResponse paramOnDownloadProgressResponse);
  
  public abstract void zza(OnDriveIdResponse paramOnDriveIdResponse);
  
  public abstract void zza(OnFetchThumbnailResponse paramOnFetchThumbnailResponse);
  
  public abstract void zza(OnListEntriesResponse paramOnListEntriesResponse);
  
  public abstract void zza(OnListParentsResponse paramOnListParentsResponse);
  
  public abstract void zza(OnLoadRealtimeResponse paramOnLoadRealtimeResponse, zzm paramzzm);
  
  public abstract void zza(OnMetadataResponse paramOnMetadataResponse);
  
  public abstract void zza(OnPinnedDownloadPreferencesResponse paramOnPinnedDownloadPreferencesResponse);
  
  public abstract void zza(OnResourceIdSetResponse paramOnResourceIdSetResponse);
  
  public abstract void zza(OnStartStreamSession paramOnStartStreamSession);
  
  public abstract void zza(OnSyncMoreResponse paramOnSyncMoreResponse);
  
  public abstract void zza(StringListResponse paramStringListResponse);
  
  public abstract void zzaf(boolean paramBoolean);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzan.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */