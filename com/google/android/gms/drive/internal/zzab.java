package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class zzab
  implements DriveResource
{
  protected final DriveId zzaoz;
  
  public zzab(DriveId paramDriveId)
  {
    this.zzaoz = paramDriveId;
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    zzab.1 local1 = new com/google/android/gms/drive/internal/zzab$1;
    local1.<init>(this, paramGoogleApiClient, paramBoolean);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult addChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener)
  {
    Object localObject = Drive.zzUI;
    localObject = (zzu)paramGoogleApiClient.zza((Api.zzc)localObject);
    DriveId localDriveId = this.zzaoz;
    return ((zzu)localObject).zza(paramGoogleApiClient, localDriveId, paramChangeListener);
  }
  
  public PendingResult addChangeSubscription(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = Drive.zzUI;
    localObject = (zzu)paramGoogleApiClient.zza((Api.zzc)localObject);
    DriveId localDriveId = this.zzaoz;
    return ((zzu)localObject).zza(paramGoogleApiClient, localDriveId);
  }
  
  public PendingResult delete(GoogleApiClient paramGoogleApiClient)
  {
    zzab.5 local5 = new com/google/android/gms/drive/internal/zzab$5;
    local5.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local5);
  }
  
  public DriveId getDriveId()
  {
    return this.zzaoz;
  }
  
  public PendingResult getMetadata(GoogleApiClient paramGoogleApiClient)
  {
    return zza(paramGoogleApiClient, false);
  }
  
  public PendingResult listParents(GoogleApiClient paramGoogleApiClient)
  {
    zzab.2 local2 = new com/google/android/gms/drive/internal/zzab$2;
    local2.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local2);
  }
  
  public PendingResult removeChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener)
  {
    Object localObject = Drive.zzUI;
    localObject = (zzu)paramGoogleApiClient.zza((Api.zzc)localObject);
    DriveId localDriveId = this.zzaoz;
    return ((zzu)localObject).zzb(paramGoogleApiClient, localDriveId, paramChangeListener);
  }
  
  public PendingResult removeChangeSubscription(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = Drive.zzUI;
    localObject = (zzu)paramGoogleApiClient.zza((Api.zzc)localObject);
    DriveId localDriveId = this.zzaoz;
    return ((zzu)localObject).zzb(paramGoogleApiClient, localDriveId);
  }
  
  public PendingResult setParents(GoogleApiClient paramGoogleApiClient, Set paramSet)
  {
    if (paramSet == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("ParentIds must be provided.");
      throw ((Throwable)localObject);
    }
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>(paramSet);
    zzab.3 local3 = new com/google/android/gms/drive/internal/zzab$3;
    local3.<init>(this, paramGoogleApiClient, (List)localObject);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public PendingResult trash(GoogleApiClient paramGoogleApiClient)
  {
    zzab.6 local6 = new com/google/android/gms/drive/internal/zzab$6;
    local6.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult untrash(GoogleApiClient paramGoogleApiClient)
  {
    zzab.7 local7 = new com/google/android/gms/drive/internal/zzab$7;
    local7.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local7);
  }
  
  public PendingResult updateMetadata(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("ChangeSet must be provided.");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/drive/internal/zzab$4;
    ((zzab.4)localObject).<init>(this, paramGoogleApiClient, paramMetadataChangeSet);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */