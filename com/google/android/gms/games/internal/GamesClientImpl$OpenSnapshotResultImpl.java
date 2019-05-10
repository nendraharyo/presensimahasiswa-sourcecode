package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;

final class GamesClientImpl$OpenSnapshotResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Snapshots.OpenSnapshotResult
{
  private final Snapshot zzaEV;
  private final String zzaEW;
  private final Snapshot zzaEX;
  private final Contents zzaEY;
  private final SnapshotContents zzaEZ;
  
  GamesClientImpl$OpenSnapshotResultImpl(DataHolder paramDataHolder, Contents paramContents)
  {
    this(paramDataHolder, null, paramContents, null, null);
  }
  
  GamesClientImpl$OpenSnapshotResultImpl(DataHolder paramDataHolder, String paramString, Contents paramContents1, Contents paramContents2, Contents paramContents3)
  {
    super(paramDataHolder);
    SnapshotMetadataBuffer localSnapshotMetadataBuffer = new com/google/android/gms/games/snapshot/SnapshotMetadataBuffer;
    localSnapshotMetadataBuffer.<init>(paramDataHolder);
    for (;;)
    {
      try
      {
        int k = localSnapshotMetadataBuffer.getCount();
        Object localObject2;
        if (k == 0)
        {
          i = 0;
          localObject2 = null;
          this.zzaEV = null;
          i = 0;
          localObject2 = null;
          this.zzaEX = null;
          localSnapshotMetadataBuffer.release();
          this.zzaEW = paramString;
          this.zzaEY = paramContents3;
          localObject2 = new com/google/android/gms/games/snapshot/SnapshotContentsEntity;
          ((SnapshotContentsEntity)localObject2).<init>(paramContents3);
          this.zzaEZ = ((SnapshotContents)localObject2);
          return;
        }
        k = localSnapshotMetadataBuffer.getCount();
        if (k != i) {
          break label221;
        }
        int m = paramDataHolder.getStatusCode();
        int n = 4004;
        if (m != n)
        {
          zzb.zzab(i);
          localObject2 = new com/google/android/gms/games/snapshot/SnapshotMetadataEntity;
          j = 0;
          localObject1 = null;
          localObject1 = localSnapshotMetadataBuffer.get(0);
          ((SnapshotMetadataEntity)localObject2).<init>((SnapshotMetadata)localObject1);
          localObject1 = new com/google/android/gms/games/snapshot/SnapshotEntity;
          localSnapshotContentsEntity = new com/google/android/gms/games/snapshot/SnapshotContentsEntity;
          localSnapshotContentsEntity.<init>(paramContents1);
          ((SnapshotEntity)localObject1).<init>((SnapshotMetadata)localObject2, localSnapshotContentsEntity);
          this.zzaEV = ((Snapshot)localObject1);
          i = 0;
          localObject2 = null;
          this.zzaEX = null;
          continue;
        }
        i = 0;
      }
      finally
      {
        localSnapshotMetadataBuffer.release();
      }
      SnapshotMetadataEntity localSnapshotMetadataEntity = null;
      continue;
      label221:
      localSnapshotMetadataEntity = new com/google/android/gms/games/snapshot/SnapshotMetadataEntity;
      j = 0;
      localObject1 = null;
      localObject1 = localSnapshotMetadataBuffer.get(0);
      localSnapshotMetadataEntity.<init>((SnapshotMetadata)localObject1);
      localObject1 = new com/google/android/gms/games/snapshot/SnapshotEntity;
      SnapshotContentsEntity localSnapshotContentsEntity = new com/google/android/gms/games/snapshot/SnapshotContentsEntity;
      localSnapshotContentsEntity.<init>(paramContents1);
      ((SnapshotEntity)localObject1).<init>(localSnapshotMetadataEntity, localSnapshotContentsEntity);
      this.zzaEV = ((Snapshot)localObject1);
      localSnapshotMetadataEntity = new com/google/android/gms/games/snapshot/SnapshotMetadataEntity;
      j = 1;
      localObject1 = localSnapshotMetadataBuffer.get(j);
      localSnapshotMetadataEntity.<init>((SnapshotMetadata)localObject1);
      localObject1 = new com/google/android/gms/games/snapshot/SnapshotEntity;
      localSnapshotContentsEntity = new com/google/android/gms/games/snapshot/SnapshotContentsEntity;
      localSnapshotContentsEntity.<init>(paramContents2);
      ((SnapshotEntity)localObject1).<init>(localSnapshotMetadataEntity, localSnapshotContentsEntity);
      this.zzaEX = ((Snapshot)localObject1);
    }
  }
  
  public String getConflictId()
  {
    return this.zzaEW;
  }
  
  public Snapshot getConflictingSnapshot()
  {
    return this.zzaEX;
  }
  
  public SnapshotContents getResolutionSnapshotContents()
  {
    return this.zzaEZ;
  }
  
  public Snapshot getSnapshot()
  {
    return this.zzaEV;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$OpenSnapshotResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */