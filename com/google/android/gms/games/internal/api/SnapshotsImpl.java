package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl
  implements Snapshots
{
  public PendingResult commitAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange)
  {
    SnapshotsImpl.3 local3 = new com/google/android/gms/games/internal/api/SnapshotsImpl$3;
    local3.<init>(this, paramGoogleApiClient, paramSnapshot, paramSnapshotMetadataChange);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public PendingResult delete(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata)
  {
    SnapshotsImpl.4 local4 = new com/google/android/gms/games/internal/api/SnapshotsImpl$4;
    local4.<init>(this, paramGoogleApiClient, paramSnapshotMetadata);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public void discardAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot)
  {
    Games.zzh(paramGoogleApiClient).zza(paramSnapshot);
  }
  
  public int getMaxCoverImageSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwQ();
  }
  
  public int getMaxDataSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwP();
  }
  
  public Intent getSelectSnapshotIntent(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    return Games.zzh(paramGoogleApiClient).zza(paramString, paramBoolean1, paramBoolean2, paramInt);
  }
  
  public SnapshotMetadata getSnapshotFromBundle(Bundle paramBundle)
  {
    boolean bool;
    if (paramBundle != null)
    {
      localObject = "com.google.android.gms.games.SNAPSHOT_METADATA";
      bool = paramBundle.containsKey((String)localObject);
      if (bool) {}
    }
    else
    {
      bool = false;
    }
    for (Object localObject = null;; localObject = (SnapshotMetadata)paramBundle.getParcelable("com.google.android.gms.games.SNAPSHOT_METADATA")) {
      return (SnapshotMetadata)localObject;
    }
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    SnapshotsImpl.1 local1 = new com/google/android/gms/games/internal/api/SnapshotsImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramBoolean);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult open(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata)
  {
    String str = paramSnapshotMetadata.getUniqueName();
    return open(paramGoogleApiClient, str, false);
  }
  
  public PendingResult open(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata, int paramInt)
  {
    String str = paramSnapshotMetadata.getUniqueName();
    return open(paramGoogleApiClient, str, false, paramInt);
  }
  
  public PendingResult open(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return open(paramGoogleApiClient, paramString, paramBoolean, -1);
  }
  
  public PendingResult open(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean, int paramInt)
  {
    SnapshotsImpl.2 local2 = new com/google/android/gms/games/internal/api/SnapshotsImpl$2;
    local2.<init>(this, paramGoogleApiClient, paramString, paramBoolean, paramInt);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString, Snapshot paramSnapshot)
  {
    Object localObject1 = paramSnapshot.getMetadata();
    Object localObject2 = new com/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;
    ((SnapshotMetadataChange.Builder)localObject2).<init>();
    SnapshotMetadataChange localSnapshotMetadataChange = ((SnapshotMetadataChange.Builder)localObject2).fromMetadata((SnapshotMetadata)localObject1).build();
    String str = ((SnapshotMetadata)localObject1).getSnapshotId();
    SnapshotContents localSnapshotContents = paramSnapshot.getSnapshotContents();
    localObject1 = this;
    localObject2 = paramGoogleApiClient;
    return resolveConflict(paramGoogleApiClient, paramString, str, localSnapshotMetadataChange, localSnapshotContents);
  }
  
  public PendingResult resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
  {
    SnapshotsImpl.5 local5 = new com/google/android/gms/games/internal/api/SnapshotsImpl$5;
    local5.<init>(this, paramGoogleApiClient, paramString1, paramString2, paramSnapshotMetadataChange, paramSnapshotContents);
    return paramGoogleApiClient.zzb(local5);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\SnapshotsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */