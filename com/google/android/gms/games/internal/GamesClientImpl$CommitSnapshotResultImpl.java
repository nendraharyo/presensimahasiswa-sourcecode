package com.google.android.gms.games.internal;

import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;

final class GamesClientImpl$CommitSnapshotResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Snapshots.CommitSnapshotResult
{
  private final SnapshotMetadata zzaEo;
  
  /* Error */
  GamesClientImpl$CommitSnapshotResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 12	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: new 14	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer
    //   8: astore_2
    //   9: aload_2
    //   10: aload_1
    //   11: invokespecial 15	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   14: aload_2
    //   15: invokevirtual 19	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:getCount	()I
    //   18: istore_3
    //   19: iload_3
    //   20: ifle +36 -> 56
    //   23: new 21	com/google/android/gms/games/snapshot/SnapshotMetadataEntity
    //   26: astore 4
    //   28: aconst_null
    //   29: astore 5
    //   31: aload_2
    //   32: iconst_0
    //   33: invokevirtual 25	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:get	(I)Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   36: astore 5
    //   38: aload 4
    //   40: aload 5
    //   42: invokespecial 28	com/google/android/gms/games/snapshot/SnapshotMetadataEntity:<init>	(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    //   45: aload_0
    //   46: aload 4
    //   48: putfield 30	com/google/android/gms/games/internal/GamesClientImpl$CommitSnapshotResultImpl:zzaEo	Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   51: aload_2
    //   52: invokevirtual 34	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:release	()V
    //   55: return
    //   56: iconst_0
    //   57: istore_3
    //   58: aconst_null
    //   59: astore 4
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 30	com/google/android/gms/games/internal/GamesClientImpl$CommitSnapshotResultImpl:zzaEo	Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //   66: goto -15 -> 51
    //   69: astore 4
    //   71: aload_2
    //   72: invokevirtual 34	com/google/android/gms/games/snapshot/SnapshotMetadataBuffer:release	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	CommitSnapshotResultImpl
    //   0	78	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   8	64	2	localSnapshotMetadataBuffer	com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
    //   18	40	3	i	int
    //   26	34	4	localSnapshotMetadataEntity	com.google.android.gms.games.snapshot.SnapshotMetadataEntity
    //   69	7	4	localObject	Object
    //   29	12	5	localSnapshotMetadata	SnapshotMetadata
    // Exception table:
    //   from	to	target	type
    //   14	18	69	finally
    //   23	26	69	finally
    //   32	36	69	finally
    //   40	45	69	finally
    //   46	51	69	finally
    //   62	66	69	finally
  }
  
  public SnapshotMetadata getSnapshotMetadata()
  {
    return this.zzaEo;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$CommitSnapshotResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */