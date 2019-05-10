package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.Set;

public abstract interface DriveResource
{
  public abstract PendingResult addChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener);
  
  public abstract PendingResult addChangeSubscription(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult delete(GoogleApiClient paramGoogleApiClient);
  
  public abstract DriveId getDriveId();
  
  public abstract PendingResult getMetadata(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult listParents(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult removeChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener);
  
  public abstract PendingResult removeChangeSubscription(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult setParents(GoogleApiClient paramGoogleApiClient, Set paramSet);
  
  public abstract PendingResult trash(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult untrash(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult updateMetadata(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\DriveResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */