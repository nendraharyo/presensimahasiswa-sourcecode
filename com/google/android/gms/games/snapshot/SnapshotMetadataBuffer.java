package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class SnapshotMetadataBuffer
  extends AbstractDataBuffer
{
  public SnapshotMetadataBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public SnapshotMetadata get(int paramInt)
  {
    SnapshotMetadataRef localSnapshotMetadataRef = new com/google/android/gms/games/snapshot/SnapshotMetadataRef;
    DataHolder localDataHolder = this.zzahi;
    localSnapshotMetadataRef.<init>(localDataHolder, paramInt);
    return localSnapshotMetadataRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */