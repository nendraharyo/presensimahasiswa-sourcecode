package com.google.android.gms.games.snapshot;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Snapshots
{
  public static final int DISPLAY_LIMIT_NONE = 255;
  public static final String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";
  public static final String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";
  public static final int RESOLUTION_POLICY_HIGHEST_PROGRESS = 4;
  public static final int RESOLUTION_POLICY_LAST_KNOWN_GOOD = 2;
  public static final int RESOLUTION_POLICY_LONGEST_PLAYTIME = 1;
  public static final int RESOLUTION_POLICY_MANUAL = 255;
  public static final int RESOLUTION_POLICY_MOST_RECENTLY_MODIFIED = 3;
  
  public abstract PendingResult commitAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange);
  
  public abstract PendingResult delete(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata);
  
  public abstract void discardAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot);
  
  public abstract int getMaxCoverImageSize(GoogleApiClient paramGoogleApiClient);
  
  public abstract int getMaxDataSize(GoogleApiClient paramGoogleApiClient);
  
  public abstract Intent getSelectSnapshotIntent(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt);
  
  public abstract SnapshotMetadata getSnapshotFromBundle(Bundle paramBundle);
  
  public abstract PendingResult load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
  
  public abstract PendingResult open(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata);
  
  public abstract PendingResult open(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata, int paramInt);
  
  public abstract PendingResult open(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean);
  
  public abstract PendingResult open(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean, int paramInt);
  
  public abstract PendingResult resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString, Snapshot paramSnapshot);
  
  public abstract PendingResult resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\Snapshots.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */