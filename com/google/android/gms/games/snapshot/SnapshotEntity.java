package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class SnapshotEntity
  implements SafeParcelable, Snapshot
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final SnapshotMetadataEntity zzaKL;
  private final SnapshotContentsEntity zzaKM;
  
  static
  {
    SnapshotEntityCreator localSnapshotEntityCreator = new com/google/android/gms/games/snapshot/SnapshotEntityCreator;
    localSnapshotEntityCreator.<init>();
    CREATOR = localSnapshotEntityCreator;
  }
  
  SnapshotEntity(int paramInt, SnapshotMetadata paramSnapshotMetadata, SnapshotContentsEntity paramSnapshotContentsEntity)
  {
    this.mVersionCode = paramInt;
    SnapshotMetadataEntity localSnapshotMetadataEntity = new com/google/android/gms/games/snapshot/SnapshotMetadataEntity;
    localSnapshotMetadataEntity.<init>(paramSnapshotMetadata);
    this.zzaKL = localSnapshotMetadataEntity;
    this.zzaKM = paramSnapshotContentsEntity;
  }
  
  public SnapshotEntity(SnapshotMetadata paramSnapshotMetadata, SnapshotContentsEntity paramSnapshotContentsEntity)
  {
    this(2, paramSnapshotMetadata, paramSnapshotContentsEntity);
  }
  
  private boolean isClosed()
  {
    return this.zzaKM.isClosed();
  }
  
  static boolean zza(Snapshot paramSnapshot, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Snapshot;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramSnapshot != paramObject)
      {
        paramObject = (Snapshot)paramObject;
        Object localObject1 = ((Snapshot)paramObject).getMetadata();
        Object localObject2 = paramSnapshot.getMetadata();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Snapshot)paramObject).getSnapshotContents();
          localObject2 = paramSnapshot.getSnapshotContents();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  static int zzb(Snapshot paramSnapshot)
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = paramSnapshot.getMetadata();
    arrayOfObject[0] = localObject;
    localObject = paramSnapshot.getSnapshotContents();
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static String zzc(Snapshot paramSnapshot)
  {
    Object localObject1 = zzw.zzy(paramSnapshot);
    Object localObject2 = paramSnapshot.getMetadata();
    zzw.zza localzza = ((zzw.zza)localObject1).zzg("Metadata", localObject2);
    localObject2 = "HasContents";
    localObject1 = paramSnapshot.getSnapshotContents();
    boolean bool;
    if (localObject1 != null) {
      bool = true;
    }
    for (;;)
    {
      localObject1 = Boolean.valueOf(bool);
      return localzza.zzg((String)localObject2, localObject1).toString();
      bool = false;
      localObject1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public Snapshot freeze()
  {
    return this;
  }
  
  public SnapshotMetadata getMetadata()
  {
    return this.zzaKL;
  }
  
  public SnapshotContents getSnapshotContents()
  {
    boolean bool = isClosed();
    if (bool) {
      bool = false;
    }
    for (Object localObject = null;; localObject = this.zzaKM) {
      return (SnapshotContents)localObject;
    }
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zzb(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzc(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotEntityCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */