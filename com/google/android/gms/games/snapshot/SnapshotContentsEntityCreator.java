package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

public class SnapshotContentsEntityCreator
  implements Parcelable.Creator
{
  static void zza(SnapshotContentsEntity paramSnapshotContentsEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Contents localContents = paramSnapshotContentsEntity.zzsx();
    zzb.zza(paramParcel, 1, localContents, paramInt, false);
    int j = paramSnapshotContentsEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    zzb.zzI(paramParcel, i);
  }
  
  public SnapshotContentsEntity zzeA(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localObject2 = Contents.CREATOR;
        localObject2 = (Contents)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    SnapshotContentsEntity localSnapshotContentsEntity = new com/google/android/gms/games/snapshot/SnapshotContentsEntity;
    localSnapshotContentsEntity.<init>(j, (Contents)localObject2);
    return localSnapshotContentsEntity;
  }
  
  public SnapshotContentsEntity[] zzgR(int paramInt)
  {
    return new SnapshotContentsEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotContentsEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */